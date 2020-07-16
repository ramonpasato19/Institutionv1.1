/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.edu.model.administrative;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author Hernan Morocho
 */
@Entity
@Table(name = "person_status")
public class PersonStatus {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_status_id")
    private int personStatusId;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "name")
    private String name;

    public int getPersonStatusId() {
        return personStatusId;
    }

    public void setPersonStatusId(int personStatusId) {
        this.personStatusId = personStatusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
