import java.util.Scanner;

public class somaDigiUsuario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int soma = calcularSomaDosDigitos(numero);
        System.out.println("A soma dos dígitos é: " + soma);

        scanner.close();
    }

    private static int calcularSomaDosDigitos(int num) {
        int soma = 0;
        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }
        return soma;
    }
}