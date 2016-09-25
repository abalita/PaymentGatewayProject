package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReconciliationOfNetIncomeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private long netIncomePerBooks;

    private String nonDeductibleExpensesItem2Description;
    private long nonDeductibleExpensesItem2Value;
    private String nonDeductibleExpensesItem3Description;
    private long nonDeductibleExpensesItem3Value;
    private List<ExpandableOther> listOfNonDeductibleExpensesItem3;

    private long totalNonDeductibleExpenses;

    private String nonTaxableAndSpDeductionsItem5Description;
    private long nonTaxableAndSpDeductionsItem5Value;
    private String nonTaxableAndSpDeductionsItem6Description;
    private long nonTaxableAndSpDeductionsItem6Value;
    private List<ExpandableOther> listOfnonTaxableAndSpDeductionsItem6;

    private String specialDeductionsItem7Description;
    private long specialDeductionsItem7Value;
    private String specialDeductionsItem8Description;
    private long specialDeductionsItem8Value;
    private List<ExpandableOther> listOfSpecialDeductionsItem8;

    private long totalNonTaxableAndSpDeductions;
    private long netTaxableIncome;

    public ReconciliationOfNetIncomeBean() {
    }

    public ReconciliationOfNetIncomeBean(
            long netIncomePerBooks,
            String nonDeductibleExpensesItem2Description,
            long nonDeductibleExpensesItem2Value,
            String nonDeductibleExpensesItem3Description,
            long nonDeductibleExpensesItem3Value,
            long totalNonDeductibleExpenses,
            String nonTaxableAndSpDeductionsItem5Description,
            long nonTaxableAndSpDeductionsItem5Value,
            String nonTaxableAndSpDeductionsItem6Description,
            long nonTaxableAndSpDeductionsItem6Value,
            String specialDeductionsItem7Description,
            long specialDeductionsItem7Value,
            String specialDeductionsItem8Description,
            long specialDeductionsItem8Value,
            long totalNonTaxableAndSpDeductions,
            long netTaxableIncome
    ) {

        this.netIncomePerBooks = netIncomePerBooks;
        this.nonDeductibleExpensesItem2Description = nonDeductibleExpensesItem2Description;
        this.nonDeductibleExpensesItem2Value = nonDeductibleExpensesItem2Value;
        this.nonDeductibleExpensesItem3Description = nonDeductibleExpensesItem3Description;
        this.nonDeductibleExpensesItem3Value = nonDeductibleExpensesItem3Value;
        this.totalNonDeductibleExpenses = totalNonDeductibleExpenses;
        this.nonTaxableAndSpDeductionsItem5Description = nonTaxableAndSpDeductionsItem5Description;
        this.nonTaxableAndSpDeductionsItem5Value = nonTaxableAndSpDeductionsItem5Value;
        this.nonTaxableAndSpDeductionsItem6Description = nonTaxableAndSpDeductionsItem6Description;
        this.nonTaxableAndSpDeductionsItem6Value = nonTaxableAndSpDeductionsItem6Value;
        this.specialDeductionsItem7Description = specialDeductionsItem7Description;
        this.specialDeductionsItem7Value = specialDeductionsItem7Value;
        this.specialDeductionsItem8Description = specialDeductionsItem8Description;
        this.specialDeductionsItem8Value = specialDeductionsItem8Value;
        this.totalNonTaxableAndSpDeductions = totalNonTaxableAndSpDeductions;
        this.netTaxableIncome = netTaxableIncome;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getNetIncomePerBooks() {
        return netIncomePerBooks;
    }

    public void setNetIncomePerBooks(long netIncomePerBooks) {
        this.netIncomePerBooks = netIncomePerBooks;
    }

    public String getNonDeductibleExpensesItem2Description() {
        return nonDeductibleExpensesItem2Description;
    }

    public void setNonDeductibleExpensesItem2Description(
            String nonDeductibleExpensesItem2Description) {
        this.nonDeductibleExpensesItem2Description = nonDeductibleExpensesItem2Description;
    }

    public long getNonDeductibleExpensesItem2Value() {
        return nonDeductibleExpensesItem2Value;
    }

    public void setNonDeductibleExpensesItem2Value(
            long nonDeductibleExpensesItem2Value) {
        this.nonDeductibleExpensesItem2Value = nonDeductibleExpensesItem2Value;
    }

    public String getNonDeductibleExpensesItem3Description() {
        return nonDeductibleExpensesItem3Description;
    }

    public void setNonDeductibleExpensesItem3Description(
            String nonDeductibleExpensesItem3Description) {
        this.nonDeductibleExpensesItem3Description = nonDeductibleExpensesItem3Description;
    }

    public long getNonDeductibleExpensesItem3Value() {
        return nonDeductibleExpensesItem3Value;
    }

    public void setNonDeductibleExpensesItem3Value(
            long nonDeductibleExpensesItem3Value) {
        this.nonDeductibleExpensesItem3Value = nonDeductibleExpensesItem3Value;
    }

    public long getTotalNonDeductibleExpenses() {
        return totalNonDeductibleExpenses;
    }

    public void setTotalNonDeductibleExpenses(long totalNonDeductibleExpenses) {
        this.totalNonDeductibleExpenses = totalNonDeductibleExpenses;
    }

    public String getNonTaxableAndSpDeductionsItem5Description() {
        return nonTaxableAndSpDeductionsItem5Description;
    }

    public void setNonTaxableAndSpDeductionsItem5Description(
            String nonTaxableAndSpDeductionsItem5Description) {
        this.nonTaxableAndSpDeductionsItem5Description = nonTaxableAndSpDeductionsItem5Description;
    }

    public long getNonTaxableAndSpDeductionsItem5Value() {
        return nonTaxableAndSpDeductionsItem5Value;
    }

    public void setNonTaxableAndSpDeductionsItem5Value(
            long nonTaxableAndSpDeductionsItem5Value) {
        this.nonTaxableAndSpDeductionsItem5Value = nonTaxableAndSpDeductionsItem5Value;
    }

    public String getNonTaxableAndSpDeductionsItem6Description() {
        return nonTaxableAndSpDeductionsItem6Description;
    }

    public void setNonTaxableAndSpDeductionsItem6Description(
            String nonTaxableAndSpDeductionsItem6Description) {
        this.nonTaxableAndSpDeductionsItem6Description = nonTaxableAndSpDeductionsItem6Description;
    }

    public long getNonTaxableAndSpDeductionsItem6Value() {
        return nonTaxableAndSpDeductionsItem6Value;
    }

    public void setNonTaxableAndSpDeductionsItem6Value(
            long nonTaxableAndSpDeductionsItem6Value) {
        this.nonTaxableAndSpDeductionsItem6Value = nonTaxableAndSpDeductionsItem6Value;
    }

    public String getSpecialDeductionsItem7Description() {
        return specialDeductionsItem7Description;
    }

    public void setSpecialDeductionsItem7Description(
            String specialDeductionsItem7Description) {
        this.specialDeductionsItem7Description = specialDeductionsItem7Description;
    }

    public long getSpecialDeductionsItem7Value() {
        return specialDeductionsItem7Value;
    }

    public void setSpecialDeductionsItem7Value(long specialDeductionsItem7Value) {
        this.specialDeductionsItem7Value = specialDeductionsItem7Value;
    }

    public String getSpecialDeductionsItem8Description() {
        return specialDeductionsItem8Description;
    }

    public void setSpecialDeductionsItem8Description(
            String specialDeductionsItem8Description) {
        this.specialDeductionsItem8Description = specialDeductionsItem8Description;
    }

    public long getSpecialDeductionsItem8Value() {
        return specialDeductionsItem8Value;
    }

    public void setSpecialDeductionsItem8Value(long specialDeductionsItem8Value) {
        this.specialDeductionsItem8Value = specialDeductionsItem8Value;
    }

    public long getTotalNonTaxableAndSpDeductions() {
        return totalNonTaxableAndSpDeductions;
    }

    public void setTotalNonTaxableAndSpDeductions(
            long totalNonTaxableAndSpDeductions) {
        this.totalNonTaxableAndSpDeductions = totalNonTaxableAndSpDeductions;
    }

    public long getNetTaxableIncome() {
        return netTaxableIncome;
    }

    public void setNetTaxableIncome(long netTaxableIncome) {
        this.netTaxableIncome = netTaxableIncome;
    }

    public List<ExpandableOther> getListOfNonDeductibleExpensesItem3() {
        return listOfNonDeductibleExpensesItem3;
    }

    public void setListOfNonDeductibleExpensesItem3(
            List<ExpandableOther> listOfNonDeductibleExpensesItem3) {
        this.listOfNonDeductibleExpensesItem3 = listOfNonDeductibleExpensesItem3;
    }

    public List<ExpandableOther> getListOfnonTaxableAndSpDeductionsItem6() {
        return listOfnonTaxableAndSpDeductionsItem6;
    }

    public void setListOfnonTaxableAndSpDeductionsItem6(
            List<ExpandableOther> listOfnonTaxableAndSpDeductionsItem6) {
        this.listOfnonTaxableAndSpDeductionsItem6 = listOfnonTaxableAndSpDeductionsItem6;
    }

    public List<ExpandableOther> getListOfSpecialDeductionsItem8() {
        return listOfSpecialDeductionsItem8;
    }

    public void setListOfSpecialDeductionsItem8(
            List<ExpandableOther> listOfSpecialDeductionsItem8) {
        this.listOfSpecialDeductionsItem8 = listOfSpecialDeductionsItem8;
    }

}
