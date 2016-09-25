/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT schedule 7 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_7")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_7_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_7_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_7_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="PRIOR_YR_EXCESS_CREDIT")
	private double priorYearExcessCredit;
	
	@Column(name="INC_TAX_PYMNT_UNDER_MCIT")
	private double incomeTaxPaymentUnderMCIT;
	
	@Column(name="INC_TAX_PYMNT_UNDER_REG")
	private double incomeTaxPaymentUnderRegular;
	
	@Column(name="EXCESS_MCIT_APPLIED_CURRENT")
	private double excessMCITAppliedCurrentTaxableYear;
	
	@Column(name="CREDITABLE_TAX_PREVIOUS_QTR")
	private double creditableTaxPreviousQuarter;
	
	@Column(name="CREDITABLE_TAX_BIR_2307")
	private double creditableTaxFromBIR2307;
	
	@Column(name="FOREIGN_TAX")
	private double foriegnTax;
	
	@Column(name="TAX_PAID_IN_RETURN")
	private double taxPaidInReturnPreviouslyFiled;
	
	@Column(name="SPECIAL_TAX_CREDITS")
	private double specialTaxCredits;

	public ReturnSchedule_7_1702_RT() {
	}

	/**
	 * @param referenceId
	 * @param priorYearExcessCredit
	 * @param incomeTaxPaymentUnderMCIT
	 * @param incomeTaxPaymentUnderRegular
	 * @param excessMCITAppliedCurrentTaxableYear
	 * @param creditableTaxPreviousQuarter
	 * @param creditableTaxFromBIR2307
	 * @param foriegnTax
	 * @param taxPaidInReturnPreviouslyFiled
	 * @param specialTaxCredits
	 */
	public ReturnSchedule_7_1702_RT(Long referenceId,
			double priorYearExcessCredit, double incomeTaxPaymentUnderMCIT,
			double incomeTaxPaymentUnderRegular,
			double excessMCITAppliedCurrentTaxableYear,
			double creditableTaxPreviousQuarter,
			double creditableTaxFromBIR2307, double foriegnTax,
			double taxPaidInReturnPreviouslyFiled, double specialTaxCredits) {
		this.referenceNo = referenceId;
		this.priorYearExcessCredit = priorYearExcessCredit;
		this.incomeTaxPaymentUnderMCIT = incomeTaxPaymentUnderMCIT;
		this.incomeTaxPaymentUnderRegular = incomeTaxPaymentUnderRegular;
		this.excessMCITAppliedCurrentTaxableYear = excessMCITAppliedCurrentTaxableYear;
		this.creditableTaxPreviousQuarter = creditableTaxPreviousQuarter;
		this.creditableTaxFromBIR2307 = creditableTaxFromBIR2307;
		this.foriegnTax = foriegnTax;
		this.taxPaidInReturnPreviouslyFiled = taxPaidInReturnPreviouslyFiled;
		this.specialTaxCredits = specialTaxCredits;
	}

	/**
	 * @return the referenceId
	 */
	public Long getReferenceNo() {
		return referenceNo;
	}

	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	/**
	 * @return the priorYearExcessCredit
	 */
	public double getPriorYearExcessCredit() {
		return priorYearExcessCredit;
	}

	/**
	 * @param priorYearExcessCredit the priorYearExcessCredit to set
	 */
	public void setPriorYearExcessCredit(double priorYearExcessCredit) {
		this.priorYearExcessCredit = priorYearExcessCredit;
	}

	/**
	 * @return the incomeTaxPaymentUnderMCIT
	 */
	public double getIncomeTaxPaymentUnderMCIT() {
		return incomeTaxPaymentUnderMCIT;
	}

	/**
	 * @param incomeTaxPaymentUnderMCIT the incomeTaxPaymentUnderMCIT to set
	 */
	public void setIncomeTaxPaymentUnderMCIT(double incomeTaxPaymentUnderMCIT) {
		this.incomeTaxPaymentUnderMCIT = incomeTaxPaymentUnderMCIT;
	}

	/**
	 * @return the incomeTaxPaymentUnderRegular
	 */
	public double getIncomeTaxPaymentUnderRegular() {
		return incomeTaxPaymentUnderRegular;
	}

	/**
	 * @param incomeTaxPaymentUnderRegular the incomeTaxPaymentUnderRegular to set
	 */
	public void setIncomeTaxPaymentUnderRegular(double incomeTaxPaymentUnderRegular) {
		this.incomeTaxPaymentUnderRegular = incomeTaxPaymentUnderRegular;
	}

	/**
	 * @return the excessMCITAppliedCurrentTaxableYear
	 */
	public double getExcessMCITAppliedCurrentTaxableYear() {
		return excessMCITAppliedCurrentTaxableYear;
	}

	/**
	 * @param excessMCITAppliedCurrentTaxableYear the excessMCITAppliedCurrentTaxableYear to set
	 */
	public void setExcessMCITAppliedCurrentTaxableYear(
			double excessMCITAppliedCurrentTaxableYear) {
		this.excessMCITAppliedCurrentTaxableYear = excessMCITAppliedCurrentTaxableYear;
	}

	/**
	 * @return the creditableTaxPreviousQuarter
	 */
	public double getCreditableTaxPreviousQuarter() {
		return creditableTaxPreviousQuarter;
	}

	/**
	 * @param creditableTaxPreviousQuarter the creditableTaxPreviousQuarter to set
	 */
	public void setCreditableTaxPreviousQuarter(double creditableTaxPreviousQuarter) {
		this.creditableTaxPreviousQuarter = creditableTaxPreviousQuarter;
	}

	/**
	 * @return the creditableTaxFromBIR2307
	 */
	public double getCreditableTaxFromBIR2307() {
		return creditableTaxFromBIR2307;
	}

	/**
	 * @param creditableTaxFromBIR2307 the creditableTaxFromBIR2307 to set
	 */
	public void setCreditableTaxFromBIR2307(double creditableTaxFromBIR2307) {
		this.creditableTaxFromBIR2307 = creditableTaxFromBIR2307;
	}

	/**
	 * @return the foriegnTax
	 */
	public double getForiegnTax() {
		return foriegnTax;
	}

	/**
	 * @param foriegnTax the foriegnTax to set
	 */
	public void setForiegnTax(double foriegnTax) {
		this.foriegnTax = foriegnTax;
	}

	/**
	 * @return the taxPaidInReturnPreviouslyFiled
	 */
	public double getTaxPaidInReturnPreviouslyFiled() {
		return taxPaidInReturnPreviouslyFiled;
	}

	/**
	 * @param taxPaidInReturnPreviouslyFiled the taxPaidInReturnPreviouslyFiled to set
	 */
	public void setTaxPaidInReturnPreviouslyFiled(
			double taxPaidInReturnPreviouslyFiled) {
		this.taxPaidInReturnPreviouslyFiled = taxPaidInReturnPreviouslyFiled;
	}

	/**
	 * @return the specialTaxCredits
	 */
	public double getSpecialTaxCredits() {
		return specialTaxCredits;
	}

	/**
	 * @param specialTaxCredits the specialTaxCredits to set
	 */
	public void setSpecialTaxCredits(double specialTaxCredits) {
		this.specialTaxCredits = specialTaxCredits;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
