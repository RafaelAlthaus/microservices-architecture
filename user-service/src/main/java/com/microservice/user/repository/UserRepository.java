/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.user.entity.User;

/**
 *
 * @author hmt-05
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsrId(Long usrId);
}
