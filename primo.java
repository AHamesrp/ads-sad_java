import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
   int cont=0;
   System.out.println("Insira um numero: ");
       int numero = in.nextInt();
       for (int i = 1; i < numero; i++) {
           if (numero%i==0) {
              cont++;
           }
       }
        if (cont==2) {
          System.out.println("O "+numero+" é primo");
        }else{
          System.out.println("O "+numero+" nao é primo");
        }
    
  in.close();

  }

}
