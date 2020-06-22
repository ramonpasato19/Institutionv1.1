package inst.edu.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para crear una tabla persona
 */
@Entity
@Table(name = "person", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int personId;

	@Size(min = 10, max = 10)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "identification")
	private String identification;
		
	@Size(min = 10, max = 10)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "name")
	private String name;
	
	@Size(min = 10, max = 10)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "date_birth")
	private Date dateBirth;
	
    @Email
    @Column(name = "email")
	private String email;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
    
    
}
