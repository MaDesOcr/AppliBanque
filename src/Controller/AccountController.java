package Controller;

import Dao.AccountDao;
import Dao.UserDao;
import Model.Account;
import View.AccountView;

public class AccountController {

    AccountView accountView = new AccountView();
    AccountDao accountDao = new AccountDao();
    UserDao userDao = new UserDao();

    public void createAndAddAccountToConnectedUser() {
        accountView.createAndAddAccountToConnectedUser(userDao.getConnectedUser());

        String name = accountView.name;
        Double balance = 0.00;
        boolean actif = true;

        Account newacount = new Account(name, balance, actif);

        userDao.getConnectedUser().getUserAccounts();
        accountDao.saveAccount(newacount);
    }
}
