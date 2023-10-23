import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the heat: ");
        double heat = input.nextDouble();

        if (heat < 5)
        {
            System.out.println("You can make ski");
        }
        else if (heat >= 5 && heat < 15)
        {
            System.out.println("You can go to Cinema");
        }
        else if (heat >= 15 && heat < 25)
        {
            System.out.println("You can make a Picnic");
        }
        else
        {
            System.out.println("You can swim");
        }
    }
}