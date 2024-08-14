/*5) The parent class contains the general information about an account and an abstract
method to calculate the yearly interest. For savings account, the interest rate is
10% and for current account the interest rate is 6%. All the data members of the
Account class are initialized through a parameterized constructor. Your program
should be able to deposit and withdraw money from a saving account. Perform the
same operation on a current account.*/

// Abstract Account class
abstract class Account {
    protected String accountHolder;
    protected double balance;
    protected String accountNumber;

    // Parameterized constructor to initialize the data members
    public Account(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Abstract method to calculate the yearly interest
    public abstract double calculateYearlyInterest();

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount!");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// SavingsAccount class extending Account
class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 0.10;

    public SavingsAccount(String accountHolder, double balance, String accountNumber) {
        super(accountHolder, balance, accountNumber);
    }

    @Override
    public double calculateYearlyInterest() {
        return balance * INTEREST_RATE;
    }
}

// CurrentAccount class extending Account
class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 0.06;

    public CurrentAccount(String accountHolder, double balance, String accountNumber) {
        super(accountHolder, balance, accountNumber);
    }

    @Override
    public double calculateYearlyInterest() {
        return balance * INTEREST_RATE;
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 5000.0, "SA123456");

        System.out.println("Savings Account:");
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);
        System.out.println("Yearly Interest: " + savingsAccount.calculateYearlyInterest());

        CurrentAccount currentAccount = new CurrentAccount("Jane Doe", 8000.0, "CA654321");

         System.out.println("\nCurrent Account:");
        currentAccount.displayAccountInfo();
        currentAccount.deposit(1500);
        currentAccount.withdraw(1000);
        System.out.println("Yearly Interest: " + currentAccount.calculateYearlyInterest());
    }
}

