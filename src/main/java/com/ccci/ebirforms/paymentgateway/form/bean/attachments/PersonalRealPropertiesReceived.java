package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class PersonalRealPropertiesReceived extends OtherExpandable {
	
	private String modeOfTransfer;
	private String authorizingRegistration;

	public PersonalRealPropertiesReceived() {

	}

	public PersonalRealPropertiesReceived(int numeral) {
		this.setNumeral(numeral);
	}
	
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	public String getAuthorizingRegistration() {
		return authorizingRegistration;
	}
	public void setAuthorizingRegistration(String authorizingRegistration) {
		this.authorizingRegistration = authorizingRegistration;
	}
	
	
	
}
