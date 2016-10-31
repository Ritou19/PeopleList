/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi2.peoplelist.presentation.bean;

import ch.hearc.ig.odi2.peoplelist.service.Services;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Bean de la page de la creation personne
 * 
 * @author steven.habegger
 * @version 1.0, 31.10.2016
 */
@Named(value = "createPersonBean")
@RequestScoped
public class CreatePersonBean {

    @Inject Services services;
    private long id;
    private String gender;
    private String firstName;
    private String lastName;
    private Boolean married;
    private Date birthDate;
    
    /**
     * Constructeur par defaut du bean
     */
    public CreatePersonBean() {
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    public String addPerson() {
        services.savePerson(this.gender, this.firstName, this.lastName, this.married, this.birthDate);
        return "index.xhtml";
    }
    
    
    
}
