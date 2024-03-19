import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args){
        int grossTotal, netTotal, change;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Phone Brand: ");
        String brand=input.nextLine();
        
        System.out.println("Phone Color: ");
        String color=input.nextLine();

        System.out.println("Phone Price: ");
        int price=input.nextInt();

        System.out.println("Number of Phones: ");
        int num=input.nextInt();

        grossTotal = price * num;
        netTotal = grossTotal + 38;


        System.out.println("\nPhone Brand: " +brand + 
        "\nPhone Color: " + color + 
        "\nPhone Price: " + price + 
        "\nPhone Quantity: " + num +
        "\n\nGross Total: " +grossTotal+
        "\nVat(3.8%): 38" +
        "\nNet Total: " +netTotal);


        System.out.println("Payment: ");
        int pay = input.nextInt();

        change = netTotal - pay;
        System.out.println("Change: " + change);

    }
}
