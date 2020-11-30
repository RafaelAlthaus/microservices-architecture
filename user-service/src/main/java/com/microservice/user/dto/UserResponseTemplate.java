/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.user.dto;

import com.microservice.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hmt-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseTemplate {

    private User user;
    private Department department;
}
