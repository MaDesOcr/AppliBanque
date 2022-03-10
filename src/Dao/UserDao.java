package Dao;

import Model.Data;
import Model.User;
import com.sun.javafx.UnmodifiableArrayList;

import java.util.HashMap;

public class UserDao {

    public static HashMap<String, User> getUsers(){
        return Data.getUsersMap();
    }

    public static User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }
}
