package mavenCW7.example.service.impl;

import mavenCW7.example.database.Database;
import mavenCW7.example.entity.User;
import mavenCW7.example.menu.Menu;
import mavenCW7.example.service.UserService;

import java.util.Scanner;

public class UserServiceimpl implements UserService {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void login() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        for (int i =0;i < Database.userIndex ; i++){
            if(username.equals(Database.users[i].getUserName())&&password.equals(Database.users[i].getPassword())){
                Database.loggedUser = Database.users[i];
                System.out.println("Logged in");
                return;
            }
        }
        System.out.println("Username or password is incorrect");
        login();

    }


    @Override
    public void logout() {
        System.out.println("Logged out");
        Database.loggedUser = null;
        Menu.displayMenu();
    }

    @Override
    public void signUp() {
        System.out.println("Please enter your username: ");
        String userName = scanner.nextLine();

        for (int i =0;i < Database.userIndex ; i++) {
            if (userName.equals(Database.users[i].getUserName())) {
                System.out.println("Username is already in use");
                signUp();
            }
        }

        System.out.println("Please enter your password: ");
        String passWord = scanner.nextLine();


        User user = new User(Database.userIndex, userName, passWord);

        Database.users[Database.userIndex] = user;
        Database.userIndex++;
    }
}
