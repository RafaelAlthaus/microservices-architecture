/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.user.service;

import com.microservice.user.dto.UserResponseTemplate;
import com.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;
import com.microservice.user.dto.Department;

/**
 *
 * @author hmt-05
 */
@Slf4j
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public User save(User obj) {
        log.info("-- Reached save user service. --");
        return userRepository.save(obj);
    }
    
    public UserResponseTemplate getUserWithDepartment(Long id) {
        log.info("-- Reached getUserWithDepartment service. --");
        
        UserResponseTemplate dto = new UserResponseTemplate();
        
        dto.setUser(userRepository.findUserByUsrId(id));
        dto.setDepartment(restTemplate.getForObject("http://localhost:9001/department/" + dto.getUser().getUsrDepartmentId(), Department.class));
        
        return dto;
    }
}
