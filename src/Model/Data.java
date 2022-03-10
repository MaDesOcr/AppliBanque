package Model;

import java.util.HashMap;

public class Data {

    static HashMap<String, User> usersMap = new HashMap<>();
    static User connectedUser = null;

    public static HashMap<String, User> getUsersMap() {
        return usersMap;
    }

    public static void setUsersMap(HashMap<String, User> usersMap) {
        Data.usersMap = usersMap;
    }

    public static User getConnectedUser() {
        return connectedUser;
    }

    public static void setConnectedUser(User connectedUser) {
        Data.connectedUser = connectedUser;
    }
}
