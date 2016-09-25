/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
* Purpose: This object is used to retrieved form 1702-MX transactional data which can be found in the first part of the page
* Date Created: 01-28-2014
* Date Modified:
* Modification Reason:
* 
* @author CAI-STA Phils., Inc.
*/

@Entity
@Table(name="FILE_1702_TRANS")
@NamedQueries({
	@NamedQuery(name="ReturnTransaction_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnTransaction_1702_RT r WHERE r.referenceNo =:referenceNo"),
	@NamedQuery(name="ReturnTransaction_1702_RT.findFiled1702RTForm", query="SELECT OBJECT(r) FROM ReturnTransaction_1702_RT AS r WHERE r.tin = :TIN AND r.branchCode = :BRANCH_CODE AND r.returnPeriod = :RETRN_PERIOD ORDER BY r.referenceNo DESC,  r.dateFiled DESC"),
	@NamedQuery(name="ReturnTransaction_1702_RT.findOriginalForm", query="SELECT OBJECT(r) FROM ReturnTransaction_1702_RT AS r WHERE r.tin = :TIN AND r.branchCode = :BRANCH_CODE AND r.returnPeriod = :RETRN_PERIOD AND r.ammended = 'N' ORDER BY r.referenceNo DESC,  r.dateFiled DESC")
})
public class ReturnTransaction_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="TIN")
	private String tin;
	
	@Column(name="BRANCH_CODE")
	private String branchCode;
	
	@Column(name="DATE_FILED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFiled;
	
	@Column(name="DUE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dueDate;
	
	@Column(name="BATCH_NO")
	private Long batchNo;
	
	@Column(name="CTC_SEC_TYPE")
	private String ctcSecType;
	
	@Column(name="YEAR_TYPE")
	private String yearType;
	
	@Column(name="RETRN_PERIOD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date returnPeriod;
	
	@Column(name="AMENDED_YN")
	private String ammended;
	
	@Column(name="NUM_OF_SHEET")
	private int numSheet;
	
	@Column(name="ATC")
	private String atcCode;
	
	@Column(name="SPECIAL_RATE_YN")
	private String specialRateYN;
	
	@Column(name="INTERNATIONAL_TREATY_YN")
	private String internationalTreaty;
	
	@Column(name="EXMPT_SALES")
	private double exemptSale;
	
	@Column(name="EXMPT_COST")
	private double exemptCost;
	
	@Column(name="EXMPT_GROSS_INCOME")
	private double exemptGrossIncome;
	
	@Column(name="SP_GROSS_INCOME")
	private double specialGrossIncome;
	
	@Column(name="REG_GROSS_INCOME")
	private double regularGrossIncome;
	
	@Column(name="EXMPT_OTH_INCOME")
	private double exemptOtherIncome;
	
	@Column(name="SP_OTH_INCOME")
	private double specialOtherIncome;
	
	@Column(name="REG_OTH_INCOME")
	private double regularOtherIncome;
	
	@Column(name="SP_CREDIT_OTH_INCOME")
	private double specialCreditOtherIncome;
	
	@Column(name="REG_CREDIT_OTH_INCOME")
	private double regularCreditOtherIncome;
	
	@Column(name="EXMPT_TOT_GROSS_INCOME")
	private double exemptTotalGrossIncome;
	
	@Column(name="SP_TOT_GROSS_INCOME")
	private double specialTotalGrossIncome;
	
	@Column(name="REG_TOT_GROSS_INCOME")
	private double regularTotalGrossIncome;
	
	@Column(name="EXMPT_DEDUCTIONS")
	private double exemptDeductions;
	
	@Column(name="SP_DEDUCTIONS")
	private double specialDeductions;
	
	@Column(name="REG_DEDUCTIONS")
	private double regularDeductions;
	
	@Column(name="SP_TAXBL_INCOME")
	private double specialTaxableIncome;
	
	@Column(name="REG_TAXBL_INCOME")
	private double regularTaxableIncome;
	
	@Column(name="SP_RATE")
	private double specialRate;
	
	@Column(name="REG_RATE")
	private double regularRate;
	
	@Column(name="SP_INCOME_TAX")
	private double specialIncomeTax;
	
	@Column(name="REG_INCOME_TAX")
	private double regularIncomeTax;
	
	@Column(name="REG_TAX")
	private double regularTax;
	
	@Column(name="EXCESS_PRIOR_MCIT")
	private double excessPriorMCIT;
	
	@Column(name="BALANCE")
	private double balance;
	
	@Column(name="SP_TAX")
	private double specialTax;
	
	@Column(name="AGG_TAX_DUE")
	private double aggregateTaxDue;
	
	@Column(name="EXCESS_CREDIT")
	private double execssCredit;
	
	@Column(name="QTRS_TAX_PYMT")
	private double quarterTaxPayment;
	
	@Column(name="QTRS_TAX_WTHLD")
	private double quarterTaxWitheld;
	
	@Column(name="QTRS_TAX_WTHLD_2307")
	private double quarterTaxWitheld2307;
	
	@Column(name="FOREIGN_TAX_CREDIT")
	private double foreignTaxPaid;
	
	@Column(name="PREV_TAX_PAID")
	private double previousTaxPaid;
	
	@Column(name="TOT_TAX_CREDIT")
	private double totalTaxCredit;
	
	@Column(name="TAX_PAYBL")
	private double taxPayable;
	
	@Column(name="TOTAL")
	private double total;
	
	@Column(name="SURCHARGE")
	private double surcharge;
	
	@Column(name="INTEREST")
	private double interest;
	
	@Column(name="COMPROMISE")
	private double compromise;
	
	@Column(name="PENALTIES")
	private double penalties;
	
	@Column(name="TOT_AMT_PAYBL")
	private double totalAmountPayable;
	
	@Column(name="REFUND_TYPE")
	private String refundType;
	
	@Column(name="COMM_TAX_CERT")
	private String communityTaxCert;
	
	@Column(name="PLACE_ISSUE")
	private String placeIssue;
	
	@Column(name="DATE_ISSUE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateIssued;
	
	@Column(name="COMM_TAX_AMOUNT")
	private double ctcAmount;
	
	@Column(name="SHARE_AGENCIES")
	private double shareAgency;
	
	@Column(name="FORM_VERSION")
	private int formVersion;
	
	@Column(name="TAX_AGENT_TIN")
	private String taxAgentTin;
	
	@Column(name="TAX_AGENT_ACC_NO")
	private String taxAgentAcctNo;
	
	@Column(name="SHORT_PERIOD")
	private String shortPeriod;
	
	@Column(name="METHOD_DEDCT")
	private String methodDeduction;
	
	@Column(name="OTHER_PYMT_MADE")
	private double otherPaymentMade;
	
	@Column(name="EXMPT_TAXBL_INCOME")
	private double exemptTaxableIncome;
	
	@Column(name="EXMPT_RATE")
	private double exemptRate;
	
	@Column(name="EXMPT_INCOME_MCIT")
	private double exemptIncomeMCIT;
	
	@Column(name="SP_INCOME_MCIT")
	private double specialIncomeMCIT;
	
	@Column(name="REG_INCOME_MCIT")
	private double regularIncomeMCIT;
	
	@Column(name="SP_INCOME_NTL_GOV")
	private double specialIncomeNatlGov;
	
	@Column(name="EXMPT_MCIT")
	private double exemptMCIT;
	
	@Column(name="REG_MCIT")
	private double regularMCIT;
	
	@Column(name="MCIT_PREV_QTR")
	private double mcitPreviousQuarter;
	
	@Column(name="EXCESS_MCIT_CURR")
	private double excessMCITCurrent;
	
	@Column(name="SP_RATE_PREV_QTR")
	private double specialRatePreviousQtr;
	
	@Column(name="SP_TAX_CREDIT")
	private double specialTaxCredit;
	
	@Column(name="SP_TOT_TAX_CREDIT")
	private double specialTotalTaxCredit;
	
	@Column(name="SP_TAX_PAYBL")
	private double specialTaxPayable;
	
	@Column(name="INT_TREATY_TYPE")
	private String internaltionalTreatyType;
	
	@Column(name="ENTRY_TYPE")
	private String entryType;
	
	@Column(name="NUM_ACTIVITY")
	private int numActivity;
	
	@Column(name="DEFAULT_ATC_YN")
	private String defualtATC;
	
	@Column(name="NONDEFAULT_ATC_YN")
	private String nonDefaultATC;
	
	@Column(name="SP_PREV_TAX_PAID")
	private double specialPreviousTaxPaid;
	
	@Column(name="QTRS_TAX_PYMT_MCIT")
	private double quarterTaxPaymentMCIT;
	
	@Column(name="SP_QTRS_TAX_WTHLD")
	private double specialQuarterTaxWitheld;
	
	@Column(name="SP_QTRS_TAX_WTHLD_2307")
	private double specialQuarterTaxWitheld2307;
	
	@Column(name="SP_FOREIGN_TAX_CREDIT")
	private double specialForeignTaxCredit;
	
	@Column(name="QTRS_TAX_PYMT_SP_RATE")
	private double quarterTaxPaymentSpecialRate;
	
	@Column(name="TOTAL_ALLOWANCE_NOLCO")
	private double totalAllowanceNOLCO;
	
	@Column(name="FORM_CODE")
	private String formCode;
	
	@Column(name="FORM_TYPE")
	private int fomrType;
	
	@Column(name="FROM_OFFLINE")
	private String fromOffline;

	public ReturnTransaction_1702_RT() {
	}

	public ReturnTransaction_1702_RT(Long referenceNo, String tin,
			String branchCode, Date dateFiled, Date dueDate, Long batchNo,
			String yearType, Date returnPeriod, String ammended, int numSheet,
			String atcCode, String specialRateYN, String internationalTreaty,
			double exemptSale, double exemptCost, double exemptGrossIncome,
			double specialGrossIncome, double regularGrossIncome,
			double exemptOtherIncome, double specialOtherIncome,
			double regularOtherIncome, double specialCreditOtherIncome,
			double regularCreditOtherIncome, double exemptTotalGrossIncome,
			double specialTotalGrossIncome, double regularTotalGrossIncome,
			double exemptDeductions, double specialDeductions,
			double regularDeductions, double specialTaxableIncome,
			double regularTaxableIncome, double specialRate,
			double regularRate, double specialIncomeTax,
			double regularIncomeTax, double regularTax, double excessPriorMCIT,
			double balance, double specialTax, double aggregateTaxDue,
			double execssCredit, double quarterTaxPayment,
			double quarterTaxWitheld, double quarterTaxWitheld2307,
			double foreignTaxPaid, double previousTaxPaid,
			double totalTaxCredit, double taxPayable, double total,
			double surcharge, double interest, double compromise,
			double penalties, double totalAmountPayable, String refundType,
			String communityTaxCert, String placeIssue, Date dateIssued,
			double ctcAmount, double shareAgency, int formVersion,
			String taxAgentTin, String taxAgentAcctNo, String shortPeriod,
			String methodDeduction, double otherPaymentMade,
			double exemptTaxableIncome, double exemptRate,
			double exemptIncomeMCIT, double specialIncomeMCIT,
			double regularIncomeMCIT, double specialIncomeNatlGov,
			double exemptMCIT, double regularMCIT, double mcitPreviousQuarter,
			double excessMCITCurrent, double specialRatePreviousQtr,
			double specialTaxCredit, double specialTotalTaxCredit,
			double specialTaxPayable, String internaltionalTreatyType,
			String entryType, int numActivity, String defualtATC,
			String nonDefaultATC, double specialPreviousTaxPaid,
			double quarterTaxPaymentMCIT, double specialQuarterTaxWitheld,
			double specialQuarterTaxWitheld2307,
			double specialForeignTaxCredit,
			double quarterTaxPaymentSpecialRate, double totalAllowanceNOLCO,
			String formCode, int fomrType, String ctcSecType) {
		this.referenceNo = referenceNo;
		this.tin = tin;
		this.branchCode = branchCode;
		this.dateFiled = dateFiled;
		this.dueDate = dueDate;
		this.batchNo = batchNo;
		this.yearType = yearType;
		this.returnPeriod = returnPeriod;
		this.ammended = ammended;
		this.numSheet = numSheet;
		this.atcCode = atcCode;
		this.specialRateYN = specialRateYN;
		this.internationalTreaty = internationalTreaty;
		this.exemptSale = exemptSale;
		this.exemptCost = exemptCost;
		this.exemptGrossIncome = exemptGrossIncome;
		this.specialGrossIncome = specialGrossIncome;
		this.regularGrossIncome = regularGrossIncome;
		this.exemptOtherIncome = exemptOtherIncome;
		this.specialOtherIncome = specialOtherIncome;
		this.regularOtherIncome = regularOtherIncome;
		this.specialCreditOtherIncome = specialCreditOtherIncome;
		this.regularCreditOtherIncome = regularCreditOtherIncome;
		this.exemptTotalGrossIncome = exemptTotalGrossIncome;
		this.specialTotalGrossIncome = specialTotalGrossIncome;
		this.regularTotalGrossIncome = regularTotalGrossIncome;
		this.exemptDeductions = exemptDeductions;
		this.specialDeductions = specialDeductions;
		this.regularDeductions = regularDeductions;
		this.specialTaxableIncome = specialTaxableIncome;
		this.regularTaxableIncome = regularTaxableIncome;
		this.specialRate = specialRate;
		this.regularRate = regularRate;
		this.specialIncomeTax = specialIncomeTax;
		this.regularIncomeTax = regularIncomeTax;
		this.regularTax = regularTax;
		this.excessPriorMCIT = excessPriorMCIT;
		this.balance = balance;
		this.specialTax = specialTax;
		this.aggregateTaxDue = aggregateTaxDue;
		this.execssCredit = execssCredit;
		this.quarterTaxPayment = quarterTaxPayment;
		this.quarterTaxWitheld = quarterTaxWitheld;
		this.quarterTaxWitheld2307 = quarterTaxWitheld2307;
		this.foreignTaxPaid = foreignTaxPaid;
		this.previousTaxPaid = previousTaxPaid;
		this.totalTaxCredit = totalTaxCredit;
		this.taxPayable = taxPayable;
		this.total = total;
		this.surcharge = surcharge;
		this.interest = interest;
		this.compromise = compromise;
		this.penalties = penalties;
		this.totalAmountPayable = totalAmountPayable;
		this.refundType = refundType;
		this.communityTaxCert = communityTaxCert;
		this.placeIssue = placeIssue;
		this.dateIssued = dateIssued;
		this.ctcAmount = ctcAmount;
		this.shareAgency = shareAgency;
		this.formVersion = formVersion;
		this.taxAgentTin = taxAgentTin;
		this.taxAgentAcctNo = taxAgentAcctNo;
		this.shortPeriod = shortPeriod;
		this.methodDeduction = methodDeduction;
		this.otherPaymentMade = otherPaymentMade;
		this.exemptTaxableIncome = exemptTaxableIncome;
		this.exemptRate = exemptRate;
		this.exemptIncomeMCIT = exemptIncomeMCIT;
		this.specialIncomeMCIT = specialIncomeMCIT;
		this.regularIncomeMCIT = regularIncomeMCIT;
		this.specialIncomeNatlGov = specialIncomeNatlGov;
		this.exemptMCIT = exemptMCIT;
		this.regularMCIT = regularMCIT;
		this.mcitPreviousQuarter = mcitPreviousQuarter;
		this.excessMCITCurrent = excessMCITCurrent;
		this.specialRatePreviousQtr = specialRatePreviousQtr;
		this.specialTaxCredit = specialTaxCredit;
		this.specialTotalTaxCredit = specialTotalTaxCredit;
		this.specialTaxPayable = specialTaxPayable;
		this.internaltionalTreatyType = internaltionalTreatyType;
		this.entryType = entryType;
		this.numActivity = numActivity;
		this.defualtATC = defualtATC;
		this.nonDefaultATC = nonDefaultATC;
		this.specialPreviousTaxPaid = specialPreviousTaxPaid;
		this.quarterTaxPaymentMCIT = quarterTaxPaymentMCIT;
		this.specialQuarterTaxWitheld = specialQuarterTaxWitheld;
		this.specialQuarterTaxWitheld2307 = specialQuarterTaxWitheld2307;
		this.specialForeignTaxCredit = specialForeignTaxCredit;
		this.quarterTaxPaymentSpecialRate = quarterTaxPaymentSpecialRate;
		this.totalAllowanceNOLCO = totalAllowanceNOLCO;
		this.formCode = formCode;
		this.fomrType = fomrType;
		this.ctcSecType = ctcSecType;
	}

	/**
	 * @return the referenceNo
	 */
	public Long getReferenceNo() {
		return referenceNo;
	}

	/**
	 * @param referenceNo the referenceNo to set
	 */
	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	/**
	 * @return the tin
	 */
	public String getTin() {
		return tin;
	}

	/**
	 * @param tin the tin to set
	 */
	public void setTin(String tin) {
		this.tin = tin;
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
	 * @return the batchNo
	 */
	public Long getBatchNo() {
		return batchNo;
	}

	/**
	 * @param batchNo the batchNo to set
	 */
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * @return the yearType
	 */
	public String getYearType() {
		return yearType;
	}

	/**
	 * @param yearType the yearType to set
	 */
	public void setYearType(String yearType) {
		this.yearType = yearType;
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
	 * @return the ammended
	 */
	public String getAmmended() {
		return ammended;
	}

	/**
	 * @param ammended the ammended to set
	 */
	public void setAmmended(String ammended) {
		this.ammended = ammended;
	}

	/**
	 * @return the numSheet
	 */
	public int getNumSheet() {
		return numSheet;
	}

	/**
	 * @param numSheet the numSheet to set
	 */
	public void setNumSheet(int numSheet) {
		this.numSheet = numSheet;
	}

	/**
	 * @return the atcCode
	 */
	public String getAtcCode() {
		return atcCode;
	}

	/**
	 * @param atcCode the atcCode to set
	 */
	public void setAtcCode(String atcCode) {
		this.atcCode = atcCode;
	}

	/**
	 * @return the specialRateYN
	 */
	public String getSpecialRateYN() {
		return specialRateYN;
	}

	/**
	 * @param specialRateYN the specialRateYN to set
	 */
	public void setSpecialRateYN(String specialRateYN) {
		this.specialRateYN = specialRateYN;
	}

	/**
	 * @return the internationalTreaty
	 */
	public String getInternationalTreaty() {
		return internationalTreaty;
	}

	/**
	 * @param internationalTreaty the internationalTreaty to set
	 */
	public void setInternationalTreaty(String internationalTreaty) {
		this.internationalTreaty = internationalTreaty;
	}

	/**
	 * @return the exemptSale
	 */
	public double getExemptSale() {
		return exemptSale;
	}

	/**
	 * @param exemptSale the exemptSale to set
	 */
	public void setExemptSale(double exemptSale) {
		this.exemptSale = exemptSale;
	}

	/**
	 * @return the exemptCost
	 */
	public double getExemptCost() {
		return exemptCost;
	}

	/**
	 * @param exemptCost the exemptCost to set
	 */
	public void setExemptCost(double exemptCost) {
		this.exemptCost = exemptCost;
	}

	/**
	 * @return the exemptGrossIncome
	 */
	public double getExemptGrossIncome() {
		return exemptGrossIncome;
	}

	/**
	 * @param exemptGrossIncome the exemptGrossIncome to set
	 */
	public void setExemptGrossIncome(double exemptGrossIncome) {
		this.exemptGrossIncome = exemptGrossIncome;
	}

	/**
	 * @return the specialGrossIncome
	 */
	public double getSpecialGrossIncome() {
		return specialGrossIncome;
	}

	/**
	 * @param specialGrossIncome the specialGrossIncome to set
	 */
	public void setSpecialGrossIncome(double specialGrossIncome) {
		this.specialGrossIncome = specialGrossIncome;
	}

	/**
	 * @return the regularGrossIncome
	 */
	public double getRegularGrossIncome() {
		return regularGrossIncome;
	}

	/**
	 * @param regularGrossIncome the regularGrossIncome to set
	 */
	public void setRegularGrossIncome(double regularGrossIncome) {
		this.regularGrossIncome = regularGrossIncome;
	}

	/**
	 * @return the exemptOtherIncome
	 */
	public double getExemptOtherIncome() {
		return exemptOtherIncome;
	}

	/**
	 * @param exemptOtherIncome the exemptOtherIncome to set
	 */
	public void setExemptOtherIncome(double exemptOtherIncome) {
		this.exemptOtherIncome = exemptOtherIncome;
	}

	/**
	 * @return the specialOtherIncome
	 */
	public double getSpecialOtherIncome() {
		return specialOtherIncome;
	}

	/**
	 * @param specialOtherIncome the specialOtherIncome to set
	 */
	public void setSpecialOtherIncome(double specialOtherIncome) {
		this.specialOtherIncome = specialOtherIncome;
	}

	/**
	 * @return the regularOtherIncome
	 */
	public double getRegularOtherIncome() {
		return regularOtherIncome;
	}

	/**
	 * @param regularOtherIncome the regularOtherIncome to set
	 */
	public void setRegularOtherIncome(double regularOtherIncome) {
		this.regularOtherIncome = regularOtherIncome;
	}

	/**
	 * @return the specialCreditOtherIncome
	 */
	public double getSpecialCreditOtherIncome() {
		return specialCreditOtherIncome;
	}

	/**
	 * @param specialCreditOtherIncome the specialCreditOtherIncome to set
	 */
	public void setSpecialCreditOtherIncome(double specialCreditOtherIncome) {
		this.specialCreditOtherIncome = specialCreditOtherIncome;
	}

	/**
	 * @return the regularCreditOtherIncome
	 */
	public double getRegularCreditOtherIncome() {
		return regularCreditOtherIncome;
	}

	/**
	 * @param regularCreditOtherIncome the regularCreditOtherIncome to set
	 */
	public void setRegularCreditOtherIncome(double regularCreditOtherIncome) {
		this.regularCreditOtherIncome = regularCreditOtherIncome;
	}

	/**
	 * @return the exemptTotalGrossIncome
	 */
	public double getExemptTotalGrossIncome() {
		return exemptTotalGrossIncome;
	}

	/**
	 * @param exemptTotalGrossIncome the exemptTotalGrossIncome to set
	 */
	public void setExemptTotalGrossIncome(double exemptTotalGrossIncome) {
		this.exemptTotalGrossIncome = exemptTotalGrossIncome;
	}

	/**
	 * @return the specialTotalGrossIncome
	 */
	public double getSpecialTotalGrossIncome() {
		return specialTotalGrossIncome;
	}

	/**
	 * @param specialTotalGrossIncome the specialTotalGrossIncome to set
	 */
	public void setSpecialTotalGrossIncome(double specialTotalGrossIncome) {
		this.specialTotalGrossIncome = specialTotalGrossIncome;
	}

	/**
	 * @return the regularTotalGrossIncome
	 */
	public double getRegularTotalGrossIncome() {
		return regularTotalGrossIncome;
	}

	/**
	 * @param regularTotalGrossIncome the regularTotalGrossIncome to set
	 */
	public void setRegularTotalGrossIncome(double regularTotalGrossIncome) {
		this.regularTotalGrossIncome = regularTotalGrossIncome;
	}

	/**
	 * @return the exemptDeductions
	 */
	public double getExemptDeductions() {
		return exemptDeductions;
	}

	/**
	 * @param exemptDeductions the exemptDeductions to set
	 */
	public void setExemptDeductions(double exemptDeductions) {
		this.exemptDeductions = exemptDeductions;
	}

	/**
	 * @return the specialDeductions
	 */
	public double getSpecialDeductions() {
		return specialDeductions;
	}

	/**
	 * @param specialDeductions the specialDeductions to set
	 */
	public void setSpecialDeductions(double specialDeductions) {
		this.specialDeductions = specialDeductions;
	}

	/**
	 * @return the regularDeductions
	 */
	public double getRegularDeductions() {
		return regularDeductions;
	}

	/**
	 * @param regularDeductions the regularDeductions to set
	 */
	public void setRegularDeductions(double regularDeductions) {
		this.regularDeductions = regularDeductions;
	}

	/**
	 * @return the specialTaxableIncome
	 */
	public double getSpecialTaxableIncome() {
		return specialTaxableIncome;
	}

	/**
	 * @param specialTaxableIncome the specialTaxableIncome to set
	 */
	public void setSpecialTaxableIncome(double specialTaxableIncome) {
		this.specialTaxableIncome = specialTaxableIncome;
	}

	/**
	 * @return the regularTaxableIncome
	 */
	public double getRegularTaxableIncome() {
		return regularTaxableIncome;
	}

	/**
	 * @param regularTaxableIncome the regularTaxableIncome to set
	 */
	public void setRegularTaxableIncome(double regularTaxableIncome) {
		this.regularTaxableIncome = regularTaxableIncome;
	}

	/**
	 * @return the specialRate
	 */
	public double getSpecialRate() {
		return specialRate;
	}

	/**
	 * @param specialRate the specialRate to set
	 */
	public void setSpecialRate(double specialRate) {
		this.specialRate = specialRate;
	}

	/**
	 * @return the regularRate
	 */
	public double getRegularRate() {
		return regularRate;
	}

	/**
	 * @param regularRate the regularRate to set
	 */
	public void setRegularRate(double regularRate) {
		this.regularRate = regularRate;
	}

	/**
	 * @return the specialIncomeTax
	 */
	public double getSpecialIncomeTax() {
		return specialIncomeTax;
	}

	/**
	 * @param specialIncomeTax the specialIncomeTax to set
	 */
	public void setSpecialIncomeTax(double specialIncomeTax) {
		this.specialIncomeTax = specialIncomeTax;
	}

	/**
	 * @return the regularIncomeTax
	 */
	public double getRegularIncomeTax() {
		return regularIncomeTax;
	}

	/**
	 * @param regularIncomeTax the regularIncomeTax to set
	 */
	public void setRegularIncomeTax(double regularIncomeTax) {
		this.regularIncomeTax = regularIncomeTax;
	}

	/**
	 * @return the regularTax
	 */
	public double getRegularTax() {
		return regularTax;
	}

	/**
	 * @param regularTax the regularTax to set
	 */
	public void setRegularTax(double regularTax) {
		this.regularTax = regularTax;
	}

	/**
	 * @return the excessPriorMCIT
	 */
	public double getExcessPriorMCIT() {
		return excessPriorMCIT;
	}

	/**
	 * @param excessPriorMCIT the excessPriorMCIT to set
	 */
	public void setExcessPriorMCIT(double excessPriorMCIT) {
		this.excessPriorMCIT = excessPriorMCIT;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the specialTax
	 */
	public double getSpecialTax() {
		return specialTax;
	}

	/**
	 * @param specialTax the specialTax to set
	 */
	public void setSpecialTax(double specialTax) {
		this.specialTax = specialTax;
	}

	/**
	 * @return the aggregateTaxDue
	 */
	public double getAggregateTaxDue() {
		return aggregateTaxDue;
	}

	/**
	 * @param aggregateTaxDue the aggregateTaxDue to set
	 */
	public void setAggregateTaxDue(double aggregateTaxDue) {
		this.aggregateTaxDue = aggregateTaxDue;
	}

	/**
	 * @return the execssCredit
	 */
	public double getExecssCredit() {
		return execssCredit;
	}

	/**
	 * @param execssCredit the execssCredit to set
	 */
	public void setExecssCredit(double execssCredit) {
		this.execssCredit = execssCredit;
	}

	/**
	 * @return the quarterTaxPayment
	 */
	public double getQuarterTaxPayment() {
		return quarterTaxPayment;
	}

	/**
	 * @param quarterTaxPayment the quarterTaxPayment to set
	 */
	public void setQuarterTaxPayment(double quarterTaxPayment) {
		this.quarterTaxPayment = quarterTaxPayment;
	}

	/**
	 * @return the quarterTaxWitheld
	 */
	public double getQuarterTaxWitheld() {
		return quarterTaxWitheld;
	}

	/**
	 * @param quarterTaxWitheld the quarterTaxWitheld to set
	 */
	public void setQuarterTaxWitheld(double quarterTaxWitheld) {
		this.quarterTaxWitheld = quarterTaxWitheld;
	}

	/**
	 * @return the quarterTaxWitheld2307
	 */
	public double getQuarterTaxWitheld2307() {
		return quarterTaxWitheld2307;
	}

	/**
	 * @param quarterTaxWitheld2307 the quarterTaxWitheld2307 to set
	 */
	public void setQuarterTaxWitheld2307(double quarterTaxWitheld2307) {
		this.quarterTaxWitheld2307 = quarterTaxWitheld2307;
	}

	/**
	 * @return the foreignTaxPaid
	 */
	public double getForeignTaxPaid() {
		return foreignTaxPaid;
	}

	/**
	 * @param foreignTaxPaid the foreignTaxPaid to set
	 */
	public void setForeignTaxPaid(double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}

	/**
	 * @return the previousTaxPaid
	 */
	public double getPreviousTaxPaid() {
		return previousTaxPaid;
	}

	/**
	 * @param previousTaxPaid the previousTaxPaid to set
	 */
	public void setPreviousTaxPaid(double previousTaxPaid) {
		this.previousTaxPaid = previousTaxPaid;
	}

	/**
	 * @return the totalTaxCredit
	 */
	public double getTotalTaxCredit() {
		return totalTaxCredit;
	}

	/**
	 * @param totalTaxCredit the totalTaxCredit to set
	 */
	public void setTotalTaxCredit(double totalTaxCredit) {
		this.totalTaxCredit = totalTaxCredit;
	}

	/**
	 * @return the taxPayable
	 */
	public double getTaxPayable() {
		return taxPayable;
	}

	/**
	 * @param taxPayable the taxPayable to set
	 */
	public void setTaxPayable(double taxPayable) {
		this.taxPayable = taxPayable;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the surcharge
	 */
	public double getSurcharge() {
		return surcharge;
	}

	/**
	 * @param surcharge the surcharge to set
	 */
	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}

	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}

	/**
	 * @return the compromise
	 */
	public double getCompromise() {
		return compromise;
	}

	/**
	 * @param compromise the compromise to set
	 */
	public void setCompromise(double compromise) {
		this.compromise = compromise;
	}

	/**
	 * @return the penalties
	 */
	public double getPenalties() {
		return penalties;
	}

	/**
	 * @param penalties the penalties to set
	 */
	public void setPenalties(double penalties) {
		this.penalties = penalties;
	}

	/**
	 * @return the totalAmountPayable
	 */
	public double getTotalAmountPayable() {
		return totalAmountPayable;
	}

	/**
	 * @param totalAmountPayable the totalAmountPayable to set
	 */
	public void setTotalAmountPayable(double totalAmountPayable) {
		this.totalAmountPayable = totalAmountPayable;
	}

	/**
	 * @return the refundType
	 */
	public String getRefundType() {
		return refundType;
	}

	/**
	 * @param refundType the refundType to set
	 */
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	/**
	 * @return the communityTaxCert
	 */
	public String getCommunityTaxCert() {
		return communityTaxCert;
	}

	/**
	 * @param communityTaxCert the communityTaxCert to set
	 */
	public void setCommunityTaxCert(String communityTaxCert) {
		this.communityTaxCert = communityTaxCert;
	}

	/**
	 * @return the placeIssue
	 */
	public String getPlaceIssue() {
		return placeIssue;
	}

	/**
	 * @param placeIssue the placeIssue to set
	 */
	public void setPlaceIssue(String placeIssue) {
		this.placeIssue = placeIssue;
	}

	/**
	 * @return the dateIssued
	 */
	public Date getDateIssued() {
		return dateIssued;
	}

	/**
	 * @param dateIssued the dateIssued to set
	 */
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	/**
	 * @return the ctcAmount
	 */
	public double getCtcAmount() {
		return ctcAmount;
	}

	/**
	 * @param ctcAmount the ctcAmount to set
	 */
	public void setCtcAmount(double ctcAmount) {
		this.ctcAmount = ctcAmount;
	}

	/**
	 * @return the shareAgency
	 */
	public double getShareAgency() {
		return shareAgency;
	}

	/**
	 * @param shareAgency the shareAgency to set
	 */
	public void setShareAgency(double shareAgency) {
		this.shareAgency = shareAgency;
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
	 * @return the taxAgentTin
	 */
	public String getTaxAgentTin() {
		return taxAgentTin;
	}

	/**
	 * @param taxAgentTin the taxAgentTin to set
	 */
	public void setTaxAgentTin(String taxAgentTin) {
		this.taxAgentTin = taxAgentTin;
	}

	/**
	 * @return the taxAgentAcctNo
	 */
	public String getTaxAgentAcctNo() {
		return taxAgentAcctNo;
	}

	/**
	 * @param taxAgentAcctNo the taxAgentAcctNo to set
	 */
	public void setTaxAgentAcctNo(String taxAgentAcctNo) {
		this.taxAgentAcctNo = taxAgentAcctNo;
	}

	/**
	 * @return the shortPeriod
	 */
	public String getShortPeriod() {
		return shortPeriod;
	}

	/**
	 * @param shortPeriod the shortPeriod to set
	 */
	public void setShortPeriod(String shortPeriod) {
		this.shortPeriod = shortPeriod;
	}

	/**
	 * @return the methodDeduction
	 */
	public String getMethodDeduction() {
		return methodDeduction;
	}

	/**
	 * @param methodDeduction the methodDeduction to set
	 */
	public void setMethodDeduction(String methodDeduction) {
		this.methodDeduction = methodDeduction;
	}

	/**
	 * @return the otherPaymentMade
	 */
	public double getOtherPaymentMade() {
		return otherPaymentMade;
	}

	/**
	 * @param otherPaymentMade the otherPaymentMade to set
	 */
	public void setOtherPaymentMade(double otherPaymentMade) {
		this.otherPaymentMade = otherPaymentMade;
	}

	/**
	 * @return the exemptTaxableIncome
	 */
	public double getExemptTaxableIncome() {
		return exemptTaxableIncome;
	}

	/**
	 * @param exemptTaxableIncome the exemptTaxableIncome to set
	 */
	public void setExemptTaxableIncome(double exemptTaxableIncome) {
		this.exemptTaxableIncome = exemptTaxableIncome;
	}

	/**
	 * @return the exemptRate
	 */
	public double getExemptRate() {
		return exemptRate;
	}

	/**
	 * @param exemptRate the exemptRate to set
	 */
	public void setExemptRate(double exemptRate) {
		this.exemptRate = exemptRate;
	}

	/**
	 * @return the exemptIncomeMCIT
	 */
	public double getExemptIncomeMCIT() {
		return exemptIncomeMCIT;
	}

	/**
	 * @param exemptIncomeMCIT the exemptIncomeMCIT to set
	 */
	public void setExemptIncomeMCIT(double exemptIncomeMCIT) {
		this.exemptIncomeMCIT = exemptIncomeMCIT;
	}

	/**
	 * @return the specialIncomeMCIT
	 */
	public double getSpecialIncomeMCIT() {
		return specialIncomeMCIT;
	}

	/**
	 * @param specialIncomeMCIT the specialIncomeMCIT to set
	 */
	public void setSpecialIncomeMCIT(double specialIncomeMCIT) {
		this.specialIncomeMCIT = specialIncomeMCIT;
	}

	/**
	 * @return the regularIncomeMCIT
	 */
	public double getRegularIncomeMCIT() {
		return regularIncomeMCIT;
	}

	/**
	 * @param regularIncomeMCIT the regularIncomeMCIT to set
	 */
	public void setRegularIncomeMCIT(double regularIncomeMCIT) {
		this.regularIncomeMCIT = regularIncomeMCIT;
	}

	/**
	 * @return the specialIncomeNatlGov
	 */
	public double getSpecialIncomeNatlGov() {
		return specialIncomeNatlGov;
	}

	/**
	 * @param specialIncomeNatlGov the specialIncomeNatlGov to set
	 */
	public void setSpecialIncomeNatlGov(double specialIncomeNatlGov) {
		this.specialIncomeNatlGov = specialIncomeNatlGov;
	}

	/**
	 * @return the exemptMCIT
	 */
	public double getExemptMCIT() {
		return exemptMCIT;
	}

	/**
	 * @param exemptMCIT the exemptMCIT to set
	 */
	public void setExemptMCIT(double exemptMCIT) {
		this.exemptMCIT = exemptMCIT;
	}

	/**
	 * @return the regularMCIT
	 */
	public double getRegularMCIT() {
		return regularMCIT;
	}

	/**
	 * @param regularMCIT the regularMCIT to set
	 */
	public void setRegularMCIT(double regularMCIT) {
		this.regularMCIT = regularMCIT;
	}

	/**
	 * @return the mcitPreviousQuarter
	 */
	public double getMcitPreviousQuarter() {
		return mcitPreviousQuarter;
	}

	/**
	 * @param mcitPreviousQuarter the mcitPreviousQuarter to set
	 */
	public void setMcitPreviousQuarter(double mcitPreviousQuarter) {
		this.mcitPreviousQuarter = mcitPreviousQuarter;
	}

	/**
	 * @return the excessMCITCurrent
	 */
	public double getExcessMCITCurrent() {
		return excessMCITCurrent;
	}

	/**
	 * @param excessMCITCurrent the excessMCITCurrent to set
	 */
	public void setExcessMCITCurrent(double excessMCITCurrent) {
		this.excessMCITCurrent = excessMCITCurrent;
	}

	/**
	 * @return the specialRatePreviousQtr
	 */
	public double getSpecialRatePreviousQtr() {
		return specialRatePreviousQtr;
	}

	/**
	 * @param specialRatePreviousQtr the specialRatePreviousQtr to set
	 */
	public void setSpecialRatePreviousQtr(double specialRatePreviousQtr) {
		this.specialRatePreviousQtr = specialRatePreviousQtr;
	}

	/**
	 * @return the specialTaxCredit
	 */
	public double getSpecialTaxCredit() {
		return specialTaxCredit;
	}

	/**
	 * @param specialTaxCredit the specialTaxCredit to set
	 */
	public void setSpecialTaxCredit(double specialTaxCredit) {
		this.specialTaxCredit = specialTaxCredit;
	}

	/**
	 * @return the specialTotalTaxCredit
	 */
	public double getSpecialTotalTaxCredit() {
		return specialTotalTaxCredit;
	}

	/**
	 * @param specialTotalTaxCredit the specialTotalTaxCredit to set
	 */
	public void setSpecialTotalTaxCredit(double specialTotalTaxCredit) {
		this.specialTotalTaxCredit = specialTotalTaxCredit;
	}

	/**
	 * @return the specialTaxPayable
	 */
	public double getSpecialTaxPayable() {
		return specialTaxPayable;
	}

	/**
	 * @param specialTaxPayable the specialTaxPayable to set
	 */
	public void setSpecialTaxPayable(double specialTaxPayable) {
		this.specialTaxPayable = specialTaxPayable;
	}

	/**
	 * @return the internaltionalTreatyType
	 */
	public String getInternaltionalTreatyType() {
		return internaltionalTreatyType;
	}

	/**
	 * @param internaltionalTreatyType the internaltionalTreatyType to set
	 */
	public void setInternaltionalTreatyType(String internaltionalTreatyType) {
		this.internaltionalTreatyType = internaltionalTreatyType;
	}

	/**
	 * @return the entryType
	 */
	public String getEntryType() {
		return entryType;
	}

	/**
	 * @param entryType the entryType to set
	 */
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	/**
	 * @return the numActivity
	 */
	public int getNumActivity() {
		return numActivity;
	}

	/**
	 * @param numActivity the numActivity to set
	 */
	public void setNumActivity(int numActivity) {
		this.numActivity = numActivity;
	}

	/**
	 * @return the defualtATC
	 */
	public String getDefualtATC() {
		return defualtATC;
	}

	/**
	 * @param defualtATC the defualtATC to set
	 */
	public void setDefualtATC(String defualtATC) {
		this.defualtATC = defualtATC;
	}

	/**
	 * @return the nonDefaultATC
	 */
	public String getNonDefaultATC() {
		return nonDefaultATC;
	}

	/**
	 * @param nonDefaultATC the nonDefaultATC to set
	 */
	public void setNonDefaultATC(String nonDefaultATC) {
		this.nonDefaultATC = nonDefaultATC;
	}

	/**
	 * @return the specialPreviousTaxPaid
	 */
	public double getSpecialPreviousTaxPaid() {
		return specialPreviousTaxPaid;
	}

	/**
	 * @param specialPreviousTaxPaid the specialPreviousTaxPaid to set
	 */
	public void setSpecialPreviousTaxPaid(double specialPreviousTaxPaid) {
		this.specialPreviousTaxPaid = specialPreviousTaxPaid;
	}

	/**
	 * @return the quarterTaxPaymentMCIT
	 */
	public double getQuarterTaxPaymentMCIT() {
		return quarterTaxPaymentMCIT;
	}

	/**
	 * @param quarterTaxPaymentMCIT the quarterTaxPaymentMCIT to set
	 */
	public void setQuarterTaxPaymentMCIT(double quarterTaxPaymentMCIT) {
		this.quarterTaxPaymentMCIT = quarterTaxPaymentMCIT;
	}

	/**
	 * @return the specialQuarterTaxWitheld
	 */
	public double getSpecialQuarterTaxWitheld() {
		return specialQuarterTaxWitheld;
	}

	/**
	 * @param specialQuarterTaxWitheld the specialQuarterTaxWitheld to set
	 */
	public void setSpecialQuarterTaxWitheld(double specialQuarterTaxWitheld) {
		this.specialQuarterTaxWitheld = specialQuarterTaxWitheld;
	}

	/**
	 * @return the specialQuarterTaxWitheld2307
	 */
	public double getSpecialQuarterTaxWitheld2307() {
		return specialQuarterTaxWitheld2307;
	}

	/**
	 * @param specialQuarterTaxWitheld2307 the specialQuarterTaxWitheld2307 to set
	 */
	public void setSpecialQuarterTaxWitheld2307(double specialQuarterTaxWitheld2307) {
		this.specialQuarterTaxWitheld2307 = specialQuarterTaxWitheld2307;
	}

	/**
	 * @return the specialForeignTaxCredit
	 */
	public double getSpecialForeignTaxCredit() {
		return specialForeignTaxCredit;
	}

	/**
	 * @param specialForeignTaxCredit the specialForeignTaxCredit to set
	 */
	public void setSpecialForeignTaxCredit(double specialForeignTaxCredit) {
		this.specialForeignTaxCredit = specialForeignTaxCredit;
	}

	/**
	 * @return the quarterTaxPaymentSpecialRate
	 */
	public double getQuarterTaxPaymentSpecialRate() {
		return quarterTaxPaymentSpecialRate;
	}

	/**
	 * @param quarterTaxPaymentSpecialRate the quarterTaxPaymentSpecialRate to set
	 */
	public void setQuarterTaxPaymentSpecialRate(double quarterTaxPaymentSpecialRate) {
		this.quarterTaxPaymentSpecialRate = quarterTaxPaymentSpecialRate;
	}

	/**
	 * @return the totalAllowanceNOLCO
	 */
	public double getTotalAllowanceNOLCO() {
		return totalAllowanceNOLCO;
	}

	/**
	 * @param totalAllowanceNOLCO the totalAllowanceNOLCO to set
	 */
	public void setTotalAllowanceNOLCO(double totalAllowanceNOLCO) {
		this.totalAllowanceNOLCO = totalAllowanceNOLCO;
	}

	/**
	 * @return the formCode
	 */
	public String getFormCode() {
		return formCode;
	}

	/**
	 * @param formCode the formCode to set
	 */
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	/**
	 * @return the fomrType
	 */
	public int getFomrType() {
		return fomrType;
	}

	/**
	 * @param fomrType the fomrType to set
	 */
	public void setFomrType(int fomrType) {
		this.fomrType = fomrType;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getCtcSecType() {
		return ctcSecType;
	}

	public void setCtcSecType(String ctcSecType) {
		this.ctcSecType = ctcSecType;
	}

	/**
	 * @return the fromOffline
	 */
	public String getFromOffline() {
		return fromOffline;
	}

	/**
	 * @param fromOffline the fromOffline to set
	 */
	public void setFromOffline(String fromOffline) {
		this.fromOffline = fromOffline;
	}
}
