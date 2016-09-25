package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

import java.util.ArrayList;
import java.util.List;

public class Form1702RTAttachments {
	private List<RealPropertiesSalesExchange> listOfRealPropertiesSalesExchange;
	private List<SharesOfStockSalesExchange> listOfSharesOfStockSalesExchange;
	private List<OtherIncome> listOfOtherIncome;
	private List<PersonalRealPropertiesReceived> listOfPersonalRealPropertiesReceived;
	private List<OtherIncome> listOfOtherExemptIncome;
	private String branchCode = "0000";
	
	public Form1702RTAttachments() {
		listOfRealPropertiesSalesExchange = new ArrayList<RealPropertiesSalesExchange>();
		listOfSharesOfStockSalesExchange = new ArrayList<SharesOfStockSalesExchange>();
		listOfOtherIncome = new ArrayList<OtherIncome>();
		listOfPersonalRealPropertiesReceived = new ArrayList<PersonalRealPropertiesReceived>();
		listOfOtherExemptIncome = new ArrayList<OtherIncome>();
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
	public List<PersonalRealPropertiesReceived> getListOfPersonalRealPropertiesReceived() {
		return listOfPersonalRealPropertiesReceived;
	}
	public void setListOfPersonalRealPropertiesReceived(
			List<PersonalRealPropertiesReceived> listOfPersonalRealPropertiesReceived) {
		this.listOfPersonalRealPropertiesReceived = listOfPersonalRealPropertiesReceived;
	}
	public List<OtherIncome> getListOfOtherExemptIncome() {
		return listOfOtherExemptIncome;
	}
	public void setListOfOtherExemptIncome(List<OtherIncome> listOfOtherExemptIncome) {
		this.listOfOtherExemptIncome = listOfOtherExemptIncome;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
}
