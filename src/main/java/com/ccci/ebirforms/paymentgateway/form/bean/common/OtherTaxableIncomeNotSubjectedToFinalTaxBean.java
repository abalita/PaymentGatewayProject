package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OtherTaxableIncomeNotSubjectedToFinalTaxBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String otherTaxableIncomeNotSubjectToFinalTaxDescFirst;
	private String otherTaxableIncomeNotSubjectToFinalTaxDescSecond;
	private String otherTaxableIncomeNotSubjectToFinalTaxDescThird;
	
	private long otherTaxableIncomeNotSubjectToFinalTaxValueFirst;
	private long otherTaxableIncomeNotSubjectToFinalTaxValueSecond;
	private long otherTaxableIncomeNotSubjectToFinalTaxValueThird;
	private long otherTaxableIncomeNotSubjectToFinalTaxValueTotal;
	
	private List<ExpandableOther> otherTaxableIncomeNotSubjectToFinalTaxValue;
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	public String getOtherTaxableIncomeNotSubjectToFinalTaxDescFirst() {
		return otherTaxableIncomeNotSubjectToFinalTaxDescFirst;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxDescFirst(
			String otherTaxableIncomeNotSubjectToFinalTaxDescFirst) {
		this.otherTaxableIncomeNotSubjectToFinalTaxDescFirst = otherTaxableIncomeNotSubjectToFinalTaxDescFirst;
	}
	public String getOtherTaxableIncomeNotSubjectToFinalTaxDescSecond() {
		return otherTaxableIncomeNotSubjectToFinalTaxDescSecond;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxDescSecond(
			String otherTaxableIncomeNotSubjectToFinalTaxDescSecond) {
		this.otherTaxableIncomeNotSubjectToFinalTaxDescSecond = otherTaxableIncomeNotSubjectToFinalTaxDescSecond;
	}
	public String getOtherTaxableIncomeNotSubjectToFinalTaxDescThird() {
		return otherTaxableIncomeNotSubjectToFinalTaxDescThird;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxDescThird(
			String otherTaxableIncomeNotSubjectToFinalTaxDescThird) {
		this.otherTaxableIncomeNotSubjectToFinalTaxDescThird = otherTaxableIncomeNotSubjectToFinalTaxDescThird;
	}
	public long getOtherTaxableIncomeNotSubjectToFinalTaxValueFirst() {
		return otherTaxableIncomeNotSubjectToFinalTaxValueFirst;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxValueFirst(
			long otherTaxableIncomeNotSubjectToFinalTaxValueFirst) {
		this.otherTaxableIncomeNotSubjectToFinalTaxValueFirst = otherTaxableIncomeNotSubjectToFinalTaxValueFirst;
	}
	public long getOtherTaxableIncomeNotSubjectToFinalTaxValueSecond() {
		return otherTaxableIncomeNotSubjectToFinalTaxValueSecond;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxValueSecond(
			long otherTaxableIncomeNotSubjectToFinalTaxValueSecond) {
		this.otherTaxableIncomeNotSubjectToFinalTaxValueSecond = otherTaxableIncomeNotSubjectToFinalTaxValueSecond;
	}
	public long getOtherTaxableIncomeNotSubjectToFinalTaxValueThird() {
		return otherTaxableIncomeNotSubjectToFinalTaxValueThird;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxValueThird(
			long otherTaxableIncomeNotSubjectToFinalTaxValueThird) {
		this.otherTaxableIncomeNotSubjectToFinalTaxValueThird = otherTaxableIncomeNotSubjectToFinalTaxValueThird;
	}
	public long getOtherTaxableIncomeNotSubjectToFinalTaxValueTotal() {
		return otherTaxableIncomeNotSubjectToFinalTaxValueTotal;
	}
	public void setOtherTaxableIncomeNotSubjectToFinalTaxValueTotal(
			long otherTaxableIncomeNotSubjectToFinalTaxValueTotal) {
		this.otherTaxableIncomeNotSubjectToFinalTaxValueTotal = otherTaxableIncomeNotSubjectToFinalTaxValueTotal;
	}


	/**
	 * @return the otherTaxableIncomeNotSubjectToFinalTaxValue
	 */
	public List<ExpandableOther> getOtherTaxableIncomeNotSubjectToFinalTaxValue() {
		return otherTaxableIncomeNotSubjectToFinalTaxValue;
	}


	/**
	 * @param otherTaxableIncomeNotSubjectToFinalTaxValue the otherTaxableIncomeNotSubjectToFinalTaxValue to set
	 */
	public void setOtherTaxableIncomeNotSubjectToFinalTaxValue(
			List<ExpandableOther> otherTaxableIncomeNotSubjectToFinalTaxValue) {
		this.otherTaxableIncomeNotSubjectToFinalTaxValue = otherTaxableIncomeNotSubjectToFinalTaxValue;
	}
	

}
