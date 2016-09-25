/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RealPropertySale implements Serializable {

	private static final long serialVersionUID = 1L;
	private String propDescription;
	private String taxDeclNo;
	private String carNo;
	private long actualAmount;
	private long propertyTaxWithheld;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the propDescription
	 */
	public String getPropDescription() {
		return propDescription;
	}

	/**
	 * @param propDescription the propDescription to set
	 */
	public void setPropDescription(String propDescription) {
		this.propDescription = propDescription;
	}

	/**
	 * @return the taxDeclNo
	 */
	public String getTaxDeclNo() {
		return taxDeclNo;
	}

	/**
	 * @param taxDeclNo the taxDeclNo to set
	 */
	public void setTaxDeclNo(String taxDeclNo) {
		this.taxDeclNo = taxDeclNo;
	}

	/**
	 * @return the carNo
	 */
	public String getCarNo() {
		return carNo;
	}

	/**
	 * @param carNo the carNo to set
	 */
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	/**
	 * @return the actualAmount
	 */
	public long getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(long actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the propertyTaxWithheld
	 */
	public long getPropertyTaxWithheld() {
		return propertyTaxWithheld;
	}

	/**
	 * @param propertyTaxWithheld the propertyTaxWithheld to set
	 */
	public void setPropertyTaxWithheld(long propertyTaxWithheld) {
		this.propertyTaxWithheld = propertyTaxWithheld;
	}
}
