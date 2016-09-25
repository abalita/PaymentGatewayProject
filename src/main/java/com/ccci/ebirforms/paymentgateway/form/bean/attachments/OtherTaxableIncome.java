/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class OtherTaxableIncome {

	private int sequenceNumber; 
	private String description;
	private String totalExempt;
	private String totalSpecial;
	private String totalRegular;
	private String totalTotal;

	
	public OtherTaxableIncome(int sequenceNumber) {
		this.setSequenceNumber(sequenceNumber);
	}
	public OtherTaxableIncome() {
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
	 * @return the totalExempt
	 */
	public String getTotalExempt() {
		return totalExempt;
	}
	/**
	 * @param totalExempt the totalExempt to set
	 */
	public void setTotalExempt(String totalExempt) {
		this.totalExempt = totalExempt;
	}
	/**
	 * @return the totalSpecial
	 */
	public String getTotalSpecial() {
		return totalSpecial;
	}
	/**
	 * @param totalSpecial the totalSpecial to set
	 */
	public void setTotalSpecial(String totalSpecial) {
		this.totalSpecial = totalSpecial;
	}
	/**
	 * @return the totalRegular
	 */
	public String getTotalRegular() {
		return totalRegular;
	}
	/**
	 * @param totalRegular the totalRegular to set
	 */
	public void setTotalRegular(String totalRegular) {
		this.totalRegular = totalRegular;
	}
	/**
	 * @return the totalTotal
	 */
	public String getTotalTotal() {
		return totalTotal;
	}
	/**
	 * @param totalTotal the totalTotal to set
	 */
	public void setTotalTotal(String totalTotal) {
		this.totalTotal = totalTotal;
	}
	
}
