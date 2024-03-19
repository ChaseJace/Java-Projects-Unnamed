import javax.swing.JOptionPane;

public class lab2_2 {
    public static void main(String[] args){
        int sum = 0, average;
        
        for(int nums=0;nums<=10;nums++) {
            String n = JOptionPane.showInputDialog(null,"Please enter number: ");
            int num = Integer.parseInt(n);
            sum+=num;

            if(nums==9){
                break;
            }
        }

        average = sum/10;

        JOptionPane.showMessageDialog(null, "the sum of your numbers are " + sum);
        JOptionPane.showMessageDialog(null, "Their average is: " + average);


    }
}

/*public class lab2_2 {
    public static void main(String[] args){
        int sum, average;
        
        String num1 = JOptionPane.showInputDialog(null, "Please enter your first number: ");
        String num2 = JOptionPane.showInputDialog(null, "Please enter your second number: ");
        String num3 = JOptionPane.showInputDialog(null, "Please enter your third number: ");
        String num4 = JOptionPane.showInputDialog(null, "Please enter your fourth number: ");
        String num5 = JOptionPane.showInputDialog(null, "Please enter your fifth number: ");
        String num6 = JOptionPane.showInputDialog(null, "Please enter your sixth number: ");
        String num7 = JOptionPane.showInputDialog(null, "Please enter your seventh number: ");
        String num8 = JOptionPane.showInputDialog(null, "Please enter your eigth number: ");
        String num9 = JOptionPane.showInputDialog(null, "Please enter your ninth number: ");
        String num10 = JOptionPane.showInputDialog(null, "Please enter your tenth number: ");

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int number3 = Integer.parseInt(num3);
        int number4 = Integer.parseInt(num4);
        int number5 = Integer.parseInt(num5);
        int number6 = Integer.parseInt(num6);
        int number7 = Integer.parseInt(num7);
        int number8 = Integer.parseInt(num8);
        int number9 = Integer.parseInt(num9);
        int number10 = Integer.parseInt(num10);

        sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        average = sum/10;

        JOptionPane.showMessageDialog(null, "the average of your 10 numbers is: " + average);
    }
}*/

