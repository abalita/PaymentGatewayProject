package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExternalAuditorAccreditedTaxAgentBean implements Serializable {

    public ExternalAuditorAccreditedTaxAgentBean() {
    }

    public ExternalAuditorAccreditedTaxAgentBean(
            String nameOfExternalAuditor,
            String externalAuditorTIN,
            String nameOfSigningPartner,
            String signingPartnerTIN,
            String birAccreditationNumber,
            Date isssueDate,
            Date expiryDate,
            String accreditedTaxAgentBranchCode,
            String signingPartnerBranchCode
    ) {
        this.nameOfExternalAuditor = nameOfExternalAuditor;
        this.externalAuditorTIN = externalAuditorTIN;
        this.nameOfSigningPartner = nameOfSigningPartner;
        this.signingPartnerTIN = signingPartnerTIN;
        this.birAccreditationNumber = birAccreditationNumber;
        this.isssueDate = isssueDate;
        this.expiryDate = expiryDate;
        this.accreditedTaxAgentBranchCode = accreditedTaxAgentBranchCode;
        this.signingPartnerBranchCode = signingPartnerBranchCode;
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String nameOfExternalAuditor;
    private String externalAuditorTIN;
    private String nameOfSigningPartner;
    private String signingPartnerTIN;
    private String birAccreditationNumber;
    private Date isssueDate;
    private Date expiryDate;

    //1701
    private String accreditedTaxAgentBranchCode;
    private String signingPartnerBranchCode;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getNameOfExternalAuditor() {
        return nameOfExternalAuditor;
    }

    public void setNameOfExternalAuditor(String nameOfExternalAuditor) {
        this.nameOfExternalAuditor = nameOfExternalAuditor;
    }

    public String getExternalAuditorTIN() {
        return externalAuditorTIN;
    }

    public void setExternalAuditorTIN(String externalAuditorTIN) {
        this.externalAuditorTIN = externalAuditorTIN;
    }

    public String getNameOfSigningPartner() {
        return nameOfSigningPartner;
    }

    public void setNameOfSigningPartner(String nameOfSigningPartner) {
        this.nameOfSigningPartner = nameOfSigningPartner;
    }

    public String getSigningPartnerTIN() {
        return signingPartnerTIN;
    }

    public void setSigningPartnerTIN(String signingPartnerTIN) {
        this.signingPartnerTIN = signingPartnerTIN;
    }

    public String getBirAccreditationNumber() {
        return birAccreditationNumber;
    }

    public void setBirAccreditationNumber(String birAccreditationNumber) {
        this.birAccreditationNumber = birAccreditationNumber;
    }

    public Date getIsssueDate() {
        return isssueDate;
    }

    public void setIsssueDate(Date isssueDate) {
        this.isssueDate = isssueDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the accreditedTaxAgentBranchCode
     */
    public String getAccreditedTaxAgentBranchCode() {
        return accreditedTaxAgentBranchCode;
    }

    /**
     * @param accreditedTaxAgentBranchCode the accreditedTaxAgentBranchCode to
     * set
     */
    public void setAccreditedTaxAgentBranchCode(String accreditedTaxAgentBranchCode) {
        this.accreditedTaxAgentBranchCode = accreditedTaxAgentBranchCode;
    }

    /**
     * @return the signingPartnerBranchCode
     */
    public String getSigningPartnerBranchCode() {
        return signingPartnerBranchCode;
    }

    /**
     * @param signingPartnerBranchCode the signingPartnerBranchCode to set
     */
    public void setSigningPartnerBranchCode(String signingPartnerBranchCode) {
        this.signingPartnerBranchCode = signingPartnerBranchCode;
    }

}
