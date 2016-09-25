/*
 * RegisteredTaxPayerBean.java
 *
 * Created on September 24, 2007, 11:45 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Entity class RegisteredTaxPayerBean
 * 
 * @author Soluziona
 */
@Entity
@Table(name = "REGISTRATION")
@NamedQueries({
@NamedQuery(name = "getRdo", query = "SELECT Object(a) FROM RegisteredTaxPayerBean AS a " +
"WHERE a.registrationPK.taxIdNumber = :tin AND a.registrationPK.branchCode = :branchcode"),
@NamedQuery(name = "getRegistrationFields", query = "SELECT Object(a) FROM RegisteredTaxPayerBean AS a " +
"WHERE a.registrationPK.taxIdNumber = :tin AND a.registrationPK.branchCode = :branchcode")
})
public class RegisteredTaxPayerBean extends AbstractTaxPayer implements Serializable {

    
	private static final long serialVersionUID = 1L;
	@EmbeddedId
    private RegistrationPK registrationPK;
    @Column(name = "INDTYP_CODE")
    private String industryTypeCode;
    @Column(name = "INDTYP_MIT_CODE")
    private String industryTypeMitCode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "BARANGAY")
    private String barangayAddress;
    @Column(name = "DISTRICT")
    private String districtAddress;
    @Column(name = "DATE_REGISTERED")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Column(name = "EXTYPE_CODE")
    private String exemptionTypeCode;
    @Column(name = "CODE")
    private String subCode;
    @Column(name = "CTYPE_CODE")
    private String cTypeCode;
    @Column(name = "GTYPE_CODE")
    private String gTypeCode;
    //@JoinColumn(name="SPOUSE_TIN", referencedColumnName="TIN")
    //private RegisteredTaxPayerBean spouseTaxPayer;
    @Column(name = "SPOUSE_TIN")
    private String spouseTaxPayer;
    @Column(name = "START_MONTH")
    private int startMonth;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "ORGANIZATION_DATE")
    private Date incorporationDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "SPOUSE_BRANCH_CODE")
    private String spouseBranchCode;
    @Transient
    private String tinPart1;
    @Transient
    private String tinPart2;
    @Transient
    private String tinPart3;
    @Transient
    private String registeredAddress;

    /** Creates a new instance of RegisteredTaxPayerBean */
    public RegisteredTaxPayerBean() {
        setRegistrationPK(new RegistrationPK());
        industryTypeCode = "";
        industryTypeMitCode = "";
        description = "";
        barangayAddress = "";
        districtAddress = "";
        dateRegistered = null;
        exemptionTypeCode = "";
        subCode = "";
        cTypeCode = "";
        gTypeCode = "";
        spouseTaxPayer = "";
        startMonth = 0;
        incorporationDate = null;
        birthDate = null;
        zipCode = "";
        sex = "";
        spouseBranchCode = "";
        tinPart1 = "";
        tinPart2 = "";
        tinPart3 = "";
        registeredAddress = "";
    }

    /**
     * Returns a hash code value for the object.  This implementation computes 
     * a hash code value based on the id fields in this object.
     * @return a hash code value for this object.
     */
    /*
    @Override
    public int hashCode() {
    int hash = 0;
    hash += (this.id != null ? this.id.hashCode() : 0);
    return hash;
    }
     */
    /**
     * Determines whether another object is equal to this RegisteredTaxPayerBean.  The result is 
     * <code>true</code> if and only if the argument is not null and is a RegisteredTaxPayerBean object that 
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    /*
    @Override
    public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof RegisteredTaxPayerBean)) {
    return false;
    }
    RegisteredTaxPayerBean other = (RegisteredTaxPayerBean)object;
    if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) return false;
    return true;
    }
     */
    /**
     * Returns a string representation of the object.  This implementation constructs 
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    /*
    @Override
    public String toString() {
    return "com.bir.gov.ph.efps.impl.sysuser.RegisteredTaxPayerBean[id=" + id + "]";
    }
     */
    public String getIndustryTypeCode() {
        if (industryTypeCode == null) {
            industryTypeCode = "";
        }
        return industryTypeCode;
    }

    public void setIndustryTypeCode(String industryTypeCode) {
        if (industryTypeCode == null){
            industryTypeCode = "";
        }
        this.industryTypeCode = industryTypeCode;
    }

    public String getIndustryTypeMitCode() {
        if (industryTypeMitCode == null) {
            industryTypeMitCode = "";
        }
        return industryTypeMitCode;
    }

    public void setIndustryTypeMitCode(String industryTypeMitCode) {
        if (industryTypeMitCode == null){
            industryTypeMitCode = "";
        }
        this.industryTypeMitCode = industryTypeMitCode;
    }

    public String getDescription() {
        if (description == null) {
            description = "";
        }
        return description;
    }

    public void setDescription(String description) {
        if (description == null){
            description = "";
        }
        this.description = description;
    }

    public String getBarangayAddress() {
        if (barangayAddress == null) {
            barangayAddress = "";
        }
        return barangayAddress;
    }

    public void setBarangayAddress(String barangayAddress) {
        if (barangayAddress == null){
            barangayAddress = "";
        }
        this.barangayAddress = barangayAddress;
    }

    public String getDistrictAddress() {
        if (districtAddress == null) {
            districtAddress = "";
        }
        return districtAddress;
    }

    public void setDistrictAddress(String districtAddress) {
        if (districtAddress == null){
            districtAddress = "";
        }
        this.districtAddress = districtAddress;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getExemptionTypeCode() {
        if (exemptionTypeCode == null) {
            exemptionTypeCode = "";
        }
        return exemptionTypeCode;
    }

    public void setExemptionTypeCode(String exemptionTypeCode) {
        if (exemptionTypeCode == null){
            exemptionTypeCode= "";
        }
        this.exemptionTypeCode = exemptionTypeCode;
    }

    public String getSubCode() {
        if (subCode == null) {
            subCode = "";
        }
        return subCode;
    }

    public void setSubCode(String subCode) {
        if (subCode == null){
            subCode = "";
        }
        this.subCode = subCode;
    }

    public String getCTypeCode() {
        if (cTypeCode == null) {
            cTypeCode = "";
        }
        return cTypeCode;
    }

    public void setCTypeCode(String cTypeCode) {
        if (cTypeCode == null){
            cTypeCode = "";
        }
        this.cTypeCode = cTypeCode;
    }

    public String getGTypeCode() {
        if (gTypeCode == null) {
            gTypeCode = "";
        }
        return gTypeCode;
    }

    public void setGTypeCode(String gTypeCode) {
        if (gTypeCode == null){
            gTypeCode = "";
        }
        this.gTypeCode = gTypeCode;
    }

//    public RegisteredTaxPayerBean getSpouseTaxPayer() {
//        return spouseTaxPayer;
//    }
//
//    public void setSpouseTaxPayer(RegisteredTaxPayerBean spouseTaxPayer) {
//        this.spouseTaxPayer = spouseTaxPayer;
//    }
    public int getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    public Date getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(Date incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpouseTaxPayer() {
        if (spouseTaxPayer == null) {
            spouseTaxPayer = "";
        }
        return spouseTaxPayer;
    }

    public void setSpouseTaxPayer(String spouseTaxPayer) {
        if (spouseTaxPayer == null){
            spouseTaxPayer = "";
        }
        this.spouseTaxPayer = spouseTaxPayer;
    }

    public String getZipCode() {
        if (zipCode == null) {
            zipCode = "";
        }
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null){
            zipCode = "";
        }
        this.zipCode = zipCode;
    }

    public String getSex() {
        if (sex == null) {
            sex = "";
        }
        return sex;
    }

    public void setSex(String sex) {
        if (sex == null){
            sex = "";
        }
        this.sex = sex;
    }

    public String getSpouseBranchCode() {
        if (spouseBranchCode == null) {
            spouseBranchCode = "";
        }
        return spouseBranchCode;
    }

    public void setSpouseBranchCode(String spouseBranchCode) {
        if (spouseBranchCode == null){
            spouseBranchCode = "";
        }
        this.spouseBranchCode = spouseBranchCode;
    }

    public RegistrationPK getRegistrationPK() {
        return registrationPK;
    }

    public void setRegistrationPK(RegistrationPK registrationPK) {
        this.registrationPK = registrationPK;
    }

    public String getTinPart1() {
        if (getRegistrationPK().getTaxIdNumber() != null && !getRegistrationPK().getTaxIdNumber().equalsIgnoreCase("")) {
            tinPart1 = getRegistrationPK().getTaxIdNumber().substring(0, 3);
        } else {
            tinPart1 = "";
        }
        return tinPart1;
    }

    public void setTinPart1(String tinPart1) {
        
        //getRegistrationPK().setTaxIdNumber(tinPart1 + tinPart2 + tinPart3);
        this.tinPart1 = tinPart1;
    }

    public String getTinPart2() {
        if (getRegistrationPK().getTaxIdNumber() != null && !getRegistrationPK().getTaxIdNumber().equalsIgnoreCase("")) {
            tinPart2 = getRegistrationPK().getTaxIdNumber().substring(3, 6);
        } else {
            tinPart2 = "";
        }
        return tinPart2;
    }

    public void setTinPart2(String tinPart2) {
        
        //getRegistrationPK().setTaxIdNumber(tinPart1 + tinPart2 + tinPart3);
        this.tinPart2 = tinPart2;
    }

    public String getTinPart3() {
        if (getRegistrationPK().getTaxIdNumber() != null && !getRegistrationPK().getTaxIdNumber().equalsIgnoreCase("")) {
            tinPart3 = getRegistrationPK().getTaxIdNumber().substring(6);
        } else {
            tinPart3 = "";
        }
        return tinPart3;
    }

    public void setTinPart3(String tinPart3) {
        //getRegistrationPK().setTaxIdNumber(tinPart1 + tinPart2 + tinPart3);
        this.tinPart3 = tinPart3;
    }

    public String getRegisteredAddress() {
        registeredAddress = (getSubStreet() +
                " " + getStreetAddress() +
                " " + getBarangayAddress() +
                " " + getCityAddress());
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }
}
