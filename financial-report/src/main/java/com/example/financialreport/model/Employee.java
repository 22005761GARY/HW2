package com.example.financialreport.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
    private  boolean COVID19;
}
