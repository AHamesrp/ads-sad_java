import java.util.Scanner;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números. Insira 0 para encerrar.");

        int numero;
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero < maior) {
                segundoMaior = numero;
            }

        } while (numero != 0);

        if (segundoMaior != Integer.MIN_VALUE) {
            System.out.println("O segundo maior número inserido foi: " + segundoMaior);
        } else {
            System.out.println("Não foi fornecido um segundo número válido.");
        }

        scanner.close();
    }
}