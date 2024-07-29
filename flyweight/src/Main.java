/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("7648757554", 5000.0);

        account.executeTransaction("deposit", 500.0);
        System.out.println("Balance: Rs." + account.getBalance());

        account.executeTransaction("withdrawal", 100.0);
        System.out.println("Balance: Rs" + account.getBalance());

        account.executeTransaction("deposit", 500.0);
        System.out.println("Balance: Rs" + account.getBalance());
    }
}
