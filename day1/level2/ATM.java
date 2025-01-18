import java.util.*;
// Class to represent a BankAccount
class BankAccount{

    // Instance variables to store BankAccount's details
    String accountHolder;
    int bankAccount;
    double balance;

    // Constructor to initialize the BankAccount object
    BankAccount(String accountHolder, int BankAccount,double balance) {
        this.accountHolder = accountHolder;
        this.bankAccount = BankAccount;
        this.balance = balance;
    }
    // Method to display BankAccount details and accountHolder
    public void display() {
        System.out.println("Name of accountHolder is: " + accountHolder +
                ", \nBankAccount Number of accountHolder : " + bankAccount +
                ", \nbalance : " + balance );
    }

    // Method to Withdrawing the money
    public double withDrawingMoney(double withDrawMoney){
        if(balance-withDrawMoney < 0 ){
            System.out.print("Unsufficient balance : ");
            return balance;
        }
        System.out.print("New balance is : ");
        return balance-withDrawMoney;
    }

    // Method to deposit the money
    public double depositingMoney(double depositMoney){
        System.out.print("New balance is : ");
        return balance+depositMoney;
    }


}

// Main class to run the program
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Creating an object of BankAccount and initializing it with details
        BankAccount customer1 = new BankAccount("OM Yadav", 11198, 10500);

        System.out.println(" 1 : Depositing money.");
        System.out.println(" 2 : Withdrawing money.") ;
        System.out.println(" 3 : Displaying the current balance.");

        int option = input.nextInt();

        if(option == 1){
            System.out.println("Enter the deposit amount : " );
            double depositMoney = input.nextDouble();
            customer1.display();
            System.out.println(customer1.depositingMoney(depositMoney));
        }else if(option == 2 ){
            System.out.println("Enter the withdraw amount : ");
            double withDrawMoney = input.nextDouble();
            customer1.display();

            System.out.println(customer1.withDrawingMoney(withDrawMoney));
        }else if(option == 3){
            customer1.display();
        }
    }
}
