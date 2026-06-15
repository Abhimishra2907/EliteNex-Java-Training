package MasstechBusinessSolutions;

import java.util.Scanner;

public class BankingSystem {

    public void displayDetails() {

        System.out.println("\n========== STATE BANK OF INDIA ==========");
        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter Your Choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankingSystem bank = new BankingSystem();
        BankingServices bankingServices = new BankingServices();

        BankAccount account = null;

        while (true) {

            bank.displayDetails();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    bankingServices.createNewAccount();
                    break;

                case 2:

                    account = bankingServices.savingAccount();

                    if (account != null) {

                        while (true) {

                            System.out.println("\n========== BANK MENU ==========");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Transfer");
                            System.out.println("5. Mini Statement");
                            System.out.println("6. Logout");
                            System.out.print("Enter Choice: ");

                            int option = sc.nextInt();

                            switch (option) {

                                case 1:
                                    bankingServices.deposit(account);
                                    break;

                                case 2:
                                    bankingServices.withdraw(account);
                                    break;

                                case 3:
                                    bankingServices.checkAccountBalance(account);
                                    break;

                                case 4:
                                    bankingServices.amountTransfer(account);
                                    break;

                                case 5 :
                                    bankingServices.miniStateMent(account);
                                case 6:
                                    System.out.println("Logout Successful...");
                                    break;

                                default:
                                    System.out.println("Invalid Choice!");
                            }

                            if (option == 5) {
                                break;
                            }
                        }
                    }

                    break;

                case 3:

                    System.out.println("Thank You For Visiting SBI.");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}