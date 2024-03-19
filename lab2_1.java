import javax.swing.JOptionPane;

public class lab2_1 {
    public static void main(String[] args){
        
    String num1=JOptionPane.showInputDialog(null, "Enter Number 1: ");
    String num2=JOptionPane.showInputDialog(null, "Enter Number 2: ");

    int parse_num1=(Integer.parseInt(num1));
    int parse_num2=(Integer.parseInt(num2));

    int sum = parse_num1 + parse_num2;
    int difference = parse_num1 + parse_num2;
    int product = parse_num1 * parse_num2;
    int quotient = parse_num1 / parse_num2;

    JOptionPane.showMessageDialog(null, "The sum is: " + sum + 
    "\nThe difference is: " + difference + 
    "\nThe product is: " + product + 
    "\nThe quotient is: " + quotient);



    }
}
