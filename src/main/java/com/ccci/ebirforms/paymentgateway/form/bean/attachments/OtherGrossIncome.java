package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class OtherGrossIncome {

	private int sequenceNumber;
	private String description;
	private String exempt;
	private String acutal;
	private String finalTax;

	public OtherGrossIncome() {

	}

	public OtherGrossIncome(int sequenceNumber) {
		setSequenceNumber(sequenceNumber);
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the exempt
	 */
	public String getExempt() {
		return exempt;
	}
	/**
	 * @param exempt the exempt to set
	 */
	public void setExempt(String exempt) {
		this.exempt = exempt;
	}
	/**
	 * @return the acutal
	 */
	public String getAcutal() {
		return acutal;
	}
	/**
	 * @param acutal the acutal to set
	 */
	public void setAcutal(String acutal) {
		this.acutal = acutal;
	}
	/**
	 * @return the finalTax
	 */
	public String getFinalTax() {
		return finalTax;
	}
	/**
	 * @param finalTax the finalTax to set
	 */
	public void setFinalTax(String finalTax) {
		this.finalTax = finalTax;
	}

}
