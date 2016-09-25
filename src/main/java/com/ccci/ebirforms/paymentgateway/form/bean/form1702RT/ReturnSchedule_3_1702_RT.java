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
 * Purpose: This object is used to retrieved form 1702-RT schedule 3 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_3")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_3_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_3_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_3_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM  ReturnSchedule_3_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_3_1702_RT implements Serializable{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ReturnSchedule_3_1702_RT_PK pk;
	
	@Column(name="SORT_NO")
	private double itemOrder;
	
	@Column(name="OTHER_TAXBL_INC_NAME")
	private String otherTaxableIncomeDesc;
	
	@Column(name="PARENT")
	private Long parent;
	
	@Column(name="OTHER_TAXBL_INC_AMOUNT")
	private double otherTaxableIncomeAmount;

	public ReturnSchedule_3_1702_RT() {
	}

	/**
	 * @param pk
	 * @param itemOrder
	 * @param otherTaxableIncomeDesc
	 * @param parent
	 * @param otherTaxableIncomeAmount
	 */
	public ReturnSchedule_3_1702_RT(Long referenceNo, Long seqNo,
			double itemOrder, String otherTaxableIncomeDesc, Long parent,
			double otherTaxableIncomeAmount) {
		this.pk = new ReturnSchedule_3_1702_RT_PK(referenceNo, seqNo);
		this.itemOrder = itemOrder;
		this.otherTaxableIncomeDesc = otherTaxableIncomeDesc;
		this.parent = parent;
		this.otherTaxableIncomeAmount = otherTaxableIncomeAmount;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_3_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_3_1702_RT_PK pk) {
		this.pk = pk;
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
	 * @return the otherTaxableIncomeDesc
	 */
	public String getOtherTaxableIncomeDesc() {
		return otherTaxableIncomeDesc;
	}

	/**
	 * @param otherTaxableIncomeDesc the otherTaxableIncomeDesc to set
	 */
	public void setOtherTaxableIncomeDesc(String otherTaxableIncomeDesc) {
		this.otherTaxableIncomeDesc = otherTaxableIncomeDesc;
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

	/**
	 * @return the otherTaxableIncomeAmount
	 */
	public double getOtherTaxableIncomeAmount() {
		return otherTaxableIncomeAmount;
	}

	/**
	 * @param otherTaxableIncomeAmount the otherTaxableIncomeAmount to set
	 */
	public void setOtherTaxableIncomeAmount(double otherTaxableIncomeAmount) {
		this.otherTaxableIncomeAmount = otherTaxableIncomeAmount;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
