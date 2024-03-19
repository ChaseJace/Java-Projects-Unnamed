// USING STRING BUILDER TO REVERSE A STRING
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class tes1 {
    public static void main(String[] args){
        String input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input=sc.nextLine();

        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1.reverse();

        System.out.println("The reverse of the string is: " + input1);
    }
}
