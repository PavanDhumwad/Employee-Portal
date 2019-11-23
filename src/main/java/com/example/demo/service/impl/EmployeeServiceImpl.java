package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee()
    {
        List<Employee> emp = new ArrayList<>();
        employeeRepository.findAll().forEach(emp::add);
        emp.sort(Comparator.comparing(Employee::getFirstName));
        return emp;
    }

    public void addEmploye(Employee emp)
    {
        employeeRepository.save(emp);
    }

    public Employee getEmpByFirstName(String name)
    {
        return employeeRepository.findOne(name);
    }
}

