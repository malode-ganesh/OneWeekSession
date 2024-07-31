package com.bank;

public class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
