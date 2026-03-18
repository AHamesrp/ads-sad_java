public class primoUmEcem {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            if (verificarPrimo(i)) {
                count++;
            }
        }

        System.out.println("Existem " + count + " números primos entre 1 e 100.");
    }

    static boolean verificarPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}