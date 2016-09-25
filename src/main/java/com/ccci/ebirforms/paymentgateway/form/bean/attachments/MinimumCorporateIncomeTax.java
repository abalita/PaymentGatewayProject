package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Model for 1702RT Schedule 8 Computation of Minimum Corporate Income Tax.
 */
public class MinimumCorporateIncomeTax {
	private double sequenceNumber;
	private String mcitYear;
	private double normalIncomeTax;
	private double mcit;
	private double excessMCITOverNormalTax;
	private double excessMCITAppliedPreviously;
	private double expiredPortionOfExcessMCIT;
	private double excessMCITAppliedCurrently;
	private double balanceOfExcessMCIT;

	public String getMcitYear() {
		return mcitYear;
	}
	public void setMcitYear(String mcitYear) {
		this.mcitYear = mcitYear;
	}
	public double getNormalIncomeTax() {
		return normalIncomeTax;
	}
	public void setNormalIncomeTax(double normalIncomeTax) {
		this.normalIncomeTax = normalIncomeTax;
	}
	public double getMcit() {
		return mcit;
	}
	public void setMcit(double mcit) {
		this.mcit = mcit;
	}
	public double getExcessMCITOverNormalTax() {
		return excessMCITOverNormalTax;
	}
	public void setExcessMCITOverNormalTax(double excessMCITOverNormalTax) {
		this.excessMCITOverNormalTax = excessMCITOverNormalTax;
	}
	public double getExcessMCITAppliedPreviously() {
		return excessMCITAppliedPreviously;
	}
	public void setExcessMCITAppliedPreviously(double excessMCITAppliedPreviously) {
		this.excessMCITAppliedPreviously = excessMCITAppliedPreviously;
	}
	public double getExpiredPortionOfExcessMCIT() {
		return expiredPortionOfExcessMCIT;
	}
	public void setExpiredPortionOfExcessMCIT(double expiredPortionOfExcessMCIT) {
		this.expiredPortionOfExcessMCIT = expiredPortionOfExcessMCIT;
	}
	public double getExcessMCITAppliedCurrently() {
		return excessMCITAppliedCurrently;
	}
	public void setExcessMCITAppliedCurrently(double excessMCITAppliedCurrently) {
		this.excessMCITAppliedCurrently = excessMCITAppliedCurrently;
	}
	public double getBalanceOfExcessMCIT() {
		return balanceOfExcessMCIT;
	}
	public void setBalanceOfExcessMCIT(double balanceOfExcessMCIT) {
		this.balanceOfExcessMCIT = balanceOfExcessMCIT;
	}
	public double getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(double sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
}
