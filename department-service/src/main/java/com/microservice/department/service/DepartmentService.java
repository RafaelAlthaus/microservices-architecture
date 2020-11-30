/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.department.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;

/**
 *
 * @author hmt-05
 */
@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department obj) {
        log.info("-- Started save department service. --");
        return departmentRepository.save(obj);
    }

    public Department findById(Long id) {
        log.info("-- Started findById department service. --");
        return departmentRepository.findDepartmentByDepId(id);
    }

}
