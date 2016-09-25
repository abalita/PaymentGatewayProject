package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.ccci.ebirforms.paymentgateway.form.bean.attachments.Form1702RTAttachments;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherIncome;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.PersonalRealPropertiesReceived;

public class Form1702RTWSPage8Sched13 {
	private String returnOfPremium;
	private List<PersonalRealPropertiesReceived> listOfPersonalRealPropertiesReceived;
	private List<OtherIncome> listOfOtherExemptIncome;
	private String personalRealPropertiesReceivedLength;
	private String otherExemptIncomeLength;
	
	private String totalIncomeExemptFromTax;
	
	private List<Form1702RTAttachments> listOfForm1702RTAttachments;

	public String getReturnOfPremium() {
		return returnOfPremium;
	}

	public void setReturnOfPremium(String returnOfPremium) {
		this.returnOfPremium = returnOfPremium;
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

	public String getPersonalRealPropertiesReceivedLength() {
		return personalRealPropertiesReceivedLength;
	}

	public void setPersonalRealPropertiesReceivedLength(
			String personalRealPropertiesReceivedLength) {
		this.personalRealPropertiesReceivedLength = personalRealPropertiesReceivedLength;
	}

	public String getOtherExemptIncomeLength() {
		return otherExemptIncomeLength;
	}

	public void setOtherExemptIncomeLength(String otherExemptIncomeLength) {
		this.otherExemptIncomeLength = otherExemptIncomeLength;
	}

	public String getTotalIncomeExemptFromTax() {
		return totalIncomeExemptFromTax;
	}

	public void setTotalIncomeExemptFromTax(String totalIncomeExemptFromTax) {
		this.totalIncomeExemptFromTax = totalIncomeExemptFromTax;
	}

	public List<Form1702RTAttachments> getListOfForm1702RTAttachments() {
		return listOfForm1702RTAttachments;
	}

	public void setListOfForm1702RTAttachments(
			List<Form1702RTAttachments> listOfForm1702RTAttachments) {
		this.listOfForm1702RTAttachments = listOfForm1702RTAttachments;
	}
}
