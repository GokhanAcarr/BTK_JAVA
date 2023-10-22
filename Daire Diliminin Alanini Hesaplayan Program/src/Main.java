import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        System.out.println("Please enter the angle: ");
        double angle = input.nextDouble();

        double area = (Math.PI * radius * radius * angle) / 360;
        System.out.printf("Area is: " +area);
    }
}