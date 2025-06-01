package com.brunohfcharles.demo.resources;

import com.brunohfcharles.demo.entities.User;
import com.brunohfcharles.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity <List<User>> getUsers(){

        List<User> users = userService.obterTodosUsuarios();

        return  ResponseEntity.ok().body(users);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getById(@PathVariable int id){
        User userId = userService.obterUsuarioPorId(id);
        return ResponseEntity.ok().body(userId);
    }
}
