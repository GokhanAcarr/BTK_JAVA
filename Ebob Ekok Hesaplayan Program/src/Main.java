import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        int lcm = (num1 * num2) / gcd;

        System.out.println("Greatest Common Divisor (Ebob): " + gcd);
        System.out.println("Least Common Multiple (Ekok): " + lcm);
    }
}
