package oop1.ex;

public class Account {

    int balance; // 잔액

    void deposit(int amount){
        balance += amount;
        System.out.println("입금 성공. 잔액은 " + balance + "원 입니다.");
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다. 잔액이 " + balance + "원 입니다.");
        } else {
            balance -= amount;
            System.out.println("출금 성공." + " 잔액은 " + balance + "원 입니다.");
        }

    }

    void showStatus() {
        System.out.println("잔액이 " + balance + "원 입니다.");
    }


}
