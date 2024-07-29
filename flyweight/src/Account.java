/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void executeTransaction(String transactionType, double amount) {
        PaymentTransaction transaction = PaymentTransactionFactory.getTransaction(transactionType);
        transaction.executeTransaction(accountNumber, amount);
        updateBalance(amount, transactionType);
    }

    private void updateBalance(double amount, String transactionType) {
        if (transactionType.equals("deposit")) {
            balance += amount;
        } else if (transactionType.equals("withdrawal")) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

