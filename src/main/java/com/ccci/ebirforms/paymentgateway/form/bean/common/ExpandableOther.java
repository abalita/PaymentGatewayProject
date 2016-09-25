package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExpandableOther implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String otherExpandableDesc;
	private long otherExpandableAmount;
	
	//for 1702
	private long otherExpandableAmountSpecial;
	private long otherExpandableAmountRegular;
	private long otherExpandableAmountTotal;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the otherExpandableAmount
	 */
	public long getOtherExpandableAmount() {
		return otherExpandableAmount;
	}

	/**
	 * @param otherExpandableAmount the otherExpandableAmount to set
	 */
	public void setOtherExpandableAmount(long otherExpandableAmount) {
		this.otherExpandableAmount = otherExpandableAmount;
	}

	public String getOtherExpandableDesc() {
		return otherExpandableDesc;
	}

	public void setOtherExpandableDesc(String otherExpandableDesc) {
		this.otherExpandableDesc = otherExpandableDesc;
	}

	

	public long getOtherExpandableAmountSpecial() {
		return otherExpandableAmountSpecial;
	}

	public void setOtherExpandableAmountSpecial(long otherExpandableAmountSpecial) {
		this.otherExpandableAmountSpecial = otherExpandableAmountSpecial;
	}

	public long getOtherExpandableAmountRegular() {
		return otherExpandableAmountRegular;
	}

	public void setOtherExpandableAmountRegular(long otherExpandableAmountRegular) {
		this.otherExpandableAmountRegular = otherExpandableAmountRegular;
	}

	public long getOtherExpandableAmountTotal() {
		return otherExpandableAmountTotal;
	}

	public void setOtherExpandableAmountTotal(long otherExpandableAmountTotal) {
		this.otherExpandableAmountTotal = otherExpandableAmountTotal;
	}

	
	
	
}
