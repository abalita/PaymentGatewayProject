package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import com.ccci.ebirforms.paymentgateway.core.bean.AbstractFormBean;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.Form1702RTAttachments;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.GrossIncomeFinalWithholding;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.MinimumCorporateIncomeTax;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OperatingLoss;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherExpandable;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherIncome;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.PersonalRealPropertiesReceived;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.RealPropertiesSalesExchange;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.SharesOfStockSalesExchange;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.SpecialAllowableItemizedDeductions;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.StockholdersPartners;
import com.ccci.ebirforms.paymentgateway.form.bean.payment.PaymentBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class Form1702RTBean extends AbstractFormBean{
	
	//from offline filing
	private String fromOffline;
	
	private boolean isTokenUsed = false;
	private Map<String, Integer> iteratingTableMap = new HashMap<String, Integer>();
	private static final String MINIMUM_CORPORATE_INCOME_TAX_MCIT = "Minimum Corporate Income Tax (MCIT)";
	private static final String IC_055 = "IC055";
	private static final String DEFAULT_INCOME_TAX_RATE = "30.0";
	private static final String X = "X";
	private static final String BLANK = "";
	
	//fields used in inquiry
	private String repIntraCode = "REP033";  //TODO: unsure for what is this and from where is it.	
	private String searchMonth;
	private String searchYear;	
	private boolean showConfirmFormPopup = false;
	private String hkeepFlag = "";
	private boolean dataTable1 = false;
	private String trsMsg = "";
	private boolean showTRS = true;
	private boolean showHkeepPopup = false;
	private boolean showIntranet = false;
	private String Hkeep_Filing =
            "The return you wish to amend was already ARCHIVED. Please contact BIR Helpdesk.";
	private String Hkeep_Inquiry =
            "The return you wish to inquire was already ARCHIVED. Please contact BIR Helpdesk.";
	private String hkeepMsg = Hkeep_Filing;
	private boolean filingPage;
	private boolean inquiryPage;
	private int returnPeriodDay;
//	private List<RpsFormVersions> versionList = new ArrayList<RpsFormVersions>();
	private boolean disableProceedToPayment = true;	
	private int processNumTaxReturnSearch = 217;
	private int messageCodeTaxReturnSearch = 930;
//    private List<File1702Attachments> attachments = new ArrayList<File1702Attachments>();
    
	//page 1
	private String titleOfSignatory;
	private String numberOfPagesFiled;
	private String dateRegistered;
	private String corporateFlag;
	private int registeredNameMaxLength;
	
	/** Field 1 */
	private String calendarFiscal;		//1
	public String getCalendarDisplay() {
		return (getCalendarFiscal()!= null || !getCalendarFiscal().isEmpty()) && getCalendarFiscal().equals("C") ? X : BLANK;
	}
	public String getFiscalDisplay() {
		return (getCalendarFiscal()!= null || !getCalendarFiscal().isEmpty()) && getCalendarFiscal().equals("F") ? X : BLANK;
	}
	
	private String yearEndedMonth;						//2
	private String originalYearEndedMonth;
	private String yearEnded;							//2
	private boolean yearEndedMonthDisabled = true;		//2
	private String yearEndedStyle;
	
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
	
	private String alphanumericTaxCode1 = IC_055;		//5
	private String alphanumericTaxCodeDescription1 = MINIMUM_CORPORATE_INCOME_TAX_MCIT;//5
	private boolean alphanumericTaxCodeCheckBox1 =  true;//5
	private String alphanumericTaxCode2;				 //5
	private String alphanumericTaxCodeDescription2;		 //5
	private boolean alphanumericTaxCodeCheckBox2;		 //5
	private boolean atcSelectionSelectDisabled = true;//5
	private double taxCodeRate;//5
	
	private String tinA;								//6
	private String tinB;								//6
	private String tinC;								//6
	private String tinAClass;								//6
	private String tinBClass;								//6
	private String tinCClass;								//6
	
	private String rdoCode;								//7
	private String rdoCodeClass;								//7
	private Date dateIncorporation;					//8
	private boolean dateIncorporationDisabled;
	private String dateIncorporationClass;					//8
	private String registeredName;						//9
	private String registeredNameClass;						//9
	private String firstName;							//9
	private String lastName;							//9
	private String registeredAddress;					//10
	private String registeredAddressClass;					//10
	private String subStreet;							//10
	private String streetAddress;						//10
	private String barangayAddress;						//10
	private String cityAddress;							//10
	private String zipCode;								//10
	private String contactNumber;						//11
	private String contactNumberClass;						//11
	private String emailAddress;						//12
	private String emailAddressClass;						//12
	private String mainLineBusiness;					//13
	private String mainLineBusinessClass;					//13
	private String psicCode;							//14
	private String psicCodeClass;							//14
	private String methodDeductions;					//15
	
	private String totalIncomeTaxDue16;					//16
	private String totalTaxCreditsPayments17;			//17
	private String netTaxPayable18;						//18
	private String totalPenalties19;					//19
	// please see refund_type							21
	
	private String communityTaxCertificateNumber;		//22
	private Date ctcDateIssue;							//23
	private String ctcPlaceIssue;						//24
	private String ctcRegType;
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
	private PaymentBean payment = new PaymentBean(); 
//	private Formv2013PaymentBean absolutePayment = new Formv2013PaymentBean();
	
	//page 2
	private String netSalesRevenuesReceiptsFees;		//30
	private String costSalesServices;					//31
	private String grossIncomeFromOperation;			//32
	private String otherTaxableIncomeNotSubjectedToFinalTax;	//33

	private String totalGrossIncome;					//34
	
	private String ordinaryAllowableItemizedDeductions;	//35
	private boolean ordinaryAllowableItemizedDeductionsDisabled = true;
	private String specialAllowableItemizedDeductions36;//36
	private boolean specialAllowableItemizedDeductions36Disabled = true;
	private String nolco;								//37
	private boolean nolcoDisabled = true;
	private String totalItemizedDeductions;				//38
	private String optionalStandardDeductions;			//39
	private boolean optionalStandardDeductionsDisabled = true;//39
	private String netTaxableIncome;					//40
	private Date registeredDate;
	private String incomeTaxRate = DEFAULT_INCOME_TAX_RATE; // 41

	private String incomeTaxDueOtherThanMCIT;			//42
	private String minimumCorporateIncomeTax;			//43
	private String totalIncomeTaxDue44;					//44
	private String totalTaxCreditsPayments45;			//45
	private String netTaxPayable46;						//46
	
	private String surcharge = "0";							//47
	private String interest = "0";							//48
	private String compromise = "";							//49
	private String totalPenalties50;					//50
	
	private String specialAllowableItemizedDeductions52;		//52
	private String specialTaxCredits;					//53
	private String totalTaxReliefAvailment;				//54
	
	private String nameExternalAuditorAccreditedTaxAgent;		//55
	private String tinExternalAuditorAccreditedTaxAgent;		//56
	private String nameSigningPartner;					//57
	private String tinSigningPartner;					//58
	private String birAccreditationNo1=StringUtils.EMPTY;
	private String birAccreditationNo2=StringUtils.EMPTY;
	private String birAccreditationNo3=StringUtils.EMPTY;
	private String birAccreditationNo4=StringUtils.EMPTY;
	private Date birAccreditationIssueDate;			//60
	private Date birAccreditationExpiryDate;			//61
	private String tin1ExternalAuditorAccreditedTaxAgent=StringUtils.EMPTY;
	private String tin2ExternalAuditorAccreditedTaxAgent=StringUtils.EMPTY;
	private String tin3ExternalAuditorAccreditedTaxAgent=StringUtils.EMPTY;
	private String tinBranchExternalAuditorAccreditedTaxAgent=StringUtils.EMPTY;
	private String tin1SigningPartner=StringUtils.EMPTY;
	private String tin2SigningPartner=StringUtils.EMPTY;
	private String tin3SigningPartner=StringUtils.EMPTY;
	private String tinBranchSigningPartner=StringUtils.EMPTY;
	//Page 3
	
	//Schedule 1
	private String saleOfGoodsProperties = "0";							
	private String saleOfServices = "0";							
	private String leaseOfProperties = "0";							
	private String total = "0";							
	private String lessSalesReturnDiscounts = "0";							
	private String netSalesRevenuesReceiptsFeesSchedule1 = "0";							
	
	//Schedule 2
	//Schedule 2A
	private String merchandiseInventoryBeginning = "0";							
	private String addPurchaseOfMerchandise = "0";							
	private String totalGoodsAvailableForSale = "0";							
	private String lessMerchandiseInventoryEnding = "0";							
	private String costOfSales = "0";
	
	//Schedule 2B
	private String directMaterialsBeginning = "0";							
	private String addPurchasesOfDirectMaterials = "0";							
	private String materialsAvalableForUse = "0";							
	private String lessDirectMaterialsEnding = "0";							
	private String rawMaterialsUsed = "0";							
	private String directLabor = "0";							
	private String manufacturingOverhead = "0";							
	private String totalManufacturingCost = "0";							
	private String addWorkInProcessBeginning = "0";							
	private String lessWorkInProcessEnding = "0";							
	private String costOfGoodsManufactured = "0";							
	private String finishedGoodsBeginning = "0";							
	private String lessFinishedGoodsEnding = "0";							
	private String costOfGoodsManufacturedAndSold = "0";							
	
	//Schedule 2C
	private String directChargesSalariesWagesAndBenefits = "0";							
	private String directChargesMaterialsSuppliesAndFacilities = "0";							
	private String directChargesDepreciation = "0";							
	private String directChargesRental = "0";							
	private String directChargesOutsideServices = "0";							
	private String directChargesOthers = "0";							
	private String costOfServices = "0";							
	
	private String totalCostOfSalesServices = "0";							
	
	
	//Page 4
	
	//Schedule 3
	private String otherTaxIncomeDescription1 = "";
	private String otherTaxIncomeDescription2 = "";
	private String otherTaxIncomeDescription3 = "";
	private String otherTaxIncomeDescription3Class = "";
	private boolean otherTaxIncomeDescription3Enabled = true;
	private String otherTaxIncomeAmount1 = "0";
	private String otherTaxIncomeAmount2 = "0";
	private String otherTaxIncomeAmount3 = "0";
	private String otherTaxIncomeAmount3Class = "";
	private boolean otherTaxIncomeAmount3Enabled = true;
	
	private String totalOtherTaxableIncomeNotSubjectedToFinalTax = "0";
	private List<OtherExpandable> sched3AdditionalAttachments; // 3
	
	//Schedule 4
	private boolean schedule4Disabled = true;
	private String schedule4Style = "readOnlyStyle";
	private String advertisingAndPromotions = "0";
	private String amortizationsDescription1 = "";
	private String amortizationsDescription2 = "";
	private String amortizationsDescription3 = "";
	private String amortizationsDescription3Class = "";
	private boolean amortizationsDescription3Enabled;
	private String amortizationsAmount1 = "0";
	private String amortizationsAmount2 = "0";
	private String amortizationsAmount3 = "0";
	private String amortizationsAmount3Class;
	private boolean amortizationsAmount3Enabled;
	private String badDebts = "0";
	private String charitableContributions = "0";
	private String commissions = "0";
	private String communicationLightAndWater = "0";
	private String depletion = "0";
	private String depreciation = "0";
	private String directorsFees = "0";
	private String fringeBenefits = "0";
	private String fuelAndOil = "0";
	private String insurance = "0";
	private String interestSchedule4 = "0";
	private String janitorialAndMessengerialServices = "0";
	private String losses = "0";
	private String managementAndConsultancyFee = "0";
	private String miscellaneous = "0";
	private String officeSupplies = "0";
	private String otherServices = "0";
	private String professionalFees = "0";
	private String rental = "0";
	private String repairsAndMaintenanceLaborOrLaborAndMaterials = "0";
	private String repairsAndMaintenanceMaterialSupplies = "0";
	private String representationAndEntertainment = "0";
	private String researchAndDevelopment = "0";
	private String royalties = "0";
	private String salariesAndAllowances = "0";
	
	private List<OtherExpandable> sched4AdditionalAttachments1; // 3
	private List<OtherExpandable> sched4AdditionalAttachments2; // 3

	//Page 5
	
	//Schedule 4 (continuation)
	private String sched4HiddenSubtotal = "0";
	private String securityServices = "0";
	private String SSSGSISPhilhealthHDMFAndOtherContributions = "0";
	private String taxesAndLicenses = "0";
	private String tollingFees = "0";
	private String trainingAndSeminars = "0";
	private String transpotationAndTravel = "0";
	private String othersDescription1 = "";
	private String othersDescription2 = "";
	private String othersDescription3 = "";
	private String othersDescription4 = "";
	private String othersDescription4Class;
	private String othersAmount1 = "0";
	private String othersAmount2 = "0";
	private String othersAmount3 = "0";
	private String othersAmount4 = "0";
	private String othersAmount4Class;
	
	private String totalOrdinaryAllowableItemizedDeductions = "0";

	//Schedule 5
	private boolean schedule5Disabled = true;
	private String schedule5Style = "readOnlyStyle";
	private String specialAllowableItemizedDeductionsDescription1 = "";
	private String specialAllowableItemizedDeductionsDescription2 = "";
	private String specialAllowableItemizedDeductionsDescription3 = "";
	private String specialAllowableItemizedDeductionsDescription4 = "";
	private String specialAllowableItemizedDeductionsDescription4Class;
	private String specialAllowableItemizedDeductionsLegalBasis1 = "";
	private String specialAllowableItemizedDeductionsLegalBasis2 = "";
	private String specialAllowableItemizedDeductionsLegalBasis3 = "";
	private String specialAllowableItemizedDeductionsLegalBasis4 = "";
	private String specialAllowableItemizedDeductionsLegalBasis4Class;
	private String specialAllowableItemizedDeductionsAmount1 = "0";
	private String specialAllowableItemizedDeductionsAmount2 = "0";
	private String specialAllowableItemizedDeductionsAmount3 = "0";
	private String specialAllowableItemizedDeductionsAmount4 = "0";
	private String specialAllowableItemizedDeductionsAmount4Class;
	
	private String totalSpecialAllowableItemizedDeductions = "0";
	
	private List<SpecialAllowableItemizedDeductions> sched5AdditionalAttachments; // 3

	//Schedule 6
	private boolean schedule6Disabled = true;
	private String schedule6Style = "readOnlyStyle";
	private String schedule6StyleCurrent = "readOnlyStyle";
	private String grossIncome = "0";
	private String lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = "0";
	private String netOperatingLoss = "0";
	
	private List<OperatingLoss> sched6OperatingLoss;
	private boolean sched6ShowPanel = false;
	//Schedule 6A
	private String netOperatingLossYearIncurred1 = "";
	private String netOperatingLossYearIncurred2 = "";
	private String netOperatingLossYearIncurred3 = "";
	private String netOperatingLossYearIncurred4 = "";
	private String netOperatingLossYearIncurred4Class;
	private String netOperatingLossAmount1 = "0";
	private String netOperatingLossAmount2 = "0";
	private String netOperatingLossAmount3 = "0";
	private String netOperatingLossAmount4 = "0";
	private String netOperatingLossAmount4Class;
	private String NOLCOAppliedPreviousYear1 = "0";
	private String NOLCOAppliedPreviousYear2 = "0";
	private String NOLCOAppliedPreviousYear3 = "0";
	private String NOLCOAppliedPreviousYear4 = "0";
	private String NOLCOAppliedPreviousYear4Class;
	private String NOLCOExpired1 = "0";
	private String NOLCOExpired2 = "0";
	private String NOLCOExpired3 = "0";
	private String NOLCOExpired4 = "0";
	private String NOLCOExpired4Class;
	private String NOLCOAppliedCurrentYear1 = "0";
	private String NOLCOAppliedCurrentYear2 = "0";
	private String NOLCOAppliedCurrentYear3 = "0";
	private String NOLCOAppliedCurrentYear4 = "0";
	private String NOLCOAppliedCurrentYear4Class;
	private String netOperatingLossUnapplied1 = "0";
	private String netOperatingLossUnapplied2 = "0";
	private String netOperatingLossUnapplied3 = "0";
	private String netOperatingLossUnapplied4 = "0";
	private String netOperatingLossUnapplied4Class;
	
	private String totalNOLCO = "0";
	
	//Page 6
	
	//Schedule 7 Tax Credits/Payments-attach proof
	private String priorYearsExcessCreditsOtherThanMCIT = "0";
	private String incomeTaxPaymentUnderMCIT = "0";
	private String incomeTaxPaymentUnderRegularRate = "0";
	private String excessMCIT = "0";
	private String creditableTaxWithheldFromPrevQuarters = "0";
	private String creditableTaxWithheldFromTheFourthQuarter = "0";
	private String foreignTaxCredits = "0";
	private String taxPaidInReturn = "0";
	private String taxPaidInReturnClass;
	private String sched7SpecialTaxCredits = "0";
	private String otherCreditsPaymentsDescription1 = "";
	private String otherCreditsPaymentsAmount1 = "0";
	private String otherCreditsPaymentsDescription2 = "";
	private String otherCreditsPaymentsDescription2Class;
	private String otherCreditsPaymentsAmount2 = "0";
	private String otherCreditsPaymentsAmount2Class;
	private String totalTaxCredits = "0";
	
	private List<OtherExpandable> sched7AdditionalAttachments;
	
	//Schedule 8 Computation of Minimum Corporate Income Tax (MCIT)
	private String schedule8Style = "readOnlyStyle";
	private String mcitYear1 = "";
	private String normalIncomeTax1 = "0";
	private String mcit1 = "0";
	private String excessMCITOverNormalTax1 = "0";
	private String excessMCITAppliedPreviously1 = "0";
	private String expiredPortionOfExcessMCIT1 = "0";
	private String excessMCITAppliedCurrently1 = "0";
	private String balanceOfExcessMCIT1 = "0";
	private String mcitYear2 = "";
	private String normalIncomeTax2 = "0";
	private String mcit2 = "0";
	private String excessMCITOverNormalTax2 = "0";
	private String excessMCITAppliedPreviously2 = "0";
	private String expiredPortionOfExcessMCIT2 = "0";
	private String excessMCITAppliedCurrently2 = "0";
	private String balanceOfExcessMCIT2 = "0";
	private String mcitYear3 = "";
	private String normalIncomeTax3 = "0";
	private String mcit3 = "0";
	private String excessMCITOverNormalTax3 = "0";
	private String excessMCITAppliedPreviously3 = "0";
	private String expiredPortionOfExcessMCIT3 = "0";
	private String excessMCITAppliedCurrently3 = "0";
	private String balanceOfExcessMCIT3 = "0";
	private String totalExcessCreditsMCIT = "0";
	
	private List<MinimumCorporateIncomeTax> sched8AdditionalAttachments;
	
	//Schedule 9 - Reconciliation of Net Income per BOoks Against Taxable Income
	private String netIncomeLossPerBooks = "0";
	private String totalNonDeductibleExpenses = "0";
	private String totalNonTaxableAndFinalTaxIncomeWithSpecialDeductions = "0";
	private String sched9NetTaxableIncome = "0";
	private String nonDeductibleExpenses = "";
	private String nonDeductibleExpensesClass;
	private String nonDeductibleExpensesAmount = "0";
	private String nonDeductibleExpensesAmountClass;
	private String nonDeductibleExpenses2 = "";
	private String nonDeductibleExpenses2Class;
	private String nonDeductibleExpensesAmount2 = "0";
	private String nonDeductibleExpensesAmount2Class;
	private String nonTaxable = "";
	private String nonTaxableAmount = "0";
	private String nonTaxable2 = "";
	private String nonTaxable2Class;
	private String nonTaxableAmount2 = "0";
	private String nonTaxableAmount2Class;
	private String specialDeductions = "";
	private String specialDeductionsAmount = "0";
	private String specialDeductions2 = "";
	private String specialDeductions2Class;
	private String specialDeductionsAmount2 = "0";
	private String specialDeductionsAmount2Class;
	
	private List<OtherExpandable> sched9AdditionalAttachments1;
	private List<OtherExpandable> sched9AdditionalAttachments2;
	private List<OtherExpandable> sched9AdditionalAttachments3;
	
	//Page 7
	
	//Schedule 10 Assets
	private String currentAssets = "0";
	private String longTermInvestment = "0";
	private String netPropertyPlantAndEquipment = "0";
	private String longTermReceivables = "0";
	private String intangibleAssets = "0";
	private String otherAssets = "0";
	private String totalAssets = "0";
	
	//Schedule 10 Liabilities and Equity
	private String currentLiabilities = "0";
	private String longTermLiabilities = "0";
	private String deferredCredits = "0";
	private String otherLiabilities = "0";
	private String totalLiabilities = "0";
	private String capitalStock = "0";
	private String additionalPaidInCapital = "0";
	private String retainedEarnings = "0";
	private String totalEquity = "0";
	private String totalLiabilitiesAndEquity = "0";
	
	//Schedule 11 Stockholders Partners and Members Information
	private String capitalContributorType;
	private List<String> capitalContributorTypeList;
	
	private List<StockholdersPartners> sched11AdditionalAttachments;
	
	//Schedule 12 Supplemental Information
	private String exemptInterest = "0";
	private String exemptRoyalties = "0";
	private String exemptDividends = "0";
	private String exemptPrizesWinnings = "0";
	private String fairMarketValueInterest = "0";
	private String fairMarketValueRoyalties = "0";
	private String fairMarketValueDividends = "0";
	private String fairMarketValuePrizesWinnings = "0";
	private String finalTaxWthldInterest = "0";
	private String finalTaxWthldRoyalties = "0";
	private String finalTaxWthldDividends = "0";
	private String finalTaxWthldPrizesWinnings = "0";
	private String sched12HiddenSubtotal;
	private List<GrossIncomeFinalWithholding> listOfGrossIncomeFinalWithholding;

	private List<RealPropertiesSalesExchange> listOfRealPropertiesSalesExchange;
	private List<SharesOfStockSalesExchange> listOfSharesOfStockSalesExchange;
	private List<OtherIncome> listOfOtherIncome;
	private String saleExchangeOfRealPropertiesLength;
	private String saleExchangeOfSharesOfStockLength;
	private String otherIncomeLength;
	private String totalFinalTaxWithheldPaid;

	// Schedule 13 Gross Income/Receipts Exempt from Income Tax
	private String returnOfPremium;
	private List<PersonalRealPropertiesReceived> listOfPersonalRealPropertiesReceived;
	private List<OtherIncome> listOfOtherExemptIncome;
	private String personalRealPropertiesReceivedLength;
	private String otherExemptIncomeLength;
	private String totalIncomeExemptFromTax;
	
	private List<Form1702RTAttachments> listOfForm1702RTAttachments;
	
	//Transaction Used fields
	private Long referenceNo;  //transaction identifier
	private String tin; 	//item 6a,b,c
	private String branchCode;  //item 6d
	private String branchCodeClass;  //item 6d
	private Date dateFiled; //default to current date
	private Date dueDate; //taken from table RCS_RETURN_DUE_DATES
	private Date rcsReturnDueDate;
	private Long batchNo; //this is a system generated field  Default is 0
	private String yearType; //Item 1 (F/C)
	private Date returnPeriod; //taken from RCS_RETURN_DUE_DATES table
	private String ammended; //item 3 (Y/N)
	private int numSheet;  //number of forms filed default is 0
	private String atcCode; //selected ATC code
	private String specialRateYN; //default N
	private String internationalTreaty; //default N
	private double exemptSale; //defualt 0
	private double exemptCost; //default 0
	private double exemptGrossIncome; //default 0
	private double specialGrossIncome; //default 0
	private double regularGrossIncome; //Item 32 grossIncomeFromOperation
	private double exemptOtherIncome;  //default 0
	private double specialOtherIncome; //default 0
	private double regularOtherIncome; //Item 33 other taxable income otherTaxableIncomeNotSubjectedToFinalTax
	private double specialCreditOtherIncome; //default 0
	private double regularCreditOtherIncome; //Item 45 totalTaxCreditsPayments45
	private double exemptTotalGrossIncome; //default 0
	private double specialTotalGrossIncome; //default 0
	private double regularTotalGrossIncome; //Item 34 totalGrossIncome
	private double exemptDeductions; //default 0
	private double specialAllowableDeductions; //Item 35 
	private double regularDeductions; //Item 35
	private double specialTaxableIncome; //Deafault 0
	private double regularTaxableIncome; //Item Item 40
	private double specialRate; //default 0
	private double regularRate; //ATC selected rate Item 41
	private double specialIncomeTax; //default 0
	private double regularIncomeTax; //Item 42
	private double regularTax; // Item 44
	private double excessPriorMCIT; //Item 43
	private double balance; //Unpaid from previous return period default 0
	private double specialTax; //default 0
	private double aggregateTaxDue;  //default 0
	private double execssCredit; //default 0
	private double quarterTaxPayment; //default 0
	private double quarterTaxWitheld; //default 0
	private double quarterTaxWitheld2307; //default 0
	private double foreignTaxPaid; //default 0
	private double previousTaxPaid; //Item 16
	private double totalTaxCredit; //Item 17
	private double taxPayable; //item 18
	private double totals; //Item 4 Sched 1
	private double surcharges; //item 47
	private double interests; //item 48
	private double compromises; //item 49
	private double penalties; //Item 50
	private double totalAmountPayable; //Item 51 or item 20
	private String refundType; //Item 21
	private String communityTaxCert; //Item 22
	private String placeIssue; //item 24
	private Date dateIssued; //item 23
	private double ctcAmount; //Item 25
	private String ctcAmountStyle;
	private double shareAgency; //default 0
	private int formVersion; //From RPS_FORM_VERSIONS 
	private String taxAgentTin; //item 56 or item 58
	private String taxAgentAcctNo; //item 59
	private String shortPeriod; //item 4 can be null
	private String methodDeduction; //item 15 can be null
	private double otherPaymentMade; //default 0
	private double exemptTaxableIncome; //default 0
	private double exemptRate; //default 0
	private double exemptIncomeMCIT; //default 0
	private double specialIncomeMCIT; //default 0
	private double regularIncomeMCIT; //default 0
	private double specialIncomeNatlGov; //default 0
	private double exemptMCIT; //default 0
	private double regularMCIT; //default 0
	private double mcitPreviousQuarter; //default 0
	private double excessMCITCurrent; //item 4 sched 8
	private double specialRatePreviousQtr; //default 0
	private double specialTaxCredit; //default 0
	private double specialTotalTaxCredit; //default 0
	private double specialTaxPayable; //default 0
	private String internaltionalTreatyType; //defaul null
	private String entryType; //default null
	private int numActivity; //defaul tnull
	private String defualtATC; //deault IC 055
	private String nonDefaultATC; //default Y
	private double specialPreviousTaxPaid; //default 0
	private double quarterTaxPaymentMCIT; //default 0
	private double specialQuarterTaxWitheld; //default 0
	private double specialQuarterTaxWitheld2307; //default 0
	private double specialForeignTaxCredit; //default 0
	private double quarterTaxPaymentSpecialRate; //default 0
	private double totalAllowanceNOLCO; //item 3 Sched 6
	private String formCode; //default 1702-MX
	private int fomrType; //default 12
	
	//history used fields	
	private String createdBy; //current system user
	private String modifiedBy; //default null
	private Date dateModified;  //current system date
	private Date dateCreated; //current system date
	private String auditYN; //default N
	private String auditedBy; //default null
	private Date dateAudited; //default null	
	private String middleName;  //from taxpayer 
	private String street;  //from taxpayer 
	private String barangay;  //from taxpayer 
	private String district;  //from taxpayer 
	private String city;  //from taxpayer 
	private String num; //contact number from taxpayer
	private String code; //same as year type
	private int startMonth; // from RCS_RETURN_DUE_DATES filling period
	private String hKeepTag; //default null	
	private long partitionId; //default null	
	private Date corporationDate;  //date of incorporation from taxpayer
	private String lineOfBusiness; //line of business from taxpayer
	private String email; //email from taxpayer

	public Form1702RTBean() {
		sched3AdditionalAttachments = new ArrayList<OtherExpandable>();
		sched4AdditionalAttachments1 = new ArrayList<OtherExpandable>();
		sched4AdditionalAttachments2 = new ArrayList<OtherExpandable>();
		sched5AdditionalAttachments = new ArrayList<SpecialAllowableItemizedDeductions>();
		sched6OperatingLoss = new ArrayList<OperatingLoss>();
		sched7AdditionalAttachments = new ArrayList<OtherExpandable>();
		sched8AdditionalAttachments = new ArrayList<MinimumCorporateIncomeTax>();
		sched9AdditionalAttachments1 = new ArrayList<OtherExpandable>();
		sched9AdditionalAttachments2 = new ArrayList<OtherExpandable>();
		sched9AdditionalAttachments3 = new ArrayList<OtherExpandable>();
		sched11AdditionalAttachments = new ArrayList<StockholdersPartners>();
		for (int x = 0; x < 20; x++) {
			sched11AdditionalAttachments.add(new StockholdersPartners());
		}
		
		listOfGrossIncomeFinalWithholding = new ArrayList<GrossIncomeFinalWithholding>();
		listOfRealPropertiesSalesExchange = new ArrayList<RealPropertiesSalesExchange>();
		RealPropertiesSalesExchange realPropertiesSalesExchange1 = new RealPropertiesSalesExchange();
		realPropertiesSalesExchange1.setNumeral(0);
		getListOfRealPropertiesSalesExchange().add(realPropertiesSalesExchange1);
		RealPropertiesSalesExchange realPropertiesSalesExchange2 = new RealPropertiesSalesExchange();
		realPropertiesSalesExchange2.setNumeral(1);
		getListOfRealPropertiesSalesExchange().add(realPropertiesSalesExchange2);
		setSaleExchangeOfRealPropertiesLength("2");
		listOfSharesOfStockSalesExchange = new ArrayList<SharesOfStockSalesExchange>();
		SharesOfStockSalesExchange sharesOfStockSalesExchange1 = new SharesOfStockSalesExchange();
		SharesOfStockSalesExchange sharesOfStockSalesExchange2 = new SharesOfStockSalesExchange();
		sharesOfStockSalesExchange1.setNumeral(0);
		sharesOfStockSalesExchange2.setNumeral(1);
		getListOfSharesOfStockSalesExchange().add(sharesOfStockSalesExchange1);
		getListOfSharesOfStockSalesExchange().add(sharesOfStockSalesExchange2);
		setSaleExchangeOfSharesOfStockLength("2");
		listOfOtherIncome = new ArrayList<OtherIncome>();
		OtherIncome otherIncome1 = new OtherIncome();
		OtherIncome otherIncome2 = new OtherIncome();
		otherIncome2.setNumeral(0);
		otherIncome2.setNumeral(1);
		getListOfOtherIncome().add(otherIncome1);
		getListOfOtherIncome().add(otherIncome2);
		setOtherIncomeLength("2");
		listOfPersonalRealPropertiesReceived = new ArrayList<PersonalRealPropertiesReceived>();
		PersonalRealPropertiesReceived personalRealPropertiesReceived1 = new PersonalRealPropertiesReceived();
		PersonalRealPropertiesReceived personalRealPropertiesReceived2 = new PersonalRealPropertiesReceived();
		personalRealPropertiesReceived1.setNumeral(0);
		personalRealPropertiesReceived2.setNumeral(1);
		getListOfPersonalRealPropertiesReceived().add(personalRealPropertiesReceived1);
		getListOfPersonalRealPropertiesReceived().add(personalRealPropertiesReceived2);
		setPersonalRealPropertiesReceivedLength("2");
		listOfOtherExemptIncome = new ArrayList<OtherIncome>();
		OtherIncome otherExemptIncome1 = new OtherIncome();
		OtherIncome otherExemptIncome2 = new OtherIncome();
		otherExemptIncome1.setNumeral(0);
		otherExemptIncome2.setNumeral(1);
		getListOfOtherExemptIncome().add(otherExemptIncome1);
		getListOfOtherExemptIncome().add(otherExemptIncome2);
		setOtherExemptIncomeLength("2");
		capitalContributorTypeList = new ArrayList<String>();
	}
	
	public Form1702RTBean(Long referenceNo, String tin, String branchCode,
			Date dateFiled, Date dueDate, Long batchNo, String yearType,
			Date returnPeriod, String ammended, int numSheet, String atcCode,
			String specialRateYN, String internationalTreaty,
			double exemptSale, double exemptCost, double exemptGrossIncome,
			double specialGrossIncome, double regularGrossIncome,
			double exemptOtherIncome, double specialOtherIncome,
			double regularOtherIncome, double specialCreditOtherIncome,
			double regularCreditOtherIncome, double exemptTotalGrossIncome,
			double specialTotalGrossIncome, double regularTotalGrossIncome,
			double exemptDeductions, double specialAllowableDeductions,
			double regularDeductions, double specialTaxableIncome,
			double regularTaxableIncome, double specialRate,
			double regularRate, double specialIncomeTax,
			double regularIncomeTax, double regularTax, double excessPriorMCIT,
			double balance, double specialTax, double aggregateTaxDue,
			double execssCredit, double quarterTaxPayment,
			double quarterTaxWitheld, double quarterTaxWitheld2307,
			double foreignTaxPaid, double previousTaxPaid,
			double totalTaxCredit, double taxPayable, double totals,
			double surcharges, double interests, double compromises,
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
			String formCode, int fomrType) {
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
		this.specialAllowableDeductions = specialAllowableDeductions;
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
		this.totals = totals;
		this.surcharges = surcharges;
		this.interests = interests;
		this.compromises = compromises;
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
	}

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

	public boolean getAlphanumericTaxCodeCheckBox1() {
		return alphanumericTaxCodeCheckBox1;
	}

	public void setAlphanumericTaxCodeCheckBox1(boolean alphanumericTaxCodeCheckBox1) {
		this.alphanumericTaxCodeCheckBox1 = alphanumericTaxCodeCheckBox1;
	}

	public boolean getAlphanumericTaxCodeCheckBox2() {
		return alphanumericTaxCodeCheckBox2;
	}

	public void setAlphanumericTaxCodeCheckBox2(boolean alphanumericTaxCodeCheckBox2) {
		this.alphanumericTaxCodeCheckBox2 = alphanumericTaxCodeCheckBox2;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
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

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getRdoCode() {
		return rdoCode;
	}

	public void setRdoCode(String rdoCode) {
		this.rdoCode = rdoCode;
	}

	public String getRegisteredName() {
		return registeredName;
	}

	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
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

	public String getCtcPlaceIssue() {
		return ctcPlaceIssue;
	}

	public void setCtcPlaceIssue(String ctcPlaceIssue) {
		this.ctcPlaceIssue = ctcPlaceIssue;
	}

	public double getCtcAmount() {
		return ctcAmount;
	}

	public void setCtcAmount(double ctcAmount) {
		this.ctcAmount = ctcAmount;
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

	public String getOthersAmount() {
		return othersAmount;
	}

	public void setOthersAmount(String othersAmount) {
		this.othersAmount = othersAmount;
	}

	public String getNetSalesRevenuesReceiptsFees() {
		return netSalesRevenuesReceiptsFees;
	}

	public void setNetSalesRevenuesReceiptsFees(String netSalesRevenuesReceiptsFees) {
		this.netSalesRevenuesReceiptsFees = netSalesRevenuesReceiptsFees;
	}

	public String getCostSalesServices() {
		return costSalesServices;
	}

	public void setCostSalesServices(String costSalesServices) {
		this.costSalesServices = costSalesServices;
	}

	public String getGrossIncomeFromOperation() {
		return grossIncomeFromOperation;
	}

	public void setGrossIncomeFromOperation(String grossIncomeFromOperation) {
		this.grossIncomeFromOperation = grossIncomeFromOperation;
	}

	public String getOtherTaxableIncomeNotSubjectedToFinalTax() {
		return otherTaxableIncomeNotSubjectedToFinalTax;
	}

	public void setOtherTaxableIncomeNotSubjectedToFinalTax(
			String otherTaxableIncomeNotSubjectedToFinalTax) {
		this.otherTaxableIncomeNotSubjectedToFinalTax = otherTaxableIncomeNotSubjectedToFinalTax;
	}

	public String getTotalGrossIncome() {
		return totalGrossIncome;
	}

	public void setTotalGrossIncome(String totalGrossIncome) {
		this.totalGrossIncome = totalGrossIncome;
	}

	public String getOrdinaryAllowableItemizedDeductions() {
		return ordinaryAllowableItemizedDeductions;
	}

	public void setOrdinaryAllowableItemizedDeductions(
			String ordinaryAllowableItemizedDeductions) {
		this.ordinaryAllowableItemizedDeductions = ordinaryAllowableItemizedDeductions;
	}

	public String getSpecialAllowableItemizedDeductions36() {
		return specialAllowableItemizedDeductions36;
	}

	public void setSpecialAllowableItemizedDeductions36(
			String specialAllowableItemizedDeductions36) {
		this.specialAllowableItemizedDeductions36 = specialAllowableItemizedDeductions36;
	}

	public String getNolco() {
		return nolco;
	}

	public void setNolco(String nolco) {
		this.nolco = nolco;
	}

	public String getTotalItemizedDeductions() {
		return totalItemizedDeductions;
	}

	public void setTotalItemizedDeductions(String totalItemizedDeductions) {
		this.totalItemizedDeductions = totalItemizedDeductions;
	}

	public String getOptionalStandardDeductions() {
		return optionalStandardDeductions;
	}

	public void setOptionalStandardDeductions(String optionalStandardDeductions) {
		this.optionalStandardDeductions = optionalStandardDeductions;
	}

	public String getNetTaxableIncome() {
		return netTaxableIncome;
	}

	public void setNetTaxableIncome(String netTaxableIncome) {
		this.netTaxableIncome = netTaxableIncome;
	}

	public String getIncomeTaxRate() {
		return incomeTaxRate;
	}

	public void setIncomeTaxRate(String incomeTaxRate) {
		this.incomeTaxRate = incomeTaxRate;
	}

	public String getIncomeTaxDueOtherThanMCIT() {
		return incomeTaxDueOtherThanMCIT;
	}

	public void setIncomeTaxDueOtherThanMCIT(String incomeTaxDueOtherThanMCIT) {
		this.incomeTaxDueOtherThanMCIT = incomeTaxDueOtherThanMCIT;
	}

	public String getMinimumCorporateIncomeTax() {
		return minimumCorporateIncomeTax;
	}

	public void setMinimumCorporateIncomeTax(String minimumCorporateIncomeTax) {
		this.minimumCorporateIncomeTax = minimumCorporateIncomeTax;
	}

	public String getTotalIncomeTaxDue44() {
		return totalIncomeTaxDue44;
	}

	public void setTotalIncomeTaxDue44(String totalIncomeTaxDue44) {
		this.totalIncomeTaxDue44 = totalIncomeTaxDue44;
	}

	public String getTotalTaxCreditsPayments45() {
		return totalTaxCreditsPayments45;
	}

	public void setTotalTaxCreditsPayments45(String totalTaxCreditsPayments45) {
		this.totalTaxCreditsPayments45 = totalTaxCreditsPayments45;
	}

	public String getNetTaxPayable46() {
		return netTaxPayable46;
	}

	public void setNetTaxPayable46(String netTaxPayable46) {
		this.netTaxPayable46 = netTaxPayable46;
	}

	public String getSurcharge() {
		if(!inquiryPage){
            if(isLateFiling() && Form1702RTBeanBuilder.dblValueOf(netTaxPayable46) > 0){
//                surcharge = Form1702RTBeanBuilder.dblToString(CommonComputer.computeSurcharge(Form1702RTBeanBuilder.dblValueOf(netTaxPayable46)));
            }else{
                surcharge = "0";
            }
        }
        return surcharge;
	}

	public void setSurcharge(String surcharge) {
		this.surcharge = surcharge;
	}

	public String getInterest() {
		if(!inquiryPage){
            if(isLateFiling() && Form1702RTBeanBuilder.dblValueOf(netTaxPayable46) > 0){
	                Calendar cal = Calendar.getInstance();
//	                interest = Form1702RTBeanBuilder.dblToString(CommonComputer.computeInterest(Form1702RTBeanBuilder.dblValueOf(netTaxPayable46), dueDate, cal.getTime()));
	            }else{
	                interest = "0";
	            }
	        }
	        return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getCompromise() {
		return compromise;
	}

	public void setCompromise(String compromise) {
		this.compromise = compromise;
	}

	public String getTotalPenalties50() {
		return totalPenalties50;
	}

	public void setTotalPenalties50(String totalPenalties50) {
		this.totalPenalties50 = totalPenalties50;
	}

	public String getSpecialAllowableItemizedDeductions52() {
		return specialAllowableItemizedDeductions52;
	}

	public void setSpecialAllowableItemizedDeductions52(
			String specialAllowableItemizedDeductions52) {
		this.specialAllowableItemizedDeductions52 = specialAllowableItemizedDeductions52;
	}

	public String getSpecialTaxCredits() {
		return specialTaxCredits;
	}

	public void setSpecialTaxCredits(String specialTaxCredits) {
		this.specialTaxCredits = specialTaxCredits;
	}

	public String getTotalTaxReliefAvailment() {
		return totalTaxReliefAvailment;
	}

	public void setTotalTaxReliefAvailment(String totalTaxReliefAvailment) {
		this.totalTaxReliefAvailment = totalTaxReliefAvailment;
	}

	public String getNameExternalAuditorAccreditedTaxAgent() {
		return nameExternalAuditorAccreditedTaxAgent;
	}

	public void setNameExternalAuditorAccreditedTaxAgent(
			String nameExternalAuditorAccreditedTaxAgent) {
		this.nameExternalAuditorAccreditedTaxAgent = nameExternalAuditorAccreditedTaxAgent;
	}

	public String getTinExternalAuditorAccreditedTaxAgent() {
		return tinExternalAuditorAccreditedTaxAgent;
	}

	public void setTinExternalAuditorAccreditedTaxAgent(
			String tinExternalAuditorAccreditedTaxAgent) {
		this.tinExternalAuditorAccreditedTaxAgent = tinExternalAuditorAccreditedTaxAgent;
	}

	public String getNameSigningPartner() {
		return nameSigningPartner;
	}

	public void setNameSigningPartner(String nameSigningPartner) {
		this.nameSigningPartner = nameSigningPartner;
	}

	public String getTinSigningPartner() {
		return tinSigningPartner;
	}

	public void setTinSigningPartner(String tinSigningPartner) {
		this.tinSigningPartner = tinSigningPartner;
	}

	public String getSaleOfGoodsProperties() {
		return saleOfGoodsProperties;
	}

	public void setSaleOfGoodsProperties(String saleOfGoodsProperties) {
		this.saleOfGoodsProperties = saleOfGoodsProperties;
	}

	public String getSaleOfServices() {
		return saleOfServices;
	}

	public void setSaleOfServices(String saleOfServices) {
		this.saleOfServices = saleOfServices;
	}

	public String getLeaseOfProperties() {
		return leaseOfProperties;
	}

	public void setLeaseOfProperties(String leaseOfProperties) {
		this.leaseOfProperties = leaseOfProperties;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getLessSalesReturnDiscounts() {
		return lessSalesReturnDiscounts;
	}

	public void setLessSalesReturnDiscounts(String lessSalesReturnDiscounts) {
		this.lessSalesReturnDiscounts = lessSalesReturnDiscounts;
	}

	public String getNetSalesRevenuesReceiptsFeesSchedule1() {
		return netSalesRevenuesReceiptsFeesSchedule1;
	}

	public void setNetSalesRevenuesReceiptsFeesSchedule1(
			String netSalesRevenuesReceiptsFeesSchedule1) {
		this.netSalesRevenuesReceiptsFeesSchedule1 = netSalesRevenuesReceiptsFeesSchedule1;
	}

	public String getMerchandiseInventoryBeginning() {
		return merchandiseInventoryBeginning;
	}

	public void setMerchandiseInventoryBeginning(
			String merchandiseInventoryBeginning) {
		this.merchandiseInventoryBeginning = merchandiseInventoryBeginning;
	}

	public String getAddPurchaseOfMerchandise() {
		return addPurchaseOfMerchandise;
	}

	public void setAddPurchaseOfMerchandise(String addPurchaseOfMerchandise) {
		this.addPurchaseOfMerchandise = addPurchaseOfMerchandise;
	}

	public String getTotalGoodsAvailableForSale() {
		return totalGoodsAvailableForSale;
	}

	public void setTotalGoodsAvailableForSale(String totalGoodsAvailableForSale) {
		this.totalGoodsAvailableForSale = totalGoodsAvailableForSale;
	}

	public String getLessMerchandiseInventoryEnding() {
		return lessMerchandiseInventoryEnding;
	}

	public void setLessMerchandiseInventoryEnding(
			String lessMerchandiseInventoryEnding) {
		this.lessMerchandiseInventoryEnding = lessMerchandiseInventoryEnding;
	}

	public String getCostOfSales() {
		return costOfSales;
	}

	public void setCostOfSales(String costOfSales) {
		this.costOfSales = costOfSales;
	}

	public String getDirectMaterialsBeginning() {
		return directMaterialsBeginning;
	}

	public void setDirectMaterialsBeginning(String directMaterialsBeginning) {
		this.directMaterialsBeginning = directMaterialsBeginning;
	}

	public String getAddPurchasesOfDirectMaterials() {
		return addPurchasesOfDirectMaterials;
	}

	public void setAddPurchasesOfDirectMaterials(
			String addPurchasesOfDirectMaterials) {
		this.addPurchasesOfDirectMaterials = addPurchasesOfDirectMaterials;
	}

	public String getMaterialsAvalableForUse() {
		return materialsAvalableForUse;
	}

	public void setMaterialsAvalableForUse(String materialsAvalableForUse) {
		this.materialsAvalableForUse = materialsAvalableForUse;
	}

	public String getLessDirectMaterialsEnding() {
		return lessDirectMaterialsEnding;
	}

	public void setLessDirectMaterialsEnding(String lessDirectMaterialsEnding) {
		this.lessDirectMaterialsEnding = lessDirectMaterialsEnding;
	}

	public String getRawMaterialsUsed() {
		return rawMaterialsUsed;
	}

	public void setRawMaterialsUsed(String rawMaterialsUsed) {
		this.rawMaterialsUsed = rawMaterialsUsed;
	}

	public String getDirectLabor() {
		return directLabor;
	}

	public void setDirectLabor(String directLabor) {
		this.directLabor = directLabor;
	}

	public String getManufacturingOverhead() {
		return manufacturingOverhead;
	}

	public void setManufacturingOverhead(String manufacturingOverhead) {
		this.manufacturingOverhead = manufacturingOverhead;
	}

	public String getTotalManufacturingCost() {
		return totalManufacturingCost;
	}

	public void setTotalManufacturingCost(String totalManufacturingCost) {
		this.totalManufacturingCost = totalManufacturingCost;
	}

	public String getAddWorkInProcessBeginning() {
		return addWorkInProcessBeginning;
	}

	public void setAddWorkInProcessBeginning(String addWorkInProcessBeginning) {
		this.addWorkInProcessBeginning = addWorkInProcessBeginning;
	}

	public String getLessWorkInProcessEnding() {
		return lessWorkInProcessEnding;
	}

	public void setLessWorkInProcessEnding(String lessWorkInProcessEnding) {
		this.lessWorkInProcessEnding = lessWorkInProcessEnding;
	}

	public String getCostOfGoodsManufactured() {
		return costOfGoodsManufactured;
	}

	public void setCostOfGoodsManufactured(String costOfGoodsManufactured) {
		this.costOfGoodsManufactured = costOfGoodsManufactured;
	}

	public String getFinishedGoodsBeginning() {
		return finishedGoodsBeginning;
	}

	public void setFinishedGoodsBeginning(String finishedGoodsBeginning) {
		this.finishedGoodsBeginning = finishedGoodsBeginning;
	}

	public String getLessFinishedGoodsEnding() {
		return lessFinishedGoodsEnding;
	}

	public void setLessFinishedGoodsEnding(String lessFinishedGoodsEnding) {
		this.lessFinishedGoodsEnding = lessFinishedGoodsEnding;
	}

	public String getCostOfGoodsManufacturedAndSold() {
		return costOfGoodsManufacturedAndSold;
	}

	public void setCostOfGoodsManufacturedAndSold(
			String costOfGoodsManufacturedAndSold) {
		this.costOfGoodsManufacturedAndSold = costOfGoodsManufacturedAndSold;
	}

	public String getDirectChargesSalariesWagesAndBenefits() {
		return directChargesSalariesWagesAndBenefits;
	}

	public void setDirectChargesSalariesWagesAndBenefits(
			String directChargesSalariesWagesAndBenefits) {
		this.directChargesSalariesWagesAndBenefits = directChargesSalariesWagesAndBenefits;
	}

	public String getDirectChargesMaterialsSuppliesAndFacilities() {
		return directChargesMaterialsSuppliesAndFacilities;
	}

	public void setDirectChargesMaterialsSuppliesAndFacilities(
			String directChargesMaterialsSuppliesAndFacilities) {
		this.directChargesMaterialsSuppliesAndFacilities = directChargesMaterialsSuppliesAndFacilities;
	}

	public String getDirectChargesDepreciation() {
		return directChargesDepreciation;
	}

	public void setDirectChargesDepreciation(String directChargesDepreciation) {
		this.directChargesDepreciation = directChargesDepreciation;
	}

	public String getDirectChargesRental() {
		return directChargesRental;
	}

	public void setDirectChargesRental(String directChargesRental) {
		this.directChargesRental = directChargesRental;
	}

	public String getDirectChargesOutsideServices() {
		return directChargesOutsideServices;
	}

	public void setDirectChargesOutsideServices(String directChargesOutsideServices) {
		this.directChargesOutsideServices = directChargesOutsideServices;
	}

	public String getDirectChargesOthers() {
		return directChargesOthers;
	}

	public void setDirectChargesOthers(String directChargesOthers) {
		this.directChargesOthers = directChargesOthers;
	}

	public String getCostOfServices() {
		return costOfServices;
	}

	public void setCostOfServices(String costOfServices) {
		this.costOfServices = costOfServices;
	}

	public String getTotalCostOfSalesServices() {
		return totalCostOfSalesServices;
	}

	public void setTotalCostOfSalesServices(String totalCostOfSalesServices) {
		this.totalCostOfSalesServices = totalCostOfSalesServices;
	}

	 

	public String getOtherTaxIncomeDescription1() {
		return otherTaxIncomeDescription1;
	}

	public void setOtherTaxIncomeDescription1(String otherTaxIncomeDescription1) {
		this.otherTaxIncomeDescription1 = otherTaxIncomeDescription1;
	}

	public String getOtherTaxIncomeDescription2() {
		return otherTaxIncomeDescription2;
	}

	public void setOtherTaxIncomeDescription2(String otherTaxIncomeDescription2) {
		this.otherTaxIncomeDescription2 = otherTaxIncomeDescription2;
	}

	public String getOtherTaxIncomeDescription3() {
		return otherTaxIncomeDescription3;
	}

	public void setOtherTaxIncomeDescription3(String otherTaxIncomeDescription3) {
		this.otherTaxIncomeDescription3 = otherTaxIncomeDescription3;
	}

	public String getOtherTaxIncomeAmount1() {
		return otherTaxIncomeAmount1;
	}

	public void setOtherTaxIncomeAmount1(String otherTaxIncomeAmount1) {
		this.otherTaxIncomeAmount1 = otherTaxIncomeAmount1;
	}

	public String getOtherTaxIncomeAmount2() {
		return otherTaxIncomeAmount2;
	}

	public void setOtherTaxIncomeAmount2(String otherTaxIncomeAmount2) {
		this.otherTaxIncomeAmount2 = otherTaxIncomeAmount2;
	}

	public String getOtherTaxIncomeAmount3() {
		return otherTaxIncomeAmount3;
	}

	public void setOtherTaxIncomeAmount3(String otherTaxIncomeAmount3) {
		this.otherTaxIncomeAmount3 = otherTaxIncomeAmount3;
	}

	public String getTotalOtherTaxableIncomeNotSubjectedToFinalTax() {
		return totalOtherTaxableIncomeNotSubjectedToFinalTax;
	}

	public void setTotalOtherTaxableIncomeNotSubjectedToFinalTax(
			String totalOtherTaxableIncomeNotSubjectedToFinalTax) {
		this.totalOtherTaxableIncomeNotSubjectedToFinalTax = totalOtherTaxableIncomeNotSubjectedToFinalTax;
	}

	public String getAdvertisingAndPromotions() {
		return advertisingAndPromotions;
	}

	public void setAdvertisingAndPromotions(String advertisingAndPromotions) {
		this.advertisingAndPromotions = advertisingAndPromotions;
	}

	public String getAmortizationsDescription1() {
		return amortizationsDescription1;
	}

	public void setAmortizationsDescription1(String amortizationsDescription1) {
		this.amortizationsDescription1 = amortizationsDescription1;
	}

	public String getAmortizationsDescription2() {
		return amortizationsDescription2;
	}

	public void setAmortizationsDescription2(String amortizationsDescription2) {
		this.amortizationsDescription2 = amortizationsDescription2;
	}

	public String getAmortizationsDescription3() {
		return amortizationsDescription3;
	}

	public void setAmortizationsDescription3(String amortizationsDescription3) {
		this.amortizationsDescription3 = amortizationsDescription3;
	}

	public String getAmortizationsAmount1() {
		return amortizationsAmount1;
	}

	public void setAmortizationsAmount1(String amortizationsAmount1) {
		this.amortizationsAmount1 = amortizationsAmount1;
	}

	public String getAmortizationsAmount2() {
		return amortizationsAmount2;
	}

	public void setAmortizationsAmount2(String amortizationsAmount2) {
		this.amortizationsAmount2 = amortizationsAmount2;
	}

	public String getAmortizationsAmount3() {
		return amortizationsAmount3;
	}

	public void setAmortizationsAmount3(String amortizationsAmount3) {
		this.amortizationsAmount3 = amortizationsAmount3;
	}

	public String getBadDebts() {
		return badDebts;
	}

	public void setBadDebts(String badDebts) {
		this.badDebts = badDebts;
	}

	public String getCharitableContributions() {
		return charitableContributions;
	}

	public void setCharitableContributions(String charitableContributions) {
		this.charitableContributions = charitableContributions;
	}

	public String getCommissions() {
		return commissions;
	}

	public void setCommissions(String commissions) {
		this.commissions = commissions;
	}

	public String getCommunicationLightAndWater() {
		return communicationLightAndWater;
	}

	public void setCommunicationLightAndWater(String communicationLightAndWater) {
		this.communicationLightAndWater = communicationLightAndWater;
	}

	public String getDepletion() {
		return depletion;
	}

	public void setDepletion(String depletion) {
		this.depletion = depletion;
	}

	public String getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(String depreciation) {
		this.depreciation = depreciation;
	}

	public String getDirectorsFees() {
		return directorsFees;
	}

	public void setDirectorsFees(String directorsFees) {
		this.directorsFees = directorsFees;
	}

	public String getFringeBenefits() {
		return fringeBenefits;
	}

	public void setFringeBenefits(String fringeBenefits) {
		this.fringeBenefits = fringeBenefits;
	}

	public String getFuelAndOil() {
		return fuelAndOil;
	}

	public void setFuelAndOil(String fuelAndOil) {
		this.fuelAndOil = fuelAndOil;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getInterestSchedule4() {
		return interestSchedule4;
	}

	public void setInterestSchedule4(String interestSchedule4) {
		this.interestSchedule4 = interestSchedule4;
	}

	public String getJanitorialAndMessengerialServices() {
		return janitorialAndMessengerialServices;
	}

	public void setJanitorialAndMessengerialServices(
			String janitorialAndMessengerialServices) {
		this.janitorialAndMessengerialServices = janitorialAndMessengerialServices;
	}

	public String getLosses() {
		return losses;
	}

	public void setLosses(String losses) {
		this.losses = losses;
	}

	public String getManagementAndConsultancyFee() {
		return managementAndConsultancyFee;
	}

	public void setManagementAndConsultancyFee(String managementAndConsultancyFee) {
		this.managementAndConsultancyFee = managementAndConsultancyFee;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public String getOfficeSupplies() {
		return officeSupplies;
	}

	public void setOfficeSupplies(String officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	public String getOtherServices() {
		return otherServices;
	}

	public void setOtherServices(String otherServices) {
		this.otherServices = otherServices;
	}

	public String getProfessionalFees() {
		return professionalFees;
	}

	public void setProfessionalFees(String professionalFees) {
		this.professionalFees = professionalFees;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}

	public String getRepairsAndMaintenanceLaborOrLaborAndMaterials() {
		return repairsAndMaintenanceLaborOrLaborAndMaterials;
	}

	public void setRepairsAndMaintenanceLaborOrLaborAndMaterials(
			String repairsAndMaintenanceLaborOrLaborAndMaterials) {
		this.repairsAndMaintenanceLaborOrLaborAndMaterials = repairsAndMaintenanceLaborOrLaborAndMaterials;
	}

	public String getRepairsAndMaintenanceMaterialSupplies() {
		return repairsAndMaintenanceMaterialSupplies;
	}

	public void setRepairsAndMaintenanceMaterialSupplies(
			String repairsAndMaintenanceMaterialSupplies) {
		this.repairsAndMaintenanceMaterialSupplies = repairsAndMaintenanceMaterialSupplies;
	}

	public String getRepresentationAndEntertainment() {
		return representationAndEntertainment;
	}

	public void setRepresentationAndEntertainment(
			String representationAndEntertainment) {
		this.representationAndEntertainment = representationAndEntertainment;
	}

	public String getResearchAndDevelopment() {
		return researchAndDevelopment;
	}

	public void setResearchAndDevelopment(String researchAndDevelopment) {
		this.researchAndDevelopment = researchAndDevelopment;
	}

	public String getRoyalties() {
		return royalties;
	}

	public void setRoyalties(String royalties) {
		this.royalties = royalties;
	}

	public String getSalariesAndAllowances() {
		return salariesAndAllowances;
	}

	public void setSalariesAndAllowances(String salariesAndAllowances) {
		this.salariesAndAllowances = salariesAndAllowances;
	}

	public String getSecurityServices() {
		return securityServices;
	}

	public void setSecurityServices(String securityServices) {
		this.securityServices = securityServices;
	}

	public String getSSSGSISPhilhealthHDMFAndOtherContributions() {
		return SSSGSISPhilhealthHDMFAndOtherContributions;
	}

	public void setSSSGSISPhilhealthHDMFAndOtherContributions(
			String sSSGSISPhilhealthHDMFAndOtherContributions) {
		SSSGSISPhilhealthHDMFAndOtherContributions = sSSGSISPhilhealthHDMFAndOtherContributions;
	}

	public String getTaxesAndLicenses() {
		return taxesAndLicenses;
	}

	public void setTaxesAndLicenses(String taxesAndLicenses) {
		this.taxesAndLicenses = taxesAndLicenses;
	}

	public String getTollingFees() {
		return tollingFees;
	}

	public void setTollingFees(String tollingFees) {
		this.tollingFees = tollingFees;
	}

	public String getTrainingAndSeminars() {
		return trainingAndSeminars;
	}

	public void setTrainingAndSeminars(String trainingAndSeminars) {
		this.trainingAndSeminars = trainingAndSeminars;
	}

	public String getTranspotationAndTravel() {
		return transpotationAndTravel;
	}

	public void setTranspotationAndTravel(String transpotationAndTravel) {
		this.transpotationAndTravel = transpotationAndTravel;
	}

	public String getOthersDescription1() {
		return othersDescription1;
	}

	public void setOthersDescription1(String othersDescription1) {
		this.othersDescription1 = othersDescription1;
	}

	public String getOthersDescription2() {
		return othersDescription2;
	}

	public void setOthersDescription2(String othersDescription2) {
		this.othersDescription2 = othersDescription2;
	}

	public String getOthersDescription3() {
		return othersDescription3;
	}

	public void setOthersDescription3(String othersDescription3) {
		this.othersDescription3 = othersDescription3;
	}

	public String getOthersDescription4() {
		return othersDescription4;
	}

	public void setOthersDescription4(String othersDescription4) {
		this.othersDescription4 = othersDescription4;
	}

	public String getOthersAmount1() {
		return othersAmount1;
	}

	public void setOthersAmount1(String othersAmount1) {
		this.othersAmount1 = othersAmount1;
	}

	public String getOthersAmount2() {
		return othersAmount2;
	}

	public void setOthersAmount2(String othersAmount2) {
		this.othersAmount2 = othersAmount2;
	}

	public String getOthersAmount3() {
		return othersAmount3;
	}

	public void setOthersAmount3(String othersAmount3) {
		this.othersAmount3 = othersAmount3;
	}

	public String getOthersAmount4() {
		return othersAmount4;
	}

	public void setOthersAmount4(String othersAmount4) {
		this.othersAmount4 = othersAmount4;
	}

	public String getTotalOrdinaryAllowableItemizedDeductions() {
		return totalOrdinaryAllowableItemizedDeductions;
	}

	public void setTotalOrdinaryAllowableItemizedDeductions(
			String totalOrdinaryAllowableItemizedDeductions) {
		this.totalOrdinaryAllowableItemizedDeductions = totalOrdinaryAllowableItemizedDeductions;
	}

	public String getSpecialAllowableItemizedDeductionsDescription1() {
		return specialAllowableItemizedDeductionsDescription1;
	}

	public void setSpecialAllowableItemizedDeductionsDescription1(
			String specialAllowableItemizedDeductionsDescription1) {
		this.specialAllowableItemizedDeductionsDescription1 = specialAllowableItemizedDeductionsDescription1;
	}

	public String getSpecialAllowableItemizedDeductionsDescription2() {
		return specialAllowableItemizedDeductionsDescription2;
	}

	public void setSpecialAllowableItemizedDeductionsDescription2(
			String specialAllowableItemizedDeductionsDescription2) {
		this.specialAllowableItemizedDeductionsDescription2 = specialAllowableItemizedDeductionsDescription2;
	}

	public String getSpecialAllowableItemizedDeductionsDescription3() {
		return specialAllowableItemizedDeductionsDescription3;
	}

	public void setSpecialAllowableItemizedDeductionsDescription3(
			String specialAllowableItemizedDeductionsDescription3) {
		this.specialAllowableItemizedDeductionsDescription3 = specialAllowableItemizedDeductionsDescription3;
	}

	public String getSpecialAllowableItemizedDeductionsDescription4() {
		return specialAllowableItemizedDeductionsDescription4;
	}

	public void setSpecialAllowableItemizedDeductionsDescription4(
			String specialAllowableItemizedDeductionsDescription4) {
		this.specialAllowableItemizedDeductionsDescription4 = specialAllowableItemizedDeductionsDescription4;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis1() {
		return specialAllowableItemizedDeductionsLegalBasis1;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis1(
			String specialAllowableItemizedDeductionsLegalBasis1) {
		this.specialAllowableItemizedDeductionsLegalBasis1 = specialAllowableItemizedDeductionsLegalBasis1;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis2() {
		return specialAllowableItemizedDeductionsLegalBasis2;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis2(
			String specialAllowableItemizedDeductionsLegalBasis2) {
		this.specialAllowableItemizedDeductionsLegalBasis2 = specialAllowableItemizedDeductionsLegalBasis2;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis3() {
		return specialAllowableItemizedDeductionsLegalBasis3;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis3(
			String specialAllowableItemizedDeductionsLegalBasis3) {
		this.specialAllowableItemizedDeductionsLegalBasis3 = specialAllowableItemizedDeductionsLegalBasis3;
	}

	public String getSpecialAllowableItemizedDeductionsLegalBasis4() {
		return specialAllowableItemizedDeductionsLegalBasis4;
	}

	public void setSpecialAllowableItemizedDeductionsLegalBasis4(
			String specialAllowableItemizedDeductionsLegalBasis4) {
		this.specialAllowableItemizedDeductionsLegalBasis4 = specialAllowableItemizedDeductionsLegalBasis4;
	}

	public String getSpecialAllowableItemizedDeductionsAmount1() {
		return specialAllowableItemizedDeductionsAmount1;
	}

	public void setSpecialAllowableItemizedDeductionsAmount1(
			String specialAllowableItemizedDeductionsAmount1) {
		this.specialAllowableItemizedDeductionsAmount1 = specialAllowableItemizedDeductionsAmount1;
	}

	public String getSpecialAllowableItemizedDeductionsAmount2() {
		return specialAllowableItemizedDeductionsAmount2;
	}

	public void setSpecialAllowableItemizedDeductionsAmount2(
			String specialAllowableItemizedDeductionsAmount2) {
		this.specialAllowableItemizedDeductionsAmount2 = specialAllowableItemizedDeductionsAmount2;
	}

	public String getSpecialAllowableItemizedDeductionsAmount3() {
		return specialAllowableItemizedDeductionsAmount3;
	}

	public void setSpecialAllowableItemizedDeductionsAmount3(
			String specialAllowableItemizedDeductionsAmount3) {
		this.specialAllowableItemizedDeductionsAmount3 = specialAllowableItemizedDeductionsAmount3;
	}

	public String getSpecialAllowableItemizedDeductionsAmount4() {
		return specialAllowableItemizedDeductionsAmount4;
	}

	public void setSpecialAllowableItemizedDeductionsAmount4(
			String specialAllowableItemizedDeductionsAmount4) {
		this.specialAllowableItemizedDeductionsAmount4 = specialAllowableItemizedDeductionsAmount4;
	}

	public String getTotalSpecialAllowableItemizedDeductions() {
		return totalSpecialAllowableItemizedDeductions;
	}

	public void setTotalSpecialAllowableItemizedDeductions(
			String totalSpecialAllowableItemizedDeductions) {
		this.totalSpecialAllowableItemizedDeductions = totalSpecialAllowableItemizedDeductions;
	}

	public String getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(String grossIncome) {
		this.grossIncome = grossIncome;
	}

	public String getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw() {
		return lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw;
	}

	public void setLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw(
			String lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw) {
		this.lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw;
	}

	public String getNetOperatingLoss() {
		return netOperatingLoss;
	}

	public void setNetOperatingLoss(String netOperatingLoss) {
		this.netOperatingLoss = netOperatingLoss;
	}

	public List<OperatingLoss> getSched6OperatingLoss() {
		return sched6OperatingLoss;
	}

	public void setSched6OperatingLoss(List<OperatingLoss> sched6OperatingLoss) {
		this.sched6OperatingLoss = sched6OperatingLoss;
	}

	public String getNetOperatingLossYearIncurred1() {
		return netOperatingLossYearIncurred1;
	}

	public void setNetOperatingLossYearIncurred1(
			String netOperatingLossYearIncurred1) {
		this.netOperatingLossYearIncurred1 = netOperatingLossYearIncurred1;
	}

	public String getNetOperatingLossYearIncurred2() {
		return netOperatingLossYearIncurred2;
	}

	public void setNetOperatingLossYearIncurred2(
			String netOperatingLossYearIncurred2) {
		this.netOperatingLossYearIncurred2 = netOperatingLossYearIncurred2;
	}

	public String getNetOperatingLossYearIncurred3() {
		return netOperatingLossYearIncurred3;
	}

	public void setNetOperatingLossYearIncurred3(
			String netOperatingLossYearIncurred3) {
		this.netOperatingLossYearIncurred3 = netOperatingLossYearIncurred3;
	}

	public String getNetOperatingLossYearIncurred4() {
		return netOperatingLossYearIncurred4;
	}

	public void setNetOperatingLossYearIncurred4(
			String netOperatingLossYearIncurred4) {
		this.netOperatingLossYearIncurred4 = netOperatingLossYearIncurred4;
	}

	public String getNetOperatingLossAmount1() {
		return netOperatingLossAmount1;
	}

	public void setNetOperatingLossAmount1(String netOperatingLossAmount1) {
		this.netOperatingLossAmount1 = netOperatingLossAmount1;
	}

	public String getNetOperatingLossAmount2() {
		return netOperatingLossAmount2;
	}

	public void setNetOperatingLossAmount2(String netOperatingLossAmount2) {
		this.netOperatingLossAmount2 = netOperatingLossAmount2;
	}

	public String getNetOperatingLossAmount3() {
		return netOperatingLossAmount3;
	}

	public void setNetOperatingLossAmount3(String netOperatingLossAmount3) {
		this.netOperatingLossAmount3 = netOperatingLossAmount3;
	}

	public String getNetOperatingLossAmount4() {
		return netOperatingLossAmount4;
	}

	public void setNetOperatingLossAmount4(String netOperatingLossAmount4) {
		this.netOperatingLossAmount4 = netOperatingLossAmount4;
	}

	public String getNOLCOAppliedPreviousYear1() {
		return NOLCOAppliedPreviousYear1;
	}

	public void setNOLCOAppliedPreviousYear1(String nOLCOAppliedPreviousYear1) {
		NOLCOAppliedPreviousYear1 = nOLCOAppliedPreviousYear1;
	}

	public String getNOLCOAppliedPreviousYear2() {
		return NOLCOAppliedPreviousYear2;
	}

	public void setNOLCOAppliedPreviousYear2(String nOLCOAppliedPreviousYear2) {
		NOLCOAppliedPreviousYear2 = nOLCOAppliedPreviousYear2;
	}

	public String getNOLCOAppliedPreviousYear3() {
		return NOLCOAppliedPreviousYear3;
	}

	public void setNOLCOAppliedPreviousYear3(String nOLCOAppliedPreviousYear3) {
		NOLCOAppliedPreviousYear3 = nOLCOAppliedPreviousYear3;
	}

	public String getNOLCOAppliedPreviousYear4() {
		return NOLCOAppliedPreviousYear4;
	}

	public void setNOLCOAppliedPreviousYear4(String nOLCOAppliedPreviousYear4) {
		NOLCOAppliedPreviousYear4 = nOLCOAppliedPreviousYear4;
	}

	public String getNOLCOExpired1() {
		return NOLCOExpired1;
	}

	public void setNOLCOExpired1(String nOLCOExpired1) {
		NOLCOExpired1 = nOLCOExpired1;
	}

	public String getNOLCOExpired2() {
		return NOLCOExpired2;
	}

	public void setNOLCOExpired2(String nOLCOExpired2) {
		NOLCOExpired2 = nOLCOExpired2;
	}

	public String getNOLCOExpired3() {
		return NOLCOExpired3;
	}

	public void setNOLCOExpired3(String nOLCOExpired3) {
		NOLCOExpired3 = nOLCOExpired3;
	}

	public String getNOLCOExpired4() {
		return NOLCOExpired4;
	}

	public void setNOLCOExpired4(String nOLCOExpired4) {
		NOLCOExpired4 = nOLCOExpired4;
	}

	public String getNOLCOAppliedCurrentYear1() {
		return NOLCOAppliedCurrentYear1;
	}

	public void setNOLCOAppliedCurrentYear1(String nOLCOAppliedCurrentYear1) {
		NOLCOAppliedCurrentYear1 = nOLCOAppliedCurrentYear1;
	}

	public String getNOLCOAppliedCurrentYear2() {
		return NOLCOAppliedCurrentYear2;
	}

	public void setNOLCOAppliedCurrentYear2(String nOLCOAppliedCurrentYear2) {
		NOLCOAppliedCurrentYear2 = nOLCOAppliedCurrentYear2;
	}

	public String getNOLCOAppliedCurrentYear3() {
		return NOLCOAppliedCurrentYear3;
	}

	public void setNOLCOAppliedCurrentYear3(String nOLCOAppliedCurrentYear3) {
		NOLCOAppliedCurrentYear3 = nOLCOAppliedCurrentYear3;
	}

	public String getNOLCOAppliedCurrentYear4() {
		return NOLCOAppliedCurrentYear4;
	}

	public void setNOLCOAppliedCurrentYear4(String nOLCOAppliedCurrentYear4) {
		NOLCOAppliedCurrentYear4 = nOLCOAppliedCurrentYear4;
	}

	public String getNetOperatingLossUnapplied1() {
		return netOperatingLossUnapplied1;
	}

	public void setNetOperatingLossUnapplied1(String netOperatingLossUnapplied1) {
		this.netOperatingLossUnapplied1 = netOperatingLossUnapplied1;
	}

	public String getNetOperatingLossUnapplied2() {
		return netOperatingLossUnapplied2;
	}

	public void setNetOperatingLossUnapplied2(String netOperatingLossUnapplied2) {
		this.netOperatingLossUnapplied2 = netOperatingLossUnapplied2;
	}

	public String getNetOperatingLossUnapplied3() {
		return netOperatingLossUnapplied3;
	}

	public void setNetOperatingLossUnapplied3(String netOperatingLossUnapplied3) {
		this.netOperatingLossUnapplied3 = netOperatingLossUnapplied3;
	}

	public String getNetOperatingLossUnapplied4() {
		return netOperatingLossUnapplied4;
	}

	public void setNetOperatingLossUnapplied4(String netOperatingLossUnapplied4) {
		this.netOperatingLossUnapplied4 = netOperatingLossUnapplied4;
	}

	public String getTotalNOLCO() {
		return totalNOLCO;
	}

	public void setTotalNOLCO(String totalNOLCO) {
		this.totalNOLCO = totalNOLCO;
	}

	public String getPriorYearsExcessCreditsOtherThanMCIT() {
		return priorYearsExcessCreditsOtherThanMCIT;
	}

	public void setPriorYearsExcessCreditsOtherThanMCIT(
			String priorYearsExcessCreditsOtherThanMCIT) {
		this.priorYearsExcessCreditsOtherThanMCIT = priorYearsExcessCreditsOtherThanMCIT;
	}

	public String getIncomeTaxPaymentUnderMCIT() {
		return incomeTaxPaymentUnderMCIT;
	}

	public void setIncomeTaxPaymentUnderMCIT(String incomeTaxPaymentUnderMCIT) {
		this.incomeTaxPaymentUnderMCIT = incomeTaxPaymentUnderMCIT;
	}

	public String getIncomeTaxPaymentUnderRegularRate() {
		return incomeTaxPaymentUnderRegularRate;
	}

	public void setIncomeTaxPaymentUnderRegularRate(
			String incomeTaxPaymentUnderRegularRate) {
		this.incomeTaxPaymentUnderRegularRate = incomeTaxPaymentUnderRegularRate;
	}

	public String getExcessMCIT() {
		return excessMCIT;
	}

	public void setExcessMCIT(String excessMCIT) {
		this.excessMCIT = excessMCIT;
	}

	public String getCreditableTaxWithheldFromPrevQuarters() {
		return creditableTaxWithheldFromPrevQuarters;
	}

	public void setCreditableTaxWithheldFromPrevQuarters(
			String creditableTaxWithheldFromPrevQuarters) {
		this.creditableTaxWithheldFromPrevQuarters = creditableTaxWithheldFromPrevQuarters;
	}

	public String getCreditableTaxWithheldFromTheFourthQuarter() {
		return creditableTaxWithheldFromTheFourthQuarter;
	}

	public void setCreditableTaxWithheldFromTheFourthQuarter(
			String creditableTaxWithheldFromTheFourthQuarter) {
		this.creditableTaxWithheldFromTheFourthQuarter = creditableTaxWithheldFromTheFourthQuarter;
	}

	public String getForeignTaxCredits() {
		return foreignTaxCredits;
	}

	public void setForeignTaxCredits(String foreignTaxCredits) {
		this.foreignTaxCredits = foreignTaxCredits;
	}

	public String getTaxPaidInReturn() {
		return taxPaidInReturn;
	}

	public void setTaxPaidInReturn(String taxPaidInReturn) {
		this.taxPaidInReturn = taxPaidInReturn;
	}

	public String getSched7SpecialTaxCredits() {
		return sched7SpecialTaxCredits;
	}

	public void setSched7SpecialTaxCredits(String sched7SpecialTaxCredits) {
		this.sched7SpecialTaxCredits = sched7SpecialTaxCredits;
	}

	public String getTotalTaxCredits() {
		return totalTaxCredits;
	}

	public void setTotalTaxCredits(String totalTaxCredits) {
		this.totalTaxCredits = totalTaxCredits;
	}

	public String getTotalExcessCreditsMCIT() {
		return totalExcessCreditsMCIT;
	}

	public void setTotalExcessCreditsMCIT(String totalExcessCreditsMCIT) {
		this.totalExcessCreditsMCIT = totalExcessCreditsMCIT;
	}

	public String getNetIncomeLossPerBooks() {
		return netIncomeLossPerBooks;
	}

	public void setNetIncomeLossPerBooks(String netIncomeLossPerBooks) {
		this.netIncomeLossPerBooks = netIncomeLossPerBooks;
	}

	public String getTotalNonDeductibleExpenses() {
		return totalNonDeductibleExpenses;
	}

	public void setTotalNonDeductibleExpenses(String totalNonDeductibleExpenses) {
		this.totalNonDeductibleExpenses = totalNonDeductibleExpenses;
	}

	public String getTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions() {
		return totalNonTaxableAndFinalTaxIncomeWithSpecialDeductions;
	}

	public void setTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions(
			String totalNonTaxableAndFinalTaxIncomeWithSpecialDeductions) {
		this.totalNonTaxableAndFinalTaxIncomeWithSpecialDeductions = totalNonTaxableAndFinalTaxIncomeWithSpecialDeductions;
	}

	public String getSched9NetTaxableIncome() {
		return sched9NetTaxableIncome;
	}

	public void setSched9NetTaxableIncome(String sched9NetTaxableIncome) {
		this.sched9NetTaxableIncome = sched9NetTaxableIncome;
	}

	public String getNonDeductibleExpenses() {
		return nonDeductibleExpenses;
	}

	public void setNonDeductibleExpenses(String nonDeductibleExpenses) {
		this.nonDeductibleExpenses = nonDeductibleExpenses;
	}

	public String getNonDeductibleExpensesAmount() {
		return nonDeductibleExpensesAmount;
	}

	public void setNonDeductibleExpensesAmount(String nonDeductibleExpensesAmount) {
		this.nonDeductibleExpensesAmount = nonDeductibleExpensesAmount;
	}

	public String getNonTaxable() {
		return nonTaxable;
	}

	public void setNonTaxable(String nonTaxable) {
		this.nonTaxable = nonTaxable;
	}

	public String getNonTaxableAmount() {
		return nonTaxableAmount;
	}

	public void setNonTaxableAmount(String nonTaxableAmount) {
		this.nonTaxableAmount = nonTaxableAmount;
	}

	public String getSpecialDeductions() {
		return specialDeductions;
	}

	public void setSpecialDeductions(String specialDeductions) {
		this.specialDeductions = specialDeductions;
	}

	public String getSpecialDeductionsAmount() {
		return specialDeductionsAmount;
	}

	public void setSpecialDeductionsAmount(String specialDeductionsAmount) {
		this.specialDeductionsAmount = specialDeductionsAmount;
	}

	public String getCurrentAssets() {
		return currentAssets;
	}

	public void setCurrentAssets(String currentAssets) {
		this.currentAssets = currentAssets;
	}

	public String getLongTermInvestment() {
		return longTermInvestment;
	}

	public void setLongTermInvestment(String longTermInvestment) {
		this.longTermInvestment = longTermInvestment;
	}

	public String getNetPropertyPlantAndEquipment() {
		return netPropertyPlantAndEquipment;
	}

	public void setNetPropertyPlantAndEquipment(String netPropertyPlantAndEquipment) {
		this.netPropertyPlantAndEquipment = netPropertyPlantAndEquipment;
	}

	public String getLongTermReceivables() {
		return longTermReceivables;
	}

	public void setLongTermReceivables(String longTermReceivables) {
		this.longTermReceivables = longTermReceivables;
	}

	public String getIntangibleAssets() {
		return intangibleAssets;
	}

	public void setIntangibleAssets(String intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}

	public String getOtherAssets() {
		return otherAssets;
	}

	public void setOtherAssets(String otherAssets) {
		this.otherAssets = otherAssets;
	}

	public String getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(String totalAssets) {
		this.totalAssets = totalAssets;
	}

	public String getCurrentLiabilities() {
		return currentLiabilities;
	}

	public void setCurrentLiabilities(String currentLiabilities) {
		this.currentLiabilities = currentLiabilities;
	}

	public String getLongTermLiabilities() {
		return longTermLiabilities;
	}

	public void setLongTermLiabilities(String longTermLiabilities) {
		this.longTermLiabilities = longTermLiabilities;
	}

	public String getDeferredCredits() {
		return deferredCredits;
	}

	public void setDeferredCredits(String deferredCredits) {
		this.deferredCredits = deferredCredits;
	}

	public String getOtherLiabilities() {
		return otherLiabilities;
	}

	public void setOtherLiabilities(String otherLiabilities) {
		this.otherLiabilities = otherLiabilities;
	}

	public String getTotalLiabilities() {
		return totalLiabilities;
	}

	public void setTotalLiabilities(String totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	public String getCapitalStock() {
		return capitalStock;
	}

	public void setCapitalStock(String capitalStock) {
		this.capitalStock = capitalStock;
	}

	public String getAdditionalPaidInCapital() {
		return additionalPaidInCapital;
	}

	public void setAdditionalPaidInCapital(String additionalPaidInCapital) {
		this.additionalPaidInCapital = additionalPaidInCapital;
	}

	public String getRetainedEarnings() {
		return retainedEarnings;
	}

	public void setRetainedEarnings(String retainedEarnings) {
		this.retainedEarnings = retainedEarnings;
	}

	public String getTotalEquity() {
		return totalEquity;
	}

	public void setTotalEquity(String totalEquity) {
		this.totalEquity = totalEquity;
	}

	public String getTotalLiabilitiesAndEquity() {
		return totalLiabilitiesAndEquity;
	}

	public void setTotalLiabilitiesAndEquity(String totalLiabilitiesAndEquity) {
		this.totalLiabilitiesAndEquity = totalLiabilitiesAndEquity;
	}

	public String getCapitalContributorType() {
		return capitalContributorType;
	}

	public void setCapitalContributorType(String capitalContributorType) {
		this.capitalContributorType = capitalContributorType;
	}

	public Date getCashBankDebitMemoDate() {
		return cashBankDebitMemoDate;
	}

	public void setCashBankDebitMemoDate(Date cashBankDebitMemoDate) {
		this.cashBankDebitMemoDate = cashBankDebitMemoDate;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Date getTaxDebitMemoDate() {
		return taxDebitMemoDate;
	}

	public void setTaxDebitMemoDate(Date taxDebitMemoDate) {
		this.taxDebitMemoDate = taxDebitMemoDate;
	}

	public boolean isAtcSelectionSelectDisabled() {
		return atcSelectionSelectDisabled;
	}

	public void setAtcSelectionSelectDisabled(boolean atcSelectionSelectDisabled) {
		this.atcSelectionSelectDisabled = atcSelectionSelectDisabled;
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

	public Date getCtcDateIssue() {
		return ctcDateIssue;
	}

	public void setCtcDateIssue(Date ctcDateIssue) {
		this.ctcDateIssue = ctcDateIssue;
	}
	
	public Date getOthersDate() {
		return othersDate;
	}

	public void setOthersDate(Date othersDate) {
		this.othersDate = othersDate;
	}
	
	public List<MinimumCorporateIncomeTax> getSched8AdditionalAttachments() {
		return sched8AdditionalAttachments;
	}

	public void setSched8AdditionalAttachments(
			List<MinimumCorporateIncomeTax> sched8AdditionalAttachments) {
		this.sched8AdditionalAttachments = sched8AdditionalAttachments;
	}

	public List<OtherExpandable> getSched3AdditionalAttachments() {
		return sched3AdditionalAttachments;
	}

	public void setSched3AdditionalAttachments(
			List<OtherExpandable> sched3AdditionalAttachments) {
		this.sched3AdditionalAttachments = sched3AdditionalAttachments;
	}

	public List<OtherExpandable> getSched4AdditionalAttachments1() {
		return sched4AdditionalAttachments1;
	}

	public void setSched4AdditionalAttachments1(
			List<OtherExpandable> sched4AdditionalAttachments1) {
		this.sched4AdditionalAttachments1 = sched4AdditionalAttachments1;
	}

	public List<OtherExpandable> getSched4AdditionalAttachments2() {
		return sched4AdditionalAttachments2;
	}

	public void setSched4AdditionalAttachments2(
			List<OtherExpandable> sched4AdditionalAttachments2) {
		this.sched4AdditionalAttachments2 = sched4AdditionalAttachments2;
	}

	public List<OtherExpandable> getSched7AdditionalAttachments() {
		return sched7AdditionalAttachments;
	}

	public void setSched7AdditionalAttachments(
			List<OtherExpandable> sched7AdditionalAttachments) {
		this.sched7AdditionalAttachments = sched7AdditionalAttachments;
	}

	public List<OtherExpandable> getSched9AdditionalAttachments1() {
		return sched9AdditionalAttachments1;
	}

	public void setSched9AdditionalAttachments1(
			List<OtherExpandable> sched9AdditionalAttachments1) {
		this.sched9AdditionalAttachments1 = sched9AdditionalAttachments1;
	}

	public List<OtherExpandable> getSched9AdditionalAttachments2() {
		return sched9AdditionalAttachments2;
	}

	public void setSched9AdditionalAttachments2(
			List<OtherExpandable> sched9AdditionalAttachments2) {
		this.sched9AdditionalAttachments2 = sched9AdditionalAttachments2;
	}

	public List<OtherExpandable> getSched9AdditionalAttachments3() {
		return sched9AdditionalAttachments3;
	}

	public void setSched9AdditionalAttachments3(
			List<OtherExpandable> sched9AdditionalAttachments3) {
		this.sched9AdditionalAttachments3 = sched9AdditionalAttachments3;
	}

	public List<SpecialAllowableItemizedDeductions> getSched5AdditionalAttachments() {
		return sched5AdditionalAttachments;
	}

	public void setSched5AdditionalAttachments(
			List<SpecialAllowableItemizedDeductions> sched5AdditionalAttachments) {
		this.sched5AdditionalAttachments = sched5AdditionalAttachments;
	}
	
	public boolean isYearEndedMonthDisabled() {
		return yearEndedMonthDisabled;
	}

	public void setYearEndedMonthDisabled(boolean yearEndedMonthDisabled) {
		this.yearEndedMonthDisabled = yearEndedMonthDisabled;
	}

	public String getOtherCreditsPaymentsDescription1() {
		return otherCreditsPaymentsDescription1;
	}

	public void setOtherCreditsPaymentsDescription1(
			String otherCreditsPaymentsDescription1) {
		this.otherCreditsPaymentsDescription1 = otherCreditsPaymentsDescription1;
	}

	public String getOtherCreditsPaymentsAmount1() {
		return otherCreditsPaymentsAmount1;
	}

	public void setOtherCreditsPaymentsAmount1(String otherCreditsPaymentsAmount1) {
		this.otherCreditsPaymentsAmount1 = otherCreditsPaymentsAmount1;
	}

	public String getOtherCreditsPaymentsDescription2() {
		return otherCreditsPaymentsDescription2;
	}

	public void setOtherCreditsPaymentsDescription2(
			String otherCreditsPaymentsDescription2) {
		this.otherCreditsPaymentsDescription2 = otherCreditsPaymentsDescription2;
	}

	public String getOtherCreditsPaymentsAmount2() {
		return otherCreditsPaymentsAmount2;
	}

	public void setOtherCreditsPaymentsAmount2(String otherCreditsPaymentsAmount2) {
		this.otherCreditsPaymentsAmount2 = otherCreditsPaymentsAmount2;
	}

	public String getMcitYear1() {
		return mcitYear1;
	}

	public void setMcitYear1(String mcitYear1) {
		this.mcitYear1 = mcitYear1;
	}

	public String getNormalIncomeTax1() {
		return normalIncomeTax1;
	}

	public void setNormalIncomeTax1(String normalIncomeTax1) {
		this.normalIncomeTax1 = normalIncomeTax1;
	}

	public String getMcit1() {
		return mcit1;
	}

	public void setMcit1(String mcit1) {
		this.mcit1 = mcit1;
	}

	public String getExcessMCITOverNormalTax1() {
		return excessMCITOverNormalTax1;
	}

	public void setExcessMCITOverNormalTax1(String excessMCITOverNormalTax1) {
		this.excessMCITOverNormalTax1 = excessMCITOverNormalTax1;
	}

	public String getExcessMCITAppliedPreviously1() {
		return excessMCITAppliedPreviously1;
	}

	public void setExcessMCITAppliedPreviously1(String excessMCITAppliedPreviously1) {
		this.excessMCITAppliedPreviously1 = excessMCITAppliedPreviously1;
	}

	public String getExpiredPortionOfExcessMCIT1() {
		return expiredPortionOfExcessMCIT1;
	}

	public void setExpiredPortionOfExcessMCIT1(String expiredPortionOfExcessMCIT1) {
		this.expiredPortionOfExcessMCIT1 = expiredPortionOfExcessMCIT1;
	}

	public String getExcessMCITAppliedCurrently1() {
		return excessMCITAppliedCurrently1;
	}

	public void setExcessMCITAppliedCurrently1(String excessMCITAppliedCurrently1) {
		this.excessMCITAppliedCurrently1 = excessMCITAppliedCurrently1;
	}

	public String getBalanceOfExcessMCIT1() {
		return balanceOfExcessMCIT1;
	}

	public void setBalanceOfExcessMCIT1(String balanceOfExcessMCIT1) {
		this.balanceOfExcessMCIT1 = balanceOfExcessMCIT1;
	}

	public String getMcitYear2() {
		return mcitYear2;
	}

	public void setMcitYear2(String mcitYear2) {
		this.mcitYear2 = mcitYear2;
	}

	public String getNormalIncomeTax2() {
		return normalIncomeTax2;
	}

	public void setNormalIncomeTax2(String normalIncomeTax2) {
		this.normalIncomeTax2 = normalIncomeTax2;
	}

	public String getMcit2() {
		return mcit2;
	}

	public void setMcit2(String mcit2) {
		this.mcit2 = mcit2;
	}

	public String getExcessMCITOverNormalTax2() {
		return excessMCITOverNormalTax2;
	}

	public void setExcessMCITOverNormalTax2(String excessMCITOverNormalTax2) {
		this.excessMCITOverNormalTax2 = excessMCITOverNormalTax2;
	}

	public String getExcessMCITAppliedPreviously2() {
		return excessMCITAppliedPreviously2;
	}

	public void setExcessMCITAppliedPreviously2(String excessMCITAppliedPreviously2) {
		this.excessMCITAppliedPreviously2 = excessMCITAppliedPreviously2;
	}

	public String getExpiredPortionOfExcessMCIT2() {
		return expiredPortionOfExcessMCIT2;
	}

	public void setExpiredPortionOfExcessMCIT2(String expiredPortionOfExcessMCIT2) {
		this.expiredPortionOfExcessMCIT2 = expiredPortionOfExcessMCIT2;
	}

	public String getExcessMCITAppliedCurrently2() {
		return excessMCITAppliedCurrently2;
	}

	public void setExcessMCITAppliedCurrently2(String excessMCITAppliedCurrently2) {
		this.excessMCITAppliedCurrently2 = excessMCITAppliedCurrently2;
	}

	public String getBalanceOfExcessMCIT2() {
		return balanceOfExcessMCIT2;
	}

	public void setBalanceOfExcessMCIT2(String balanceOfExcessMCIT2) {
		this.balanceOfExcessMCIT2 = balanceOfExcessMCIT2;
	}

	public String getMcitYear3() {
		return mcitYear3;
	}

	public void setMcitYear3(String mcitYear3) {
		this.mcitYear3 = mcitYear3;
	}

	public String getNormalIncomeTax3() {
		return normalIncomeTax3;
	}

	public void setNormalIncomeTax3(String normalIncomeTax3) {
		this.normalIncomeTax3 = normalIncomeTax3;
	}

	public String getMcit3() {
		return mcit3;
	}

	public void setMcit3(String mcit3) {
		this.mcit3 = mcit3;
	}

	public String getExcessMCITOverNormalTax3() {
		return excessMCITOverNormalTax3;
	}

	public void setExcessMCITOverNormalTax3(String excessMCITOverNormalTax3) {
		this.excessMCITOverNormalTax3 = excessMCITOverNormalTax3;
	}

	public String getExcessMCITAppliedPreviously3() {
		return excessMCITAppliedPreviously3;
	}

	public void setExcessMCITAppliedPreviously3(String excessMCITAppliedPreviously3) {
		this.excessMCITAppliedPreviously3 = excessMCITAppliedPreviously3;
	}

	public String getExpiredPortionOfExcessMCIT3() {
		return expiredPortionOfExcessMCIT3;
	}

	public void setExpiredPortionOfExcessMCIT3(String expiredPortionOfExcessMCIT3) {
		this.expiredPortionOfExcessMCIT3 = expiredPortionOfExcessMCIT3;
	}

	public String getExcessMCITAppliedCurrently3() {
		return excessMCITAppliedCurrently3;
	}

	public void setExcessMCITAppliedCurrently3(String excessMCITAppliedCurrently3) {
		this.excessMCITAppliedCurrently3 = excessMCITAppliedCurrently3;
	}

	public String getBalanceOfExcessMCIT3() {
		return balanceOfExcessMCIT3;
	}

	public void setBalanceOfExcessMCIT3(String balanceOfExcessMCIT3) {
		this.balanceOfExcessMCIT3 = balanceOfExcessMCIT3;
	}

	public String getNonDeductibleExpenses2() {
		return nonDeductibleExpenses2;
	}

	public void setNonDeductibleExpenses2(String nonDeductibleExpenses2) {
		this.nonDeductibleExpenses2 = nonDeductibleExpenses2;
	}

	public String getNonDeductibleExpensesAmount2() {
		return nonDeductibleExpensesAmount2;
	}

	public void setNonDeductibleExpensesAmount2(String nonDeductibleExpensesAmount2) {
		this.nonDeductibleExpensesAmount2 = nonDeductibleExpensesAmount2;
	}

	public String getNonTaxable2() {
		return nonTaxable2;
	}

	public void setNonTaxable2(String nonTaxable2) {
		this.nonTaxable2 = nonTaxable2;
	}

	public String getNonTaxableAmount2() {
		return nonTaxableAmount2;
	}

	public void setNonTaxableAmount2(String nonTaxableAmount2) {
		this.nonTaxableAmount2 = nonTaxableAmount2;
	}

	public String getSpecialDeductions2() {
		return specialDeductions2;
	}

	public void setSpecialDeductions2(String specialDeductions2) {
		this.specialDeductions2 = specialDeductions2;
	}

	public String getSpecialDeductionsAmount2() {
		return specialDeductionsAmount2;
	}

	public void setSpecialDeductionsAmount2(String specialDeductionsAmount2) {
		this.specialDeductionsAmount2 = specialDeductionsAmount2;
	}

	public boolean isOrdinaryAllowableItemizedDeductionsDisabled() {
		return ordinaryAllowableItemizedDeductionsDisabled;
	}

	public void setOrdinaryAllowableItemizedDeductionsDisabled(
			boolean ordinaryAllowableItemizedDeductionsDisabled) {
		this.ordinaryAllowableItemizedDeductionsDisabled = ordinaryAllowableItemizedDeductionsDisabled;
	}

	public boolean isSpecialAllowableItemizedDeductions36Disabled() {
		return specialAllowableItemizedDeductions36Disabled;
	}

	public void setSpecialAllowableItemizedDeductions36Disabled(
			boolean specialAllowableItemizedDeductions36Disabled) {
		this.specialAllowableItemizedDeductions36Disabled = specialAllowableItemizedDeductions36Disabled;
	}
	
	public List<StockholdersPartners> getSched11AdditionalAttachments() {
		return sched11AdditionalAttachments;
	}

	public void setSched11AdditionalAttachments(
			List<StockholdersPartners> sched11AdditionalAttachments) {
		this.sched11AdditionalAttachments = sched11AdditionalAttachments;
	}

	public Date getBirAccreditationIssueDate() {
		return birAccreditationIssueDate;
	}

	public void setBirAccreditationIssueDate(Date birAccreditationIssueDate) {
		this.birAccreditationIssueDate = birAccreditationIssueDate;
	}

	public Date getBirAccreditationExpiryDate() {
		return birAccreditationExpiryDate;
	}

	public void setBirAccreditationExpiryDate(Date birAccreditationExpiryDate) {
		this.birAccreditationExpiryDate = birAccreditationExpiryDate;
	}
	
	public String getUserTin(){
		StringBuilder sb = new StringBuilder();
		sb.append(getTinA());
		sb.append(getTinB());
		sb.append(getTinC());
		
		return sb.toString();
	}

	public boolean getNolcoDisabled() {
		return nolcoDisabled;
	}

	public void setNolcoDisabled(boolean nolcoDisabled) {
		this.nolcoDisabled = nolcoDisabled;
	}

	public boolean getOptionalStandardDeductionsDisabled() {
		return optionalStandardDeductionsDisabled;
	}

	public void setOptionalStandardDeductionsDisabled(
			boolean optionalStandardDeductionsDisabled) {
		this.optionalStandardDeductionsDisabled = optionalStandardDeductionsDisabled;
	}

	public boolean getSchedule4Disabled() {
		return schedule4Disabled;
	}

	public void setSchedule4Disabled(boolean schedule4Disabled) {
		this.schedule4Disabled = schedule4Disabled;
	}

	public boolean getSchedule5Disabled() {
		return schedule5Disabled;
	}

	public void setSchedule5Disabled(boolean schedule5Disabled) {
		this.schedule5Disabled = schedule5Disabled;
	}

	public String getExemptInterest() {
		return exemptInterest;
	}

	public void setExemptInterest(String exemptInterest) {
		this.exemptInterest = exemptInterest;
	}

	public String getExemptRoyalties() {
		return exemptRoyalties;
	}

	public void setExemptRoyalties(String exemptRoyalties) {
		this.exemptRoyalties = exemptRoyalties;
	}

	public String getExemptDividends() {
		return exemptDividends;
	}

	public void setExemptDividends(String exemptDividends) {
		this.exemptDividends = exemptDividends;
	}

	public String getExemptPrizesWinnings() {
		return exemptPrizesWinnings;
	}

	public void setExemptPrizesWinnings(String exemptPrizesWinnings) {
		this.exemptPrizesWinnings = exemptPrizesWinnings;
	}

	public String getFairMarketValueInterest() {
		return fairMarketValueInterest;
	}

	public void setFairMarketValueInterest(String fairMarketValueInterest) {
		this.fairMarketValueInterest = fairMarketValueInterest;
	}

	public String getFairMarketValueRoyalties() {
		return fairMarketValueRoyalties;
	}

	public void setFairMarketValueRoyalties(String fairMarketValueRoyalties) {
		this.fairMarketValueRoyalties = fairMarketValueRoyalties;
	}

	public String getFairMarketValueDividends() {
		return fairMarketValueDividends;
	}

	public void setFairMarketValueDividends(String fairMarketValueDividends) {
		this.fairMarketValueDividends = fairMarketValueDividends;
	}

	public String getFairMarketValuePrizesWinnings() {
		return fairMarketValuePrizesWinnings;
	}

	public void setFairMarketValuePrizesWinnings(
			String fairMarketValuePrizesWinnings) {
		this.fairMarketValuePrizesWinnings = fairMarketValuePrizesWinnings;
	}

	public String getFinalTaxWthldInterest() {
		return finalTaxWthldInterest;
	}

	public void setFinalTaxWthldInterest(String finalTaxWthldInterest) {
		this.finalTaxWthldInterest = finalTaxWthldInterest;
	}

	public String getFinalTaxWthldRoyalties() {
		return finalTaxWthldRoyalties;
	}

	public void setFinalTaxWthldRoyalties(String finalTaxWthldRoyalties) {
		this.finalTaxWthldRoyalties = finalTaxWthldRoyalties;
	}

	public String getFinalTaxWthldDividends() {
		return finalTaxWthldDividends;
	}

	public void setFinalTaxWthldDividends(String finalTaxWthldDividends) {
		this.finalTaxWthldDividends = finalTaxWthldDividends;
	}

	public String getFinalTaxWthldPrizesWinnings() {
		return finalTaxWthldPrizesWinnings;
	}

	public void setFinalTaxWthldPrizesWinnings(String finalTaxWthldPrizesWinnings) {
		this.finalTaxWthldPrizesWinnings = finalTaxWthldPrizesWinnings;
	}

	public List<RealPropertiesSalesExchange> getListOfRealPropertiesSalesExchange() {
		return listOfRealPropertiesSalesExchange;
	}

	public void setListOfRealPropertiesSalesExchange(
			List<RealPropertiesSalesExchange> listOfRealPropertiesSalesExchange) {
		this.listOfRealPropertiesSalesExchange = listOfRealPropertiesSalesExchange;
	}

	public List<SharesOfStockSalesExchange> getListOfSharesOfStockSalesExchange() {
		return listOfSharesOfStockSalesExchange;
	}

	public void setListOfSharesOfStockSalesExchange(
			List<SharesOfStockSalesExchange> listOfSharesOfStockSalesExchange) {
		this.listOfSharesOfStockSalesExchange = listOfSharesOfStockSalesExchange;
	}

	public List<OtherIncome> getListOfOtherIncome() {
		return listOfOtherIncome;
	}

	public void setListOfOtherIncome(List<OtherIncome> listOfOtherIncome) {
		this.listOfOtherIncome = listOfOtherIncome;
	}

	public String getSaleExchangeOfRealPropertiesLength() {
		return Integer.toString(listOfRealPropertiesSalesExchange.size());
	}

	public void setSaleExchangeOfRealPropertiesLength(
			String saleExchangeOfRealPropertiesLength) {
		this.saleExchangeOfRealPropertiesLength = saleExchangeOfRealPropertiesLength;
	}

	public String getSaleExchangeOfSharesOfStockLength() {
		return Integer.toString(listOfSharesOfStockSalesExchange.size());
	}

	public void setSaleExchangeOfSharesOfStockLength(
			String saleExchangeOfSharesOfStockLength) {
		this.saleExchangeOfSharesOfStockLength = saleExchangeOfSharesOfStockLength;
	}

	public String getOtherIncomeLength() {
		return Integer.toString(listOfOtherIncome.size());
	}

	public void setOtherIncomeLength(String otherIncomeLength) {
		this.otherIncomeLength = otherIncomeLength;
	}

	public String getTotalFinalTaxWithheldPaid() {
		return totalFinalTaxWithheldPaid;
	}

	public void setTotalFinalTaxWithheldPaid(String totalFinalTaxWithheldPaid) {
		this.totalFinalTaxWithheldPaid = totalFinalTaxWithheldPaid;
	}

	public String getReturnOfPremium() {
		return returnOfPremium;
	}

	public void setReturnOfPremium(String returnOfPremium) {
		this.returnOfPremium = returnOfPremium;
	}

	public List<PersonalRealPropertiesReceived> getListOfPersonalRealPropertiesReceived() {
		return listOfPersonalRealPropertiesReceived;
	}

	public void setListOfPersonalRealPropertiesReceived(
			List<PersonalRealPropertiesReceived> listOfPersonalRealPropertiesReceived) {
		this.listOfPersonalRealPropertiesReceived = listOfPersonalRealPropertiesReceived;
	}

	public List<OtherIncome> getListOfOtherExemptIncome() {
		return listOfOtherExemptIncome;
	}

	public void setListOfOtherExemptIncome(List<OtherIncome> listOfOtherExemptIncome) {
		this.listOfOtherExemptIncome = listOfOtherExemptIncome;
	}

	public String getPersonalRealPropertiesReceivedLength() {
		return Integer.toString(listOfPersonalRealPropertiesReceived.size());
	}

	public void setPersonalRealPropertiesReceivedLength(
			String personalRealPropertiesReceivedLength) {
		this.personalRealPropertiesReceivedLength = personalRealPropertiesReceivedLength;
	}

	public String getOtherExemptIncomeLength() {
		return Integer.toString(listOfOtherExemptIncome.size());
	}

	public void setOtherExemptIncomeLength(String otherExemptIncomeLength) {
		this.otherExemptIncomeLength = otherExemptIncomeLength;
	}

	public String getTotalIncomeExemptFromTax() {
		return totalIncomeExemptFromTax;
	}

	public void setTotalIncomeExemptFromTax(String totalIncomeExemptFromTax) {
		this.totalIncomeExemptFromTax = totalIncomeExemptFromTax;
	}

	public String getSchedule4Style() {
		return schedule4Style;
	}

	public void setSchedule4Style(String schedule4Style) {
		this.schedule4Style = schedule4Style;
	}

	public String getSchedule5Style() {
		return schedule5Style;
	}

	public void setSchedule5Style(String schedule5Style) {
		this.schedule5Style = schedule5Style;
	}

	public String getTitleOfSignatory() {
		return titleOfSignatory;
	}

	public void setTitleOfSignatory(String titleOfSignatory) {
		this.titleOfSignatory = titleOfSignatory;
	}

	public String getNumberOfPagesFiled() {
		return numberOfPagesFiled;
	}

	public void setNumberOfPagesFiled(String numberOfPagesFiled) {
		this.numberOfPagesFiled = numberOfPagesFiled;
	}
	/**
	 * @return the dateRegistered
	 */
	public String getDateRegistered() {
		return dateRegistered;
	}
	/**
	 * @param dateRegistered the dateRegistered to set
	 */
	public void setDateRegistered(String dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	/**
	 * @return the searchMonth
	 */
	public String getSearchMonth() {
		return searchMonth;
	}
	/**
	 * @param searchMonth the searchMonth to set
	 */
	public void setSearchMonth(String searchMonth) {
		this.searchMonth = searchMonth;
	}
	/**
	 * @return the searchYear
	 */
	public String getSearchYear() {
		return searchYear;
	}
	/**
	 * @param searchYear the searchYear to set
	 */
	public void setSearchYear(String searchYear) {
		this.searchYear = searchYear;
	}
	/**
	 * @return the filedForms
	 */
//	public List<TaxReturnSearch> getFiledForms() {
//		return filedForms;
//	}
//	/**
//	 * @param filedForms the filedForms to set
//	 */
//	public void setFiledForms(List<TaxReturnSearch> filedForms) {
//		this.filedForms = filedForms;
//	}
	/**
	 * @return the dataTable1
	 */
	public boolean isDataTable1() {
		return dataTable1;
	}
	/**
	 * @param dataTable1 the dataTable1 to set
	 */
	public void setDataTable1(boolean dataTable1) {
		this.dataTable1 = dataTable1;
	}
	/**
	 * @return the trsMsg
	 */
	public String getTrsMsg() {
		return trsMsg;
	}
	/**
	 * @param trsMsg the trsMsg to set
	 */
	public void setTrsMsg(String trsMsg) {
		this.trsMsg = trsMsg;
	}
	/**
	 * @return the showTRS
	 */
	public boolean isShowTRS() {
		return showTRS;
	}
	/**
	 * @param showTRS the showTRS to set
	 */
	public void setShowTRS(boolean showTRS) {
		this.showTRS = showTRS;
	}
	/**
	 * @return the showHkeepPopup
	 */
	public boolean isShowHkeepPopup() {
		return showHkeepPopup;
	}
	/**
	 * @param showHkeepPopup the showHkeepPopup to set
	 */
	public void setShowHkeepPopup(boolean showHkeepPopup) {
		this.showHkeepPopup = showHkeepPopup;
	}
	/**
	 * @return the showIntranet
	 */
	public boolean isShowIntranet() {
		return showIntranet;
	}
	/**
	 * @param showIntranet the showIntranet to set
	 */
	public void setShowIntranet(boolean showIntranet) {
		this.showIntranet = showIntranet;
	}
	/**
	 * @return the hkeepMsg
	 */
	public String getHkeepMsg() {
		return hkeepMsg;
	}
	/**
	 * @param hkeepMsg the hkeepMsg to set
	 */
	public void setHkeepMsg(String hkeepMsg) {
		this.hkeepMsg = hkeepMsg;
	}
	/**
	 * @return the repIntraCode
	 */
	public String getRepIntraCode() {
		return repIntraCode;
	}
	/**
	 * @param repIntraCode the repIntraCode to set
	 */
	public void setRepIntraCode(String repIntraCode) {
		this.repIntraCode = repIntraCode;
	}
	/**
	 * @return the filedForm1702RT
	 */
//	public TaxReturnSearch getFiledForm1702RT() {
//		return filedForm1702RT;
//	}
//	/**
//	 * @param filedForm1702RT the filedForm1702RT to set
//	 */
//	public void setFiledForm1702RT(TaxReturnSearch filedForm1702RT) {
//		this.filedForm1702RT = filedForm1702RT;
//	}
	/**
	 * @return the hkeepFlag
	 */
	public String getHkeepFlag() {
		return hkeepFlag;
	}
	/**
	 * @param hkeepFlag the hkeepFlag to set
	 */
	public void setHkeepFlag(String hkeepFlag) {
		this.hkeepFlag = hkeepFlag;
	}
	/**
	 * @return the selectedFiledForm
	 */
//	public TaxReturnSearch getSelectedFiledForm() {
//		return selectedFiledForm;
//	}
//	/**
//	 * @param selectedFiledForm the selectedFiledForm to set
//	 */
//	public void setSelectedFiledForm(TaxReturnSearch selectedFiledForm) {
//		this.selectedFiledForm = selectedFiledForm;
//	}
	/**
	 * @return the showConfirmFormPopup
	 */
	public boolean isShowConfirmFormPopup() {
		return showConfirmFormPopup;
	}
	/**
	 * @param showConfirmFormPopup the showConfirmFormPopup to set
	 */
	public void setShowConfirmFormPopup(boolean showConfirmFormPopup) {
		this.showConfirmFormPopup = showConfirmFormPopup;
	}
	/**
	 * @return the filingPage
	 */
	public boolean isFilingPage() {
		return filingPage;
	}
	/**
	 * @param filingPage the filingPage to set
	 */
	public void setFilingPage(boolean filingPage) {
		this.filingPage = filingPage;
	}
	/**
	 * @return the inquiryPage
	 */
	public boolean isInquiryPage() {
		return inquiryPage;
	}
	/**
	 * @param inquiryPage the inquiryPage to set
	 */
	public void setInquiryPage(boolean inquiryPage) {
		this.inquiryPage = inquiryPage;
	}
	/**
	 * @return the returnPeriodDay
	 */
	public int getReturnPeriodDay() {
		return returnPeriodDay;
	}
	/**
	 * @param returnPeriodDay the returnPeriodDay to set
	 */
	public void setReturnPeriodDay(int returnPeriodDay) {
		this.returnPeriodDay = returnPeriodDay;
	}
	/**
	 * @return the hkeep_Filing
	 */
	public String getHkeep_Filing() {
		return Hkeep_Filing;
	}
	/**
	 * @param hkeep_Filing the hkeep_Filing to set
	 */
	public void setHkeep_Filing(String hkeep_Filing) {
		Hkeep_Filing = hkeep_Filing;
	}
	/**
	 * @return the hkeep_Inquiry
	 */
	public String getHkeep_Inquiry() {
		return Hkeep_Inquiry;
	}
	/**
	 * @param hkeep_Inquiry the hkeep_Inquiry to set
	 */
	public void setHkeep_Inquiry(String hkeep_Inquiry) {
		Hkeep_Inquiry = hkeep_Inquiry;
	}
	/**
	 * @return the versionList
	 */
//	public List<RpsFormVersions> getVersionList() {
//		return versionList;
//	}
//	/**
//	 * @param versionList the versionList to set
//	 */
//	public void setVersionList(List<RpsFormVersions> versionList) {
//		this.versionList = versionList;
//	}
	/**
	 * @return the disableProceedToPayment
	 */
	public boolean isDisableProceedToPayment() {
		return disableProceedToPayment;
	}
	/**
	 * @param disableProceedToPayment the disableProceedToPayment to set
	 */
	public void setDisableProceedToPayment(boolean disableProceedToPayment) {
		this.disableProceedToPayment = disableProceedToPayment;
	}
	/**
	 * @return the processNumTaxReturnSearch
	 */
	public int getProcessNumTaxReturnSearch() {
		return processNumTaxReturnSearch;
	}
	/**
	 * @param processNumTaxReturnSearch the processNumTaxReturnSearch to set
	 */
	public void setProcessNumTaxReturnSearch(int processNumTaxReturnSearch) {
		this.processNumTaxReturnSearch = processNumTaxReturnSearch;
	}
	/**
	 * @return the messageCodeTaxReturnSearch
	 */
	public int getMessageCodeTaxReturnSearch() {
		return messageCodeTaxReturnSearch;
	}
	/**
	 * @param messageCodeTaxReturnSearch the messageCodeTaxReturnSearch to set
	 */
	public void setMessageCodeTaxReturnSearch(int messageCodeTaxReturnSearch) {
		this.messageCodeTaxReturnSearch = messageCodeTaxReturnSearch;
	}

	public List<GrossIncomeFinalWithholding> getListOfGrossIncomeFinalWithholding() {
		return listOfGrossIncomeFinalWithholding;
	}
	public void setListOfGrossIncomeFinalWithholding(
			List<GrossIncomeFinalWithholding> listOfGrossIncomeFinalWithholding) {
		this.listOfGrossIncomeFinalWithholding = listOfGrossIncomeFinalWithholding;
	}
	public String getOtherTaxIncomeDescription3Class() {
		return otherTaxIncomeDescription3Class;
	}
	public void setOtherTaxIncomeDescription3Class(
			String otherTaxIncomeDescription3Class) {
		this.otherTaxIncomeDescription3Class = otherTaxIncomeDescription3Class;
	}
	public boolean getOtherTaxIncomeDescription3Enabled() {
		return otherTaxIncomeDescription3Enabled;
	}
	public void setOtherTaxIncomeDescription3Enabled(
			boolean otherTaxIncomeDescription3Enabled) {
		this.otherTaxIncomeDescription3Enabled = otherTaxIncomeDescription3Enabled;
	}
	public String getOtherTaxIncomeAmount3Class() {
		return otherTaxIncomeAmount3Class;
	}
	public void setOtherTaxIncomeAmount3Class(String otherTaxIncomeAmount3Class) {
		this.otherTaxIncomeAmount3Class = otherTaxIncomeAmount3Class;
	}
	public boolean getOtherTaxIncomeAmount3Enabled() {
		return otherTaxIncomeAmount3Enabled;
	}
	public void setOtherTaxIncomeAmount3Enabled(boolean otherTaxIncomeAmount3Enabled) {
		this.otherTaxIncomeAmount3Enabled = otherTaxIncomeAmount3Enabled;
	}
	public String getAmortizationsDescription3Class() {
		return amortizationsDescription3Class;
	}
	public void setAmortizationsDescription3Class(
			String amortizationsDescription3Class) {
		this.amortizationsDescription3Class = amortizationsDescription3Class;
	}
	public boolean isAmortizationsDescription3Enabled() {
		return amortizationsDescription3Enabled;
	}
	public void setAmortizationsDescription3Enabled(
			boolean amortizationsDescription3Enabled) {
		this.amortizationsDescription3Enabled = amortizationsDescription3Enabled;
	}
	public String getAmortizationsAmount3Class() {
		return amortizationsAmount3Class;
	}
	public void setAmortizationsAmount3Class(String amortizationsAmount3Class) {
		this.amortizationsAmount3Class = amortizationsAmount3Class;
	}
	public boolean isAmortizationsAmount3Enabled() {
		return amortizationsAmount3Enabled;
	}
	public void setAmortizationsAmount3Enabled(boolean amortizationsAmount3Enabled) {
		this.amortizationsAmount3Enabled = amortizationsAmount3Enabled;
	}
	public String getOthersDescription4Class() {
		return othersDescription4Class;
	}
	public void setOthersDescription4Class(String othersDescription4Class) {
		this.othersDescription4Class = othersDescription4Class;
	}
	public String getOthersAmount4Class() {
		return othersAmount4Class;
	}
	public void setOthersAmount4Class(String othersAmount4Class) {
		this.othersAmount4Class = othersAmount4Class;
	}
	public String getSpecialAllowableItemizedDeductionsDescription4Class() {
		return specialAllowableItemizedDeductionsDescription4Class;
	}
	public void setSpecialAllowableItemizedDeductionsDescription4Class(
			String specialAllowableItemizedDeductionsDescription4Class) {
		this.specialAllowableItemizedDeductionsDescription4Class = specialAllowableItemizedDeductionsDescription4Class;
	}
	public String getSpecialAllowableItemizedDeductionsLegalBasis4Class() {
		return specialAllowableItemizedDeductionsLegalBasis4Class;
	}
	public void setSpecialAllowableItemizedDeductionsLegalBasis4Class(
			String specialAllowableItemizedDeductionsLegalBasis4Class) {
		this.specialAllowableItemizedDeductionsLegalBasis4Class = specialAllowableItemizedDeductionsLegalBasis4Class;
	}
	public String getSpecialAllowableItemizedDeductionsAmount4Class() {
		return specialAllowableItemizedDeductionsAmount4Class;
	}
	public void setSpecialAllowableItemizedDeductionsAmount4Class(
			String specialAllowableItemizedDeductionsAmount4Class) {
		this.specialAllowableItemizedDeductionsAmount4Class = specialAllowableItemizedDeductionsAmount4Class;
	}
	public String getNetOperatingLossYearIncurred4Class() {
		return netOperatingLossYearIncurred4Class;
	}
	public void setNetOperatingLossYearIncurred4Class(
			String netOperatingLossYearIncurred4Class) {
		this.netOperatingLossYearIncurred4Class = netOperatingLossYearIncurred4Class;
	}
	public String getNetOperatingLossAmount4Class() {
		return netOperatingLossAmount4Class;
	}
	public void setNetOperatingLossAmount4Class(String netOperatingLossAmount4Class) {
		this.netOperatingLossAmount4Class = netOperatingLossAmount4Class;
	}
	public String getNOLCOAppliedPreviousYear4Class() {
		return NOLCOAppliedPreviousYear4Class;
	}
	public void setNOLCOAppliedPreviousYear4Class(
			String nOLCOAppliedPreviousYear4Class) {
		NOLCOAppliedPreviousYear4Class = nOLCOAppliedPreviousYear4Class;
	}
	public String getNOLCOExpired4Class() {
		return NOLCOExpired4Class;
	}
	public void setNOLCOExpired4Class(String nOLCOExpired4Class) {
		NOLCOExpired4Class = nOLCOExpired4Class;
	}
	public String getNOLCOAppliedCurrentYear4Class() {
		return NOLCOAppliedCurrentYear4Class;
	}
	public void setNOLCOAppliedCurrentYear4Class(
			String nOLCOAppliedCurrentYear4Class) {
		NOLCOAppliedCurrentYear4Class = nOLCOAppliedCurrentYear4Class;
	}
	public String getNetOperatingLossUnapplied4Class() {
		return netOperatingLossUnapplied4Class;
	}
	public void setNetOperatingLossUnapplied4Class(
			String netOperatingLossUnapplied4Class) {
		this.netOperatingLossUnapplied4Class = netOperatingLossUnapplied4Class;
	}
	public String getOtherCreditsPaymentsDescription2Class() {
		return otherCreditsPaymentsDescription2Class;
	}
	public void setOtherCreditsPaymentsDescription2Class(
			String otherCreditsPaymentsDescription2Class) {
		this.otherCreditsPaymentsDescription2Class = otherCreditsPaymentsDescription2Class;
	}
	public String getOtherCreditsPaymentsAmount2Class() {
		return otherCreditsPaymentsAmount2Class;
	}
	public void setOtherCreditsPaymentsAmount2Class(
			String otherCreditsPaymentsAmount2Class) {
		this.otherCreditsPaymentsAmount2Class = otherCreditsPaymentsAmount2Class;
	}
	public String getNonDeductibleExpensesClass() {
		return nonDeductibleExpensesClass;
	}
	public void setNonDeductibleExpensesClass(String nonDeductibleExpensesClass) {
		this.nonDeductibleExpensesClass = nonDeductibleExpensesClass;
	}
	public String getNonDeductibleExpensesAmountClass() {
		return nonDeductibleExpensesAmountClass;
	}
	public void setNonDeductibleExpensesAmountClass(
			String nonDeductibleExpensesAmountClass) {
		this.nonDeductibleExpensesAmountClass = nonDeductibleExpensesAmountClass;
	}
	public String getNonDeductibleExpenses2Class() {
		return nonDeductibleExpenses2Class;
	}
	public void setNonDeductibleExpenses2Class(String nonDeductibleExpenses2Class) {
		this.nonDeductibleExpenses2Class = nonDeductibleExpenses2Class;
	}
	public String getNonDeductibleExpensesAmount2Class() {
		return nonDeductibleExpensesAmount2Class;
	}
	public void setNonDeductibleExpensesAmount2Class(
			String nonDeductibleExpensesAmount2Class) {
		this.nonDeductibleExpensesAmount2Class = nonDeductibleExpensesAmount2Class;
	}
	public String getNonTaxable2Class() {
		return nonTaxable2Class;
	}
	public void setNonTaxable2Class(String nonTaxable2Class) {
		this.nonTaxable2Class = nonTaxable2Class;
	}
	public String getNonTaxableAmount2Class() {
		return nonTaxableAmount2Class;
	}
	public void setNonTaxableAmount2Class(String nonTaxableAmount2Class) {
		this.nonTaxableAmount2Class = nonTaxableAmount2Class;
	}
	public String getSpecialDeductions2Class() {
		return specialDeductions2Class;
	}
	public void setSpecialDeductions2Class(String specialDeductions2Class) {
		this.specialDeductions2Class = specialDeductions2Class;
	}
	public String getSpecialDeductionsAmount2Class() {
		return specialDeductionsAmount2Class;
	}
	public void setSpecialDeductionsAmount2Class(
			String specialDeductionsAmount2Class) {
		this.specialDeductionsAmount2Class = specialDeductionsAmount2Class;
	}

	public Long getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}
	public Date getDateFiled() {
		return dateFiled;
	}
	public void setDateFiled(Date dateFiled) {
		this.dateFiled = dateFiled;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Long getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}
	public String getYearType() {
		return yearType;
	}
	public void setYearType(String yearType) {
		this.yearType = yearType;
	}
	public String getAmmended() {
		return ammended;
	}
	public void setAmmended(String ammended) {
		this.ammended = ammended;
	}
	public int getNumSheet() {
		return numSheet;
	}
	public void setNumSheet(int numSheet) {
		this.numSheet = numSheet;
	}
	public String getAtcCode() {
		return atcCode;
	}
	public void setAtcCode(String atcCode) {
		this.atcCode = atcCode;
	}
	public String getSpecialRateYN() {
		return specialRateYN;
	}
	public void setSpecialRateYN(String specialRateYN) {
		this.specialRateYN = specialRateYN;
	}
	public String getInternationalTreaty() {
		return internationalTreaty;
	}
	public void setInternationalTreaty(String internationalTreaty) {
		this.internationalTreaty = internationalTreaty;
	}
	public double getExemptSale() {
		return exemptSale;
	}
	public void setExemptSale(double exemptSale) {
		this.exemptSale = exemptSale;
	}
	public double getExemptCost() {
		return exemptCost;
	}
	public void setExemptCost(double exemptCost) {
		this.exemptCost = exemptCost;
	}
	public double getExemptGrossIncome() {
		return exemptGrossIncome;
	}
	public void setExemptGrossIncome(double exemptGrossIncome) {
		this.exemptGrossIncome = exemptGrossIncome;
	}
	public double getSpecialGrossIncome() {
		return specialGrossIncome;
	}
	public void setSpecialGrossIncome(double specialGrossIncome) {
		this.specialGrossIncome = specialGrossIncome;
	}
	public double getRegularGrossIncome() {
		return regularGrossIncome;
	}
	public void setRegularGrossIncome(double regularGrossIncome) {
		this.regularGrossIncome = regularGrossIncome;
	}
	public double getExemptOtherIncome() {
		return exemptOtherIncome;
	}
	public void setExemptOtherIncome(double exemptOtherIncome) {
		this.exemptOtherIncome = exemptOtherIncome;
	}
	public double getSpecialOtherIncome() {
		return specialOtherIncome;
	}
	public void setSpecialOtherIncome(double specialOtherIncome) {
		this.specialOtherIncome = specialOtherIncome;
	}
	public double getRegularOtherIncome() {
		return regularOtherIncome;
	}
	public void setRegularOtherIncome(double regularOtherIncome) {
		this.regularOtherIncome = regularOtherIncome;
	}
	public double getSpecialCreditOtherIncome() {
		return specialCreditOtherIncome;
	}
	public void setSpecialCreditOtherIncome(double specialCreditOtherIncome) {
		this.specialCreditOtherIncome = specialCreditOtherIncome;
	}
	public double getRegularCreditOtherIncome() {
		return regularCreditOtherIncome;
	}
	public void setRegularCreditOtherIncome(double regularCreditOtherIncome) {
		this.regularCreditOtherIncome = regularCreditOtherIncome;
	}
	public double getExemptTotalGrossIncome() {
		return exemptTotalGrossIncome;
	}
	public void setExemptTotalGrossIncome(double exemptTotalGrossIncome) {
		this.exemptTotalGrossIncome = exemptTotalGrossIncome;
	}
	public double getSpecialTotalGrossIncome() {
		return specialTotalGrossIncome;
	}
	public void setSpecialTotalGrossIncome(double specialTotalGrossIncome) {
		this.specialTotalGrossIncome = specialTotalGrossIncome;
	}
	public double getRegularTotalGrossIncome() {
		return regularTotalGrossIncome;
	}
	public void setRegularTotalGrossIncome(double regularTotalGrossIncome) {
		this.regularTotalGrossIncome = regularTotalGrossIncome;
	}
	public double getExemptDeductions() {
		return exemptDeductions;
	}
	public void setExemptDeductions(double exemptDeductions) {
		this.exemptDeductions = exemptDeductions;
	}
	public double getSpecialAllowableDeductions() {
		return specialAllowableDeductions;
	}
	public void setSpecialAllowableDeductions(double specialAllowableDeductions) {
		this.specialAllowableDeductions = specialAllowableDeductions;
	}
	public double getRegularDeductions() {
		return regularDeductions;
	}
	public void setRegularDeductions(double regularDeductions) {
		this.regularDeductions = regularDeductions;
	}
	public double getSpecialTaxableIncome() {
		return specialTaxableIncome;
	}
	public void setSpecialTaxableIncome(double specialTaxableIncome) {
		this.specialTaxableIncome = specialTaxableIncome;
	}
	public double getRegularTaxableIncome() {
		return regularTaxableIncome;
	}
	public void setRegularTaxableIncome(double regularTaxableIncome) {
		this.regularTaxableIncome = regularTaxableIncome;
	}
	public double getSpecialRate() {
		return specialRate;
	}
	public void setSpecialRate(double specialRate) {
		this.specialRate = specialRate;
	}
	public double getRegularRate() {
		return regularRate;
	}
	public void setRegularRate(double regularRate) {
		this.regularRate = regularRate;
	}
	public double getSpecialIncomeTax() {
		return specialIncomeTax;
	}
	public void setSpecialIncomeTax(double specialIncomeTax) {
		this.specialIncomeTax = specialIncomeTax;
	}
	public double getRegularIncomeTax() {
		return regularIncomeTax;
	}
	public void setRegularIncomeTax(double regularIncomeTax) {
		this.regularIncomeTax = regularIncomeTax;
	}
	public double getRegularTax() {
		return regularTax;
	}
	public void setRegularTax(double regularTax) {
		this.regularTax = regularTax;
	}
	public double getExcessPriorMCIT() {
		return excessPriorMCIT;
	}
	public void setExcessPriorMCIT(double excessPriorMCIT) {
		this.excessPriorMCIT = excessPriorMCIT;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getSpecialTax() {
		return specialTax;
	}
	public void setSpecialTax(double specialTax) {
		this.specialTax = specialTax;
	}
	public double getAggregateTaxDue() {
		return aggregateTaxDue;
	}
	public void setAggregateTaxDue(double aggregateTaxDue) {
		this.aggregateTaxDue = aggregateTaxDue;
	}
	public double getExecssCredit() {
		return execssCredit;
	}
	public void setExecssCredit(double execssCredit) {
		this.execssCredit = execssCredit;
	}
	public double getQuarterTaxPayment() {
		return quarterTaxPayment;
	}
	public void setQuarterTaxPayment(double quarterTaxPayment) {
		this.quarterTaxPayment = quarterTaxPayment;
	}
	public double getQuarterTaxWitheld() {
		return quarterTaxWitheld;
	}
	public void setQuarterTaxWitheld(double quarterTaxWitheld) {
		this.quarterTaxWitheld = quarterTaxWitheld;
	}
	public double getQuarterTaxWitheld2307() {
		return quarterTaxWitheld2307;
	}
	public void setQuarterTaxWitheld2307(double quarterTaxWitheld2307) {
		this.quarterTaxWitheld2307 = quarterTaxWitheld2307;
	}
	public double getForeignTaxPaid() {
		return foreignTaxPaid;
	}
	public void setForeignTaxPaid(double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}
	public double getPreviousTaxPaid() {
		return previousTaxPaid;
	}
	public void setPreviousTaxPaid(double previousTaxPaid) {
		this.previousTaxPaid = previousTaxPaid;
	}
	public double getTotalTaxCredit() {
		return totalTaxCredit;
	}
	public void setTotalTaxCredit(double totalTaxCredit) {
		this.totalTaxCredit = totalTaxCredit;
	}
	public double getTaxPayable() {
		return taxPayable;
	}
	public void setTaxPayable(double taxPayable) {
		this.taxPayable = taxPayable;
	}
	public double getTotals() {
		return totals;
	}
	public void setTotals(double totals) {
		this.totals = totals;
	}
	public double getSurcharges() {
		return surcharges;
	}
	public void setSurcharges(double surcharges) {
		this.surcharges = surcharges;
	}
	public double getInterests() {
		return interests;
	}
	public void setInterests(double interests) {
		this.interests = interests;
	}
	public double getCompromises() {
		return compromises;
	}
	public void setCompromises(double compromises) {
		this.compromises = compromises;
	}
	public double getPenalties() {
		return penalties;
	}
	public void setPenalties(double penalties) {
		this.penalties = penalties;
	}
	public double getTotalAmountPayable() {
		return totalAmountPayable;
	}
	public void setTotalAmountPayable(double totalAmountPayable) {
		this.totalAmountPayable = totalAmountPayable;
	}
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	public String getCommunityTaxCert() {
		return communityTaxCert;
	}
	public void setCommunityTaxCert(String communityTaxCert) {
		this.communityTaxCert = communityTaxCert;
	}
	public String getPlaceIssue() {
		return placeIssue;
	}
	public void setPlaceIssue(String placeIssue) {
		this.placeIssue = placeIssue;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	public double getShareAgency() {
		return shareAgency;
	}
	public void setShareAgency(double shareAgency) {
		this.shareAgency = shareAgency;
	}
	public int getFormVersion() {
		return formVersion;
	}
	public void setFormVersion(int formVersion) {
		this.formVersion = formVersion;
	}
	public String getTaxAgentTin() {
		return taxAgentTin;
	}
	public void setTaxAgentTin(String taxAgentTin) {
		this.taxAgentTin = taxAgentTin;
	}
	public String getTaxAgentAcctNo() {
		return taxAgentAcctNo;
	}
	public void setTaxAgentAcctNo(String taxAgentAcctNo) {
		this.taxAgentAcctNo = taxAgentAcctNo;
	}
	public String getShortPeriod() {
		return shortPeriod;
	}
	public void setShortPeriod(String shortPeriod) {
		this.shortPeriod = shortPeriod;
	}
	public String getMethodDeduction() {
		return methodDeduction;
	}
	public void setMethodDeduction(String methodDeduction) {
		this.methodDeduction = methodDeduction;
	}
	public double getOtherPaymentMade() {
		return otherPaymentMade;
	}
	public void setOtherPaymentMade(double otherPaymentMade) {
		this.otherPaymentMade = otherPaymentMade;
	}
	public double getExemptTaxableIncome() {
		return exemptTaxableIncome;
	}
	public void setExemptTaxableIncome(double exemptTaxableIncome) {
		this.exemptTaxableIncome = exemptTaxableIncome;
	}
	public double getExemptRate() {
		return exemptRate;
	}
	public void setExemptRate(double exemptRate) {
		this.exemptRate = exemptRate;
	}
	public double getExemptIncomeMCIT() {
		return exemptIncomeMCIT;
	}
	public void setExemptIncomeMCIT(double exemptIncomeMCIT) {
		this.exemptIncomeMCIT = exemptIncomeMCIT;
	}
	public double getSpecialIncomeMCIT() {
		return specialIncomeMCIT;
	}
	public void setSpecialIncomeMCIT(double specialIncomeMCIT) {
		this.specialIncomeMCIT = specialIncomeMCIT;
	}
	public double getRegularIncomeMCIT() {
		return regularIncomeMCIT;
	}
	public void setRegularIncomeMCIT(double regularIncomeMCIT) {
		this.regularIncomeMCIT = regularIncomeMCIT;
	}
	public double getSpecialIncomeNatlGov() {
		return specialIncomeNatlGov;
	}
	public void setSpecialIncomeNatlGov(double specialIncomeNatlGov) {
		this.specialIncomeNatlGov = specialIncomeNatlGov;
	}
	public double getExemptMCIT() {
		return exemptMCIT;
	}
	public void setExemptMCIT(double exemptMCIT) {
		this.exemptMCIT = exemptMCIT;
	}
	public double getRegularMCIT() {
		return regularMCIT;
	}
	public void setRegularMCIT(double regularMCIT) {
		this.regularMCIT = regularMCIT;
	}
	public double getMcitPreviousQuarter() {
		return mcitPreviousQuarter;
	}
	public void setMcitPreviousQuarter(double mcitPreviousQuarter) {
		this.mcitPreviousQuarter = mcitPreviousQuarter;
	}
	public double getExcessMCITCurrent() {
		return excessMCITCurrent;
	}
	public void setExcessMCITCurrent(double excessMCITCurrent) {
		this.excessMCITCurrent = excessMCITCurrent;
	}
	public double getSpecialRatePreviousQtr() {
		return specialRatePreviousQtr;
	}
	public void setSpecialRatePreviousQtr(double specialRatePreviousQtr) {
		this.specialRatePreviousQtr = specialRatePreviousQtr;
	}
	public double getSpecialTaxCredit() {
		return specialTaxCredit;
	}
	public void setSpecialTaxCredit(double specialTaxCredit) {
		this.specialTaxCredit = specialTaxCredit;
	}
	public double getSpecialTotalTaxCredit() {
		return specialTotalTaxCredit;
	}
	public void setSpecialTotalTaxCredit(double specialTotalTaxCredit) {
		this.specialTotalTaxCredit = specialTotalTaxCredit;
	}
	public double getSpecialTaxPayable() {
		return specialTaxPayable;
	}
	public void setSpecialTaxPayable(double specialTaxPayable) {
		this.specialTaxPayable = specialTaxPayable;
	}
	public String getInternaltionalTreatyType() {
		return internaltionalTreatyType;
	}
	public void setInternaltionalTreatyType(String internaltionalTreatyType) {
		this.internaltionalTreatyType = internaltionalTreatyType;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public int getNumActivity() {
		return numActivity;
	}
	public void setNumActivity(int numActivity) {
		this.numActivity = numActivity;
	}
	public String getDefualtATC() {
		return defualtATC;
	}
	public void setDefualtATC(String defualtATC) {
		this.defualtATC = defualtATC;
	}
	public String getNonDefaultATC() {
		return nonDefaultATC;
	}
	public void setNonDefaultATC(String nonDefaultATC) {
		this.nonDefaultATC = nonDefaultATC;
	}
	public double getSpecialPreviousTaxPaid() {
		return specialPreviousTaxPaid;
	}
	public void setSpecialPreviousTaxPaid(double specialPreviousTaxPaid) {
		this.specialPreviousTaxPaid = specialPreviousTaxPaid;
	}
	public double getQuarterTaxPaymentMCIT() {
		return quarterTaxPaymentMCIT;
	}
	public void setQuarterTaxPaymentMCIT(double quarterTaxPaymentMCIT) {
		this.quarterTaxPaymentMCIT = quarterTaxPaymentMCIT;
	}
	public double getSpecialQuarterTaxWitheld() {
		return specialQuarterTaxWitheld;
	}
	public void setSpecialQuarterTaxWitheld(double specialQuarterTaxWitheld) {
		this.specialQuarterTaxWitheld = specialQuarterTaxWitheld;
	}
	public double getSpecialQuarterTaxWitheld2307() {
		return specialQuarterTaxWitheld2307;
	}
	public void setSpecialQuarterTaxWitheld2307(double specialQuarterTaxWitheld2307) {
		this.specialQuarterTaxWitheld2307 = specialQuarterTaxWitheld2307;
	}
	public double getSpecialForeignTaxCredit() {
		return specialForeignTaxCredit;
	}
	public void setSpecialForeignTaxCredit(double specialForeignTaxCredit) {
		this.specialForeignTaxCredit = specialForeignTaxCredit;
	}
	public double getQuarterTaxPaymentSpecialRate() {
		return quarterTaxPaymentSpecialRate;
	}
	public void setQuarterTaxPaymentSpecialRate(double quarterTaxPaymentSpecialRate) {
		this.quarterTaxPaymentSpecialRate = quarterTaxPaymentSpecialRate;
	}
	public double getTotalAllowanceNOLCO() {
		return totalAllowanceNOLCO;
	}
	public void setTotalAllowanceNOLCO(double totalAllowanceNOLCO) {
		this.totalAllowanceNOLCO = totalAllowanceNOLCO;
	}
	public String getFormCode() {
		return formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}
	public int getFomrType() {
		return fomrType;
	}
	public void setFomrType(int fomrType) {
		this.fomrType = fomrType;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getAuditYN() {
		return auditYN;
	}
	public void setAuditYN(String auditYN) {
		this.auditYN = auditYN;
	}
	public String getAuditedBy() {
		return auditedBy;
	}
	public void setAuditedBy(String auditedBy) {
		this.auditedBy = auditedBy;
	}
	public Date getDateAudited() {
		return dateAudited;
	}
	public void setDateAudited(Date dateAudited) {
		this.dateAudited = dateAudited;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBarangay() {
		return barangay;
	}
	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getStartMonth() {
		return startMonth;
	}
	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}
	public String gethKeepTag() {
		return hKeepTag;
	}
	public void sethKeepTag(String hKeepTag) {
		this.hKeepTag = hKeepTag;
	}
	public long getPartitionId() {
		return partitionId;
	}
	public void setPartitionId(long partitionId) {
		this.partitionId = partitionId;
	}
	public Date getCorporationDate() {
		return corporationDate;
	}
	public void setCorporationDate(Date corporationDate) {
		this.corporationDate = corporationDate;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getReturnPeriod() {
		return returnPeriod;
	}
	public void setReturnPeriod(Date returnPeriod) {
		this.returnPeriod = returnPeriod;
	}
	public String getTin1ExternalAuditorAccreditedTaxAgent() {
		return tin1ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin1ExternalAuditorAccreditedTaxAgent(
			String tin1ExternalAuditorAccreditedTaxAgent) {
		this.tin1ExternalAuditorAccreditedTaxAgent = tin1ExternalAuditorAccreditedTaxAgent;
	}
	public String getTin2ExternalAuditorAccreditedTaxAgent() {
		return tin2ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin2ExternalAuditorAccreditedTaxAgent(
			String tin2ExternalAuditorAccreditedTaxAgent) {
		this.tin2ExternalAuditorAccreditedTaxAgent = tin2ExternalAuditorAccreditedTaxAgent;
	}
	public String getTin3ExternalAuditorAccreditedTaxAgent() {
		return tin3ExternalAuditorAccreditedTaxAgent;
	}
	public void setTin3ExternalAuditorAccreditedTaxAgent(
			String tin3ExternalAuditorAccreditedTaxAgent) {
		this.tin3ExternalAuditorAccreditedTaxAgent = tin3ExternalAuditorAccreditedTaxAgent;
	}
	public String getTinBranchExternalAuditorAccreditedTaxAgent() {
		return tinBranchExternalAuditorAccreditedTaxAgent;
	}
	public void setTinBranchExternalAuditorAccreditedTaxAgent(
			String tinBranchExternalAuditorAccreditedTaxAgent) {
		this.tinBranchExternalAuditorAccreditedTaxAgent = tinBranchExternalAuditorAccreditedTaxAgent;
	}
	public String getTin1SigningPartner() {
		return tin1SigningPartner;
	}
	public void setTin1SigningPartner(String tin1SigningPartner) {
		this.tin1SigningPartner = tin1SigningPartner;
	}
	public String getTin2SigningPartner() {
		return tin2SigningPartner;
	}
	public void setTin2SigningPartner(String tin2SigningPartner) {
		this.tin2SigningPartner = tin2SigningPartner;
	}
	public String getTin3SigningPartner() {
		return tin3SigningPartner;
	}
	public void setTin3SigningPartner(String tin3SigningPartner) {
		this.tin3SigningPartner = tin3SigningPartner;
	}
	public String getTinBranchSigningPartner() {
		return tinBranchSigningPartner;
	}
	public void setTinBranchSigningPartner(String tinBranchSigningPartner) {
		this.tinBranchSigningPartner = tinBranchSigningPartner;
	}
	public String getSched4HiddenSubtotal() {
		return sched4HiddenSubtotal;
	}
	public void setSched4HiddenSubtotal(String sched4HiddenSubtotal) {
		this.sched4HiddenSubtotal = sched4HiddenSubtotal;
	}
	public boolean isSched6ShowPanel() {
		return sched6ShowPanel;
	}
	public void setSched6ShowPanel(boolean sched6ShowPanel) {
		this.sched6ShowPanel = sched6ShowPanel;
	}
	public double getTaxCodeRate() {
		return taxCodeRate;
	}
	public void setTaxCodeRate(double taxCodeRate) {
		this.taxCodeRate = taxCodeRate;
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
	public String getRdoCodeClass() {
		return rdoCodeClass;
	}
	public void setRdoCodeClass(String rdoCodeClass) {
		this.rdoCodeClass = rdoCodeClass;
	}
	public String getDateIncorporationClass() {
		return dateIncorporationClass;
	}
	public void setDateIncorporationClass(String dateIncorporationClass) {
		this.dateIncorporationClass = dateIncorporationClass;
	}
	public String getRegisteredNameClass() {
		return registeredNameClass;
	}
	public void setRegisteredNameClass(String registeredNameClass) {
		this.registeredNameClass = registeredNameClass;
	}
	public String getRegisteredAddressClass() {
		return registeredAddressClass;
	}
	public void setRegisteredAddressClass(String registeredAddressClass) {
		this.registeredAddressClass = registeredAddressClass;
	}
	public String getBranchCodeClass() {
		return branchCodeClass;
	}
	public void setBranchCodeClass(String branchCodeClass) {
		this.branchCodeClass = branchCodeClass;
	}
	public Map<String, Integer> getIteratingTableMap() {
		return iteratingTableMap;
	}
	public void setIteratingTableMap(Map<String, Integer> iteratingTableMap) {
		this.iteratingTableMap = iteratingTableMap;
	}
	public boolean isSchedule6Disabled() {
		return schedule6Disabled;
	}
	public void setSchedule6Disabled(boolean schedule6Disabled) {
		this.schedule6Disabled = schedule6Disabled;
	}
	public String getSchedule6Style() {
		return schedule6Style;
	}
	public void setSchedule6Style(String schedule6Style) {
		this.schedule6Style = schedule6Style;
	}
	public String getSchedule8Style() {
		return schedule8Style;
	}
	public void setSchedule8Style(String schedule8Style) {
		this.schedule8Style = schedule8Style;
	}

	public void clearSchedule4() {
		advertisingAndPromotions = "0";
		amortizationsDescription1 = "";
		amortizationsDescription2 = "";
		amortizationsDescription3 = "";
		amortizationsAmount1 = "0";
		amortizationsAmount2 = "0";
		amortizationsAmount3 = "0";
		badDebts = "0";
		charitableContributions = "0";
		commissions = "0";
		communicationLightAndWater = "0";
		depletion = "0";
		depreciation = "0";
		directorsFees = "0";
		fringeBenefits = "0";
		fuelAndOil = "0";
		insurance = "0";
		interestSchedule4 = "0";
		janitorialAndMessengerialServices = "0";
		losses = "0";
		managementAndConsultancyFee = "0";
		miscellaneous = "0";
		officeSupplies = "0";
		otherServices = "0";
		professionalFees = "0";
		rental = "0";
		repairsAndMaintenanceLaborOrLaborAndMaterials = "0";
		repairsAndMaintenanceMaterialSupplies = "0";
		representationAndEntertainment = "0";
		researchAndDevelopment = "0";
		royalties = "0";
		salariesAndAllowances = "0";
		sched4HiddenSubtotal = "0";
		securityServices = "0";
		SSSGSISPhilhealthHDMFAndOtherContributions = "0";
		taxesAndLicenses = "0";
		tollingFees = "0";
		trainingAndSeminars = "0";
		transpotationAndTravel = "0";
		othersDescription1 = "";
		othersDescription2 = "";
		othersDescription3 = "";
		othersDescription4 = "";
		othersAmount1 = "0";
		othersAmount2 = "0";
		othersAmount3 = "0";
		othersAmount4 = "0";
		totalOrdinaryAllowableItemizedDeductions = "0";
		sched4AdditionalAttachments1.clear();
		sched4AdditionalAttachments2.clear();
	}
	
	public void clearSchedule5() {
		specialAllowableItemizedDeductionsDescription1 = "";
		specialAllowableItemizedDeductionsDescription2 = "";
		specialAllowableItemizedDeductionsDescription3 = "";
		specialAllowableItemizedDeductionsDescription4 = "";
		specialAllowableItemizedDeductionsLegalBasis1 = "";
		specialAllowableItemizedDeductionsLegalBasis2 = "";
		specialAllowableItemizedDeductionsLegalBasis3 = "";
		specialAllowableItemizedDeductionsLegalBasis4 = "";
		specialAllowableItemizedDeductionsAmount1 = "0";
		specialAllowableItemizedDeductionsAmount2 = "0";
		specialAllowableItemizedDeductionsAmount3 = "0";
		specialAllowableItemizedDeductionsAmount4 = "0";
		totalSpecialAllowableItemizedDeductions = "0";
		sched5AdditionalAttachments.clear();
	}
	
	public void clearSchedule6() {
		grossIncome = "0";
		lessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw = "0";
		netOperatingLoss = "0";
		netOperatingLossYearIncurred1 = "";
		netOperatingLossYearIncurred2 = "";
		netOperatingLossYearIncurred3 = "";
		netOperatingLossYearIncurred4 = "";
		netOperatingLossAmount1 = "0";
		netOperatingLossAmount2 = "0";
		netOperatingLossAmount3 = "0";
		netOperatingLossAmount4 = "0";
		NOLCOAppliedPreviousYear1 = "0";
		NOLCOAppliedPreviousYear2 = "0";
		NOLCOAppliedPreviousYear3 = "0";
		NOLCOAppliedPreviousYear4 = "0";
		NOLCOExpired1 = "0";
		NOLCOExpired2 = "0";
		NOLCOExpired3 = "0";
		NOLCOExpired4 = "0";
		NOLCOAppliedCurrentYear1 = "0";
		NOLCOAppliedCurrentYear2 = "0";
		NOLCOAppliedCurrentYear3 = "0";
		NOLCOAppliedCurrentYear4 = "0";
		netOperatingLossUnapplied1 = "0";
		netOperatingLossUnapplied2 = "0";
		netOperatingLossUnapplied3 = "0";
		netOperatingLossUnapplied4 = "0";
		totalNOLCO = "0";
		sched6OperatingLoss.clear();
	}

	public void clearSchedule8() {
		mcitYear1 = "";
		normalIncomeTax1 = "0";
		mcit1 = "0";
		excessMCITOverNormalTax1 = "0";
		excessMCITAppliedPreviously1 = "0";
		expiredPortionOfExcessMCIT1 = "0";
		excessMCITAppliedCurrently1 = "0";
		balanceOfExcessMCIT1 = "0";
		mcitYear2 = "";
		normalIncomeTax2 = "0";
		mcit2 = "0";
		excessMCITOverNormalTax2 = "0";
		excessMCITAppliedPreviously2 = "0";
		expiredPortionOfExcessMCIT2 = "0";
		excessMCITAppliedCurrently2 = "0";
		balanceOfExcessMCIT2 = "0";
		mcitYear3 = "";
		normalIncomeTax3 = "0";
		mcit3 = "0";
		excessMCITOverNormalTax3 = "0";
		excessMCITAppliedPreviously3 = "0";
		expiredPortionOfExcessMCIT3 = "0";
		excessMCITAppliedCurrently3 = "0";
		balanceOfExcessMCIT3 = "0";
		totalExcessCreditsMCIT = "0";
	}
	
	public PaymentBean getPayment() {
		return payment;
	}
	public void setPayment(PaymentBean payment) {
		this.payment = payment;
	}
//	public Formv2013PaymentBean getAbsolutePayment() {
//		return absolutePayment;
//	}
//	public void setAbsolutePayment(Formv2013PaymentBean absolutePayment) {
//		this.absolutePayment = absolutePayment;
//	}

	public List<Form1702RTAttachments> getListOfForm1702RTAttachments() {
		int largest = listOfRealPropertiesSalesExchange.size() > listOfSharesOfStockSalesExchange.size() ?
				listOfRealPropertiesSalesExchange.size() : listOfSharesOfStockSalesExchange.size();
		largest = largest > listOfOtherIncome.size() ?
				largest : listOfOtherIncome.size();
		largest = largest > listOfPersonalRealPropertiesReceived.size() ?
				largest : listOfPersonalRealPropertiesReceived.size();
		largest = largest > listOfOtherExemptIncome.size() ?
				largest : listOfOtherExemptIncome.size();

		listOfForm1702RTAttachments = new ArrayList<Form1702RTAttachments>();
		Form1702RTAttachments temp = null;
		
		for (int x = 0; x < largest; x++) {
			if (x % 2 == 0)
				temp = new Form1702RTAttachments();

			if (listOfRealPropertiesSalesExchange.size() > x)
				temp.getListOfRealPropertiesSalesExchange().add(listOfRealPropertiesSalesExchange.get(x));

			if (listOfSharesOfStockSalesExchange.size() > x)
				temp.getListOfSharesOfStockSalesExchange().add(listOfSharesOfStockSalesExchange.get(x));

			if (listOfOtherIncome.size() > x)
				temp.getListOfOtherIncome().add(listOfOtherIncome.get(x));

			if (listOfPersonalRealPropertiesReceived.size() > x)
				temp.getListOfPersonalRealPropertiesReceived().add(listOfPersonalRealPropertiesReceived.get(x));

			if (listOfOtherExemptIncome.size() > x)
				temp.getListOfOtherExemptIncome().add(listOfOtherExemptIncome.get(x));

			if (x % 2 == 1 || x == largest - 1)
				listOfForm1702RTAttachments.add(temp);
		}
		
		return listOfForm1702RTAttachments;
	}
	public void setListOfForm1702RTAttachments(
			List<Form1702RTAttachments> listOfForm1702RTAttachments) {
		this.listOfForm1702RTAttachments = listOfForm1702RTAttachments;
	}
	public String getSchedule6StyleCurrent() {
		return schedule6StyleCurrent;
	}
	public void setSchedule6StyleCurrent(String schedule6StyleCurrent) {
		this.schedule6StyleCurrent = schedule6StyleCurrent;
	}
	public Date getDateIncorporation() {
		return dateIncorporation;
	}
	public void setDateIncorporation(Date dateIncorporation) {
		this.dateIncorporation = dateIncorporation;
	}
	public boolean isDateIncorporationDisabled() {
		return dateIncorporationDisabled;
	}
	public void setDateIncorporationDisabled(boolean dateIncorporationDisabled) {
		this.dateIncorporationDisabled = dateIncorporationDisabled;
	}
	public String getCtcRegType() {
		return ctcRegType;
	}
	public void setCtcRegType(String ctcRegType) {
		this.ctcRegType = ctcRegType;
	}
	public String getCtcAmountStyle() {
		return ctcAmountStyle;
	}
	public void setCtcAmountStyle(String ctcAmountStyle) {
		this.ctcAmountStyle = ctcAmountStyle;
	}
	public String getBirAccreditationNo1() {
		return birAccreditationNo1;
	}
	public void setBirAccreditationNo1(String birAccreditationNo1) {
		this.birAccreditationNo1 = birAccreditationNo1;
	}
	public String getBirAccreditationNo2() {
		return birAccreditationNo2;
	}
	public void setBirAccreditationNo2(String birAccreditationNo2) {
		this.birAccreditationNo2 = birAccreditationNo2;
	}
	public String getBirAccreditationNo3() {
		return birAccreditationNo3;
	}
	public void setBirAccreditationNo3(String birAccreditationNo3) {
		this.birAccreditationNo3 = birAccreditationNo3;
	}
	public String getBirAccreditationNo4() {
		return birAccreditationNo4;
	}
	public void setBirAccreditationNo4(String birAccreditationNo4) {
		this.birAccreditationNo4 = birAccreditationNo4;
	}
	
	public String getBirAccreditationNo() {
		StringBuilder sb = new StringBuilder();
		sb.append(getBirAccreditationNo1());
		sb.append(getBirAccreditationNo2());
		sb.append(getBirAccreditationNo3());
		sb.append(getBirAccreditationNo4());
		return sb.toString();
	}
	public String getExternalAuditorAccreditedTaxAgentTin() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTin1ExternalAuditorAccreditedTaxAgent());
		sb.append(getTin2ExternalAuditorAccreditedTaxAgent());
		sb.append(getTin3ExternalAuditorAccreditedTaxAgent());
		sb.append(getTinBranchExternalAuditorAccreditedTaxAgent());
		return sb.toString();
	}
	
	public String getSigningPartnerTin() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTin1SigningPartner());
		sb.append(getTin2SigningPartner());
		sb.append(getTin3SigningPartner());
		sb.append(getTinBranchSigningPartner());
		return sb.toString();
	}
	public List<String> getCapitalContributorTypeList() {
		return capitalContributorTypeList;
	}
	public void setCapitalContributorTypeList(
			List<String> capitalContributorTypeList) {
		this.capitalContributorTypeList = capitalContributorTypeList;
	}
		
	private boolean isLateFiling(){
		Calendar curr = Calendar.getInstance();
		return Form1702RTBeanBuilder.compareDates(this.getDueDate(),curr.getTime())<0;
	}
	public String getSched12HiddenSubtotal() {
		return sched12HiddenSubtotal;
	}
	public void setSched12HiddenSubtotal(String sched12HiddenSubtotal) {
		this.sched12HiddenSubtotal = sched12HiddenSubtotal;
	}
	public String getCorporateFlag() {
		return corporateFlag;
	}
	public void setCorporateFlag(Character corporateFlag) {
		if(corporateFlag != null){
			this.corporateFlag = String.valueOf(corporateFlag);
		}else{
			this.corporateFlag = "";
		}
	}
	public int getRegisteredNameMaxLength() {
		return registeredNameMaxLength;
	}
	public void setRegisteredNameMaxLength(int registeredNameMaxLength) {
		this.registeredNameMaxLength = registeredNameMaxLength;
	}
	public String getTaxPaidInReturnClass() {
		return amendedReturn == null || amendedReturn.equals("N") ? "readOnlyStyle" : "";  
	}
	public void setTaxPaidInReturnClass(String taxPaidInReturnClass) {
		this.taxPaidInReturnClass = taxPaidInReturnClass;
	}
//	public List<File1702Attachments> getAttachments() {
//		return attachments;
//	}
//	public void setAttachments(List<File1702Attachments> attachments) {
//		this.attachments = attachments;
//	}
	public Date getRcsReturnDueDate() {
		return rcsReturnDueDate;
	}
	public void setRcsReturnDueDate(Date rcsReturnDueDate) {
		this.rcsReturnDueDate = rcsReturnDueDate;
	}
	public String getOriginalYearEndedMonth() {
		return originalYearEndedMonth;
	}
	public void setOriginalYearEndedMonth(String originalYearEndedMonth) {
		this.originalYearEndedMonth = originalYearEndedMonth;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getYearEndedStyle() {
		return yearEndedStyle;
	}
	public void setYearEndedStyle(String yearEndedStyle) {
		this.yearEndedStyle = yearEndedStyle;
	}
	public boolean isTokenUsed() {
		return isTokenUsed;
	}
	public void setTokenUsed(boolean isTokenUsed) {
		this.isTokenUsed = isTokenUsed;
	}
	public String getContactNumberClass() {
		return contactNumberClass;
	}
	public void setContactNumberClass(String contactNumberClass) {
		this.contactNumberClass = contactNumberClass;
	}
	public String getEmailAddressClass() {
		return emailAddressClass;
	}
	public void setEmailAddressClass(String emailAddressClass) {
		this.emailAddressClass = emailAddressClass;
	}
	public String getMainLineBusinessClass() {
		return mainLineBusinessClass;
	}
	public void setMainLineBusinessClass(String mainLineBusinessClass) {
		this.mainLineBusinessClass = mainLineBusinessClass;
	}
	public String getPsicCodeClass() {
		return psicCodeClass;
	}
	public void setPsicCodeClass(String psicCodeClass) {
		this.psicCodeClass = psicCodeClass;
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
