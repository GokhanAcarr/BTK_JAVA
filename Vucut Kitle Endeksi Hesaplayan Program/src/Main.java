import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height as meter: ");
        double height = input.nextDouble();
        System.out.println("Enter your weight as kilogram: ");
        double weight = input.nextDouble();

        double index = weight / (height * height);

        System.out.println("Index is: " +index);
    }
}