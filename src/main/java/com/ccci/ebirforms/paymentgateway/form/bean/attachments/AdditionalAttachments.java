/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Model for additional attachments.
 * @author guillek
 *
 */
public class AdditionalAttachments {

	
	/** Item description. */
	private String description;

	/** Item description. */
	private String value;
	
	/** Item sequenceNumber. */
	private int sequenceNumber;
	
	

	public AdditionalAttachments(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}

	public AdditionalAttachments() {
		// TODO Auto-generated constructor stub
	}

	/** Item value. */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
