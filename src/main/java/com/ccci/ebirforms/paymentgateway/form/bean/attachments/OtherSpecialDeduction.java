package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class OtherSpecialDeduction {
	private String description;
	private String legalBasis;
	private String deductEx;
	private String deductSpecial;
	private String deductRegular;
	private String deductTotal;
	private int sequenceNumber;
	
	public OtherSpecialDeduction(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}
	
	public OtherSpecialDeduction() {
		// TODO Auto-generated constructor stub
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
	 * @return the legalBasis
	 */
	public String getLegalBasis() {
		return legalBasis;
	}
	/**
	 * @param legalBasis the legalBasis to set
	 */
	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
	}
	/**
	 * @return the deductEx
	 */
	public String getDeductEx() {
		return deductEx;
	}
	/**
	 * @param deductEx the deductEx to set
	 */
	public void setDeductEx(String deductEx) {
		this.deductEx = deductEx;
	}
	/**
	 * @return the deductSpecial
	 */
	public String getDeductSpecial() {
		return deductSpecial;
	}
	/**
	 * @param deductSpecial the deductSpecial to set
	 */
	public void setDeductSpecial(String deductSpecial) {
		this.deductSpecial = deductSpecial;
	}
	/**
	 * @return the deductRegular
	 */
	public String getDeductRegular() {
		return deductRegular;
	}
	/**
	 * @param deductRegular the deductRegular to set
	 */
	public void setDeductRegular(String deductRegular) {
		this.deductRegular = deductRegular;
	}
	/**
	 * @return the deductTotal
	 */
	public String getDeductTotal() {
		return deductTotal;
	}
	/**
	 * @param deductTotal the deductTotal to set
	 */
	public void setDeductTotal(String deductTotal) {
		this.deductTotal = deductTotal;
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
