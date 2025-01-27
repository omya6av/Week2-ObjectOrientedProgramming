package encapsulation.bankingsystem;

// SavingsAccount.java (Subclass)
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.03; // 3% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application submitted for Savings Account: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Eligibility is twice the balance
    }
}



