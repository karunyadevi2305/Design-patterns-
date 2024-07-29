/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class WithdrawalTransaction implements PaymentTransaction {
    @Override
    public void executeTransaction(String accountNumber, double amount) {
        System.out.println("Withdrawing Rs." + amount + " from account " + accountNumber);
    }
}