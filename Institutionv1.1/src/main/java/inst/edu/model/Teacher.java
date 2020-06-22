package inst.edu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

/**
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para crear una tabla docente
 */
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private int teacherId;

    @Email
    @Column(name = "email_institution")
	private String emailInstitution;
    
	@Column(name = "code_teacher")
	private String codeTeacher;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getEmailInstitution() {
		return emailInstitution;
	}

	public void setEmailInstitution(String emailInstitution) {
		this.emailInstitution = emailInstitution;
	}

	public String getCodeTeacher() {
		return codeTeacher;
	}

	public void setCodeTeacher(String codeTeacher) {
		this.codeTeacher = codeTeacher;
	}
	
	

}
