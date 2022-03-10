package View;

import Controller.TransactionController;
import Controller.UserContoller;
import Model.Account;
import Model.Data;
import Model.Transaction;
import Model.User;

import java.util.Scanner;

public class MainMenuView {

    public Scanner sc = new Scanner(System.in);
    public String userName;
    public String password;
    public String choice;


    public void printLogin(){
        System.out.println("Welcome to our amazing banking app!");
        System.out.println("Please login. UserName :?");
        userName = sc.nextLine();
        System.out.println("Please login. Password :?");
        password = sc.nextLine();
    }

    public void printMainMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1 Add an account to your profil");
        System.out.println("2 Create a transaction");
        System.out.println("3 View all transactions from your account");
        System.out.println("4 Print out account");
        System.out.println("5 Add a contact to your preferedContactList");
        System.out.println("6 Exit");
        choice = sc.nextLine();
    }



    public static void printAccountFromConnectedUser() {
        for (Account a: Data.getConnectedUser().getUserAccounts().values()) {
            System.out.println(a);
        }
    }

    public void printWelcome() {
        System.out.println("Welcome " + Data.getConnectedUser().getFirstName());
    }
}
