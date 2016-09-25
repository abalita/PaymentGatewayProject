/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT schedule 5 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_6A")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_6A_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_6A_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_6A_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_6A_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_6A_1702_RT implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_6A_1702_RT_PK pk;
	
	@Column(name="YEAR_INCURRED")
	private String yearIncurred;
	
	@Column(name="OPERATING_LOSS_AMT")
	private double operatingLossAmount;
	
	@Column(name="NOLCO_APPLIED_PREV_YEAR")
	private double nolcoAppliedPreviousYear;
	
	@Column(name="NOLCO_EXPIRED")
	private double nolcoExpired;
	
	@Column(name="NOLCO_APPLIED_CURRENT_YEAR")
	private double nolcoAppliedCurrentYear;
	
	@Column(name="NET_OPERATING_LOSS")
	private double netOperatiingLoss;

	public ReturnSchedule_6A_1702_RT() {
	}

	/**
	 * @param pk
	 * @param yearIncurred
	 * @param operatingLossAmount
	 * @param nolcoAppliedPreviousYear
	 * @param nolcoExpired
	 * @param nolcoAppliedCurrentYear
	 * @param netOperatiingLoss
	 */
	public ReturnSchedule_6A_1702_RT(Long referenceNo, Long seqNo,
			String yearIncurred, double operatingLossAmount,
			double nolcoAppliedPreviousYear, double nolcoExpired,
			double nolcoAppliedCurrentYear, double netOperatiingLoss) {
		this.pk = new ReturnSchedule_6A_1702_RT_PK(referenceNo, seqNo);
		this.yearIncurred = yearIncurred;
		this.operatingLossAmount = operatingLossAmount;
		this.nolcoAppliedPreviousYear = nolcoAppliedPreviousYear;
		this.nolcoExpired = nolcoExpired;
		this.nolcoAppliedCurrentYear = nolcoAppliedCurrentYear;
		this.netOperatiingLoss = netOperatiingLoss;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_6A_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_6A_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the yearIncurred
	 */
	public String getYearIncurred() {
		return yearIncurred;
	}

	/**
	 * @param yearIncurred the yearIncurred to set
	 */
	public void setYearIncurred(String yearIncurred) {
		this.yearIncurred = yearIncurred;
	}

	/**
	 * @return the operatingLossAmount
	 */
	public double getOperatingLossAmount() {
		return operatingLossAmount;
	}

	/**
	 * @param operatingLossAmount the operatingLossAmount to set
	 */
	public void setOperatingLossAmount(double operatingLossAmount) {
		this.operatingLossAmount = operatingLossAmount;
	}

	/**
	 * @return the nolcoAppliedPreviousYear
	 */
	public double getNolcoAppliedPreviousYear() {
		return nolcoAppliedPreviousYear;
	}

	/**
	 * @param nolcoAppliedPreviousYear the nolcoAppliedPreviousYear to set
	 */
	public void setNolcoAppliedPreviousYear(double nolcoAppliedPreviousYear) {
		this.nolcoAppliedPreviousYear = nolcoAppliedPreviousYear;
	}

	/**
	 * @return the nolcoExpired
	 */
	public double getNolcoExpired() {
		return nolcoExpired;
	}

	/**
	 * @param nolcoExpired the nolcoExpired to set
	 */
	public void setNolcoExpired(double nolcoExpired) {
		this.nolcoExpired = nolcoExpired;
	}

	/**
	 * @return the nolcoAppliedCurrentYear
	 */
	public double getNolcoAppliedCurrentYear() {
		return nolcoAppliedCurrentYear;
	}

	/**
	 * @param nolcoAppliedCurrentYear the nolcoAppliedCurrentYear to set
	 */
	public void setNolcoAppliedCurrentYear(double nolcoAppliedCurrentYear) {
		this.nolcoAppliedCurrentYear = nolcoAppliedCurrentYear;
	}

	/**
	 * @return the netOperatiingLoss
	 */
	public double getNetOperatiingLoss() {
		return netOperatiingLoss;
	}

	/**
	 * @param netOperatiingLoss the netOperatiingLoss to set
	 */
	public void setNetOperatiingLoss(double netOperatiingLoss) {
		this.netOperatiingLoss = netOperatiingLoss;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
