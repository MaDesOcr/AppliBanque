package View;

import Model.User;

import java.util.Scanner;

public class AccountView {

    Scanner sc = new Scanner(System.in);
    public String name;

    public void createAndAddAccountToConnectedUser(User connectedUser) {
        System.out.println("Bienvenue dans la création de l'ajout d'un compte à votre profil");
        System.out.println("Entez le nom de votre compte à ajouter : ");
        name = sc.nextLine();
    }
}
