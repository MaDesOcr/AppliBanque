package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    static HashMap<String, User> usersList = new HashMap<>();
    static User connectedUser = null;

    public static HashMap<String, User> getUsersList() {
        return usersList;
    }

    public static void setUsersList(HashMap<String, User> usersList) {
        Data.usersList = usersList;
    }

    public static User getConnectedUser() {
        return connectedUser;
    }

    public static void setConnectedUser(User connectedUser) {
        Data.connectedUser = connectedUser;
    }
}
