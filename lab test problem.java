/*Write a Java program to create a class known as "BankAccount" with methods 
 called deposit() and withdraw(). Create a subclass called SavingsAccount that
 overrides the withdraw() method to prevent withdrawals if the account balance
  falls below one hundred.
 */

package labtest;

class BankAccount {
    int accountnumber;
    double accountbalance;

    BankAccount(int accountnumber, double accountbalance) {
        this.accountbalance = accountbalance;
        this.accountnumber = accountnumber;
    }

    void deposit(double amount) {
        accountbalance += amount;
    }

    void withdraw(double amount) {
        if (accountbalance > amount)
            accountbalance -= amount;
        else
            System.out.println("Insufficient balance");
    }
}

//savingAccount class
package labtest;

class savingAccount extends BankAccount {
    savingAccount(int a, int b) {
        super(a, b);
    }

    void withdraw(double amount) {
        if (accountbalance - amount < 100)
            System.out.println("Error: Insufficient balance");
        else
            super.withdraw(amount); // Call the withdraw method from the superclass to update the balance
    }
}

//Main class 

package labtest;

public class classmain {
    public static void main(String[] args) {
        savingAccount ac = new savingAccount(1222, 1000);
        ac.deposit(500);
        System.out.println("Balance after deposit: $" + ac.accountbalance);

        //ac.deposit(600);
        //System.out.println("Balance after deposit: $" + ac.accountbalance);

        ac.withdraw(900);
        System.out.println("Balance after withdrawal: $" + ac.accountbalance);
        
        ac.withdraw(200);
        System.out.println("Balance after withdrawal: $" + ac.accountbalance);
    }
}

