package com.sahan.mdkair60_61_62;

import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    public User loginChecker(String email, String password) {

        List<User> users = getUsers();

        for(User user : users){

            if(user.getEmail().toLowerCase().equals(email.toLowerCase()) &&
                user.getPassword().toLowerCase().equals(password.toLowerCase())){
                return user;
            }
        }

        return null;

    }


    private List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "admin@abc.lk", "123", ROLE.ADMINSTRATOR));
        users.add(new User(2, "rifaz@abc.lk", "123", ROLE.LOYALITY));
        users.add(new User(3, "shahlan@abc.lk", "123", ROLE.STANDARD));
        users.add(new User(4, "sasly@abc.lk", "123", ROLE.VIP));
        users.add(new User(5, "hubaib@abc.lk", "123", ROLE.ADMINSTRATOR));

        return users;
    }
}
