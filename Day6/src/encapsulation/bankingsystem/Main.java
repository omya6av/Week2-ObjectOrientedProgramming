package encapsulation.bankingsystem;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA123", "omi", 1000.0));
        accounts.add(new CurrentAccount("CA456", "oli", 2000.0, 500.0));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Balance: $" + account.getBalance());
            System.out.println("Interest Earned: $" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000.0);
                System.out.println("Loan Eligibility: $" + loanable.calculateLoanEligibility());
            }

            System.out.println("-----------------------");
        }
    }
}
