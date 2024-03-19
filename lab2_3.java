import javax.swing.JOptionPane;

public class lab2_3 {
    public static void main(String[] args){
        
        String N = JOptionPane.showInputDialog(null, "Enter amount of hair strands: ");
        String L = JOptionPane.showInputDialog(null, "Enter hair strand length in cm: ");

        double hair = Double.parseDouble(N);
        double length = Double.parseDouble(L);

        double km = hair * (length * 100000);
        double miles = hair * (length * 160900);
        
        JOptionPane.showMessageDialog(null, "Cory Khong's hair in kilometers: " + km + "\nCory Khong's hair in miles: " + miles);
    }
}
