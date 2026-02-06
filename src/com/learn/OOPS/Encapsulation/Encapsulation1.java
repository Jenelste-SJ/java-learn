package com.learn.OOPS.Encapsulation;
class Bank {
    private int accountNumber;
    private double balance;
    private int pin =1234;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount) {
        if (amount >= 0) {
            this.balance -= amount;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber(int accountNumber) {
        return accountNumber;
    }
    public double getBalance() {
        return balance;

    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(1234567);
        bank.setBalance(50000);
        bank.withdraw(5000);
        System.out.println("After withdrawal: "+bank.getBalance());
        bank.deposit(5000);
        System.out.println("After deposit: "+bank.getBalance());


    }
}
