/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Optional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xi1le
 */
@Data // getter setter de lombook
@Service // component
public class EmployeesService {

    @Autowired // correspondance springframework
    private EmployeesRepository employeeRepository;

    public Optional<Employees> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employees> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employees saveEmployee(Employees employee) {
        Employees savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

}