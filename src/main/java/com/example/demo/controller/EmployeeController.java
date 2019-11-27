package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.impl.EmployeeServiceImpl;
import com.example.demo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping(method = RequestMethod.POST, value = Constants.SAVE_EMP)
    public String addEmp(@RequestParam String firstName, @RequestParam String lastName, @RequestParam char gender, @RequestParam String dob, @RequestParam String department)
    {
        employeeService.addEmploye(new Employee(firstName,lastName,gender,dob,department));
        return "Successfully Added";
    }
    @RequestMapping(Constants.GET_EMP_BY_ID)
    public Employee getEmpByFirstName(@PathVariable String name)
    {
        return employeeService.getEmpByFirstName(name);
    }
    @RequestMapping(Constants.GET_ALL_EMP)
    public List<Employee> getAllEmp()
    {
        return employeeService.getAllEmployee();
    }
}


