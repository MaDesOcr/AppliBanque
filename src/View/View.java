package View;

import Controller.LoginController;
import Controller.MenuController;
import Controller.TransactionController;
import Controller.UserContoller;
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

                while (true) {
                    System.out.println("What do you want to do?");
                    System.out.println("1 Add an account to your profil");
                    System.out.println("2 Create a transaction");
                    System.out.println("3 View all transactions from your account");
                    System.out.println("4 Print out account");
                    System.out.println("5 Add a contact to your preferedContactList");
                    System.out.println("6 Exit");
                    String choice = sc.nextLine();
                    MenuController.handleMainMenu(choice);
                }
        }

    }

    public static void printTransactionFromConnectedUser(){
        for (Account a: Data.getConnectedUser().getUserAccounts().values()) {
            for (Transaction t : a.getListTransactions()) {
                System.out.println(t.toString());
            }
        }
    }


    public static void createTransactionFromConnectedUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To make a transaction, choose a which to user you want to give money ");
        UserContoller.displayUser();
        String userTO = sc.nextLine();

        User chosenUser = Data.getUsersList().get(userTO);
        System.out.println("Which account from this user ?");
        UserContoller.displayAccountFromUser(chosenUser);
        String accountTO = sc.nextLine();
        Account aTo = chosenUser.getUserAccounts().get(Integer.parseInt(accountTO));

        System.out.println("From which account do you want to give money ");
        UserContoller.displayAccountFromUser(Data.getConnectedUser());
        String accountFrom = sc.nextLine();
        Account aFrom = Data.getConnectedUser().getUserAccounts().get(Integer.parseInt(accountFrom));

        System.out.println("How much ");
        String howmuch = sc.nextLine();

        TransactionController.createAndSaveTransaction(aFrom, aTo, Double.parseDouble(howmuch));

    }

    public static void printAccountFromConnectedUser() {
        for (Account a: Data.getConnectedUser().getUserAccounts().values()) {
            System.out.println(a);
        }
    }
}
