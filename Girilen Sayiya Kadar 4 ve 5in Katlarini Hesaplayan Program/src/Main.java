import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nb1;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the number: ");
        nb1 =input.nextInt();

        for (int i = 1; i <= nb1; i*=4) {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------");
        for (int i = 1; i <= nb1; i*=5) {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
    }
}