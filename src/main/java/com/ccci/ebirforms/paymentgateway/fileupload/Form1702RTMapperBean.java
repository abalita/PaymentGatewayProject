/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 24, 2016
 *  File: Form1702RTMapperBean.java
 *  Package: com.ccci.ebirforms.paymentgateway.fileupload
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.fileupload;

import com.ccci.ebirforms.paymentgateway.core.bean.AbstractFormBean;
import com.ccci.ebirforms.paymentgateway.core.bean.AbstractMapperBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.BalanceSheetBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfMinimumCorporateIncomeTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfNetOperatingLossCarryOverBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.CostOfSaleBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ExternalAuditorAccreditedTaxAgentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.GrossIncomeSubjectToFinalWithholdingBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ReconciliationOfNetIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.SalesRevenueBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.StockholdersPartnersMembersInformationBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxCreditsPaymentsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxReliefAvailmentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxpayerBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TotalTaxPayableBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTBeanBuilder;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTTO;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTWSBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTWsBuilder;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
public class Form1702RTMapperBean extends AbstractMapperBean {

    private static Form1702RTTO formTO;
    private static Form1702RTBean form1702RTBean;

    public AbstractFormBean build() throws ParseException {

        Form1702RTWSBean bean = new Form1702RTWSBean();
        bean.setTaxpayerBean(createTaxPayerBean());
        bean.setTotalTaxpayerBean(createTotalTaxPayableBean());
        bean.setComputationOfTaxBean(createCompTax());
        bean.setTaxReliefAvailmentBean(createTaxRelief());
        bean.setExternalAuditorAccreditedTaxAgentBean(createExternalAuditorAccredited());
        bean.setSalesRevenueBean(createSalesRevenueBean());
        bean.setCostOfSaleBean(createCostOfSaleBean());

        //TODO: populate otherTaxableIncomeNotSubjectedToFinalTaxBean
//        bean.setOtherTaxableIncomeNotSubjectedToFinalTaxBean(otherTaxableIncomeNotSubjectedToFinalTaxBean);
        bean.setComputationOfNetOperatingLossCarryOverBean(createComputationNOLCO());
        bean.setTaxCreditsPaymentsBean(createTaxCreditsPaymentsBean());
        bean.setComputationOfMinimumCorporateIncomeTaxBean(createComputationMCIT());
        bean.setReconciliationOfNetIncomeBean(createReconciliationOfNetIncome());
        bean.setBalanceSheetBean(createBalanceSheetBean());
        bean.setStockholdersPartnersMembersInformationBean(createstockholdersPartnersMembersInformation());
        bean.setTaxpayerGrossIncome(createTaxpayerGrossIncome());

        formTO = new Form1702RTTO();
        Form1702RTWsBuilder.build(formTO, bean);
        form1702RTBean = new Form1702RTBean();
        Form1702RTBeanBuilder.moveTransferObjectToBean(form1702RTBean, formTO);

        return form1702RTBean;
    }

    public TaxpayerBean createTaxPayerBean() {

        return new TaxpayerBean(
                getTin("txtPg1Pt1I6TIN1", "txtPg1Pt1I6TIN2", "txtPg1Pt1I6TIN3"),
                getValue("txtPg1Pt1I6TIN4"),
                "",
                "",
                "",
                "",
                null,
                0,
                getDate("txtPg1Pt1I8"),
                null,
                getValue("txtZIP"),
                "",
                getValue("txtPg1Pt1I6TIN1"),
                getValue("txtPg1Pt1I6TIN2"),
                getValue("txtPg1Pt1I6TIN3"),
                getValue("txtPg1Pt1I10Address"),
                null,
                null,
                getReturnPeriod("ddlPg1I2Month", "txtPg1I2Year"),
                getValue("txtPg1Pt1I12Email"),
                0,
                (getBoolean("rdoPg1I2AmmendYes") ? "Y" : "N"),
                0,
                (getBoolean("rdoPg1I2AmmendYes") ? "Y" : "N"),
                (getBoolean("rdoPg1I4ShortPeriodYes") ? "Y" : "N"),
                getValue("drpPg1I5AtcOther"),
                getInteger("txtPg1Pt2PagesFilled"),
                getValue("txtPg1Pt1I11Contact"),
                getValue("txtPg1Pt1I13Business"),
                getValue("txtPg1Pt1I14PSIC"),
                (getBoolean("rdoPg1Pt1I15ItemizedDeduction") ? "Y" : "N"),
                getValue("txtPg1Pt1I13Business"),
                (getBoolean("rdoPg1I1Calendar") ? "C" : "F"),
                getValue("ddlPg1I2Month"),
                getValue("txtPg1I2Year"),
                getValue("drpPg1Pt1I7RDOCode"),
                "",
                "",
                "",
                getValue("txtPg1Pt1I9Name"),
                (getBoolean("rdoPg1Pt2I22CTC") ? "CTC" : "SEC"),
                (getBoolean("rdoPg1I2AmmendYes") ? "Y" : "N"),
                (getBoolean("rdoPg1I5Atc")),
                (getBoolean("rdoPg1I5AtcOther")),
                null,
                null,
                "",
                "",
                "",
                "",
                "",
                ""
        );

    }

    public TotalTaxPayableBean createTotalTaxPayableBean() {

        String overpayment = "";
        if ((getBoolean("rdoPg1Pt2I21OverpaymentRefunded"))) {
            overpayment = "R";
        } else if (getBoolean("rdoPg1Pt2I21OverpaymentIssued")) {
            overpayment = "R";
        } else if (getBoolean("rdoPg1Pt2I21OverpaymentCarried")) {
            overpayment = "C";
        }

        return new TotalTaxPayableBean(
                getLong("txtPg1Pt2I16IncomeTax"),
                getLong("txtPg1Pt2I17TotalTaxCredits"),
                getLong("txtPg1Pt2I19TotalPenalties"),
                0, //netTaxPayable
                0, //taxFilerTaxDue
                0, //taxFilerSpouseTaxDue
                0, //taxFilerCredits
                0, //taxFilerSpouseCredits
                0, //portionOfTaxPayableAllowed
                0, //totalAmountPayableUponFilling
                0,
                0, //totalTaxPayable
                0.0, //netAmountTaxPayable
                getValue("txtPg1Pt2I22CTC"),
                getDate("txtPg1Pt2I23Date"),
                getValue("txtPg1Pt2I24PlaceOfIssue"),
                getValue("txtPg1Pt2I25AmountCTC"),
                overpayment,
                getLong("txtPg1Pt2I20TotalAmount"),
                0
        );
    }

    public ComputationOfTaxBean createCompTax() {

        return new ComputationOfTaxBean(
                getLong("txtPg2Pt4I31LessCost"),
                getLong("txtPg2Pt4I32GrossIncome"),
                getLong("txtPg2Pt4I42IncomeTaxDue"),
                30,
                0,
                getLong("txtPg2Pt4I43MinimumCorporate"),
                getLong("txtPg2Pt4I30NetSales"),
                getLong("txtPg2Pt4I46NetTax"),
                getLong("txtPg2Pt4I40NetTaxable"),
                getLong("txtPg2Pt4I37Nolco"),
                getBoolean("rdoPg1Pt1I15OptionalStandard"),
                getLong("txtPg2Pt4I39OptionalStandard"),
                getBoolean("rdoPg1Pt1I15OptionalStandard"),
                getLong("txtPg2Pt4I35OrdinaryAllowable"),
                getBoolean("rdoPg1Pt1I15ItemizedDeduction"),
                getLong("txtPg2Pt4I33AddOtherTaxable"),
                getLong("txtPg2Pt4I47Surcharge"),
                getLong("txtPg2Pt4I48Interest"),
                getLong("txtPg2Pt4I49Compromise"),
                getLong("txtPg2Pt4I50TotalPenalties"),
                getLong("txtPg2Pt4I36SpecialAllowable"),
                getBoolean("rdoPg1Pt1I15OptionalStandard"),
                getLong("txtPg2Pt4I51TotalAmount"),
                getLong("txtPg2Pt4I34TotalGross"),
                getLong("txtPg2Pt4I44TotalIncomeTax"),
                getLong("txtPg2Pt4I38TotalItemized"),
                getLong("txtPg2Pt4I45LessTotalTax")
        );
    }

    public TaxReliefAvailmentBean createTaxRelief() {
        return new TaxReliefAvailmentBean(
                0,
                getLong("txtPg2Pt5I52SpecialAllowable"),
                getLong("txtPg2Pt5I53AddSpecialTax"),
                getLong("txtPg2Pt5I54TotalTax")
        );
    }

    public ExternalAuditorAccreditedTaxAgentBean createExternalAuditorAccredited() {

        return new ExternalAuditorAccreditedTaxAgentBean(
                getValue("txtPg2Pt6I55Name"),
                appendParams("txtPg2Pt6I56TIN1", "txtPg2Pt6I56TIN2", "txtPg2Pt6I56TIN3", "txtPg2Pt6I56TIN4"),
                getValue("txtPg2Pt6I57Name"),
                appendParams("txtPg2Pt6I58TIN1", "txtPg2Pt6I58TIN2", "txtPg2Pt6I58TIN3", "txtPg2Pt6I58TIN4"),
                appendParams("txtPg2Pt6I59BIR1", "txtPg2Pt6I59BIR2", "txtPg2Pt6I59BIR3", "txtPg2Pt6I59BIR4"),
                getDate("txtPg2Pt6I60IssueDate"),
                getDate("txtPg2Pt6I61ExpiryDate"),
                getValue("txtPg2Pt6I56TIN4"),
                getValue("txtPg2Pt6I58TIN4")
        );
    }

    private SalesRevenueBean createSalesRevenueBean() {

        return new SalesRevenueBean(
                getLong("txtPg3Sc1I1GoodsProp"),
                getLong("txtPg3Sc1I2SaleServices"),
                getLong("txtPg3Sc1I3LeaseProp"),
                getLong("txtPg3Sc1I4Total"),
                getLong("txtPg3Sc1I5LessSales"),
                getLong("txtPg3Sc1I6NetSales")
        );
    }

    private CostOfSaleBean createCostOfSaleBean() {

        return new CostOfSaleBean(
                getLong("txtPg3Sc2I1MerchInventory"),
                getLong("txtPg3Sc2I2AddPurchases"),
                getLong("txtPg3Sc2I3TotalGoods"),
                getLong("txtPg3Sc2I4LessMerch"),
                getLong("txtPg3Sc2I5CostofSales"),
                getLong("txtPg3Sc2I6DirectMaterials"),
                getLong("txtPg3Sc2I7AddPurchases"),
                getLong("txtPg3Sc2I8MaterialsAvaliable"),
                getLong("txtPg3Sc2I9LessDirectMat"),
                getLong("txtPg3Sc2I10RawMatUsed"),
                getLong("txtPg3Sc2I11DirectLabor"),
                getLong("txtPg3Sc2I12ManOverhead"),
                getLong("txtPg3Sc2I13TotalManCost"),
                getLong("txtPg3Sc2I14WorkProcess"),
                getLong("txtPg3Sc2I15LessWorkProcess"),
                getLong("txtPg3Sc2I16CostOfGoods"),
                getLong("txtPg3Sc2I17FinishedGoods"),
                getLong("txtPg3Sc2I18LessFinishGoods"),
                getLong("txtPg3Sc2I19CostOfGoods"),
                getLong("txtPg3Sc2I20DirectSalaries"),
                getLong("txtPg3Sc2I21DirectMaterials"),
                getLong("txtPg3Sc2I22DirectDepreciation"),
                getLong("txtPg3Sc2I23DirectRental"),
                getLong("txtPg3Sc2I24DirectOutside"),
                getLong("txtPg3Sc2I25DirectOthers"),
                getLong("txtPg3Sc2I26TotalService"),
                getLong("txtPg3Sc2I27TotalSales")
        );
    }

    private ComputationOfNetOperatingLossCarryOverBean createComputationNOLCO() {
        return new ComputationOfNetOperatingLossCarryOverBean(
                getValue("txtPg5Sc6I1GrossIncome"),
                getValue("txtPg5Sc6I2TotalDeductions"),
                getValue("txtPg5Sc6I3NetOperatingLoss"),
                getValue("txtPg5Sc6AI4C1"),
                getValue("txtPg5Sc6AI5C1"),
                getValue("txtPg5Sc6AI6C1"),
                getValue("txtPg5Sc6AI7C1"),
                getLong("txtPg5Sc6AI4C2"),
                getLong("txtPg5Sc6AI5C2"),
                getLong("txtPg5Sc6AI6C2"),
                getLong("txtPg5Sc6AI7C2"),
                getLong("txtPg5Sc6AI4C3"),
                getLong("txtPg5Sc6AI5C3"),
                getLong("txtPg5Sc6AI6C3"),
                getLong("txtPg5Sc6AI7C3"),
                getLong("txtPg5Sc6AI4C4"),
                getLong("txtPg5Sc6AI5C4"),
                getLong("txtPg5Sc6AI6C4"),
                getLong("txtPg5Sc6AI7C4"),
                getLong("txtPg5Sc6AI4C5"),
                getLong("txtPg5Sc6AI5C5"),
                getLong("txtPg5Sc6AI6C5"),
                getLong("txtPg5Sc6AI7C5"),
                getLong("txtPg5Sc6AI4C6"),
                getLong("txtPg5Sc6AI5C6"),
                getLong("txtPg5Sc6AI6C6"),
                getLong("txtPg5Sc6AI7C6"),
                getLong("txtPg5Sc6AI8TotalNOLCO")
        );
    }

    private TaxCreditsPaymentsBean createTaxCreditsPaymentsBean() {
        return new TaxCreditsPaymentsBean(
                getLong("txtPg6Sc7I1ExcessCredits"),
                getLong("txtPg6Sc7I2IncomeTaxPaymentUnderMCIT"),
                getLong("txtPg6Sc7I3IncomeTaxUnderRegular"),
                getLong("txtPg6Sc7I4ExcessMCIT"),
                getLong("txtPg6Sc7I5CreditableTaxWithheldFromPrevious"),
                getLong("txtPg6Sc7I6CreditableTaxWithheldFor4thQuarter"),
                getLong("txtPg6Sc7I7ForeignTaxCredits"),
                getLong("txtPg6Sc7I8TaxPaidInReturn"),
                getLong("txtPg6Sc7I9SpecialTaxCredits")
        );
    }

    private ComputationOfMinimumCorporateIncomeTaxBean createComputationMCIT() {

        return new ComputationOfMinimumCorporateIncomeTaxBean(
                getLong("txtPg6Sc8I1C8"),
                getLong("txtPg6Sc8I2C8"),
                getLong("txtPg6Sc8I3C8"),
                getLong("txtPg6Sc8I1C7"),
                getLong("txtPg6Sc8I2C7"),
                getLong("txtPg6Sc8I3C7"),
                getLong("txtPg6Sc8I1C5"),
                getLong("txtPg6Sc8I2C5"),
                getLong("txtPg6Sc8I3C5"),
                getLong("txtPg6Sc8I1C4"),
                getLong("txtPg6Sc8I2C4"),
                getLong("txtPg6Sc8I3C4"),
                getLong("txtPg6Sc8I1C6"),
                getLong("txtPg6Sc8I2C6"),
                getLong("txtPg6Sc8I3C6"),
                getLong("txtPg6Sc8I1C3"),
                getLong("txtPg6Sc8I2C3"),
                getLong("txtPg6Sc8I3C3"),
                getValue("txtPg6Sc8I1C1"),
                getValue("txtPg6Sc8I2C1"),
                getValue("txtPg6Sc8I3C1"),
                getLong("txtPg6Sc8I1C2"),
                getLong("txtPg6Sc8I2C2"),
                getLong("txtPg6Sc8I3C2"),
                getLong("txtPg6Sc8I4TotalExcessMCIT")
        );
    }

    private ReconciliationOfNetIncomeBean createReconciliationOfNetIncome() {

        return new ReconciliationOfNetIncomeBean(
                getLong("txtPg6Sc9I1NetIncome"),
                getValue("txtPg6Sc9I2C1"),
                getLong("txtPg6Sc9I2C2"),
                getValue("txtPg6Sc9I3C1"),
                getLong("txtPg6Sc9I3C2"),
                getLong("txtPg6Sc9I4Total"),
                getValue("txtPg6Sc9I5C1"),
                getLong("txtPg6Sc9I5C2"),
                getValue("txtPg6Sc9I6C1"),
                getLong("txtPg6Sc9I6C2"),
                getValue("txtPg6Sc9I7C1"),
                getLong("txtPg6Sc9I7C2"),
                getValue("txtPg6Sc9I8C1"),
                getLong("txtPg6Sc9I8C2"),
                getLong("txtPg6Sc9I9Total"),
                getLong("txtPg6Sc9I10NetTaxableIncome")
        );
    }

    private BalanceSheetBean createBalanceSheetBean() {

        return new BalanceSheetBean(
                getLong("txtPg7Sc10I1CurrentAssets"),
                getLong("txtPg7Sc10I2LongTermInvestment"),
                getLong("txtPg7Sc10I3PropertyPlantEquipment"),
                getLong("txtPg7Sc10I4LongTermReceivables"),
                getLong("txtPg7Sc10I5IntangibleAssets"),
                getLong("txtPg7Sc10I6OtherAssets"),
                getLong("txtPg7Sc10I7TotalAssets"),
                getLong("txtPg7Sc10I8CurrentLiabilities"),
                getLong("txtPg7Sc10I9LongTermLiabilities"),
                getLong("txtPg7Sc10I10DeferredCredits"),
                getLong("txtPg7Sc10I11OtherLiabilities"),
                getLong("txtPg7Sc10I12TotalLiabilities"),
                getLong("txtPg7Sc10I13CapitalStock"),
                getLong("txtPg7Sc10I14AdditionalCapital"),
                getLong("txtPg7Sc10I15RetainedEarnings"),
                getLong("txtPg7Sc10I16TotalEquity"),
                getLong("txtPg7Sc10I17TotalLiabilitiesEquity")
        );
    }

    private StockholdersPartnersMembersInformationBean createstockholdersPartnersMembersInformation() {
        return new StockholdersPartnersMembersInformationBean();
    }

    private GrossIncomeSubjectToFinalWithholdingBean createTaxpayerGrossIncome() {
        return new GrossIncomeSubjectToFinalWithholdingBean(
                getLong("txtPg8Sc12I1C1"),
                getLong("txtPg8Sc12I1C2"),
                getLong("txtPg8Sc12I1C3"),
                getLong("txtPg8Sc12I2C1"),
                getLong("txtPg8Sc12I2C2"),
                getLong("txtPg8Sc12I2C3"),
                getLong("txtPg8Sc12I3C1"),
                getLong("txtPg8Sc12I3C2"),
                getLong("txtPg8Sc12I3C3"),
                getLong("txtPg8Sc12I4C1"),
                getLong("txtPg8Sc12I4C2"),
                getLong("txtPg8Sc12I4C3")
        );
    }

}
