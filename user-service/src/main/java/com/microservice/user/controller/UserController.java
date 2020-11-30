/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.user.controller;

import com.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.microservice.user.dto.UserResponseTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author hmt-05
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User obj) {
        log.info("-- Reached save user endpoint. --");
        return userService.save(obj);
    }

    @GetMapping("/{id}")
    public UserResponseTemplate getUserWithDepartment(@PathVariable("id") Long id) {
        log.info("-- Reached getUserWithDepartment endpoint. --");
        return userService.getUserWithDepartment(id);
    }
}
