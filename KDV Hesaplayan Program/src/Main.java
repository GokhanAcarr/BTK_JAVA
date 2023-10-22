import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kdv1 = 0.18, kdv2 = 0.08;

        System.out.print("Please enter the amount: ");
        double amount = input.nextDouble();

        if ((amount <= 1000) && (amount >= 0))
        {
            amount = amount + (amount * kdv1);
        }
        else if (amount > 1000)
        {
            amount = amount + (amount * kdv2);
        }
        System.out.println("Your Money With KDV:" +amount);
    }
}