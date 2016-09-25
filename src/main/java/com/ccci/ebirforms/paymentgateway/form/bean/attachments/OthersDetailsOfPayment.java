/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

import java.util.Date;

/**
 * @author guillek
 *
 */
public class OthersDetailsOfPayment {

	private String othersDetailsPayment;
	private String othersDraweeBankAgency;
	private String othersNumber;
	private Date othersDate;
	private String othersAmount;
	private int sequenceNumber;

	public OthersDetailsOfPayment(int sequenceNumber) {
		this.setSequenceNumber(sequenceNumber);
	}

	/**
	 * @return the othersDetailsPayment
	 */
	public String getOthersDetailsPayment() {
		return othersDetailsPayment;
	}
	/**
	 * @param othersDetailsPayment the othersDetailsPayment to set
	 */
	public void setOthersDetailsPayment(String othersDetailsPayment) {
		this.othersDetailsPayment = othersDetailsPayment;
	}
	/**
	 * @return the othersDraweeBankAgency
	 */
	public String getOthersDraweeBankAgency() {
		return othersDraweeBankAgency;
	}
	/**
	 * @param othersDraweeBankAgency the othersDraweeBankAgency to set
	 */
	public void setOthersDraweeBankAgency(String othersDraweeBankAgency) {
		this.othersDraweeBankAgency = othersDraweeBankAgency;
	}
	/**
	 * @return the othersNumber
	 */
	public String getOthersNumber() {
		return othersNumber;
	}
	/**
	 * @param othersNumber the othersNumber to set
	 */
	public void setOthersNumber(String othersNumber) {
		this.othersNumber = othersNumber;
	}
	/**
	 * @return the othersAmount
	 */
	public String getOthersAmount() {
		return othersAmount;
	}
	/**
	 * @param othersAmount the othersAmount to set
	 */
	public void setOthersAmount(String othersAmount) {
		this.othersAmount = othersAmount;
	}
	/**
	 * @return the othersDate
	 */
	public Date getOthersDate() {
		return othersDate;
	}
	/**
	 * @param othersDate the othersDate to set
	 */
	public void setOthersDate(Date othersDate) {
		this.othersDate = othersDate;
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
