import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int nb1 = input.nextInt();

        for (int i = 1; i <= nb1; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                total += i;
                count++;
            }
        }
        if (count == 0)
        {
            count = 1;
        }
        total /= count;
        System.out.println("Your numbers average is: "+total);
    }
}