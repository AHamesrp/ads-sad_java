public class anagrama {
    public static void main(String[] args) {
        String s1="roma";
        String s2="amor";

        if(isAnagrama(s1, s2))
           System.out.println("E anagrama!");
        else
           System.out.println("Nao e anagrama!");
    }

    private static boolean isAnagrama(String s1, String s2) {
        int r=0;

        for(int i=0; i<s1.length(); i++)
            r=r ^ s1.charAt(i);

        for(int i=0; i<s1.length(); i++)
            r=r ^ s2.charAt(i);
            
        return (r==0);
    }

}