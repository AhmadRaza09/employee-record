package com.employee.employeerecord.service;


import com.employee.employeerecord.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService extends CrudRepository<Employee, Long> {
}
