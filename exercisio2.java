import java.util.Scanner;

public class exercisio2 {
    public static void main(String[] args) {
        int num, poi;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = leitor.nextInt();
        poi = (num%2);
        if (poi==0) {
            System.out.println("O numero "+num+" é par");
        }else{
            System.out.println("O numero "+num+" é impar");        
        }

        leitor.close();
    }

}