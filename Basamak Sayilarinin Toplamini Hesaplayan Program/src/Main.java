import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int remainder, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int nb1 = input.nextInt();

        while (nb1 != 0)
        {
            remainder = nb1 % 10;
            nb1 = nb1 / 10;
            total = total + remainder;
        }
        System.out.println("The sum of orders: "+total);
    }
}