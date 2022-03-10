package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    static HashMap<String, User> usersList = new HashMap<>();
    static List<Account> accountsList = new ArrayList<>();
    static List<Transaction> transactionsList = new ArrayList<>();
    static User connectedUser = null;

    public static HashMap<String, User> getUsersList() {
        return usersList;
    }

    public static void setUsersList(HashMap<String, User> usersList) {
        Data.usersList = usersList;
    }

    public static List<Account> getAccountsList() {
        return accountsList;
    }

    public static void setAccountsList(List<Account> accountsList) {
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
