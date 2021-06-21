package com.reestts.springdata.service.impl;

import com.reestts.springdata.repository.EmployeeRepository;
import com.reestts.springdata.entity.Employee;
import com.reestts.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployee(Integer id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
