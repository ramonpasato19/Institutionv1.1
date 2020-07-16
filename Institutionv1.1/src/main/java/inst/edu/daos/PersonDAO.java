/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.edu.daos;

import inst.edu.model.administrative.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hernan Morocho
 */
@Stateless
public class PersonDAO {

    @PersistenceContext(name = "java:jboss/datasources/sgaDS")
    private EntityManager em;

    public void savePerson(Person p) {
        em.persist(p);
    }

    public void update(Person persona) {
        em.merge(persona);
    }

}
