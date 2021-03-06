/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi2.peoplelist.presentation.bean;

import ch.hearc.ig.odi2.peoplelist.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author steven.habegger
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean {
    
    @Inject Services services;

    public PeopleListBean() {
    }
    
    public List getPeopleList() {
        return services.getPeopleList();
    }
    
}
