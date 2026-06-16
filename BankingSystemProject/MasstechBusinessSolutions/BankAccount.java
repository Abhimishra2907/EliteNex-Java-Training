package MasstechBusinessSolutions;


import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private long phoneNumber;
    private double accountBalance;
    private AccountType accountType;

    public enum AccountType {
        SAVINGACCOUNT,
        CURRENTACCOUNT
    }

    // Constructor
    public BankAccount(int accountNumber,
                       String accountHolderName,
                       long phoneNumber,
                       AccountType accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
        this.accountBalance = 0.0;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    // Setter (Balance update ke liye)
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Account Details
public void accountDetails(){
    System.out.println(" ============ Account Details ============ ");
    System.out.println("   Account Holder Name : " + accountHolderName);
    System.out.println("   Account Number : " + accountNumber);
    System.out.println("   Phone Number :" + phoneNumber);
    System.out.println("   Account Type :" + accountType);

};
    private List<String> customBanktransaction = new ArrayList<>();
    public List<String> getTransactions() {
        return customBanktransaction;
    }
}