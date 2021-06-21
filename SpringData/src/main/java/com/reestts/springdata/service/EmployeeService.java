package com.reestts.springdata.service;

import com.reestts.springdata.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployee(Integer id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Integer id);

}
