package com.example.HelloWorldAppBoot.hello;

import com.example.HelloWorldAppBoot.topics.Employee;
import com.example.HelloWorldAppBoot.topics.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   //get called
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/myController")  //get method
    public String getMessaees() {
        return "return from MyController";
        //service  ->inerface
        //serviceimpl --> interace   -->dao respositorty
    }
    @GetMapping("/employeeRecords")
    public List<Employee> getAllEmployees() {
       return employeeService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.POST, value = "employee")   //post method
    public void postEmployee(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);
    }
}
