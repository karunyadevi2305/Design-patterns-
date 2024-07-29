
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class PaymentTransactionFactory {
    private static Map<String, PaymentTransaction> transactionMap = new HashMap<>();

    public static PaymentTransaction getTransaction(String transactionType) {
        if (transactionType == null) {
            return null;
        }
        if (transactionMap.containsKey(transactionType)) {
            return transactionMap.get(transactionType);
        } else {
            PaymentTransaction transaction;
            if (transactionType.equals("deposit")) {
                transaction = new DepositTransaction();
            } else if (transactionType.equals("withdrawal")) {
                transaction = new WithdrawalTransaction();
            } else {
                throw new RuntimeException("Invalid transaction type");
            }
            transactionMap.put(transactionType, transaction);
            return transaction;
        }
    }
}
