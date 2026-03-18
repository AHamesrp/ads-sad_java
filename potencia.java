import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        
        int a, n, res = 1; //a: base do expoente

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a base: ");
        a = input.nextInt();

        System.out.println("Informe o expoente: ");
        n = input.nextInt();

        for (int i = n; i >= 1; i++) {
            res = res * a;
        }
        System.out.println("Resultado: "+res);

        input.close();
    }
    
}
