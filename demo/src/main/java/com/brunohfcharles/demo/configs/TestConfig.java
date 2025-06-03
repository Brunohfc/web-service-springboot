package com.brunohfcharles.demo.configs;

import com.brunohfcharles.demo.entities.Order;
import com.brunohfcharles.demo.entities.User;
import com.brunohfcharles.demo.repositories.OrderRepository;
import com.brunohfcharles.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Bob esponja", "esponja@mail.com", "124563", "47ad");
        User user2 = new User(null, "Patrick estrela", "patrick@mail.com", "78544", "asdv457");


        Order order = new Order(user1,null, Instant.parse("2025-06-02T19:53:07Z"));
        Order order1 = new Order(user2,null, Instant.parse("2025-06-02T20:53:07Z"));
        Order order2 = new Order(user1, null, Instant.parse("2025-06-02T19:53:07Z"));
        userRepository.saveAll(Arrays.asList(user1,user2));
        orderRepository.saveAll(Arrays.asList(order, order1, order2));
    }
}
