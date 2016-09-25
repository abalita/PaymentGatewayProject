package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class GrossIncomeFinalWithholding extends OtherIncome {
	private String exempt;
	private String prizesWinningsStyle;

	public String getExempt() {
		return exempt;
	}

	public void setExempt(String exempt) {
		this.exempt = exempt;
	}

	public String getPrizesWinningsStyle() {
		return prizesWinningsStyle;
	}

	public void setPrizesWinningsStyle(String prizesWinningsStyle) {
		this.prizesWinningsStyle = prizesWinningsStyle;
	}
}
