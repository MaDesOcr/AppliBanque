package View;

import Model.Account;
import Model.Data;
import Model.User;

import java.util.HashMap;
import java.util.Scanner;

public class UserView {

    Scanner sc;
    public String idSelectedUser;
    public static void displayUsers(HashMap<Integer, User> userMap){
        for(User u: userMap.values()){
            System.out.println(u);
        }
    }

    public static void displayAccountFromUser(User u){
        for (Account a : u.getUserAccounts().values()){
            System.out.println(a);
        }
    }

    public void addUserToFriendList(HashMap<Integer, User> usersMap, User connectedUser) {
        for (User u : usersMap.values() ) {
            if(!u.equals(connectedUser)){
                System.out.println(u);
            }
        }
        sc = new Scanner(System.in);
        idSelectedUser = sc.nextLine();


    }
}
