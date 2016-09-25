package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ComputationOfMinimumCorporateIncomeTaxBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mcitYear1;
    private long normalIncomeTax1;
    private long mcit1;

    private long excessMCITOverNormalTax1;
    private long excessMCITAppliedPreviously1;

    private long expiredPortionOfExcessMCIT1;
    private long excessMCITAppliedCurrently1;
    private long balanceOfExcessMCIT1;

    private String mcitYear2;
    private long normalIncomeTax2;
    private long mcit2;

    private long excessMCITOverNormalTax2;
    private long excessMCITAppliedPreviously2;

    private long expiredPortionOfExcessMCIT2;
    private long excessMCITAppliedCurrently2;
    private long balanceOfExcessMCIT2;

    private String mcitYear3;
    private long normalIncomeTax3;
    private long mcit3;

    private long excessMCITOverNormalTax3;
    private long excessMCITAppliedPreviously3;

    private long expiredPortionOfExcessMCIT3;
    private long excessMCITAppliedCurrently3;
    private long balanceOfExcessMCIT3;

    private long totalExcessCreditsMCIT;

    private List<MinimumCorporateIncomeTaxBean> listSched8AdditionalAttachments;

    public ComputationOfMinimumCorporateIncomeTaxBean() {
    }

    public ComputationOfMinimumCorporateIncomeTaxBean(
            long balanceOfExcessMCIT1,
            long balanceOfExcessMCIT2,
            long balanceOfExcessMCIT3,
            long excessMCITAppliedCurrently1,
            long excessMCITAppliedCurrently2,
            long excessMCITAppliedCurrently3,
            long excessMCITAppliedPreviously1,
            long excessMCITAppliedPreviously2,
            long excessMCITAppliedPreviously3,
            long excessMCITOverNormalTax1,
            long excessMCITOverNormalTax2,
            long excessMCITOverNormalTax3,
            long expiredPortionOfExcessMCIT1,
            long expiredPortionOfExcessMCIT2,
            long expiredPortionOfExcessMCIT3,
            long mcit1,
            long mcit2,
            long mcit3,
            String mcitYear1,
            String mcitYear2,
            String mcitYear3,
            long normalIncomeTax1,
            long normalIncomeTax2,
            long normalIncomeTax3,
            long totalExcessCreditsMCIT
    ) {
        this.balanceOfExcessMCIT1 = balanceOfExcessMCIT1;
        this.balanceOfExcessMCIT2 = balanceOfExcessMCIT2;
        this.balanceOfExcessMCIT3 = balanceOfExcessMCIT3;
        this.excessMCITAppliedCurrently1 = excessMCITAppliedCurrently1;
        this.excessMCITAppliedCurrently2 = excessMCITAppliedCurrently2;
        this.excessMCITAppliedCurrently3 = excessMCITAppliedCurrently3;
        this.excessMCITAppliedPreviously1 = excessMCITAppliedPreviously1;
        this.excessMCITAppliedPreviously2 = excessMCITAppliedPreviously2;
        this.excessMCITAppliedPreviously3 = excessMCITAppliedPreviously3;
        this.excessMCITOverNormalTax1 = excessMCITOverNormalTax1;
        this.excessMCITOverNormalTax2 = excessMCITOverNormalTax2;
        this.excessMCITOverNormalTax3 = excessMCITOverNormalTax3;
        this.expiredPortionOfExcessMCIT1 = expiredPortionOfExcessMCIT1;
        this.expiredPortionOfExcessMCIT2 = expiredPortionOfExcessMCIT2;
        this.expiredPortionOfExcessMCIT3 = expiredPortionOfExcessMCIT3;
        this.mcit1 = mcit1;
        this.mcit2 = mcit2;
        this.mcit3 = mcit3;
        this.mcitYear1 = mcitYear1;
        this.mcitYear2 = mcitYear2;
        this.mcitYear3 = mcitYear3;
        this.normalIncomeTax1 = normalIncomeTax1;
        this.normalIncomeTax2 = normalIncomeTax2;
        this.normalIncomeTax3 = normalIncomeTax3;
        this.totalExcessCreditsMCIT = totalExcessCreditsMCIT;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getMcitYear1() {
        return mcitYear1;
    }

    public void setMcitYear1(String mcitYear1) {
        this.mcitYear1 = mcitYear1;
    }

    public long getNormalIncomeTax1() {
        return normalIncomeTax1;
    }

    public void setNormalIncomeTax1(long normalIncomeTax1) {
        this.normalIncomeTax1 = normalIncomeTax1;
    }

    public long getMcit1() {
        return mcit1;
    }

    public void setMcit1(long mcit1) {
        this.mcit1 = mcit1;
    }

    public long getExcessMCITOverNormalTax1() {
        return excessMCITOverNormalTax1;
    }

    public void setExcessMCITOverNormalTax1(long excessMCITOverNormalTax1) {
        this.excessMCITOverNormalTax1 = excessMCITOverNormalTax1;
    }

    public long getExcessMCITAppliedPreviously1() {
        return excessMCITAppliedPreviously1;
    }

    public void setExcessMCITAppliedPreviously1(long excessMCITAppliedPreviously1) {
        this.excessMCITAppliedPreviously1 = excessMCITAppliedPreviously1;
    }

    public long getExpiredPortionOfExcessMCIT1() {
        return expiredPortionOfExcessMCIT1;
    }

    public void setExpiredPortionOfExcessMCIT1(long expiredPortionOfExcessMCIT1) {
        this.expiredPortionOfExcessMCIT1 = expiredPortionOfExcessMCIT1;
    }

    public long getExcessMCITAppliedCurrently1() {
        return excessMCITAppliedCurrently1;
    }

    public void setExcessMCITAppliedCurrently1(long excessMCITAppliedCurrently1) {
        this.excessMCITAppliedCurrently1 = excessMCITAppliedCurrently1;
    }

    public long getBalanceOfExcessMCIT1() {
        return balanceOfExcessMCIT1;
    }

    public void setBalanceOfExcessMCIT1(long balanceOfExcessMCIT1) {
        this.balanceOfExcessMCIT1 = balanceOfExcessMCIT1;
    }

    public String getMcitYear2() {
        return mcitYear2;
    }

    public void setMcitYear2(String mcitYear2) {
        this.mcitYear2 = mcitYear2;
    }

    public long getNormalIncomeTax2() {
        return normalIncomeTax2;
    }

    public void setNormalIncomeTax2(long normalIncomeTax2) {
        this.normalIncomeTax2 = normalIncomeTax2;
    }

    public long getMcit2() {
        return mcit2;
    }

    public void setMcit2(long mcit2) {
        this.mcit2 = mcit2;
    }

    public long getExcessMCITOverNormalTax2() {
        return excessMCITOverNormalTax2;
    }

    public void setExcessMCITOverNormalTax2(long excessMCITOverNormalTax2) {
        this.excessMCITOverNormalTax2 = excessMCITOverNormalTax2;
    }

    public long getExcessMCITAppliedPreviously2() {
        return excessMCITAppliedPreviously2;
    }

    public void setExcessMCITAppliedPreviously2(long excessMCITAppliedPreviously2) {
        this.excessMCITAppliedPreviously2 = excessMCITAppliedPreviously2;
    }

    public long getExpiredPortionOfExcessMCIT2() {
        return expiredPortionOfExcessMCIT2;
    }

    public void setExpiredPortionOfExcessMCIT2(long expiredPortionOfExcessMCIT2) {
        this.expiredPortionOfExcessMCIT2 = expiredPortionOfExcessMCIT2;
    }

    public long getExcessMCITAppliedCurrently2() {
        return excessMCITAppliedCurrently2;
    }

    public void setExcessMCITAppliedCurrently2(long excessMCITAppliedCurrently2) {
        this.excessMCITAppliedCurrently2 = excessMCITAppliedCurrently2;
    }

    public long getBalanceOfExcessMCIT2() {
        return balanceOfExcessMCIT2;
    }

    public void setBalanceOfExcessMCIT2(long balanceOfExcessMCIT2) {
        this.balanceOfExcessMCIT2 = balanceOfExcessMCIT2;
    }

    public String getMcitYear3() {
        return mcitYear3;
    }

    public void setMcitYear3(String mcitYear3) {
        this.mcitYear3 = mcitYear3;
    }

    public long getNormalIncomeTax3() {
        return normalIncomeTax3;
    }

    public void setNormalIncomeTax3(long normalIncomeTax3) {
        this.normalIncomeTax3 = normalIncomeTax3;
    }

    public long getMcit3() {
        return mcit3;
    }

    public void setMcit3(long mcit3) {
        this.mcit3 = mcit3;
    }

    public long getExcessMCITOverNormalTax3() {
        return excessMCITOverNormalTax3;
    }

    public void setExcessMCITOverNormalTax3(long excessMCITOverNormalTax3) {
        this.excessMCITOverNormalTax3 = excessMCITOverNormalTax3;
    }

    public long getExcessMCITAppliedPreviously3() {
        return excessMCITAppliedPreviously3;
    }

    public void setExcessMCITAppliedPreviously3(long excessMCITAppliedPreviously3) {
        this.excessMCITAppliedPreviously3 = excessMCITAppliedPreviously3;
    }

    public long getExpiredPortionOfExcessMCIT3() {
        return expiredPortionOfExcessMCIT3;
    }

    public void setExpiredPortionOfExcessMCIT3(long expiredPortionOfExcessMCIT3) {
        this.expiredPortionOfExcessMCIT3 = expiredPortionOfExcessMCIT3;
    }

    public long getExcessMCITAppliedCurrently3() {
        return excessMCITAppliedCurrently3;
    }

    public void setExcessMCITAppliedCurrently3(long excessMCITAppliedCurrently3) {
        this.excessMCITAppliedCurrently3 = excessMCITAppliedCurrently3;
    }

    public long getBalanceOfExcessMCIT3() {
        return balanceOfExcessMCIT3;
    }

    public void setBalanceOfExcessMCIT3(long balanceOfExcessMCIT3) {
        this.balanceOfExcessMCIT3 = balanceOfExcessMCIT3;
    }

    public long getTotalExcessCreditsMCIT() {
        return totalExcessCreditsMCIT;
    }

    public void setTotalExcessCreditsMCIT(long totalExcessCreditsMCIT) {
        this.totalExcessCreditsMCIT = totalExcessCreditsMCIT;
    }

    public List<MinimumCorporateIncomeTaxBean> getListSched8AdditionalAttachments() {
        return listSched8AdditionalAttachments;
    }

    public void setListSched8AdditionalAttachments(
            List<MinimumCorporateIncomeTaxBean> listSched8AdditionalAttachments) {
        this.listSched8AdditionalAttachments = listSched8AdditionalAttachments;
    }

}
