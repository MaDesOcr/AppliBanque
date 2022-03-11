package Model;

import java.util.HashMap;

public class Data {

    static HashMap<Integer, User> usersMap = new HashMap<>();
    static User connectedUser = null;

    public static HashMap<Integer, User> getUsersMap() {
        return usersMap;
    }

    public static void setUsersMap(HashMap<Integer, User> usersMap) {
        Data.usersMap = usersMap;
    }

    public static User getConnectedUser() {
        return connectedUser;
    }

    public static void setConnectedUser(User connectedUser) {
        Data.connectedUser = connectedUser;
    }
}
