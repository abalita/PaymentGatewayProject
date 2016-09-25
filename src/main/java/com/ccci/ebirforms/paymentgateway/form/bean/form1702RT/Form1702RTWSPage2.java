package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;


public class Form1702RTWSPage2 {
	private static final String DEFAULT_INCOME_TAX_RATE = "30.0";
	
	
	private String netSalesRevenuesReceiptsFees;		//30
	
	
	private String costSalesServices;					//31
	
	
	private String grossIncomeFromOperation;			//32
	
	
	private String otherTaxableIncomeNotSubjectedToFinalTax;	//33
	
	
	private String totalGrossIncome;					//34
	
	private String ordinaryAllowableItemizedDeductions;	//35
	private boolean ordinaryAllowableItemizedDeductionsDisabled = true;
	private String specialAllowableItemizedDeductions36;//36
	private boolean specialAllowableItemizedDeductions36Disabled = true;
	private String nolco;								//37
	private boolean nolcoDisabled = true;
	private String totalItemizedDeductions;				//38
	private String optionalStandardDeductions;			//39
	private boolean optionalStandardDeductionsDisabled = true;//39
	private String netTaxableIncome;					//40
	
	private String incomeTaxRate = DEFAULT_INCOME_TAX_RATE; // 41

	private String incomeTaxDueOtherThanMCIT;			//42
	private String minimumCorporateIncomeTax;			//43
	private String totalIncomeTaxDue44;					//44
	private String totalTaxCreditsPayments45;			//45
	private String netTaxPayable46;						//46
	
	private String surcharge;							//47
	private String interest;							//48
	private String compromise;							//49
	private String totalPenalties50;					//50
	
	private String specialAllowableItemizedDeductions52;		//52
	private String specialTaxCredits;					//53
	private String totalTaxReliefAvailment;				//54
	
	private String nameExternalAuditorAccreditedTaxAgent;		//55
	private String tinExternalAuditorAccreditedTaxAgent;		//56
	private String nameSigningPartner;					//57
	private String tinSigningPartner;					//58
	private String birAccreditationNo;					//59
	private Date birAccreditationIssueDate;			//60
	private Date birAccreditationExpiryDate;			//61
	private String tin1ExternalAuditorAccreditedTaxAgent;
	private String tin2ExternalAuditorAccreditedTaxAgent;
	private String tin3ExternalAuditorAccreditedTaxAgent;
	private String tinBranchExternalAuditorAccreditedTaxAgent;
	private String tin1SigningPartner;
	private String tin2SigningPartner;
	private String tin3SigningPartner;
	private String tinBranchSigningPartner;
	public String getNetSalesRevenuesReceiptsFees() {
		return netSalesRevenuesReceiptsFees;
	}
	public void setNetSalesRevenuesReceiptsFees(String netSalesRevenuesReceiptsFees) {
		this.netSalesRevenuesReceiptsFees = netSalesRevenuesReceiptsFees;
	}
	public String getCostSalesServices() {
		return costSalesServices;
	}
	public void setCostSalesServices(String costSalesServices) {
		this.costSalesServices = costSalesServices;
	}
	public String getGrossIncomeFromOperation() {
		return grossIncomeFromOperation;
	}
	public void setGrossIncomeFromOperation(String grossIncomeFromOperation) {
		this.grossIncomeFromOperation = grossIncomeFromOperation;
	}
	public String getOtherTaxableIncomeNotSubjectedToFinalTax() {
		return otherTaxableIncomeNotSubjectedToFinalTax;
	}
	public void setOtherTaxableIncomeNotSubjectedToFinalTax(
			String otherTaxableIncomeNotSubjectedToFinalTax) {
		this.otherTaxableIncomeNotSubjectedToFinalTax = otherTaxableIncomeNotSubjectedToFinalTax;
	}
	public String getTotalGrossIncome() {
		return totalGrossIncome;
	}
	public void setTotalGrossIncome(String totalGrossIncome) {
		this.totalGrossIncome = totalGrossIncome;
	}
	public String getOrdinaryAllowableItemizedDeductions() {
		return ordinaryAllowableItemizedDeductions;
	}
	public void setOrdinaryAllowableItemizedDeductions(
			String ordinaryAllowableItemizedDeductions) {
		this.ordinaryAllowableItemizedDeductions = ordinaryAllowableItemizedDeductions;
	}
	public boolean isOrdinaryAllowableItemizedDeductionsDisabled() {
		return ordinaryAllowableItemizedDeductionsDisabled;
	}
	public void setOrdinaryAllowableItemizedDeductionsDisabled(
			boolean ordinaryAllowableItemizedDeductionsDisabled) {
		this.ordinaryAllowableItemizedDeductionsDisabled = ordinaryAllowableItemizedDeductionsDisabled;
	}
	public String getSpecialAllowableItemizedDeductions36() {
		return specialAllowableItemizedDeductions36;
	}
	public void setSpecialAllowableItemizedDeductions36(
			String specialAllowableItemizedDeductions36) {
		this.specialAllowableItemizedDeductions36 = specialAllowableItemizedDeductions36;
	}
	public boolean isSpecialAllowableItemizedDeductions36Disabled() {
		return specialAllowableItemizedDeductions36Disabled;
	}
	public void setSpecialAllowableItemizedDeductions36Disabled(
			boolean specialAllowableItemizedDeductions36Disabled) {
		this.specialAllowableItemizedDeductions36Disabled = specialAllowableItemizedDeductions36Disabled;
	}
	public String getNolco() {
		return nolco;
	}
	public void setNolco(String nolco) {
		this.nolco = nolco;
	}
	public boolean isNolcoDisabled() {
		return nolcoDisabled;
	}
	public void setNolcoDisabled(boolean nolcoDisabled) {
		this.nolcoDisabled = nolcoDisabled;
	}
	public String getTotalItemizedDeductions() {
		return totalItemizedDeductions;
	}
	public void setTotalItemizedDeductions(String totalItemizedDeductions) {
		this.totalItemizedDeductions = totalItemizedDeductions;
	}
	public String getOptionalStandardDeductions() {
		return optionalStandardDeductions;
	}
	public void setOptionalStandardDeductions(String optionalStandardDeductions) {
		this.optionalStandardDeductions = optionalStandardDeductions;
	}
	public boolean isOptionalStandardDeductionsDisabled() {
		return optionalStandardDeductionsDisabled;
	}
	public void setOptionalStandardDeductionsDisabled(
			boolean optionalStandardDeductionsDisabled) {
		this.optionalStandardDeductionsDisabled = optionalStandardDeductionsDisabled;
	}
	public String getNetTaxableIncome() {
		return netTaxableIncome;
	}
	public void setNetTaxableIncome(String netTaxableIncome) {
		this.netTaxableIncome = netTaxableIncome;
	}
	public String getIncomeTaxRate() {
		return incomeTaxRate;
	}
	public void setIncomeTaxRate(String incomeTaxRate) {
		this.incomeTaxRate = incomeTaxRate;
	}
	public String getIncomeTaxDueOtherThanMCIT() {
		return incomeTaxDueOtherThanMCIT;
	}
	public void setIncomeTaxDueOtherThanMCIT(String incomeTaxDueOtherThanMCIT) {
		this.incomeTaxDueOtherThanMCIT = incomeTaxDueOtherThanMCIT;
	}
	public String getMinimumCorporateIncomeTax() {
		return minimumCorporateIncomeTax;
	}
	public void setMinimumCorporateIncomeTax(String minimumCorporateIncomeTax) {
		this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
	}
	public String getTotalIncomeTaxDue44() {
		return totalIncomeTaxDue44;
	}
	public void setTotalIncomeTaxDue44(String totalIncomeTaxDue44) {
		this.totalIncomeTaxDue44 = totalIncomeTaxDue44;
	}
	public String getTotalTaxCreditsPayments45() {
		return totalTaxCreditsPayments45;
	}
	public void setTotalTaxCreditsPayments45(String totalTaxCreditsPayments45) {
		this.totalTaxCreditsPayments45 = totalTaxCreditsPayments45;
	}
	public String getNetTaxPayable46() {
		return netTaxPayable46;
	}
	public void setNetTaxPayable46(String netTaxPayable46) {
		this.netTaxPayable46 = netTaxPayable46;
	}
	public String getSurcharge() {
		return surcharge;
	}
	public void setSurcharge(String surcharge) {
		this.surcharge = surcharge;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getCompromise() {
		return compromise;
	}
	public void setCompromise(String compromise) {
		this.compromise = compromise;
	}
	public String getTotalPenalties50() {
		return totalPenalties50;
	}
	public void setTotalPenalties50(String totalPenalties50) {
		this.totalPenalties50 = totalPenalties50;
	}
	public String getSpecialAllowableItemizedDeductions52() {
		return specialAllowableItemizedDeductions52;
	}
	public void setSpecialAllowableItemizedDeductions52(
			String specialAllowableItemizedDeductions52) {
		this.specialAllowableItemizedDeductions52 = specialAllowableItemizedDeductions52;
	}
	public String getSpecialTaxCredits() {
		return specialTaxCredits;
	}
	public void setSpecialTaxCredits(String specialTaxCredits) {
		this.specialTaxCredits = specialTaxCredits;
	}
	public String getTotalTaxReliefAvailment() {
		return totalTaxReliefAvailment;
	}
	public void setTotalTaxReliefAvailment(String totalTaxReliefAvailment) {
		this.totalTaxReliefAvailment = totalTaxReliefAvailment;
	}
	public String getNameExternalAuditorAccreditedTaxAgent() {
		return nameExternalAuditorAccreditedTaxAgent;
	}
	public void setNameExternalAuditorAccreditedTaxAgent(
			String nameExternalAuditorAccreditedTaxAgent) {
		this.nameExternalAuditorAccreditedTaxAgent = nameExternalAuditorAccreditedTaxAgent;
	}
	public String getTinExternalAuditorAccreditedTaxAgent() {
		return tinExternalAuditorAccreditedTaxAgent;
	}
	public void setTinExternalAuditorAccreditedTaxAgent(
			String tinExternalAuditorAccreditedTaxAgent) {
		this.tinExternalAuditorAccreditedTaxAgent = tinExternalAuditorAccreditedTaxAgent;
	}
	public String getNameSigningPartner() {
		return nameSigningPartner;
	}
	public void setNameSigningPartner(String nameSigningPartner) {
		this.nameSigningPartner = nameSigningPartner;
	}
	public String getTinSigningPartner() {
		return tinSigningPartner;
	}
	public void setTinSigningPartner(String tinSigningPartner) {
		this.tinSigningPartner = tinSigningPartner;
	}
	public String getBirAccreditationNo() {
		return birAccreditationNo;
	}
	public void setBirAccreditationNo(String birAccreditationNo) {
		this.birAccreditationNo = birAccreditationNo;
	}
	public Date getBirAccreditationIssueDate() {
		return birAccreditationIssueDate;
	}
	public void setBirAccreditationIssueDate(Date birAccreditationIssueDate) {
		this.birAccreditationIssueDate = birAccreditationIssueDate;
	}
	public Date getBirAccreditationExpiryDate() {
		return birAccreditationExpiryDate;
	}
	public void setBirAccreditationExpiryDate(Date birAccreditationExpiryDate) {
		this.birAccreditationExpiryDate = birAccreditationExpiryDate;
	}
	public String getTin1ExternalAuditorAccreditedTaxAgent() {
		return tin1ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin1ExternalAuditorAccreditedTaxAgent(
			String tin1ExternalAuditorAccreditedTaxAgent) {
		this.tin1ExternalAuditorAccreditedTaxAgent = tin1ExternalAuditorAccreditedTaxAgent;
	}
	public String getTin2ExternalAuditorAccreditedTaxAgent() {
		return tin2ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin2ExternalAuditorAccreditedTaxAgent(
			String tin2ExternalAuditorAccreditedTaxAgent) {
		this.tin2ExternalAuditorAccreditedTaxAgent = tin2ExternalAuditorAccreditedTaxAgent;
	}
	public String getTin3ExternalAuditorAccreditedTaxAgent() {
		return tin3ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin3ExternalAuditorAccreditedTaxAgent(
			String tin3ExternalAuditorAccreditedTaxAgent) {
		this.tin3ExternalAuditorAccreditedTaxAgent = tin3ExternalAuditorAccreditedTaxAgent;
	}
	public String getTinBranchExternalAuditorAccreditedTaxAgent() {
		return tinBranchExternalAuditorAccreditedTaxAgent;
	}
	public void setTinBranchExternalAuditorAccreditedTaxAgent(
			String tinBranchExternalAuditorAccreditedTaxAgent) {
		this.tinBranchExternalAuditorAccreditedTaxAgent = tinBranchExternalAuditorAccreditedTaxAgent;
	}
	public String getTin1SigningPartner() {
		return tin1SigningPartner;
	}
	public void setTin1SigningPartner(String tin1SigningPartner) {
		this.tin1SigningPartner = tin1SigningPartner;
	}
	public String getTin2SigningPartner() {
		return tin2SigningPartner;
	}
	public void setTin2SigningPartner(String tin2SigningPartner) {
		this.tin2SigningPartner = tin2SigningPartner;
	}
	public String getTin3SigningPartner() {
		return tin3SigningPartner;
	}
	public void setTin3SigningPartner(String tin3SigningPartner) {
		this.tin3SigningPartner = tin3SigningPartner;
	}
	public String getTinBranchSigningPartner() {
		return tinBranchSigningPartner;
	}
	public void setTinBranchSigningPartner(String tinBranchSigningPartner) {
		this.tinBranchSigningPartner = tinBranchSigningPartner;
	}
}
