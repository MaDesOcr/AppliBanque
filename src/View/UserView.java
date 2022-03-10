package View;

import Model.Account;
import Model.Data;
import Model.User;

public class UserView {

    public static void displayUsers(){
        for(String s : Data.getUsersList().keySet()){
            System.out.println(Data.getUsersList().get(s).toString());
        }
    }

    public static void displayAccountFromUser(User u){
        for (Account a : u.getUserAccounts().values()){
            System.out.println(a.toString());
        }
    }
}