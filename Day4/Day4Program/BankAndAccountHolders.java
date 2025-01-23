import java.util.*;

// Customer Class
class Customer {
    String name;
    List<BankAccount> accounts; //Association: Customer has multiple accounts

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add Account for Customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // View All Balances
    public void viewBalances() {
        System.out.println("Account balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}

// BankAccount Class
class BankAccount {
    String accountNumber;
    double balance;
    Bank bank; // Association: BankAccount is linked to a Bank

    // Constructor
    public BankAccount(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    // toString Method for Display
    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Balance: " + balance + ", Bank: " + bank.getName();
    }
}

// Bank Class
class Bank {
     String name;
     List<Customer> customers; // Association: Bank has multiple Customers

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Get Name of the Bank
    public String getName() {
        return name;
    }

    // Open an Account for a Customer
    public BankAccount openAccount(Customer customer, double initialBalance) {
        String accountNumber = "ACC " + (int) (Math.random() * 100000); // Generate Random Account Number
        BankAccount newAccount = new BankAccount(accountNumber, initialBalance, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        return newAccount;
    }

    // Display All Customers
    public void displayCustomers() {
        System.out.println("Customers of " + name + " Bank:");
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer);
        }
    }
}

// Main Class to Test Association
class BankAssociationExample {
    public static void main(String[] args) {
        // Create Bank
        Bank bank1 = new Bank("HDFC Bank");
        Bank bank2 = new Bank("ICIC Bank");

        // Create Customers
        Customer customer1 = new Customer("omi");
        Customer customer2 = new Customer("oliviya");

        // Ozpen Accounts
        bank1.openAccount(customer1, 1023.0);
        bank1.openAccount(customer2, 2100.0);

        bank2.openAccount(customer1, 5090.0);

        // Display Customer Balances
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
