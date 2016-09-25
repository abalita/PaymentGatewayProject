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
 * Purpose: This object is used to retrieved form 1702-RT schedule 10 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_10")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_10_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_10_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_10_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="CURR_ASSET")
	private double currentAsset;
	
	@Column(name="LONG_TERM_INV")
	private double longTermInvestment;
	
	@Column(name="PROPERTY")
	private double property;
	
	@Column(name="LONG_TERM_RCVBLES")
	private double longTermReceivables;
	
	@Column(name="INTANGIBLE_ASSET")
	private double intangibleAsset;
	
	@Column(name="OTHER_ASSET")
	private double otherAsset;
	
	@Column(name="TOTAL_ASSET")
	private double totalAsset;
	
	@Column(name="CURR_LIABLITIY")
	private double currentLiablity;
	
	@Column(name="LONG_TERM_LIABILITY")
	private double longTermLiability;
	
	@Column(name="DEFERRED_CREDIT")
	private double deferredCredit;
	
	@Column(name="OTHER_LIABILITY")
	private double otherLiability;
	
	@Column(name="TOTAL_LIABLITY")
	private double totalLiablity;
	
	@Column(name="CAPITAL_STOCK")
	private double capitalStock;
	
	@Column(name="ADDL_PAID_IN_CAP")
	private double additionalPaidinCapital;
	
	@Column(name="RETAINED_EARNING")
	private double retainedEarning;
	
	@Column(name="TOTAL_EQUITY")
	private double totalEquity;
	
	@Column(name="TOTAL_LIABILITY_EQUITY")
	private double totalLiabilityAndEquity;

	public ReturnSchedule_10_1702_RT() {
	}

	/**
	 * @param referenceNo
	 * @param currentAsset
	 * @param longTermInvestment
	 * @param property
	 * @param longTermReceivables
	 * @param intangibleAsset
	 * @param otherAsset
	 * @param totalAsset
	 * @param currentLiablity
	 * @param longTermLiability
	 * @param deferredCredit
	 * @param otherLiability
	 * @param totalLiablity
	 * @param capitalStock
	 * @param additionalPaidinCapital
	 * @param retainedEarning
	 * @param totalEquity
	 * @param totalLiabilityAndEquity
	 */
	public ReturnSchedule_10_1702_RT(Long referenceNo, double currentAsset,
			double longTermInvestment, double property,
			double longTermReceivables, double intangibleAsset,
			double otherAsset, double totalAsset, double currentLiablity,
			double longTermLiability, double deferredCredit,
			double otherLiability, double totalLiablity, double capitalStock,
			double additionalPaidinCapital, double retainedEarning,
			double totalEquity, double totalLiabilityAndEquity) {
		this.referenceNo = referenceNo;
		this.currentAsset = currentAsset;
		this.longTermInvestment = longTermInvestment;
		this.property = property;
		this.longTermReceivables = longTermReceivables;
		this.intangibleAsset = intangibleAsset;
		this.otherAsset = otherAsset;
		this.totalAsset = totalAsset;
		this.currentLiablity = currentLiablity;
		this.longTermLiability = longTermLiability;
		this.deferredCredit = deferredCredit;
		this.otherLiability = otherLiability;
		this.totalLiablity = totalLiablity;
		this.capitalStock = capitalStock;
		this.additionalPaidinCapital = additionalPaidinCapital;
		this.retainedEarning = retainedEarning;
		this.totalEquity = totalEquity;
		this.totalLiabilityAndEquity = totalLiabilityAndEquity;
	}

	/**
	 * @return the referenceNo
	 */
	public Long getReferenceNo() {
		return referenceNo;
	}

	/**
	 * @param referenceNo the referenceNo to set
	 */
	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	/**
	 * @return the currentAsset
	 */
	public double getCurrentAsset() {
		return currentAsset;
	}

	/**
	 * @param currentAsset the currentAsset to set
	 */
	public void setCurrentAsset(double currentAsset) {
		this.currentAsset = currentAsset;
	}

	/**
	 * @return the longTermInvestment
	 */
	public double getLongTermInvestment() {
		return longTermInvestment;
	}

	/**
	 * @param longTermInvestment the longTermInvestment to set
	 */
	public void setLongTermInvestment(double longTermInvestment) {
		this.longTermInvestment = longTermInvestment;
	}

	/**
	 * @return the property
	 */
	public double getProperty() {
		return property;
	}

	/**
	 * @param property the property to set
	 */
	public void setProperty(double property) {
		this.property = property;
	}

	/**
	 * @return the longTermReceivables
	 */
	public double getLongTermReceivables() {
		return longTermReceivables;
	}

	/**
	 * @param longTermReceivables the longTermReceivables to set
	 */
	public void setLongTermReceivables(double longTermReceivables) {
		this.longTermReceivables = longTermReceivables;
	}

	/**
	 * @return the intangibleAsset
	 */
	public double getIntangibleAsset() {
		return intangibleAsset;
	}

	/**
	 * @param intangibleAsset the intangibleAsset to set
	 */
	public void setIntangibleAsset(double intangibleAsset) {
		this.intangibleAsset = intangibleAsset;
	}

	/**
	 * @return the otherAsset
	 */
	public double getOtherAsset() {
		return otherAsset;
	}

	/**
	 * @param otherAsset the otherAsset to set
	 */
	public void setOtherAsset(double otherAsset) {
		this.otherAsset = otherAsset;
	}

	/**
	 * @return the totalAsset
	 */
	public double getTotalAsset() {
		return totalAsset;
	}

	/**
	 * @param totalAsset the totalAsset to set
	 */
	public void setTotalAsset(double totalAsset) {
		this.totalAsset = totalAsset;
	}

	/**
	 * @return the currentLiablity
	 */
	public double getCurrentLiablity() {
		return currentLiablity;
	}

	/**
	 * @param currentLiablity the currentLiablity to set
	 */
	public void setCurrentLiablity(double currentLiablity) {
		this.currentLiablity = currentLiablity;
	}

	/**
	 * @return the longTermLiability
	 */
	public double getLongTermLiability() {
		return longTermLiability;
	}

	/**
	 * @param longTermLiability the longTermLiability to set
	 */
	public void setLongTermLiability(double longTermLiability) {
		this.longTermLiability = longTermLiability;
	}

	/**
	 * @return the deferredCredit
	 */
	public double getDeferredCredit() {
		return deferredCredit;
	}

	/**
	 * @param deferredCredit the deferredCredit to set
	 */
	public void setDeferredCredit(double deferredCredit) {
		this.deferredCredit = deferredCredit;
	}

	/**
	 * @return the otherLiability
	 */
	public double getOtherLiability() {
		return otherLiability;
	}

	/**
	 * @param otherLiability the otherLiability to set
	 */
	public void setOtherLiability(double otherLiability) {
		this.otherLiability = otherLiability;
	}

	/**
	 * @return the totalLiablity
	 */
	public double getTotalLiablity() {
		return totalLiablity;
	}

	/**
	 * @param totalLiablity the totalLiablity to set
	 */
	public void setTotalLiablity(double totalLiablity) {
		this.totalLiablity = totalLiablity;
	}

	/**
	 * @return the capitalStock
	 */
	public double getCapitalStock() {
		return capitalStock;
	}

	/**
	 * @param capitalStock the capitalStock to set
	 */
	public void setCapitalStock(double capitalStock) {
		this.capitalStock = capitalStock;
	}

	/**
	 * @return the additionalPaidinCapital
	 */
	public double getAdditionalPaidinCapital() {
		return additionalPaidinCapital;
	}

	/**
	 * @param additionalPaidinCapital the additionalPaidinCapital to set
	 */
	public void setAdditionalPaidinCapital(double additionalPaidinCapital) {
		this.additionalPaidinCapital = additionalPaidinCapital;
	}

	/**
	 * @return the retainedEarning
	 */
	public double getRetainedEarning() {
		return retainedEarning;
	}

	/**
	 * @param retainedEarning the retainedEarning to set
	 */
	public void setRetainedEarning(double retainedEarning) {
		this.retainedEarning = retainedEarning;
	}

	/**
	 * @return the totalEquity
	 */
	public double getTotalEquity() {
		return totalEquity;
	}

	/**
	 * @param totalEquity the totalEquity to set
	 */
	public void setTotalEquity(double totalEquity) {
		this.totalEquity = totalEquity;
	}

	/**
	 * @return the totalLiabilityAndEquity
	 */
	public double getTotalLiabilityAndEquity() {
		return totalLiabilityAndEquity;
	}

	/**
	 * @param totalLiabilityAndEquity the totalLiabilityAndEquity to set
	 */
	public void setTotalLiabilityAndEquity(double totalLiabilityAndEquity) {
		this.totalLiabilityAndEquity = totalLiabilityAndEquity;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
