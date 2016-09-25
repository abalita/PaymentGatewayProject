package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

import com.ccci.ebirforms.paymentgateway.core.util.CommonUtils;
import com.ccci.ebirforms.paymentgateway.core.util.IteratingFields;
import java.util.Date;

import org.apache.commons.lang.StringUtils;


public class Form1701Attachment {
	
	public static String SPECIAL = "special";
	public static String EXEMPT = "exempt";
	
	private String taxRegime;
	private Long seqNo;
	private boolean persisted = false;
	private boolean clean = false;
	
	//Schedule A
	private String investmentPromotionAgency; //1
	private String spsInvestmentPromotionAgency; //1
	private String legalBasis; //2
	private String spsLegalBasis; //2
	private String registrationNo; //3
	private String spsRegistrationNo; //3
	
	private String specialTaxRate;//4
	private String specialTaxRated;//4
	private String spsSpecialTaxRate;//4
	private String spsSpecialTaxRated;//4
	
	private Date effectivityDateofTaxReliefExemptionFrom;//5
	private Date spsEffectivityDateofTaxReliefExemptionFrom;//5
	
	private Date effectivityDateofTaxReliefExemptionTo;//6
	private Date spsEffectivityDateofTaxReliefExemptionTo;//6
	
	
	//Schedule B
	//1 to Schedule D totalSalesRevenuesReceiptsFees
	//2 to Schedule E totalOtherTaxableIncome
	private String totalSalesRevenuesReceipts;//3
	private String spsTotalSalesRevenuesReceipts;//3
	
	
	//4 to Schedule F totalCostOfSalesServices
	private String grossIncomefromBusiness;//5
	private String spsGrossIncomefromBusiness;//5
	
	//6 to Schedule G totalNonOperatingIncome
	private String totalGrossIncome; //7
	private String spsTotalGrossIncome;//7
	//8 to Schedule H totalOrdinaryAllowableItemizedDeduction
	//9 to Schedule I totalSpecialAllowableItemizedDeductions
	private String totalAllowableItemizedDeductions;//10
	private String spsTotalAllowableItemizedDeductions;//10
	private String taxableIncomefromBusinessProfession; //11
	private String spsTaxableIncomefromBusinessProfession; //11
	
	//Schedule C1
	 
	//1 to Schedule B spouse taxableIncomefromBusinessProfession;
	//1 to Schedule B spouse spsTaxableIncomefromBusinessProfession;
	//2 to Schedule I taxpayer totalSpecialAllowableItemizedDeductions;
	//2 to Schedule I spouse spsTotalSpecialAllowableItemizedDeductions;
	private String subTotal; //3
	private String spsSubTotal;//3
	private String regularIncomeTaxOtherwiseDue; //4
	private String spsRegularIncomeTaxOtherwiseDue; //4
	private String incomeTaxDueSpecialRate; //5
	private String spsIncomeTaxDueSpecialRate; //5
	private String taxReliefAvailmentBeforeSpecialTaxCredit; //6
	private String spsTaxReliefAvailmentBeforeSpecialTaxCredit; //6
	//7 to Schedule J taxpayer specialTaxCredits;
	//7 to Schedule J spouse spsSpecialTaxCredits;
	
	private String totalTaxReliefAvailmentSpecial; //8
	
	
	private String spsTotalTaxReliefAvailmentSpecial; //8
	
	//Schedule C2
	private String taxableIncomefromBusinessRegular; //9
	private String spsTaxableIncomefromBusinessRegular; //9
	
	private String applicableTaxRateperTaxTable; //10
	private String spsApplicableTaxRateperTaxTable; //10

	private String applicableTaxRateperTaxTabled; //10
	private String spsApplicableTaxRateperTaxTabled; //10

	private String totalTaxReliefAvailmentExempt; //11
	
	private String spsTotalTaxReliefAvailmentExempt; //11

	//Schedule D
	private String totalSalesRevenues; //1
	private String spsTotalSalesRevenues; //1
	private String  grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding; //2
	private String  spsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding; //2
	private String sumOfTotalSalesRevenuesReceiptsFees; //3
	private String spsSumOfTotalSalesRevenuesReceiptsFees; //3
	private String salesReturnsAllowancesandDiscounts; //4
	private String spsSalesReturnsAllowancesandDiscounts; //4
	
	private String totalSalesRevenuesReceiptsFees; //5
	
	private String spsTotalSalesRevenuesReceiptsFees; //5
	
	//Schedule E
	private String totalOtherTaxableIncome; //3
	
	private String spsTotalOtherTaxableIncome; //3
	
	//Schedule F
	private String merchandiseInventoryBeginning; //1
	private String spsMerchandiseInventoryBeginning; //1
	
	private String purchasesofMerchandise; //2
	private String spsPurchasesofMerchandise; //2
	
	private String totalMerchandiseGoodsAvailableforSale; //3
	private String spsTotalMerchandiseGoodsAvailableforSale; //3
	
	private String merchandiseInventoryEnding;//4
	private String spsMerchandiseInventoryEnding;//4
	
	private String costOfSales;//5
	private String spsCostOfSales;//5
	
	private String directMaterialsBeginning;//6
	private String spsDirectMaterialsBeginning;//6
	
	private String purchasesOfDirectMaterials; //7
	private String spsPurchasesOfDirectMaterials; //7
	
	private String materialAvailableforUse; //8
	private String spsMaterialAvailableforUse; //8
	
	private String directMaterialsEnding; //9
	private String spsDirectMaterialsEnding; //9
	
	private String rawMaterialsUsed; //10
	private String spsRawMaterialsUsed; //10
	
	private String directLabor;//11
	private String spsDirectLabor;//11
	
	private String manufacturingOverhead;//12
	private String spsManufacturingOverhead;//12
	
	private String totalManufacturingCost; //13
	private String spsTotalManufacturingCost; //13
	
	private String workinProcessBeginning; //14
	private String spsWorkinProcessBeginning; //14
	
	private String workinProcessEnding; //15
	private String spsWorkinProcessEnding; //15
	
	private String costofGoodsManufactured; //16
	private String spsCostofGoodsManufactured; //16
	
	private String finishedGoodsBeginning; //17
	private String spsFinishedGoodsBeginning; //17
	
	private String finishedGoodsEnding; //18
	private String spsFinishedGoodsEnding; //18
	
	private String costofGoodsManufacturedandSold; //19
	private String spsCostofGoodsManufacturedandSold; //19
	
	private String directChargesSalariesWagesandBenefits; //20
	private String spsDirectChargesSalariesWagesandBenefits; //20
	
	private String directChargesMarterialsSuppliesandFacilities; //21
	private String spsDirectChargesMarterialsSuppliesandFacilities; //21
	
	private String directChargesDepreciation; //22
	private String spsDirectChargesDepreciation; //22
	
	private String directChargesRental;//23
	private String spsDirectChargesRental;//23
	
	private String directChargesOutsideServices; //24
	private String spsDirectChargesOutsideServices; //24
	
	private String directChargesOthers;//25
	private String spsDirectChargesOthers;//25
	
	private String costofServices; //26
	private String spsCostofServices; //26
	
	private String totalCostOfSalesServices; //27
	
	private String spsTotalCostOfSalesServices; //27

	//Schedule G
	//iterations items 1-5
	
	private String totalNonOperatingIncome; //6
	
	private String spsTotalNonOperatingIncome; //6
	
	//Schedule H
	private String advertisingandPromotions;//1
	private String spsAdvertisingandPromotions;//1
	private String amortizations;
	private String spsAmortizations;
	//iterattions items 2-4
	
	private String badDebts;//5
	private String spsBadDebts;//5
	
	private String charitableContributions;//6
	private String spsCharitableContributions;//6
	
	private String commissions;//7
	private String spsCommissions;//7
	
	private String communicationLightandWater;//8
	private String spsCommunicationLightandWater;//8
	
	private String depletion;//9
	private String spsDepletion;//9
	
	private String depreciation; //10
	private String spsDepreciation; //10
	
	private String directorsFees; //11
	private String spsDirectorsFees; //11
	
	private String fringeBenefits; //12
	private String spsFringeBenefits; //12
	
	private String fuelAndOil;//13
	private String spsFuelAndOil;//13
	
	private String insurance;//14
	private String spsInsurance;//14
	
	private String interest; //15
	private String spsInterest; //15
	
	private String janitorialandMessengerialServices;//16
	private String spsJanitorialandMessengerialServices;//16
	
	private String losses;//17
	private String spsLosses;//17
	
	private String managementandConsultancyFee;//18
	private String spsManagementandConsultancyFee;//18
	
	private String miscellaneous;//19
	private String spsMiscellaneous;//19
	
	private String officeSupplies;//20
	private String spsOfficeSupplies;//20
	
	private String otherServices;//21
	private String spsOtherServices;//21
	
	private String professionalFees; //22
	private String spsProfessionalFees; //22
	
	private String rental; //23
	private String spsRental; //23
	
	private String repairsAndMaintenanceLabororLaborandMaterials;//24
	private String spsRepairsAndMaintenanceLabororLaborandMaterials;//24
	
	private String repairsAndMaintenanceMaterialsSupplies;//25
	private String spsRepairsAndMaintenanceMaterialsSupplies;//25
	
	private String representationandEntertainment;//26
	private String spsRepresentationandEntertainment;//26
	
	private String researchandDevelopment;//27
	private String spsResearchandDevelopment;//27
	
	private String royalties;//28
	private String spsRoyalties;//28;
	
	private String salariesandAllowances;//29
	private String spsSalariesandAllowances;//29
	
	private String securityandServices; //30
	private String spsSecurityandServices; //30
	
	private String sSSGSISPhilhealthHDMFandOtherContributions;//31
	private String spsSSSGSISPhilhealthHDMFandOtherContributions;//31
	
	private String taxesandLicenses;//32
	private String spsTaxesandLicenses;//32
	
	private String tollingFees; //33
	private String spsTollingFees; //33
	
	private String trainingAndSeminars;//34
	private String spsTrainingAndSeminars;//34
	
	private String trasportationAndTravel; //35
	private String spsTrasportationAndTravel; //35
	//36-39 iteration
	
	private String totalOrdinaryAllowableItemizedDeduction; //40
	
	private String spsTotalOrdinaryAllowableItemizedDeduction; //40

	//Schedule I
	//1-4 iteration
	private String totalSpecialAllowableItemizedDeductions; //5
	
	private String spsTotalSpecialAllowableItemizedDeductions; //5
	
	//Schedule J
	private String priorYearsExcessCredits;//1
	private String spsPriorYearsExcessCredits;//1
	
	private String taxPaymentsfortheFirstThreeQuarters; //2
	private String spsTaxPaymentsfortheFirstThreeQuarters; //2
	
	private String creditableTaxWithheldfortheFirstThreeQuarters;//3
	private String spsCreditableTaxWithheldfortheFirstThreeQuarters;//3
	
	private String creditableTaxWithheldfortheFourthQuarter; //4
	private String spsCreditableTaxWithheldfortheFourthQuarter; //4
	
	private String taxWithheldperBIRFormNo2316;//5
	private String spsTaxWithheldperBIRFormNo2316;//5
	
	private String taxPaidinreturnpreviouslyfiled;//6
	private String spsTaxPaidinreturnpreviouslyfiled;//6
	
	private String foreignTaxCredits; //7
	private String spsForeignTaxCredits; //7
	
	private String specialTaxCredits; //8
	private String spsSpecialTaxCredits; //8
	
	private String otherPaymentsCreditsSpecify;//9
	private String spsOtherPaymentsCreditsSpecify;//9
	private String otherPaymentsDescription;

	private String totalTaxCreditsPayments; //10
	private String spsTotalTaxCreditsPayments; //10
	
	// Schedule K1
	private String netIncomeLossPerBooks;//1
	//2-3 iterate
	private String totalSumOfItems1to3;//4
	//5-8 iterate
	private String totalSumOfItems5to8;//9
	
	private String netTaxableIncomeLossTaxFiler; //10
	
	//Schedule k2
	private String spsNetIncomeLossPerBooks;//1
	//2-3 iterate
	private String spsTotalSumOfItems1to3;//4
	//5-8 iterate
	private String spsTotalSumOfItems5to8;//9
	
	private String spsNetTaxableIncomeLossTaxFiler; //10

	//private String totalTaxCreditsPayments; //5 - Part V 74A/75A

	//private String spsTotalTaxCreditsPayments; //5 - Part V 74B/75B

	//Schedule E
	private IteratingFields scheduleE = new IteratingFields(2);

	private IteratingFields scheduleG = new IteratingFields(4);
	private IteratingFields scheduleHAmmortizations = new IteratingFields(3,1);
	private IteratingFields scheduleHOthers = new IteratingFields(4,35);
	private IteratingFields scheduleI = new IteratingFields(4);

	//schedule k
	private IteratingFields scheduleK1_ND = new IteratingFields(2,1);
	private IteratingFields scheduleK1_NT = new IteratingFields(2,4);
	private IteratingFields scheduleK1_SD = new IteratingFields(2,6);

	private IteratingFields scheduleK2_ND = new IteratingFields(2,1);
	private IteratingFields scheduleK2_NT = new IteratingFields(2,4);
	private IteratingFields scheduleK2_SD = new IteratingFields(2,6);

	private final static String ITERATION_RESOURCE_PREFIX = "Form1701v2013.Iteration.";
	public static final String[] PROP_LIST = new String[] {
			"investmentPromotionAgency", "legalBasis", "registrationNo",
			"specialTaxRate", "specialTaxRated",
			"effectivityDateofTaxReliefExemptionFrom",
			"effectivityDateofTaxReliefExemptionTo",
			"totalSalesRevenuesReceipts", "grossIncomefromBusiness",
			"totalGrossIncome", "totalAllowableItemizedDeductions",
			"taxableIncomefromBusinessProfession", "subTotal",
			"regularIncomeTaxOtherwiseDue", "incomeTaxDueSpecialRate",
			"taxReliefAvailmentBeforeSpecialTaxCredit",
			"totalTaxReliefAvailmentSpecial",
			"taxableIncomefromBusinessRegular", "applicableTaxRateperTaxTable",
			"applicableTaxRateperTaxTabled", "totalTaxReliefAvailmentExempt",
			"totalSalesRevenues",
			"grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding",
			"sumOfTotalSalesRevenuesReceiptsFees",
			"salesReturnsAllowancesandDiscounts",
			"totalSalesRevenuesReceiptsFees", "totalOtherTaxableIncome",
			"merchandiseInventoryBeginning", "purchasesofMerchandise",
			"totalMerchandiseGoodsAvailableforSale",
			"merchandiseInventoryEnding", "costOfSales",
			"directMaterialsBeginning", "purchasesOfDirectMaterials",
			"materialAvailableforUse", "directMaterialsEnding",
			"rawMaterialsUsed", "directLabor", "manufacturingOverhead",
			"totalManufacturingCost", "workinProcessBeginning",
			"workinProcessEnding", "costofGoodsManufactured",
			"finishedGoodsBeginning", "finishedGoodsEnding",
			"costofGoodsManufacturedandSold",
			"directChargesSalariesWagesandBenefits",
			"directChargesMarterialsSuppliesandFacilities",
			"directChargesDepreciation", "directChargesRental",
			"directChargesOutsideServices", "directChargesOthers",
			"costofServices", "totalCostOfSalesServices",
			"totalNonOperatingIncome", "advertisingandPromotions",
			"amortizations", "badDebts", "charitableContributions",
			"commissions", "communicationLightandWater", "depletion",
			"depreciation", "directorsFees", "fringeBenefits", "fuelAndOil",
			"insurance", "interest", "janitorialandMessengerialServices",
			"losses", "managementandConsultancyFee", "miscellaneous",
			"officeSupplies", "otherServices", "professionalFees", "rental",
			"repairsAndMaintenanceLabororLaborandMaterials",
			"repairsAndMaintenanceMaterialsSupplies",
			"representationandEntertainment", "researchandDevelopment",
			"royalties", "salariesandAllowances", "securityandServices",
			"sSSGSISPhilhealthHDMFandOtherContributions", "taxesandLicenses",
			"tollingFees", "trainingAndSeminars", "trasportationAndTravel",
			"totalOrdinaryAllowableItemizedDeduction",
			"totalSpecialAllowableItemizedDeductions",
			"priorYearsExcessCredits", "taxPaymentsfortheFirstThreeQuarters",
			"creditableTaxWithheldfortheFirstThreeQuarters",
			"creditableTaxWithheldfortheFourthQuarter",
			"taxWithheldperBIRFormNo2316", "taxPaidinreturnpreviouslyfiled",
			"foreignTaxCredits", "specialTaxCredits",
			"otherPaymentsCreditsSpecify", "totalTaxCreditsPayments",
			"netIncomeLossPerBooks", "totalSumOfItems1to3",
			"totalSumOfItems5to8", "netTaxableIncomeLossTaxFiler" };

	public static final String[] ZONES = new String[]{"PEZA","ECOZONE","BCDA","SBMA","CDC","PPMC","JHSEZ","MSEZ","CEZA","ZCSEZA","APECO","AFAB","TEZ","EPZA","MEPZA"};
    public static final String[] RACHECK = new String[]{"7227","9400","7916","8748","7922","7903","9490","10083","9728","9593"};

    public Form1701Attachment() {
		setInternalNames(scheduleE,"scheduleE");
		setInternalNames(scheduleG,"scheduleG");
		setInternalNames(scheduleHAmmortizations,"scheduleHAmmortizations");
		setInternalNames(scheduleHOthers,"scheduleHOthers");
		setInternalNames(scheduleI,"scheduleI");
		setInternalNames(scheduleK1_ND,"scheduleK1_ND");
		setInternalNames(scheduleK1_NT,"scheduleK1_NT");
		setInternalNames(scheduleK1_SD,"scheduleK1_SD");
		setInternalNames(scheduleK2_ND,"scheduleK2_ND");
		setInternalNames(scheduleK2_NT,"scheduleK2_NT");
		setInternalNames(scheduleK2_SD,"scheduleK2_SD");
	}
 
	private void setInternalNames(IteratingFields iter, String name) {
		iter.setName(CommonUtils.constructMessage(ITERATION_RESOURCE_PREFIX + name));
		iter.setExpanderName(name + "Expanded");
	}

	public String getTaxRegime() {
		return taxRegime;
	}

	public void setTaxRegime(String taxRegime) {
		this.taxRegime = taxRegime;
	}

	public Long getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}

	public boolean isPersisted() {
		return persisted;
	}

	public void setPersisted(boolean persisted) {
		this.persisted = persisted;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public String getSpecialTaxCredits() {
		return specialTaxCredits;
	}

	public void setSpecialTaxCredits(String specialTaxCredits) {
		this.specialTaxCredits = specialTaxCredits;
	}

	public String getSpsSpecialTaxCredits() {
		return spsSpecialTaxCredits;
	}

	public void setSpsSpecialTaxCredits(String spsSpecialTaxCredits) {
		this.spsSpecialTaxCredits = spsSpecialTaxCredits;
	}

	public String getTotalTaxReliefAvailmentSpecial() {
		return totalTaxReliefAvailmentSpecial;
	}

	public void setTotalTaxReliefAvailmentSpecial(
			String totalTaxReliefAvailmentSpecial) {
		this.totalTaxReliefAvailmentSpecial = totalTaxReliefAvailmentSpecial;
	}

	public String getSpsTotalTaxReliefAvailmentSpecial() {
		return spsTotalTaxReliefAvailmentSpecial;
	}

	public void setSpsTotalTaxReliefAvailmentSpecial(
			String spsTotalTaxReliefAvailmentSpecial) {
		this.spsTotalTaxReliefAvailmentSpecial = spsTotalTaxReliefAvailmentSpecial;
	}

	public String getTotalTaxReliefAvailmentExempt() {
		return totalTaxReliefAvailmentExempt;
	}

	public void setTotalTaxReliefAvailmentExempt(
			String totalTaxReliefAvailmentExempt) {
		this.totalTaxReliefAvailmentExempt = totalTaxReliefAvailmentExempt;
	}

	public String getSpsTotalTaxReliefAvailmentExempt() {
		return spsTotalTaxReliefAvailmentExempt;
	}

	public void setSpsTotalTaxReliefAvailmentExempt(
			String spsTotalTaxReliefAvailmentExempt) {
		this.spsTotalTaxReliefAvailmentExempt = spsTotalTaxReliefAvailmentExempt;
	}

	public String getTotalSalesRevenuesReceiptsFees() {
		return totalSalesRevenuesReceiptsFees;
	}

	public void setTotalSalesRevenuesReceiptsFees(
			String totalSalesRevenuesReceiptsFees) {
		this.totalSalesRevenuesReceiptsFees = totalSalesRevenuesReceiptsFees;
	}

	public String getSpsTotalSalesRevenuesReceiptsFees() {
		return spsTotalSalesRevenuesReceiptsFees;
	}

	public void setSpsTotalSalesRevenuesReceiptsFees(
			String spsTotalSalesRevenuesReceiptsFees) {
		this.spsTotalSalesRevenuesReceiptsFees = spsTotalSalesRevenuesReceiptsFees;
	}

	public String getTotalOtherTaxableIncome() {
		return totalOtherTaxableIncome;
	}

	public void setTotalOtherTaxableIncome(String totalOtherTaxableIncome) {
		this.totalOtherTaxableIncome = totalOtherTaxableIncome;
	}

	public String getSpsTotalOtherTaxableIncome() {
		return spsTotalOtherTaxableIncome;
	}

	public void setSpsTotalOtherTaxableIncome(String spsTotalOtherTaxableIncome) {
		this.spsTotalOtherTaxableIncome = spsTotalOtherTaxableIncome;
	}

	public String getTotalCostOfSalesServices() {
		return totalCostOfSalesServices;
	}

	public void setTotalCostOfSalesServices(String totalCostOfSalesServices) {
		this.totalCostOfSalesServices = totalCostOfSalesServices;
	}

	public String getSpsTotalCostOfSalesServices() {
		return spsTotalCostOfSalesServices;
	}

	public void setSpsTotalCostOfSalesServices(String spsTotalCostOfSalesServices) {
		this.spsTotalCostOfSalesServices = spsTotalCostOfSalesServices;
	}

	public String getTotalNonOperatingIncome() {
		return totalNonOperatingIncome;
	}

	public void setTotalNonOperatingIncome(String totalNonOperatingIncome) {
		this.totalNonOperatingIncome = totalNonOperatingIncome;
	}

	public String getSpsTotalNonOperatingIncome() {
		return spsTotalNonOperatingIncome;
	}

	public void setSpsTotalNonOperatingIncome(String spsTotalNonOperatingIncome) {
		this.spsTotalNonOperatingIncome = spsTotalNonOperatingIncome;
	}

	public String getTotalOrdinaryAllowableItemizedDeduction() {
		return totalOrdinaryAllowableItemizedDeduction;
	}

	public void setTotalOrdinaryAllowableItemizedDeduction(
			String totalOrdinaryAllowableItemizedDeduction) {
		this.totalOrdinaryAllowableItemizedDeduction = totalOrdinaryAllowableItemizedDeduction;
	}

	public String getSpsTotalOrdinaryAllowableItemizedDeduction() {
		return spsTotalOrdinaryAllowableItemizedDeduction;
	}

	public void setSpsTotalOrdinaryAllowableItemizedDeduction(
			String spsTotalOrdinaryAllowableItemizedDeduction) {
		this.spsTotalOrdinaryAllowableItemizedDeduction = spsTotalOrdinaryAllowableItemizedDeduction;
	}

	public String getTotalSpecialAllowableItemizedDeductions() {
		return totalSpecialAllowableItemizedDeductions;
	}

	public void setTotalSpecialAllowableItemizedDeductions(
			String totalSpecialAllowableItemizedDeductions) {
		this.totalSpecialAllowableItemizedDeductions = totalSpecialAllowableItemizedDeductions;
	}

	public String getSpsTotalSpecialAllowableItemizedDeductions() {
		return spsTotalSpecialAllowableItemizedDeductions;
	}

	public void setSpsTotalSpecialAllowableItemizedDeductions(
			String spsTotalSpecialAllowableItemizedDeductions) {
		this.spsTotalSpecialAllowableItemizedDeductions = spsTotalSpecialAllowableItemizedDeductions;
	}
	public String getTotalSalesRevenuesReceipts() {
		return totalSalesRevenuesReceipts;
	}

	public void setTotalSalesRevenuesReceipts(String totalSalesRevenuesReceipts) {
		this.totalSalesRevenuesReceipts = totalSalesRevenuesReceipts;
	}

	public String getSpsTotalSalesRevenuesReceipts() {
		return spsTotalSalesRevenuesReceipts;
	}

	public void setSpsTotalSalesRevenuesReceipts(
			String spsTotalSalesRevenuesReceipts) {
		this.spsTotalSalesRevenuesReceipts = spsTotalSalesRevenuesReceipts;
	}

	public String getTotalGrossIncome() {
		return totalGrossIncome;
	}

	public void setTotalGrossIncome(String totalGrossIncome) {
		this.totalGrossIncome = totalGrossIncome;
	}

	public String getSpsTotalGrossIncome() {
		return spsTotalGrossIncome;
	}

	public void setSpsTotalGrossIncome(String spstotalGrossIncome) {
		this.spsTotalGrossIncome = spstotalGrossIncome;
	}

	public String getTotalAllowableItemizedDeductions() {
		return totalAllowableItemizedDeductions;
	}

	public void setTotalAllowableItemizedDeductions(
			String totalAllowableItemizedDeductions) {
		this.totalAllowableItemizedDeductions = totalAllowableItemizedDeductions;
	}

	public String getSpsTotalAllowableItemizedDeductions() {
		return spsTotalAllowableItemizedDeductions;
	}

	public void setSpsTotalAllowableItemizedDeductions(
			String spsTotalAllowableItemizedDeductions) {
		this.spsTotalAllowableItemizedDeductions = spsTotalAllowableItemizedDeductions;
	}

	public String getTaxableIncomefromBusinessProfession() {
		return taxableIncomefromBusinessProfession;
	}

	public void setTaxableIncomefromBusinessProfession(
			String taxableIncomefromBusinessProfession) {
		this.taxableIncomefromBusinessProfession = taxableIncomefromBusinessProfession;
	}

	public String getSpsTaxableIncomefromBusinessProfession() {
		return spsTaxableIncomefromBusinessProfession;
	}

	public void setSpsTaxableIncomefromBusinessProfession(
			String spsTaxableIncomefromBusinessProfession) {
		this.spsTaxableIncomefromBusinessProfession = spsTaxableIncomefromBusinessProfession;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getSpsSubTotal() {
		return spsSubTotal;
	}

	public void setSpsSubTotal(String spsSubTotal) {
		this.spsSubTotal = spsSubTotal;
	}

	public String getInvestmentPromotionAgency() {
		return investmentPromotionAgency;
	}

	public void setInvestmentPromotionAgency(String investmentPromotionAgency) {
		this.investmentPromotionAgency = investmentPromotionAgency;
	}

	public String getSpsInvestmentPromotionAgency() {
		return spsInvestmentPromotionAgency;
	}

	public void setSpsInvestmentPromotionAgency(String spsInvestmentPromotionAgency) {
		this.spsInvestmentPromotionAgency = spsInvestmentPromotionAgency;
	}

	public String getLegalBasis() {
		return legalBasis;
	}

	public void setLegalBasis(String legalBasis) {
		this.legalBasis = legalBasis;
	}

	public String getSpsLegalBasis() {
		return spsLegalBasis;
	}

	public void setSpsLegalBasis(String spsLegalBasis) {
		this.spsLegalBasis = spsLegalBasis;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getSpsRegistrationNo() {
		return spsRegistrationNo;
	}

	public void setSpsRegistrationNo(String spsRegistrationNo) {
		this.spsRegistrationNo = spsRegistrationNo;
	}

	public String getRegularIncomeTaxOtherwiseDue() {
		return regularIncomeTaxOtherwiseDue;
	}

	public void setRegularIncomeTaxOtherwiseDue(String regularIncomeTaxOtherwiseDue) {
		this.regularIncomeTaxOtherwiseDue = regularIncomeTaxOtherwiseDue;
	}

	public String getSpsRegularIncomeTaxOtherwiseDue() {
		return spsRegularIncomeTaxOtherwiseDue;
	}

	public void setSpsRegularIncomeTaxOtherwiseDue(
			String spsRegularIncomeTaxOtherwiseDue) {
		this.spsRegularIncomeTaxOtherwiseDue = spsRegularIncomeTaxOtherwiseDue;
	}

	public String getIncomeTaxDueSpecialRate() {
		return incomeTaxDueSpecialRate;
	}

	public void setIncomeTaxDueSpecialRate(String incomeTaxDueSpecialRate) {
		this.incomeTaxDueSpecialRate = incomeTaxDueSpecialRate;
	}

	public String getSpsIncomeTaxDueSpecialRate() {
		return spsIncomeTaxDueSpecialRate;
	}

	public void setSpsIncomeTaxDueSpecialRate(String spsIncomeTaxDueSpecialRate) {
		this.spsIncomeTaxDueSpecialRate = spsIncomeTaxDueSpecialRate;
	}

	public String getTaxReliefAvailmentBeforeSpecialTaxCredit() {
		return taxReliefAvailmentBeforeSpecialTaxCredit;
	}

	public void setTaxReliefAvailmentBeforeSpecialTaxCredit(
			String taxReliefAvailmentBeforeSpecialTaxCredit) {
		this.taxReliefAvailmentBeforeSpecialTaxCredit = taxReliefAvailmentBeforeSpecialTaxCredit;
	}

	public String getSpsTaxReliefAvailmentBeforeSpecialTaxCredit() {
		return spsTaxReliefAvailmentBeforeSpecialTaxCredit;
	}

	public void setSpsTaxReliefAvailmentBeforeSpecialTaxCredit(
			String spsTaxReliefAvailmentBeforeSpecialTaxCredit) {
		this.spsTaxReliefAvailmentBeforeSpecialTaxCredit = spsTaxReliefAvailmentBeforeSpecialTaxCredit;
	}

	public String getTaxableIncomefromBusinessRegular() {
		return taxableIncomefromBusinessRegular;
	}

	public void setTaxableIncomefromBusinessRegular(
			String taxableIncomefromBusinessRegular) {
		this.taxableIncomefromBusinessRegular = taxableIncomefromBusinessRegular;
	}

	public String getSpsTaxableIncomefromBusinessRegular() {
		return spsTaxableIncomefromBusinessRegular;
	}

	public void setSpsTaxableIncomefromBusinessRegular(
			String spsTaxableIncomefromBusinessRegular) {
		this.spsTaxableIncomefromBusinessRegular = spsTaxableIncomefromBusinessRegular;
	}

	public String getApplicableTaxRateperTaxTable() {
		return applicableTaxRateperTaxTable;
	}

	public void setApplicableTaxRateperTaxTable(String applicableTaxRateperTaxTable) {
		this.applicableTaxRateperTaxTable = applicableTaxRateperTaxTable;
	}

	public String getSpsApplicableTaxRateperTaxTable() {
		return spsApplicableTaxRateperTaxTable;
	}

	public void setSpsApplicableTaxRateperTaxTable(
			String spsApplicableTaxRateperTaxTable) {
		this.spsApplicableTaxRateperTaxTable = spsApplicableTaxRateperTaxTable;
	}

	public String getApplicableTaxRateperTaxTabled() {
		return applicableTaxRateperTaxTabled;
	}

	public void setApplicableTaxRateperTaxTabled(
			String applicableTaxRateperTaxTabled) {
		this.applicableTaxRateperTaxTabled = applicableTaxRateperTaxTabled;
	}

	public String getApplicableTaxRateperTaxTableFull() {
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.isNotBlank(getApplicableTaxRateperTaxTable()) ? getApplicableTaxRateperTaxTable() :"0");
		sb.append(".");
		sb.append(StringUtils.isNotBlank(getApplicableTaxRateperTaxTabled()) ? getApplicableTaxRateperTaxTabled() :"0");
		return sb.toString();
	}

	public String getSpsApplicableTaxRateperTaxTabled() {
		return spsApplicableTaxRateperTaxTabled;
	}

	public void setSpsApplicableTaxRateperTaxTabled(
			String spsApplicableTaxRateperTaxTabled) {
		this.spsApplicableTaxRateperTaxTabled = spsApplicableTaxRateperTaxTabled;
	}

	public String getSpsApplicableTaxRateperTaxTableFull() {
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.isNotBlank(getSpsApplicableTaxRateperTaxTable()) ? getSpsApplicableTaxRateperTaxTable() :"0");
		sb.append(".");
		sb.append(StringUtils.isNotBlank(getSpsApplicableTaxRateperTaxTabled()) ? getSpsApplicableTaxRateperTaxTabled() :"0");
		return sb.toString();
	}

	public String getTotalSalesRevenues() {
		return totalSalesRevenues;
	}

	public void setTotalSalesRevenues(String totalSalesRevenues) {
		this.totalSalesRevenues = totalSalesRevenues;
	}

	public String getSpsTotalSalesRevenues() {
		return spsTotalSalesRevenues;
	}

	public void setSpsTotalSalesRevenues(String spsTotalSalesRevenues) {
		this.spsTotalSalesRevenues = spsTotalSalesRevenues;
	}

	public String getGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding() {
		return grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding;
	}

	public void setGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding(
			String grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding) {
		this.grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding = grossSalesRevenuesReceiptsFeesnotsubjecttoWithholding;
	}

	public String getSpsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding() {
		return spsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding;
	}

	public void setSpsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding(
			String spsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding) {
		this.spsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding = spsGrossSalesRevenuesReceiptsFeesnotsubjecttoWithholding;
	}

	public String getSumOfTotalSalesRevenuesReceiptsFees() {
		return sumOfTotalSalesRevenuesReceiptsFees;
	}

	public void setSumOfTotalSalesRevenuesReceiptsFees(
			String sumOfTotalSalesRevenuesReceiptsFees) {
		this.sumOfTotalSalesRevenuesReceiptsFees = sumOfTotalSalesRevenuesReceiptsFees;
	}

	public String getSpsSumOfTotalSalesRevenuesReceiptsFees() {
		return spsSumOfTotalSalesRevenuesReceiptsFees;
	}

	public void setSpsSumOfTotalSalesRevenuesReceiptsFees(
			String spsSumOfTotalSalesRevenuesReceiptsFees) {
		this.spsSumOfTotalSalesRevenuesReceiptsFees = spsSumOfTotalSalesRevenuesReceiptsFees;
	}

	public String getSalesReturnsAllowancesandDiscounts() {
		return salesReturnsAllowancesandDiscounts;
	}

	public void setSalesReturnsAllowancesandDiscounts(
			String salesReturnsAllowancesandDiscounts) {
		this.salesReturnsAllowancesandDiscounts = salesReturnsAllowancesandDiscounts;
	}

	public String getSpsSalesReturnsAllowancesandDiscounts() {
		return spsSalesReturnsAllowancesandDiscounts;
	}

	public void setSpsSalesReturnsAllowancesandDiscounts(
			String spsSalesReturnsAllowancesandDiscounts) {
		this.spsSalesReturnsAllowancesandDiscounts = spsSalesReturnsAllowancesandDiscounts;
	}

	public String getMerchandiseInventoryBeginning() {
		return merchandiseInventoryBeginning;
	}

	public void setMerchandiseInventoryBeginning(
			String merchandiseInventoryBeginning) {
		this.merchandiseInventoryBeginning = merchandiseInventoryBeginning;
	}

	public String getSpsMerchandiseInventoryBeginning() {
		return spsMerchandiseInventoryBeginning;
	}

	public void setSpsMerchandiseInventoryBeginning(
			String spsMerchandiseInventoryBeginning) {
		this.spsMerchandiseInventoryBeginning = spsMerchandiseInventoryBeginning;
	}

	public String getPurchasesofMerchandise() {
		return purchasesofMerchandise;
	}

	public void setPurchasesofMerchandise(String purchasesofMerchandise) {
		this.purchasesofMerchandise = purchasesofMerchandise;
	}

	public String getSpsPurchasesofMerchandise() {
		return spsPurchasesofMerchandise;
	}

	public void setSpsPurchasesofMerchandise(String spsPurchasesofMerchandise) {
		this.spsPurchasesofMerchandise = spsPurchasesofMerchandise;
	}

	public String getTotalMerchandiseGoodsAvailableforSale() {
		return totalMerchandiseGoodsAvailableforSale;
	}

	public void setTotalMerchandiseGoodsAvailableforSale(
			String totalMerchandiseGoodsAvailableforSale) {
		this.totalMerchandiseGoodsAvailableforSale = totalMerchandiseGoodsAvailableforSale;
	}

	public String getSpsTotalMerchandiseGoodsAvailableforSale() {
		return spsTotalMerchandiseGoodsAvailableforSale;
	}

	public void setSpsTotalMerchandiseGoodsAvailableforSale(
			String spsTotalMerchandiseGoodsAvailableforSale) {
		this.spsTotalMerchandiseGoodsAvailableforSale = spsTotalMerchandiseGoodsAvailableforSale;
	}

	public String getMerchandiseInventoryEnding() {
		return merchandiseInventoryEnding;
	}

	public void setMerchandiseInventoryEnding(String merchandiseInventoryEnding) {
		this.merchandiseInventoryEnding = merchandiseInventoryEnding;
	}

	public String getSpsMerchandiseInventoryEnding() {
		return spsMerchandiseInventoryEnding;
	}

	public void setSpsMerchandiseInventoryEnding(
			String spsMerchandiseInventoryEnding) {
		this.spsMerchandiseInventoryEnding = spsMerchandiseInventoryEnding;
	}

	public String getCostOfSales() {
		return costOfSales;
	}

	public void setCostOfSales(String costOfSales) {
		this.costOfSales = costOfSales;
	}

	public String getSpsCostOfSales() {
		return spsCostOfSales;
	}

	public void setSpsCostOfSales(String spsCostOfSales) {
		this.spsCostOfSales = spsCostOfSales;
	}

	public String getDirectMaterialsBeginning() {
		return directMaterialsBeginning;
	}

	public void setDirectMaterialsBeginning(String directMaterialsBeginning) {
		this.directMaterialsBeginning = directMaterialsBeginning;
	}

	public String getSpsDirectMaterialsBeginning() {
		return spsDirectMaterialsBeginning;
	}

	public void setSpsDirectMaterialsBeginning(String spsDirectMaterialsBeginning) {
		this.spsDirectMaterialsBeginning = spsDirectMaterialsBeginning;
	}

	public String getPurchasesOfDirectMaterials() {
		return purchasesOfDirectMaterials;
	}

	public void setPurchasesOfDirectMaterials(String purchasesOfDirectMaterials) {
		this.purchasesOfDirectMaterials = purchasesOfDirectMaterials;
	}

	public String getSpsPurchasesOfDirectMaterials() {
		return spsPurchasesOfDirectMaterials;
	}

	public void setSpsPurchasesOfDirectMaterials(
			String spsPurchasesOfDirectMaterials) {
		this.spsPurchasesOfDirectMaterials = spsPurchasesOfDirectMaterials;
	}

	public String getMaterialAvailableforUse() {
		return materialAvailableforUse;
	}

	public void setMaterialAvailableforUse(String materialAvailableforUse) {
		this.materialAvailableforUse = materialAvailableforUse;
	}

	public String getSpsMaterialAvailableforUse() {
		return spsMaterialAvailableforUse;
	}

	public void setSpsMaterialAvailableforUse(String spsMaterialAvailableforUse) {
		this.spsMaterialAvailableforUse = spsMaterialAvailableforUse;
	}

	public String getDirectMaterialsEnding() {
		return directMaterialsEnding;
	}

	public void setDirectMaterialsEnding(String directMaterialsEnding) {
		this.directMaterialsEnding = directMaterialsEnding;
	}

	public String getSpsDirectMaterialsEnding() {
		return spsDirectMaterialsEnding;
	}

	public void setSpsDirectMaterialsEnding(String spsDirectMaterialsEnding) {
		this.spsDirectMaterialsEnding = spsDirectMaterialsEnding;
	}

	public String getRawMaterialsUsed() {
		return rawMaterialsUsed;
	}

	public void setRawMaterialsUsed(String rawMaterialsUsed) {
		this.rawMaterialsUsed = rawMaterialsUsed;
	}

	public String getSpsRawMaterialsUsed() {
		return spsRawMaterialsUsed;
	}

	public void setSpsRawMaterialsUsed(String spsRawMaterialsUsed) {
		this.spsRawMaterialsUsed = spsRawMaterialsUsed;
	}

	public String getDirectLabor() {
		return directLabor;
	}

	public void setDirectLabor(String directLabor) {
		this.directLabor = directLabor;
	}

	public String getSpsDirectLabor() {
		return spsDirectLabor;
	}

	public void setSpsDirectLabor(String spsDirectLabor) {
		this.spsDirectLabor = spsDirectLabor;
	}

	public String getManufacturingOverhead() {
		return manufacturingOverhead;
	}

	public void setManufacturingOverhead(String manufacturingOverhead) {
		this.manufacturingOverhead = manufacturingOverhead;
	}

	public String getSpsManufacturingOverhead() {
		return spsManufacturingOverhead;
	}

	public void setSpsManufacturingOverhead(String spsManufacturingOverhead) {
		this.spsManufacturingOverhead = spsManufacturingOverhead;
	}

	public String getTotalManufacturingCost() {
		return totalManufacturingCost;
	}

	public void setTotalManufacturingCost(String totalManufacturingCost) {
		this.totalManufacturingCost = totalManufacturingCost;
	}

	public String getSpsTotalManufacturingCost() {
		return spsTotalManufacturingCost;
	}

	public void setSpsTotalManufacturingCost(String spsTotalManufacturingCost) {
		this.spsTotalManufacturingCost = spsTotalManufacturingCost;
	}

	public String getWorkinProcessBeginning() {
		return workinProcessBeginning;
	}

	public void setWorkinProcessBeginning(String workinProcessBeginning) {
		this.workinProcessBeginning = workinProcessBeginning;
	}

	public String getSpsWorkinProcessBeginning() {
		return spsWorkinProcessBeginning;
	}

	public void setSpsWorkinProcessBeginning(String spsWorkinProcessBeginning) {
		this.spsWorkinProcessBeginning = spsWorkinProcessBeginning;
	}

	public String getWorkinProcessEnding() {
		return workinProcessEnding;
	}

	public void setWorkinProcessEnding(String workinProcessEnding) {
		this.workinProcessEnding = workinProcessEnding;
	}

	public String getSpsWorkinProcessEnding() {
		return spsWorkinProcessEnding;
	}

	public void setSpsWorkinProcessEnding(String spsWorkinProcessEnding) {
		this.spsWorkinProcessEnding = spsWorkinProcessEnding;
	}

	public String getCostofGoodsManufactured() {
		return costofGoodsManufactured;
	}

	public void setCostofGoodsManufactured(String costofGoodsManufactured) {
		this.costofGoodsManufactured = costofGoodsManufactured;
	}

	public String getSpsCostofGoodsManufactured() {
		return spsCostofGoodsManufactured;
	}

	public void setSpsCostofGoodsManufactured(String spsCostofGoodsManufactured) {
		this.spsCostofGoodsManufactured = spsCostofGoodsManufactured;
	}

	public String getFinishedGoodsBeginning() {
		return finishedGoodsBeginning;
	}

	public void setFinishedGoodsBeginning(String finishedGoodsBeginning) {
		this.finishedGoodsBeginning = finishedGoodsBeginning;
	}

	public String getSpsFinishedGoodsBeginning() {
		return spsFinishedGoodsBeginning;
	}

	public void setSpsFinishedGoodsBeginning(String spsFinishedGoodsBeginning) {
		this.spsFinishedGoodsBeginning = spsFinishedGoodsBeginning;
	}

	public String getFinishedGoodsEnding() {
		return finishedGoodsEnding;
	}

	public void setFinishedGoodsEnding(String finishedGoodsEnding) {
		this.finishedGoodsEnding = finishedGoodsEnding;
	}

	public String getSpsFinishedGoodsEnding() {
		return spsFinishedGoodsEnding;
	}

	public void setSpsFinishedGoodsEnding(String spsFinishedGoodsEnding) {
		this.spsFinishedGoodsEnding = spsFinishedGoodsEnding;
	}

	public String getCostofGoodsManufacturedandSold() {
		return costofGoodsManufacturedandSold;
	}

	public void setCostofGoodsManufacturedandSold(
			String costofGoodsManufacturedandSold) {
		this.costofGoodsManufacturedandSold = costofGoodsManufacturedandSold;
	}

	public String getSpsCostofGoodsManufacturedandSold() {
		return spsCostofGoodsManufacturedandSold;
	}

	public void setSpsCostofGoodsManufacturedandSold(
			String spsCostofGoodsManufacturedandSold) {
		this.spsCostofGoodsManufacturedandSold = spsCostofGoodsManufacturedandSold;
	}

	public String getDirectChargesSalariesWagesandBenefits() {
		return directChargesSalariesWagesandBenefits;
	}

	public void setDirectChargesSalariesWagesandBenefits(
			String directChargesSalariesWagesandBenefits) {
		this.directChargesSalariesWagesandBenefits = directChargesSalariesWagesandBenefits;
	}

	public String getSpsDirectChargesSalariesWagesandBenefits() {
		return spsDirectChargesSalariesWagesandBenefits;
	}

	public void setSpsDirectChargesSalariesWagesandBenefits(
			String spsDirectChargesSalariesWagesandBenefits) {
		this.spsDirectChargesSalariesWagesandBenefits = spsDirectChargesSalariesWagesandBenefits;
	}

	public String getDirectChargesMarterialsSuppliesandFacilities() {
		return directChargesMarterialsSuppliesandFacilities;
	}

	public void setDirectChargesMarterialsSuppliesandFacilities(
			String directChargesMarterialsSuppliesandFacilities) {
		this.directChargesMarterialsSuppliesandFacilities = directChargesMarterialsSuppliesandFacilities;
	}

	public String getSpsDirectChargesMarterialsSuppliesandFacilities() {
		return spsDirectChargesMarterialsSuppliesandFacilities;
	}

	public void setSpsDirectChargesMarterialsSuppliesandFacilities(
			String spsDirectChargesMarterialsSuppliesandFacilities) {
		this.spsDirectChargesMarterialsSuppliesandFacilities = spsDirectChargesMarterialsSuppliesandFacilities;
	}

	public String getDirectChargesDepreciation() {
		return directChargesDepreciation;
	}

	public void setDirectChargesDepreciation(String directChargesDepreciation) {
		this.directChargesDepreciation = directChargesDepreciation;
	}

	public String getSpsDirectChargesDepreciation() {
		return spsDirectChargesDepreciation;
	}

	public void setSpsDirectChargesDepreciation(String spsDirectChargesDepreciation) {
		this.spsDirectChargesDepreciation = spsDirectChargesDepreciation;
	}

	public String getDirectChargesRental() {
		return directChargesRental;
	}

	public void setDirectChargesRental(String directChargesRental) {
		this.directChargesRental = directChargesRental;
	}

	public String getSpsDirectChargesRental() {
		return spsDirectChargesRental;
	}

	public void setSpsDirectChargesRental(String spsDirectChargesRental) {
		this.spsDirectChargesRental = spsDirectChargesRental;
	}

	public String getDirectChargesOutsideServices() {
		return directChargesOutsideServices;
	}

	public void setDirectChargesOutsideServices(String directChargesOutsideServices) {
		this.directChargesOutsideServices = directChargesOutsideServices;
	}

	public String getSpsDirectChargesOutsideServices() {
		return spsDirectChargesOutsideServices;
	}

	public void setSpsDirectChargesOutsideServices(
			String spsDirectChargesOutsideServices) {
		this.spsDirectChargesOutsideServices = spsDirectChargesOutsideServices;
	}

	public String getDirectChargesOthers() {
		return directChargesOthers;
	}

	public void setDirectChargesOthers(String directChargesOthers) {
		this.directChargesOthers = directChargesOthers;
	}

	public String getSpsDirectChargesOthers() {
		return spsDirectChargesOthers;
	}

	public void setSpsDirectChargesOthers(String spsDirectChargesOthers) {
		this.spsDirectChargesOthers = spsDirectChargesOthers;
	}

	public String getCostofServices() {
		return costofServices;
	}

	public void setCostofServices(String costofServices) {
		this.costofServices = costofServices;
	}

	public String getSpsCostofServices() {
		return spsCostofServices;
	}

	public void setSpsCostofServices(String spsCostofServices) {
		this.spsCostofServices = spsCostofServices;
	}

	public String getAdvertisingandPromotions() {
		return advertisingandPromotions;
	}

	public void setAdvertisingandPromotions(String advertisingandPromotions) {
		this.advertisingandPromotions = advertisingandPromotions;
	}

	public String getSpsAdvertisingandPromotions() {
		return spsAdvertisingandPromotions;
	}

	public void setSpsAdvertisingandPromotions(String spsAdvertisingandPromotions) {
		this.spsAdvertisingandPromotions = spsAdvertisingandPromotions;
	}

	public String getBadDebts() {
		return badDebts;
	}

	public void setBadDebts(String badDebts) {
		this.badDebts = badDebts;
	}

	public String getSpsBadDebts() {
		return spsBadDebts;
	}

	public void setSpsBadDebts(String spsBadDebts) {
		this.spsBadDebts = spsBadDebts;
	}

	public String getCharitableContributions() {
		return charitableContributions;
	}

	public void setCharitableContributions(String charitableContributions) {
		this.charitableContributions = charitableContributions;
	}

	public String getSpsCharitableContributions() {
		return spsCharitableContributions;
	}

	public void setSpsCharitableContributions(String spsCharitableContributions) {
		this.spsCharitableContributions = spsCharitableContributions;
	}

	public String getCommissions() {
		return commissions;
	}

	public void setCommissions(String commissions) {
		this.commissions = commissions;
	}

	public String getSpsCommissions() {
		return spsCommissions;
	}

	public void setSpsCommissions(String spsCommissions) {
		this.spsCommissions = spsCommissions;
	}

	public String getCommunicationLightandWater() {
		return communicationLightandWater;
	}

	public void setCommunicationLightandWater(String communicationLightandWater) {
		this.communicationLightandWater = communicationLightandWater;
	}

	public String getSpsCommunicationLightandWater() {
		return spsCommunicationLightandWater;
	}

	public void setSpsCommunicationLightandWater(
			String spsCommunicationLightandWater) {
		this.spsCommunicationLightandWater = spsCommunicationLightandWater;
	}

	public String getDepletion() {
		return depletion;
	}

	public void setDepletion(String depletion) {
		this.depletion = depletion;
	}

	public String getSpsDepletion() {
		return spsDepletion;
	}

	public void setSpsDepletion(String spsDepletion) {
		this.spsDepletion = spsDepletion;
	}

	public String getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(String depreciation) {
		this.depreciation = depreciation;
	}

	public String getSpsDepreciation() {
		return spsDepreciation;
	}

	public void setSpsDepreciation(String spsDepreciation) {
		this.spsDepreciation = spsDepreciation;
	}

	public String getDirectorsFees() {
		return directorsFees;
	}

	public void setDirectorsFees(String directorsFees) {
		this.directorsFees = directorsFees;
	}

	public String getSpsDirectorsFees() {
		return spsDirectorsFees;
	}

	public void setSpsDirectorsFees(String spsDirectorsFees) {
		this.spsDirectorsFees = spsDirectorsFees;
	}

	public String getFringeBenefits() {
		return fringeBenefits;
	}

	public void setFringeBenefits(String fringeBenefits) {
		this.fringeBenefits = fringeBenefits;
	}

	public String getSpsFringeBenefits() {
		return spsFringeBenefits;
	}

	public void setSpsFringeBenefits(String spsFringeBenefits) {
		this.spsFringeBenefits = spsFringeBenefits;
	}

	public String getFuelAndOil() {
		return fuelAndOil;
	}

	public void setFuelAndOil(String fuelAndOil) {
		this.fuelAndOil = fuelAndOil;
	}

	public String getSpsFuelAndOil() {
		return spsFuelAndOil;
	}

	public void setSpsFuelAndOil(String spsFuelAndOil) {
		this.spsFuelAndOil = spsFuelAndOil;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getSpsInsurance() {
		return spsInsurance;
	}

	public void setSpsInsurance(String spsInsurance) {
		this.spsInsurance = spsInsurance;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getSpsInterest() {
		return spsInterest;
	}

	public void setSpsInterest(String spsInterest) {
		this.spsInterest = spsInterest;
	}

	public String getJanitorialandMessengerialServices() {
		return janitorialandMessengerialServices;
	}

	public void setJanitorialandMessengerialServices(
			String janitorialandMessengerialServices) {
		this.janitorialandMessengerialServices = janitorialandMessengerialServices;
	}

	public String getSpsJanitorialandMessengerialServices() {
		return spsJanitorialandMessengerialServices;
	}

	public void setSpsJanitorialandMessengerialServices(
			String spsJanitorialandMessengerialServices) {
		this.spsJanitorialandMessengerialServices = spsJanitorialandMessengerialServices;
	}

	public String getLosses() {
		return losses;
	}

	public void setLosses(String losses) {
		this.losses = losses;
	}

	public String getSpsLosses() {
		return spsLosses;
	}

	public void setSpsLosses(String spsLosses) {
		this.spsLosses = spsLosses;
	}

	public String getManagementandConsultancyFee() {
		return managementandConsultancyFee;
	}

	public void setManagementandConsultancyFee(String managementandConsultancyFee) {
		this.managementandConsultancyFee = managementandConsultancyFee;
	}

	public String getSpsManagementandConsultancyFee() {
		return spsManagementandConsultancyFee;
	}

	public void setSpsManagementandConsultancyFee(
			String spsManagementandConsultancyFee) {
		this.spsManagementandConsultancyFee = spsManagementandConsultancyFee;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public String getSpsMiscellaneous() {
		return spsMiscellaneous;
	}

	public void setSpsMiscellaneous(String spsMiscellaneous) {
		this.spsMiscellaneous = spsMiscellaneous;
	}

	public String getOfficeSupplies() {
		return officeSupplies;
	}

	public void setOfficeSupplies(String officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	public String getSpsOfficeSupplies() {
		return spsOfficeSupplies;
	}

	public void setSpsOfficeSupplies(String spsOfficeSupplies) {
		this.spsOfficeSupplies = spsOfficeSupplies;
	}

	public String getOtherServices() {
		return otherServices;
	}

	public void setOtherServices(String otherServices) {
		this.otherServices = otherServices;
	}

	public String getOtherPaymentsDescription() {
		return otherPaymentsDescription;
	}

	public void setOtherPaymentsDescription(String otherPaymentsDescription) {
		this.otherPaymentsDescription = otherPaymentsDescription;
	}

	public String getSpsOtherServices() {
		return spsOtherServices;
	}

	public void setSpsOtherServices(String spsOtherServices) {
		this.spsOtherServices = spsOtherServices;
	}

	public String getProfessionalFees() {
		return professionalFees;
	}

	public void setProfessionalFees(String professionalFees) {
		this.professionalFees = professionalFees;
	}

	public String getSpsProfessionalFees() {
		return spsProfessionalFees;
	}

	public void setSpsProfessionalFees(String spsProfessionalFees) {
		this.spsProfessionalFees = spsProfessionalFees;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}

	public String getSpsRental() {
		return spsRental;
	}

	public void setSpsRental(String spsRental) {
		this.spsRental = spsRental;
	}

	public String getRepairsAndMaintenanceLabororLaborandMaterials() {
		return repairsAndMaintenanceLabororLaborandMaterials;
	}

	public void setRepairsAndMaintenanceLabororLaborandMaterials(
			String repairsAndMaintenanceLabororLaborandMaterials) {
		this.repairsAndMaintenanceLabororLaborandMaterials = repairsAndMaintenanceLabororLaborandMaterials;
	}

	public String getSpsRepairsAndMaintenanceLabororLaborandMaterials() {
		return spsRepairsAndMaintenanceLabororLaborandMaterials;
	}

	public void setSpsRepairsAndMaintenanceLabororLaborandMaterials(
			String spsRepairsAndMaintenanceLabororLaborandMaterials) {
		this.spsRepairsAndMaintenanceLabororLaborandMaterials = spsRepairsAndMaintenanceLabororLaborandMaterials;
	}

	public String getRepairsAndMaintenanceMaterialsSupplies() {
		return repairsAndMaintenanceMaterialsSupplies;
	}

	public void setRepairsAndMaintenanceMaterialsSupplies(
			String repairsAndMaintenanceMaterialsSupplies) {
		this.repairsAndMaintenanceMaterialsSupplies = repairsAndMaintenanceMaterialsSupplies;
	}

	public String getSpsRepairsAndMaintenanceMaterialsSupplies() {
		return spsRepairsAndMaintenanceMaterialsSupplies;
	}

	public void setSpsRepairsAndMaintenanceMaterialsSupplies(
			String spsRepairsAndMaintenanceMaterialsSupplies) {
		this.spsRepairsAndMaintenanceMaterialsSupplies = spsRepairsAndMaintenanceMaterialsSupplies;
	}

	public String getRepresentationandEntertainment() {
		return representationandEntertainment;
	}

	public void setRepresentationandEntertainment(
			String representationandEntertainment) {
		this.representationandEntertainment = representationandEntertainment;
	}

	public String getSpsRepresentationandEntertainment() {
		return spsRepresentationandEntertainment;
	}

	public void setSpsRepresentationandEntertainment(
			String spsRepresentationandEntertainment) {
		this.spsRepresentationandEntertainment = spsRepresentationandEntertainment;
	}

	public String getResearchandDevelopment() {
		return researchandDevelopment;
	}

	public void setResearchandDevelopment(String researchandDevelopment) {
		this.researchandDevelopment = researchandDevelopment;
	}

	public String getSpsResearchandDevelopment() {
		return spsResearchandDevelopment;
	}

	public void setSpsResearchandDevelopment(String spsResearchandDevelopment) {
		this.spsResearchandDevelopment = spsResearchandDevelopment;
	}

	public String getRoyalties() {
		return royalties;
	}

	public void setRoyalties(String royalties) {
		this.royalties = royalties;
	}

	public String getSpsRoyalties() {
		return spsRoyalties;
	}

	public void setSpsRoyalties(String spsRoyalties) {
		this.spsRoyalties = spsRoyalties;
	}

	public String getSalariesandAllowances() {
		return salariesandAllowances;
	}

	public void setSalariesandAllowances(String salariesandAllowances) {
		this.salariesandAllowances = salariesandAllowances;
	}

	public String getSpsSalariesandAllowances() {
		return spsSalariesandAllowances;
	}

	public void setSpsSalariesandAllowances(String spsSalariesandAllowances) {
		this.spsSalariesandAllowances = spsSalariesandAllowances;
	}

	public String getSecurityandServices() {
		return securityandServices;
	}

	public void setSecurityandServices(String securityandServices) {
		this.securityandServices = securityandServices;
	}

	public String getSpsSecurityandServices() {
		return spsSecurityandServices;
	}

	public void setSpsSecurityandServices(String spsSecurityandServices) {
		this.spsSecurityandServices = spsSecurityandServices;
	}

	public String getsSSGSISPhilhealthHDMFandOtherContributions() {
		return sSSGSISPhilhealthHDMFandOtherContributions;
	}

	public void setsSSGSISPhilhealthHDMFandOtherContributions(
			String sSSGSISPhilhealthHDMFandOtherContributions) {
		this.sSSGSISPhilhealthHDMFandOtherContributions = sSSGSISPhilhealthHDMFandOtherContributions;
	}

	public String getSpsSSSGSISPhilhealthHDMFandOtherContributions() {
		return spsSSSGSISPhilhealthHDMFandOtherContributions;
	}

	public void setSpsSSSGSISPhilhealthHDMFandOtherContributions(
			String spsSSSGSISPhilhealthHDMFandOtherContributions) {
		this.spsSSSGSISPhilhealthHDMFandOtherContributions = spsSSSGSISPhilhealthHDMFandOtherContributions;
	}

	public String getTaxesandLicenses() {
		return taxesandLicenses;
	}

	public void setTaxesandLicenses(String taxesandLicenses) {
		this.taxesandLicenses = taxesandLicenses;
	}

	public String getSpsTaxesandLicenses() {
		return spsTaxesandLicenses;
	}

	public void setSpsTaxesandLicenses(String spsTaxesandLicenses) {
		this.spsTaxesandLicenses = spsTaxesandLicenses;
	}

	public String getTollingFees() {
		return tollingFees;
	}

	public void setTollingFees(String tollingFees) {
		this.tollingFees = tollingFees;
	}

	public String getSpsTollingFees() {
		return spsTollingFees;
	}

	public void setSpsTollingFees(String spsTollingFees) {
		this.spsTollingFees = spsTollingFees;
	}

	public String getTrainingAndSeminars() {
		return trainingAndSeminars;
	}

	public void setTrainingAndSeminars(String trainingAndSeminars) {
		this.trainingAndSeminars = trainingAndSeminars;
	}

	public String getSpsTrainingAndSeminars() {
		return spsTrainingAndSeminars;
	}

	public void setSpsTrainingAndSeminars(String spsTrainingAndSeminars) {
		this.spsTrainingAndSeminars = spsTrainingAndSeminars;
	}

	public String getTrasportationAndTravel() {
		return trasportationAndTravel;
	}

	public void setTrasportationAndTravel(String trasportationAndTravel) {
		this.trasportationAndTravel = trasportationAndTravel;
	}

	public String getSpsTrasportationAndTravel() {
		return spsTrasportationAndTravel;
	}

	public void setSpsTrasportationAndTravel(String spsTrasportationAndTravel) {
		this.spsTrasportationAndTravel = spsTrasportationAndTravel;
	}

	public String getPriorYearsExcessCredits() {
		return priorYearsExcessCredits;
	}

	public void setPriorYearsExcessCredits(String priorYearsExcessCredits) {
		this.priorYearsExcessCredits = priorYearsExcessCredits;
	}

	public String getSpsPriorYearsExcessCredits() {
		return spsPriorYearsExcessCredits;
	}

	public void setSpsPriorYearsExcessCredits(String spsPriorYearsExcessCredits) {
		this.spsPriorYearsExcessCredits = spsPriorYearsExcessCredits;
	}

	public String getTaxPaymentsfortheFirstThreeQuarters() {
		return taxPaymentsfortheFirstThreeQuarters;
	}

	public void setTaxPaymentsfortheFirstThreeQuarters(
			String taxPaymentsfortheFirstThreeQuarters) {
		this.taxPaymentsfortheFirstThreeQuarters = taxPaymentsfortheFirstThreeQuarters;
	}

	public String getSpsTaxPaymentsfortheFirstThreeQuarters() {
		return spsTaxPaymentsfortheFirstThreeQuarters;
	}

	public void setSpsTaxPaymentsfortheFirstThreeQuarters(
			String spsTaxPaymentsfortheFirstThreeQuarters) {
		this.spsTaxPaymentsfortheFirstThreeQuarters = spsTaxPaymentsfortheFirstThreeQuarters;
	}

	public String getCreditableTaxWithheldfortheFirstThreeQuarters() {
		return creditableTaxWithheldfortheFirstThreeQuarters;
	}

	public void setCreditableTaxWithheldfortheFirstThreeQuarters(
			String creditableTaxWithheldfortheFirstThreeQuarters) {
		this.creditableTaxWithheldfortheFirstThreeQuarters = creditableTaxWithheldfortheFirstThreeQuarters;
	}

	public String getSpsCreditableTaxWithheldfortheFirstThreeQuarters() {
		return spsCreditableTaxWithheldfortheFirstThreeQuarters;
	}

	public void setSpsCreditableTaxWithheldfortheFirstThreeQuarters(
			String spsCreditableTaxWithheldfortheFirstThreeQuarters) {
		this.spsCreditableTaxWithheldfortheFirstThreeQuarters = spsCreditableTaxWithheldfortheFirstThreeQuarters;
	}

	public String getCreditableTaxWithheldfortheFourthQuarter() {
		return creditableTaxWithheldfortheFourthQuarter;
	}

	public void setCreditableTaxWithheldfortheFourthQuarter(
			String creditableTaxWithheldfortheFourthQuarter) {
		this.creditableTaxWithheldfortheFourthQuarter = creditableTaxWithheldfortheFourthQuarter;
	}

	public String getSpsCreditableTaxWithheldfortheFourthQuarter() {
		return spsCreditableTaxWithheldfortheFourthQuarter;
	}

	public void setSpsCreditableTaxWithheldfortheFourthQuarter(
			String spsCreditableTaxWithheldfortheFourthQuarter) {
		this.spsCreditableTaxWithheldfortheFourthQuarter = spsCreditableTaxWithheldfortheFourthQuarter;
	}

	public String getTaxWithheldperBIRFormNo2316() {
		return taxWithheldperBIRFormNo2316;
	}

	public void setTaxWithheldperBIRFormNo2316(String taxWithheldperBIRFormNo2316) {
		this.taxWithheldperBIRFormNo2316 = taxWithheldperBIRFormNo2316;
	}

	public String getSpsTaxWithheldperBIRFormNo2316() {
		return spsTaxWithheldperBIRFormNo2316;
	}

	public void setSpsTaxWithheldperBIRFormNo2316(
			String spsTaxWithheldperBIRFormNo2316) {
		this.spsTaxWithheldperBIRFormNo2316 = spsTaxWithheldperBIRFormNo2316;
	}

	public String getTaxPaidinreturnpreviouslyfiled() {
		return taxPaidinreturnpreviouslyfiled;
	}

	public void setTaxPaidinreturnpreviouslyfiled(
			String taxPaidinreturnpreviouslyfiled) {
		this.taxPaidinreturnpreviouslyfiled = taxPaidinreturnpreviouslyfiled;
	}

	public String getSpsTaxPaidinreturnpreviouslyfiled() {
		return spsTaxPaidinreturnpreviouslyfiled;
	}

	public void setSpsTaxPaidinreturnpreviouslyfiled(
			String spsTaxPaidinreturnpreviouslyfiled) {
		this.spsTaxPaidinreturnpreviouslyfiled = spsTaxPaidinreturnpreviouslyfiled;
	}

	public String getForeignTaxCredits() {
		return foreignTaxCredits;
	}

	public void setForeignTaxCredits(String foreignTaxCredits) {
		this.foreignTaxCredits = foreignTaxCredits;
	}

	public String getSpsForeignTaxCredits() {
		return spsForeignTaxCredits;
	}

	public void setSpsForeignTaxCredits(String spsForeignTaxCredits) {
		this.spsForeignTaxCredits = spsForeignTaxCredits;
	}

	public String getOtherPaymentsCreditsSpecify() {
		return otherPaymentsCreditsSpecify;
	}

	public void setOtherPaymentsCreditsSpecify(String otherPaymentsCreditsSpecify) {
		this.otherPaymentsCreditsSpecify = otherPaymentsCreditsSpecify;
	}

	public String getSpsOtherPaymentsCreditsSpecify() {
		return spsOtherPaymentsCreditsSpecify;
	}

	public void setSpsOtherPaymentsCreditsSpecify(
			String spsOtherPaymentsCreditsSpecify) {
		this.spsOtherPaymentsCreditsSpecify = spsOtherPaymentsCreditsSpecify;
	}

	public String getTotalTaxCreditsPayments() {
		return totalTaxCreditsPayments;
	}

	public void setTotalTaxCreditsPayments(String totalTaxCreditsPayments) {
		this.totalTaxCreditsPayments = totalTaxCreditsPayments;
	}

	public String getSpsTotalTaxCreditsPayments() {
		return spsTotalTaxCreditsPayments;
	}

	public void setSpsTotalTaxCreditsPayments(String spsTotalTaxCreditsPayments) {
		this.spsTotalTaxCreditsPayments = spsTotalTaxCreditsPayments;
	}

	public String getNetIncomeLossPerBooks() {
		return netIncomeLossPerBooks;
	}

	public void setNetIncomeLossPerBooks(String netIncomeLossPerBooks) {
		this.netIncomeLossPerBooks = netIncomeLossPerBooks;
	}

	public String getTotalSumOfItems1to3() {
		return totalSumOfItems1to3;
	}

	public void setTotalSumOfItems1to3(String totalSumOfItems1to3) {
		this.totalSumOfItems1to3 = totalSumOfItems1to3;
	}

	public String getTotalSumOfItems5to8() {
		return totalSumOfItems5to8;
	}

	public void setTotalSumOfItems5to8(String totalSumOfItems5to8) {
		this.totalSumOfItems5to8 = totalSumOfItems5to8;
	}

	public String getNetTaxableIncomeLossTaxFiler() {
		return netTaxableIncomeLossTaxFiler;
	}

	public void setNetTaxableIncomeLossTaxFiler(String netTaxableIncomeLossTaxFiler) {
		this.netTaxableIncomeLossTaxFiler = netTaxableIncomeLossTaxFiler;
	}

	public String getSpsNetIncomeLossPerBooks() {
		return spsNetIncomeLossPerBooks;
	}

	public void setSpsNetIncomeLossPerBooks(String spsNetIncomeLossPerBooks) {
		this.spsNetIncomeLossPerBooks = spsNetIncomeLossPerBooks;
	}

	public String getSpsTotalSumOfItems1to3() {
		return spsTotalSumOfItems1to3;
	}

	public void setSpsTotalSumOfItems1to3(String spsTotalSumOfItems1to3) {
		this.spsTotalSumOfItems1to3 = spsTotalSumOfItems1to3;
	}

	public String getSpsTotalSumOfItems5to8() {
		return spsTotalSumOfItems5to8;
	}

	public void setSpsTotalSumOfItems5to8(String spsTotalSumOfItems5to8) {
		this.spsTotalSumOfItems5to8 = spsTotalSumOfItems5to8;
	}

	public String getSpsNetTaxableIncomeLossTaxFiler() {
		return spsNetTaxableIncomeLossTaxFiler;
	}

	public void setSpsNetTaxableIncomeLossTaxFiler(
			String spsNetTaxableIncomeLossTaxFiler) {
		this.spsNetTaxableIncomeLossTaxFiler = spsNetTaxableIncomeLossTaxFiler;
	}

	public String getSpecialTaxRate() {
		return specialTaxRate;
	}

	public void setSpecialTaxRate(String specialTaxRate) {
		this.specialTaxRate = specialTaxRate;
	}

	public String getSpecialTaxRated() {
		return specialTaxRated;
	}

	public void setSpecialTaxRated(String specialTaxRated) {
		this.specialTaxRated = specialTaxRated;
	}

	public String getSpecialTaxRateFull() {
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.isNotBlank(getSpecialTaxRate()) ? getSpecialTaxRate() :"0");
		sb.append(".");
		sb.append(StringUtils.isNotBlank(getSpecialTaxRated()) ? getSpecialTaxRated() :"0");
		return sb.toString();
	}

	public String getSpsSpecialTaxRate() {
		return spsSpecialTaxRate;
	}

	public void setSpsSpecialTaxRate(String spsSpecialTaxRate) {
		this.spsSpecialTaxRate = spsSpecialTaxRate;
	}

	public String getSpsSpecialTaxRated() {
		return spsSpecialTaxRated;
	}

	public void setSpsSpecialTaxRated(String spsSpecialTaxRated) {
		this.spsSpecialTaxRated = spsSpecialTaxRated;
	}

	public String getSpsSpecialTaxRateFull() {
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.isNotBlank(getSpsSpecialTaxRate()) ? getSpsSpecialTaxRate() :"0");
		sb.append(".");
		sb.append(StringUtils.isNotBlank(getSpsSpecialTaxRated()) ? getSpsSpecialTaxRated() :"0");
		return sb.toString();
	}

	public Date getEffectivityDateofTaxReliefExemptionFrom() {
		return effectivityDateofTaxReliefExemptionFrom;
	}

	public void setEffectivityDateofTaxReliefExemptionFrom(
			Date effectivityDateofTaxReliefExemptionFrom) {
		this.effectivityDateofTaxReliefExemptionFrom = effectivityDateofTaxReliefExemptionFrom;
	}

	public Date getSpsEffectivityDateofTaxReliefExemptionFrom() {
		return spsEffectivityDateofTaxReliefExemptionFrom;
	}

	public void setSpsEffectivityDateofTaxReliefExemptionFrom(
			Date spsEffectivityDateofTaxReliefExemptionFrom) {
		this.spsEffectivityDateofTaxReliefExemptionFrom = spsEffectivityDateofTaxReliefExemptionFrom;
	}

	public Date getEffectivityDateofTaxReliefExemptionTo() {
		return effectivityDateofTaxReliefExemptionTo;
	}

	public void setEffectivityDateofTaxReliefExemptionTo(
			Date effectivityDateofTaxReliefExemptionTo) {
		this.effectivityDateofTaxReliefExemptionTo = effectivityDateofTaxReliefExemptionTo;
	}

	public Date getSpsEffectivityDateofTaxReliefExemptionTo() {
		return spsEffectivityDateofTaxReliefExemptionTo;
	}

	public void setSpsEffectivityDateofTaxReliefExemptionTo(
			Date spsEffectivityDateofTaxReliefExemptionTo) {
		this.spsEffectivityDateofTaxReliefExemptionTo = spsEffectivityDateofTaxReliefExemptionTo;
	}

	public String getGrossIncomefromBusiness() {
		return grossIncomefromBusiness;
	}

	public void setGrossIncomefromBusiness(String grossIncomefromBusiness) {
		this.grossIncomefromBusiness = grossIncomefromBusiness;
	}

	public String getSpsGrossIncomefromBusiness() {
		return spsGrossIncomefromBusiness;
	}

	public void setSpsGrossIncomefromBusiness(String spsGrossIncomefromBusiness) {
		this.spsGrossIncomefromBusiness = spsGrossIncomefromBusiness;
	}

	public String getAmortizations() {
		return amortizations;
	}

	public void setAmortizations(String amortizations) {
		this.amortizations = amortizations;
	}

	public String getSpsAmortizations() {
		return spsAmortizations;
	}

	public void setSpsAmortizations(String spsAmortizations) {
		this.spsAmortizations = spsAmortizations;
	}

	public IteratingFields getScheduleG() {
		return scheduleG;
	}

	public void setScheduleG(IteratingFields scheduleG) {
		this.scheduleG = scheduleG;
	}

	public IteratingFields getScheduleHAmmortizations() {
		return scheduleHAmmortizations;
	}

	public void setScheduleHAmmortizations(IteratingFields scheduleHAmmortizations) {
		this.scheduleHAmmortizations = scheduleHAmmortizations;
	}

	public IteratingFields getScheduleHOthers() {
		return scheduleHOthers;
	}

	public void setScheduleHOthers(IteratingFields scheduleHOthers) {
		this.scheduleHOthers = scheduleHOthers;
	}

	public IteratingFields getScheduleI() {
		return scheduleI;
	}

	public void setScheduleI(IteratingFields scheduleI) {
		this.scheduleI = scheduleI;
	}

	public IteratingFields getScheduleK1_ND() {
		return scheduleK1_ND;
	}

	public void setScheduleK1_ND(IteratingFields scheduleK_ND) {
		this.scheduleK1_ND = scheduleK_ND;
	}

	public IteratingFields getScheduleK1_NT() {
		return scheduleK1_NT;
	}

	public void setScheduleK1_NT(IteratingFields scheduleK_NT) {
		this.scheduleK1_NT = scheduleK_NT;
	}

	public IteratingFields getScheduleK1_SD() {
		return scheduleK1_SD;
	}

	public void setScheduleK1_SD(IteratingFields scheduleK_SD) {
		this.scheduleK1_SD = scheduleK_SD;
	}

	public IteratingFields getScheduleE() {
		return scheduleE;
	}

	public void setScheduleE(IteratingFields scheduleE) {
		scheduleE = this.scheduleE;
	}

	public IteratingFields getScheduleK2_ND() {
		return scheduleK2_ND;
	}

	public void setScheduleK2_ND(IteratingFields scheduleK2_ND) {
		this.scheduleK2_ND = scheduleK2_ND;
	}

	public IteratingFields getScheduleK2_NT() {
		return scheduleK2_NT;
	}

	public void setScheduleK2_NT(IteratingFields scheduleK2_NT) {
		this.scheduleK2_NT = scheduleK2_NT;
	}

	public IteratingFields getScheduleK2_SD() {
		return scheduleK2_SD;
	}

	public void setScheduleK2_SD(IteratingFields scheduleK2_SD) {
		this.scheduleK2_SD = scheduleK2_SD;
	}

}
