import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args){
        double area, circumference, radius, pi = 3.14;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius=r.nextDouble();

        area = radius * radius * pi;
        circumference = 2 * pi * radius;

        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circumference);

    }
}
