package Dao;

import Model.Data;
import Model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    public static HashMap<Integer, User> getUsers(){
        return Data.getUsersMap();
    }

    public static User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }

    public static User getUserById(Integer userTO) {
        return Data.getUsersMap().get(userTO);
    }

    public static User getConnectedUser(){
        return Data.getConnectedUser();
    }

    public static HashMap<Integer, User> getFriendMapFromUser() {
        return Data.getConnectedUser().getFriendMap();
    }
}
