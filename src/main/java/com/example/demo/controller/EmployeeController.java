package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.impl.EmployeeServiceImpl;
import com.example.demo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping(Constants.GET_ALL_EMP) //Or @RequestMapping(method = RequestMethod.POST, value = Constants.GET_ALL_EMP)
    public ResponseEntity<Object> addEmployee(@RequestBody Employee newEmployee)
    {
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping(Constants.GET_ALL_EMP) //Or @RequestMapping(Constants.GET_ALL_EMP)
    public List<Employee> retrieveEmployees()
    {
        return employeeService.getAllEmployees();
    }

    /*@GetMapping(Constants.GET_ALL_EMP)
    public List<Employee> getEmpsByDept(@RequestParam String dept)
    {
        return employeeService.getEmpByDept(dept);
    }*/

    @RequestMapping(Constants.GET_EMP_BY_ID)
    public Employee getEmpByID(@PathVariable int empID)
    {
        return employeeService.getEmpByID(empID);
    }
}