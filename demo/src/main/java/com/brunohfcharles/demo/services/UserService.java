package com.brunohfcharles.demo.services;

import com.brunohfcharles.demo.entities.User;
import com.brunohfcharles.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> obterTodosUsuarios(){
        var users = userRepository.findAll();
        return users;
    }

    public User obterUsuarioPorId(int id){


        Optional<User> user = userRepository.findById(id);

        return user.get();
    }
}
