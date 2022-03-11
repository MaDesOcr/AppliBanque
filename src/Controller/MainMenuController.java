package Controller;

import Dao.TransactionDao;
import Dao.UserDao;
import Model.Data;
import Model.User;
import View.MainMenuView;
import View.TransactionView;
import View.UserView;

public class MainMenuController {

    LoginController loginController = new LoginController();
    TransactionController transactionController = new TransactionController();
    AccountController accountController = new AccountController();
    MainMenuView mainMenuView = new MainMenuView();
    UserView userView = new UserView();

    public void mainMenu() {
        mainMenuView.printLogin();

        loginController.login(mainMenuView.userId, mainMenuView.password);

        if (Data.getConnectedUser()!= null){
            mainMenuView.printWelcome(UserDao.getConnectedUser());
            while (true) {
                mainMenuView.printMainMenu();

                handleMainMenu(mainMenuView.choice);
            }
        }
    }
    public void handleMainMenu(String i){
        switch (i){
            case "1" : accountController.createAndAddAccountToConnectedUser();
                break;
            case "2" : transactionController.createTransactionFromConnectedUser();
                break;
            case "3" : transactionController.printTransactionFromConnectedUser();
                break;
            case "4" : mainMenuView.printAccountFromConnectedUser(UserDao.getConnectedUser());
                break;
            case "5" : userView.addUserToFriendList(UserDao.getUsers(), UserDao.getConnectedUser());
                        Integer id = Integer.parseInt(userView.idSelectedUser);
                        Dao.UserDao.getFriendMapFromUser().put(id, Dao.UserDao.getUserById(id));
                break;
            case "6" : userView.printConnectedUser(Dao.UserDao.getConnectedUser());
                break;

        }
    }
}
