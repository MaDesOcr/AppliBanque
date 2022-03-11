package Controller;

import Model.User;
import View.UserView;

public class UserContoller {

    public static void displayUser(){
        UserView.displayUsers();
    }

    public static void displayAccountFromUser(User u){
        UserView.displayAccountFromUser(u);
    }


}
