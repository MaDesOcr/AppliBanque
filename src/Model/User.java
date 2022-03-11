package Model;

import java.util.HashMap;
import java.util.List;

public class User {

    static int lastInt = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String role;

    private HashMap<Integer, Account> userAccounts = new HashMap<>();

    private HashMap<Integer, User> friendMap = new HashMap<>();

    public User(String firstName, String lastName, String password, String role) {
        this.id = lastInt++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<Integer, Account> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(HashMap<Integer, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public static int getLastInt() {
        return lastInt;
    }

    public static void setLastInt(int lastInt) {
        User.lastInt = lastInt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, User> getFriendMap() {
        return friendMap;
    }

    public void setFriendMap(HashMap<Integer, User> friendMap) {
        this.friendMap = friendMap;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", userAccounts=" + userAccounts +
                ", friendMap size =" + friendMap.size() +
                '}';
    }
}
