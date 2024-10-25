package mavenCW7.example.service;

import mavenCW7.example.entity.Tweet;
import mavenCW7.example.entity.User;

public interface LikeService {

    public void like(Tweet tweet, User user);
    public void unlike(Tweet tweet, User user);

}
