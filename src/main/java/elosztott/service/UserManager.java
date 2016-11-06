package elosztott.service;

import elosztott.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makra on 2016. 09. 26..
 */
@Service
public class UserManager {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
