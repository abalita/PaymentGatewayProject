package com.ccci.ebirforms.paymentgateway.core.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.beanutils.PropertyUtils;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author balderr (CAI-STA Phils, Inc.)
 *
 */
public class IteratedRow {
	private String description;
	private String taxpayer;
	private String spouse;
	private Date date;
	private String lastName;
	private String firstName;
	private String middleInitial;
	private String tin;
	private String amount;
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	private String item5;
	private String item6;
	private Boolean bool;

	private String rowName;
	private int numeral = 0;
	private boolean staticFlag;

	public boolean anyExists() {
		return StringUtils.isNotEmpty(getLastName())
				|| StringUtils.isNotEmpty(getFirstName())
				|| StringUtils.isNotEmpty(getMiddleInitial())
				|| StringUtils.isNotEmpty(getTin())
				|| getDate() != null
				|| StringUtils.isNotEmpty(getDescription())
				|| StringUtils.isNotEmpty(getTaxpayer())
				|| StringUtils.isNotEmpty(getSpouse())
				|| StringUtils.isNotEmpty(getItem1())
				|| StringUtils.isNotEmpty(getItem2())
				|| StringUtils.isNotEmpty(getItem3())
				|| StringUtils.isNotEmpty(getItem4())
				|| StringUtils.isNotEmpty(getItem5())
				|| StringUtils.isNotEmpty(getItem6())
				|| StringUtils.isNotEmpty(getAmount());
	}

	private static final String[] PROPERTY_LIST = new String[]{"description","taxpayer",
		"spouse","date","lastName","firstName","middleInitial","tin","amount",
		"item1","item2","item3","item4","item5","item6"};

	public boolean anyExistsExcept(String... exempt) {
		List<String> toCheck = new ArrayList<String>(PROPERTY_LIST.length);

		for (String prop: PROPERTY_LIST) {
			toCheck.add(prop);
		}
		for (String prop: exempt) {
			toCheck.remove(prop);
		}
		for (String prop: toCheck) {
			try {
				Object property = PropertyUtils.getProperty(this, prop);
				if (property != null && (!(property instanceof String) || 
						StringUtils.isNotBlank((String) property))) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		if (StringUtils.isBlank(this.description)) {
			setTaxpayer(null);
			setSpouse(null);
		}
	}

	public String getTaxpayer() {
		return taxpayer;
	}

	public void setTaxpayer(String taxpayer) {
		this.taxpayer = taxpayer;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	public Boolean getBool() {
		return bool;
	}
	public void setBool(Boolean bool) {
		this.bool = bool;
	}
	public boolean isStaticFlag() {
		return staticFlag;
	}
	public void setStaticFlag(boolean staticFlag) {
		this.staticFlag = staticFlag;
	}
	public String getRowName() {
		return rowName;
	}
	public void setRowName(String rowName) {
		this.rowName = rowName;
	}
	public int getNumeral() {
		return numeral;
	}
	public void setNumeral(int numeral) {
		this.numeral = numeral;
	}
	public String getNumeralCode() {
		return "#" + (numeral + 1);
	}
	static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private String getSingleAlphaCode(int num) {
		return Character.toString(alphabet[num]);
	}
	public String getAlphaCode() {
	    if (numeral > 25) {
	        return getSingleAlphaCode(numeral / 26) + getSingleAlphaCode(numeral % 26);
	    }
	    return getSingleAlphaCode(numeral);
	}
}
