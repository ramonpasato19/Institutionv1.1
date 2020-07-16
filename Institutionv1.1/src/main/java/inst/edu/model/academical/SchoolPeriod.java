/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.edu.model.academical;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ant76
 */
@Entity
@Table(name = "school_period")
public class SchoolPeriod {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_period_id")
    private int schoolPeriodId;
    
    private double valueQualification;
    private List<TypeQualification> typeQualification;
    private List<Enroll> enroll;
    private List<Schedule> schedule;
    private List<Subject> subject;

    public int getSchoolPeriodId() {
        return schoolPeriodId;
    }

    public void setSchoolPeriodId(int schoolPeriodId) {
        this.schoolPeriodId = schoolPeriodId;
    }

    public double getValueQualification() {
        return valueQualification;
    }

    public void setValueQualification(double valueQualification) {
        this.valueQualification = valueQualification;
    }

    public List<TypeQualification> getTypeQualification() {
        return typeQualification;
    }

    public void setTypeQualification(List<TypeQualification> typeQualification) {
        this.typeQualification = typeQualification;
    }

    public List<Enroll> getEnroll() {
        return enroll;
    }

    public void setEnroll(List<Enroll> enroll) {
        this.enroll = enroll;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
    
}
