import java.io.IOException;
import javax.swing.JOptionPane;

public class TestCaesarCipher {
    public static void main(String[] args) throws IOException {
        AccountManagement acc = new AccountManagement();
        String menu[] = {"Create Account", "Login", "End"};
        String choice = "";

        do {
            choice = JOptionPane.showInputDialog(null, "Choose", "Menu", 1, null, menu, menu[0]).toString();

            switch (choice) {
                case "Create Account":
                    String name = JOptionPane.showInputDialog("Name: ");
                    String gender = JOptionPane.showInputDialog("Gender: ");
                    String age = JOptionPane.showInputDialog("Age: ");
                    String username = JOptionPane.showInputDialog("Username: ");
                    String password = JOptionPane.showInputDialog("Password: ");
                    if (password.length()<8){
                        JOptionPane.showMessageDialog(null, "Must be 8 characters");
                    }
                    acc.setInfo(name, gender, age);
                    acc.setAccount(username, password);
                    break;
                case "Login":
                    username = JOptionPane.showInputDialog(null, "Enter Username: ");
                    password = JOptionPane.showInputDialog(null, "Enter Password");

                    String loginResult = acc.login(username, password);

                    if (loginResult.equals("Login successful.")) {
                        JOptionPane.showMessageDialog(null, "Login Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        } while (!choice.equals("End"));

        JOptionPane.showMessageDialog(null, "Jc Roy P. Lopez");
    }
}
