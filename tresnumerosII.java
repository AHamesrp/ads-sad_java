import java.util.Scanner;
public class tresnumerosII {
    
    public static void main(String[] args) {
        //Objeto para leitura de dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero:");
        
            int n1=leitor.nextInt();
            int n2=5;
            int maior;

            if(n1>n2){
                maior = n1;
            }else{
                maior = n2;
            }
            System.out.println("Maior:"+ maior);

            leitor.close();

    }

}
