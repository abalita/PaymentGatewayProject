package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GrossIncomeSubjectToFinalWithholdingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private long interestExempt;
    private long interestsActualAmt;
    private long interestsFinalTaxWthldPd;

    private long royaltiesExempt;
    private long royaltiesActualAmt;
    private long royaltiesFinalTaxWthldPd;

    private long dividendsExempt;
    private long dividendsActualAmt;
    private long dividendsFinalTaxWthldPd;

    private long prizesWinningsExempt;
    private long prizesWinningsActualAmt;
    private long prizesWinningsFinalTaxWthldPd;

    private List<OtherGrossIncomeBean> otherGrossIncome;

    public GrossIncomeSubjectToFinalWithholdingBean() {
    }

    public GrossIncomeSubjectToFinalWithholdingBean(
            long interestExempt,
            long interestsActualAmt,
            long interestsFinalTaxWthldPd,
            long royaltiesExempt,
            long royaltiesActualAmt,
            long royaltiesFinalTaxWthldPd,
            long dividendsExempt,
            long dividendsActualAmt,
            long dividendsFinalTaxWthldPd,
            long prizesWinningsExempt,
            long prizesWinningsActualAmt,
            long prizesWinningsFinalTaxWthldPd
    ) {

        this.interestExempt = interestExempt;
        this.interestsActualAmt = interestsActualAmt;
        this.interestsFinalTaxWthldPd = interestsFinalTaxWthldPd;
        this.royaltiesExempt = royaltiesExempt;
        this.royaltiesActualAmt = royaltiesActualAmt;
        this.royaltiesFinalTaxWthldPd = royaltiesFinalTaxWthldPd;
        this.dividendsExempt = dividendsExempt;
        this.dividendsActualAmt = dividendsActualAmt;
        this.dividendsFinalTaxWthldPd = dividendsFinalTaxWthldPd;
        this.prizesWinningsExempt = prizesWinningsExempt;
        this.prizesWinningsActualAmt = prizesWinningsActualAmt;
        this.prizesWinningsFinalTaxWthldPd = prizesWinningsFinalTaxWthldPd;

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getInterestExempt() {
        return interestExempt;
    }

    public void setInterestExempt(long interestExempt) {
        this.interestExempt = interestExempt;
    }

    public long getInterestsActualAmt() {
        return interestsActualAmt;
    }

    public void setInterestsActualAmt(long interestsActualAmt) {
        this.interestsActualAmt = interestsActualAmt;
    }

    public long getInterestsFinalTaxWthldPd() {
        return interestsFinalTaxWthldPd;
    }

    public void setInterestsFinalTaxWthldPd(long interestsFinalTaxWthldPd) {
        this.interestsFinalTaxWthldPd = interestsFinalTaxWthldPd;
    }

    public long getRoyaltiesExempt() {
        return royaltiesExempt;
    }

    public void setRoyaltiesExempt(long royaltiesExempt) {
        this.royaltiesExempt = royaltiesExempt;
    }

    public long getRoyaltiesActualAmt() {
        return royaltiesActualAmt;
    }

    public void setRoyaltiesActualAmt(long royaltiesActualAmt) {
        this.royaltiesActualAmt = royaltiesActualAmt;
    }

    public long getRoyaltiesFinalTaxWthldPd() {
        return royaltiesFinalTaxWthldPd;
    }

    public void setRoyaltiesFinalTaxWthldPd(long royaltiesFinalTaxWthldPd) {
        this.royaltiesFinalTaxWthldPd = royaltiesFinalTaxWthldPd;
    }

    public long getDividendsExempt() {
        return dividendsExempt;
    }

    public void setDividendsExempt(long dividendsExempt) {
        this.dividendsExempt = dividendsExempt;
    }

    public long getDividendsActualAmt() {
        return dividendsActualAmt;
    }

    public void setDividendsActualAmt(long dividendsActualAmt) {
        this.dividendsActualAmt = dividendsActualAmt;
    }

    public long getDividendsFinalTaxWthldPd() {
        return dividendsFinalTaxWthldPd;
    }

    public void setDividendsFinalTaxWthldPd(long dividendsFinalTaxWthldPd) {
        this.dividendsFinalTaxWthldPd = dividendsFinalTaxWthldPd;
    }

    public long getPrizesWinningsExempt() {
        return prizesWinningsExempt;
    }

    public void setPrizesWinningsExempt(long prizesWinningsExempt) {
        this.prizesWinningsExempt = prizesWinningsExempt;
    }

    public long getPrizesWinningsActualAmt() {
        return prizesWinningsActualAmt;
    }

    public void setPrizesWinningsActualAmt(long prizesWinningsActualAmt) {
        this.prizesWinningsActualAmt = prizesWinningsActualAmt;
    }

    public long getPrizesWinningsFinalTaxWthldPd() {
        return prizesWinningsFinalTaxWthldPd;
    }

    public void setPrizesWinningsFinalTaxWthldPd(long prizesWinningsFinalTaxWthldPd) {
        this.prizesWinningsFinalTaxWthldPd = prizesWinningsFinalTaxWthldPd;
    }

    public List<OtherGrossIncomeBean> getOtherGrossIncome() {
        return otherGrossIncome;
    }

    public void setOtherGrossIncome(List<OtherGrossIncomeBean> otherGrossIncome) {
        this.otherGrossIncome = otherGrossIncome;
    }

}
