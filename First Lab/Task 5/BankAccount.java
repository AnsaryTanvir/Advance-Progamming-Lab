package com.ansary;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }


    public void displayAccountInformation(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (balance-amount > 0){
            balance -= amount;
            return true;
        }
        return false;
    }
}
