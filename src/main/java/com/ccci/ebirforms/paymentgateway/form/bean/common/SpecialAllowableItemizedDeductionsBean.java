package com.ccci.ebirforms.paymentgateway.form.bean.common;


import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecialAllowableItemizedDeductionsBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String specialAllowableItemizedDeductionsDescription1;
	private String specialAllowableItemizedDeductionsDescription2;
	private String specialAllowableItemizedDeductionsDescription3;
	private String specialAllowableItemizedDeductionsDescription4;
	private String specialAllowableItemizedDeductionsLegalBasis1;
	private String specialAllowableItemizedDeductionsLegalBasis2;
	private String specialAllowableItemizedDeductionsLegalBasis3;
	private String specialAllowableItemizedDeductionsLegalBasis4;
	private long specialAllowableItemizedDeductionsAmount1;
	private long specialAllowableItemizedDeductionsAmount2;
	private long specialAllowableItemizedDeductionsAmount3;
	private long specialAllowableItemizedDeductionsAmount4;
	
	private long totalSpecialAllowableItemizedDeductions;
	
	private List<SpecialAllowableBean> listSched5AdditionalAttachments;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	public String getSpecialAllowableItemizedDeductionsDescription1() {
		return specialAllowableItemizedDeductionsDescription1;
	}

	public void setSpecialAllowableItemizedDeductionsDescription1(
			String specialAllowableItemizedDeductionsDescription1) {
		this.specialAllowableItemizedDeductionsDescription1 = specialAllowableItemizedDeductionsDescription1;
	}

	public String getSpecialAllowableItemizedDeductionsDescription2() {
		return specialAllowableItemizedDeductionsDescription2;
	}

	public void setSpecialAllowableItemizedDeductionsDescription2(
			String specialAllowableItemizedDeductionsDescription2) {
		this.specialAllowableItemizedDeductionsDescription2 = specialAllowableItemizedDeductionsDescription2;
	}

	public String getSpecialAllowableItemizedDeductionsDescription3() {
		return specialAllowableItemizedDeductionsDescription3;
	}

	public void setSpecialAllowableItemizedDeductionsDescription3(
			String specialAllowableItemizedDeductionsDescription3) {
		this.specialAllowableItemizedDeductionsDescription3 = specialAllowableItemizedDeductionsDescription3;
	}

	public String getSpecialAllowableItemizedDeductionsDescription4() {
		return specialAllowableItemizedDeductionsDescription4;
	}

	public void setSpecialAllowableItemizedDeductionsDescription4(
			String specialAllowableItemizedDeductionsDescription4) {
		this.specialAllowableItemizedDeductionsDescription4 = specialAllowableItemizedDeductionsDescription4;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis1() {
		return specialAllowableItemizedDeductionsLegalBasis1;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis1(
			String specialAllowableItemizedDeductionsLegalBasis1) {
		this.specialAllowableItemizedDeductionsLegalBasis1 = specialAllowableItemizedDeductionsLegalBasis1;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis2() {
		return specialAllowableItemizedDeductionsLegalBasis2;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis2(
			String specialAllowableItemizedDeductionsLegalBasis2) {
		this.specialAllowableItemizedDeductionsLegalBasis2 = specialAllowableItemizedDeductionsLegalBasis2;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis3() {
		return specialAllowableItemizedDeductionsLegalBasis3;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis3(
			String specialAllowableItemizedDeductionsLegalBasis3) {
		this.specialAllowableItemizedDeductionsLegalBasis3 = specialAllowableItemizedDeductionsLegalBasis3;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis4() {
		return specialAllowableItemizedDeductionsLegalBasis4;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis4(
			String specialAllowableItemizedDeductionsLegalBasis4) {
		this.specialAllowableItemizedDeductionsLegalBasis4 = specialAllowableItemizedDeductionsLegalBasis4;
	}

	public long getSpecialAllowableItemizedDeductionsAmount1() {
		return specialAllowableItemizedDeductionsAmount1;
	}

	public void setSpecialAllowableItemizedDeductionsAmount1(
			long specialAllowableItemizedDeductionsAmount1) {
		this.specialAllowableItemizedDeductionsAmount1 = specialAllowableItemizedDeductionsAmount1;
	}

	public long getSpecialAllowableItemizedDeductionsAmount2() {
		return specialAllowableItemizedDeductionsAmount2;
	}

	public void setSpecialAllowableItemizedDeductionsAmount2(
			long specialAllowableItemizedDeductionsAmount2) {
		this.specialAllowableItemizedDeductionsAmount2 = specialAllowableItemizedDeductionsAmount2;
	}

	public long getSpecialAllowableItemizedDeductionsAmount3() {
		return specialAllowableItemizedDeductionsAmount3;
	}

	public void setSpecialAllowableItemizedDeductionsAmount3(
			long specialAllowableItemizedDeductionsAmount3) {
		this.specialAllowableItemizedDeductionsAmount3 = specialAllowableItemizedDeductionsAmount3;
	}

	public long getSpecialAllowableItemizedDeductionsAmount4() {
		return specialAllowableItemizedDeductionsAmount4;
	}

	public void setSpecialAllowableItemizedDeductionsAmount4(
			long specialAllowableItemizedDeductionsAmount4) {
		this.specialAllowableItemizedDeductionsAmount4 = specialAllowableItemizedDeductionsAmount4;
	}

	public long getTotalSpecialAllowableItemizedDeductions() {
		return totalSpecialAllowableItemizedDeductions;
	}

	public void setTotalSpecialAllowableItemizedDeductions(
			long totalSpecialAllowableItemizedDeductions) {
		this.totalSpecialAllowableItemizedDeductions = totalSpecialAllowableItemizedDeductions;
	}

	public List<SpecialAllowableBean> getListSched5AdditionalAttachments() {
		return listSched5AdditionalAttachments;
	}

	public void setListSched5AdditionalAttachments(
			List<SpecialAllowableBean> listSched5AdditionalAttachments) {
		this.listSched5AdditionalAttachments = listSched5AdditionalAttachments;
	}



	
	

}
