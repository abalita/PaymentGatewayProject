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
public class GrossIncomeExemptFromIncomeTaxBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long proceedsOfInsurance;
	private long returnOfPremium;
	private long retirementBenefitsEtc;
	private long totalFinalTaxWithheldOrPaid;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the proceedsOfInsurance
	 */
	public long getProceedsOfInsurance() {
		return proceedsOfInsurance;
	}

	/**
	 * @param proceedsOfInsurance the proceedsOfInsurance to set
	 */
	public void setProceedsOfInsurance(long proceedsOfInsurance) {
		this.proceedsOfInsurance = proceedsOfInsurance;
	}

	/**
	 * @return the returnOfPremium
	 */
	public long getReturnOfPremium() {
		return returnOfPremium;
	}

	/**
	 * @param returnOfPremium the returnOfPremium to set
	 */
	public void setReturnOfPremium(long returnOfPremium) {
		this.returnOfPremium = returnOfPremium;
	}

	/**
	 * @return the retirementBenefitsEtc
	 */
	public long getRetirementBenefitsEtc() {
		return retirementBenefitsEtc;
	}

	/**
	 * @param retirementBenefitsEtc the retirementBenefitsEtc to set
	 */
	public void setRetirementBenefitsEtc(long retirementBenefitsEtc) {
		this.retirementBenefitsEtc = retirementBenefitsEtc;
	}

	/**
	 * @return the totalFinalTaxWithheldOrPaid
	 */
	public long getTotalFinalTaxWithheldOrPaid() {
		return totalFinalTaxWithheldOrPaid;
	}

	/**
	 * @param totalFinalTaxWithheldOrPaid the totalFinalTaxWithheldOrPaid to set
	 */
	public void setTotalFinalTaxWithheldOrPaid(long totalFinalTaxWithheldOrPaid) {
		this.totalFinalTaxWithheldOrPaid = totalFinalTaxWithheldOrPaid;
	}
	
}
