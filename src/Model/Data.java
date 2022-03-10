package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    static HashMap<String, User> usersList = new HashMap<>();
    static HashMap<Integer, Account> accountsList = new HashMap<>();
    static List<Transaction> transactionsList = new ArrayList<>();
    static User connectedUser = null;

    public static HashMap<String, User> getUsersList() {
        return usersList;
    }

    public static void setUsersList(HashMap<String, User> usersList) {
        Data.usersList = usersList;
    }

    public static HashMap<Integer, Account> getAccountsList() {
        return accountsList;
    }

    public static void setAccountsList(HashMap<Integer, Account> accountsList) {
        Data.accountsList = accountsList;
    }

    public static List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public static void setTransactionsList(List<Transaction> transactionsList) {
        Data.transactionsList = transactionsList;
    }

    public static User getConnectedUser() {
        return connectedUser;
    }

    public static void setConnectedUser(User connectedUser) {
        Data.connectedUser = connectedUser;
    }
}
