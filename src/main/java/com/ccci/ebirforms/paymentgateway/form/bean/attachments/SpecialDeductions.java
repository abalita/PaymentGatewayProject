/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Model for Special Deductions attachment.
 * @author guillek
 *
 */
public class SpecialDeductions  {



	private String legalBasis;
	private String description;
	private String value;
	private int sequenceNumber;

	public SpecialDeductions(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}

	public SpecialDeductions() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the legalBasis
	 */
	public String getLegalBasis() {
		return this.legalBasis;
	}

	/**
	 * @param legalBasis the legalBasis to set
	 */
	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
