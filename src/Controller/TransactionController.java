package Controller;

import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;
import View.MainMenuView;
import View.TransactionView;

import java.util.Scanner;

public class TransactionController {

    public static void createAndSaveTransaction(Account afrom, Account ato, double howMuch){
        Transaction t = new Transaction("Tranfert", howMuch, afrom, ato);
        afrom.setBalance(afrom.getBalance()-howMuch);
        ato.setBalance(ato.getBalance()+howMuch);
        afrom.getListTransactions().add(t);
        ato.getListTransactions().add(t);
    }

    public static void createTransactionFromConnectedUser() {
        TransactionView transactionView = new TransactionView();

        transactionView.chooseUser();
        User chosenUser = Data.getUsersList().get(transactionView.userTO);

        transactionView.chooseAccountToUser(chosenUser);
        Account accountTo = chosenUser.getUserAccounts().get(Integer.parseInt(transactionView.accountFrom));

        transactionView.chooseAccountFromUser(Data.getConnectedUser());
        Account accountFrom = Data.getConnectedUser().getUserAccounts().get(Integer.parseInt(transactionView.accountTO));

        transactionView.giveAmount();

        TransactionController.createAndSaveTransaction(accountFrom, accountTo,
                Double.parseDouble(transactionView.howmuch));

    }

    public static void printTransactionFromConnectedUser(){
        for (Account a: Data.getConnectedUser().getUserAccounts().values()) {
            for (Transaction t : a.getListTransactions()) {
                System.out.println(t.toString());
            }
        }
    }
}
