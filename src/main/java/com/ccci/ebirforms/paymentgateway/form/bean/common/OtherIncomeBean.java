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
public class OtherIncomeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String otherIncome;
	private long actualAmount;
	private long otherIncomeTaxWithheld;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the otherIncome
	 */
	public String getOtherIncome() {
		return otherIncome;
	}

	/**
	 * @param otherIncome the otherIncome to set
	 */
	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
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
	 * @return the otherIncomeTaxWithheld
	 */
	public long getOtherIncomeTaxWithheld() {
		return otherIncomeTaxWithheld;
	}

	/**
	 * @param otherIncomeTaxWithheld the otherIncomeTaxWithheld to set
	 */
	public void setOtherIncomeTaxWithheld(long otherIncomeTaxWithheld) {
		this.otherIncomeTaxWithheld = otherIncomeTaxWithheld;
	}
	
}
