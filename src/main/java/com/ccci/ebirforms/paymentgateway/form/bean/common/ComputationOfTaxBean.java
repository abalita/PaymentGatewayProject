package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ComputationOfTaxBean implements Serializable {

    public ComputationOfTaxBean() {

    }

    public ComputationOfTaxBean(
            long costSalesServices,
            long grossIncomeFromOperation,
            long incomeTaxDueOtherThanMCIT,
            long incomeTaxRate,
            long incomeTaxRateEX,
            long minimumCorporateIncomeTax,
            long netSalesRevenuesReceiptsFees,
            long netTaxPayable46,
            long netTaxableIncome,
            long nolco,
            boolean nolcoDisabled,
            long optionalStandardDeductions,
            boolean optionalStandardDeductionsDisabled,
            long ordinaryAllowableItemizedDeductions,
            boolean ordinaryAllowableItemizedDeductionsDisabled,
            long otherTaxableIncomeNotSubjectedToFinalTax,
            long surcharge,
            long interest,
            long compromise,
            long totalPenalty,
            long specialAllowableItemizedDeductions36,
            boolean specialAllowableItemizedDeductions36Disabled,
            long totalAmountPayable,
            long totalGrossIncome,
            long totalIncomeTaxDue44,
            long totalItemizedDeductions,
            long totalTaxCreditsPayments45) {

        this.costSalesServices = costSalesServices;
        this.grossIncomeFromOperation = grossIncomeFromOperation;
        this.incomeTaxDueOtherThanMCIT = incomeTaxDueOtherThanMCIT;
        this.incomeTaxRate = incomeTaxRate;
        this.incomeTaxRateEX = incomeTaxRateEX;
        this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
        this.netSalesRevenuesReceiptsFees = netSalesRevenuesReceiptsFees;
        this.netTaxPayable46 = netTaxPayable46;
        this.netTaxableIncome = netTaxableIncome;
        this.nolco = nolco;
        this.nolcoDisabled = nolcoDisabled;
        this.optionalStandardDeductions = optionalStandardDeductions;
        this.optionalStandardDeductionsDisabled = optionalStandardDeductionsDisabled;
        this.ordinaryAllowableItemizedDeductions = ordinaryAllowableItemizedDeductions;
        this.ordinaryAllowableItemizedDeductionsDisabled = ordinaryAllowableItemizedDeductionsDisabled;
        this.otherTaxableIncomeNotSubjectedToFinalTax = otherTaxableIncomeNotSubjectedToFinalTax;
        this.penaltyBean = new PenaltyBean();
        this.penaltyBean.setSurcharge(surcharge);
        this.penaltyBean.setInterest(interest);
        this.penaltyBean.setCompromise(compromise);
        this.penaltyBean.setTotalPenalty(totalPenalty);
        this.specialAllowableItemizedDeductions36 = specialAllowableItemizedDeductions36;
        this.specialAllowableItemizedDeductions36Disabled = specialAllowableItemizedDeductions36Disabled;
        this.totalAmountPayable = totalAmountPayable;
        this.totalGrossIncome = totalGrossIncome;
        this.totalIncomeTaxDue44 = totalIncomeTaxDue44;
        this.totalItemizedDeductions = totalItemizedDeductions;
        this.totalTaxCreditsPayments45 = totalTaxCreditsPayments45;
    }

    private static final long serialVersionUID = 1L;

    private static final long DEFAULT_INCOME_TAX_RATE = (long) 30.0;
    private static final long DEFAULT_INCOME_TAX_RATEEX = (long) 0.0;

    private long netSalesRevenuesReceiptsFees;
    private long costSalesServices;
    private long grossIncomeFromOperation;
    private long otherTaxableIncomeNotSubjectedToFinalTax;
    private long totalGrossIncome;

    private long ordinaryAllowableItemizedDeductions;
    private boolean ordinaryAllowableItemizedDeductionsDisabled = true;
    private long specialAllowableItemizedDeductions36;
    private boolean specialAllowableItemizedDeductions36Disabled = true;
    private long nolco;
    private boolean nolcoDisabled = true;
    private long totalItemizedDeductions;
    private long optionalStandardDeductions;
    private boolean optionalStandardDeductionsDisabled = true;
    private long netTaxableIncome;

    private long incomeTaxRate = DEFAULT_INCOME_TAX_RATE;
    private long incomeTaxRateEX = DEFAULT_INCOME_TAX_RATEEX;

    private long incomeTaxDueOtherThanMCIT;
    private long minimumCorporateIncomeTax;
    private long totalIncomeTaxDue44;
    private long totalTaxCreditsPayments45;
    private long netTaxPayable46;

    private PenaltyBean penaltyBean;

    private long totalAmountPayable;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getNetSalesRevenuesReceiptsFees() {
        return netSalesRevenuesReceiptsFees;
    }

    public void setNetSalesRevenuesReceiptsFees(long netSalesRevenuesReceiptsFees) {
        this.netSalesRevenuesReceiptsFees = netSalesRevenuesReceiptsFees;
    }

    public long getCostSalesServices() {
        return costSalesServices;
    }

    public void setCostSalesServices(long costSalesServices) {
        this.costSalesServices = costSalesServices;
    }

    public long getGrossIncomeFromOperation() {
        return grossIncomeFromOperation;
    }

    public void setGrossIncomeFromOperation(long grossIncomeFromOperation) {
        this.grossIncomeFromOperation = grossIncomeFromOperation;
    }

    public long getOtherTaxableIncomeNotSubjectedToFinalTax() {
        return otherTaxableIncomeNotSubjectedToFinalTax;
    }

    public void setOtherTaxableIncomeNotSubjectedToFinalTax(
            long otherTaxableIncomeNotSubjectedToFinalTax) {
        this.otherTaxableIncomeNotSubjectedToFinalTax = otherTaxableIncomeNotSubjectedToFinalTax;
    }

    public long getTotalGrossIncome() {
        return totalGrossIncome;
    }

    public void setTotalGrossIncome(long totalGrossIncome) {
        this.totalGrossIncome = totalGrossIncome;
    }

    public long getOrdinaryAllowableItemizedDeductions() {
        return ordinaryAllowableItemizedDeductions;
    }

    public void setOrdinaryAllowableItemizedDeductions(
            long ordinaryAllowableItemizedDeductions) {
        this.ordinaryAllowableItemizedDeductions = ordinaryAllowableItemizedDeductions;
    }

    public boolean isOrdinaryAllowableItemizedDeductionsDisabled() {
        return ordinaryAllowableItemizedDeductionsDisabled;
    }

    public void setOrdinaryAllowableItemizedDeductionsDisabled(
            boolean ordinaryAllowableItemizedDeductionsDisabled) {
        this.ordinaryAllowableItemizedDeductionsDisabled = ordinaryAllowableItemizedDeductionsDisabled;
    }

    public long getSpecialAllowableItemizedDeductions36() {
        return specialAllowableItemizedDeductions36;
    }

    public void setSpecialAllowableItemizedDeductions36(
            long specialAllowableItemizedDeductions36) {
        this.specialAllowableItemizedDeductions36 = specialAllowableItemizedDeductions36;
    }

    public boolean isSpecialAllowableItemizedDeductions36Disabled() {
        return specialAllowableItemizedDeductions36Disabled;
    }

    public void setSpecialAllowableItemizedDeductions36Disabled(
            boolean specialAllowableItemizedDeductions36Disabled) {
        this.specialAllowableItemizedDeductions36Disabled = specialAllowableItemizedDeductions36Disabled;
    }

    public long getNolco() {
        return nolco;
    }

    public void setNolco(long nolco) {
        this.nolco = nolco;
    }

    public boolean isNolcoDisabled() {
        return nolcoDisabled;
    }

    public void setNolcoDisabled(boolean nolcoDisabled) {
        this.nolcoDisabled = nolcoDisabled;
    }

    public long getTotalItemizedDeductions() {
        return totalItemizedDeductions;
    }

    public void setTotalItemizedDeductions(long totalItemizedDeductions) {
        this.totalItemizedDeductions = totalItemizedDeductions;
    }

    public long getOptionalStandardDeductions() {
        return optionalStandardDeductions;
    }

    public void setOptionalStandardDeductions(long optionalStandardDeductions) {
        this.optionalStandardDeductions = optionalStandardDeductions;
    }

    public boolean isOptionalStandardDeductionsDisabled() {
        return optionalStandardDeductionsDisabled;
    }

    public void setOptionalStandardDeductionsDisabled(
            boolean optionalStandardDeductionsDisabled) {
        this.optionalStandardDeductionsDisabled = optionalStandardDeductionsDisabled;
    }

    public long getNetTaxableIncome() {
        return netTaxableIncome;
    }

    public void setNetTaxableIncome(long netTaxableIncome) {
        this.netTaxableIncome = netTaxableIncome;
    }

    public long getIncomeTaxRate() {
        return incomeTaxRate;
    }

    public void setIncomeTaxRate(long incomeTaxRate) {
        this.incomeTaxRate = incomeTaxRate;
    }

    public long getIncomeTaxDueOtherThanMCIT() {
        return incomeTaxDueOtherThanMCIT;
    }

    public void setIncomeTaxDueOtherThanMCIT(long incomeTaxDueOtherThanMCIT) {
        this.incomeTaxDueOtherThanMCIT = incomeTaxDueOtherThanMCIT;
    }

    public long getMinimumCorporateIncomeTax() {
        return minimumCorporateIncomeTax;
    }

    public void setMinimumCorporateIncomeTax(long minimumCorporateIncomeTax) {
        this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
    }

    public long getTotalIncomeTaxDue44() {
        return totalIncomeTaxDue44;
    }

    public void setTotalIncomeTaxDue44(long totalIncomeTaxDue44) {
        this.totalIncomeTaxDue44 = totalIncomeTaxDue44;
    }

    public long getTotalTaxCreditsPayments45() {
        return totalTaxCreditsPayments45;
    }

    public void setTotalTaxCreditsPayments45(long totalTaxCreditsPayments45) {
        this.totalTaxCreditsPayments45 = totalTaxCreditsPayments45;
    }

    public long getNetTaxPayable46() {
        return netTaxPayable46;
    }

    public void setNetTaxPayable46(long netTaxPayable46) {
        this.netTaxPayable46 = netTaxPayable46;
    }

    public static long getDefaultIncomeTaxRate() {
        return DEFAULT_INCOME_TAX_RATE;
    }

    public long getIncomeTaxRateEX() {
        return incomeTaxRateEX;
    }

    public void setIncomeTaxRateEX(long incomeTaxRateEX) {
        this.incomeTaxRateEX = incomeTaxRateEX;
    }

    public static long getDefaultIncomeTaxRateex() {
        return DEFAULT_INCOME_TAX_RATEEX;
    }

    public PenaltyBean getPenaltyBean() {
        return penaltyBean;
    }

    public void setPenaltyBean(PenaltyBean penaltyBean) {
        this.penaltyBean = penaltyBean;
    }

    public long getTotalAmountPayable() {
        return totalAmountPayable;
    }

    public void setTotalAmountPayable(long totalAmountPayable) {
        this.totalAmountPayable = totalAmountPayable;
    }

}
