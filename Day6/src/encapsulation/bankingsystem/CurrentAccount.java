package encapsulation.bankingsystem;

// CurrentAccount.java (Subclass)
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application submitted for Current Account: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; // Eligibility includes overdraft limit
    }
}

