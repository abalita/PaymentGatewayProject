/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * Abstract model for Form Attachments.
 * @author guillek
 *
 */
public abstract class AbstractFormAttachment {

	private Long referenceNumber;

	private String tin;

	private String name;

	private String taxRegime;

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the taxRegime
	 */
	public String getTaxRegime() {
		return this.taxRegime;
	}

	/**
	 * @param taxRegime the taxRegime to set
	 */
	public void setTaxRegime(String taxRegime) {
		this.taxRegime = taxRegime;
	}

	/**
	 * @return the tin
	 */
	public String getTin() {
		return this.tin;
	}

	/**
	 * @param tin the tin to set
	 */
	public void setTin(String tin) {
		this.tin = tin;
	}

	/**
	 * @return the registerdName
	 */
	public String getRegisterdName() {
		return this.name;
	}

	/**
	 * @param registerdName the registerdName to set
	 */
	public void setRegisterdName(String registerdName) {
		this.name = registerdName;
	}

	/**
	 * @return the referenceNumber
	 */
	public Long getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(Long referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	

}
