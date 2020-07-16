package inst.edu.model.academical;

import java.util.Date;
import java.util.List;
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
@Table(name = "enroll")
public class Enroll {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enroll_id")
    private int enrollId;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "period")
    private String period;

    private List<GroupOffer> groupOffer;
    private Date dateEnroll;

    public int getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(int enrollId) {
        this.enrollId = enrollId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public List<GroupOffer> getGroupOffer() {
        return groupOffer;
    }

    public void setGroupOffer(List<GroupOffer> groupOffer) {
        this.groupOffer = groupOffer;
    }

    public Date getDateEnroll() {
        return dateEnroll;
    }

    public void setDateEnroll(Date dateEnroll) {
        this.dateEnroll = dateEnroll;
    }

}
