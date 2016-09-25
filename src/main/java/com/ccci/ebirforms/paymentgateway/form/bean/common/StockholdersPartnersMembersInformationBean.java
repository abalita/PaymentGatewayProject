package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StockholdersPartnersMembersInformationBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String capitalContributorType;
	private List<StockholdersPartnersBean> listSched11AdditionalAttachments;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	public String getCapitalContributorType() {
		return capitalContributorType;
	}

	public void setCapitalContributorType(String capitalContributorType) {
		this.capitalContributorType = capitalContributorType;
	}

	public List<StockholdersPartnersBean> getListSched11AdditionalAttachments() {
		return listSched11AdditionalAttachments;
	}

	public void setListSched11AdditionalAttachments(
			List<StockholdersPartnersBean> listSched11AdditionalAttachments) {
		this.listSched11AdditionalAttachments = listSched11AdditionalAttachments;
	}

	
	
}
