import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pricer = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the KM: ");
        double KM = input.nextDouble();

        double lastPrice = 10 + (KM * pricer);

        if (lastPrice <= 20)
        {
            System.out.println("You need to pay: 20");
        }
        else
        {
            System.out.println(lastPrice);
        }
    }
}