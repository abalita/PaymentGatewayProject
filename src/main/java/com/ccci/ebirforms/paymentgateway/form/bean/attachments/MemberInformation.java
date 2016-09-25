package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Model for 1702RT Schedule 11 Stockholder/Partner/Member Information additional attachments.
 */
public class MemberInformation {
	private double sequenceNumber;
	private String registeredName;
	private String tin;
	private double capitalContribution;
	private double percentToTotal;

	public String getRegisteredName() {
		return registeredName;
	}
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public double getCapitalContribution() {
		return capitalContribution;
	}
	public void setCapitalContribution(double capitalContribution) {
		this.capitalContribution = capitalContribution;
	}
	public double getPercentToTotal() {
		return percentToTotal;
	}
	public void setPercentToTotal(double percentToTotal) {
		this.percentToTotal = percentToTotal;
	}
	public double getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(double sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
}
