package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class OtherAdditionalAttachments {

	private int sequenceNumber;
	private String description;
	private String otherAttachmentExempt;
	private String otherAttachmentSpecial;
	private String otherAttachmentRegular;
	private String otherAttachmentTotal;
	
	
	public OtherAdditionalAttachments(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}
	public OtherAdditionalAttachments() {
		// TODO Auto-generated constructor stub
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
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the otherAttachmentSpecial
	 */
	public String getOtherAttachmentSpecial() {
		return otherAttachmentSpecial;
	}
	/**
	 * @param otherAttachmentSpecial the otherAttachmentSpecial to set
	 */
	public void setOtherAttachmentSpecial(String otherAttachmentSpecial) {
		this.otherAttachmentSpecial = otherAttachmentSpecial;
	}
	/**
	 * @return the otherAttachmentExempt
	 */
	public String getOtherAttachmentExempt() {
		return otherAttachmentExempt;
	}
	/**
	 * @param otherAttachmentExempt the otherAttachmentExempt to set
	 */
	public void setOtherAttachmentExempt(String otherAttachmentExempt) {
		this.otherAttachmentExempt = otherAttachmentExempt;
	}
	/**
	 * @return the otherAttachmentRegular
	 */
	public String getOtherAttachmentRegular() {
		return otherAttachmentRegular;
	}
	/**
	 * @param otherAttachmentRegular the otherAttachmentRegular to set
	 */
	public void setOtherAttachmentRegular(String otherAttachmentRegular) {
		this.otherAttachmentRegular = otherAttachmentRegular;
	}
	/**
	 * @return the otherAttachmentTotal
	 */
	public String getOtherAttachmentTotal() {
		return otherAttachmentTotal;
	}
	/**
	 * @param otherAttachmentTotal the otherAttachmentTotal to set
	 */
	public void setOtherAttachmentTotal(String otherAttachmentTotal) {
		this.otherAttachmentTotal = otherAttachmentTotal;
	}
	
	
}
