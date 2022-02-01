package com.employee.employeerecord.bootstrap;


import com.employee.employeerecord.model.Employee;
import com.employee.employeerecord.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeService employeeService;

    public DataInitializer(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setFirstName("Ahmad");
        employee1.setLastName("Raza");
        employee1.setDesignation("Software Engineer");

        employeeService.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Faraz");
        employee2.setLastName("Raza");
        employee2.setDesignation("Web Developer");

        employeeService.save(employee2);

        System.out.println("Total Employee: " + employeeService.count());



    }
}
