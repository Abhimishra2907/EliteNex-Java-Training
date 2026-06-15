package MasstechBusinessSolutions;

import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankingServices {


    List<BankAccount> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    public void displayDetails() {
        System.out.println("Hello! Welcome to Banking Services.");
    }

    public void createNewAccount() {
        System.out.println("You have selected 'Create New Account'.");
        System.out.println("Please fill in all the required details to create a new account. \n");
        System.out.println(" Please Enter the name : ");
        String accountHolderName = sc.nextLine();

        System.out.println(" please Enter The Phone Number ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
        BankAccount.AccountType accountType = null;

        while (true) {

            System.out.println("Select Account Type:");
            System.out.println("1. SAVINGACCOUNT  (Minimum Balance: ₹6000)");
            System.out.println("2. CURRENTACCOUNT (Minimum Balance: ₹0)");
            System.out.print("Enter Account Type: ");


            String input = sc.nextLine();

            try {
                accountType = BankAccount.AccountType.valueOf(input.trim().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Account Type! Please enter again.");
            }
        }

        Random random = new Random();
        int accountNumber = 10000 + random.nextInt(90000);

        System.out.print("Enter Opening Balance: ₹");
        double openingBalance = sc.nextDouble();

        if (accountType == BankAccount.AccountType.SAVINGACCOUNT
                && openingBalance < 6000) {

            System.out.println("Saving Account requires a minimum opening balance of ₹6000.");
            return;
        }

        BankAccount account = new BankAccount(
                accountNumber,
                accountHolderName,
                phoneNumber,
                accountType
        );

        account.setAccountBalance(openingBalance);

        list.add(account);
        if (accountType == BankAccount.AccountType.SAVINGACCOUNT){
            account.setAccountBalance(6000);
        } else {
            account.setAccountBalance(0);
        }

        list.add(account);


        System.out.println("Congratulations, " + accountHolderName
                + "! Your " + accountType + " account has been created successfully." );
        account.accountDetails();

    }
    public  BankAccount savingAccount() {
        System.out.println(" Please enter your Account number : ");
        int checkAccountNumber = sc.nextInt();
        for (BankAccount account : list) {
            if (account.getAccountNumber() == checkAccountNumber) {
                System.out.println("Congratulations, " + account.getAccountHolderName() + " you are a AccountHolder");
                System.out.println("Please choose one of the options below:");

                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. MiniStateMent");

                return account;
            }
        }
        System.out.println("Account Not Found!");
        return null;

    }
        public void deposit (BankAccount account){

            System.out.print("Enter Initial Deposit: ₹");
            double depositAmount = sc.nextLong();

            account.setAccountBalance(
                    account.getAccountBalance() + depositAmount
            );
            System.out.println("₹" + depositAmount
                    + " has been successfully credited to your account XXXXX"
                    + account.getAccountNumber() + ".");
            System.out.println("Your Account Balance: ₹" + account.getAccountBalance());

            account.getTransactions().add(
                    "Deposit : +₹" + depositAmount +
                            " | Balance : ₹" + account.getAccountBalance()
            );
        }


    public void checkAccountBalance(BankAccount account) {

        System.out.println("Your Account Balance: ₹"
                + account.getAccountBalance());
    }


        public void withdraw (BankAccount account){
            System.out.println("Your Account Balance: ₹" + account.getAccountBalance());
            double withdrawAmount = sc.nextDouble();
            if (withdrawAmount > account.getAccountBalance()) {
                System.out.println("Insufficient Balance!");
                return;
            }
            account.setAccountBalance(
                    account.getAccountBalance() - withdrawAmount);

            System.out.println("₹" + withdrawAmount + " has been successfully withdrawn.\n"
                    + "Your remaining balance is: ₹" + account.getAccountBalance());
            account.getTransactions().add(
                    "Deposit : +₹" + withdrawAmount +
                            " | Balance : ₹" + account.getAccountBalance()
            );
        }


    public void amountTransfer(BankAccount account) {

        System.out.print("Enter Transfer Amount: ");
        double transferAmount = sc.nextDouble();

        if (transferAmount > account.getAccountBalance()) {

            System.out.println("Insufficient Balance!");
            return;
        }

        account.setAccountBalance(
                account.getAccountBalance() - transferAmount
        );

        System.out.println("₹" + transferAmount
                + " transferred successfully.");

        System.out.println("Remaining Balance : ₹"
                + account.getAccountBalance());
        account.getTransactions().add(
                "Deposit : +₹" + transferAmount +
                        " | Balance : ₹" + account.getAccountBalance()
        );
    }

    public void miniStateMent( BankAccount account){


        System.out.println("\n========== MINI STATEMENT ==========");
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Account Number : " + account.getAccountNumber());

        if(account.getTransactions().isEmpty()){
            System.out.println(" No Transactions Available. ");
        }else{
            for(String transacation : account.getTransactions() ){
                System.out.println(transacation);

            }
        }

        System.out.println("-------------------------------");
        System.out.println(" Current Balance " + account.getAccountBalance());
    }

    }

