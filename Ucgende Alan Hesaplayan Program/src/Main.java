import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of first edge: ");
        double a = input.nextDouble();
        System.out.println("Enter the length of second edge: ");
        double b = input.nextDouble();
        System.out.println("Enter the length of third edge: ");
        double c = input.nextDouble();

        double cf = (a + b + c) / 2;
        double area = Math.sqrt(cf * (cf - a) * (cf - b) * (cf - c));
        System.out.println("Area of triangle: " +area);
    }
}