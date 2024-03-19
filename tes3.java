// FILEWRITER WITH INPUT
import java.io.FileWriter;
import java.util. Scanner;

public class tes3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;

        try {
            FileWriter fWrite = new FileWriter("Sample1.txt", true); //add ',true' so it wont replace your input in fiile

            System.out.println("Write to the file: ");
            System.out.println("type 'STOP!' to end");
            
            while(true){
                input=sc.nextLine();
                if (input.equals("STOP!")){
                    break;
                }

                fWrite.write(input);
                fWrite.write("\n");
            }          

            fWrite.close();
            System.out.println("The following data has been stored to the file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}









/** READ USING ARRAY 
import java.io.FileReader;

public class tes3 {
    public static void main(String[] args){
        char[] data = new char[100];
        try {
            FileReader input = new FileReader("Sample1.txt"); //create reader with input object

            input.read(data); //reads char (duh)

            System.out.println("Data in the file: ");
            System.out.println(data);

            input.close();

        } catch (Exception e){
            System.out.println("Error\t: " + e.getMessage());
        }
    }
}*/








/** CREATE AND DELETE FILE 
import java.io.File;
import java.util.Scanner;

public class tes3 {
    public static void main(String[] args){
        File file = new File("Sample1.txt"); //instantiate file
        Scanner sc = new Scanner(System.in);

        try {
            if (file.createNewFile()==true){
                System.out.println("New file is created.");
            } else {
                System.err.println("The file already exists in \n" + file.getAbsolutePath()); //.getabosolute path will tell where file is
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println("\nWould you like to delete the file? y or n");
        String input = sc.nextLine();

        if (input.equals("y")) {
            file.delete();
            System.out.println("File has been deleted");
        }

        if (input.equals("n")){
            System.out.println("We're done");
        }
    }
}*/





/** CREATE FILE 
import java.io.File;

public class tes3 {
    public static void main(String[] args){
        File file = new File("Sample1.txt"); //instantiate file

        try {
            if (file.createNewFile()==true){
                System.out.println("New file is created.");
            } else {
                System.err.println("The file already exists in " + file.getAbsolutePath()); //.getabosolute path will tell where file is
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}*/
