package mavenCW7.example.menu;

import mavenCW7.example.database.Database;

import java.util.Scanner;

public class UserMenu {
    public static void userMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome   " + Database.loggedUser.getUserName());
        System.out.println("1.view");
    }
}
