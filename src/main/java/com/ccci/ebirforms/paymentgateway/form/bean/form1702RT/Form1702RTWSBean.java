/**
 *
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ccci.ebirforms.paymentgateway.form.bean.common.BalanceSheetBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfMinimumCorporateIncomeTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfNetOperatingLossCarryOverBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.CostOfSaleBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ExternalAuditorAccreditedTaxAgentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.GrossIncomeExemptFromIncomeTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.GrossIncomeSubjectToFinalWithholdingBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OrdinaryAllowableItemizedDeductionBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherCreditsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherExemptIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherTaxableIncomeNotSubjectedToFinalTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.PersonalPropertyReceivedBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.RealPropertySale;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ReconciliationOfNetIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.SalesRevenueBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.SpecialAllowableItemizedDeductionsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.StockShareSale;
import com.ccci.ebirforms.paymentgateway.form.bean.common.StockholdersPartnersMembersInformationBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxCreditsPaymentsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxReliefAvailmentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxpayerBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TotalTaxPayableBean;
import java.util.ArrayList;

/**
 * @author sardenrj
 *
 */
@XmlRootElement(name = "form1702RTBean")
@XmlAccessorType(XmlAccessType.FIELD)
public class Form1702RTWSBean {

    private TaxpayerBean taxpayerBean;
    private TotalTaxPayableBean totalTaxpayerBean;
    private ComputationOfTaxBean computationOfTaxBean;
    private TaxReliefAvailmentBean taxReliefAvailmentBean;
    private ExternalAuditorAccreditedTaxAgentBean externalAuditorAccreditedTaxAgentBean;
    private SalesRevenueBean salesRevenueBean;
    private CostOfSaleBean costOfSaleBean;
    private OtherTaxableIncomeNotSubjectedToFinalTaxBean otherTaxableIncomeNotSubjectedToFinalTaxBean;
    private OrdinaryAllowableItemizedDeductionBean ordinaryAllowableItemizedDeductionBean;
    private SpecialAllowableItemizedDeductionsBean specialAllowableItemizedDeductionBean;
    private ComputationOfNetOperatingLossCarryOverBean computationOfNetOperatingLossCarryOverBean;
    private TaxCreditsPaymentsBean taxCreditsPaymentsBean;
    private ComputationOfMinimumCorporateIncomeTaxBean computationOfMinimumCorporateIncomeTaxBean;
    private ReconciliationOfNetIncomeBean reconciliationOfNetIncomeBean;
    private BalanceSheetBean balanceSheetBean;
    private StockholdersPartnersMembersInformationBean stockholdersPartnersMembersInformationBean;
    private GrossIncomeSubjectToFinalWithholdingBean taxpayerGrossIncome;
    private List<RealPropertySale> taxpayerRealPropertySales;
    private List<StockShareSale> taxpayerStockShares;
    private List<OtherIncomeBean> taxpayerOtherIncome;
    private List<PersonalPropertyReceivedBean> taxpayerPersonalPropertyReceived;
    private List<OtherExemptIncomeBean> taxpayerOtherExemptIncome;
    private List<OtherCreditsBean> otherCreditsBean;
    private GrossIncomeExemptFromIncomeTaxBean taxpayerGrossIncomeExempt;

    public Form1702RTWSBean() {
        taxpayerBean = new TaxpayerBean();
        totalTaxpayerBean = new TotalTaxPayableBean();
        computationOfTaxBean = new ComputationOfTaxBean();
        taxReliefAvailmentBean = new TaxReliefAvailmentBean();
        externalAuditorAccreditedTaxAgentBean = new ExternalAuditorAccreditedTaxAgentBean();
        salesRevenueBean = new SalesRevenueBean();
        costOfSaleBean = new CostOfSaleBean();
        otherTaxableIncomeNotSubjectedToFinalTaxBean = new OtherTaxableIncomeNotSubjectedToFinalTaxBean();
        ordinaryAllowableItemizedDeductionBean = new OrdinaryAllowableItemizedDeductionBean();
        specialAllowableItemizedDeductionBean = new SpecialAllowableItemizedDeductionsBean();
        computationOfNetOperatingLossCarryOverBean = new ComputationOfNetOperatingLossCarryOverBean();
        taxCreditsPaymentsBean = new TaxCreditsPaymentsBean();
        computationOfMinimumCorporateIncomeTaxBean = new ComputationOfMinimumCorporateIncomeTaxBean();
        reconciliationOfNetIncomeBean = new ReconciliationOfNetIncomeBean();
        balanceSheetBean = new BalanceSheetBean();
        stockholdersPartnersMembersInformationBean = new StockholdersPartnersMembersInformationBean();
        taxpayerGrossIncome = new GrossIncomeSubjectToFinalWithholdingBean();
        taxpayerRealPropertySales = new ArrayList<RealPropertySale>();
        taxpayerStockShares = new ArrayList<StockShareSale>();
        taxpayerOtherIncome = new ArrayList<OtherIncomeBean>();
        taxpayerPersonalPropertyReceived = new ArrayList<PersonalPropertyReceivedBean>();
        taxpayerOtherExemptIncome = new ArrayList<OtherExemptIncomeBean>();
        otherCreditsBean = new ArrayList<OtherCreditsBean>();
        taxpayerGrossIncomeExempt = new GrossIncomeExemptFromIncomeTaxBean();

    }

    /**
     * @return the taxpayerBean
     */
    public TaxpayerBean getTaxpayerBean() {
        return taxpayerBean;
    }

    /**
     * @param taxpayerBean the taxpayerBean to set
     */
    public void setTaxpayerBean(TaxpayerBean taxpayerBean) {
        this.taxpayerBean = taxpayerBean;
    }

    /**
     * @return the totalTaxpayerBean
     */
    public TotalTaxPayableBean getTotalTaxpayerBean() {
        return totalTaxpayerBean;
    }

    /**
     * @param totalTaxpayerBean the totalTaxpayerBean to set
     */
    public void setTotalTaxpayerBean(TotalTaxPayableBean totalTaxpayerBean) {
        this.totalTaxpayerBean = totalTaxpayerBean;
    }

    /**
     * @return the computationOfTaxBean
     */
    public ComputationOfTaxBean getComputationOfTaxBean() {
        return computationOfTaxBean;
    }

    /**
     * @param computationOfTaxBean the computationOfTaxBean to set
     */
    public void setComputationOfTaxBean(ComputationOfTaxBean computationOfTaxBean) {
        this.computationOfTaxBean = computationOfTaxBean;
    }

    /**
     * @return the taxReliefAvailmentBean
     */
    public TaxReliefAvailmentBean getTaxReliefAvailmentBean() {
        return taxReliefAvailmentBean;
    }

    /**
     * @param taxReliefAvailmentBean the taxReliefAvailmentBean to set
     */
    public void setTaxReliefAvailmentBean(
            TaxReliefAvailmentBean taxReliefAvailmentBean) {
        this.taxReliefAvailmentBean = taxReliefAvailmentBean;
    }

    /**
     * @return the externalAuditorAccreditedTaxAgentBean
     */
    public ExternalAuditorAccreditedTaxAgentBean getExternalAuditorAccreditedTaxAgentBean() {
        return externalAuditorAccreditedTaxAgentBean;
    }

    /**
     * @param externalAuditorAccreditedTaxAgentBean the
     * externalAuditorAccreditedTaxAgentBean to set
     */
    public void setExternalAuditorAccreditedTaxAgentBean(
            ExternalAuditorAccreditedTaxAgentBean externalAuditorAccreditedTaxAgentBean) {
        this.externalAuditorAccreditedTaxAgentBean = externalAuditorAccreditedTaxAgentBean;
    }

    /**
     * @return the salesRevenueBean
     */
    public SalesRevenueBean getSalesRevenueBean() {
        return salesRevenueBean;
    }

    /**
     * @param salesRevenueBean the salesRevenueBean to set
     */
    public void setSalesRevenueBean(SalesRevenueBean salesRevenueBean) {
        this.salesRevenueBean = salesRevenueBean;
    }

    /**
     * @return the costOfSaleBean
     */
    public CostOfSaleBean getCostOfSaleBean() {
        return costOfSaleBean;
    }

    /**
     * @param costOfSaleBean the costOfSaleBean to set
     */
    public void setCostOfSaleBean(CostOfSaleBean costOfSaleBean) {
        this.costOfSaleBean = costOfSaleBean;
    }

    /**
     * @return the otherTaxableIncomeNotSubjectedToFinalTaxBean
     */
    public OtherTaxableIncomeNotSubjectedToFinalTaxBean getOtherTaxableIncomeNotSubjectedToFinalTaxBean() {
        return otherTaxableIncomeNotSubjectedToFinalTaxBean;
    }

    /**
     * @param otherTaxableIncomeNotSubjectedToFinalTaxBean the
     * otherTaxableIncomeNotSubjectedToFinalTaxBean to set
     */
    public void setOtherTaxableIncomeNotSubjectedToFinalTaxBean(
            OtherTaxableIncomeNotSubjectedToFinalTaxBean otherTaxableIncomeNotSubjectedToFinalTaxBean) {
        this.otherTaxableIncomeNotSubjectedToFinalTaxBean = otherTaxableIncomeNotSubjectedToFinalTaxBean;
    }

    /**
     * @return the ordinaryAllowableItemizedDeductionBean
     */
    public OrdinaryAllowableItemizedDeductionBean getOrdinaryAllowableItemizedDeductionBean() {
        return ordinaryAllowableItemizedDeductionBean;
    }

    /**
     * @param ordinaryAllowableItemizedDeductionBean the
     * ordinaryAllowableItemizedDeductionBean to set
     */
    public void setOrdinaryAllowableItemizedDeductionBean(
            OrdinaryAllowableItemizedDeductionBean ordinaryAllowableItemizedDeductionBean) {
        this.ordinaryAllowableItemizedDeductionBean = ordinaryAllowableItemizedDeductionBean;
    }

    /**
     * @return the specialAllowableItemizedDeductionBean
     */
    public SpecialAllowableItemizedDeductionsBean getSpecialAllowableItemizedDeductionBean() {
        return specialAllowableItemizedDeductionBean;
    }

    /**
     * @param specialAllowableItemizedDeductionBean the
     * specialAllowableItemizedDeductionBean to set
     */
    public void setSpecialAllowableItemizedDeductionBean(
            SpecialAllowableItemizedDeductionsBean specialAllowableItemizedDeductionBean) {
        this.specialAllowableItemizedDeductionBean = specialAllowableItemizedDeductionBean;
    }

    /**
     * @return the computationOfNetOperatingLossCarryOverBean
     */
    public ComputationOfNetOperatingLossCarryOverBean getComputationOfNetOperatingLossCarryOverBean() {
        return computationOfNetOperatingLossCarryOverBean;
    }

    /**
     * @param computationOfNetOperatingLossCarryOverBean the
     * computationOfNetOperatingLossCarryOverBean to set
     */
    public void setComputationOfNetOperatingLossCarryOverBean(
            ComputationOfNetOperatingLossCarryOverBean computationOfNetOperatingLossCarryOverBean) {
        this.computationOfNetOperatingLossCarryOverBean = computationOfNetOperatingLossCarryOverBean;
    }

    /**
     * @return the taxCreditsPaymentsBean
     */
    public TaxCreditsPaymentsBean getTaxCreditsPaymentsBean() {
        return taxCreditsPaymentsBean;
    }

    /**
     * @param taxCreditsPaymentsBean the taxCreditsPaymentsBean to set
     */
    public void setTaxCreditsPaymentsBean(
            TaxCreditsPaymentsBean taxCreditsPaymentsBean) {
        this.taxCreditsPaymentsBean = taxCreditsPaymentsBean;
    }

    /**
     * @return the computationOfMinimumCorporateIncomeTaxBean
     */
    public ComputationOfMinimumCorporateIncomeTaxBean getComputationOfMinimumCorporateIncomeTaxBean() {
        return computationOfMinimumCorporateIncomeTaxBean;
    }

    /**
     * @param computationOfMinimumCorporateIncomeTaxBean the
     * computationOfMinimumCorporateIncomeTaxBean to set
     */
    public void setComputationOfMinimumCorporateIncomeTaxBean(
            ComputationOfMinimumCorporateIncomeTaxBean computationOfMinimumCorporateIncomeTaxBean) {
        this.computationOfMinimumCorporateIncomeTaxBean = computationOfMinimumCorporateIncomeTaxBean;
    }

    /**
     * @return the reconciliationOfNetIncomeBean
     */
    public ReconciliationOfNetIncomeBean getReconciliationOfNetIncomeBean() {
        return reconciliationOfNetIncomeBean;
    }

    /**
     * @param reconciliationOfNetIncomeBean the reconciliationOfNetIncomeBean to
     * set
     */
    public void setReconciliationOfNetIncomeBean(
            ReconciliationOfNetIncomeBean reconciliationOfNetIncomeBean) {
        this.reconciliationOfNetIncomeBean = reconciliationOfNetIncomeBean;
    }

    /**
     * @return the balanceSheetBean
     */
    public BalanceSheetBean getBalanceSheetBean() {
        return balanceSheetBean;
    }

    /**
     * @param balanceSheetBean the balanceSheetBean to set
     */
    public void setBalanceSheetBean(BalanceSheetBean balanceSheetBean) {
        this.balanceSheetBean = balanceSheetBean;
    }

    /**
     * @return the stockholdersPartnersMembersInformationBean
     */
    public StockholdersPartnersMembersInformationBean getStockholdersPartnersMembersInformationBean() {
        return stockholdersPartnersMembersInformationBean;
    }

    /**
     * @param stockholdersPartnersMembersInformationBean the
     * stockholdersPartnersMembersInformationBean to set
     */
    public void setStockholdersPartnersMembersInformationBean(
            StockholdersPartnersMembersInformationBean stockholdersPartnersMembersInformationBean) {
        this.stockholdersPartnersMembersInformationBean = stockholdersPartnersMembersInformationBean;
    }

    /**
     * @return the taxpayerRealPropertySales
     */
    public List<RealPropertySale> getTaxpayerRealPropertySales() {
        return taxpayerRealPropertySales;
    }

    /**
     * @param taxpayerRealPropertySales the taxpayerRealPropertySales to set
     */
    public void setTaxpayerRealPropertySales(
            List<RealPropertySale> taxpayerRealPropertySales) {
        this.taxpayerRealPropertySales = taxpayerRealPropertySales;
    }

    /**
     * @return the taxpayerGrossIncome
     */
    public GrossIncomeSubjectToFinalWithholdingBean getTaxpayerGrossIncome() {
        return taxpayerGrossIncome;
    }

    /**
     * @param taxpayerGrossIncome the taxpayerGrossIncome to set
     */
    public void setTaxpayerGrossIncome(
            GrossIncomeSubjectToFinalWithholdingBean taxpayerGrossIncome) {
        this.taxpayerGrossIncome = taxpayerGrossIncome;
    }

    /**
     * @return the taxpayerStockShares
     */
    public List<StockShareSale> getTaxpayerStockShares() {
        return taxpayerStockShares;
    }

    /**
     * @param taxpayerStockShares the taxpayerStockShares to set
     */
    public void setTaxpayerStockShares(List<StockShareSale> taxpayerStockShares) {
        this.taxpayerStockShares = taxpayerStockShares;
    }

    /**
     * @return the taxpayerOtherIncome
     */
    public List<OtherIncomeBean> getTaxpayerOtherIncome() {
        return taxpayerOtherIncome;
    }

    /**
     * @param taxpayerOtherIncome the taxpayerOtherIncome to set
     */
    public void setTaxpayerOtherIncome(List<OtherIncomeBean> taxpayerOtherIncome) {
        this.taxpayerOtherIncome = taxpayerOtherIncome;
    }

    /**
     * @return the taxpayerGrossIncomeExempt
     */
    public GrossIncomeExemptFromIncomeTaxBean getTaxpayerGrossIncomeExempt() {
        return taxpayerGrossIncomeExempt;
    }

    /**
     * @param taxpayerGrossIncomeExempt the taxpayerGrossIncomeExempt to set
     */
    public void setTaxpayerGrossIncomeExempt(
            GrossIncomeExemptFromIncomeTaxBean taxpayerGrossIncomeExempt) {
        this.taxpayerGrossIncomeExempt = taxpayerGrossIncomeExempt;
    }

    /**
     * @return the taxpayerPersonalPropertyReceived
     */
    public List<PersonalPropertyReceivedBean> getTaxpayerPersonalPropertyReceived() {
        return taxpayerPersonalPropertyReceived;
    }

    /**
     * @param taxpayerPersonalPropertyReceived the
     * taxpayerPersonalPropertyReceived to set
     */
    public void setTaxpayerPersonalPropertyReceived(
            List<PersonalPropertyReceivedBean> taxpayerPersonalPropertyReceived) {
        this.taxpayerPersonalPropertyReceived = taxpayerPersonalPropertyReceived;
    }

    /**
     * @return the taxpayerOtherExemptIncome
     */
    public List<OtherExemptIncomeBean> getTaxpayerOtherExemptIncome() {
        return taxpayerOtherExemptIncome;
    }

    /**
     * @param taxpayerOtherExemptIncome the taxpayerOtherExemptIncome to set
     */
    public void setTaxpayerOtherExemptIncome(
            List<OtherExemptIncomeBean> taxpayerOtherExemptIncome) {
        this.taxpayerOtherExemptIncome = taxpayerOtherExemptIncome;
    }

    /**
     * @return the otherCreditsBean
     */
    public List<OtherCreditsBean> getOtherCreditsBean() {
        return otherCreditsBean;
    }

    /**
     * @param otherCreditsBean the otherCreditsBean to set
     */
    public void setOtherCreditsBean(List<OtherCreditsBean> otherCreditsBean) {
        this.otherCreditsBean = otherCreditsBean;
    }

}
