/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Model for Net Operating Loss Cary Over (NOLCO) Form Attachment.
 * @author guillek
 *
 */
public class OperatingLoss {
	private String sequenceNumber;
	private int year;

	private double amount;

	private double nolcoAppliedPreviousYear;

	private double nolcoExpired;

	private double nolcoAppliedCurrentYear;

	private double netOperatingLossUnapplied;

	public OperatingLoss() {
		
	}
	public OperatingLoss(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getNolcoAppliedPreviousYear() {
		return nolcoAppliedPreviousYear;
	}
	public void setNolcoAppliedPreviousYear(double nolcoAppliedPreviousYear) {
		this.nolcoAppliedPreviousYear = nolcoAppliedPreviousYear;
	}
	public double getNolcoExpired() {
		return nolcoExpired;
	}
	public void setNolcoExpired(double nolcoExpired) {
		this.nolcoExpired = nolcoExpired;
	}
	public double getNolcoAppliedCurrentYear() {
		return nolcoAppliedCurrentYear;
	}
	public void setNolcoAppliedCurrentYear(double nolcoAppliedCurrentYear) {
		this.nolcoAppliedCurrentYear = nolcoAppliedCurrentYear;
	}
	public double getNetOperatingLossUnapplied() {
		return netOperatingLossUnapplied;
	}
	public void setNetOperatingLossUnapplied(double netOperatingLossUnapplied) {
		this.netOperatingLossUnapplied = netOperatingLossUnapplied;
	}
}
