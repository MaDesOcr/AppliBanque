package Controller;

import Dao.TransactionDao;
import Model.Data;
import Model.User;
import View.MainMenuView;
import View.TransactionView;

public class MainMenuController {

    TransactionController transactionController = new TransactionController();


    public static void mainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.printLogin();

        LoginController.login(mainMenuView.userName, mainMenuView.password);

        if (Data.getConnectedUser()!= null){
            mainMenuView.printWelcome();
            while (true) {
                mainMenuView.printMainMenu();

                handleMainMenu(mainMenuView.choice);
            }
        }
    }
    public static void handleMainMenu(String i){
        switch (i){
            case "2" : TransactionController.createTransactionFromConnectedUser();
                break;
            case "3" : TransactionController.printTransactionFromConnectedUser();
                break;
            case "4" : MainMenuView.printAccountFromConnectedUser();
                break;
        }
    }
}
