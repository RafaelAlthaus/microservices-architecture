/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.department.entity.Department;

/**
 *
 * @author hmt-05
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentByDepId(Long depId);

}
