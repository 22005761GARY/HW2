package com.example.financialreport.controller;

import com.example.financialreport.model.Employee;
import com.example.financialreport.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class HRController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAllEmployees(){
        List<Employee> EmployeeList = this.employeeService.getAllEmployees();
        return EmployeeList;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee employee = this.employeeService.getEmployeeById(id);
        return employee;
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee){
        Employee NewEmployee = this.employeeService.createEmployee(employee);
        return NewEmployee;
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        Employee updatedEmployee = this.employeeService.updateEmployee(id, employee);
        return  updatedEmployee;
    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable int id){
        Employee deletedEmployee = this.employeeService.deleteEmployee(id);
        return  deletedEmployee;
    }



}
