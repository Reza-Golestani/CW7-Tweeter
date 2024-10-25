package mavenCW7.example.service;

import mavenCW7.example.entity.User;

public interface UserService {

    void login(User user);

    void signIn(String username, String password);

    void logout();

    void signUp(String username, String password);

}
