package Dao;

import Model.Data;
import Model.User;

import java.util.HashMap;

public class UserDao {

    public static HashMap<Integer, User> getUsers(){
        return Data.getUsersMap();
    }

    public static User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }
}
