import java.util.Scanner;

public class menorNlista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor número da lista é: " + menorNumero);

        scanner.close();
    }
}