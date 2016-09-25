package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxReliefAvailmentBean implements Serializable {
    
    public TaxReliefAvailmentBean(){}
    
    public TaxReliefAvailmentBean(
                long regularIncomeTaxOtherwiseDue,
		long specialAllowableItemizedDeduction, 
                long specialTaxCredits, 
                long totalTaxReliefAvailment){
        
        this.regularIncomeTaxOtherwiseDue = regularIncomeTaxOtherwiseDue;
        this.specialAllowableItemizedDeduction = specialAllowableItemizedDeduction;
        this.specialTaxCredits = specialTaxCredits;
        this.totalTaxReliefAvailment=totalTaxReliefAvailment;
    }
	
	private static final long serialVersionUID = 1L;
	
	private long regularIncomeTaxOtherwiseDue;
	private long specialAllowableItemizedDeduction;
	private long specialTaxCredits;
	private long totalTaxReliefAvailment;
	
	
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }



	public long getRegularIncomeTaxOtherwiseDue() {
		return regularIncomeTaxOtherwiseDue;
	}



	public void setRegularIncomeTaxOtherwiseDue(long regularIncomeTaxOtherwiseDue) {
		this.regularIncomeTaxOtherwiseDue = regularIncomeTaxOtherwiseDue;
	}



	public long getSpecialAllowableItemizedDeduction() {
		return specialAllowableItemizedDeduction;
	}



	public void setSpecialAllowableItemizedDeduction(
			long specialAllowableItemizedDeduction) {
		this.specialAllowableItemizedDeduction = specialAllowableItemizedDeduction;
	}



	public long getSpecialTaxCredits() {
		return specialTaxCredits;
	}



	public void setSpecialTaxCredits(long specialTaxCredits) {
		this.specialTaxCredits = specialTaxCredits;
	}



	public long getTotalTaxReliefAvailment() {
		return totalTaxReliefAvailment;
	}



	public void setTotalTaxReliefAvailment(long totalTaxReliefAvailment) {
		this.totalTaxReliefAvailment = totalTaxReliefAvailment;
	}

}
