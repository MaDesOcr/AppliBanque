package Controller;

import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;

public class UserContoller {


    public static void displayUser(){
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
