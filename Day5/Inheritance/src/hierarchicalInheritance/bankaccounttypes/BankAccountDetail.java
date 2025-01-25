package hierarchicalInheritance.bankaccounttypes;

<<<<<<< HEAD
// main class
=======
>>>>>>> aad29cf0fd1d3a033002a89e8cf3a2515c5374c4
public class BankAccountDetail {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 5000);
        bankAccount.displayAccountType();

        SavingsAccount savingsAccount = new SavingsAccount("54321", 10000, 4.5);
        savingsAccount.displayAccountType();

        CheckingAccount checkingAccount = new CheckingAccount("67890", 3000, 1000);
        checkingAccount.displayAccountType();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("11223", 20000, 5);
        fixedDepositAccount.displayAccountType();
    }
}
