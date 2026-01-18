package staticfinal;

class BankAccount {

    static String bankName = "Nova Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;

    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;        
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Display Account Info
    public void displayDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}

// Main class
public class Account {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Navam", 101, 5000);
        BankAccount acc2 = new BankAccount("Aman", 102, 10000);

        // Static variable shared across all accounts
        System.out.println("Bank Name (Static): " + BankAccount.bankName);

        // Deposit and Withdraw
        acc1.deposit(2000);
        acc1.withdraw(1500);

        // Instanceof check before displaying details
        Object obj = acc1;

        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            account.displayDetails();
        } else {
            System.out.println("Object is not a BankAccount!");
        }

        BankAccount.getTotalAccounts();

    
    }
}

