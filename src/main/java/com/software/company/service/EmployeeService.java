package com.software.company.service;

import com.software.company.model.Employee;
import com.software.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    public Employee updateEmployee(Long id, Employee updatedEmployee) {
//        if (employeeRepository.existsById(id)) {
//            updatedEmployee.setId(id);
//            return employeeRepository.save(updatedEmployee);
//        }
//        return null; // Handle not found case
//    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
