package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
@XmlRootElement(name="form1702MXBean")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxPayerActivityForTaxRelief implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String investmentPromotionAgency;
	private String legalBasis;
	private String registeredActivityProgram;
	private String specialTaxRate;
	private String specialTaxRateSpecialRateDec;
	private String specialTaxRateSpecialRateDisplay;
	
	// for 1702MX
	private Date startDate;
	private Date startDateSpecial;
	private Date startDateTaxRelief;
	
	private Date effectivityDateFrom;
	private Date effectivityDateTo;
	
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
	

	
	
	public Date getEffectivityDateFrom() {
		return effectivityDateFrom;
	}
	public void setEffectivityDateFrom(Date effectivityDateFrom) {
		this.effectivityDateFrom = effectivityDateFrom;
	}
	public Date getEffectivityDateTo() {
		return effectivityDateTo;
	}
	public void setEffectivityDateTo(Date effectivityDateTo) {
		this.effectivityDateTo = effectivityDateTo;
	}
	
	public String getSpecialTaxRate() {
		
		return specialTaxRate;
	}

	/**
	 * @param specialTaxRateSpecialRate
	 *            the specialTaxRateSpecialRate to set
	 */
	public void setSpecialTaxRate(String specialTaxRateSpecialRate) {
		
		this.specialTaxRate = specialTaxRateSpecialRate;
	}
	
	public String getSpecialTaxRateSpecialRateDec() {
		if(specialTaxRateSpecialRateDec != null){
			if(specialTaxRateSpecialRateDec.indexOf(".") >= 0){
				return specialTaxRateSpecialRateDec.substring(1);
			}
		} else {
			specialTaxRateSpecialRateDec = "0";
		}
		return specialTaxRateSpecialRateDec;
	}

	/**
	 * @param specialTaxRateSpecialRateDec the specialTaxRateSpecialRateDec to set
	 */
	public void setSpecialTaxRateSpecialRateDec(
			String specialTaxRateSpecialRateDec) {
		this.specialTaxRateSpecialRateDec = specialTaxRateSpecialRateDec;
	}
	
	public String getSpecialTaxRateSpecialRateDisplay() {
		return specialTaxRateSpecialRateDisplay;
	}

	/**
	 * @param specialTaxRateSpecialRateDisplay the specialTaxRateSpecialRateDisplay to set
	 */
	public void setSpecialTaxRateSpecialRateDisplay(
			String specialTaxRateSpecialRateDisplay) {
		this.specialTaxRateSpecialRateDisplay = specialTaxRateSpecialRateDisplay;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getStartDateSpecial() {
		return startDateSpecial;
	}


	public void setStartDateSpecial(Date startDateSpecial) {
		this.startDateSpecial = startDateSpecial;
	}


	public Date getStartDateTaxRelief() {
		return startDateTaxRelief;
	}


	public void setStartDateTaxRelief(Date startDateTaxRelief) {
		this.startDateTaxRelief = startDateTaxRelief;
	}




	public String getInvestmentPromotionAgency() {
		return investmentPromotionAgency;
	}




	public void setInvestmentPromotionAgency(String investmentPromotionAgency) {
		this.investmentPromotionAgency = investmentPromotionAgency;
	}




	public String getLegalBasis() {
		return legalBasis;
	}




	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
	}




	public String getRegisteredActivityProgram() {
		return registeredActivityProgram;
	}




	public void setRegisteredActivityProgram(String registeredActivityProgram) {
		this.registeredActivityProgram = registeredActivityProgram;
	}
	
	
}
