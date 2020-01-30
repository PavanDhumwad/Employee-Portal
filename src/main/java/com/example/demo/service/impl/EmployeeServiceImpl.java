package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
//import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees()
    {
        ArrayList<Employee> employeeDB = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeDB::add);
        return employeeDB;
    }

    public ResponseEntity<Object> addEmployee(Employee newEmp)
    {
       employeeRepository.save(newEmp);
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().
                path("{id}").buildAndExpand(newEmp.getEmpID()).toUri();
       return ResponseEntity.created(location).build();
    }

    public Employee getEmpByID(int empID)
    {
        return employeeRepository.findOne(empID);
    }

    public List<Employee> getEmpByDept(String dept) {
        return employeeRepository.findByDepartment(dept);
    }
}

