/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.department.controller;

import com.microservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.department.entity.Department;

/**
 *
 * @author hmt-05
 */
@Slf4j
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department save(@RequestBody Department obj) {
        log.info("-- Reached save department endpoint. --");
        return departmentService.save(obj);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id") Long id) {
        log.info("-- Reached getById department endpoint. --");
        return departmentService.findById(id);
    }
}
