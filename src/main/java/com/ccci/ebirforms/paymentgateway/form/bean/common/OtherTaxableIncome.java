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
public class OtherTaxableIncome implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String otherTaxableIncomeDesc;
	private long otherTaxableIncomeAmount;
	private long otherTaxableIncomeAmountSps;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the otherTaxableIncomeDesc
	 */
	public String getOtherTaxableIncomeDesc() {
		return otherTaxableIncomeDesc;
	}

	/**
	 * @param otherTaxableIncomeDesc the otherTaxableIncomeDesc to set
	 */
	public void setOtherTaxableIncomeDesc(String otherTaxableIncomeDesc) {
		this.otherTaxableIncomeDesc = otherTaxableIncomeDesc;
	}

	/**
	 * @return the otherTaxableIncomeAmount
	 */
	public long getOtherTaxableIncomeAmount() {
		return otherTaxableIncomeAmount;
	}

	/**
	 * @param otherTaxableIncomeAmount the otherTaxableIncomeAmount to set
	 */
	public void setOtherTaxableIncomeAmount(long otherTaxableIncomeAmount) {
		this.otherTaxableIncomeAmount = otherTaxableIncomeAmount;
	}

	/**
	 * @return the otherTaxableIncomeAmountSps
	 */
	public long getOtherTaxableIncomeAmountSps() {
		return otherTaxableIncomeAmountSps;
	}

	/**
	 * @param otherTaxableIncomeAmountSps the otherTaxableIncomeAmountSps to set
	 */
	public void setOtherTaxableIncomeAmountSps(long otherTaxableIncomeAmountSps) {
		this.otherTaxableIncomeAmountSps = otherTaxableIncomeAmountSps;
	}
	
	
}
