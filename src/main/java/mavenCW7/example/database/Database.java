package mavenCW7.example.database;

import lombok.Getter;
import lombok.Setter;
import mavenCW7.example.entity.Tweet;
import mavenCW7.example.entity.User;

//@Getter
//@Setter

public class Database {

    public static User[] users = new User[10];

    public static User loggedUser = null;

    public static Tweet[] tweets = new Tweet[100];
    public static int tweetIndex = 0;

}
