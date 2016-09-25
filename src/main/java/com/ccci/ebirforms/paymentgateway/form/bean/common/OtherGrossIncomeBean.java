/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class OtherGrossIncomeBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String otherGrossIncomeDesc;
	private String otherGrossIncomeType;
	private long otherGrossIncomeExempt;
	private long otherGrossIncomeActualAmt;
	private long otherGrossIncomeFinalTaxWthldPd;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	public String getOtherGrossIncomeDesc() {
		return otherGrossIncomeDesc;
	}

	public void setOtherGrossIncomeDesc(String otherGrossIncomeDesc) {
		this.otherGrossIncomeDesc = otherGrossIncomeDesc;
	}

	public long getOtherGrossIncomeExempt() {
		return otherGrossIncomeExempt;
	}

	public void setOtherGrossIncomeExempt(long otherGrossIncomeExempt) {
		this.otherGrossIncomeExempt = otherGrossIncomeExempt;
	}

	public long getOtherGrossIncomeActualAmt() {
		return otherGrossIncomeActualAmt;
	}

	public void setOtherGrossIncomeActualAmt(long otherGrossIncomeActualAmt) {
		this.otherGrossIncomeActualAmt = otherGrossIncomeActualAmt;
	}

	public long getOtherGrossIncomeFinalTaxWthldPd() {
		return otherGrossIncomeFinalTaxWthldPd;
	}

	public void setOtherGrossIncomeFinalTaxWthldPd(
			long otherGrossIncomeFinalTaxWthldPd) {
		this.otherGrossIncomeFinalTaxWthldPd = otherGrossIncomeFinalTaxWthldPd;
	}

	public String getOtherGrossIncomeType() {
		return otherGrossIncomeType;
	}

	public void setOtherGrossIncomeType(String otherGrossIncomeType) {
		this.otherGrossIncomeType = otherGrossIncomeType;
	}
	
	
}
