/*
 * AbstractTaxPayer.java
 *
 * Created on September 24, 2007, 10:45 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity class AbstractTaxPayer
 * 
 * @author Soluziona
 */
@MappedSuperclass
public abstract class AbstractTaxPayer implements Serializable {

    //@Id    
    //@Column(name="TIN")
    //protected String taxIdNumber;
    //@Column(name="BRANCH_CODE")
    //protected String branchCode;
    @JoinColumn(name="RDO_CODE", referencedColumnName="RDO_CODE")
    protected RegionalDistrictOffice rdoCode;
    @Column(name="REGISTERED_NAME")
    protected String registeredName;
    @Column(name="CORPORATE_YN")
    protected Character corporateFlag;
    @Column(name="FIRST_NAME")
    protected String firstName;
    @Column(name="LAST_NAME")
    protected String lastName;
    @Column(name="MID_NAME")
    protected String middleName;
    @Column(name="STREET")
    protected String streetAddress;
    @Column(name="SUBSTREET")
    protected String subStreet;
    @Column(name="NUM")
    protected String telephoneNumber;
    @Column(name="CITY")
    protected String cityAddress;
    
    //@JoinColumn(name="CREATED_BY", referencedColumnName="USER_ID")
    //protected SystemUserBean createdBy;
    
    @Column(name="CREATED_BY")
    protected String createdBy;
    @Temporal(value = TemporalType.DATE)
    @Column(name="DATE_CREATED")
    protected Date dateCreated;
    //@JoinColumn(name="MODIFIED_BY", referencedColumnName="USER_ID")
    //protected SystemUserBean modifiedBy;
    
    @Column(name="MODIFIED_BY")
    private String modifiedBy;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name="DATE_MODIFIED")
    protected Date dateModified;
    
    
    
    
    /** Creates a new instance of AbstractTaxPayer */
    public AbstractTaxPayer() {
    }

    

    public RegionalDistrictOffice getRdoCode() {
        return rdoCode;
    }

    public void setRdoCode(RegionalDistrictOffice rdoCode) {
        this.rdoCode = rdoCode;
    }

    public String getRegisteredName() {
        if (registeredName == null) {
            registeredName = "";
        }
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        if (registeredName == null){
            registeredName = "";
        }
        this.registeredName = registeredName;
    }

    public Character getCorporateFlag() {
        return corporateFlag;
    }

    public void setCorporateFlag(Character corporateFlag) {
        this.corporateFlag = corporateFlag;
    }

    public String getFirstName() {
        if (firstName == null) {
            firstName = "";
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null){
            firstName = "";
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            lastName = "";
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null){
            lastName = "";
        }
        this.lastName = lastName;
    }

    public String getMiddleName() {
        if (middleName == null) {
            middleName = "";
        }
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName == null){
            middleName = "";
        }
        this.middleName = middleName;
    }

    public String getStreetAddress() {
        if (streetAddress == null) {
            streetAddress = "";
        }
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if (streetAddress == null){
            streetAddress = "";
        }
        this.streetAddress = streetAddress;
    }

    public String getSubStreet() {
        if (subStreet == null) {
            subStreet = "";
        }
        return subStreet;
    }

    public void setSubStreet(String subStreet) {
        if (subStreet == null){
            subStreet = "";
        }
        this.subStreet = subStreet;
    }

    public String getTelephoneNumber() {
        if (telephoneNumber == null) {
            telephoneNumber = "";
        }
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber == null){
            telephoneNumber = "";
        }
        this.telephoneNumber = telephoneNumber;
    }

    public String getCityAddress() {
        if (cityAddress == null) {
            cityAddress = "";
        }
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        if (cityAddress == null){
            cityAddress = "";
        }
        this.cityAddress = cityAddress;
    }

//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }

//    public SystemUserBean getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(SystemUserBean createdBy) {
//        this.setCreatedBy(createdBy);
//    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

//    public SystemUserBean getModifiedBy() {
//        return modifiedBy;
//    }
//
//    public void setModifiedBy(SystemUserBean modifiedBy) {
//        this.modifiedBy = modifiedBy;
//    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public void setCreatedBy(String createdBy) {
        if (createdBy == null){
            createdBy = "";
        }
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        if (createdBy == null) {
            createdBy = "";
        }
        return createdBy;
    }

    public String getModifiedBy() {
        if (modifiedBy == null) {
            modifiedBy = "";
        }
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        if (modifiedBy == null){
            modifiedBy = "";
        }
        this.modifiedBy = modifiedBy;
    }

}
