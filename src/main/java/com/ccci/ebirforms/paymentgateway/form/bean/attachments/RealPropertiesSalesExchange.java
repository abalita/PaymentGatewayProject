/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class RealPropertiesSalesExchange extends OtherIncome{

	private String taxDeclaration;

	private String authorizingRegistration;

	public RealPropertiesSalesExchange() {

	}

	public RealPropertiesSalesExchange(int numeral) {
		this.setNumeral(numeral);
	}

	/**
	 * @return the taxDeclaration
	 */
	public String getTaxDeclaration() {
		return this.taxDeclaration;
	}

	/**
	 * @param taxDeclaration the taxDeclaration to set
	 */
	public void setTaxDeclaration(String taxDeclaration) {
		this.taxDeclaration = taxDeclaration;
	}

	/**
	 * @return the authorizingRegistration
	 */
	public String getAuthorizingRegistration() {
		return this.authorizingRegistration;
	}

	/**
	 * @param authorizingRegistration the authorizingRegistration to set
	 */
	public void setAuthorizingRegistration(String authorizingRegistration) {
		this.authorizingRegistration = authorizingRegistration;
	}

}
