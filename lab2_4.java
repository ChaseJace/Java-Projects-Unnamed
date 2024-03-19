import javax.swing.JOptionPane;

public class lab2_4 {
    public static void main(String[] args) {
        String f = JOptionPane.showInputDialog(null, "Enter amount of flash drives: ");
        int flash = Integer.parseInt(f);

        int gross = flash/144;
        int dozen = (flash - (gross*144))/12;
        int rem = (flash - (gross*144))%12;

        JOptionPane.showMessageDialog(null, "Hi Mr. Lee, you have " +gross+ " gross, " +dozen+ " dozen, and " +rem+ " extra flash drives.");


    }
}
