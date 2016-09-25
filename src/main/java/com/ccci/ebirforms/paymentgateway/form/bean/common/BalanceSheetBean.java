package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceSheetBean implements Serializable {

    private static final long serialVersionUID = 1L;

    //Assets
    private long currentAssests;
    private long longTermInvestment;
    private long propertyPlantEquipmentNet;
    private long longTermReceivables;
    private long intangibleAssets;
    private long otherAssets;
    private long totalAssets;

    //Liabilities
    private long currentLiabilities;
    private long longTermLiabilities;
    private long deferedCredits;
    private long otherLiabilities;
    private long totalLiabilities;

    //Equity
    private long capitalStock;
    private long additionalPaidInCapital;
    private long retainedEarnings;
    private long totalEquity;

    private long totalLiabilitiesEquity;

    //For 1701
    private long beginningCapital;
    private long netIncomeForTheYear;
    private long drawings;
    private long endingCapital;
    private long totalLiabilitiesAndCapital;

    public BalanceSheetBean() {
    }

    public BalanceSheetBean(
            long currentAssests,
            long longTermInvestment,
            long propertyPlantEquipmentNet,
            long longTermReceivables,
            long intangibleAssets,
            long otherAssets,
            long totalAssets,
            long currentLiabilities,
            long longTermLiabilities,
            long deferedCredits,
            long otherLiabilities,
            long totalLiabilities,
            long capitalStock,
            long additionalPaidInCapital,
            long retainedEarnings,
            long totalEquity,
            long totalLiabilitiesEquity
    ) {
        this.currentAssests = currentAssests;
        this.longTermInvestment = longTermInvestment;
        this.propertyPlantEquipmentNet = propertyPlantEquipmentNet;
        this.longTermReceivables = longTermReceivables;
        this.intangibleAssets = intangibleAssets;
        this.otherAssets = otherAssets;
        this.totalAssets = totalAssets;
        this.currentLiabilities = currentLiabilities;
        this.longTermLiabilities = longTermLiabilities;
        this.deferedCredits = deferedCredits;
        this.otherLiabilities = otherLiabilities;
        this.totalLiabilities = totalLiabilities;
        this.capitalStock = capitalStock;
        this.additionalPaidInCapital = additionalPaidInCapital;
        this.retainedEarnings = retainedEarnings;
        this.totalEquity = totalEquity;

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getCurrentAssests() {
        return currentAssests;
    }

    public void setCurrentAssests(long currentAssests) {
        this.currentAssests = currentAssests;
    }

    public long getLongTermInvestment() {
        return longTermInvestment;
    }

    public void setLongTermInvestment(long longTermInvestment) {
        this.longTermInvestment = longTermInvestment;
    }

    public long getPropertyPlantEquipmentNet() {
        return propertyPlantEquipmentNet;
    }

    public void setPropertyPlantEquipmentNet(long propertyPlantEquipmentNet) {
        this.propertyPlantEquipmentNet = propertyPlantEquipmentNet;
    }

    public long getLongTermReceivables() {
        return longTermReceivables;
    }

    public void setLongTermReceivables(long longTermReceivables) {
        this.longTermReceivables = longTermReceivables;
    }

    public long getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(long intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public long getOtherAssets() {
        return otherAssets;
    }

    public void setOtherAssets(long otherAssets) {
        this.otherAssets = otherAssets;
    }

    public long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public long getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(long currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public long getLongTermLiabilities() {
        return longTermLiabilities;
    }

    public void setLongTermLiabilities(long longTermLiabilities) {
        this.longTermLiabilities = longTermLiabilities;
    }

    public long getDeferedCredits() {
        return deferedCredits;
    }

    public void setDeferedCredits(long deferedCredits) {
        this.deferedCredits = deferedCredits;
    }

    public long getOtherLiabilities() {
        return otherLiabilities;
    }

    public void setOtherLiabilities(long otherLiabilities) {
        this.otherLiabilities = otherLiabilities;
    }

    public long getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(long totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public long getCapitalStock() {
        return capitalStock;
    }

    public void setCapitalStock(long capitalStock) {
        this.capitalStock = capitalStock;
    }

    public long getAdditionalPaidInCapital() {
        return additionalPaidInCapital;
    }

    public void setAdditionalPaidInCapital(long additionalPaidInCapital) {
        this.additionalPaidInCapital = additionalPaidInCapital;
    }

    public long getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(long retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public long getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(long totalEquity) {
        this.totalEquity = totalEquity;
    }

    public long getTotalLiabilitiesEquity() {
        return totalLiabilitiesEquity;
    }

    public void setTotalLiabilitiesEquity(long totalLiabilitiesEquity) {
        this.totalLiabilitiesEquity = totalLiabilitiesEquity;
    }

    /**
     * @return the beginningCapital
     */
    public long getBeginningCapital() {
        return beginningCapital;
    }

    /**
     * @param beginningCapital the beginningCapital to set
     */
    public void setBeginningCapital(long beginningCapital) {
        this.beginningCapital = beginningCapital;
    }

    /**
     * @return the netIncomeForTheYear
     */
    public long getNetIncomeForTheYear() {
        return netIncomeForTheYear;
    }

    /**
     * @param netIncomeForTheYear the netIncomeForTheYear to set
     */
    public void setNetIncomeForTheYear(long netIncomeForTheYear) {
        this.netIncomeForTheYear = netIncomeForTheYear;
    }

    /**
     * @return the drawings
     */
    public long getDrawings() {
        return drawings;
    }

    /**
     * @param drawings the drawings to set
     */
    public void setDrawings(long drawings) {
        this.drawings = drawings;
    }

    /**
     * @return the endingCapital
     */
    public long getEndingCapital() {
        return endingCapital;
    }

    /**
     * @param endingCapital the endingCapital to set
     */
    public void setEndingCapital(long endingCapital) {
        this.endingCapital = endingCapital;
    }

    /**
     * @return the totalLiabilitiesAndCapital
     */
    public long getTotalLiabilitiesAndCapital() {
        return totalLiabilitiesAndCapital;
    }

    /**
     * @param totalLiabilitiesAndCapital the totalLiabilitiesAndCapital to set
     */
    public void setTotalLiabilitiesAndCapital(long totalLiabilitiesAndCapital) {
        this.totalLiabilitiesAndCapital = totalLiabilitiesAndCapital;
    }

}
