import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args){
        String str1 = "God is real";
        String str2 = "UNLESs";

        //determines 8th character of str1
        System.out.println(str1.charAt(8));

        //determines the index of 's' in str2
        System.out.println(str2.indexOf("s"));

        //convert str1 to uppercase
        System.out.println(str1.toUpperCase());

        //convert str2 to loewrcase
        System.out.println(str2.toLowerCase());

        //replace all vowels with 'x'
        System.out.println(str1.replaceAll("[aeiou]", "x"));

        //display length of both str1 and str 2
        System.out.println(str1.length()+str2.length());


        Scanner sc = new Scanner(System.in);

        System.out.println("Declare a String Statement: ");
        String statement = sc.nextLine();

        String sentence = "\"" + str1 + "\", \"" + str2 + "\", \"" + statement;
        System.out.println(sentence);
        
        System.out.println(sentence.length());

        int startIndex = sentence.indexOf("an Integer");
        String extractedWord = sentence.substring(startIndex, startIndex + 10);
        System.out.println(extractedWord);

        String wordFromSentence = sentence.substring(sentence.indexOf("as"), sentence.indexOf("as") + 2);
        boolean compareResult = wordFromSentence.equals("is");
        System.out.println(compareResult);

        StringBuilder reverse = new StringBuilder(str2);
        System.err.println(reverse.reverse());
    }
}
