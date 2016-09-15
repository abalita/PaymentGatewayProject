/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 15, 2016
 *  File: PaymentTransaction.java
 *  Package: com.ccci.ebirforms.paymentgateway.dao
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
@Entity
@Table(name = "PAYMENT_TRANSACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentTransaction.findAll", query = "SELECT p FROM PaymentTransaction p"),
    @NamedQuery(name = "PaymentTransaction.findById", query = "SELECT p FROM PaymentTransaction p WHERE p.id = :id"),
    @NamedQuery(name = "PaymentTransaction.findByReferenceNo", query = "SELECT p FROM PaymentTransaction p WHERE p.referenceNo = :referenceNo"),
    @NamedQuery(name = "PaymentTransaction.findByConfirmationNo", query = "SELECT p FROM PaymentTransaction p WHERE p.confirmationNo = :confirmationNo"),
    @NamedQuery(name = "PaymentTransaction.findByTaxDue", query = "SELECT p FROM PaymentTransaction p WHERE p.taxDue = :taxDue"),
    @NamedQuery(name = "PaymentTransaction.findByAmountPaid", query = "SELECT p FROM PaymentTransaction p WHERE p.amountPaid = :amountPaid"),
    @NamedQuery(name = "PaymentTransaction.findByDatePaid", query = "SELECT p FROM PaymentTransaction p WHERE p.datePaid = :datePaid")})
public class PaymentTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 10)
    @Column(name = "REFERENCE_NO")
    private String referenceNo;
    @Size(max = 50)
    @Column(name = "CONFIRMATION_NO")
    private String confirmationNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAX_DUE")
    private Double taxDue;
    @Column(name = "AMOUNT_PAID")
    private Double amountPaid;
    @Column(name = "DATE_PAID")
    @Temporal(TemporalType.DATE)
    private Date datePaid;

    public PaymentTransaction() {
    }

    public PaymentTransaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getConfirmationNo() {
        return confirmationNo;
    }

    public void setConfirmationNo(String confirmationNo) {
        this.confirmationNo = confirmationNo;
    }

    public Double getTaxDue() {
        return taxDue;
    }

    public void setTaxDue(Double taxDue) {
        this.taxDue = taxDue;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentTransaction)) {
            return false;
        }
        PaymentTransaction other = (PaymentTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccci.ebirforms.paymentgateway.dao.PaymentTransaction[ id=" + id + " ]";
    }
    
}
