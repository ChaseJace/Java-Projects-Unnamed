public class CaesarCipher {
	private String plaintext, ciphertext;
	private int key;
	public CaesarCipher() { plaintext=ciphertext="";		}
	public String encrypt(String plaintext, int key){
		ciphertext="";
		char ch='\0'; int sobra=0;
		plaintext=plaintext.toLowerCase(); //converts	all	characters	into	lowercases
		for (int i = 0; i < plaintext.length(); i++) {
            ch=(char)(plaintext.charAt(i));
			if(Character.isAlphabetic(ch)){
				sobra=ch+(key%26);		
				if(sobra>'z'){ 
                    sobra=sobra-26; 
				}
				ciphertext+=(char)(sobra); //converts	ASCII to	a	character,	then	it	is	concatenated	to	ciphertext
            }else if(Character.isDigit(ch)){ //if	character	is	a	digit
				ciphertext+=(char)ch; //concatenated	to	ciphertext
            }else if(Character.isWhitespace(ch)){ //if	a	character	is	whitespace	such	as	a	tab,	space,	etc
				ciphertext+=(char)ch; //concatenated	to	ciphertext
            }else if(ch=='.'){ //optional.	if	a	character	is	a	period,	use	it	for	sentences	if	in	case.	This	can	be	considered	a
			    ciphertext+=(char)ch+"\n"; //concatenated	to	ciphertext
            }else{ //any	other	characters	not	in	if-else-if	block.
                ciphertext+=(char)ch; //concatenated	to	ciphertext
			}
        }//end	of	loop
	return ciphertext; //return	the	concatenated	encrypted	text
}//end	of	method

public String decrypt(String ciphertext, int key){
	String hold="";
	char ch='\0'; int sobra=0;
	ciphertext=ciphertext.toLowerCase();
	for (int i = 0; i < ciphertext.length(); i++) {
		ch=(char)(ciphertext.charAt(i));
            if(Character.isAlphabetic(ch)){
			sobra=ch-(key%26);
			if(sobra<'a'){ sobra=sobra+26; }
			hold+=(char)(sobra);
        }else if(Character.isDigit(ch)){
            hold+=(char)ch;
        }else if(Character.isWhitespace(ch)){
			hold+=(char)ch;
        }else if(ch=='.'){
			hold+=(char)ch+"\n";
        }else{ hold+=(char)ch; }
	}//end	of	loop
	return hold;
}
	
    public String getPlaintext() { return plaintext; }
	public String getCipherText() { return ciphertext; }
}