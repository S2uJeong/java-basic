package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public Method
    public void deposit(int amount) {
        if (isAmounValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Can't pass Valid Amount");
        }
    }
    public void withdraw(int amount) {
        if (isAmounValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Can't pass Valid Amount or Not enough balance");
        }
    }

    public int getBalance() {
        return balance;
    }

    // private Method
    private boolean isAmounValid(int amount) {
        return amount > 0;
    }
}
