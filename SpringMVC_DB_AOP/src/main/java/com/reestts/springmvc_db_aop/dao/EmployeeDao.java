package com.reestts.springmvc_db_aop.dao;

import com.reestts.springmvc_db_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);

}
