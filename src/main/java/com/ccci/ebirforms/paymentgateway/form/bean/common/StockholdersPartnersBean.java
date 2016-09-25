package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StockholdersPartnersBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String registeredName;
	private String tin1;
	private String tin2;
	private String tin3;
	private String branchCode;
	private long capitalContribution;
	private float percentToTotal;

	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	public String getRegisteredName() {
		return registeredName;
	}

	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}

	public String getTinNumber() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTin1());
		sb.append(getTin2());
		sb.append(getTin3());
		return sb.toString();
	}

	public String getTin1() {
		return tin1;
	}

	public void setTin1(String tin1) {
		this.tin1 = tin1;
	}

	public String getTin2() {
		return tin2;
	}

	public void setTin2(String tin2) {
		this.tin2 = tin2;
	}

	public String getTin3() {
		return tin3;
	}

	public void setTin3(String tin3) {
		this.tin3 = tin3;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public long getCapitalContribution() {
		return capitalContribution;
	}

	public void setCapitalContribution(long capitalContribution) {
		this.capitalContribution = capitalContribution;
	}

	public float getPercentToTotal() {
		return percentToTotal;
	}

	public void setPercentToTotal(float percentToTotal) {
		this.percentToTotal = percentToTotal;
	}

	
}
