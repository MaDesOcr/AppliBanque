package Controller;

import Dao.TransactionDao;
import Dao.UserDao;
import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;
import View.TransactionView;

public class TransactionController {
    TransactionView transactionView = new TransactionView();
    UserDao userDao = new UserDao();
    TransactionDao transactionDao = new TransactionDao();

    public void createAndSaveTransaction(Account afrom, Account ato, double howMuch){
        Transaction t = new Transaction("Tranfert", howMuch, afrom, ato);
        afrom.setBalance(afrom.getBalance()-howMuch);
        ato.setBalance(ato.getBalance()+howMuch);

        transactionDao.saveTransation(t);
    }

    public void createTransactionFromConnectedUser() {

        transactionView.chooseUser(userDao.getUsers());
        User chosenUser = userDao.getUserById(transactionView.userTO);

        transactionView.chooseAccountToUser(chosenUser);
        Account accountTo = chosenUser.getUserAccounts().get(Integer.parseInt(transactionView.accountFrom));

        transactionView.chooseAccountFromUser(Data.getConnectedUser());
        Account accountFrom = userDao.getConnectedUser().getUserAccounts().get(Integer.parseInt(transactionView.accountTO));

        transactionView.giveAmount();

        createAndSaveTransaction(accountFrom, accountTo,
                Double.parseDouble(transactionView.howmuch));

    }

    public void printTransactionFromConnectedUser(){
        for (Account a: userDao.getConnectedUser().getUserAccounts().values()) {
            for (Transaction t : a.getListTransactions()) {
                System.out.println(t.toString());
            }
        }
    }
}
