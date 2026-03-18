import java.util.Scanner;

public class somadigitos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        int digito = num % 10;

        System.out.println("Digito: " + digito);
        
        teclado.close();
    
    }
    
}
