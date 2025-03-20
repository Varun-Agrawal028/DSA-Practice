package OOPS.Encapsulation;


class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (Encapsulated logic)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money (Encapsulated logic)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Varun", 5000);

        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Current Balance: " + myAccount.getBalance());

        myAccount.deposit(2000);
        System.out.println("Updated Balance: " + myAccount.getBalance());

        myAccount.withdraw(3000);
        System.out.println("Updated Balance: " + myAccount.getBalance());

        // Direct access to balance is not allowed
        // myAccount.balance = 10000; // ❌ This will cause an error because balance is private
    }
}
