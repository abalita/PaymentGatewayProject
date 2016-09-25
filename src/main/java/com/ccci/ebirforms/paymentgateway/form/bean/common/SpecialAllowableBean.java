package com.ccci.ebirforms.paymentgateway.form.bean.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecialAllowableBean extends ExpandableOther {
	private static final long serialVersionUID = 1L;
	
	private String legalBasis;
	// for 1702mx
	private String description;
	private long value;
	private long valueEx;
	private long valueSp;
	private long valueRe;
	private long valueTotal;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
	
	public SpecialAllowableBean() {
		super();
	}
	
	public String getLegalBasis() {
		return legalBasis;
	}

	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
	}

	public long getValueEx() {
		return valueEx;
	}

	public void setValueEx(long valueEx) {
		this.valueEx = valueEx;
	}

	public long getValueSp() {
		return valueSp;
	}

	public void setValueSp(long valueSp) {
		this.valueSp = valueSp;
	}

	public long getValueRe() {
		return valueRe;
	}

	public void setValueRe(long valueRe) {
		this.valueRe = valueRe;
	}

	public long getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(long valueTotal) {
		this.valueTotal = valueTotal;
	}
	
}
