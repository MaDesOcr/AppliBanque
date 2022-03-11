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
    UserContoller userContoller = new UserContoller();
    MainMenuView mainMenuView = new MainMenuView();
    UserView userView = new UserView();
    UserDao userDao = new UserDao();
    boolean appliOn = true;

    public void mainMenu() {
        while (appliOn) {
            mainMenuView.printLogin();

            try {
                loginController.login(mainMenuView.userId, mainMenuView.password);
            } catch (NumberFormatException n) {
                System.out.println("Attention erreur : " + n);
            }


            if (userDao.getConnectedUser() != null) {
                mainMenuView.printWelcome(userDao.getConnectedUser());
                while (userDao.getConnectedUser() != null) {
                    mainMenuView.printMainMenu(userDao.getConnectedUser());

                    handleMainMenu(mainMenuView.choice);
                }
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
            case "4" : mainMenuView.printAccountFromConnectedUser(userDao.getConnectedUser());
                break;
            case "5" : userContoller.handleAddUserToFriendList();
                break;
            case "6" : userView.printConnectedUser(userDao.getConnectedUser());
                break;
            case"7": userDao.disconnectUser();
                break;
            case"8" :
                appliOn = false;
                mainMenuView.goodbye();
                userDao.disconnectUser();
                break;
            case "9" :
                if (userDao.getConnectedUser().getRole().equals("admin")){
                    transactionController.makeDeposit();
                }
                break;
            default :
                mainMenuView.inputError();
        }
    }
}
