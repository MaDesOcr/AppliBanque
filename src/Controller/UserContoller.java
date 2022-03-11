package Controller;

import Dao.UserDao;
import Model.User;
import View.UserView;

public class UserContoller {

    UserView userView = new UserView();
    UserDao userDao = new UserDao();

    public void displayUser(){
        userView.displayUsers(userDao.getUsers());
    }

    public void displayAccountFromUser(User u){
        userView.displayAccountFromUser(u);
    }


    public void handleAddUserToFriendList() {
        try{
            userView.addUserToFriendList(userDao.getUsers(), userDao.getConnectedUser());
            Integer id = Integer.parseInt(userView.idSelectedUser);
            userDao.getFriendMapFromUser().put(id, userDao.getUserById(id));
        }
        catch (NumberFormatException n){

        }
    }
}
