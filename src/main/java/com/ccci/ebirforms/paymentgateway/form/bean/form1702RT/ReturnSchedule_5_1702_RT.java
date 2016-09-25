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
@Table(name="FILE_1702_RT_2013_SCHED_5")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_5_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_5_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_5_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_5_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_5_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_5_1702_RT_PK pk;
	
	@Column(name="SPECIAL_DEDUCTION")
	private String saidDeduction;
	
	@Column(name="SPECIAL_DEDUCTION_LEGAL_BASIS")
	private String saidLegalBasis;
	
	@Column(name="SPECIAL_DEDUCTION_AMT")
	private double saidAmount;
	
	@Column(name="SORT_NO")
	private double itemOrder;
	
	@Column(name="PARENT")
	private Long parent;

	public ReturnSchedule_5_1702_RT() {
	}

	/**
	 * @param pk
	 * @param saidDeduction
	 * @param saidLegalBasis
	 * @param saidAmount
	 * @param itemOrder
	 * @param parent
	 */
	public ReturnSchedule_5_1702_RT(Long referenceNo, Long seqNo,
			String saidDeduction, String saidLegalBasis, double saidAmount,
			double itemOrder, Long parent) {
		this.pk = new ReturnSchedule_5_1702_RT_PK(referenceNo, seqNo);
		this.saidDeduction = saidDeduction;
		this.saidLegalBasis = saidLegalBasis;
		this.saidAmount = saidAmount;
		this.itemOrder = itemOrder;
		this.parent = parent;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_5_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_5_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the saidDeduction
	 */
	public String getSaidDeduction() {
		return saidDeduction;
	}

	/**
	 * @param saidDeduction the saidDeduction to set
	 */
	public void setSaidDeduction(String saidDeduction) {
		this.saidDeduction = saidDeduction;
	}

	/**
	 * @return the saidLegalBasis
	 */
	public String getSaidLegalBasis() {
		return saidLegalBasis;
	}

	/**
	 * @param saidLegalBasis the saidLegalBasis to set
	 */
	public void setSaidLegalBasis(String saidLegalBasis) {
		this.saidLegalBasis = saidLegalBasis;
	}

	/**
	 * @return the saidAmount
	 */
	public double getSaidAmount() {
		return saidAmount;
	}

	/**
	 * @param saidAmount the saidAmount to set
	 */
	public void setSaidAmount(double saidAmount) {
		this.saidAmount = saidAmount;
	}

	/**
	 * @return the itemOrder
	 */
	public double getItemOrder() {
		return itemOrder;
	}

	/**
	 * @param itemOrder the itemOrder to set
	 */
	public void setItemOrder(double itemOrder) {
		this.itemOrder = itemOrder;
	}

	/**
	 * @return the parent
	 */
	public Long getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Long parent) {
		this.parent = parent;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
