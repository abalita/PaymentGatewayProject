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
public class OtherExemptIncomeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String otherIncome;
	private double actualAmount;
	
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
	public double getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(double actualAmount) {
		this.actualAmount = actualAmount;
	}
	
}
