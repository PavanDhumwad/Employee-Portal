package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService
{
    ResponseEntity<Object> addEmployee(Employee newEmp);
    List<Employee> getAllEmployees();
}
