package inst.edu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para crear una tabla inscripcion
 */
@Entity
@Table(name = "inscription")
public class Inscription implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inscription_id")
	private int inscriptionId;


	public int getInscriptionId() {
		return inscriptionId;
	}


	public void setInscriptionId(int inscriptionId) {
		this.inscriptionId = inscriptionId;
	}
	
	
}
