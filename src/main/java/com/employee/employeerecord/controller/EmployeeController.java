package com.employee.employeerecord.controller;


import com.employee.employeerecord.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping({"", "/employees", "/employees/index", "employees/index.html"})
    public String showEmployee(Model model)
    {
        model.addAttribute("employees", employeeService.findAll());
        return "index";
    }
}
