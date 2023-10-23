import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int n = input.nextInt();

        for (double i = 1; i <= n; i++)
        {
            total += (1/i);
        }
        System.out.println("Your sum is: "+total);
    }
}