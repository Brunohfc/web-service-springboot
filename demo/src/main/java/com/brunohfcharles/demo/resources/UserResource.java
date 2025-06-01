package com.brunohfcharles.demo.resources;

import com.brunohfcharles.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> getUser(){
        User user = new User(1,"Bruno", "bruno@gmail.com", "999999", "!");


        return  ResponseEntity.ok().body(user);


    }
}
