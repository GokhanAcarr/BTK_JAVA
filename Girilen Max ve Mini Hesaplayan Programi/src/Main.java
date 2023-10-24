import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;
        int max=0;
        int min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Whats the amount of numbers: ");
        total = input.nextInt();

        for (int i = 1; i <=total; i++) {
            System.out.print(i+".Number: ");
            int number = input.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }
        } System.out.println("The Greatest Number: " + max);
        System.out.println("The Smallest Number: " + min);

    }
}