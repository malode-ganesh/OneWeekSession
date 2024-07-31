package com.bank;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sam", 12345);
        Account account1 = new Account(12345, customer1);

        account1.deposit(1000);
        account1.withdraw(500);

        System.out.println("Account Balance: " + account1.getBalance());
        System.out.println("Customer Name: " + account1.getCustomer().getName());
        System.out.println("Customer Account Number: " + account1.getCustomer().getAccountNumber());
    }
}
