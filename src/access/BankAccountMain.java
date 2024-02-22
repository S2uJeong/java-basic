package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.withdraw(10000);
        account.deposit(1000000);
        account.deposit(0);
        account.withdraw(0);

        account.getBalance();
    }
}
