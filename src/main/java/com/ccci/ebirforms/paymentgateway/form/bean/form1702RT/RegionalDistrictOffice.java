/*
 * RegionalDistrictOffice.java
 *
 * Created on September 24, 2007, 1:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity class RegionalDistrictOffice
 * 
 * @author Soluziona
 */
@Entity
@Table(name="RDOS")
@NamedQueries(
    {
    @NamedQuery(name="GetAllRdos", query="SELECT Object(a) FROM RegionalDistrictOffice AS a ORDER BY a.rdoCode"),
    @NamedQuery(name="GetRdo",  query="SELECT Object(a) FROM RegionalDistrictOffice AS a where a.rdoCode = ?1 ORDER BY a.rdoCode")
    }
)
public class RegionalDistrictOffice implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RDO_CODE")
    private String rdoCode;
    @Column(name="RDO_NAME")
    private String rdoName;
    @Column(name="RDC_CODE")
    private String rdcCode;
    @Column(name="REGION_CODE")
    private String regionName;
    
    /** Creates a new instance of RegionalDistrictOffice */
    public RegionalDistrictOffice() {
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
     * Determines whether another object is equal to this RegionalDistrictOffice.  The result is 
     * <code>true</code> if and only if the argument is not null and is a RegionalDistrictOffice object that 
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    
    /*
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionalDistrictOffice)) {
            return false;
        }
        RegionalDistrictOffice other = (RegionalDistrictOffice)object;
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
        return "com.bir.gov.ph.efps.impl.sysuser.RegionalDistrictOffice[id=" + id + "]";
    }
     */

    public String getRdoCode() {
        return rdoCode;
    }

    public void setRdoCode(String rdoCode) {
        this.rdoCode = rdoCode;
    }

    public String getRdoName() {
        return rdoName;
    }

    public void setRdoName(String rdoName) {
        this.rdoName = rdoName;
    }

    public String getRdcCode() {
        return rdcCode;
    }

    public void setRdcCode(String rdcCode) {
        this.rdcCode = rdcCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
}
