package com.example.HelloWorldAppBoot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService  {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee emp)
    {
        employeeRepository.save(emp);
    }



    public List<Employee> getAllEmployees() {
        List<Employee> emp=new ArrayList<>();
        employeeRepository.findAll().forEach(emp::add);  //to iterate the records
        return emp;
    }
}
