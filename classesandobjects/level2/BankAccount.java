package classesandobjects.level2;

public class BankAccount {
    final Integer accountNumber;
    String accountHolder;
    private Integer balance = 0;

    BankAccount(Integer accountNumber, String name, Integer balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = name;
    }

    private void setBalance(Integer balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    private void depositMoney(Integer amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid depost amount");
        }
        int newBalance = getBalance() + amount;
        setBalance(newBalance);
    }

    public static void main(String[] args) {
        BankAccount _navam = new BankAccount(1000, "Navam", 1000);
        _navam.depositMoney(1000);
        System.out.println("balance: " + _navam.getBalance());
    }
}
