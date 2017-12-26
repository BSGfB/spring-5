package com.bsgfb.rx.rest.controller;

import com.bsgfb.rx.model.User;
import com.bsgfb.rx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public Flux<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Mono<User> getUserById(@PathVariable(name = "id") Long id) {
        return userService.getById(id);
    }
}
