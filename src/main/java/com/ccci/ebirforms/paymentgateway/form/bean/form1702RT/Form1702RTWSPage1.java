
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;



public class Form1702RTWSPage1 {
	
	private static final String MINIMUM_CORPORATE_INCOME_TAX_MCIT = "Minimum Corporate Income Tax (MCIT)";
	private static final String IC_055 = "IC055";
	private static final String X = "X";
	private static final String BLANK = "";
	
	/** Field 1 */
	
	private String calendarFiscal;						//1
	public String getCalendarDisplay() {
		return (getCalendarFiscal()!= null || !getCalendarFiscal().isEmpty()) && getCalendarFiscal().equals("C") ? X : BLANK;
	}
	public String getFiscalDisplay() {
		return (getCalendarFiscal()!= null || !getCalendarFiscal().isEmpty()) && getCalendarFiscal().equals("F") ? X : BLANK;
	}
	
	
	private String yearEndedMonth;						//2
	
	private String yearEnded;							//2
	private boolean yearEndedMonthDisabled = true;		//2
	
	
	private String amendedReturn;						//3
	public String getAmendedYDisplay() {
		return (getAmendedReturn()!= null || !getAmendedReturn().isEmpty()) && getAmendedReturn().equals("Y") ? X : BLANK;
	}
	public String getAmendedNDisplay() {
		return (getAmendedReturn()!= null || !getAmendedReturn().isEmpty()) && getAmendedReturn().equals("N") ? X : BLANK;
	}
	
	
	private String shortPeriodReturn;					//4
	public String getShortPeriodYDisplay() {
		return (getShortPeriodReturn()!= null || !getShortPeriodReturn().isEmpty()) && getShortPeriodReturn().equals("Y") ? X : BLANK;
	}
	public String getShortPeriodNDisplay() {
		return (getShortPeriodReturn()!= null || !getShortPeriodReturn().isEmpty()) && getShortPeriodReturn().equals("N") ? X : BLANK;
	}
	
	
	private String alphanumericTaxCode1 = IC_055;			//5
	
	private String alphanumericTaxCodeDescription1 = MINIMUM_CORPORATE_INCOME_TAX_MCIT;//5
	private boolean alphanumericTaxCodeCheckBox1 =  true;	//5
	
	private String alphanumericTaxCode2;				 	//5
	
	private String alphanumericTaxCodeDescription2;		 	//5
	private boolean alphanumericTaxCodeCheckBox2;		 	//5
	private boolean atcSelectionSelectDisabled = true;		//5
	private double taxCodeRate;								//5
	
	
	private String tinA;								//6
	
	private String tinB;								//6
	
	private String tinC;								//6
	
	private String tinAClass;							//6
	
	private String tinBClass;							//6
	
	private String tinCClass;							//6
	
	
	private String rdoCode;								//7
	
	private String rdoCodeClass;						//7
	
	
	private String dateIncorporation;					//8
	
	private String dateIncorporationClass;				//8
	
	
	private String registeredName;						//9
	
	private String registeredNameClass;					//9
	
	private String firstName;							//9
	
	private String lastName;							//9
	
	private String registeredAddress;					//10
	private String registeredAddressClass;				//10
	private String subStreet;							//10
	private String streetAddress;						//10
	private String barangayAddress;						//10
	private String cityAddress;							//10
	private String zipCode;								//10
	private String contactNumber;						//11
	private String emailAddress;						//12
	private String mainLineBusiness;					//13
	private String psicCode;							//14
	
	
	private String methodDeductions;					//15
	
	
	private String totalIncomeTaxDue16;					//16
	
	
	private String totalTaxCreditsPayments17;			//17
	
	
	private String netTaxPayable18;						//18
	
	
	private String totalPenalties19;					//19
	// please see refund_type							//21
	
	
	private String communityTaxCertificateNumber;		//22
	private Date ctcDateIssue;							//23
	private String ctcPlaceIssue;						//24
	//private String ctcAmount;							//25

	private String cashBankDebitMemoDraweeBankAgency;	//26
	private String cashBankDebitMemoNumber;				//26
	private Date cashBankDebitMemoDate;				    //26
	private String cashBankDebitMemoAmount;				//26
	
	private String checkDraweeBankAgency;				//27
	private String checkNumber;							//27
	private Date checkDate;								//27
	private String checkAmount;							//27
	
	private String taxDebitMemoNumber;					//28
	private Date taxDebitMemoDate;						//28
	private String taxDebitMemoAmount;					//28
	
	private String othersDetailsPayment;				//29
	private String othersDraweeBankAgency;				//29
	private String othersNumber;						//29
	private Date othersDate;							//29
	private String othersAmount;						//29	
	
	public String getCalendarFiscal() {
		return calendarFiscal;
	}
	public void setCalendarFiscal(String calendarFiscal) {
		this.calendarFiscal = calendarFiscal;
	}
	public String getYearEndedMonth() {
		return yearEndedMonth;
	}
	public void setYearEndedMonth(String yearEndedMonth) {
		this.yearEndedMonth = yearEndedMonth;
	}
	public String getYearEnded() {
		return yearEnded;
	}
	public void setYearEnded(String yearEnded) {
		this.yearEnded = yearEnded;
	}
	public boolean isYearEndedMonthDisabled() {
		return yearEndedMonthDisabled;
	}
	public void setYearEndedMonthDisabled(boolean yearEndedMonthDisabled) {
		this.yearEndedMonthDisabled = yearEndedMonthDisabled;
	}
	public String getAmendedReturn() {
		return amendedReturn;
	}
	public void setAmendedReturn(String amendedReturn) {
		this.amendedReturn = amendedReturn;
	}
	public String getShortPeriodReturn() {
		return shortPeriodReturn;
	}
	public void setShortPeriodReturn(String shortPeriodReturn) {
		this.shortPeriodReturn = shortPeriodReturn;
	}
	public String getAlphanumericTaxCode1() {
		return alphanumericTaxCode1;
	}
	public void setAlphanumericTaxCode1(String alphanumericTaxCode1) {
		this.alphanumericTaxCode1 = alphanumericTaxCode1;
	}
	public String getAlphanumericTaxCodeDescription1() {
		return alphanumericTaxCodeDescription1;
	}
	public void setAlphanumericTaxCodeDescription1(
			String alphanumericTaxCodeDescription1) {
		this.alphanumericTaxCodeDescription1 = alphanumericTaxCodeDescription1;
	}
	public boolean isAlphanumericTaxCodeCheckBox1() {
		return alphanumericTaxCodeCheckBox1;
	}
	public void setAlphanumericTaxCodeCheckBox1(boolean alphanumericTaxCodeCheckBox1) {
		this.alphanumericTaxCodeCheckBox1 = alphanumericTaxCodeCheckBox1;
	}
	public String getAlphanumericTaxCode2() {
		return alphanumericTaxCode2;
	}
	public void setAlphanumericTaxCode2(String alphanumericTaxCode2) {
		this.alphanumericTaxCode2 = alphanumericTaxCode2;
	}
	public String getAlphanumericTaxCodeDescription2() {
		return alphanumericTaxCodeDescription2;
	}
	public void setAlphanumericTaxCodeDescription2(
			String alphanumericTaxCodeDescription2) {
		this.alphanumericTaxCodeDescription2 = alphanumericTaxCodeDescription2;
	}
	public boolean isAlphanumericTaxCodeCheckBox2() {
		return alphanumericTaxCodeCheckBox2;
	}
	public void setAlphanumericTaxCodeCheckBox2(boolean alphanumericTaxCodeCheckBox2) {
		this.alphanumericTaxCodeCheckBox2 = alphanumericTaxCodeCheckBox2;
	}
	public boolean isAtcSelectionSelectDisabled() {
		return atcSelectionSelectDisabled;
	}
	public void setAtcSelectionSelectDisabled(boolean atcSelectionSelectDisabled) {
		this.atcSelectionSelectDisabled = atcSelectionSelectDisabled;
	}
	public double getTaxCodeRate() {
		return taxCodeRate;
	}
	public void setTaxCodeRate(double taxCodeRate) {
		this.taxCodeRate = taxCodeRate;
	}
	public String getTinA() {
		return tinA;
	}
	public void setTinA(String tinA) {
		this.tinA = tinA;
	}
	public String getTinB() {
		return tinB;
	}
	public void setTinB(String tinB) {
		this.tinB = tinB;
	}
	public String getTinC() {
		return tinC;
	}
	public void setTinC(String tinC) {
		this.tinC = tinC;
	}
	public String getTinAClass() {
		return tinAClass;
	}
	public void setTinAClass(String tinAClass) {
		this.tinAClass = tinAClass;
	}
	public String getTinBClass() {
		return tinBClass;
	}
	public void setTinBClass(String tinBClass) {
		this.tinBClass = tinBClass;
	}
	public String getTinCClass() {
		return tinCClass;
	}
	public void setTinCClass(String tinCClass) {
		this.tinCClass = tinCClass;
	}
	public String getRdoCode() {
		return rdoCode;
	}
	public void setRdoCode(String rdoCode) {
		this.rdoCode = rdoCode;
	}
	public String getRdoCodeClass() {
		return rdoCodeClass;
	}
	public void setRdoCodeClass(String rdoCodeClass) {
		this.rdoCodeClass = rdoCodeClass;
	}
	public String getDateIncorporation() {
		return dateIncorporation;
	}
	public void setDateIncorporation(String dateIncorporation) {
		this.dateIncorporation = dateIncorporation;
	}
	public String getDateIncorporationClass() {
		return dateIncorporationClass;
	}
	public void setDateIncorporationClass(String dateIncorporationClass) {
		this.dateIncorporationClass = dateIncorporationClass;
	}
	public String getRegisteredName() {
		return registeredName;
	}
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}
	public String getRegisteredNameClass() {
		return registeredNameClass;
	}
	public void setRegisteredNameClass(String registeredNameClass) {
		this.registeredNameClass = registeredNameClass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRegisteredAddress() {
		return registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public String getRegisteredAddressClass() {
		return registeredAddressClass;
	}
	public void setRegisteredAddressClass(String registeredAddressClass) {
		this.registeredAddressClass = registeredAddressClass;
	}
	public String getSubStreet() {
		return subStreet;
	}
	public void setSubStreet(String subStreet) {
		this.subStreet = subStreet;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getBarangayAddress() {
		return barangayAddress;
	}
	public void setBarangayAddress(String barangayAddress) {
		this.barangayAddress = barangayAddress;
	}
	public String getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(String cityAddress) {
		this.cityAddress = cityAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMainLineBusiness() {
		return mainLineBusiness;
	}
	public void setMainLineBusiness(String mainLineBusiness) {
		this.mainLineBusiness = mainLineBusiness;
	}
	public String getPsicCode() {
		return psicCode;
	}
	public void setPsicCode(String psicCode) {
		this.psicCode = psicCode;
	}
	public String getMethodDeductions() {
		return methodDeductions;
	}
	public void setMethodDeductions(String methodDeductions) {
		this.methodDeductions = methodDeductions;
	}
	public String getTotalIncomeTaxDue16() {
		return totalIncomeTaxDue16;
	}
	public void setTotalIncomeTaxDue16(String totalIncomeTaxDue16) {
		this.totalIncomeTaxDue16 = totalIncomeTaxDue16;
	}
	public String getTotalTaxCreditsPayments17() {
		return totalTaxCreditsPayments17;
	}
	public void setTotalTaxCreditsPayments17(String totalTaxCreditsPayments17) {
		this.totalTaxCreditsPayments17 = totalTaxCreditsPayments17;
	}
	public String getNetTaxPayable18() {
		return netTaxPayable18;
	}
	public void setNetTaxPayable18(String netTaxPayable18) {
		this.netTaxPayable18 = netTaxPayable18;
	}
	public String getTotalPenalties19() {
		return totalPenalties19;
	}
	public void setTotalPenalties19(String totalPenalties19) {
		this.totalPenalties19 = totalPenalties19;
	}
	public String getCommunityTaxCertificateNumber() {
		return communityTaxCertificateNumber;
	}
	public void setCommunityTaxCertificateNumber(
			String communityTaxCertificateNumber) {
		this.communityTaxCertificateNumber = communityTaxCertificateNumber;
	}
	public Date getCtcDateIssue() {
		return ctcDateIssue;
	}
	public void setCtcDateIssue(Date ctcDateIssue) {
		this.ctcDateIssue = ctcDateIssue;
	}
	public String getCtcPlaceIssue() {
		return ctcPlaceIssue;
	}
	public void setCtcPlaceIssue(String ctcPlaceIssue) {
		this.ctcPlaceIssue = ctcPlaceIssue;
	}
	public String getCashBankDebitMemoDraweeBankAgency() {
		return cashBankDebitMemoDraweeBankAgency;
	}
	public void setCashBankDebitMemoDraweeBankAgency(
			String cashBankDebitMemoDraweeBankAgency) {
		this.cashBankDebitMemoDraweeBankAgency = cashBankDebitMemoDraweeBankAgency;
	}
	public String getCashBankDebitMemoNumber() {
		return cashBankDebitMemoNumber;
	}
	public void setCashBankDebitMemoNumber(String cashBankDebitMemoNumber) {
		this.cashBankDebitMemoNumber = cashBankDebitMemoNumber;
	}
	public Date getCashBankDebitMemoDate() {
		return cashBankDebitMemoDate;
	}
	public void setCashBankDebitMemoDate(Date cashBankDebitMemoDate) {
		this.cashBankDebitMemoDate = cashBankDebitMemoDate;
	}
	public String getCashBankDebitMemoAmount() {
		return cashBankDebitMemoAmount;
	}
	public void setCashBankDebitMemoAmount(String cashBankDebitMemoAmount) {
		this.cashBankDebitMemoAmount = cashBankDebitMemoAmount;
	}
	public String getCheckDraweeBankAgency() {
		return checkDraweeBankAgency;
	}
	public void setCheckDraweeBankAgency(String checkDraweeBankAgency) {
		this.checkDraweeBankAgency = checkDraweeBankAgency;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckAmount() {
		return checkAmount;
	}
	public void setCheckAmount(String checkAmount) {
		this.checkAmount = checkAmount;
	}
	public String getTaxDebitMemoNumber() {
		return taxDebitMemoNumber;
	}
	public void setTaxDebitMemoNumber(String taxDebitMemoNumber) {
		this.taxDebitMemoNumber = taxDebitMemoNumber;
	}
	public Date getTaxDebitMemoDate() {
		return taxDebitMemoDate;
	}
	public void setTaxDebitMemoDate(Date taxDebitMemoDate) {
		this.taxDebitMemoDate = taxDebitMemoDate;
	}
	public String getTaxDebitMemoAmount() {
		return taxDebitMemoAmount;
	}
	public void setTaxDebitMemoAmount(String taxDebitMemoAmount) {
		this.taxDebitMemoAmount = taxDebitMemoAmount;
	}
	public String getOthersDetailsPayment() {
		return othersDetailsPayment;
	}
	public void setOthersDetailsPayment(String othersDetailsPayment) {
		this.othersDetailsPayment = othersDetailsPayment;
	}
	public String getOthersDraweeBankAgency() {
		return othersDraweeBankAgency;
	}
	public void setOthersDraweeBankAgency(String othersDraweeBankAgency) {
		this.othersDraweeBankAgency = othersDraweeBankAgency;
	}
	public String getOthersNumber() {
		return othersNumber;
	}
	public void setOthersNumber(String othersNumber) {
		this.othersNumber = othersNumber;
	}
	public Date getOthersDate() {
		return othersDate;
	}
	public void setOthersDate(Date othersDate) {
		this.othersDate = othersDate;
	}
	public String getOthersAmount() {
		return othersAmount;
	}
	public void setOthersAmount(String othersAmount) {
		this.othersAmount = othersAmount;
	}
	
}
