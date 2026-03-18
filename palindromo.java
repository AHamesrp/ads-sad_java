public class palindromo {
    public static void main(String[] args) {
        
        String palavra = "aibofobia";

        System.out.println("É um palindromo? "+ verificarPalindromo(palavra));
    
    }

    private static boolean verificarPalindromo(String palavra){

        String palavraDeTrasParaFrente = "";

        for(int i= palavra.length()-1;i>=0;i--) {
          
            palavraDeTrasParaFrente += palavra.charAt(i);
        }
        
        return palavra.equals(palavraDeTrasParaFrente);
    }
    
}
