// Define the BankAccount class
class BankAccount {
    public String accountNumber;       // Public member
    protected String accountHolder;    // Protected member
    private double balance;            // Private member

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Methods to access and modify balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize the SavingsAccount details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main method
public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("46400021", "YADADV", 100000.00, 4.5);
        account.displayDetails();

        // Modify and access balance
        account.setBalance(12000.00);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
