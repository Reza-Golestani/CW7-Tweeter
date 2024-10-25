package mavenCW7.example;

import mavenCW7.example.database.Database;
import mavenCW7.example.entity.User;
import mavenCW7.example.menu.Menu;
import mavenCW7.example.service.impl.TweetService;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        TweetService tweetService = new TweetService();

        User u1 = new User(1, "user1", "pass1");
        User u2 = new User(2, "user2", "pass2");

        Database.loggedUser = u1;

        tweetService.addTweet("1st tweet from user u1");
        tweetService.addTweet("2nd tweet from user u1");
        tweetService.addTweet("3rd tweet from user u1");
        tweetService.addTweet("4th tweet from user u1");

        Menu.displayMenu();

    }
}
