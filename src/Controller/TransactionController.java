package Controller;

import Model.Account;
import Model.Data;
import Model.Transaction;

public class TransactionController {

    public static void createAndSaveTransaction(Account afrom, Account ato, double howMuch){
        Transaction t = new Transaction("Tranfert", howMuch, afrom, ato);
        afrom.setBalance(afrom.getBalance()-howMuch);
        ato.setBalance(ato.getBalance()+howMuch);
        afrom.getListTransactions().add(t);
        ato.getListTransactions().add(t);
        Data.getTransactionsList().add(t);
    }
}
