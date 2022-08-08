package com.example.financialreport.service;

import com.example.financialreport.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    private List<Employee> EmployeeList;

    public EmployeeService(){
        this.EmployeeList = new ArrayList<>();
        EmployeeList.add(new Employee(1,"Gary", 30000, false));
        EmployeeList.add(new Employee(2,"Jason", 40000, false));
        EmployeeList.add(new Employee(3,"Eric", 35000, true));
    }

    public List<Employee> getAllEmployees(){
        return  this.EmployeeList;
    }


    public Employee getEmployeeById(int id){
        for (Employee employee : this.EmployeeList){
            if(id ==employee.getId()){
                return employee;
            }
        }
        return  null;
    }

    public  Employee createEmployee(Employee employee){
        this.EmployeeList.add(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee employee){
        for (Employee updatedEmployee : this.EmployeeList){
            if(id == updatedEmployee.getId()) {
                updatedEmployee.setId(employee.getId());
                updatedEmployee.setName(employee.getName());
                updatedEmployee.setSalary(employee.getSalary());
                updatedEmployee.setCOVID19(employee.isCOVID19());
                return updatedEmployee;
            }
        }
        return null;
    }

    public  Employee deleteEmployee(int id){
        for (Employee employee : this.EmployeeList){
            if (id == employee.getId()){
                this.EmployeeList.remove(employee);
                return employee;
            }
        }
        return null;
    }


}
