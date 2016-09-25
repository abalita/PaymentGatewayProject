/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

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
public class GrossIncomeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private long interestExempt;
	private long interestsActualAmt;
	private long royaltiesActualAmt;
	private long dividendsActualAmt;
	private long prizesWinningsActualAmt;
	private long fringeBenefitsActualAmt;
	private long compSubjTo15PrefRateActualAmt;
	private long interestsFinalTaxWthldPd;
	private long royaltiesFinalTaxWthldPd;
	private long dividendsFinalTaxWthldPd;
	private long prizesWinningsFinalTaxWthldPd;
	private long fringeBenefitsFinalTaxWthldPd;
	private long compSubjTo15PrefRateFinalTaxWthldPd;
	private long totalFinalTaxWithheldOrPaid;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the interestExempt
	 */
	public long getInterestExempt() {
		return interestExempt;
	}

	/**
	 * @param interestExempt the interestExempt to set
	 */
	public void setInterestExempt(long interestExempt) {
		this.interestExempt = interestExempt;
	}

	/**
	 * @return the interestsActualAmt
	 */
	public long getInterestsActualAmt() {
		return interestsActualAmt;
	}

	/**
	 * @param interestsActualAmt the interestsActualAmt to set
	 */
	public void setInterestsActualAmt(long interestsActualAmt) {
		this.interestsActualAmt = interestsActualAmt;
	}

	/**
	 * @return the royaltiesActualAmt
	 */
	public long getRoyaltiesActualAmt() {
		return royaltiesActualAmt;
	}

	/**
	 * @param royaltiesActualAmt the royaltiesActualAmt to set
	 */
	public void setRoyaltiesActualAmt(long royaltiesActualAmt) {
		this.royaltiesActualAmt = royaltiesActualAmt;
	}

	/**
	 * @return the dividendsActualAmt
	 */
	public long getDividendsActualAmt() {
		return dividendsActualAmt;
	}

	/**
	 * @param dividendsActualAmt the dividendsActualAmt to set
	 */
	public void setDividendsActualAmt(long dividendsActualAmt) {
		this.dividendsActualAmt = dividendsActualAmt;
	}

	/**
	 * @return the prizesWinningsActualAmt
	 */
	public long getPrizesWinningsActualAmt() {
		return prizesWinningsActualAmt;
	}

	/**
	 * @param prizesWinningsActualAmt the prizesWinningsActualAmt to set
	 */
	public void setPrizesWinningsActualAmt(long prizesWinningsActualAmt) {
		this.prizesWinningsActualAmt = prizesWinningsActualAmt;
	}

	/**
	 * @return the fringeBenefitsActualAmt
	 */
	public long getFringeBenefitsActualAmt() {
		return fringeBenefitsActualAmt;
	}

	/**
	 * @param fringeBenefitsActualAmt the fringeBenefitsActualAmt to set
	 */
	public void setFringeBenefitsActualAmt(long fringeBenefitsActualAmt) {
		this.fringeBenefitsActualAmt = fringeBenefitsActualAmt;
	}

	/**
	 * @return the compSubjTo15PrefRateActualAmt
	 */
	public long getCompSubjTo15PrefRateActualAmt() {
		return compSubjTo15PrefRateActualAmt;
	}

	/**
	 * @param compSubjTo15PrefRateActualAmt the compSubjTo15PrefRateActualAmt to set
	 */
	public void setCompSubjTo15PrefRateActualAmt(long compSubjTo15PrefRateActualAmt) {
		this.compSubjTo15PrefRateActualAmt = compSubjTo15PrefRateActualAmt;
	}

	/**
	 * @return the interestsFinalTaxWthldPd
	 */
	public long getInterestsFinalTaxWthldPd() {
		return interestsFinalTaxWthldPd;
	}

	/**
	 * @param interestsFinalTaxWthldPd the interestsFinalTaxWthldPd to set
	 */
	public void setInterestsFinalTaxWthldPd(long interestsFinalTaxWthldPd) {
		this.interestsFinalTaxWthldPd = interestsFinalTaxWthldPd;
	}

	/**
	 * @return the royaltiesFinalTaxWthldPd
	 */
	public long getRoyaltiesFinalTaxWthldPd() {
		return royaltiesFinalTaxWthldPd;
	}

	/**
	 * @param royaltiesFinalTaxWthldPd the royaltiesFinalTaxWthldPd to set
	 */
	public void setRoyaltiesFinalTaxWthldPd(long royaltiesFinalTaxWthldPd) {
		this.royaltiesFinalTaxWthldPd = royaltiesFinalTaxWthldPd;
	}

	/**
	 * @return the dividendsFinalTaxWthldPd
	 */
	public long getDividendsFinalTaxWthldPd() {
		return dividendsFinalTaxWthldPd;
	}

	/**
	 * @param dividendsFinalTaxWthldPd the dividendsFinalTaxWthldPd to set
	 */
	public void setDividendsFinalTaxWthldPd(long dividendsFinalTaxWthldPd) {
		this.dividendsFinalTaxWthldPd = dividendsFinalTaxWthldPd;
	}

	/**
	 * @return the prizesWinningsFinalTaxWthldPd
	 */
	public long getPrizesWinningsFinalTaxWthldPd() {
		return prizesWinningsFinalTaxWthldPd;
	}

	/**
	 * @param prizesWinningsFinalTaxWthldPd the prizesWinningsFinalTaxWthldPd to set
	 */
	public void setPrizesWinningsFinalTaxWthldPd(long prizesWinningsFinalTaxWthldPd) {
		this.prizesWinningsFinalTaxWthldPd = prizesWinningsFinalTaxWthldPd;
	}

	/**
	 * @return the fringeBenefitsFinalTaxWthldPd
	 */
	public long getFringeBenefitsFinalTaxWthldPd() {
		return fringeBenefitsFinalTaxWthldPd;
	}

	/**
	 * @param fringeBenefitsFinalTaxWthldPd the fringeBenefitsFinalTaxWthldPd to set
	 */
	public void setFringeBenefitsFinalTaxWthldPd(long fringeBenefitsFinalTaxWthldPd) {
		this.fringeBenefitsFinalTaxWthldPd = fringeBenefitsFinalTaxWthldPd;
	}

	/**
	 * @return the compSubjTo15PrefRateFinalTaxWthldPd
	 */
	public long getCompSubjTo15PrefRateFinalTaxWthldPd() {
		return compSubjTo15PrefRateFinalTaxWthldPd;
	}

	/**
	 * @param compSubjTo15PrefRateFinalTaxWthldPd the compSubjTo15PrefRateFinalTaxWthldPd to set
	 */
	public void setCompSubjTo15PrefRateFinalTaxWthldPd(
			long compSubjTo15PrefRateFinalTaxWthldPd) {
		this.compSubjTo15PrefRateFinalTaxWthldPd = compSubjTo15PrefRateFinalTaxWthldPd;
	}

	/**
	 * @return the totalFinalTaxWithheldOrPaid
	 */
	public long getTotalFinalTaxWithheldOrPaid() {
		return totalFinalTaxWithheldOrPaid;
	}

	/**
	 * @param totalFinalTaxWithheldOrPaid the totalFinalTaxWithheldOrPaid to set
	 */
	public void setTotalFinalTaxWithheldOrPaid(long totalFinalTaxWithheldOrPaid) {
		this.totalFinalTaxWithheldOrPaid = totalFinalTaxWithheldOrPaid;
	}


	
	
}
