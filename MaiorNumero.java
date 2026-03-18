import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Digite números (insira um número negativo para parar):");

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

        } while (numero >= 0);

        System.out.println("O maior número fornecido é: " + maiorNumero);

        scanner.close();
    }
}