package mavenCW7.example.service.impl;

import mavenCW7.example.database.Database;
import mavenCW7.example.entity.Like;
import mavenCW7.example.entity.Tweet;
import mavenCW7.example.entity.User;
import mavenCW7.example.service.LikeService;

import java.time.LocalDateTime;


public class LikeServiceImpl implements LikeService {


    @Override
    public void like(Tweet tweet, User user) {
        for(Like like: Database.likes){
            if(like!=null&&like.getUser().getUserName().equals(user.getUserName()) && like.getTweet().equals(tweet)){
                System.out.println("You liked this tweet already !");
                return;
            }
        }
        Like like = new Like();
        like.setTweet(tweet);
        like.setUser(user);
        like.setDate(LocalDateTime.now());
        Database.likes[Database.likeIndex] = like;
        Database.likeIndex++;
        tweet.setLikeCount(tweet.getLikeCount()+1);

    }

    @Override
    public void disslike(Tweet tweet, User user) {

    }


}
