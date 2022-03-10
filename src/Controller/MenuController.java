package Controller;

import View.View;

public class MenuController {

   // View view = new View();


    public static void handleMainMenu(String i){
        switch (i){
            case "2" : View.createTransactionFromConnectedUser();
            case "3" : View.printTransactionFromConnectedUser();
            break;
        }
    }

}
