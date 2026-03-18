import java.util.Scanner;

public class CrivoEratostenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior do intervalo: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos no intervalo [" + limiteInferior + ", " + limiteSuperior + "]:");
        imprimirPrimos(limiteInferior, limiteSuperior);

        scanner.close();
    }

    static void imprimirPrimos(int inicio, int fim) {
        boolean[] ehPrimo = new boolean[fim + 1];
        for (int i = 2; i <= fim; i++) {
            ehPrimo[i] = true;
        }

        for (int p = 2; p * p <= fim; p++) {
            if (ehPrimo[p]) {
                for (int i = p * p; i <= fim; i += p) {
                    ehPrimo[i] = false;
                }
            }
        }

        for (int i = Math.max(2, inicio); i <= fim; i++) {
            if (ehPrimo[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}