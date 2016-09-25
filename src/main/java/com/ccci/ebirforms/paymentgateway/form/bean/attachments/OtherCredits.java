package com.ccci.ebirforms.paymentgateway.form.bean.attachments;


/**
 * @author santosj
 *
 */

public class OtherCredits {
	
	private String creditDesc;
	private String creditExempt;
	private String creditSpecial;
	private String creditRegular;
	private String creditTotal;
	private int sequenceNumber;
	
	
	
	
	public OtherCredits(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}
	public OtherCredits() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the creditDesc
	 */
	public String getCreditDesc() {
		return creditDesc;
	}
	/**
	 * @param creditDesc the creditDesc to set
	 */
	public void setCreditDesc(String creditDesc) {
		this.creditDesc = creditDesc;
	}
	/**
	 * @return the creditExempt
	 */
	public String getCreditExempt() {
		return creditExempt;
	}
	/**
	 * @param creditExempt the creditExempt to set
	 */
	public void setCreditExempt(String creditExempt) {
		this.creditExempt = creditExempt;
	}
	/**
	 * @return the creditSpecial
	 */
	public String getCreditSpecial() {
		return creditSpecial;
	}
	/**
	 * @param creditSpecial the creditSpecial to set
	 */
	public void setCreditSpecial(String creditSpecial) {
		this.creditSpecial = creditSpecial;
	}
	/**
	 * @return the creditRegular
	 */
	public String getCreditRegular() {
		return creditRegular;
	}
	/**
	 * @param creditRegular the creditRegular to set
	 */
	public void setCreditRegular(String creditRegular) {
		this.creditRegular = creditRegular;
	}
	/**
	 * @return the creditTotal
	 */
	public String getCreditTotal() {
		return creditTotal;
	}
	/**
	 * @param creditTotal the creditTotal to set
	 */
	public void setCreditTotal(String creditTotal) {
		this.creditTotal = creditTotal;
	}
	/**
	 * @return the sequenceNumber
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
}
