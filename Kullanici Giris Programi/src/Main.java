import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Username: ");
        String userName = input.nextLine();
        System.out.print("Enter the Password: ");
        String userPass = input.nextLine();

        if (userName.equals("patika") && userPass.equals("java123")) {
            System.out.print("Successful login !!");
        } else {
            System.out.println("Username or Password is wrong");
            System.out.println("If you want to change password press 'Y'. If you want to leave press 'N'");
            String selection = input.nextLine();

            if (selection.equalsIgnoreCase("Y")) {
                System.out.print("Enter a new password. Please make sure that you entered a new password:");
                userPass = input.nextLine();

                if (!userPass.equals("java123")) {
                    System.out.print("Your password was successfully changed!");
                } else {
                    System.out.print("Wrong Try! Your new password can't be the same as the old one!");
                }
            } else if (selection.equalsIgnoreCase("N")) {
                System.out.print("You are leaving the login page.");
            } else {
                System.out.print("Wrong Entry. Please make sure that you just entered 'Y' or 'N'");
            }
        }
    }
}
