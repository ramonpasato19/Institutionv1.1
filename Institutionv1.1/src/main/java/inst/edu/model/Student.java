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

import org.hibernate.validator.constraints.Email;

/**
 * @author Luis Ramon
 * @version 1.0.0 La entidad sirve para crear una tabla estudiante
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;

    @Email
    @Column(name = "email_institution")
	private String emailInstitution;
    
	@Column(name = "code_student")
	private String codeStudent;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEmailInstitution() {
		return emailInstitution;
	}

	public void setEmailInstitution(String emailInstitution) {
		this.emailInstitution = emailInstitution;
	}

	public String getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(String codeStudent) {
		this.codeStudent = codeStudent;
	}
	
    

}
