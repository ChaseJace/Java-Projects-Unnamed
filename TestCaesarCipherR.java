import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;
import javax.swing.*;

public class TestCaesarCipherR {
    public static void main(String[] args) throws IOException, URISyntaxException {
        CaesarCipherR cipher1 = new CaesarCipherR();

        String menu[] = { "Encrypt", "Decrypt", "View", "End" };
        String hold = "", choice = "", plaintext = "";
        int key = 0, option = 0;
        JOptionPane j = new JOptionPane();
        
        String jarPath = TestCaesarCipherR.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        String url = new File("C:\\Users\\Jc Roy Lopez\\OneDrive\\Documents\\Java Projects\\HiddenMessages.txt").getParent();
        File jarDirectory = new File(url, "HiddenMessages.txt");
        FileWriter fWrite = null;
        FileReader fRead = null;
        Scanner read = null;

        do {
            choice = j.showInputDialog(null, new JTextArea("Choose"), "Menu", 1, null, menu, menu[0]).toString();

            switch (choice) {
                case "Encrypt":
                    JTextField txtPlaintext = new JTextField();
                    JTextField txtKey = new JTextField();
                    Object[] message = {
                        "Plaintext:", txtPlaintext,
                        "Key:", txtKey
                    };
                    option = j.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        plaintext = txtPlaintext.getText();
                        try {
                        key = Integer.parseInt(txtKey.getText());
                        if (key<=0){
                            j.showMessageDialog(null, "The key must be a positive integer.", "User Error", j.ERROR_MESSAGE);
                            continue;
                            }
                        } catch (NumberFormatException e) {
                            j.showMessageDialog(null, "Invalid key format. Please enter a positive INTEGER", "User Error", j.ERROR_MESSAGE);
                            continue;
                        }
                    cipher1.setPlaintext(plaintext);
                    cipher1.setKey(key);
                    hold = cipher1.encryptS(plaintext, key);

                    try (FileWriter fWritten = new FileWriter(jarDirectory, true);
                        BufferedWriter writer = new BufferedWriter(fWritten)){
                            
                            writer.write("Encyrpted Text: " + hold);
                            writer.write("\tKey: " + key +"\n");

                        } 
                    } else {
                        j.showMessageDialog(null, "Login canceled", "Error", j.ERROR_MESSAGE);
                    }
                    break;
                case "Decrypt":
                    hold = cipher1.decrypt(plaintext);
                    j.showMessageDialog(null, new JTextArea(hold));
                    break;
                case "View":
                    j.showMessageDialog(null, new JTextArea("\nEncrpyted Message: " +hold));
                    
                    break;
            } // end of switch
        } while (!choice.equals("End"));
        j.showMessageDialog(null, "Made By Jc Roy Lopez");
    } // end of main
} // end of class 
// made by: Jc Roy Lopez
































/**public class TestCaesarCipher {
    public static void main(String[] args){
        //cipher 1
        CaesarCipher cipher1 = new CaesarCipher();
        System.out.println("**Cipher 1**");
        System.out.println("Key\t\t: "+cipher1.getKey());
        System.out.println("Plaintext\t: "+cipher1.getPlaintext());

        cipher1.setCaesarCipher("caiden", 7);
        System.out.println("Key\t\t: "+cipher1.getKey());
        System.out.println("Plaintext\t: "+cipher1.getPlaintext());
        
        //cipher 2
        CaesarCipher cipher2 = new CaesarCipher("kelsey");
        System.out.println("\n**Cipher 2**");
        System.out.println("Key\t\t: "+cipher2.getKey());
        System.out.println("Plaintext\t: "+cipher2.getPlaintext());

        cipher2.setKey(7);
        System.out.println("Key\t\t: "+cipher2.getKey());
        System.out.println("Plaintext\t: "+cipher2.getPlaintext());

        //cipher 3
        CaesarCipher cipher3 = new CaesarCipher("parrot", 5);
        System.out.println("\n**Cipher 3**");
        System.out.println("Key\t\t: "+cipher3.getKey());
        System.out.println("Plaintext\t: "+cipher3.getPlaintext());

        cipher3.setPlaintext("applex");
        cipher2.setKey(8);
        System.out.println("Key\t\t: "+cipher3.getKey());
        System.out.println("Plaintext\t: "+cipher3.getPlaintext());

        //cipher 4 - Algo 1
        CaesarCipher cipher4 = new CaesarCipher("Algo",1);

        //cipher 5 - Algo 2
        CaesarCipher cipher5 = new CaesarCipher("Algo",2);

        //cipher 6 - Algo 3
        CaesarCipher cipher6 = new CaesarCipher();

        //cipher 7 - decrypt
        CaesarCipher cipher7 = new CaesarCipher();

        //encrypting
        cipher1.encrypt();
        cipher2.encrypt();
        cipher3.encrypt();
        cipher4.encrypt();
        cipher5.encrypt();
        cipher6.encryptS("Algo", 3);

        //output encyption
        System.out.println("\nCiphertext\t:"+cipher1.getCiphertext());
        System.out.println("Ciphertext\t:"+cipher2.getCiphertext());
        System.out.println("Ciphertext\t:"+cipher3.getCiphertext());
        System.out.println("\nCiphertext Algo 1\t:"+cipher4.getCiphertext());
        System.out.println("Ciphertext Algo 2\t:"+cipher5.getCiphertext());
        System.out.println("Ciphertext Algo 3\t:"+cipher6.getCiphertext());
    }
}*/
