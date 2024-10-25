package mavenCW7.example.service.impl;

import mavenCW7.example.database.Database;
import mavenCW7.example.entity.Tweet;
import mavenCW7.example.entity.User;

import java.time.LocalDateTime;

public class TweetService implements mavenCW7.example.service.TweetService {

    private static int tweetIdCounter = 0;

    @Override
    public void addTweet(String tweetText) {

        int id = tweetIdCounter++;
        User user = Database.loggedUser;
        LocalDateTime createdAt = LocalDateTime.now();

        Tweet tweet = new Tweet(id, tweetText, user, createdAt);
        Database.tweets[Database.tweetIndex] = tweet;
        Database.tweetIndex++;

    }
}
