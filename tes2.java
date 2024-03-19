import java.util.Scanner;

public class tes2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userin1=input.nextLine();

        System.out.println("Enter second string: ");
        String userin2=input.nextLine();

        //equals
        System.out.println(userin1.equals(userin2));

        //equalsignorecase (tldr ignores capitals)
        System.out.println(userin1.equalsIgnoreCase(userin2));
        
        //compareto
        System.out.println(userin1.compareTo(userin2));
    }
}

/** join two string 
public class tes2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userin1=input.nextLine();

        System.out.println("Enter second string: ");
        String userin2=input.nextLine();

        System.out.println(userin1+userin2);
        //or
        System.out.println(userin1.concat(userin2));
    }
}*/

/** Length of string
public class tes2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userin=input.nextLine();

        System.out.println("The length of the string is: " + userin.length());


    }
}*/
