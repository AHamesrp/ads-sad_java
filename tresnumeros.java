import java.util.Scanner;

public class tresnumeros {
    public static void main(String[] args) {
        //Objeto para leitura de dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite n1: ");
        int n1=leitor.nextInt();
        
        System.out.println("Digite n2: ");
        int n2=leitor.nextInt();

        System.out.println("Digite n3: ");
        int n3=leitor.nextInt();
        
        int maior;
        
        if(n3>n2 && n3>n1){
            maior = n3;
            System.out.println("Maior: "+ maior);
        
        }else if(n2>n1 && n2>n3){
            maior = n2;
            System.out.println("Maior: "+ maior);

        }else{
            System.out.println("São iguais !");
        }

        leitor.close();
    }
}
