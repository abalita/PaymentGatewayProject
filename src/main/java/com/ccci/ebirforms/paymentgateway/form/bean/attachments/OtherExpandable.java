package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

public class OtherExpandable {
	
	private String sequenceNumber;
	private String description;
	private String value;
	private String legalBasis;
	
	private int numeral;
	
	public OtherExpandable() {
		
	}
	public OtherExpandable(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getLegalBasis() {
		return legalBasis;
	}
	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
	}



	static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private String getSingleAlphaCode(int num) {
		return Character.toString(alphabet[num]);
	}
	public String getAlphaCode() {
	    if (numeral > 25) {
	        return getSingleAlphaCode(numeral / 26 - 1) + getSingleAlphaCode(numeral % 26);
	    }
	    return getSingleAlphaCode(numeral);
	}
	
	public String getNumeralCode() {
		return "#" + (numeral + 1);
	}
	public int getNumeral() {
		return numeral;
	}
	public void setNumeral(int numeral) {
		this.numeral = numeral;
	}

	
}
