/*
 * RegistrationPK.java
 *
 * Created on November 6, 2007, 10:47 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 *
 * @author Administrator
 */
@Embeddable
public class RegistrationPK implements Serializable{
    
	private static final long serialVersionUID = 1L;
	@Column(name="TIN")
    protected String taxIdNumber;    
    @Column(name="BRANCH_CODE")
    protected String branchCode;
    
    /** Creates a new instance of RegistrationPK */
    public RegistrationPK() {
        taxIdNumber = "";
        branchCode = "";
    }

    public String getTaxIdNumber() {
        if (taxIdNumber == null) {
            taxIdNumber = "";
        }
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        if (taxIdNumber == null){
            taxIdNumber = "";
        }
        this.taxIdNumber = taxIdNumber;
    }

    public String getBranchCode() {
        if (branchCode == null) {
            branchCode = "";
        }
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        if (branchCode == null){
            branchCode = "";
        }
        this.branchCode = branchCode;
    }
    
    
}
