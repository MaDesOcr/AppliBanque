package Controller;

import Dao.TransactionDao;
import Dao.UserDao;
import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;
import View.TransactionView;

public class TransactionController {

    public static void createAndSaveTransaction(Account afrom, Account ato, double howMuch){
        Transaction t = new Transaction("Tranfert", howMuch, afrom, ato);
        afrom.setBalance(afrom.getBalance()-howMuch);
        ato.setBalance(ato.getBalance()+howMuch);

        TransactionDao.saveTransation(t);
    }

    public static void createTransactionFromConnectedUser() {
        TransactionView transactionView = new TransactionView();

        transactionView.chooseUser(UserDao.getUsers());
       // User chosenUser = UserDao.getUserByLastName(transactionView.userTO);
        User chosenUser = UserDao.getUserById(transactionView.userTO);

        transactionView.chooseAccountToUser(chosenUser);
        Account accountTo = chosenUser.getUserAccounts().get(Integer.parseInt(transactionView.accountFrom));

        transactionView.chooseAccountFromUser(Data.getConnectedUser());
        Account accountFrom = Data.getConnectedUser().getUserAccounts().get(Integer.parseInt(transactionView.accountTO));

        transactionView.giveAmount();

        createAndSaveTransaction(accountFrom, accountTo,
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
