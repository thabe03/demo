/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 *
 * @author xi1le
 */
@WebMvcTest(controllers = EmployeesController.class) // Tester les controller, spécification
public class EmployeesControllerTest {

    @Autowired // correspondance springframework
    private MockMvc mockMvc; // appeler la méthode “perform” 

    @MockBean // obligatoire, car la méthode du controller exécutée par l’appel de “/employees” utilise cette classe
    private EmployeesService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk());
    }

}
