public class CaesarCipherR {
    private String plaintext="", ciphertext="";
    private int key, letter;

    public CaesarCipherR() {
        key=letter=0;
        plaintext=ciphertext="";
    }

    public CaesarCipherR(String plaintext){
        setPlaintext(plaintext);
    }

    public CaesarCipherR(int key){
        setKey(key);
    }

    public CaesarCipherR(String plaintext, int key){
        setPlaintext(plaintext);
        setKey(key);
    }

    public void setPlaintext(String plaintext){
        this.plaintext=plaintext.toLowerCase();
    }

    public void setKey(int key){
        this.key=key;
    }

    public void setCaesarCipher(String plaintext, int key){
        setPlaintext(plaintext);
        setKey(key);
    }

    public String getCiphertext() { return ciphertext; }
    public int getKey() { return key; }
    public String getPlaintext() { return plaintext; }

    public void encrypt(){
        for(int i=0;i<plaintext.length();i++){
            letter=plaintext.charAt(i)+(key%26);
            if(letter>'z')
                letter-=26;
            ciphertext+=(char)(letter);
        }
    }

    //Algo 1: Overloaded method
    public void encrypt(String plaintext){
        ciphertext="";
        setPlaintext(plaintext);
        encrypt();
    }

    //Algo 2: Overloaded method
    public void encrypt(String plaintext, int key){
        ciphertext="";
        setPlaintext(plaintext);
        encrypt();
    }

    //Algo 3 Value returning
    public String encryptS(String plaintext, int key){
        ciphertext="";
        setPlaintext(plaintext);
        encrypt();
        return ciphertext;
    }

    // decryption
    public String decrypt(String ciphertext){
        return plaintext;
    }
}
