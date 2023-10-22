import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        System.out.println("Armut Kac Kilo ?:");
        double armutKG = input.nextDouble();
        System.out.println("Elma Kac Kilo ?:");
        double elmaKG = input.nextDouble();
        System.out.println("Domates Kac Kilo ?:");
        double domatesKG = input.nextDouble();
        System.out.println("Muz Kac Kilo ?:");
        double muzKG = input.nextDouble();
        System.out.println("Patlican Kac Kilo ?:");
        double patlicanKG = input.nextDouble();

        double total = (armutKG * armut) + (elmaKG * elma) + (domatesKG * domates) + (muzKG * muz) + (patlicanKG * patlican);

        System.out.println("Total is: " +total);
    }
}