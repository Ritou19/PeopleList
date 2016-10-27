/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi2.peoplelist.presentation;

import ch.hearc.ig.odi2.peoplelist.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author steven.habegger
 */
@Named(value = "peopleLisBean")
@RequestScoped
public class PeopleLisBean {
    
    @Inject Services services;

    public PeopleLisBean() {
    }
    
    public List getPeopleList() {
        return services.getPeopleList();
    }
    
}
