package mavenCW7.example.database;


import mavenCW7.example.entity.Like;
import mavenCW7.example.entity.Tweet;
import mavenCW7.example.entity.User;


public class Database {

    public static User[] users = new User[10];

    public static User loggedUser = null;

    public static Tweet[] tweets = new Tweet[100];

    public static Like[] likes = new Like[100];
    public static int tweetIndex = 0;
    public static int likeIndex = 0;
    public static int userIndex = 2;
}
