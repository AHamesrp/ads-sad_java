public class RestoDaDivisao {
    
    public static void main(String[] args) {
        int i, resto;

        for(i=1; i<=10; i++) {
            resto = i%5;

            if (resto ==0)
              System.out.printf("{%d} ", i);
            else System.out.printf("%d ", i);
            
        }
        System.out.println();

        for(i=1; i<=10; i++) {
            resto = i%5;

            if (resto ==0)
              System.out.printf("----");
            else System.out.printf("--");
            
        }
        System.out.println();

        for(i=1; i<=10; i++) {
            resto = i%5;

            if (resto ==0)
              System.out.printf("{%d} ", resto);
            else System.out.printf("%d ", resto);
        }
        System.out.println();
    }


}
