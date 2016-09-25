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
 * Purpose: This object is used to retrieved form 1702-RT schedule 12I data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_12IV")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_12IV_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_12IV_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_12IV_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_12IV_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_12IV_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_12IV_1702_RT_PK pk;
	
	@Column(name="OTHER_INCOME")
	private String otherIncome;
	
	@Column(name="ACTUAL_AMOUNT")
	private double actualAmount;
	
	@Column(name="FINAL_TAX_WITHELD")
	private double finalTaxWitheld;

	public ReturnSchedule_12IV_1702_RT() {
	}

	/**
	 * @param pk
	 * @param otherIncome
	 * @param actualAmount
	 * @param finalTaxWitheld
	 */
	public ReturnSchedule_12IV_1702_RT(Long referenceNo, Long seqNo,
			String otherIncome, double actualAmount, double finalTaxWitheld) {
		this.pk = new ReturnSchedule_12IV_1702_RT_PK(referenceNo, seqNo);
		this.otherIncome = otherIncome;
		this.actualAmount = actualAmount;
		this.finalTaxWitheld = finalTaxWitheld;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_12IV_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_12IV_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the otherIncome
	 */
	public String getOtherIncome() {
		return otherIncome;
	}

	/**
	 * @param otherIncome the otherIncome to set
	 */
	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}

	/**
	 * @return the actualAmount
	 */
	public double getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(double actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the finalTaxWitheld
	 */
	public double getFinalTaxWitheld() {
		return finalTaxWitheld;
	}

	/**
	 * @param finalTaxWitheld the finalTaxWitheld to set
	 */
	public void setFinalTaxWitheld(double finalTaxWitheld) {
		this.finalTaxWitheld = finalTaxWitheld;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
