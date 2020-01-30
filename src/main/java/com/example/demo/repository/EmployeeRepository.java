package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> //JpaRepository<Employee, String>
{
    List<Employee> findByDepartment(String department);
}
