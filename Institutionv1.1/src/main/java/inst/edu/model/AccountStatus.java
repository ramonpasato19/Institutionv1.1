package inst.edu.model;

import java.io.Serializable;

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
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para crear una tabla estado de persona
 */
@Entity
@Table(name = "account_status")
public class AccountStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_status_id")
	private int accountStatusId;

	@Size(min = 10, max = 10)
	@Digits(fraction = 0, integer = 12)
	@Column(name = "name")
	private String name;

	public int getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
