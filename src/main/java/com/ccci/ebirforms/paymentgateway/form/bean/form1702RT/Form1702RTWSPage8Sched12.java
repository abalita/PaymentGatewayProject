package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.ccci.ebirforms.paymentgateway.form.bean.attachments.GrossIncomeFinalWithholding;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherIncome;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.RealPropertiesSalesExchange;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.SharesOfStockSalesExchange;

public class Form1702RTWSPage8Sched12 {
	private String exemptInterest;
	private String exemptRoyalties;
	private String exemptDividends;
	private String exemptPrizesWinnings;
	private String exemptPrizesWinningsClass;
	private String fairMarketValueInterest;
	private String fairMarketValueRoyalties;
	private String fairMarketValueDividends;
	private String fairMarketValuePrizesWinnings;
	private String fairMarketValuePrizesWinningsClass;
	private String finalTaxWthldInterest;
	private String finalTaxWthldRoyalties;
	private String finalTaxWthldDividends;
	private String finalTaxWthldPrizesWinnings;
	private String finalTaxWthldPrizesWinningsClass;
	private String prizeWinningsDesc = "Prizes and Winnings";
	private List<GrossIncomeFinalWithholding> listOfGrossIncomeFinalWithholding;

	private List<RealPropertiesSalesExchange> listOfRealPropertiesSalesExchange;
	private List<SharesOfStockSalesExchange> listOfSharesOfStockSalesExchange;
	private List<OtherIncome> listOfOtherIncome;
	private String saleExchangeOfRealPropertiesLength;
	private String saleExchangeOfSharesOfStockLength;
	private String otherIncomeLength;
	
	private String totalFinalTaxWithheldPaid;
	public String getExemptInterest() {
		return exemptInterest;
	}
	public void setExemptInterest(String exemptInterest) {
		this.exemptInterest = exemptInterest;
	}
	public String getExemptRoyalties() {
		return exemptRoyalties;
	}
	public void setExemptRoyalties(String exemptRoyalties) {
		this.exemptRoyalties = exemptRoyalties;
	}
	public String getExemptDividends() {
		return exemptDividends;
	}
	public void setExemptDividends(String exemptDividends) {
		this.exemptDividends = exemptDividends;
	}
	public String getExemptPrizesWinnings() {
		return exemptPrizesWinnings;
	}
	public void setExemptPrizesWinnings(String exemptPrizesWinnings) {
		this.exemptPrizesWinnings = exemptPrizesWinnings;
	}
	public String getExemptPrizesWinningsClass() {
		return exemptPrizesWinningsClass;
	}
	public void setExemptPrizesWinningsClass(String exemptPrizesWinningsClass) {
		this.exemptPrizesWinningsClass = exemptPrizesWinningsClass;
	}
	public String getFairMarketValueInterest() {
		return fairMarketValueInterest;
	}
	public void setFairMarketValueInterest(String fairMarketValueInterest) {
		this.fairMarketValueInterest = fairMarketValueInterest;
	}
	public String getFairMarketValueRoyalties() {
		return fairMarketValueRoyalties;
	}
	public void setFairMarketValueRoyalties(String fairMarketValueRoyalties) {
		this.fairMarketValueRoyalties = fairMarketValueRoyalties;
	}
	public String getFairMarketValueDividends() {
		return fairMarketValueDividends;
	}
	public void setFairMarketValueDividends(String fairMarketValueDividends) {
		this.fairMarketValueDividends = fairMarketValueDividends;
	}
	public String getFairMarketValuePrizesWinnings() {
		return fairMarketValuePrizesWinnings;
	}
	public void setFairMarketValuePrizesWinnings(
			String fairMarketValuePrizesWinnings) {
		this.fairMarketValuePrizesWinnings = fairMarketValuePrizesWinnings;
	}
	public String getFairMarketValuePrizesWinningsClass() {
		return fairMarketValuePrizesWinningsClass;
	}
	public void setFairMarketValuePrizesWinningsClass(
			String fairMarketValuePrizesWinningsClass) {
		this.fairMarketValuePrizesWinningsClass = fairMarketValuePrizesWinningsClass;
	}
	public String getFinalTaxWthldInterest() {
		return finalTaxWthldInterest;
	}
	public void setFinalTaxWthldInterest(String finalTaxWthldInterest) {
		this.finalTaxWthldInterest = finalTaxWthldInterest;
	}
	public String getFinalTaxWthldRoyalties() {
		return finalTaxWthldRoyalties;
	}
	public void setFinalTaxWthldRoyalties(String finalTaxWthldRoyalties) {
		this.finalTaxWthldRoyalties = finalTaxWthldRoyalties;
	}
	public String getFinalTaxWthldDividends() {
		return finalTaxWthldDividends;
	}
	public void setFinalTaxWthldDividends(String finalTaxWthldDividends) {
		this.finalTaxWthldDividends = finalTaxWthldDividends;
	}
	public String getFinalTaxWthldPrizesWinnings() {
		return finalTaxWthldPrizesWinnings;
	}
	public void setFinalTaxWthldPrizesWinnings(String finalTaxWthldPrizesWinnings) {
		this.finalTaxWthldPrizesWinnings = finalTaxWthldPrizesWinnings;
	}
	public String getFinalTaxWthldPrizesWinningsClass() {
		return finalTaxWthldPrizesWinningsClass;
	}
	public void setFinalTaxWthldPrizesWinningsClass(
			String finalTaxWthldPrizesWinningsClass) {
		this.finalTaxWthldPrizesWinningsClass = finalTaxWthldPrizesWinningsClass;
	}
	public String getPrizeWinningsDesc() {
		return prizeWinningsDesc;
	}
	public void setPrizeWinningsDesc(String prizeWinningsDesc) {
		this.prizeWinningsDesc = prizeWinningsDesc;
	}
	public List<GrossIncomeFinalWithholding> getListOfGrossIncomeFinalWithholding() {
		return listOfGrossIncomeFinalWithholding;
	}
	public void setListOfGrossIncomeFinalWithholding(
			List<GrossIncomeFinalWithholding> listOfGrossIncomeFinalWithholding) {
		this.listOfGrossIncomeFinalWithholding = listOfGrossIncomeFinalWithholding;
	}
	public List<RealPropertiesSalesExchange> getListOfRealPropertiesSalesExchange() {
		return listOfRealPropertiesSalesExchange;
	}
	public void setListOfRealPropertiesSalesExchange(
			List<RealPropertiesSalesExchange> listOfRealPropertiesSalesExchange) {
		this.listOfRealPropertiesSalesExchange = listOfRealPropertiesSalesExchange;
	}
	public List<SharesOfStockSalesExchange> getListOfSharesOfStockSalesExchange() {
		return listOfSharesOfStockSalesExchange;
	}
	public void setListOfSharesOfStockSalesExchange(
			List<SharesOfStockSalesExchange> listOfSharesOfStockSalesExchange) {
		this.listOfSharesOfStockSalesExchange = listOfSharesOfStockSalesExchange;
	}
	public List<OtherIncome> getListOfOtherIncome() {
		return listOfOtherIncome;
	}
	public void setListOfOtherIncome(List<OtherIncome> listOfOtherIncome) {
		this.listOfOtherIncome = listOfOtherIncome;
	}
	public String getSaleExchangeOfRealPropertiesLength() {
		return saleExchangeOfRealPropertiesLength;
	}
	public void setSaleExchangeOfRealPropertiesLength(
			String saleExchangeOfRealPropertiesLength) {
		this.saleExchangeOfRealPropertiesLength = saleExchangeOfRealPropertiesLength;
	}
	public String getSaleExchangeOfSharesOfStockLength() {
		return saleExchangeOfSharesOfStockLength;
	}
	public void setSaleExchangeOfSharesOfStockLength(
			String saleExchangeOfSharesOfStockLength) {
		this.saleExchangeOfSharesOfStockLength = saleExchangeOfSharesOfStockLength;
	}
	public String getOtherIncomeLength() {
		return otherIncomeLength;
	}
	public void setOtherIncomeLength(String otherIncomeLength) {
		this.otherIncomeLength = otherIncomeLength;
	}
	public String getTotalFinalTaxWithheldPaid() {
		return totalFinalTaxWithheldPaid;
	}
	public void setTotalFinalTaxWithheldPaid(String totalFinalTaxWithheldPaid) {
		this.totalFinalTaxWithheldPaid = totalFinalTaxWithheldPaid;
	}
}
