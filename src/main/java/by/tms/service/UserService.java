package by.tms.service;

import by.tms.entity.User;
import by.tms.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        userRepository.saveUser(user);
    }

    public User findByUser(String username){
        return userRepository.findByUsername(username);
    }

    public boolean checkUsername (String username){
       return userRepository.checkExistName(username);
    }
}
