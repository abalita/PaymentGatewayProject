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
 * Purpose: This object is used to retrieved form 1702-RT schedule 5 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_6")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_6_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_6_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_6_1702_RT implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="GROSS_INCOME")
	private double grssIncome;
	
	@Column(name="TOTAL_DEDUCTION_EXC_NO0LCO")
	private double totalDeductionExclusiveOfNolco;
	
	@Column(name="NET_OPERATING_LOSS")
	private double netOperatingLoss;

	public ReturnSchedule_6_1702_RT() {
	}

	/**
	 * @param referenceNo
	 * @param grssIncome
	 * @param totalDeductionExclusiveOfNolco
	 * @param netOperatingLoss
	 */
	public ReturnSchedule_6_1702_RT(Long referenceNo, double grssIncome,
			double totalDeductionExclusiveOfNolco, double netOperatingLoss) {
		this.referenceNo = referenceNo;
		this.grssIncome = grssIncome;
		this.totalDeductionExclusiveOfNolco = totalDeductionExclusiveOfNolco;
		this.netOperatingLoss = netOperatingLoss;
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
	 * @return the grssIncome
	 */
	public double getGrssIncome() {
		return grssIncome;
	}

	/**
	 * @param grssIncome the grssIncome to set
	 */
	public void setGrssIncome(double grssIncome) {
		this.grssIncome = grssIncome;
	}

	/**
	 * @return the totalDeductionExclusiveOfNolco
	 */
	public double getTotalDeductionExclusiveOfNolco() {
		return totalDeductionExclusiveOfNolco;
	}

	/**
	 * @param totalDeductionExclusiveOfNolco the totalDeductionExclusiveOfNolco to set
	 */
	public void setTotalDeductionExclusiveOfNolco(
			double totalDeductionExclusiveOfNolco) {
		this.totalDeductionExclusiveOfNolco = totalDeductionExclusiveOfNolco;
	}

	/**
	 * @return the netOperatingLoss
	 */
	public double getNetOperatingLoss() {
		return netOperatingLoss;
	}

	/**
	 * @param netOperatingLoss the netOperatingLoss to set
	 */
	public void setNetOperatingLoss(double netOperatingLoss) {
		this.netOperatingLoss = netOperatingLoss;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
