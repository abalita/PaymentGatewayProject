package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ComputationOfNetOperatingLossCarryOverBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grossIncome = "0";
    private String lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = "0";
    private String netOperatingLoss = "0";

    private List<OperatingLossBean> listSched6OperatingLoss;

    private String netOperatingLossYearIncurred1 = "0";
    private String netOperatingLossYearIncurred2 = "0";
    private String netOperatingLossYearIncurred3 = "0";
    private String netOperatingLossYearIncurred4 = "0";

    private long netOperatingLossAmount1;
    private long netOperatingLossAmount2;
    private long netOperatingLossAmount3;
    private long netOperatingLossAmount4;

    private long NOLCOAppliedPreviousYear1;
    private long NOLCOAppliedPreviousYear2;
    private long NOLCOAppliedPreviousYear3;
    private long NOLCOAppliedPreviousYear4;
    private long NOLCOExpired1;
    private long NOLCOExpired2;
    private long NOLCOExpired3;
    private long NOLCOExpired4;

    private long NOLCOAppliedCurrentYear1;
    private long NOLCOAppliedCurrentYear2;
    private long NOLCOAppliedCurrentYear3;
    private long NOLCOAppliedCurrentYear4;

    private long netOperatingLossUnapplied1;
    private long netOperatingLossUnapplied2;
    private long netOperatingLossUnapplied3;
    private long netOperatingLossUnapplied4;

    private long totalNOLCO;

    public ComputationOfNetOperatingLossCarryOverBean() {

    }

    public ComputationOfNetOperatingLossCarryOverBean(
            String grossIncome,
            String lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw,
            String netOperatingLoss,
            String netOperatingLossYearIncurred1,
            String netOperatingLossYearIncurred2,
            String netOperatingLossYearIncurred3,
            String netOperatingLossYearIncurred4,
            long netOperatingLossAmount1,
            long netOperatingLossAmount2,
            long netOperatingLossAmount3,
            long netOperatingLossAmount4,
            long NOLCOAppliedPreviousYear1,
            long NOLCOAppliedPreviousYear2,
            long NOLCOAppliedPreviousYear3,
            long NOLCOAppliedPreviousYear4,
            long NOLCOExpired1,
            long NOLCOExpired2,
            long NOLCOExpired3,
            long NOLCOExpired4,
            long NOLCOAppliedCurrentYear1,
            long NOLCOAppliedCurrentYear2,
            long NOLCOAppliedCurrentYear3,
            long NOLCOAppliedCurrentYear4,
            long netOperatingLossUnapplied1,
            long netOperatingLossUnapplied2,
            long netOperatingLossUnapplied3,
            long netOperatingLossUnapplied4,
            long totalNOLCO
    ) {
        this.grossIncome = grossIncome;
        this.lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw;
        this.netOperatingLoss = netOperatingLoss;
        this.netOperatingLossYearIncurred1 = netOperatingLossYearIncurred1;
        this.netOperatingLossYearIncurred2 = netOperatingLossYearIncurred2;
        this.netOperatingLossYearIncurred3 = netOperatingLossYearIncurred3;
        this.netOperatingLossYearIncurred4 = netOperatingLossYearIncurred4;
        this.netOperatingLossAmount1 = netOperatingLossAmount1;
        this.netOperatingLossAmount2 = netOperatingLossAmount2;
        this.netOperatingLossAmount3 = netOperatingLossAmount3;
        this.netOperatingLossAmount4 = netOperatingLossAmount4;
        this.NOLCOAppliedPreviousYear1 = NOLCOAppliedPreviousYear1;
        this.NOLCOAppliedPreviousYear2 = NOLCOAppliedPreviousYear2;
        this.NOLCOAppliedPreviousYear3 = NOLCOAppliedPreviousYear3;
        this.NOLCOAppliedPreviousYear4 = NOLCOAppliedPreviousYear4;
        this.NOLCOExpired1 = NOLCOExpired1;
        this.NOLCOExpired2 = NOLCOExpired2;
        this.NOLCOExpired3 = NOLCOExpired3;
        this.NOLCOExpired4 = NOLCOExpired4;
        this.NOLCOAppliedCurrentYear1 = NOLCOAppliedCurrentYear1;
        this.NOLCOAppliedCurrentYear2 = NOLCOAppliedCurrentYear2;
        this.NOLCOAppliedCurrentYear3 = NOLCOAppliedCurrentYear3;
        this.NOLCOAppliedCurrentYear4 = NOLCOAppliedCurrentYear4;
        this.netOperatingLossUnapplied1 = netOperatingLossUnapplied1;
        this.netOperatingLossUnapplied2 = netOperatingLossUnapplied2;
        this.netOperatingLossUnapplied3 = netOperatingLossUnapplied3;
        this.netOperatingLossUnapplied4 = netOperatingLossUnapplied4;
        this.totalNOLCO = totalNOLCO;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(String grossIncome) {
        this.grossIncome = grossIncome;
    }

    public String getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw() {
        return lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw;
    }

    public void setLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw(
            String lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw) {
        this.lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw;
    }

    public String getNetOperatingLoss() {
        return netOperatingLoss;
    }

    public void setNetOperatingLoss(String netOperatingLoss) {
        this.netOperatingLoss = netOperatingLoss;
    }

    public List<OperatingLossBean> getListSched6OperatingLoss() {
        return listSched6OperatingLoss;
    }

    public void setListSched6OperatingLoss(
            List<OperatingLossBean> listSched6OperatingLoss) {
        this.listSched6OperatingLoss = listSched6OperatingLoss;
    }

    public String getNetOperatingLossYearIncurred1() {
        return netOperatingLossYearIncurred1;
    }

    public void setNetOperatingLossYearIncurred1(
            String netOperatingLossYearIncurred1) {
        this.netOperatingLossYearIncurred1 = netOperatingLossYearIncurred1;
    }

    public String getNetOperatingLossYearIncurred2() {
        return netOperatingLossYearIncurred2;
    }

    public void setNetOperatingLossYearIncurred2(
            String netOperatingLossYearIncurred2) {
        this.netOperatingLossYearIncurred2 = netOperatingLossYearIncurred2;
    }

    public String getNetOperatingLossYearIncurred3() {
        return netOperatingLossYearIncurred3;
    }

    public void setNetOperatingLossYearIncurred3(
            String netOperatingLossYearIncurred3) {
        this.netOperatingLossYearIncurred3 = netOperatingLossYearIncurred3;
    }

    public String getNetOperatingLossYearIncurred4() {
        return netOperatingLossYearIncurred4;
    }

    public void setNetOperatingLossYearIncurred4(
            String netOperatingLossYearIncurred4) {
        this.netOperatingLossYearIncurred4 = netOperatingLossYearIncurred4;
    }

    public long getNetOperatingLossAmount1() {
        return netOperatingLossAmount1;
    }

    public void setNetOperatingLossAmount1(long netOperatingLossAmount1) {
        this.netOperatingLossAmount1 = netOperatingLossAmount1;
    }

    public long getNetOperatingLossAmount2() {
        return netOperatingLossAmount2;
    }

    public void setNetOperatingLossAmount2(long netOperatingLossAmount2) {
        this.netOperatingLossAmount2 = netOperatingLossAmount2;
    }

    public long getNetOperatingLossAmount3() {
        return netOperatingLossAmount3;
    }

    public void setNetOperatingLossAmount3(long netOperatingLossAmount3) {
        this.netOperatingLossAmount3 = netOperatingLossAmount3;
    }

    public long getNetOperatingLossAmount4() {
        return netOperatingLossAmount4;
    }

    public void setNetOperatingLossAmount4(long netOperatingLossAmount4) {
        this.netOperatingLossAmount4 = netOperatingLossAmount4;
    }

    public long getNOLCOAppliedPreviousYear1() {
        return NOLCOAppliedPreviousYear1;
    }

    public void setNOLCOAppliedPreviousYear1(long nOLCOAppliedPreviousYear1) {
        NOLCOAppliedPreviousYear1 = nOLCOAppliedPreviousYear1;
    }

    public long getNOLCOAppliedPreviousYear2() {
        return NOLCOAppliedPreviousYear2;
    }

    public void setNOLCOAppliedPreviousYear2(long nOLCOAppliedPreviousYear2) {
        NOLCOAppliedPreviousYear2 = nOLCOAppliedPreviousYear2;
    }

    public long getNOLCOAppliedPreviousYear3() {
        return NOLCOAppliedPreviousYear3;
    }

    public void setNOLCOAppliedPreviousYear3(long nOLCOAppliedPreviousYear3) {
        NOLCOAppliedPreviousYear3 = nOLCOAppliedPreviousYear3;
    }

    public long getNOLCOAppliedPreviousYear4() {
        return NOLCOAppliedPreviousYear4;
    }

    public void setNOLCOAppliedPreviousYear4(long nOLCOAppliedPreviousYear4) {
        NOLCOAppliedPreviousYear4 = nOLCOAppliedPreviousYear4;
    }

    public long getNOLCOExpired1() {
        return NOLCOExpired1;
    }

    public void setNOLCOExpired1(long nOLCOExpired1) {
        NOLCOExpired1 = nOLCOExpired1;
    }

    public long getNOLCOExpired2() {
        return NOLCOExpired2;
    }

    public void setNOLCOExpired2(long nOLCOExpired2) {
        NOLCOExpired2 = nOLCOExpired2;
    }

    public long getNOLCOExpired3() {
        return NOLCOExpired3;
    }

    public void setNOLCOExpired3(long nOLCOExpired3) {
        NOLCOExpired3 = nOLCOExpired3;
    }

    public long getNOLCOExpired4() {
        return NOLCOExpired4;
    }

    public void setNOLCOExpired4(long nOLCOExpired4) {
        NOLCOExpired4 = nOLCOExpired4;
    }

    public long getNOLCOAppliedCurrentYear1() {
        return NOLCOAppliedCurrentYear1;
    }

    public void setNOLCOAppliedCurrentYear1(long nOLCOAppliedCurrentYear1) {
        NOLCOAppliedCurrentYear1 = nOLCOAppliedCurrentYear1;
    }

    public long getNOLCOAppliedCurrentYear2() {
        return NOLCOAppliedCurrentYear2;
    }

    public void setNOLCOAppliedCurrentYear2(long nOLCOAppliedCurrentYear2) {
        NOLCOAppliedCurrentYear2 = nOLCOAppliedCurrentYear2;
    }

    public long getNOLCOAppliedCurrentYear3() {
        return NOLCOAppliedCurrentYear3;
    }

    public void setNOLCOAppliedCurrentYear3(long nOLCOAppliedCurrentYear3) {
        NOLCOAppliedCurrentYear3 = nOLCOAppliedCurrentYear3;
    }

    public long getNOLCOAppliedCurrentYear4() {
        return NOLCOAppliedCurrentYear4;
    }

    public void setNOLCOAppliedCurrentYear4(long nOLCOAppliedCurrentYear4) {
        NOLCOAppliedCurrentYear4 = nOLCOAppliedCurrentYear4;
    }

    public long getNetOperatingLossUnapplied1() {
        return netOperatingLossUnapplied1;
    }

    public void setNetOperatingLossUnapplied1(long netOperatingLossUnapplied1) {
        this.netOperatingLossUnapplied1 = netOperatingLossUnapplied1;
    }

    public long getNetOperatingLossUnapplied2() {
        return netOperatingLossUnapplied2;
    }

    public void setNetOperatingLossUnapplied2(long netOperatingLossUnapplied2) {
        this.netOperatingLossUnapplied2 = netOperatingLossUnapplied2;
    }

    public long getNetOperatingLossUnapplied3() {
        return netOperatingLossUnapplied3;
    }

    public void setNetOperatingLossUnapplied3(long netOperatingLossUnapplied3) {
        this.netOperatingLossUnapplied3 = netOperatingLossUnapplied3;
    }

    public long getNetOperatingLossUnapplied4() {
        return netOperatingLossUnapplied4;
    }

    public void setNetOperatingLossUnapplied4(long netOperatingLossUnapplied4) {
        this.netOperatingLossUnapplied4 = netOperatingLossUnapplied4;
    }

    public long getTotalNOLCO() {
        return totalNOLCO;
    }

    public void setTotalNOLCO(long totalNOLCO) {
        this.totalNOLCO = totalNOLCO;
    }

}
