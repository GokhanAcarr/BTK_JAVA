import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3, balance = 1500, select;


        while (right > 0) {
            System.out.print("Your Username: ");
            String userName = input.nextLine();
            System.out.print("Your Password: ");
            String userPass = input.nextLine();
            if (userName.equals("Java") && userPass.equals("dev123")) {
                System.out.println("Hello! Welcome to the AcarBank!");
                System.out.println("----------");
                System.out.println("1-Deposit");
                System.out.println("2-Withdraw");
                System.out.println("3-Balance inquiry");
                System.out.println("4-Exit");
                System.out.print("Your Choice: ");
                select = input.nextInt();
                switch (select)
                {
                    case 1:
                        System.out.print("Choose how much money to deposit: ");
                        int depositMoney = input.nextInt();
                        balance += depositMoney;
                        System.out.println("Your new balance is: "+balance);
                        right = 0;
                        break;
                    case 2:
                        System.out.println("Choose how much money to deposit: ");
                        int withdrawMoney= input.nextInt();
                        if (balance - withdrawMoney < 0)
                        {
                            System.out.println("You cant withdraw that much money!");
                        }
                        else
                        {
                            balance -= withdrawMoney;
                            System.out.println("Your new balance is: "+balance);
                        }
                        right = 0;
                        break;
                    case 3:
                        System.out.println("Your balance is: "+balance);
                        right = 0;
                        break;
                    case 4:
                        System.out.println("Thank you for choosing us :)");
                        right = 0;
                        break;
                    default:
                        System.out.println("Wrong Entry!!!");
                        break;
                }
            } else {
                right--;
                System.out.println("Wrong Entry. Please Try Again!");
                if (right == 0)
                {
                    System.out.print("The Account has been blocked. Get contact with your Bank!");
                }
                else
                {
                    System.out.println("You have " +right+ " more rights.");
                }
            }
        }
    }
}