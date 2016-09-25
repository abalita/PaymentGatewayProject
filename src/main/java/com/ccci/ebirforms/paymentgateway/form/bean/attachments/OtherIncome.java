/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class OtherIncome {

	private String sequenceNumber; 
	
	private String description;

	private String actualAmount;

	private String finalTaxWithheld;
	
	private int numeral;

	public OtherIncome() {

	}

	public OtherIncome(int numeral) {
		this.numeral = numeral;
	}

	/**
	 * @return the description
	 */
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
	 * @return the actualAmount
	 */
	public String getActualAmount() {
		return this.actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the finalTaxWithheld
	 */
	public String getFinalTaxWithheld() {
		return this.finalTaxWithheld;
	}

	/**
	 * @param finalTaxWithheld the finalTaxWithheld to set
	 */
	public void setFinalTaxWithheld(String finalTaxWithheld) {
		this.finalTaxWithheld = finalTaxWithheld;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private String getSingleAlphaCode(int num) {
		return Character.toString(alphabet[num]);
	}
	public String getAlphaCode() {
	    if (numeral > 25) {
	        return getSingleAlphaCode(numeral / 26 - 1) + getSingleAlphaCode(numeral % 26);
	    }
	    return getSingleAlphaCode(numeral);
	}
	
	public String getNumeralCode() {
		return "#" + (numeral + 1);
	}

	public int getNumeral() {
		return numeral;
	}

	public void setNumeral(int numeral) {
		this.numeral = numeral;
	}

}
