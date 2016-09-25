package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxCreditsPaymentsBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private long referenceId;
    private long priorYearsExcessCreditsOtherThanMCIT;
    private long incomeTaxPaymentUnderMCIT;
    private long incomeTaxPaymentUnderRegularRate;
    private long excessMCIT;
    private long creditableTaxWithheldFromPrevQuarters;
    private long creditableTaxWithheldFromTheFourthQuarter;
    private long foreignTaxCredits;
    private long taxPaidInReturn;
    private long incomeTaxPaymentUnderSpecialRate;
    private long sched7SpecialTaxCredits;
    private String otherCreditsPaymentsDescription1;
    private long otherCreditsPaymentsAmount1;
    private String otherCreditsPaymentsDescription2;
    private long otherCreditsPaymentsAmount2;
    private List<OtherCreditsBean> otherCreditsBean;
    private List<ExpandableOther> expandableOtherBean;

    private long totalTaxCreditsPayments;

    public TaxCreditsPaymentsBean() {
    }

    public TaxCreditsPaymentsBean(
            long priorYearsExcessCreditsOtherThanMCIT,
            long incomeTaxPaymentUnderMCIT,
            long incomeTaxPaymentUnderRegularRate,
            long excessMCIT,
            long creditableTaxWithheldFromPrevQuarters,
            long creditableTaxWithheldFromTheFourthQuarter,
            long foreignTaxCredits,
            long taxPaidInReturn,
            long sched7SpecialTaxCredits
    ) {
        this.priorYearsExcessCreditsOtherThanMCIT = priorYearsExcessCreditsOtherThanMCIT;
        this.incomeTaxPaymentUnderMCIT = incomeTaxPaymentUnderMCIT;
        this.incomeTaxPaymentUnderRegularRate = incomeTaxPaymentUnderRegularRate;
        this.excessMCIT = excessMCIT;
        this.creditableTaxWithheldFromPrevQuarters = creditableTaxWithheldFromPrevQuarters;
        this.creditableTaxWithheldFromTheFourthQuarter = creditableTaxWithheldFromTheFourthQuarter;
        this.foreignTaxCredits = foreignTaxCredits;
        this.taxPaidInReturn = taxPaidInReturn;
        this.sched7SpecialTaxCredits = sched7SpecialTaxCredits;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(long referenceId) {
        this.referenceId = referenceId;
    }

    public long getPriorYearsExcessCreditsOtherThanMCIT() {
        return priorYearsExcessCreditsOtherThanMCIT;
    }

    public void setPriorYearsExcessCreditsOtherThanMCIT(
            long priorYearsExcessCreditsOtherThanMCIT) {
        this.priorYearsExcessCreditsOtherThanMCIT = priorYearsExcessCreditsOtherThanMCIT;
    }

    public long getIncomeTaxPaymentUnderMCIT() {
        return incomeTaxPaymentUnderMCIT;
    }

    public void setIncomeTaxPaymentUnderMCIT(long incomeTaxPaymentUnderMCIT) {
        this.incomeTaxPaymentUnderMCIT = incomeTaxPaymentUnderMCIT;
    }

    public long getIncomeTaxPaymentUnderRegularRate() {
        return incomeTaxPaymentUnderRegularRate;
    }

    public void setIncomeTaxPaymentUnderRegularRate(
            long incomeTaxPaymentUnderRegularRate) {
        this.incomeTaxPaymentUnderRegularRate = incomeTaxPaymentUnderRegularRate;
    }

    public long getExcessMCIT() {
        return excessMCIT;
    }

    public void setExcessMCIT(long excessMCIT) {
        this.excessMCIT = excessMCIT;
    }

    public long getCreditableTaxWithheldFromPrevQuarters() {
        return creditableTaxWithheldFromPrevQuarters;
    }

    public void setCreditableTaxWithheldFromPrevQuarters(
            long creditableTaxWithheldFromPrevQuarters) {
        this.creditableTaxWithheldFromPrevQuarters = creditableTaxWithheldFromPrevQuarters;
    }

    public long getCreditableTaxWithheldFromTheFourthQuarter() {
        return creditableTaxWithheldFromTheFourthQuarter;
    }

    public void setCreditableTaxWithheldFromTheFourthQuarter(
            long creditableTaxWithheldFromTheFourthQuarter) {
        this.creditableTaxWithheldFromTheFourthQuarter = creditableTaxWithheldFromTheFourthQuarter;
    }

    public long getForeignTaxCredits() {
        return foreignTaxCredits;
    }

    public void setForeignTaxCredits(long foreignTaxCredits) {
        this.foreignTaxCredits = foreignTaxCredits;
    }

    public long getTaxPaidInReturn() {
        return taxPaidInReturn;
    }

    public void setTaxPaidInReturn(long taxPaidInReturn) {
        this.taxPaidInReturn = taxPaidInReturn;
    }

    public long getSched7SpecialTaxCredits() {
        return sched7SpecialTaxCredits;
    }

    public void setSched7SpecialTaxCredits(long sched7SpecialTaxCredits) {
        this.sched7SpecialTaxCredits = sched7SpecialTaxCredits;
    }

    public String getOtherCreditsPaymentsDescription1() {
        return otherCreditsPaymentsDescription1;
    }

    public void setOtherCreditsPaymentsDescription1(
            String otherCreditsPaymentsDescription1) {
        this.otherCreditsPaymentsDescription1 = otherCreditsPaymentsDescription1;
    }

    public long getOtherCreditsPaymentsAmount1() {
        return otherCreditsPaymentsAmount1;
    }

    public void setOtherCreditsPaymentsAmount1(long otherCreditsPaymentsAmount1) {
        this.otherCreditsPaymentsAmount1 = otherCreditsPaymentsAmount1;
    }

    public String getOtherCreditsPaymentsDescription2() {
        return otherCreditsPaymentsDescription2;
    }

    public void setOtherCreditsPaymentsDescription2(
            String otherCreditsPaymentsDescription2) {
        this.otherCreditsPaymentsDescription2 = otherCreditsPaymentsDescription2;
    }

    public long getOtherCreditsPaymentsAmount2() {
        return otherCreditsPaymentsAmount2;
    }

    public void setOtherCreditsPaymentsAmount2(long otherCreditsPaymentsAmount2) {
        this.otherCreditsPaymentsAmount2 = otherCreditsPaymentsAmount2;
    }

    public long getTotalTaxCreditsPayments() {
        return totalTaxCreditsPayments;
    }

    public void setTotalTaxCreditsPayments(long totalTaxCreditsPayments) {
        this.totalTaxCreditsPayments = totalTaxCreditsPayments;
    }

    /**
     * @return the incomeTaxPaymentUnderSpecialRate
     */
    public long getIncomeTaxPaymentUnderSpecialRate() {
        return incomeTaxPaymentUnderSpecialRate;
    }

    /**
     * @param incomeTaxPaymentUnderSpecialRate the
     * incomeTaxPaymentUnderSpecialRate to set
     */
    public void setIncomeTaxPaymentUnderSpecialRate(
            long incomeTaxPaymentUnderSpecialRate) {
        this.incomeTaxPaymentUnderSpecialRate = incomeTaxPaymentUnderSpecialRate;
    }

    /**
     * @return the otherCreditsBean
     */
    public List<OtherCreditsBean> getOtherCreditsBean() {
        return otherCreditsBean;
    }

    /**
     * @param otherCreditsBean the otherCreditsBean to set
     */
    public void setOtherCreditsBean(List<OtherCreditsBean> otherCreditsBean) {
        this.otherCreditsBean = otherCreditsBean;
    }

    /**
     * @return the expandableOtherBean
     */
    public List<ExpandableOther> getExpandableOtherBean() {
        return expandableOtherBean;
    }

    /**
     * @param expandableOtherBean the expandableOtherBean to set
     */
    public void setExpandableOtherBean(List<ExpandableOther> expandableOtherBean) {
        this.expandableOtherBean = expandableOtherBean;
    }

}
