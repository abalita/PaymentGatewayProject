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
public class PersonalPropertyReceivedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String personalPropertyDesc;
	private String personalPropertyTransferMode;
	private String personalPropertyCARNo;
	private double personalPropertyActualAmount;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the personalPropertyDesc
	 */
	public String getPersonalPropertyDesc() {
		return personalPropertyDesc;
	}

	/**
	 * @param personalPropertyDesc the personalPropertyDesc to set
	 */
	public void setPersonalPropertyDesc(String personalPropertyDesc) {
		this.personalPropertyDesc = personalPropertyDesc;
	}

	/**
	 * @return the personalPropertyTransferMode
	 */
	public String getPersonalPropertyTransferMode() {
		return personalPropertyTransferMode;
	}

	/**
	 * @param personalPropertyTransferMode the personalPropertyTransferMode to set
	 */
	public void setPersonalPropertyTransferMode(String personalPropertyTransferMode) {
		this.personalPropertyTransferMode = personalPropertyTransferMode;
	}

	/**
	 * @return the personalPropertyCARNo
	 */
	public String getPersonalPropertyCARNo() {
		return personalPropertyCARNo;
	}

	/**
	 * @param personalPropertyCARNo the personalPropertyCARNo to set
	 */
	public void setPersonalPropertyCARNo(String personalPropertyCARNo) {
		this.personalPropertyCARNo = personalPropertyCARNo;
	}

	/**
	 * @return the personalPropertyActualAmount
	 */
	public double getPersonalPropertyActualAmount() {
		return personalPropertyActualAmount;
	}

	/**
	 * @param personalPropertyActualAmount the personalPropertyActualAmount to set
	 */
	public void setPersonalPropertyActualAmount(double personalPropertyActualAmount) {
		this.personalPropertyActualAmount = personalPropertyActualAmount;
	}
}
