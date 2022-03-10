package View;

import Controller.LoginController;
import Controller.MenuController;
import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;

import java.util.Scanner;

public class View {

    public static void printMainMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our amazing banking app!");

        System.out.println("Please login. UserName :?");
        String userName = sc.nextLine();
        System.out.println("Please login. Password :?");
        String password = sc.nextLine();

        User connectedTempUser = LoginController.checkLogin(userName, password);
        if(connectedTempUser!= null){
            Data.setConnectedUser(connectedTempUser);
        }
        else {
            System.out.println("Login failed!");
        }

        if (Data.getConnectedUser()!= null){
            System.out.println("Welcome " + Data.getConnectedUser().getFirstName());
            System.out.println("What do you want to do?");
            System.out.println("1 Add an account to your profil");
            System.out.println("2 Create a transaction");
            System.out.println("3 View all transactions from your account");
            System.out.println("4 Add a contact to your preferedContactList");
            System.out.println("5 Exit");
            String choice = sc.nextLine();
            MenuController.handleMainMenu(choice);
        }

    }

    public static void printTransactionFromConnectedUser(){
        for (Account a: Data.getConnectedUser().getUserAccounts()) {
            for (Transaction t : a.getListTransactions()) {
                t.toString();
            }
        }
    }


}
