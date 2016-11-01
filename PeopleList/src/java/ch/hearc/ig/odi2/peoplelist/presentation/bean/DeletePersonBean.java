package ch.hearc.ig.odi2.peoplelist.presentation.bean;

import ch.hearc.ig.odi2.peoplelist.business.Person;
import ch.hearc.ig.odi2.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author steven.habegger
 */
@Named(value = "deletePersonBean")
@RequestScoped
public class DeletePersonBean {

    @Inject Services services;
    
    private Person personToDel;
    
    public DeletePersonBean() {
    }

    public Person getPersonToDel() {
        return personToDel;
    }

    public void setPersonToDel(Person personToDel) {
        this.personToDel = personToDel;
    }
    
    public String delPerson() {
        services.removePerson(personToDel);
        return "index.xhtml";
    }
    
}
