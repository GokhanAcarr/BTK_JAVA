import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmprice = 0.10, total = 0;
        System.out.print("Enter the length of way as KM: ");
        double km = input.nextDouble();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("1 <== One Way, 2 <== Round Trip: ");
        int way = input.nextInt();
        if (!(way == 1 || way == 2))
        {
            System.out.println("You entered Wrong entry !!");
            System.exit(0);
        }
        if (age < 12)
        {
            total = (km * kmprice) / 2;
        }
        else if (age >=12 && age <=24)
        {
            total = (km * kmprice) * 0.9;
        }
        else if (age >= 65)
        {
            total = (km * kmprice) * 0.7;
        }
        else
        {
            total = km * kmprice;
        }

        if (way == 2)
        {
            total = total * 0.8;
        }
        System.out.println("Your total cost is: "+total);
    }
}