/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.edu.model.accounting;

import java.util.List;
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
@Table(name = "account")
public class Account {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accountId;
    
    private List<CategoryAccount> categoryAccount;
    private List<AccountStatus> accountStatus;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public List<CategoryAccount> getCategoryAccount() {
        return categoryAccount;
    }

    public void setCategoryAccount(List<CategoryAccount> categoryAccount) {
        this.categoryAccount = categoryAccount;
    }

    public List<AccountStatus> getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(List<AccountStatus> accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    
    

}
