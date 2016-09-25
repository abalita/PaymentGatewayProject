package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.List;

import com.ccci.ebirforms.paymentgateway.form.bean.attachments.StockholdersPartners;


public class Form1702RTWSPage7Sched11 {
	private String capitalContributorType;
	private List<StockholdersPartners> sched11AdditionalAttachments;
	public String getCapitalContributorType() {
		return capitalContributorType;
	}
	public void setCapitalContributorType(String capitalContributorType) {
		this.capitalContributorType = capitalContributorType;
	}
	public List<StockholdersPartners> getSched11AdditionalAttachments() {
		return sched11AdditionalAttachments;
	}
	public void setSched11AdditionalAttachments(
			List<StockholdersPartners> sched11AdditionalAttachments) {
		this.sched11AdditionalAttachments = sched11AdditionalAttachments;
	}
}
