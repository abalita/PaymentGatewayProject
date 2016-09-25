/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

import java.util.Date;

/**
 * @author guillek
 *
 */
public class SharesOfStockSalesExchange extends OtherIncome{

	private String kind;

	private String stockCertificate;

	private String numberOfShares;

	private Date dateOfIssue;
	
	private String authorizingRegistration;

	public SharesOfStockSalesExchange() {

	}

	public SharesOfStockSalesExchange(int numeral) {
		this.setNumeral(numeral);
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return the stockCertificate
	 */
	public String getStockCertificate() {
		return this.stockCertificate;
	}

	/**
	 * @param stockCertificate the stockCertificate to set
	 */
	public void setStockCertificate(String stockCertificate) {
		this.stockCertificate = stockCertificate;
	}

	/**
	 * @return the numberOfShares
	 */
	public String getNumberOfShares() {
		return this.numberOfShares;
	}

	/**
	 * @param numberOfShares the numberOfShares to set
	 */
	public void setNumberOfShares(String numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	/**
	 * @return the dateOfIssue
	 */
	public Date getDateOfIssue() {
		return this.dateOfIssue;
	}

	/**
	 * @param dateOfIssue the dateOfIssue to set
	 */
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getAuthorizingRegistration() {
		return authorizingRegistration;
	}

	public void setAuthorizingRegistration(String authorizingRegistration) {
		this.authorizingRegistration = authorizingRegistration;
	}
}
