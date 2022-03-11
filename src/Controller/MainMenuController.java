package Controller;

import Dao.TransactionDao;
import Dao.UserDao;
import Model.Data;
import Model.User;
import View.MainMenuView;
import View.TransactionView;
import View.UserView;

public class MainMenuController {

    TransactionController transactionController = new TransactionController();


    public static void mainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.printLogin();

        LoginController.login(mainMenuView.userId, mainMenuView.password);

        if (Data.getConnectedUser()!= null){
            mainMenuView.printWelcome();
            while (true) {
                mainMenuView.printMainMenu();

                handleMainMenu(mainMenuView.choice);
            }
        }
    }
    public static void handleMainMenu(String i){
        UserView userView = new UserView();
        switch (i){
            case "2" : TransactionController.createTransactionFromConnectedUser();
                break;
            case "3" : TransactionController.printTransactionFromConnectedUser();
                break;
            case "4" : MainMenuView.printAccountFromConnectedUser();
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
