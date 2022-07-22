/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xi1le
 */
@RestController // component retour de la méthode au format JSON
public class EmployeesController {

    @Autowired // correspondance springframework
    private EmployeesService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees") // les requêtes HTTP de type GET à l’URL /employees exécuteront la fonction springframework
    /*https://openclassrooms.com/fr/courses/6900101-creez-une-application-java-avec-spring-boot/7078015-creez-un-controleur-rest-pour-gerer-vos-donnees*/
    public Iterable<Employees> getEmployees() {
        return employeeService.getEmployees();
    }

}


