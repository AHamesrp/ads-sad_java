import java.util.Scanner;

public class NprimoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior do intervalo: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos no intervalo de " + limiteInferior + " a " + limiteSuperior + ":");

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    private static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}