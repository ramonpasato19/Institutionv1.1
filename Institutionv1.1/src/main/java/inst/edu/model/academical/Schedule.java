package inst.edu.model.academical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author Hernan Morocho
 */
@Entity
@Table(name = "schedule")
public class Schedule {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private int scheduleId;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "name")
    private String name;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "schedule")    
    private String schedule;

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    
}
