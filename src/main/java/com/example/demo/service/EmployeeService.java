package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> getAllEmployee();
    void addEmploye(Employee emp);
    Employee getEmpByFirstName(String name);
}
