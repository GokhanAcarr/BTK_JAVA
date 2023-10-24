import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                total += i;
            }
        }
        if (total == number)
        {
            System.out.println("This is a PERFECT NUMBER");
        }
        else
        {
            System.out.println("This is not a PERFECT NUMBER");
        }
    }
}