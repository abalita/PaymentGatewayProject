package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OperatingLossBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sequenceNumber;
	private int year;

	private long amount;

	private long nolcoAppliedPreviousYear;

	private long nolcoExpired;

	private long nolcoAppliedCurrentYear;

	private long netOperatingLossUnapplied;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
	
	public OperatingLossBean() {
		
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public double getNolcoAppliedPreviousYear() {
		return nolcoAppliedPreviousYear;
	}

	public void setNolcoAppliedPreviousYear(long nolcoAppliedPreviousYear) {
		this.nolcoAppliedPreviousYear = nolcoAppliedPreviousYear;
	}

	public double getNolcoExpired() {
		return nolcoExpired;
	}

	public void setNolcoExpired(long nolcoExpired) {
		this.nolcoExpired = nolcoExpired;
	}

	public double getNolcoAppliedCurrentYear() {
		return nolcoAppliedCurrentYear;
	}

	public void setNolcoAppliedCurrentYear(long nolcoAppliedCurrentYear) {
		this.nolcoAppliedCurrentYear = nolcoAppliedCurrentYear;
	}

	public double getNetOperatingLossUnapplied() {
		return netOperatingLossUnapplied;
	}

	public void setNetOperatingLossUnapplied(long netOperatingLossUnapplied) {
		this.netOperatingLossUnapplied = netOperatingLossUnapplied;
	}
	
	
	
}
