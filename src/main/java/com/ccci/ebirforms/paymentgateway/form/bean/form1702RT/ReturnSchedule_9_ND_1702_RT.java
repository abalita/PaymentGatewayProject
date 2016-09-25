/**************************************************
@(#) PROGRAM NAME : ReturnSchedule_9_ND_1702_RT.java
@(#) AUTHOR       : Mark Sy
@(#) VERSION      : 1.0

CREATION DATE : February 3, 2014
DESCRIPTION : Return Schedule Entity Class for 1702_RT v.2013

CHANGE HISTORY:

DATE:           CHANGED BY:          CHANGES:

 **************************************************/
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * 
 * @author CAI-STA Phils., Inc.
 * 
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_9_ND")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_9_ND_1702_RT.getListByReferenceNo", query="SELECT Object(r) FROM ReturnSchedule_9_ND_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_9_ND_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_9_ND_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_9_ND_1702_RT implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected ReturnSchedule_9_ND_1702_RT_PK pk;
	
	@Column(name="NON_DED_EXPENSES")
	private String nonDeductibleExpenses;
	@Column(name="NON_DED_EXPENSES_AMT")
	private double nonDeductibleExpensesAmt;
	@Column(name="SORT_NO")
	private double sortNo;
	@Column(name="PARENT")
	private Long parent;

	public ReturnSchedule_9_ND_1702_RT() {}

	public ReturnSchedule_9_ND_1702_RT(
			Long referenceNo, Long seqNo, 
			String nonDeductibleExpenses, double nonDeductibleExpensesAmt,
			double sortNo, Long parent) {
		this.pk = new ReturnSchedule_9_ND_1702_RT_PK(referenceNo, seqNo);
		this.nonDeductibleExpenses = nonDeductibleExpenses;
		this.nonDeductibleExpensesAmt = nonDeductibleExpensesAmt;
		this.sortNo = sortNo;
		this.parent = parent;
	}

	public ReturnSchedule_9_ND_1702_RT_PK getPk() {
		return pk;
	}

	public void setPk(ReturnSchedule_9_ND_1702_RT_PK pk) {
		this.pk = pk;
	}

	public String getNonDeductibleExpenses() {
		return nonDeductibleExpenses;
	}

	public void setNonDeductibleExpenses(String nonDeductibleExpenses) {
		this.nonDeductibleExpenses = nonDeductibleExpenses;
	}

	public double getNonDeductibleExpensesAmt() {
		return nonDeductibleExpensesAmt;
	}

	public void setNonDeductibleExpensesAmt(double nonDeductibleExpensesAmt) {
		this.nonDeductibleExpensesAmt = nonDeductibleExpensesAmt;
	}

	public double getSortNo() {
		return sortNo;
	}

	public void setSortNo(double sortNo) {
		this.sortNo = sortNo;
	}

	public Long getParent() {
		return parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}
	
}
