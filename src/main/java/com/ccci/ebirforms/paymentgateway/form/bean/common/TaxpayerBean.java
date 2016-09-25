/**
 *
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import com.ccci.ebirforms.paymentgateway.core.util.FormWsUtil;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxpayerBean implements Serializable {

    public TaxpayerBean() {

    }

    public TaxpayerBean(
            String taxIdNumber,
            String branchCode,
            String industryTypeCode,
            String description,
            String barangayAddress,
            String districtAddress,
            Date dateRegistered,
            int startMonth,
            Date incorporationDate,
            Date birthDate,
            String zipCode,
            String sex,
            String tinPart1,
            String tinPart2,
            String tinPart3,
            String registeredAddress,
            Date dateFiled,
            Date dueDate,
            Date returnPeriod,
            String emailAddress,
            int formVersion,
            String ammendedYN,
            long batchNo,
            String amdendedReturn,
            String shortPeriodReturn,
            String alphaNumericTaxCode,
            int sheetFiledCount,
            String contactNumber,
            String mainLine,
            String psic,
            String methodOfDeduction,
            String lineOfBusiness,
            String calendarFiscal,
            String yearEndedMonth,
            String yearEnded,
            String rdoCode,
            String registeredActivity,
            String lastName,
            String firstName,
            String registeredName,
            String ctcSecType,
            String amendedReturn,
            boolean atcIC011,
            boolean atcIC021,
            Date effectivityDateFrom,
            Date effectivityDateTo,
            String legalBasisTaxExemption,
            String investmentPromotionAgency,
            String subStreet,
            String street,
            String city,
            String offlineFormVersion
    ) {
        this.taxIdNumber = taxIdNumber;
        this.branchCode = branchCode;
        this.industryTypeCode = industryTypeCode;
        this.description = description;
        this.barangayAddress = barangayAddress;
        this.districtAddress = districtAddress;
        this.dateRegistered = dateRegistered;
        this.startMonth = startMonth;
        this.incorporationDate = incorporationDate;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.sex = sex;
        this.tinPart1 = tinPart1;
        this.tinPart2 = tinPart2;
        this.tinPart3 = tinPart3;
        this.registeredAddress = registeredAddress;
        this.dateFiled = dateFiled;
        this.dueDate = dueDate;
        this.returnPeriod = returnPeriod;
        this.emailAddress = emailAddress;
        this.formVersion = formVersion;
        this.ammendedYN = ammendedYN;
        this.batchNo = batchNo;
        this.amdendedReturn = amdendedReturn;
        this.shortPeriodReturn = shortPeriodReturn;
        this.alphaNumericTaxCode = alphaNumericTaxCode;
        this.sheetFiledCount = sheetFiledCount;
        this.contactNumber = contactNumber;
        this.mainLine = mainLine;
        this.psic = psic;
        this.methodOfDeduction = methodOfDeduction;
        this.lineOfBusiness = lineOfBusiness;
        this.calendarFiscal = calendarFiscal;
        this.yearEndedMonth = yearEndedMonth;
        this.yearEnded = yearEnded;
        this.rdoCode = rdoCode;
        this.registeredActivity = registeredActivity;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName="";
        this.registeredName = registeredName;
        this.ctcSecType = ctcSecType;
        this.amendedReturn = amendedReturn;
        this.atcIC011 = atcIC011;
        this.atcIC021 = atcIC021;
        this.effectivityDateFrom = effectivityDateFrom;
        this.effectivityDateTo = effectivityDateTo;
        this.legalBasisTaxExemption = legalBasisTaxExemption;
        this.investmentPromotionAgency = investmentPromotionAgency;
        this.subStreet = subStreet;
        this.street = street;
        this.city = city;
    }

    private static final long serialVersionUID = 1L;

    private String taxIdNumber;

    private String branchCode;

    private String industryTypeCode;

    private String industryTypeMitCode;

    private String description;

    private String barangayAddress;

    private String districtAddress;

    private Date dateRegistered;

    private String exemptionTypeCode;

    private String subCode;
    private String cTypeCode;
    private String gTypeCode;
    private String spouseTaxPayer;
    private int startMonth;
    private Date incorporationDate;
    private Date birthDate;
    private String zipCode;
    private String sex;

    private String tinPart1;

    private String tinPart2;

    private String tinPart3;
    private String registeredAddress;

    private Date dateFiled;

    //additional fields
    private String psocCode;
    private String claimingAdditionalExemption;
    private int numberOfDependents;
    private String jointFilling;
    private Date dueDate;
    private Date returnPeriod;
    private String actCode;
    private String emailAddress;
    private int formVersion;

    private String sourceOfIncome;
    private String govtIssuedId;
    private String govtIssuedIdPlace;
    private long govtIssuedIdAmount;
    private Date govtIssuedIdDate;
    private String ammendedYN;

    //For Form1701
    private long batchNo;
    private String amdendedReturn;
    private String shortPeriodReturn;
    private String alphaNumericTaxCode;
    private int sheetFiledCount;
    private String taxFilerType;
    private String tradeName;
    private String contactNumber;
    private String civilStatus;
    private String ifMarriedSpouseIncome;
    private String filingStatus;
    private String mainLine;
    private String psic;
    private String methodOfAccounting;
    private String methodOfAccountingOthers;
    private String methodOfDeduction;
    private String incomeExemptFromIncomeTax;
    private String incomeSubjectToSpecialPreferentialRate;
    private String internationalTreatyYn;
    private String fiscalYear;
    private String filerName;
    private String lineOfBusiness;

    // additional for 1702
    private String calendarFiscal;
    private String yearEndedMonth;
    private String yearEnded;
    private String rdoCode;
    private String registeredActivity;
    private String lastName;
    private String midName;
    private String firstName;
    private String registeredName;
    private String ctcSecType;

    // for 1702MX
    private String amendedReturn;
    private String atc1 = "IC 055";
    private String alphanumericTaxCode1 = "IC 055";
    private String alphanumericTaxCodeDescription1 = "Minimum Corporate Income Tax (MCIT)";
    private String atc2Desc;
    private String atc2;
    private String nonDefaultATC;
    private String defaultATC;

    // for 1702EX
    private boolean atcIC011 = false;
    private boolean atcIC021 = false;
    private Date effectivityDateFrom;
    private Date effectivityDateTo;
    private String legalBasisTaxExemption;
    private String investmentPromotionAgency;

    // for 1702RT
    private String subStreet;
    private String street;
    private String city;

    // for checking of offline version
    private String offlineFormVersion;

    public String getOfflineFormVersion() {
        return offlineFormVersion;
    }

    public void setOfflineFormVersion(String offlineFormVersion) {
        this.offlineFormVersion = offlineFormVersion;
    }

    public String getTin() {
        StringBuilder sb = new StringBuilder();
        sb.append(FormWsUtil.isNotEmptyOrNull(this.tinPart1) ? this.tinPart1 : "");
        sb.append(FormWsUtil.isNotEmptyOrNull(this.tinPart2) ? this.tinPart2 : "");
        sb.append(FormWsUtil.isNotEmptyOrNull(this.tinPart3) ? this.tinPart3 : "");

        return sb.toString();
    }

    public String getAmendedReturn() {
        return amendedReturn;
    }

    public void setAmendedReturn(String amendedReturn) {
        this.amendedReturn = amendedReturn;
    }

    public String getAtc2Desc() {
        return atc2Desc;
    }

    public void setAtc2Desc(String atc2Desc) {
        this.atc2Desc = atc2Desc;
    }

    public String getAtc2() {
        return atc2;
    }

    public void setAtc2(String atc2) {
        this.atc2 = atc2;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * @return the taxIdNumber
     */
    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    /**
     * @param taxIdNumber the taxIdNumber to set
     */
    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    /**
     * @return the branchCode
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * @param branchCode the branchCode to set
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * @return the industryTypeCode
     */
    public String getIndustryTypeCode() {
        return industryTypeCode;
    }

    /**
     * @param industryTypeCode the industryTypeCode to set
     */
    public void setIndustryTypeCode(String industryTypeCode) {
        this.industryTypeCode = industryTypeCode;
    }

    /**
     * @return the industryTypeMitCode
     */
    public String getIndustryTypeMitCode() {
        return industryTypeMitCode;
    }

    /**
     * @param industryTypeMitCode the industryTypeMitCode to set
     */
    public void setIndustryTypeMitCode(String industryTypeMitCode) {
        this.industryTypeMitCode = industryTypeMitCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the barangayAddress
     */
    public String getBarangayAddress() {
        return barangayAddress;
    }

    /**
     * @param barangayAddress the barangayAddress to set
     */
    public void setBarangayAddress(String barangayAddress) {
        this.barangayAddress = barangayAddress;
    }

    /**
     * @return the districtAddress
     */
    public String getDistrictAddress() {
        return districtAddress;
    }

    /**
     * @param districtAddress the districtAddress to set
     */
    public void setDistrictAddress(String districtAddress) {
        this.districtAddress = districtAddress;
    }

    /**
     * @return the dateRegistered
     */
    public Date getDateRegistered() {
        return dateRegistered;
    }

    /**
     * @param dateRegistered the dateRegistered to set
     */
    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**
     * @return the exemptionTypeCode
     */
    public String getExemptionTypeCode() {
        return exemptionTypeCode;
    }

    /**
     * @param exemptionTypeCode the exemptionTypeCode to set
     */
    public void setExemptionTypeCode(String exemptionTypeCode) {
        this.exemptionTypeCode = exemptionTypeCode;
    }

    /**
     * @return the subCode
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * @param subCode the subCode to set
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /**
     * @return the cTypeCode
     */
    public String getcTypeCode() {
        return cTypeCode;
    }

    /**
     * @param cTypeCode the cTypeCode to set
     */
    public void setcTypeCode(String cTypeCode) {
        this.cTypeCode = cTypeCode;
    }

    /**
     * @return the gTypeCode
     */
    public String getgTypeCode() {
        return gTypeCode;
    }

    /**
     * @param gTypeCode the gTypeCode to set
     */
    public void setgTypeCode(String gTypeCode) {
        this.gTypeCode = gTypeCode;
    }

    /**
     * @return the spouseTaxPayer
     */
    public String getSpouseTaxPayer() {
        return spouseTaxPayer;
    }

    /**
     * @param spouseTaxPayer the spouseTaxPayer to set
     */
    public void setSpouseTaxPayer(String spouseTaxPayer) {
        this.spouseTaxPayer = spouseTaxPayer;
    }

    /**
     * @return the internationalTreatyYn
     */
    public String getInternationalTreatyYn() {
        return internationalTreatyYn;
    }

    /**
     * @param internationalTreatyYn the internationalTreatyYn to set
     */
    public void setInternationalTreatyYn(String internationalTreatyYn) {
        this.internationalTreatyYn = internationalTreatyYn;
    }

    /**
     * @return the startMonth
     */
    public int getStartMonth() {
        return startMonth;
    }

    /**
     * @param startMonth the startMonth to set
     */
    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    /**
     * @return the incorporationDate
     */
    public Date getIncorporationDate() {
        return incorporationDate;
    }

    /**
     * @param incorporationDate the incorporationDate to set
     */
    public void setIncorporationDate(Date incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the tinPart1
     */
    public String getTinPart1() {
        return tinPart1;
    }

    /**
     * @param tinPart1 the tinPart1 to set
     */
    public void setTinPart1(String tinPart1) {
        this.tinPart1 = tinPart1;
    }

    /**
     * @return the tinPart2
     */
    public String getTinPart2() {
        return tinPart2;
    }

    /**
     * @param tinPart2 the tinPart2 to set
     */
    public void setTinPart2(String tinPart2) {
        this.tinPart2 = tinPart2;
    }

    /**
     * @return the tinPart3
     */
    public String getTinPart3() {
        return tinPart3;
    }

    /**
     * @param tinPart3 the tinPart3 to set
     */
    public void setTinPart3(String tinPart3) {
        this.tinPart3 = tinPart3;
    }

    /**
     * @return the registeredAddress
     */
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    /**
     * @param registeredAddress the registeredAddress to set
     */
    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    /**
     * @return the dateFiled
     */
    public Date getDateFiled() {
        return dateFiled;
    }

    /**
     * @param dateFiled the dateFiled to set
     */
    public void setDateFiled(Date dateFiled) {
        this.dateFiled = dateFiled;
    }

    /**
     * @return the psocCode
     */
    public String getPsocCode() {
        return psocCode;
    }

    /**
     * @param psocCode the psocCode to set
     */
    public void setPsocCode(String psocCode) {
        this.psocCode = psocCode;
    }

    /**
     * @return the claimingAdditionalExemption
     */
    public String getClaimingAdditionalExemption() {
        return claimingAdditionalExemption;
    }

    /**
     * @param claimingAdditionalExemption the claimingAdditionalExemption to set
     */
    public void setClaimingAdditionalExemption(String claimingAdditionalExemption) {
        this.claimingAdditionalExemption = claimingAdditionalExemption;
    }

    /**
     * @return the numberOfDependents
     */
    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    /**
     * @param numberOfDependents the numberOfDependents to set
     */
    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    /**
     * @return the jointFilling
     */
    public String getJointFilling() {
        return jointFilling;
    }

    /**
     * @param jointFilling the jointFilling to set
     */
    public void setJointFilling(String jointFilling) {
        this.jointFilling = jointFilling;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the returnPeriod
     */
    public Date getReturnPeriod() {
        return returnPeriod;
    }

    /**
     * @param returnPeriod the returnPeriod to set
     */
    public void setReturnPeriod(Date returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    /**
     * @return the actCode
     */
    public String getActCode() {
        return actCode;
    }

    /**
     * @param actCode the actCode to set
     */
    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the formVersion
     */
    public int getFormVersion() {
        return formVersion;
    }

    /**
     * @param formVersion the formVersion to set
     */
    public void setFormVersion(int formVersion) {
        this.formVersion = formVersion;
    }

    /**
     * @return the sourceOfIncome
     */
    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    /**
     * @param sourceOfIncome the sourceOfIncome to set
     */
    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    /**
     * @return the govtIssuedId
     */
    public String getGovtIssuedId() {
        return govtIssuedId;
    }

    /**
     * @param govtIssuedId the govtIssuedId to set
     */
    public void setGovtIssuedId(String govtIssuedId) {
        this.govtIssuedId = govtIssuedId;
    }

    /**
     * @return the govtIssuedIdPlace
     */
    public String getGovtIssuedIdPlace() {
        return govtIssuedIdPlace;
    }

    /**
     * @param govtIssuedIdPlace the govtIssuedIdPlace to set
     */
    public void setGovtIssuedIdPlace(String govtIssuedIdPlace) {
        this.govtIssuedIdPlace = govtIssuedIdPlace;
    }

    /**
     * @return the govtIssuedIdAmount
     */
    public long getGovtIssuedIdAmount() {
        return govtIssuedIdAmount;
    }

    /**
     * @param govtIssuedIdAmount the govtIssuedIdAmount to set
     */
    public void setGovtIssuedIdAmount(long govtIssuedIdAmount) {
        this.govtIssuedIdAmount = govtIssuedIdAmount;
    }

    /**
     * @return the govtIssuedIdDate
     */
    public Date getGovtIssuedIdDate() {
        return govtIssuedIdDate;
    }

    /**
     * @param govtIssuedIdDate the govtIssuedIdDate to set
     */
    public void setGovtIssuedIdDate(Date govtIssuedIdDate) {
        this.govtIssuedIdDate = govtIssuedIdDate;
    }

    /**
     * @return the ammendedYN
     */
    public String getAmmendedYN() {
        return ammendedYN;
    }

    /**
     * @param ammendedYN the ammendedYN to set
     */
    public void setAmmendedYN(String ammendedYN) {
        this.ammendedYN = ammendedYN;
    }

    public String getAlphaNumericTaxCode() {
        return alphaNumericTaxCode;
    }

    public void setAlphaNumericTaxCode(String alphaNumericTaxCode) {
        this.alphaNumericTaxCode = alphaNumericTaxCode;
    }

    public String getTaxFilerType() {
        return taxFilerType;
    }

    public void setTaxFilerType(String taxFilerType) {
        this.taxFilerType = taxFilerType;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getIfMarriedSpouseIncome() {
        return ifMarriedSpouseIncome;
    }

    public void setIfMarriedSpouseIncome(String ifMarriedSpouseIncome) {
        this.ifMarriedSpouseIncome = ifMarriedSpouseIncome;
    }

    public String getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(String filingStatus) {
        this.filingStatus = filingStatus;
    }

    public String getMainLine() {
        return mainLine;
    }

    public void setMainLine(String mainLine) {
        this.mainLine = mainLine;
    }

    public String getPsic() {
        return psic;
    }

    public void setPsic(String psic) {
        this.psic = psic;
    }

    public String getMethodOfAccounting() {
        return methodOfAccounting;
    }

    public void setMethodOfAccounting(String methodOfAccounting) {
        this.methodOfAccounting = methodOfAccounting;
    }

    public String getMethodOfAccountingOthers() {
        return methodOfAccountingOthers;
    }

    public void setMethodOfAccountingOthers(String methodOfAccountingOthers) {
        this.methodOfAccountingOthers = methodOfAccountingOthers;
    }

    public String getMethodOfDeduction() {
        return methodOfDeduction;
    }

    public void setMethodOfDeduction(String methodOfDeduction) {
        this.methodOfDeduction = methodOfDeduction;
    }

    public String getIncomeExemptFromIncomeTax() {
        return incomeExemptFromIncomeTax;
    }

    public void setIncomeExemptFromIncomeTax(String incomeExemptFromIncomeTax) {
        this.incomeExemptFromIncomeTax = incomeExemptFromIncomeTax;
    }

    public String getIncomeSubjectToSpecialPreferentialRate() {
        return incomeSubjectToSpecialPreferentialRate;
    }

    public void setIncomeSubjectToSpecialPreferentialRate(
            String incomeSubjectToSpecialPreferentialRate) {
        this.incomeSubjectToSpecialPreferentialRate = incomeSubjectToSpecialPreferentialRate;
    }

    public String getAmdendedReturn() {
        return amdendedReturn;
    }

    public void setAmdendedReturn(String amdendedReturn) {
        this.amdendedReturn = amdendedReturn;
    }

    public String getShortPeriodReturn() {
        return shortPeriodReturn;
    }

    public void setShortPeriodReturn(String shortPeriodReturn) {
        this.shortPeriodReturn = shortPeriodReturn;
    }

    /**
     * @return the batchNo
     */
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

    public String getRdoCode() {
        return rdoCode;
    }

    public void setRdoCode(String rdoCode) {
        this.rdoCode = rdoCode;
    }

    public String getRegisteredActivity() {
        return registeredActivity;
    }

    public void setRegisteredActivity(String registeredActivity) {
        this.registeredActivity = registeredActivity;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public boolean isAtcIC011() {
        return atcIC011;
    }

    public void setAtcIC011(boolean atcIC011) {
        this.atcIC011 = atcIC011;
    }

    public boolean isAtcIC021() {
        return atcIC021;
    }

    public void setAtcIC021(boolean atcIC021) {
        this.atcIC021 = atcIC021;
    }

    public Date getEffectivityDateFrom() {
        return effectivityDateFrom;
    }

    public void setEffectivityDateFrom(Date effectivityDateFrom) {
        this.effectivityDateFrom = effectivityDateFrom;
    }

    public Date getEffectivityDateTo() {
        return effectivityDateTo;
    }

    public void setEffectivityDateTo(Date effectivityDateTo) {
        this.effectivityDateTo = effectivityDateTo;
    }

    public String getLegalBasisTaxExemption() {
        return legalBasisTaxExemption;
    }

    public void setLegalBasisTaxExemption(String legalBasisTaxExemption) {
        this.legalBasisTaxExemption = legalBasisTaxExemption;
    }

    public String getInvestmentPromotionAgency() {
        return investmentPromotionAgency;
    }

    public void setInvestmentPromotionAgency(String investmentPromotionAgency) {
        this.investmentPromotionAgency = investmentPromotionAgency;
    }

    /**
     * @return the sheetFiledCount
     */
    public int getSheetFiledCount() {
        return sheetFiledCount;
    }

    /**
     * @param sheetFiledCount the sheetFiledCount to set
     */
    public void setSheetFiledCount(int sheetFiledCount) {
        this.sheetFiledCount = sheetFiledCount;
    }

    /**
     * @return the fiscalYear
     */
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * @param fiscalYear the fiscalYear to set
     */
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    /**
     * @return the filerName
     */
    public String getFilerName() {
        return filerName;
    }

    /**
     * @param filerName the filerName to set
     */
    public void setFilerName(String filerName) {
        this.filerName = filerName;
    }

    /**
     * @return the batchNo
     */
    public long getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo the batchNo to set
     */
    public void setBatchNo(long batchNo) {
        this.batchNo = batchNo;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    /**
     * @return the subStreet
     */
    public String getSubStreet() {
        return subStreet;
    }

    /**
     * @param subStreet the subStreet to set
     */
    public void setSubStreet(String subStreet) {
        this.subStreet = subStreet;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String getCtcSecType() {
        return ctcSecType;
    }

    public void setCtcSecType(String ctcSecType) {
        this.ctcSecType = ctcSecType;
    }

    public String getNonDefaultATC() {
        return nonDefaultATC;
    }

    public void setNonDefaultATC(String nonDefaultATC) {
        this.nonDefaultATC = nonDefaultATC;
    }

    public String getDefaultATC() {
        return defaultATC;
    }

    public void setDefaultATC(String defaultATC) {
        this.defaultATC = defaultATC;
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

    /**
     * @return the atc1
     */
    public String getAtc1() {
        return atc1;
    }

    /**
     * @param atc1 the atc1 to set
     */
    public void setAtc1(String atc1) {
        this.atc1 = atc1;
    }

}
