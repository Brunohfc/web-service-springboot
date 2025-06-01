package com.brunohfcharles.demo.configs;

import com.brunohfcharles.demo.entities.User;
import com.brunohfcharles.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Bob esponja", "esponja@mail.com", "124563", "47ad");
        User user2 = new User(null, "Patrick estrela", "patrick@mail.com", "78544", "asdv457");

        userRepository.saveAll(Arrays.asList(user1,user2));

    }
}
