import java.util.Scanner;

public class CtoF {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float c;

        System.out.println("Informe a temperatura em celcius: ");
        c = input.nextFloat();

        System.out.println("A temperatura em Fahrenheit: "+((9*c+160)/5));

        input.close();

    }
}
