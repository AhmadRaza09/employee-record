package com.employee.employeerecord.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping({"", "/employees", "/employees/index", "employees/index.html"})
    public String showEmployee()
    {
        return "index";
    }
}
