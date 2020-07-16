/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.edu.model.accounting;

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
@Table(name = "book_account")
public class BookAccount {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_account_id")
    private int bookAccountId;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "name")
    private String name;

    @Size(min = 10, max = 10)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "code")
    private String code;

    public int getBookAccountId() {
        return bookAccountId;
    }

    public void setBookAccountId(int bookAccountId) {
        this.bookAccountId = bookAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    

}
