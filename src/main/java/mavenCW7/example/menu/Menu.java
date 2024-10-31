package mavenCW7.example.menu;

import mavenCW7.example.database.Database;
import mavenCW7.example.service.UserService;
import mavenCW7.example.service.impl.UserServiceimpl;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        UserService userService = new UserServiceimpl();

        Scanner sc = new Scanner(System.in);
        System.out.println("************ Welcome to the Tweeter App! ************");
        System.out.println("\n1. View Tweets");
        System.out.println("2. Login");
        System.out.println("3. Register");
        System.out.print("\n>>> Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                viewTweets();
                break;
                case 2:
                    userService.login();
                    break;
                    case 3:
                        userService.signUp();
            default:displayMenu();
        }
    }

    private static void viewTweets() {
        for (int i = 0; i < Database.tweetIndex; i++) {
            System.out.println(Database.tweets[i].getUser().getUserName() + ": " + Database.tweets[i].getText() + "\nposted at: " + Database.tweets[i].getCreatedAt() + "\n"+"Likes: "+Database.tweets[i].getLikeCount());
        }
    }

}
