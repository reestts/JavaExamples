package com.reestts.springboot.controller;

import com.reestts.springboot.entity.Employee;
import com.reestts.springboot.exception.EmployeeException;
import com.reestts.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee showEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (isNull(employee)) {
            throw new EmployeeException("Employee with id = " + id + " not found");
        }
        return employee;
    }

    @PostMapping("/employee/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employee/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        if (isNull(employeeService.getEmployee(id))) {
            throw new EmployeeException("Employee with id = " + id + " not found");
        }

        employeeService.deleteEmployee(id);

        return "Employee with id = " + id + " deleted";
    }
}
