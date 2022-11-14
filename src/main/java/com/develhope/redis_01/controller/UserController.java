package com.develhope.redis_01.controller;

import com.develhope.redis_01.entities.jpa.UserJPA;
import com.develhope.redis_01.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("")
    public UserJPA createUser(@RequestBody UserJPA userJPA) {
        return userService.create(userJPA);
    }

    @GetMapping()
    public List<UserJPA> readAll() {
        return userService.readAll();
    }

    @PutMapping("/{id}")
    public UserJPA update(@PathVariable Long id, @RequestBody UserJPA user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }


}
