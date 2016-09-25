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
public class EmployerCompensationBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private long totalCompensationIncome;
	private long totalTaxWithheld;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the totalCompensationIncome
	 */
	public long getTotalCompensationIncome() {
		return totalCompensationIncome;
	}

	/**
	 * @param totalCompensationIncome the totalCompensationIncome to set
	 */
	public void setTotalCompensationIncome(long totalCompensationIncome) {
		this.totalCompensationIncome = totalCompensationIncome;
	}

	/**
	 * @return the totalTaxWithheld
	 */
	public long getTotalTaxWithheld() {
		return totalTaxWithheld;
	}

	/**
	 * @param totalTaxWithheld the totalTaxWithheld to set
	 */
	public void setTotalTaxWithheld(long totalTaxWithheld) {
		this.totalTaxWithheld = totalTaxWithheld;
	}
	
	
}
