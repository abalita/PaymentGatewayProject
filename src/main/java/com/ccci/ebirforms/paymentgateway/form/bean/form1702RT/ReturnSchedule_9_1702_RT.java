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
 * Purpose: This object is used to retrieved form 1702-RT schedule 9 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_9")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_9_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_9_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_9_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO", nullable = false)
	private Long referenceNo;
	@Column(name="NET_INC_PER_BOOKS")
	private double netIncomeOrLossPerBooks;
	@Column(name="NON_DED_EXPENSES")
	private String nonDeductibleExpenses;
	@Column(name="NON_DED_EXPENSES_AMT")
	private double nonDeductibleExpensesAmt;
	@Column(name="NON_DED_EXPENSES_TOTAL")
	private double nonDeductibleExpensesTotal;
	@Column(name="NON_TAXABLE_INC")
	private String nonTaxableIncome;
	@Column(name="NON_TAXABLE_INC_AMT")
	private double nonTaxableIncomeAmt;
	@Column(name="SPECIAL_DED")
	private String specialDeductions;
	@Column(name="SPECIAL_DED_AMT")
	private double specialDeductionsAmt;
	@Column(name="NON_TAX_INC_SPL_DED_TOT")
	private double nonTaxableIncSpecialDedTotal;
	@Column(name="NET_TAXABLE_INC")
	private double netTaxableIncomeOrLoss;

	public ReturnSchedule_9_1702_RT() {}

	public ReturnSchedule_9_1702_RT(
			Long referenceNo, double netIncomeOrLossPerBooks, String nonDeductibleExpenses,
			double nonDeductibleExpensesAmt, double nonDeductibleExpensesTotal,
			String nonTaxableIncome, double nonTaxableIncomeAmt,
			String specialDeductions, double specialDeductionsAmt,
			double nonTaxableIncSpecialDedTotal, double netTaxableIncomeOrLoss) {
		this.referenceNo = referenceNo;
		this.netIncomeOrLossPerBooks = netIncomeOrLossPerBooks;
		this.nonDeductibleExpenses = nonDeductibleExpenses;
		this.nonDeductibleExpensesAmt = nonDeductibleExpensesAmt;
		this.nonDeductibleExpensesTotal = nonDeductibleExpensesTotal;
		this.nonTaxableIncome = nonTaxableIncome;
		this.nonTaxableIncomeAmt = nonTaxableIncomeAmt;
		this.specialDeductions = specialDeductions;
		this.specialDeductionsAmt = specialDeductionsAmt;
		this.nonTaxableIncSpecialDedTotal = nonTaxableIncSpecialDedTotal;
		this.netTaxableIncomeOrLoss = netTaxableIncomeOrLoss;
	}

	public Long getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	public double getNonTaxableIncSpecialDedTotal() {
		return nonTaxableIncSpecialDedTotal;
	}

	public void setNonTaxableIncSpecialDedTotal(double nonTaxableIncSpecialDedTotal) {
		this.nonTaxableIncSpecialDedTotal = nonTaxableIncSpecialDedTotal;
	}
	public double getNetIncomeOrLossPerBooks() {
		return netIncomeOrLossPerBooks;
	}

	public void setNetIncomeOrLossPerBooks(double netIncomeOrLossPerBooks) {
		this.netIncomeOrLossPerBooks = netIncomeOrLossPerBooks;
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

	public double getNonDeductibleExpensesTotal() {
		return nonDeductibleExpensesTotal;
	}

	public void setNonDeductibleExpensesTotal(double nonDeductibleExpensesTotal) {
		this.nonDeductibleExpensesTotal = nonDeductibleExpensesTotal;
	}

	public String getNonTaxableIncome() {
		return nonTaxableIncome;
	}

	public void setNonTaxableIncome(String nonTaxableIncome) {
		this.nonTaxableIncome = nonTaxableIncome;
	}

	public double getNonTaxableIncomeAmt() {
		return nonTaxableIncomeAmt;
	}

	public void setNonTaxableIncomeAmt(double nonTaxableIncomeAmt) {
		this.nonTaxableIncomeAmt = nonTaxableIncomeAmt;
	}

	public String getSpecialDeductions() {
		return specialDeductions;
	}

	public void setSpecialDeductions(String specialDeductions) {
		this.specialDeductions = specialDeductions;
	}

	public double getSpecialDeductionsAmt() {
		return specialDeductionsAmt;
	}

	public void setSpecialDeductionsAmt(double specialDeductionsAmt) {
		this.specialDeductionsAmt = specialDeductionsAmt;
	}
	
	public double getNetTaxableIncomeOrLoss() {
		return netTaxableIncomeOrLoss;
	}

	public void setNetTaxableIncomeOrLoss(double netTaxableIncomeOrLoss) {
		this.netTaxableIncomeOrLoss = netTaxableIncomeOrLoss;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
