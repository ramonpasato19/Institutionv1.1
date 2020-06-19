package inst.edu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para tipo de identification de persona
 */
@Entity
@Table(name = "type_identification")
public class TypeIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_identification_id")
	private int typeIdentificationId;

	@Size(min = 10, max = 10)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "name")
	private String name;

	public int getTypeIdentificationId() {
		return typeIdentificationId;
	}

	public void setTypeIdentificationId(int typeIdentificationId) {
		this.typeIdentificationId = typeIdentificationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
