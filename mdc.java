public class mdc {
    int main(){
        int a, b, aux;
    
    System.out.printf("digite dois numeros: ");
    
    System.out.printf("%d %d","&a, &b");

    if(a>b){
        //swap
        aux = a;
        a = b;
        b = aux;
    }
    
    do{
        int c = a%b;
            a = b;
            b = c;
    }while(c!=0)
           
    System.out.printf("MDC %d\n",a);
   
    }    
}
