import java.util.Scanner;

public class Bissexto {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um ano: ");
        int ano = input.nextInt();

        if((ano%4==0 && ano%100!=0)||(ano%400==0)){

        }
        input.close();
    }
}
