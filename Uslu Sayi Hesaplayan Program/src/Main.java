import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int nb1 = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        for (int i = 1; i <= power; i++)
        {
            total = total * nb1;
        }
        System.out.print("The number is: "+total);
    }
}