package Controller;

import Model.AddDataTest;

public class Main {


    public static void main(String [] args){
        AddDataTest.addDataForTest();

        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.mainMenu();

    }
}
