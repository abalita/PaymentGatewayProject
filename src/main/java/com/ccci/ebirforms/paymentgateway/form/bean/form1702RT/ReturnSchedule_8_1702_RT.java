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
 * Purpose: This object is used to retrieved form 1702-RT schedule 8 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_8")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_8_1702_RT.getListByReferenceNo", query="SELECT r FROM ReturnSchedule_8_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_8_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_8_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_8_1702_RT implements Serializable {
	private static final long serialVersionUID = 1L;

	public ReturnSchedule_8_1702_RT() {
	}

	@EmbeddedId
	protected ReturnSchedule_8_1702_RT_PK pk;
	
	@Column(name="MCIT_YEAR")
	private String mcitYear;
	
	@Column(name="NORMAL_INC_TAX")
	private double normalIncomeTax;
	
	@Column(name="MCIT")
	private double mcit;
	
	@Column(name="EXCESS_MCIT_NORMAL_INC_TAX")
	private double excessMCITOverNormalTax;
	
	@Column(name="EXCESS_MCIT_PREV_YRS")
	private double excessMCITAppliedPreviously;
	
	@Column(name="EXPIRED_PORTION_EXCSS_MCIT")
	private double expiredPortionOfExcessMCIT;
	
	@Column(name="EXCESS_MCIT_CURRENT_YEAR")
	private double excessMCITAppliedCurrently;
	
	@Column(name="BAL_EXCESS_MCIT_SUC_YR")
	private double balanceOfExcessMCIT;

	/**
	 * @param pk
	 * @param mcitYear
	 * @param normalIncomeTax
	 * @param mcit
	 * @param excessMCITOverNormalTax
	 * @param excessMCITAppliedPreviously
	 * @param expiredPortionOfExcessMCIT
	 * @param excessMCITAppliedCurrently
	 * @param balanceOfExcessMCIT
	 */
	public ReturnSchedule_8_1702_RT(Long referenceNo, Long seqNo,
			String mcitYear, double normalIncomeTax, double mcit,
			double excessMCITOverNormalTax, double excessMCITAppliedPreviously,
			double expiredPortionOfExcessMCIT,
			double excessMCITAppliedCurrently, double balanceOfExcessMCIT) {
		this.pk = new ReturnSchedule_8_1702_RT_PK(referenceNo, seqNo);
		this.mcitYear = mcitYear;
		this.normalIncomeTax = normalIncomeTax;
		this.mcit = mcit;
		this.excessMCITOverNormalTax = excessMCITOverNormalTax;
		this.excessMCITAppliedPreviously = excessMCITAppliedPreviously;
		this.expiredPortionOfExcessMCIT = expiredPortionOfExcessMCIT;
		this.excessMCITAppliedCurrently = excessMCITAppliedCurrently;
		this.balanceOfExcessMCIT = balanceOfExcessMCIT;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_8_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_8_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the mcitYear
	 */
	public String getMcitYear() {
		return mcitYear;
	}

	/**
	 * @param mcitYear the mcitYear to set
	 */
	public void setMcitYear(String mcitYear) {
		this.mcitYear = mcitYear;
	}

	/**
	 * @return the normalIncomeTax
	 */
	public double getNormalIncomeTax() {
		return normalIncomeTax;
	}

	/**
	 * @param normalIncomeTax the normalIncomeTax to set
	 */
	public void setNormalIncomeTax(double normalIncomeTax) {
		this.normalIncomeTax = normalIncomeTax;
	}

	/**
	 * @return the mcit
	 */
	public double getMcit() {
		return mcit;
	}

	/**
	 * @param mcit the mcit to set
	 */
	public void setMcit(double mcit) {
		this.mcit = mcit;
	}

	/**
	 * @return the excessMCITOverNormalTax
	 */
	public double getExcessMCITOverNormalTax() {
		return excessMCITOverNormalTax;
	}

	/**
	 * @param excessMCITOverNormalTax the excessMCITOverNormalTax to set
	 */
	public void setExcessMCITOverNormalTax(double excessMCITOverNormalTax) {
		this.excessMCITOverNormalTax = excessMCITOverNormalTax;
	}

	/**
	 * @return the excessMCITAppliedPreviously
	 */
	public double getExcessMCITAppliedPreviously() {
		return excessMCITAppliedPreviously;
	}

	/**
	 * @param excessMCITAppliedPreviously the excessMCITAppliedPreviously to set
	 */
	public void setExcessMCITAppliedPreviously(double excessMCITAppliedPreviously) {
		this.excessMCITAppliedPreviously = excessMCITAppliedPreviously;
	}

	/**
	 * @return the expiredPortionOfExcessMCIT
	 */
	public double getExpiredPortionOfExcessMCIT() {
		return expiredPortionOfExcessMCIT;
	}

	/**
	 * @param expiredPortionOfExcessMCIT the expiredPortionOfExcessMCIT to set
	 */
	public void setExpiredPortionOfExcessMCIT(double expiredPortionOfExcessMCIT) {
		this.expiredPortionOfExcessMCIT = expiredPortionOfExcessMCIT;
	}

	/**
	 * @return the excessMCITAppliedCurrently
	 */
	public double getExcessMCITAppliedCurrently() {
		return excessMCITAppliedCurrently;
	}

	/**
	 * @param excessMCITAppliedCurrently the excessMCITAppliedCurrently to set
	 */
	public void setExcessMCITAppliedCurrently(double excessMCITAppliedCurrently) {
		this.excessMCITAppliedCurrently = excessMCITAppliedCurrently;
	}

	/**
	 * @return the balanceOfExcessMCIT
	 */
	public double getBalanceOfExcessMCIT() {
		return balanceOfExcessMCIT;
	}

	/**
	 * @param balanceOfExcessMCIT the balanceOfExcessMCIT to set
	 */
	public void setBalanceOfExcessMCIT(double balanceOfExcessMCIT) {
		this.balanceOfExcessMCIT = balanceOfExcessMCIT;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
