import java.util.Scanner;

public class TestVigenereCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Encrypting...");
        VigenereCipher vigenere1=new VigenereCipher();
        vigenere1.setPlaintext("love	moves	in");
        vigenere1.setKeyword("java");
        vigenere1.encrypt();

        System.out.println("Plaintext\t:	"+vigenere1.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere1.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere1.getCiphertext());

        VigenereCipher vigenere2=new VigenereCipher("love	moves	in");
        vigenere2.setKeyword("java");
        vigenere2.encrypt();

        System.out.println("Plaintext\t:	"+vigenere2.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere2.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere2.getCiphertext());

        VigenereCipher vigenere3=new VigenereCipher("love	moves	in","java");
        vigenere3.encrypt();

        System.out.println("Plaintext\t:	"+vigenere3.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere3.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere3.getCiphertext());

        VigenereCipher vigenere4=new VigenereCipher();
        vigenere4.setPlaintextAndKeyword("love	moves	in","java");
        vigenere4.encrypt();

        System.out.println("Plaintext\t:	"+vigenere4.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere4.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere4.getCiphertext());

        VigenereCipher vigenere5=new VigenereCipher();
        vigenere5.encrypt("love	moves	in","java");

        System.out.println("Plaintext\t:	"+vigenere5.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere5.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere5.getCiphertext());

        String cipher=vigenere1.getCiphertext();
        String keyword=vigenere1.getKeyword();

        System.out.println("Decrypting...");
        vigenere1.decrypt();
        System.out.println("Ciphertext\t:	"+cipher);
        System.out.println("Decrypted\t:	"+vigenere1.getDecrypted());

        cipher=vigenere2.getCiphertext();
        //vigenere2.decrypt(cipher,	keyword);
        System.out.println("Ciphertext\t:	"+cipher);
        System.out.println("Decrypted\t:	"+vigenere2.decrypt(cipher, keyword));

        VigenereCipher vigenere6 = new VigenereCipher();
        System.out.println("Type plaintext: ");
        String textin = input.nextLine();
        System.out.println("Type the key: ");
        String key = input.nextLine();

        vigenere6.setPlaintextAndKeyword(textin, key);
        vigenere6.encrypt();
        
        System.out.println("Plaintext\t:	"+vigenere6.getPlaintext());
        System.out.println("Keyword\t\t:	"+vigenere6.getKeyword());
        System.out.println("Ciphertext\t:	"+vigenere6.getCiphertext());

        input.close();

        System.out.println("Made by: Jc Roy P. Lopez");
    } //end	of	main
} //end	of	
