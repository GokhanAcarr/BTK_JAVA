import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] grade = new int[5];
        int countLesson = 0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Your Mathematics Grade: ");
        grade[0] = input.nextInt();
        System.out.print("Your Turkish Grade: ");
        grade[1] = input.nextInt();
        System.out.print("Your Physics Grade: ");
        grade[2] = input.nextInt();
        System.out.print("Your Chem Grade: ");
        grade[3] = input.nextInt();
        System.out.print("Your Biology Grade: ");
        grade[4] = input.nextInt();

        for (int i = 0; i < 5; i++)
        {
            if (grade[i] >= 0 && grade[i] <= 100)
            {
                total += grade[i];
                countLesson++;
            }
        }
        total /= countLesson;
        if (total >= 55)
        {
            System.out.println("Congrats! You passed!");
        }
        else
        {
            System.out.println("You failed!");
        }
    }
}