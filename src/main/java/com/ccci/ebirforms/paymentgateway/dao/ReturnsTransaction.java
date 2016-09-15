/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 15, 2016
 *  File: ReturnsTransaction.java
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
@Table(name = "RETURNS_TRANSACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReturnsTransaction.findAll", query = "SELECT r FROM ReturnsTransaction r"),
    @NamedQuery(name = "ReturnsTransaction.findById", query = "SELECT r FROM ReturnsTransaction r WHERE r.id = :id"),
    @NamedQuery(name = "ReturnsTransaction.findByReferenceNo", query = "SELECT r FROM ReturnsTransaction r WHERE r.referenceNo = :referenceNo"),
    @NamedQuery(name = "ReturnsTransaction.findByFormType", query = "SELECT r FROM ReturnsTransaction r WHERE r.formType = :formType"),
    @NamedQuery(name = "ReturnsTransaction.findByReturnPeriod", query = "SELECT r FROM ReturnsTransaction r WHERE r.returnPeriod = :returnPeriod"),
    @NamedQuery(name = "ReturnsTransaction.findByDueDate", query = "SELECT r FROM ReturnsTransaction r WHERE r.dueDate = :dueDate"),
    @NamedQuery(name = "ReturnsTransaction.findByDateSubmitted", query = "SELECT r FROM ReturnsTransaction r WHERE r.dateSubmitted = :dateSubmitted")})
public class ReturnsTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "REFERENCE_NO")
    private String referenceNo;
    @Size(max = 10)
    @Column(name = "FORM_TYPE")
    private String formType;
    @Column(name = "RETURN_PERIOD")
    @Temporal(TemporalType.DATE)
    private Date returnPeriod;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Column(name = "DATE_SUBMITTED")
    @Temporal(TemporalType.DATE)
    private Date dateSubmitted;

    public ReturnsTransaction() {
    }

    public ReturnsTransaction(Integer id) {
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

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public Date getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(Date returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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
        if (!(object instanceof ReturnsTransaction)) {
            return false;
        }
        ReturnsTransaction other = (ReturnsTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccci.ebirforms.paymentgateway.dao.ReturnsTransaction[ id=" + id + " ]";
    }
    
}
