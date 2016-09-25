/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT taxpayer data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_TAXPAYER")
@NamedQueries({
	@NamedQuery(name="ReturnTaxpayer_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnTaxpayer_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnTaxpayer_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	public ReturnTaxpayer_1702_RT() {
	}

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="NET_SALE")
	private double netSales;
	
	@Column(name="DEDUCTABLE_SALES")
	private double costOfSale;
	
	@Column(name="OPERATION_GROSS_INCOME")
	private double grossIncomeFromOperation;
	
	@Column(name="OTHER_TAXABLE_INCOME")
	private double otherTaxableIncome;
	
	@Column(name="TOTAL_GROSS_INCOME")
	private double totalGrossIncome;
	
	@Column(name="CT_ORDINARY_DEDUCTIONS")
	private double ordinaryAllowableItemizedDeduction;
	
	@Column(name="CT_SPECIAL_DEDUCTIONS")
	private double specialAllowableItemizedDeduction;
	
	@Column(name="NOLCO")
	private double nolco;
	
	@Column(name="TOTAL_DEDUCTIONS")
	private double totalDeduction;
	
	@Column(name="OPTIONAL_DEDUCTION")
	private double optionalDeduction;
	
	@Column(name="NET_TAXABLE_INCOME")
	private double netTaxableIncome;
	
	@Column(name="INCOME_TAX_RATE")
	private double incomeTaxRate;
	
	@Column(name="INCOME_TAX_DUE")
	private double incomeTaxDue;
	
	@Column(name="MIN_CORP_INC_TAX")
	private double minimumCorporateIncomeTax;
	
	@Column(name="TOTAL_INC_TAX_DUE")
	private double totalIncomeTaxDue;
	
	@Column(name="DEDUCTABLE_PAYMENTS")
	private double totalTaxPayment;
	
	@Column(name="NET_TAX_PAYABLE")
	private double netTaxPayable;
	
	@Column(name="SURCHARGE")
	private double surcharge;
	
	@Column(name="INTEREST")
	private double interest;
	
	@Column(name="COMPROMISE")
	private double compromise;
	
	@Column(name="TOTAL_PENALTIES")
	private double totalPenalties;
	
	@Column(name="TOTAL_AMOUNT_PAYABLE")
	private double totalAmountPayable;
	
	@Column(name="RA_SPECIAL_DEDUCTION")
	private double reliefItemizedDeduction;
	
	@Column(name="SPECIAL_TAX_CREDITS")
	private double specialTaxCredit;
	
	@Column(name="TOTAL_TAX_RELIEF_AVLMNT")
	private double totalTaxReliefAvailment;
	
	@Column(name="TOT_NON_OPER_INC")
	private double totalNonOperationIncome;
	
	@Column(name="TOT_ORDINARY_DEDUCTIONS")
	private double totalOrdinaryDeduction;
	
	@Column(name="TOT_SPECIAL_DEDUCTIONS")
	private double totalSpecialDeduction;
	
	@Column(name="GROSS_INCOME")
	private double grossIncome;
	
	@Column(name="TOT_DEDUCTABLE_EXL_NOLCO")
	private double totalDeductableExlNolco;
	
	@Column(name="NET_OPR_LOSS")
	private double netOperationLoss;
	
	@Column(name="TOTAL_NOLCO")
	private double totalNolco;
	
	@Column(name="TOTAL_TAX_CREDITS")
	private double totalTaxCredits;
	
	@Column(name="TOTAL_EXCESS_MCIT")
	private double totalExcessMCIT;
	
	@Column(name="TOT_SUM_RECONC_NET_INC")
	private double totalSumReconNetIncome;
	
	@Column(name="TOT_DIF_RECONC_NET_INC")
	private double totalDIfReconNetIncome;
	
	@Column(name="TOT_FINAL_TAX_WITHHELD")
	private double totalFinalTaxWitheld;
	
	@Column(name="TOT_INC_EXCEMPT_INCTAX")
	private double totalIncomeExempt;

	/**
	 * @param referenceNo
	 * @param netSales
	 * @param costOfSale
	 * @param grossIncomeFromOperation
	 * @param otherTaxableIncome
	 * @param totalGrossIncome
	 * @param ordinaryAllowableItemizedDeduction
	 * @param specialAllowableItemizedDeduction
	 * @param nolco
	 * @param totalDeduction
	 * @param optionalDeduction
	 * @param netTaxableIncome
	 * @param incomeTaxRate
	 * @param incomeTaxDue
	 * @param minimumCorporateIncomeTax
	 * @param totalIncomeTaxDue
	 * @param totalTaxPayment
	 * @param netTaxPayable
	 * @param surcharge
	 * @param interest
	 * @param compromise
	 * @param totalPenalties
	 * @param totalAmountPayable
	 * @param reliefItemizedDeduction
	 * @param specialTaxCredit
	 * @param totalTaxReliefAvailment
	 * @param totalNonOperationIncome
	 * @param totalOrdinaryDeduction
	 * @param totalSpecialDeduction
	 * @param grossIncome
	 * @param totalDeductableExlNolco
	 * @param netOperationLoss
	 * @param totalNolco
	 * @param totalTaxCredits
	 * @param totalExcessMCIT
	 * @param totalSumReconNetIncome
	 * @param totalDIfReconNetIncome
	 * @param totalFinalTaxWitheld
	 * @param totalIncomeExempt
	 */
	public ReturnTaxpayer_1702_RT(Long referenceNo, double netSales,
			double costOfSale, double grossIncomeFromOperation,
			double otherTaxableIncome, double totalGrossIncome,
			double ordinaryAllowableItemizedDeduction,
			double specialAllowableItemizedDeduction, double nolco,
			double totalDeduction, double optionalDeduction,
			double netTaxableIncome, double incomeTaxRate, double incomeTaxDue,
			double minimumCorporateIncomeTax, double totalIncomeTaxDue,
			double totalTaxPayment, double netTaxPayable, double surcharge,
			double interest, double compromise, double totalPenalties,
			double totalAmountPayable, double reliefItemizedDeduction,
			double specialTaxCredit, double totalTaxReliefAvailment,
			double totalNonOperationIncome, double totalOrdinaryDeduction,
			double totalSpecialDeduction, double grossIncome,
			double totalDeductableExlNolco, double netOperationLoss,
			double totalNolco, double totalTaxCredits, double totalExcessMCIT,
			double totalSumReconNetIncome, double totalDIfReconNetIncome,
			double totalFinalTaxWitheld, double totalIncomeExempt) {
		this.referenceNo = referenceNo;
		this.netSales = netSales;
		this.costOfSale = costOfSale;
		this.grossIncomeFromOperation = grossIncomeFromOperation;
		this.otherTaxableIncome = otherTaxableIncome;
		this.totalGrossIncome = totalGrossIncome;
		this.ordinaryAllowableItemizedDeduction = ordinaryAllowableItemizedDeduction;
		this.specialAllowableItemizedDeduction = specialAllowableItemizedDeduction;
		this.nolco = nolco;
		this.totalDeduction = totalDeduction;
		this.optionalDeduction = optionalDeduction;
		this.netTaxableIncome = netTaxableIncome;
		this.incomeTaxRate = incomeTaxRate;
		this.incomeTaxDue = incomeTaxDue;
		this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
		this.totalIncomeTaxDue = totalIncomeTaxDue;
		this.totalTaxPayment = totalTaxPayment;
		this.netTaxPayable = netTaxPayable;
		this.surcharge = surcharge;
		this.interest = interest;
		this.compromise = compromise;
		this.totalPenalties = totalPenalties;
		this.totalAmountPayable = totalAmountPayable;
		this.reliefItemizedDeduction = reliefItemizedDeduction;
		this.specialTaxCredit = specialTaxCredit;
		this.totalTaxReliefAvailment = totalTaxReliefAvailment;
		this.totalNonOperationIncome = totalNonOperationIncome;
		this.totalOrdinaryDeduction = totalOrdinaryDeduction;
		this.totalSpecialDeduction = totalSpecialDeduction;
		this.grossIncome = grossIncome;
		this.totalDeductableExlNolco = totalDeductableExlNolco;
		this.netOperationLoss = netOperationLoss;
		this.totalNolco = totalNolco;
		this.totalTaxCredits = totalTaxCredits;
		this.totalExcessMCIT = totalExcessMCIT;
		this.totalSumReconNetIncome = totalSumReconNetIncome;
		this.totalDIfReconNetIncome = totalDIfReconNetIncome;
		this.totalFinalTaxWitheld = totalFinalTaxWitheld;
		this.totalIncomeExempt = totalIncomeExempt;
	}

	/**
	 * @return the referenceNo
	 */
	public Long getReferenceNo() {
		return referenceNo;
	}

	/**
	 * @param referenceNo the referenceNo to set
	 */
	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	/**
	 * @return the netSales
	 */
	public double getNetSales() {
		return netSales;
	}

	/**
	 * @param netSales the netSales to set
	 */
	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}

	/**
	 * @return the costOfSale
	 */
	public double getCostOfSale() {
		return costOfSale;
	}

	/**
	 * @param costOfSale the costOfSale to set
	 */
	public void setCostOfSale(double costOfSale) {
		this.costOfSale = costOfSale;
	}

	/**
	 * @return the grossIncomeFromOperation
	 */
	public double getGrossIncomeFromOperation() {
		return grossIncomeFromOperation;
	}

	/**
	 * @param grossIncomeFromOperation the grossIncomeFromOperation to set
	 */
	public void setGrossIncomeFromOperation(double grossIncomeFromOperation) {
		this.grossIncomeFromOperation = grossIncomeFromOperation;
	}

	/**
	 * @return the otherTaxableIncome
	 */
	public double getOtherTaxableIncome() {
		return otherTaxableIncome;
	}

	/**
	 * @param otherTaxableIncome the otherTaxableIncome to set
	 */
	public void setOtherTaxableIncome(double otherTaxableIncome) {
		this.otherTaxableIncome = otherTaxableIncome;
	}

	/**
	 * @return the totalGrossIncome
	 */
	public double getTotalGrossIncome() {
		return totalGrossIncome;
	}

	/**
	 * @param totalGrossIncome the totalGrossIncome to set
	 */
	public void setTotalGrossIncome(double totalGrossIncome) {
		this.totalGrossIncome = totalGrossIncome;
	}

	/**
	 * @return the ordinaryAllowableItemizedDeduction
	 */
	public double getOrdinaryAllowableItemizedDeduction() {
		return ordinaryAllowableItemizedDeduction;
	}

	/**
	 * @param ordinaryAllowableItemizedDeduction the ordinaryAllowableItemizedDeduction to set
	 */
	public void setOrdinaryAllowableItemizedDeduction(
			double ordinaryAllowableItemizedDeduction) {
		this.ordinaryAllowableItemizedDeduction = ordinaryAllowableItemizedDeduction;
	}

	/**
	 * @return the specialAllowableItemizedDeduction
	 */
	public double getSpecialAllowableItemizedDeduction() {
		return specialAllowableItemizedDeduction;
	}

	/**
	 * @param specialAllowableItemizedDeduction the specialAllowableItemizedDeduction to set
	 */
	public void setSpecialAllowableItemizedDeduction(
			double specialAllowableItemizedDeduction) {
		this.specialAllowableItemizedDeduction = specialAllowableItemizedDeduction;
	}

	/**
	 * @return the nolco
	 */
	public double getNolco() {
		return nolco;
	}

	/**
	 * @param nolco the nolco to set
	 */
	public void setNolco(double nolco) {
		this.nolco = nolco;
	}

	/**
	 * @return the totalDeduction
	 */
	public double getTotalDeduction() {
		return totalDeduction;
	}

	/**
	 * @param totalDeduction the totalDeduction to set
	 */
	public void setTotalDeduction(double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	/**
	 * @return the optionalDeduction
	 */
	public double getOptionalDeduction() {
		return optionalDeduction;
	}

	/**
	 * @param optionalDeduction the optionalDeduction to set
	 */
	public void setOptionalDeduction(double optionalDeduction) {
		this.optionalDeduction = optionalDeduction;
	}

	/**
	 * @return the netTaxableIncome
	 */
	public double getNetTaxableIncome() {
		return netTaxableIncome;
	}

	/**
	 * @param netTaxableIncome the netTaxableIncome to set
	 */
	public void setNetTaxableIncome(double netTaxableIncome) {
		this.netTaxableIncome = netTaxableIncome;
	}

	/**
	 * @return the incomeTaxRate
	 */
	public double getIncomeTaxRate() {
		return incomeTaxRate;
	}

	/**
	 * @param incomeTaxRate the incomeTaxRate to set
	 */
	public void setIncomeTaxRate(double incomeTaxRate) {
		this.incomeTaxRate = incomeTaxRate;
	}

	/**
	 * @return the incomeTaxDue
	 */
	public double getIncomeTaxDue() {
		return incomeTaxDue;
	}

	/**
	 * @param incomeTaxDue the incomeTaxDue to set
	 */
	public void setIncomeTaxDue(double incomeTaxDue) {
		this.incomeTaxDue = incomeTaxDue;
	}

	/**
	 * @return the minimumCorporateIncomeTax
	 */
	public double getMinimumCorporateIncomeTax() {
		return minimumCorporateIncomeTax;
	}

	/**
	 * @param minimumCorporateIncomeTax the minimumCorporateIncomeTax to set
	 */
	public void setMinimumCorporateIncomeTax(double minimumCorporateIncomeTax) {
		this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
	}

	/**
	 * @return the totalIncomeTaxDue
	 */
	public double getTotalIncomeTaxDue() {
		return totalIncomeTaxDue;
	}

	/**
	 * @param totalIncomeTaxDue the totalIncomeTaxDue to set
	 */
	public void setTotalIncomeTaxDue(double totalIncomeTaxDue) {
		this.totalIncomeTaxDue = totalIncomeTaxDue;
	}

	/**
	 * @return the totalTaxPayment
	 */
	public double getTotalTaxPayment() {
		return totalTaxPayment;
	}

	/**
	 * @param totalTaxPayment the totalTaxPayment to set
	 */
	public void setTotalTaxPayment(double totalTaxPayment) {
		this.totalTaxPayment = totalTaxPayment;
	}

	/**
	 * @return the netTaxPayable
	 */
	public double getNetTaxPayable() {
		return netTaxPayable;
	}

	/**
	 * @param netTaxPayable the netTaxPayable to set
	 */
	public void setNetTaxPayable(double netTaxPayable) {
		this.netTaxPayable = netTaxPayable;
	}

	/**
	 * @return the surcharge
	 */
	public double getSurcharge() {
		return surcharge;
	}

	/**
	 * @param surcharge the surcharge to set
	 */
	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}

	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}

	/**
	 * @return the compromise
	 */
	public double getCompromise() {
		return compromise;
	}

	/**
	 * @param compromise the compromise to set
	 */
	public void setCompromise(double compromise) {
		this.compromise = compromise;
	}

	/**
	 * @return the totalPenalties
	 */
	public double getTotalPenalties() {
		return totalPenalties;
	}

	/**
	 * @param totalPenalties the totalPenalties to set
	 */
	public void setTotalPenalties(double totalPenalties) {
		this.totalPenalties = totalPenalties;
	}

	/**
	 * @return the totalAmountPayable
	 */
	public double getTotalAmountPayable() {
		return totalAmountPayable;
	}

	/**
	 * @param totalAmountPayable the totalAmountPayable to set
	 */
	public void setTotalAmountPayable(double totalAmountPayable) {
		this.totalAmountPayable = totalAmountPayable;
	}

	/**
	 * @return the reliefItemizedDeduction
	 */
	public double getReliefItemizedDeduction() {
		return reliefItemizedDeduction;
	}

	/**
	 * @param reliefItemizedDeduction the reliefItemizedDeduction to set
	 */
	public void setReliefItemizedDeduction(double reliefItemizedDeduction) {
		this.reliefItemizedDeduction = reliefItemizedDeduction;
	}

	/**
	 * @return the specialTaxCredit
	 */
	public double getSpecialTaxCredit() {
		return specialTaxCredit;
	}

	/**
	 * @param specialTaxCredit the specialTaxCredit to set
	 */
	public void setSpecialTaxCredit(double specialTaxCredit) {
		this.specialTaxCredit = specialTaxCredit;
	}

	/**
	 * @return the totalTaxReliefAvailment
	 */
	public double getTotalTaxReliefAvailment() {
		return totalTaxReliefAvailment;
	}

	/**
	 * @param totalTaxReliefAvailment the totalTaxReliefAvailment to set
	 */
	public void setTotalTaxReliefAvailment(double totalTaxReliefAvailment) {
		this.totalTaxReliefAvailment = totalTaxReliefAvailment;
	}

	/**
	 * @return the totalNonOperationIncome
	 */
	public double getTotalNonOperationIncome() {
		return totalNonOperationIncome;
	}

	/**
	 * @param totalNonOperationIncome the totalNonOperationIncome to set
	 */
	public void setTotalNonOperationIncome(double totalNonOperationIncome) {
		this.totalNonOperationIncome = totalNonOperationIncome;
	}

	/**
	 * @return the totalOrdinaryDeduction
	 */
	public double getTotalOrdinaryDeduction() {
		return totalOrdinaryDeduction;
	}

	/**
	 * @param totalOrdinaryDeduction the totalOrdinaryDeduction to set
	 */
	public void setTotalOrdinaryDeduction(double totalOrdinaryDeduction) {
		this.totalOrdinaryDeduction = totalOrdinaryDeduction;
	}

	/**
	 * @return the totalSpecialDeduction
	 */
	public double getTotalSpecialDeduction() {
		return totalSpecialDeduction;
	}

	/**
	 * @param totalSpecialDeduction the totalSpecialDeduction to set
	 */
	public void setTotalSpecialDeduction(double totalSpecialDeduction) {
		this.totalSpecialDeduction = totalSpecialDeduction;
	}

	/**
	 * @return the grossIncome
	 */
	public double getGrossIncome() {
		return grossIncome;
	}

	/**
	 * @param grossIncome the grossIncome to set
	 */
	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	/**
	 * @return the totalDeductableExlNolco
	 */
	public double getTotalDeductableExlNolco() {
		return totalDeductableExlNolco;
	}

	/**
	 * @param totalDeductableExlNolco the totalDeductableExlNolco to set
	 */
	public void setTotalDeductableExlNolco(double totalDeductableExlNolco) {
		this.totalDeductableExlNolco = totalDeductableExlNolco;
	}

	/**
	 * @return the netOperationLoss
	 */
	public double getNetOperationLoss() {
		return netOperationLoss;
	}

	/**
	 * @param netOperationLoss the netOperationLoss to set
	 */
	public void setNetOperationLoss(double netOperationLoss) {
		this.netOperationLoss = netOperationLoss;
	}

	/**
	 * @return the totalNolco
	 */
	public double getTotalNolco() {
		return totalNolco;
	}

	/**
	 * @param totalNolco the totalNolco to set
	 */
	public void setTotalNolco(double totalNolco) {
		this.totalNolco = totalNolco;
	}

	/**
	 * @return the totalTaxCredits
	 */
	public double getTotalTaxCredits() {
		return totalTaxCredits;
	}

	/**
	 * @param totalTaxCredits the totalTaxCredits to set
	 */
	public void setTotalTaxCredits(double totalTaxCredits) {
		this.totalTaxCredits = totalTaxCredits;
	}

	/**
	 * @return the totalExcessMCIT
	 */
	public double getTotalExcessMCIT() {
		return totalExcessMCIT;
	}

	/**
	 * @param totalExcessMCIT the totalExcessMCIT to set
	 */
	public void setTotalExcessMCIT(double totalExcessMCIT) {
		this.totalExcessMCIT = totalExcessMCIT;
	}

	/**
	 * @return the totalSumReconNetIncome
	 */
	public double getTotalSumReconNetIncome() {
		return totalSumReconNetIncome;
	}

	/**
	 * @param totalSumReconNetIncome the totalSumReconNetIncome to set
	 */
	public void setTotalSumReconNetIncome(double totalSumReconNetIncome) {
		this.totalSumReconNetIncome = totalSumReconNetIncome;
	}

	/**
	 * @return the totalDIfReconNetIncome
	 */
	public double getTotalDIfReconNetIncome() {
		return totalDIfReconNetIncome;
	}

	/**
	 * @param totalDIfReconNetIncome the totalDIfReconNetIncome to set
	 */
	public void setTotalDIfReconNetIncome(double totalDIfReconNetIncome) {
		this.totalDIfReconNetIncome = totalDIfReconNetIncome;
	}

	/**
	 * @return the totalFinalTaxWitheld
	 */
	public double getTotalFinalTaxWitheld() {
		return totalFinalTaxWitheld;
	}

	/**
	 * @param totalFinalTaxWitheld the totalFinalTaxWitheld to set
	 */
	public void setTotalFinalTaxWitheld(double totalFinalTaxWitheld) {
		this.totalFinalTaxWitheld = totalFinalTaxWitheld;
	}

	/**
	 * @return the totalIncomeExempt
	 */
	public double getTotalIncomeExempt() {
		return totalIncomeExempt;
	}

	/**
	 * @param totalIncomeExempt the totalIncomeExempt to set
	 */
	public void setTotalIncomeExempt(double totalIncomeExempt) {
		this.totalIncomeExempt = totalIncomeExempt;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
