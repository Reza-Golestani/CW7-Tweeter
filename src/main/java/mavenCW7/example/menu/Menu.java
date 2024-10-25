package mavenCW7.example.menu;

import mavenCW7.example.database.Database;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************ Welcome to the Tweeter App! ************");
        System.out.println("\n1. View Tweets");
        System.out.println("2. Login");
        System.out.print("\n>>> Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < Database.tweetIndex; i++) {
                    System.out.println(Database.tweets[i].getUser().getUserName() + ": " + Database.tweets[i].getText() + "\nposted at: " + Database.tweets[i].getCreatedAt());
                }
                break;
        }
    }
}
