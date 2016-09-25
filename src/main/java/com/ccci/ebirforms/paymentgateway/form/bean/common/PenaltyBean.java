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
public class PenaltyBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long surcharge;
	private long interest;
	private long compromise;
	private long totalPenalty;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the surcharge
	 */
	public long getSurcharge() {
		return surcharge;
	}

	/**
	 * @param surcharge the surcharge to set
	 */
	public void setSurcharge(long surcharge) {
		this.surcharge = surcharge;
	}

	/**
	 * @return the interest
	 */
	public long getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(long interest) {
		this.interest = interest;
	}

	/**
	 * @return the compromise
	 */
	public long getCompromise() {
		return compromise;
	}

	/**
	 * @param compromise the compromise to set
	 */
	public void setCompromise(long compromise) {
		this.compromise = compromise;
	}

	/**
	 * @return the totalPenalty
	 */
	public long getTotalPenalty() {
		return totalPenalty;
	}

	/**
	 * @param totalPenalty the totalPenalty to set
	 */
	public void setTotalPenalty(long totalPenalty) {
		this.totalPenalty = totalPenalty;
	}

	
}
