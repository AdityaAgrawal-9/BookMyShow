package com.example.bookmyshow.service;

import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signUp(String username, String password) {
        // All validation logics for user and password will be written here.
        //BCryptPasswordEncoder bkencoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));

        return userRepository.save(user);
    }

    public boolean login(String email, String password) {
        return passwordEncoder.matches(password, userRepository.findByUsername(email).get().getPassword());
    }
}
