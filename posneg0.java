import java.util.Scanner;

public class posneg0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double numero = 0.00;
        
        System.out.print("Informe um numero: ");
        numero = Double.parseDouble(input.nextLine());

        if (numero<0){
            System.out.println("Valor negativo! ");
        
        }else if(numero==0){
                System.out.println("Valor neutro! ");

        }else if(numero>0){
                System.out.println("Valor positivo! ");
        }
        
       input.close();
    }
}            
