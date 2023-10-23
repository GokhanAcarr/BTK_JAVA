import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare","Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        System.out.println("Enter your birth year: ");
        int year = input.nextInt();
        int sign = year % 12;
        System.out.println("Your Chinese Zodiac is: "+stringArray[sign]);
    }
}