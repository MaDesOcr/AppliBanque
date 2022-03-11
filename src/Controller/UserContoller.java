package Controller;

import Dao.UserDao;
import Model.User;
import View.UserView;

public class UserContoller {

    UserView userView = new UserView();

    public void displayUser(){
        userView.displayUsers(UserDao.getUsers());
    }

    public void displayAccountFromUser(User u){
        userView.displayAccountFromUser(u);
    }



}
