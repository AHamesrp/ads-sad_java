import java.util.Scanner;

public class MediaAteNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int count = 0;

        System.out.println("Digite números para calcular a média. Insira um número negativo para encerrar.");

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
                count++;
            }

        } while (numero >= 0);

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

        scanner.close();
    }
}