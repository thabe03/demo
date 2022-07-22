/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author xi1le
 */
@Data // getter setter de lombook
@Entity // employees correspond à une table spring data jpa
@Table(name = "employees") // nom de la table associée spring data jpa
public class Employees implements Serializable {

    @Id // cle primaire spring data jpa
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrémenté spring data jpa
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;

}