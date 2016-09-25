package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class StockholdersPartners {
	
	private String seqNumber;
	private String registeredName;
	private String tinNumber;
	private String tin1;
	private String tin2;
	private String tin3;
	private String branchCode;
	private String capitalContribution;
	private String percentToTotal;
	
	public String getRegisteredName() {
		return registeredName;
	}
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}
	public String getTinNumber() {
		StringBuilder sb = new StringBuilder();
		sb.append(null != getTin1() ? getTin1() : "");
		sb.append(null != getTin2() ? getTin2() : "");
		sb.append(null != getTin3() ? getTin3() : "");
		return sb.toString();
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
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
	public String getCapitalContribution() {
		return capitalContribution;
	}
	public void setCapitalContribution(String capitalContribution) {
		this.capitalContribution = capitalContribution;
	}
	public String getPercentToTotal() {
		return percentToTotal;
	}
	public void setPercentToTotal(String percentToTotal) {
		this.percentToTotal = percentToTotal;
	}
	public String getSeqNumber() {
		return seqNumber;
	}
	public void setSeqNumber(String seqNumber) {
		this.seqNumber = seqNumber;
	}
	
	
	

}
