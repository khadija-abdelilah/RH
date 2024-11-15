// src/main/java/emsi/service/EmployeeService.java
package com.dijachim.employeeservice.service;

import com.dijachim.employeeservice.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
