import javax.swing.*;
public class arraycrescente {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 51;
        nums[2] = 15;
        nums[3] = 35;
        nums[4] = 53;

        for (int i=0; i<nums.length-1; i++){
            for(int j = i + 1; 1< nums.length; i++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        String texto = "";
        for (int i = 0; i < nums.length; i++){
            texto += "Posição: " + i + " Valor: " + nums[i]+"\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }

}
