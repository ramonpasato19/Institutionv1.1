package inst.edu.model.academical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hernan Morocho
 */
@Entity
@Table(name = "group_offer")
public class GroupOffer {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_offer_id")
    private int groupOfferId;
    
    
    

}
