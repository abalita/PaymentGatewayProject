package com.ccci.ebirforms.paymentgateway.form.bean.attachments;


/**
 * @author santosj
 *
 */

public class OtherAmortizations {

	private String advAndPromotionAmortization;
	private String advAndProAmortExempt;
	private String advAndProAmortSpecial;
	private String advAndProAmortRegular;
	private String advAndProAmortTotal;
	private int sequenceNumber;
	
	
	public OtherAmortizations(int sequenceNumber) {
		this.setSequenceNumber(sequenceNumber);
	}
	public OtherAmortizations() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the advAndPromotionAmortization
	 */
	public String getAdvAndPromotionAmortization() {
		return advAndPromotionAmortization;
	}
	/**
	 * @param advAndPromotionAmortization the advAndPromotionAmortization to set
	 */
	public void setAdvAndPromotionAmortization(
			String advAndPromotionAmortization) {
		this.advAndPromotionAmortization = advAndPromotionAmortization;
	}
	/**
	 * @return the advAndProAmortExempt
	 */
	public String getAdvAndProAmortExempt() {
		return advAndProAmortExempt;
	}
	/**
	 * @param advAndProAmortExempt the advAndProAmortExempt to set
	 */
	public void setAdvAndProAmortExempt(String advAndProAmortExempt) {
		this.advAndProAmortExempt = advAndProAmortExempt;
	}
	/**
	 * @return the advAndProAmortSpecial
	 */
	public String getAdvAndProAmortSpecial() {
		return advAndProAmortSpecial;
	}
	/**
	 * @param advAndProAmortSpecial the advAndProAmortSpecial to set
	 */
	public void setAdvAndProAmortSpecial(String advAndProAmortSpecial) {
		this.advAndProAmortSpecial = advAndProAmortSpecial;
	}
	/**
	 * @return the advAndProAmortRegular
	 */
	public String getAdvAndProAmortRegular() {
		return advAndProAmortRegular;
	}
	/**
	 * @param advAndProAmortRegular the advAndProAmortRegular to set
	 */
	public void setAdvAndProAmortRegular(String advAndProAmortRegular) {
		this.advAndProAmortRegular = advAndProAmortRegular;
	}
	/**
	 * @return the advertisingAndPromotionAmortizationTotal
	 */
	public String getAdvAndProAmortTotal() {
		return advAndProAmortTotal;
	}
	/**
	 * @param advertisingAndPromotionAmortizationTotal the advertisingAndPromotionAmortizationTotal to set
	 */
	public void setAdvAndProAmortTotal(
			String advAndProAmortTotal) {
		this.advAndProAmortTotal = advAndProAmortTotal;
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
