/**
 *
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TotalTaxPayableBean implements Serializable {

    public TotalTaxPayableBean() {
    }

    public TotalTaxPayableBean(
            long totalIncomeTaxDue,
            long totalTaxCredits,
            long totalPenalties,
            long netTaxPayable,
            long taxFilerTaxDue,
            long taxFilerSpouseTaxDue,
            long taxFilerCredits,
            long taxFilerSpouseCredits,
            long portionOfTaxPayableAllowed,
            long totalAmountPayableUponFilling,
            long totalFinalTaxWithheld,
            long totalTaxPayable,
            Double netAmountTaxPayable,
            String communityTaxCertificate,
            Date dateOfIssue,
            String placeOfIssue,
            String amountIfCTC,
            String overPayment,
            long totalAmountPayable,
            long totalIncomeReceiptsExemptFromIncomeTax
    ) {
        this.totalIncomeTaxDue = totalIncomeTaxDue;
        this.totalTaxCredits = totalTaxCredits;
        this.totalPenalties = totalPenalties;
        this.netTaxPayable = netTaxPayable;
        this.taxFilerTaxDue = taxFilerTaxDue;
        this.taxFilerSpouseTaxDue = taxFilerSpouseTaxDue;
        this.taxFilerCredits = taxFilerCredits;
        this.taxFilerSpouseCredits = taxFilerSpouseCredits;
        this.portionOfTaxPayableAllowed = portionOfTaxPayableAllowed;
        this.totalAmountPayableUponFilling = totalAmountPayableUponFilling;
        this.totalFinalTaxWithheld = totalFinalTaxWithheld;
        this.totalTaxPayable = totalTaxPayable;
        this.netAmountTaxPayable = netAmountTaxPayable;
        this.communityTaxCertificate = communityTaxCertificate;
        this.dateOfIssue = dateOfIssue;
        this.placeOfIssue = placeOfIssue;
        this. amountIfCTC = amountIfCTC;
        this.overPayment = overPayment;
        this.totalAmountPayable = totalAmountPayable;
        this.totalIncomeReceiptsExemptFromIncomeTax = totalIncomeReceiptsExemptFromIncomeTax;

    }

    private static final long serialVersionUID = 1L;

    //common
    private long totalIncomeTaxDue;
    private long totalPenalties;
    private long netTaxPayable;

    //This is used for 1700
    private long taxFilerTaxDue;
    private long taxFilerSpouseTaxDue;
    private long taxFilerCredits;
    private long taxFilerSpouseCredits;
    private long portionOfTaxPayableAllowed;
    private long totalAmountPayableUponFilling;
    private long totalFinalTaxWithheld;

    //for 1701
    private long totalTaxCredits; //MX , RT
    private long totalTaxPayable;
    private Double netAmountTaxPayable;
    private String communityTaxCertificate;
    private Date dateOfIssue;
    private String placeOfIssue;
    private String amountIfCTC;
    private String overPayment;
    //for 1702
    private long totalAmountPayable;
    private long totalIncomeReceiptsExemptFromIncomeTax;

    // for 1702MX
    private String ctcSecType;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * @return the ctcSecType
     */
    public String getCtcSecType() {
        return ctcSecType;
    }

    /**
     * @param ctcSecType the ctcSecType to set
     */
    public void setCtcSecType(String ctcSecType) {
        this.ctcSecType = ctcSecType;
    }

    /**
     * @return the taxFilerTaxDue
     */
    public long getTaxFilerTaxDue() {
        return taxFilerTaxDue;
    }

    /**
     * @param taxFilerTaxDue the taxFilerTaxDue to set
     */
    public void setTaxFilerTaxDue(long taxFilerTaxDue) {
        this.taxFilerTaxDue = taxFilerTaxDue;
    }

    /**
     * @return the taxFilerSpouseTaxDue
     */
    public long getTaxFilerSpouseTaxDue() {
        return taxFilerSpouseTaxDue;
    }

    /**
     * @param taxFilerSpouseTaxDue the taxFilerSpouseTaxDue to set
     */
    public void setTaxFilerSpouseTaxDue(long taxFilerSpouseTaxDue) {
        this.taxFilerSpouseTaxDue = taxFilerSpouseTaxDue;
    }

    /**
     * @return the totalIncomeTaxDue
     */
    public long getTotalIncomeTaxDue() {
        return totalIncomeTaxDue;
    }

    /**
     * @param totalIncomeTaxDue the totalIncomeTaxDue to set
     */
    public void setTotalIncomeTaxDue(long totalIncomeTaxDue) {
        this.totalIncomeTaxDue = totalIncomeTaxDue;
    }

    /**
     * @return the taxFilerCredits
     */
    public long getTaxFilerCredits() {
        return taxFilerCredits;
    }

    /**
     * @param taxFilerCredits the taxFilerCredits to set
     */
    public void setTaxFilerCredits(long taxFilerCredits) {
        this.taxFilerCredits = taxFilerCredits;
    }

    /**
     * @return the taxFilerSpouseCredits
     */
    public long getTaxFilerSpouseCredits() {
        return taxFilerSpouseCredits;
    }

    /**
     * @param taxFilerSpouseCredits the taxFilerSpouseCredits to set
     */
    public void setTaxFilerSpouseCredits(long taxFilerSpouseCredits) {
        this.taxFilerSpouseCredits = taxFilerSpouseCredits;
    }

    /**
     * @return the netTaxPayable
     */
    public long getNetTaxPayable() {
        return netTaxPayable;
    }

    /**
     * @param netTaxPayable the netTaxPayable to set
     */
    public void setNetTaxPayable(long netTaxPayable) {
        this.netTaxPayable = netTaxPayable;
    }

    /**
     * @return the portionOfTaxPayableAllowed
     */
    public long getPortionOfTaxPayableAllowed() {
        return portionOfTaxPayableAllowed;
    }

    /**
     * @param portionOfTaxPayableAllowed the portionOfTaxPayableAllowed to set
     */
    public void setPortionOfTaxPayableAllowed(long portionOfTaxPayableAllowed) {
        this.portionOfTaxPayableAllowed = portionOfTaxPayableAllowed;
    }

    /**
     * @return the totalPenalties
     */
    public long getTotalPenalties() {
        return totalPenalties;
    }

    /**
     * @param totalPenalties the totalPenalties to set
     */
    public void setTotalPenalties(long totalPenalties) {
        this.totalPenalties = totalPenalties;
    }

    /**
     * @return the totalAmountPayableUponFilling
     */
    public long getTotalAmountPayableUponFilling() {
        return totalAmountPayableUponFilling;
    }

    /**
     * @param totalAmountPayableUponFilling the totalAmountPayableUponFilling to
     * set
     */
    public void setTotalAmountPayableUponFilling(long totalAmountPayableUponFilling) {
        this.totalAmountPayableUponFilling = totalAmountPayableUponFilling;
    }

    /**
     * @return the totalTaxCredits
     */
    public long getTotalTaxCredits() {
        return totalTaxCredits;
    }

    /**
     * @param totalTaxCredits the totalTaxCredits to set
     */
    public void setTotalTaxCredits(long totalTaxCredits) {
        this.totalTaxCredits = totalTaxCredits;
    }

    /**
     * @return the totalTaxPayable
     */
    public long getTotalTaxPayable() {
        return totalTaxPayable;
    }

    /**
     * @param totalTaxPayable the totalTaxPayable to set
     */
    public void setTotalTaxPayable(long totalTaxPayable) {
        this.totalTaxPayable = totalTaxPayable;
    }

    /**
     * @return the totalFinalTaxWithheld
     */
    public long getTotalFinalTaxWithheld() {
        return totalFinalTaxWithheld;
    }

    /**
     * @param totalFinalTaxWithheld the totalFinalTaxWithheld to set
     */
    public void setTotalFinalTaxWithheld(long totalFinalTaxWithheld) {
        this.totalFinalTaxWithheld = totalFinalTaxWithheld;
    }

    /**
     * @return the totalAmountPayable
     */
    public long getTotalAmountPayable() {
        return totalAmountPayable;
    }

    /**
     * @param totalAmountPayable the totalAmountPayable to set
     */
    public void setTotalAmountPayable(long totalAmountPayable) {
        this.totalAmountPayable = totalAmountPayable;
    }

    /**
     * @return the totalIncomeReceiptsExemptFromIncomeTax
     */
    public long getTotalIncomeReceiptsExemptFromIncomeTax() {
        return totalIncomeReceiptsExemptFromIncomeTax;
    }

    /**
     * @param totalIncomeReceiptsExemptFromIncomeTax the
     * totalIncomeReceiptsExemptFromIncomeTax to set
     */
    public void setTotalIncomeReceiptsExemptFromIncomeTax(
            long totalIncomeReceiptsExemptFromIncomeTax) {
        this.totalIncomeReceiptsExemptFromIncomeTax = totalIncomeReceiptsExemptFromIncomeTax;
    }

    /**
     * @return the communityTaxCertificate
     */
    public String getCommunityTaxCertificate() {
        return communityTaxCertificate;
    }

    /**
     * @param communityTaxCertificate the communityTaxCertificate to set
     */
    public void setCommunityTaxCertificate(String communityTaxCertificate) {
        this.communityTaxCertificate = communityTaxCertificate;
    }

    /**
     * @return the dateOfIssue
     */
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * @param dateOfIssue the dateOfIssue to set
     */
    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /**
     * @return the placeOfIssue
     */
    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    /**
     * @param placeOfIssue the placeOfIssue to set
     */
    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    /**
     * @return the amountIfCTC
     */
    public String getAmountIfCTC() {
        return amountIfCTC;
    }

    /**
     * @param amountIfCTC the amountIfCTC to set
     */
    public void setAmountIfCTC(String amountIfCTC) {
        this.amountIfCTC = amountIfCTC;
    }

    /**
     * @return the netAmountTaxPayable
     */
    public Double getNetAmountTaxPayable() {
        return netAmountTaxPayable;
    }

    /**
     * @param netAmountTaxPayable the netAmountTaxPayable to set
     */
    public void setNetAmountTaxPayable(Double netAmountTaxPayable) {
        this.netAmountTaxPayable = netAmountTaxPayable;
    }

    /**
     * @return the overPayment
     */
    public String getOverPayment() {
        return overPayment;
    }

    /**
     * @param overPayment the overPayment to set
     */
    public void setOverPayment(String overPayment) {
        this.overPayment = overPayment;
    }

}
