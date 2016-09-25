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
public class CompensationSubject implements Serializable {

	private static final long serialVersionUID = 1L;

	private long actualFairMarketValue;
	private long finalTaxWithheld;
	//1701
	private String description;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the actualFairMarketValue
	 */
	public long getActualFairMarketValue() {
		return actualFairMarketValue;
	}

	/**
	 * @param actualFairMarketValue the actualFairMarketValue to set
	 */
	public void setActualFairMarketValue(long actualFairMarketValue) {
		this.actualFairMarketValue = actualFairMarketValue;
	}

	/**
	 * @return the finalTaxWithheld
	 */
	public long getFinalTaxWithheld() {
		return finalTaxWithheld;
	}

	/**
	 * @param finalTaxWithheld the finalTaxWithheld to set
	 */
	public void setFinalTaxWithheld(long finalTaxWithheld) {
		this.finalTaxWithheld = finalTaxWithheld;
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
	
}
