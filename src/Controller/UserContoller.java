package Controller;

import Dao.UserDao;
import Model.User;
import View.UserView;

public class UserContoller {

    public static void displayUser(){
        UserView.displayUsers(UserDao.getUsers());
    }

    public static void displayAccountFromUser(User u){
        UserView.displayAccountFromUser(u);
    }



}
