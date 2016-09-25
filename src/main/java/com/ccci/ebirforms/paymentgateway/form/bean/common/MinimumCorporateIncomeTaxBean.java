package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class MinimumCorporateIncomeTaxBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private int sequenceNumber;
	private String mcitYear;
	private long normalIncomeTax;
	private long mcit;
	private long excessMCITOverNormalTax;
	private long excessMCITAppliedPreviously;
	private long expiredPortionOfExcessMCIT;
	private long excessMCITAppliedCurrently;
	private long balanceOfExcessMCIT;
	
	public String toString() {
	    return ToStringBuilder.reflectionToString(this);
	}

	public long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getMcitYear() {
		return mcitYear;
	}

	public void setMcitYear(String mcitYear) {
		this.mcitYear = mcitYear;
	}

	public long getNormalIncomeTax() {
		return normalIncomeTax;
	}

	public void setNormalIncomeTax(long normalIncomeTax) {
		this.normalIncomeTax = normalIncomeTax;
	}

	public long getMcit() {
		return mcit;
	}

	public void setMcit(long mcit) {
		this.mcit = mcit;
	}

	public long getExcessMCITOverNormalTax() {
		return excessMCITOverNormalTax;
	}

	public void setExcessMCITOverNormalTax(long excessMCITOverNormalTax) {
		this.excessMCITOverNormalTax = excessMCITOverNormalTax;
	}

	public long getExcessMCITAppliedPreviously() {
		return excessMCITAppliedPreviously;
	}

	public void setExcessMCITAppliedPreviously(long excessMCITAppliedPreviously) {
		this.excessMCITAppliedPreviously = excessMCITAppliedPreviously;
	}

	public long getExpiredPortionOfExcessMCIT() {
		return expiredPortionOfExcessMCIT;
	}

	public void setExpiredPortionOfExcessMCIT(long expiredPortionOfExcessMCIT) {
		this.expiredPortionOfExcessMCIT = expiredPortionOfExcessMCIT;
	}

	public long getExcessMCITAppliedCurrently() {
		return excessMCITAppliedCurrently;
	}

	public void setExcessMCITAppliedCurrently(long excessMCITAppliedCurrently) {
		this.excessMCITAppliedCurrently = excessMCITAppliedCurrently;
	}

	public long getBalanceOfExcessMCIT() {
		return balanceOfExcessMCIT;
	}

	public void setBalanceOfExcessMCIT(long balanceOfExcessMCIT) {
		this.balanceOfExcessMCIT = balanceOfExcessMCIT;
	}
	
	
	
}
