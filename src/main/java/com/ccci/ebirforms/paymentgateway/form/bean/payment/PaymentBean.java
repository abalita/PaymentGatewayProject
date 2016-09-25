package com.ccci.ebirforms.paymentgateway.form.bean.payment;

import java.util.Date;

public class PaymentBean {
	private String cashBankDebitMemoDraweeBank; // 38A
	private String cashBankDebitMemoNumber; // 38B
	private String cashBankDebitMemoAmount; // 38D
	private Date cashBankDebitMemoDate; // 38C
	private String checkDraweeBank; // 39A
	private String checkNumber; // 39B
	private String checkAmount; // 39D
	private Date checkDate; // 39C
	private String taxDebitMemoNumber;
	private String taxDebitMemoAmount;
	private Date taxDebitMemoDate;
	private String others; // 40
	private String othersDraweeBank; // 40A
	private String othersNumber; // 40B
	private String othersAmount; // 40D
	private Date othersDate; // 40C

	public String getCashBankDebitMemoDraweeBank() {
		return cashBankDebitMemoDraweeBank;
	}
	public void setCashBankDebitMemoDraweeBank(String cashBankDebitMemoDraweeBank) {
		this.cashBankDebitMemoDraweeBank = cashBankDebitMemoDraweeBank;
	}
	public String getCashBankDebitMemoNumber() {
		return cashBankDebitMemoNumber;
	}
	public void setCashBankDebitMemoNumber(String cashBankDebitMemoNumber) {
		this.cashBankDebitMemoNumber = cashBankDebitMemoNumber;
	}
	public String getCashBankDebitMemoAmount() {
		return cashBankDebitMemoAmount;
	}
	public void setCashBankDebitMemoAmount(String cashBankDebitMemoAmount) {
		this.cashBankDebitMemoAmount = cashBankDebitMemoAmount;
	}
	public Date getCashBankDebitMemoDate() {
		return cashBankDebitMemoDate;
	}
	public void setCashBankDebitMemoDate(Date cashBankDebitMemoDate) {
		this.cashBankDebitMemoDate = cashBankDebitMemoDate;
	}
	public String getCheckDraweeBank() {
		return checkDraweeBank;
	}
	public void setCheckDraweeBank(String checkDraweeBank) {
		this.checkDraweeBank = checkDraweeBank;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getCheckAmount() {
		return checkAmount;
	}
	public void setCheckAmount(String checkAmount) {
		this.checkAmount = checkAmount;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getOthersDraweeBank() {
		return othersDraweeBank;
	}
	public void setOthersDraweeBank(String othersDraweeBank) {
		this.othersDraweeBank = othersDraweeBank;
	}
	public String getOthersNumber() {
		return othersNumber;
	}
	public void setOthersNumber(String othersNumber) {
		this.othersNumber = othersNumber;
	}
	public String getOthersAmount() {
		return othersAmount;
	}
	public void setOthersAmount(String othersAmount) {
		this.othersAmount = othersAmount;
	}
	public Date getOthersDate() {
		return othersDate;
	}
	public void setOthersDate(Date othersDate) {
		this.othersDate = othersDate;
	}
	public String getTaxDebitMemoNumber() {
		return taxDebitMemoNumber;
	}
	public void setTaxDebitMemoNumber(String taxDebitMemoNumber) {
		this.taxDebitMemoNumber = taxDebitMemoNumber;
	}
	public String getTaxDebitMemoAmount() {
		return taxDebitMemoAmount;
	}
	public void setTaxDebitMemoAmount(String taxDebitMemoAmount) {
		this.taxDebitMemoAmount = taxDebitMemoAmount;
	}
	public Date getTaxDebitMemoDate() {
		return taxDebitMemoDate;
	}
	public void setTaxDebitMemoDate(Date taxDebitMemoDate) {
		this.taxDebitMemoDate = taxDebitMemoDate;
	}
}
