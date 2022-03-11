package Dao;

import Model.Data;
import Model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    public HashMap<Integer, User> getUsers(){
        return Data.getUsersMap();
    }

    /*public User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }*/

    public User getUserById(Integer userTO) {
        return Data.getUsersMap().get(userTO);
    }

    public User getConnectedUser(){
        return Data.getConnectedUser();
    }

    public HashMap<Integer, User> getFriendMapFromUser() {
        return Data.getConnectedUser().getFriendMap();
    }
}
