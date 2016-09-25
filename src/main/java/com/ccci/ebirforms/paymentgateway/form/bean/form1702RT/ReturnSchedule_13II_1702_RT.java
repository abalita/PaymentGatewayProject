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
 * Purpose: This object is used to retrieved form 1702-RT schedule 13 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_13II")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_13II_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_13II_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_13II_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_13II_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_13II_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_13II_1702_RT_PK pk;
	
	@Column(name="OTHER_EXEMPT_INCOME")
	private String otherExemptIncome;
	
	@Column(name="ACTUAL_AMOUNT")
	private double actualAmount;

	public ReturnSchedule_13II_1702_RT() {
	}

	/**
	 * @param pk
	 * @param otherExemptIncome
	 * @param actualAmount
	 */
	public ReturnSchedule_13II_1702_RT(Long referenceNo, Long seqNo,
			String otherExemptIncome, double actualAmount) {
		this.pk = new ReturnSchedule_13II_1702_RT_PK(referenceNo, seqNo);
		this.otherExemptIncome = otherExemptIncome;
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_13II_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_13II_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the otherExemptIncome
	 */
	public String getOtherExemptIncome() {
		return otherExemptIncome;
	}

	/**
	 * @param otherExemptIncome the otherExemptIncome to set
	 */
	public void setOtherExemptIncome(String otherExemptIncome) {
		this.otherExemptIncome = otherExemptIncome;
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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
