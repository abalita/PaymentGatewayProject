package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherExpandable;


public class Form1702RTWSPage4Sched3 {
	private String otherTaxIncomeDescription1;
	private String otherTaxIncomeDescription2;
	private String otherTaxIncomeDescription3;
	private String otherTaxIncomeDescription3Class;
	private boolean otherTaxIncomeDescription3Enabled = true;
	private String otherTaxIncomeAmount1;
	private String otherTaxIncomeAmount2;
	private String otherTaxIncomeAmount3;
	private String otherTaxIncomeAmount3Class;
	private boolean otherTaxIncomeAmount3Enabled = true;
	
	
	private String totalOtherTaxableIncomeNotSubjectedToFinalTax;
	private List<OtherExpandable> sched3AdditionalAttachments; // 3
	
	public String getOtherTaxIncomeDescription1() {
		return otherTaxIncomeDescription1;
	}
	public void setOtherTaxIncomeDescription1(String otherTaxIncomeDescription1) {
		this.otherTaxIncomeDescription1 = otherTaxIncomeDescription1;
	}
	public String getOtherTaxIncomeDescription2() {
		return otherTaxIncomeDescription2;
	}
	public void setOtherTaxIncomeDescription2(String otherTaxIncomeDescription2) {
		this.otherTaxIncomeDescription2 = otherTaxIncomeDescription2;
	}
	public String getOtherTaxIncomeDescription3() {
		return otherTaxIncomeDescription3;
	}
	public void setOtherTaxIncomeDescription3(String otherTaxIncomeDescription3) {
		this.otherTaxIncomeDescription3 = otherTaxIncomeDescription3;
	}
	public String getOtherTaxIncomeDescription3Class() {
		return otherTaxIncomeDescription3Class;
	}
	public void setOtherTaxIncomeDescription3Class(
			String otherTaxIncomeDescription3Class) {
		this.otherTaxIncomeDescription3Class = otherTaxIncomeDescription3Class;
	}
	public boolean isOtherTaxIncomeDescription3Enabled() {
		return otherTaxIncomeDescription3Enabled;
	}
	public void setOtherTaxIncomeDescription3Enabled(
			boolean otherTaxIncomeDescription3Enabled) {
		this.otherTaxIncomeDescription3Enabled = otherTaxIncomeDescription3Enabled;
	}
	public String getOtherTaxIncomeAmount1() {
		return otherTaxIncomeAmount1;
	}
	public void setOtherTaxIncomeAmount1(String otherTaxIncomeAmount1) {
		this.otherTaxIncomeAmount1 = otherTaxIncomeAmount1;
	}
	public String getOtherTaxIncomeAmount2() {
		return otherTaxIncomeAmount2;
	}
	public void setOtherTaxIncomeAmount2(String otherTaxIncomeAmount2) {
		this.otherTaxIncomeAmount2 = otherTaxIncomeAmount2;
	}
	public String getOtherTaxIncomeAmount3() {
		return otherTaxIncomeAmount3;
	}
	public void setOtherTaxIncomeAmount3(String otherTaxIncomeAmount3) {
		this.otherTaxIncomeAmount3 = otherTaxIncomeAmount3;
	}
	public String getOtherTaxIncomeAmount3Class() {
		return otherTaxIncomeAmount3Class;
	}
	public void setOtherTaxIncomeAmount3Class(String otherTaxIncomeAmount3Class) {
		this.otherTaxIncomeAmount3Class = otherTaxIncomeAmount3Class;
	}
	public boolean isOtherTaxIncomeAmount3Enabled() {
		return otherTaxIncomeAmount3Enabled;
	}
	public void setOtherTaxIncomeAmount3Enabled(boolean otherTaxIncomeAmount3Enabled) {
		this.otherTaxIncomeAmount3Enabled = otherTaxIncomeAmount3Enabled;
	}
	public String getTotalOtherTaxableIncomeNotSubjectedToFinalTax() {
		return totalOtherTaxableIncomeNotSubjectedToFinalTax;
	}
	public void setTotalOtherTaxableIncomeNotSubjectedToFinalTax(
			String totalOtherTaxableIncomeNotSubjectedToFinalTax) {
		this.totalOtherTaxableIncomeNotSubjectedToFinalTax = totalOtherTaxableIncomeNotSubjectedToFinalTax;
	}
	public List<OtherExpandable> getSched3AdditionalAttachments() {
		return sched3AdditionalAttachments;
	}
	public void setSched3AdditionalAttachments(
			List<OtherExpandable> sched3AdditionalAttachments) {
		this.sched3AdditionalAttachments = sched3AdditionalAttachments;
	}
}
