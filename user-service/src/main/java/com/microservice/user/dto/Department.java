/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.user.dto;

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
public class Department {

    private Long depId;
    private String depName;
    private Double depBudget;
    private Boolean depActive;
}
