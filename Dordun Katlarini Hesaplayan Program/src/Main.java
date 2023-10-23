import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp = 0, total = 0;
        Scanner input = new Scanner(System.in);
        while (temp % 4 == 0)
        {
            System.out.print("Enter the number:");
            temp = input.nextInt();
            total += temp;
        }
        total -= temp;
        System.out.println(total);
    }
}