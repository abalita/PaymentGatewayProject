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
 * Purpose: This object is used to retrieved form 1702-RT schedule 7A data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_7A")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_7A_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_7A_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_7A_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_7A_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_7A_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_7A_1702_RT_PK pk;
	
	@Column(name="TAX_CREDITS_NAME")
	private String taxCreditName;
	
	@Column(name="TAX_CREDITS_AMOUNT")
	private double taxCreditAmount;

	public ReturnSchedule_7A_1702_RT() {
	}

	/**
	 * @param pk
	 * @param taxCreditName
	 * @param taxCreditAmount
	 */
	public ReturnSchedule_7A_1702_RT(Long referenceNo, Long seqNo,
			String taxCreditName, double taxCreditAmount) {
		this.pk = new ReturnSchedule_7A_1702_RT_PK(referenceNo, seqNo);
		this.taxCreditName = taxCreditName;
		this.taxCreditAmount = taxCreditAmount;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_7A_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_7A_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the taxCreditName
	 */
	public String getTaxCreditName() {
		return taxCreditName;
	}

	/**
	 * @param taxCreditName the taxCreditName to set
	 */
	public void setTaxCreditName(String taxCreditName) {
		this.taxCreditName = taxCreditName;
	}

	/**
	 * @return the taxCreditAmount
	 */
	public double getTaxCreditAmount() {
		return taxCreditAmount;
	}

	/**
	 * @param taxCreditAmount the taxCreditAmount to set
	 */
	public void setTaxCreditAmount(double taxCreditAmount) {
		this.taxCreditAmount = taxCreditAmount;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
