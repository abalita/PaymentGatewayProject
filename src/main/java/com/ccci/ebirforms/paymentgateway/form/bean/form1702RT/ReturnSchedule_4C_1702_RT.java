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
 * Purpose: This object is used to retrieved form 1702-RT schedule 4C data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_4C")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_4C_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_4C_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_4C_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_4C_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_4C_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_4C_1702_RT_PK pk;
	
	@Column(name="OTHER_NAME")
	private String otherName;
	
	@Column(name="AMOUNT")
	private double amount;

	public ReturnSchedule_4C_1702_RT() {
	}

	/**
	 * @param pk
	 * @param otherName
	 * @param amount
	 */
	public ReturnSchedule_4C_1702_RT(Long referenceNo, Long seqNo,
			String otherName, double amount) {
		this.pk = new ReturnSchedule_4C_1702_RT_PK(referenceNo, seqNo);
		this.otherName = otherName;
		this.amount = amount;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_4C_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_4C_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the otherName
	 */
	public String getOtherName() {
		return otherName;
	}

	/**
	 * @param otherName the otherName to set
	 */
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
