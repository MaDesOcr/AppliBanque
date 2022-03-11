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

    public void createAndSaveTransaction(Account afrom, Account ato, double howMuch){
        Transaction t = new Transaction("Tranfert", howMuch, afrom, ato);
        afrom.setBalance(afrom.getBalance()-howMuch);
        ato.setBalance(ato.getBalance()+howMuch);

        TransactionDao.saveTransation(t);
    }

    public void createTransactionFromConnectedUser() {

        transactionView.chooseUser(UserDao.getUsers());
       // User chosenUser = UserDao.getUserByLastName(transactionView.userTO);
        User chosenUser = UserDao.getUserById(transactionView.userTO);

        transactionView.chooseAccountToUser(chosenUser);
        Account accountTo = chosenUser.getUserAccounts().get(Integer.parseInt(transactionView.accountFrom));

        transactionView.chooseAccountFromUser(Data.getConnectedUser());
        Account accountFrom = UserDao.getConnectedUser().getUserAccounts().get(Integer.parseInt(transactionView.accountTO));

        transactionView.giveAmount();

        createAndSaveTransaction(accountFrom, accountTo,
                Double.parseDouble(transactionView.howmuch));

    }

    public static void printTransactionFromConnectedUser(){
        for (Account a: UserDao.getConnectedUser().getUserAccounts().values()) {
            for (Transaction t : a.getListTransactions()) {
                System.out.println(t.toString());
            }
        }
    }
}
