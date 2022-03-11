package View;

import Controller.TransactionController;
import Controller.UserContoller;
import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;

import java.util.HashMap;
import java.util.Scanner;

public class TransactionView {

    Scanner sc;
    public String userTO;
    public String accountTO;
    public String accountFrom;
    public String howmuch;
    public Account aFrom;
    public Account aTo;

    public void chooseUser(HashMap<Integer, User> usersMap){
        sc = new Scanner(System.in);
        System.out.println("To make a transaction, choose a which to user you want to give money ");
        for (User u : usersMap.values()){
            System.out.println(u);
        }
        userTO = sc.nextLine();
    }

    public void chooseAccountFromUser(User connectedUser){
        System.out.println("Which account from this user ?");
        for (Account a :connectedUser.getUserAccounts().values()) {
            System.out.println(a);
        }
        //UserContoller.displayAccountFromUser(connectedUser);
        accountTO = sc.nextLine();
    }

    public void chooseAccountToUser(User chosenUser){
        System.out.println("From which account do you want to give money ");
        for (Account a : chosenUser.getUserAccounts().values()) {
            System.out.println(a);
        }
        //UserContoller.displayAccountFromUser(chosenUser);
        accountFrom = sc.nextLine();
    }

    public void giveAmount(){
        System.out.println("How much ");
        howmuch = sc.nextLine();
    }
}
