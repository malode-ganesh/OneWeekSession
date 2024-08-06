package com.bank;

public class BankingApplication {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("12345", 1000.0);

            account.deposit(500.0);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(200.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            try {
                account.deposit(-50.0);
            } catch (NegativeDepositException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                account.withdraw(2000.0);
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                BankAccount.validateAccount(null);
            } catch (InvalidAccountException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}