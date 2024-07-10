package com.ansary;

import java.util.HashMap;

public class Customer {

    public String name;
    public String customerID;
    public HashMap<String, BankAccount> bankAccounts = new HashMap<>();

    public Customer(String name, String customerID){
        this.name = name;
        this.customerID = customerID;
    }

    public void addAccount(String accountNumber){
        bankAccounts.put(accountNumber, new BankAccount(accountNumber));
    }

    public BankAccount getBankAccount(String accountNumber){
        return bankAccounts.get(accountNumber);
    }

    public void displayCustomerInformation(){
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerID);
        for (String accountNumber : bankAccounts.keySet()) {
            System.out.println("---------------------------------------------------");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + bankAccounts.get(accountNumber).balance);
            System.out.println("---------------------------------------------------");
        }
    }

    public void deposit(String accountNumber, double amount){
        bankAccounts.get(accountNumber).deposit(amount);
    }

    public boolean withdraw(String accountNumber, double amount){
        return bankAccounts.get(accountNumber).withdraw(amount);
    }

}
