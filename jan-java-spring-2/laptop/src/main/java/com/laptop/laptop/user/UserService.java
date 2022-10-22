package com.laptop.laptop.user;

import com.laptop.laptop.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public boolean addUser(User user) {
        userRepository.save(user);
        return true;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
