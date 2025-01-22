class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "HDFC";
    static int totalAccounts = 0; // Tracks total number of accounts

    // Instance variables
    String accountHolderName;
    final String accountNumber; // Final to ensure it cannot be changed once assigned

    // Constructor
    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to display total accounts
    static void getTotalAccounts() {
        System.out.println("The total number of accounts: " + totalAccounts);
    }

    // Method to display account details if it's an instance of BankAccount
    void displayAccountDetails() {
        if (this instanceof BankAccount) { // Check if the object is an instance of BankAccount
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount account1 = new BankAccount("Om yadav", "4640001");
        BankAccount account2 = new BankAccount("omya6av", "110987");

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Display total number of accounts
        BankAccount.getTotalAccounts();
    }
}
