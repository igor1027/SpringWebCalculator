package by.tms.repository;

import by.tms.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private final List<User> users = new ArrayList<>();
    private long  incId = 1;

    public void saveUser(User user){
        user.setId(incId++);
        users.add(user);
    }

    public User findByUsername(String username){
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    public boolean checkExistName(String username){
        for (User user : users){
            if (username.equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }
}
