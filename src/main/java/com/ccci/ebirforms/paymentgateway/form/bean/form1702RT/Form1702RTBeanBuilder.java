/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import com.ccci.ebirforms.paymentgateway.form.bean.attachments.GrossIncomeFinalWithholding;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OperatingLoss;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherExpandable;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.OtherIncome;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.PersonalRealPropertiesReceived;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.RealPropertiesSalesExchange;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.SharesOfStockSalesExchange;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.SpecialAllowableItemizedDeductions;
import com.ccci.ebirforms.paymentgateway.form.bean.attachments.StockholdersPartners;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * @author sardenj
 *
 */
public class Form1702RTBeanBuilder {
	//constants
	public static final String FORM_CODE_1702_RT = "1702RT";
	public static final SimpleDateFormat MONTH_FORMAT = new SimpleDateFormat("M");
	public static final SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy");
	public static final SimpleDateFormat STD_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
	public static final SimpleDateFormat YEAR_MONTH_DAY = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat MONTH_YEAR_FORMAT = new SimpleDateFormat("MM/yyyy");
	public static final SimpleDateFormat STREAM_DATE_FORMAT = new SimpleDateFormat("MMddyyyy");
	public static final DecimalFormat FIX_NEGATIVE = new DecimalFormat("#,###;(#,###)");
	
	public static void moveTransferObjectToBean(Form1702RTBean form1702RTBean, Form1702RTTO transferObject) {
		//initialize persisted length of collapsable tables
//		initializeSchedulePersistedLength(form1702RTBean, transferObject);
		int index = 0;
		int collapsableSeq = 0;
		//ReturnTransaction_1702_RT
		ReturnTransaction_1702_RT transaction = null;
		          System.out.println(transferObject.getTrans1702RT().toString());
		if(transferObject.getTrans1702RT() != null){
			transaction = transferObject.getTrans1702RT();
		}else{
			transaction = new ReturnTransaction_1702_RT();
		}
		
		moveTransactionToBean(transaction, form1702RTBean);
		moveHistoryToBean(transferObject.getHistory1702RT(), form1702RTBean);		
		
		if(transferObject.getTaxagent1702RT() != null){
			form1702RTBean.setNameExternalAuditorAccreditedTaxAgent(transferObject.getTaxagent1702RT().getExternalAuditor());
			if(!Form1702RTBeanBuilder.isEmpty(transferObject.getTaxagent1702RT().getAuditorTin())){
				form1702RTBean.setTin1ExternalAuditorAccreditedTaxAgent(transferObject.getTaxagent1702RT().getAuditorTin().substring(0,3));
				form1702RTBean.setTin2ExternalAuditorAccreditedTaxAgent(transferObject.getTaxagent1702RT().getAuditorTin().substring(3,6));
				form1702RTBean.setTin3ExternalAuditorAccreditedTaxAgent(transferObject.getTaxagent1702RT().getAuditorTin().substring(6,9));
				form1702RTBean.setTinBranchExternalAuditorAccreditedTaxAgent(transferObject.getTaxagent1702RT().getAuditorTin().substring(9,12));
			}
			
			form1702RTBean.setNameSigningPartner(transferObject.getTaxagent1702RT().getPartnerName());
			
			if(!Form1702RTBeanBuilder.isEmpty(transferObject.getTaxagent1702RT().getPartnerTin())){
				form1702RTBean.setTin1SigningPartner(transferObject.getTaxagent1702RT().getPartnerTin().substring(0,3));
				form1702RTBean.setTin2SigningPartner(transferObject.getTaxagent1702RT().getPartnerTin().substring(3,6));
				form1702RTBean.setTin3SigningPartner(transferObject.getTaxagent1702RT().getPartnerTin().substring(6,9));
				form1702RTBean.setTinBranchSigningPartner(transferObject.getTaxagent1702RT().getPartnerTin().substring(9,12));
			}
			
			if(!Form1702RTBeanBuilder.isEmpty(transferObject.getTaxagent1702RT().getAccreditationNo())){
				form1702RTBean.setBirAccreditationNo1(transferObject.getTaxagent1702RT().getAccreditationNo().substring(0,2));
				form1702RTBean.setBirAccreditationNo2(transferObject.getTaxagent1702RT().getAccreditationNo().substring(2,8));
				form1702RTBean.setBirAccreditationNo3(transferObject.getTaxagent1702RT().getAccreditationNo().substring(8,11));
				form1702RTBean.setBirAccreditationNo4(transferObject.getTaxagent1702RT().getAccreditationNo().substring(11));
			}
			
			form1702RTBean.setBirAccreditationIssueDate(transferObject.getTaxagent1702RT().getIssuedDate());
			form1702RTBean.setBirAccreditationExpiryDate(transferObject.getTaxagent1702RT().getExpiryDate());
		}
		
		if(transferObject.getTaxpayer1702RT() != null){
			//ReturnTaxpayer_1702_RT
			form1702RTBean.setNetSalesRevenuesReceiptsFees(
					dblToString(transferObject.getTaxpayer1702RT().getNetSales()));
			form1702RTBean.setCostSalesServices(
					dblToString(transferObject.getTaxpayer1702RT().getCostOfSale()));
			form1702RTBean.setGrossIncomeFromOperation(
					dblToString(transferObject.getTaxpayer1702RT().getGrossIncomeFromOperation()));
			form1702RTBean.setOtherTaxableIncomeNotSubjectedToFinalTax(
					dblToString(transferObject.getTaxpayer1702RT().getOtherTaxableIncome()));
			form1702RTBean.setTotalGrossIncome(
					dblToString(transferObject.getTaxpayer1702RT().getTotalGrossIncome()));
			form1702RTBean.setOrdinaryAllowableItemizedDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getOrdinaryAllowableItemizedDeduction()));
			form1702RTBean.setSpecialAllowableItemizedDeductions36(
					dblToString(transferObject.getTaxpayer1702RT().getSpecialAllowableItemizedDeduction()));
			form1702RTBean.setNolco(
					dblToString(transferObject.getTaxpayer1702RT().getNolco()));
			form1702RTBean.setTotalItemizedDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getTotalDeduction()));
			form1702RTBean.setOptionalStandardDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getOptionalDeduction()));
			form1702RTBean.setNetTaxableIncome(
					dblToString(transferObject.getTaxpayer1702RT().getNetTaxableIncome()));
			form1702RTBean.setIncomeTaxRate(
					dblToString(transferObject.getTaxpayer1702RT().getIncomeTaxRate()));
			form1702RTBean.setIncomeTaxDueOtherThanMCIT(
					dblToString(transferObject.getTaxpayer1702RT().getIncomeTaxDue()));
			form1702RTBean.setMinimumCorporateIncomeTax(
					dblToString(transferObject.getTaxpayer1702RT().getMinimumCorporateIncomeTax()));
			form1702RTBean.setTotalIncomeTaxDue44(
					dblToString(transferObject.getTaxpayer1702RT().getTotalIncomeTaxDue()));
			form1702RTBean.setTotalTaxCreditsPayments45(
					dblToString(transferObject.getTaxpayer1702RT().getTotalTaxPayment()));
			form1702RTBean.setNetTaxPayable46(
					dblToString(transferObject.getTaxpayer1702RT().getNetTaxPayable()));
			form1702RTBean.setSurcharge(
					dblToString(transferObject.getTaxpayer1702RT().getSurcharge()));
			form1702RTBean.setInterest(
					dblToString(transferObject.getTaxpayer1702RT().getInterest()));
			form1702RTBean.setCompromise(
					dblToString(transferObject.getTaxpayer1702RT().getCompromise()));
			form1702RTBean.setTotalPenalties50(
					dblToString(transferObject.getTaxpayer1702RT().getTotalPenalties()));
			form1702RTBean.setTotalAmountPayable(transferObject.getTaxpayer1702RT().getTotalAmountPayable());
			form1702RTBean.setSpecialAllowableItemizedDeductions52(
					dblToString(transferObject.getTaxpayer1702RT().getReliefItemizedDeduction()));
			form1702RTBean.setSpecialTaxCredits(
					dblToString(transferObject.getTaxpayer1702RT().getSpecialTaxCredit()));
			form1702RTBean.setTotalTaxReliefAvailment(
					dblToString(transferObject.getTaxpayer1702RT().getTotalTaxReliefAvailment()));

			//form1702RTBean.set(
			//		dblToString(transferObject.getTaxpayer1702RT().getTotalNonOperationIncome()));
			form1702RTBean.setTotalOrdinaryAllowableItemizedDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getTotalOrdinaryDeduction()));
			form1702RTBean.setTotalSpecialAllowableItemizedDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getTotalSpecialDeduction()));
			form1702RTBean.setGrossIncome(
					dblToString(transferObject.getTaxpayer1702RT().getGrossIncome()));
			form1702RTBean.setLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw(
					dblToString(transferObject.getTaxpayer1702RT().getTotalDeductableExlNolco()));
			form1702RTBean.setNetOperatingLoss(
					dblToString(transferObject.getTaxpayer1702RT().getNetOperationLoss()));
			form1702RTBean.setTotalNOLCO(
					dblToString(transferObject.getTaxpayer1702RT().getTotalNolco()));
			form1702RTBean.setTotalTaxCredits(
					dblToString(transferObject.getTaxpayer1702RT().getTotalTaxCredits()));
			form1702RTBean.setTotalExcessCreditsMCIT(
					dblToString(transferObject.getTaxpayer1702RT().getTotalExcessMCIT()));
			form1702RTBean.setTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions(
					dblToString(transferObject.getTaxpayer1702RT().getTotalSumReconNetIncome()));
			form1702RTBean.setSched9NetTaxableIncome(
					dblToString(transferObject.getTaxpayer1702RT().getTotalDIfReconNetIncome()));
			form1702RTBean.setTotalFinalTaxWithheldPaid(
					dblToString(transferObject.getTaxpayer1702RT().getTotalFinalTaxWitheld()));
			form1702RTBean.setTotalIncomeExemptFromTax(
					dblToString(transferObject.getTaxpayer1702RT().getTotalIncomeExempt()));

			//ReturnSchedule_1_1702_RT
		}
		
		if(transferObject.getSched011702RT() != null){
			form1702RTBean.setSaleOfGoodsProperties(
					dblToString(transferObject.getSched011702RT().getSaleOfGoods()));
			form1702RTBean.setSaleOfServices(
					dblToString(transferObject.getSched011702RT().getSaleOfServices()));
			form1702RTBean.setLeaseOfProperties(
					dblToString(transferObject.getSched011702RT().getLeaseOfProperties()));
			form1702RTBean.setTotal(
					dblToString(transferObject.getSched011702RT().getTotalSales()));
			form1702RTBean.setLessSalesReturnDiscounts(
					dblToString(transferObject.getSched011702RT().getSalesDiscount()));
			form1702RTBean.setNetSalesRevenuesReceiptsFeesSchedule1(
					dblToString(transferObject.getSched011702RT().getNetSales()));
		}
		
		if(transferObject.getSched2A1702RT() != null){
			//ReturnSchedule_2A_1702_RT
			form1702RTBean.setMerchandiseInventoryBeginning(
					dblToString(transferObject.getSched2A1702RT().getMerchadiseInventory()));
			form1702RTBean.setAddPurchaseOfMerchandise(
					dblToString(transferObject.getSched2A1702RT().getPurchaseOfMerchadise()));
			form1702RTBean.setTotalGoodsAvailableForSale(
					dblToString(transferObject.getSched2A1702RT().getTotalGoodAvailableForSale()));
			form1702RTBean.setLessMerchandiseInventoryEnding(
					dblToString(transferObject.getSched2A1702RT().getDeductibleMerchandiseInventory()));
			form1702RTBean.setCostOfSales(
					dblToString(transferObject.getSched2A1702RT().getCostOfSale()));
		}
		
		if(transferObject.getSched2B1702RT() != null){
			//ReturnSchedule_2B_1702_RT
			form1702RTBean.setDirectMaterialsBeginning(
					dblToString(transferObject.getSched2B1702RT().getDirectMaterials()));
			form1702RTBean.setAddPurchasesOfDirectMaterials(
					dblToString(transferObject.getSched2B1702RT().getPurchaseOfDirectMaterials()));
			form1702RTBean.setMaterialsAvalableForUse(
					dblToString(transferObject.getSched2B1702RT().getMaterialsAvailableForUse()));
			form1702RTBean.setLessDirectMaterialsEnding(
					dblToString(transferObject.getSched2B1702RT().getLessDirectMaterial()));
			form1702RTBean.setRawMaterialsUsed(
					dblToString(transferObject.getSched2B1702RT().getRawMaterialUsed()));
			form1702RTBean.setDirectLabor(
					dblToString(transferObject.getSched2B1702RT().getDirectLabor()));
			form1702RTBean.setManufacturingOverhead(
					dblToString(transferObject.getSched2B1702RT().getManufacturingOverhead()));
			form1702RTBean.setTotalManufacturingCost(
					dblToString(transferObject.getSched2B1702RT().getTotalManufacturingCost()));
			form1702RTBean.setAddWorkInProcessBeginning(
					dblToString(transferObject.getSched2B1702RT().getWorkProcessBegin()));
			form1702RTBean.setLessWorkInProcessEnding(
					dblToString(transferObject.getSched2B1702RT().getLessWorkProcessEnd()));
			form1702RTBean.setCostOfGoodsManufactured(
					dblToString(transferObject.getSched2B1702RT().getCostOfGoodManufactured()));
			form1702RTBean.setFinishedGoodsBeginning(
					dblToString(transferObject.getSched2B1702RT().getFinishedGoodBegin()));
			form1702RTBean.setLessFinishedGoodsEnding(
					dblToString(transferObject.getSched2B1702RT().getLessFinishedGood()));
			form1702RTBean.setCostOfGoodsManufacturedAndSold(
					dblToString(transferObject.getSched2B1702RT().getGoodManufacturedAndSold()));
		}
		
		if(transferObject.getSched2C1702RT() != null){
			//ReturnSchedule_2C_1702_RT
			form1702RTBean.setDirectChargesSalariesWagesAndBenefits(
					dblToString(transferObject.getSched2C1702RT().getSalaries()));
			form1702RTBean.setDirectChargesMaterialsSuppliesAndFacilities(
					dblToString(transferObject.getSched2C1702RT().getMaterials()));
			form1702RTBean.setDirectChargesDepreciation(
					dblToString(transferObject.getSched2C1702RT().getDepreciation()));
			form1702RTBean.setDirectChargesRental(
					dblToString(transferObject.getSched2C1702RT().getRental()));
			form1702RTBean.setDirectChargesOutsideServices(
					dblToString(transferObject.getSched2C1702RT().getOutsideServices()));
			form1702RTBean.setDirectChargesOthers(
					dblToString(transferObject.getSched2C1702RT().getOthers()));
			form1702RTBean.setTotalCostOfSalesServices(
					dblToString(transferObject.getSched2C1702RT().getTotalCostOfServices()));
		}
		
		if(transferObject.getSched31702RTList() != null && transferObject.getSched31702RTList().size() > 0){
			//ReturnSchedule_3_1702_RT
			List<OtherExpandable> tList3 = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched3AdditionalAttachments(tList3);

			OtherExpandable tSched3;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_3_1702_RT aa : transferObject.getSched31702RTList()) {
				//if first transferObject element set bean property 1
				if (index == 1) {
					form1702RTBean.setOtherTaxIncomeDescription1(aa.getOtherTaxableIncomeDesc());
					form1702RTBean.setOtherTaxIncomeAmount1(dblToString(aa.getOtherTaxableIncomeAmount()));
				}
				//if second transferObject element set bean property 2
				else if (index == 2) {
					form1702RTBean.setOtherTaxIncomeDescription2(aa.getOtherTaxableIncomeDesc());
					form1702RTBean.setOtherTaxIncomeAmount2(dblToString(aa.getOtherTaxableIncomeAmount()));
				}
				//if transferObject list is only size 3 set bean property 3
				else if (transferObject.getSched31702RTList().size() == 3) {
					form1702RTBean.setOtherTaxIncomeDescription3(aa.getOtherTaxableIncomeDesc());
					form1702RTBean.setOtherTaxIncomeAmount3(dblToString(aa.getOtherTaxableIncomeAmount()));
				}
				//else copy transferObject list too bean list
				else {
					form1702RTBean.setOtherTaxIncomeDescription3("OTHERS");					
					tSched3 = new OtherExpandable();
					tSched3.setSequenceNumber("3." + collapsableSeq++);
					tSched3.setDescription(aa.getOtherTaxableIncomeDesc());
					tSched3.setValue(dblToString(aa.getOtherTaxableIncomeAmount()));
					tList3.add(tSched3);
				}
				index++;
			}
		}
		
		if(transferObject.getSched4A1702RTList() != null && transferObject.getSched4A1702RTList().size() > 0){
			//ReturnSchedule_4A_1702_RT
			List<OtherExpandable> tList4a = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched4AdditionalAttachments1(tList4a);

			OtherExpandable tSched4a;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_4A_1702_RT aa : transferObject.getSched4A1702RTList()) {
				if (index == 1) {
					form1702RTBean.setAmortizationsDescription1(aa.getAmortizationName());
					form1702RTBean.setAmortizationsAmount1(dblToString(aa.getAmount()));
				}
				else if (index == 2) {
					form1702RTBean.setAmortizationsDescription2(aa.getAmortizationName());
					form1702RTBean.setAmortizationsAmount2(dblToString(aa.getAmount()));
				}
				else if (transferObject.getSched4A1702RTList().size() == 3) {
					form1702RTBean.setAmortizationsDescription3(aa.getAmortizationName());
					form1702RTBean.setAmortizationsAmount3(dblToString(aa.getAmount()));
				}
				else {
					form1702RTBean.setAmortizationsDescription3("OTHERS");
					tSched4a = new OtherExpandable();
					tSched4a.setSequenceNumber("4." + String.valueOf(collapsableSeq++));
					tSched4a.setDescription(aa.getAmortizationName());
					tSched4a.setValue(dblToString(aa.getAmount()));
					tList4a.add(tSched4a);
				}
				index++;
			}
		}
		
		if(transferObject.getSched4B1702RT() != null){
			//ReturnSchedule_4B_1702_RT
			form1702RTBean.setAdvertisingAndPromotions(
					dblToString(transferObject.getSched4B1702RT().getAdvertisingAndPromotion()));
			form1702RTBean.setBadDebts(
					dblToString(transferObject.getSched4B1702RT().getBadDebts()));
			form1702RTBean.setCharitableContributions(
					dblToString(transferObject.getSched4B1702RT().getCharitableContribution()));
			form1702RTBean.setCommissions(
					dblToString(transferObject.getSched4B1702RT().getCommissions()));
			form1702RTBean.setCommunicationLightAndWater(
					dblToString(transferObject.getSched4B1702RT().getCommunicationLigthWater()));
			form1702RTBean.setDepletion(
					dblToString(transferObject.getSched4B1702RT().getDepletion()));
			form1702RTBean.setDepreciation(
					dblToString(transferObject.getSched4B1702RT().getDepreciation()));
			form1702RTBean.setDirectorsFees(
					dblToString(transferObject.getSched4B1702RT().getDirectorFee()));
			form1702RTBean.setFringeBenefits(
					dblToString(transferObject.getSched4B1702RT().getFringeBenefit()));
			form1702RTBean.setFuelAndOil(
					dblToString(transferObject.getSched4B1702RT().getFuelAndOil()));
			form1702RTBean.setInsurance(
					dblToString(transferObject.getSched4B1702RT().getInsurance()));
			form1702RTBean.setInterestSchedule4(
					dblToString(transferObject.getSched4B1702RT().getInterest()));
			form1702RTBean.setJanitorialAndMessengerialServices(
					dblToString(transferObject.getSched4B1702RT().getJanitorialServices()));
			form1702RTBean.setLosses(
					dblToString(transferObject.getSched4B1702RT().getLosses()));
			form1702RTBean.setManagementAndConsultancyFee(
					dblToString(transferObject.getSched4B1702RT().getManagementAndConsultanyFee()));
			form1702RTBean.setMiscellaneous(
					dblToString(transferObject.getSched4B1702RT().getMiscellaneous()));
			form1702RTBean.setOfficeSupplies(
					dblToString(transferObject.getSched4B1702RT().getOfficeSupplies()));
			form1702RTBean.setOtherServices(
					dblToString(transferObject.getSched4B1702RT().getOtherServices()));
			form1702RTBean.setProfessionalFees(
					dblToString(transferObject.getSched4B1702RT().getProfessionalFees()));
			form1702RTBean.setRental(
					dblToString(transferObject.getSched4B1702RT().getRental()));
			form1702RTBean.setRepairsAndMaintenanceLaborOrLaborAndMaterials(
					dblToString(transferObject.getSched4B1702RT().getMaintenanceLabor()));
			form1702RTBean.setRepairsAndMaintenanceMaterialSupplies(
					dblToString(transferObject.getSched4B1702RT().getMaintenanceMaterial()));
			form1702RTBean.setRepresentationAndEntertainment(
					dblToString(transferObject.getSched4B1702RT().getRepresentationAndEntertainment()));
			form1702RTBean.setResearchAndDevelopment(
					dblToString(transferObject.getSched4B1702RT().getResearchAndDevelopment()));
			form1702RTBean.setRoyalties(
					dblToString(transferObject.getSched4B1702RT().getRoyalties()));
			form1702RTBean.setSalariesAndAllowances(
					dblToString(transferObject.getSched4B1702RT().getSalariesAndAllowance()));
			form1702RTBean.setSecurityServices(
					dblToString(transferObject.getSched4B1702RT().getSecurityServices()));
			form1702RTBean.setSSSGSISPhilhealthHDMFAndOtherContributions(
					dblToString(transferObject.getSched4B1702RT().getOtherContribution()));
			form1702RTBean.setTaxesAndLicenses(
					dblToString(transferObject.getSched4B1702RT().getTaxesAndLicense()));
			form1702RTBean.setTollingFees(
					dblToString(transferObject.getSched4B1702RT().getTollingFee()));
			form1702RTBean.setTrainingAndSeminars(
					dblToString(transferObject.getSched4B1702RT().getTrainingAndSeminar()));
			form1702RTBean.setTranspotationAndTravel(
					dblToString(transferObject.getSched4B1702RT().getTransportaionAndTravel()));
		}
		
		if(transferObject.getSched4C1702RTList() != null && transferObject.getSched4C1702RTList().size() > 0){
			//ReturnSchedule_4C_1702_RT
			List<OtherExpandable> tList4c = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched4AdditionalAttachments2(tList4c);

			OtherExpandable tSched4c;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_4C_1702_RT aa : transferObject.getSched4C1702RTList()) {
				if (index == 1) {
					form1702RTBean.setOthersDescription1(aa.getOtherName());
					form1702RTBean.setOthersAmount1(dblToString(aa.getAmount()));
				}
				else if (index == 2) {
					form1702RTBean.setOthersDescription2(aa.getOtherName());
					form1702RTBean.setOthersAmount2(dblToString(aa.getAmount()));
				}
				else if (index == 3) {
					form1702RTBean.setOthersDescription3(aa.getOtherName());
					form1702RTBean.setOthersAmount3(dblToString(aa.getAmount()));
				}
				else if (transferObject.getSched4C1702RTList().size() == 4) {
					form1702RTBean.setOthersDescription4(aa.getOtherName());
					form1702RTBean.setOthersAmount4(dblToString(aa.getAmount()));
				}
				else {
					form1702RTBean.setOthersDescription4("OTHERS");
					tSched4c = new OtherExpandable();
					tSched4c.setSequenceNumber("39." + String.valueOf(collapsableSeq++));
					tSched4c.setDescription(aa.getOtherName());
					tSched4c.setValue(dblToString(aa.getAmount()));
					tList4c.add(tSched4c);
				}
				index++;
			}
		}
		
		if(transferObject.getSched51702RTList() != null && transferObject.getSched51702RTList().size() > 0){
			//ReturnSchedule_5_1702_RT
			List<SpecialAllowableItemizedDeductions> tList5 = new ArrayList<SpecialAllowableItemizedDeductions>();
			form1702RTBean.setSched5AdditionalAttachments(tList5);

			SpecialAllowableItemizedDeductions tSched5;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_5_1702_RT aa : transferObject.getSched51702RTList()) {
				if (index == 1) {
					form1702RTBean.setSpecialAllowableItemizedDeductionsDescription1(aa.getSaidDeduction());
					form1702RTBean.setSpecialAllowableItemizedDeductionsLegalBasis1(aa.getSaidLegalBasis());
					form1702RTBean.setSpecialAllowableItemizedDeductionsAmount1(dblToString(aa.getSaidAmount()));
				}
				else if (index == 2) {
					form1702RTBean.setSpecialAllowableItemizedDeductionsDescription2(aa.getSaidDeduction());
					form1702RTBean.setSpecialAllowableItemizedDeductionsLegalBasis2(aa.getSaidLegalBasis());
					form1702RTBean.setSpecialAllowableItemizedDeductionsAmount2(dblToString(aa.getSaidAmount()));
				}
				else if (index == 3) {
					form1702RTBean.setSpecialAllowableItemizedDeductionsDescription3(aa.getSaidDeduction());
					form1702RTBean.setSpecialAllowableItemizedDeductionsLegalBasis3(aa.getSaidLegalBasis());
					form1702RTBean.setSpecialAllowableItemizedDeductionsAmount3(dblToString(aa.getSaidAmount()));
				}
				else if (transferObject.getSched51702RTList().size() == 4) {
					form1702RTBean.setSpecialAllowableItemizedDeductionsDescription4(aa.getSaidDeduction());
					form1702RTBean.setSpecialAllowableItemizedDeductionsLegalBasis4(aa.getSaidLegalBasis());
					form1702RTBean.setSpecialAllowableItemizedDeductionsAmount4(dblToString(aa.getSaidAmount()));
				}
				else {
					form1702RTBean.setSpecialAllowableItemizedDeductionsDescription4("OTHERS");
					tSched5 = new SpecialAllowableItemizedDeductions();
					tSched5.setSequenceNumber("4." + String.valueOf(collapsableSeq++));
					tSched5.setDescription(aa.getSaidDeduction());
					tSched5.setLegalBasis(aa.getSaidLegalBasis());
					tSched5.setValue(dblToString(aa.getSaidAmount()));
					tList5.add(tSched5);
				}
				index++;
			}
		}
		
		if(transferObject.getSched61702RT() != null){
			//ReturnSchedule_6_1702_RT
			form1702RTBean.setGrossIncome(
					dblToString(transferObject.getSched61702RT().getGrssIncome()));
			form1702RTBean.setLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw(
					dblToString(transferObject.getSched61702RT().getTotalDeductionExclusiveOfNolco()));
			form1702RTBean.setNetOperatingLoss(
					dblToString(transferObject.getSched61702RT().getNetOperatingLoss()));
		}
		
		if(transferObject.getSched6A1702RTList() != null && transferObject.getSched6A1702RTList().size() > 0){
			//ReturnSchedule_6A_1702_RT
			List<OperatingLoss> tList6 = new ArrayList<OperatingLoss>();
			form1702RTBean.setSched6OperatingLoss(tList6);

			OperatingLoss tSched6;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_6A_1702_RT ol : transferObject.getSched6A1702RTList()) {
				if (index == 1) {
					form1702RTBean.setNetOperatingLossYearIncurred1(ol.getYearIncurred());
					form1702RTBean.setNetOperatingLossAmount1(dblToString(ol.getOperatingLossAmount()));
					form1702RTBean.setNOLCOAppliedPreviousYear1(dblToString(ol.getNolcoAppliedPreviousYear()));
					form1702RTBean.setNOLCOExpired1(dblToString(ol.getNolcoExpired()));
					form1702RTBean.setNOLCOAppliedCurrentYear1(dblToString(ol.getNolcoAppliedCurrentYear()));
					form1702RTBean.setNetOperatingLossUnapplied1(dblToString(ol.getNetOperatiingLoss()));
				}
				else if (index == 2) {
					form1702RTBean.setNetOperatingLossYearIncurred2(ol.getYearIncurred());
					form1702RTBean.setNetOperatingLossAmount2(dblToString(ol.getOperatingLossAmount()));
					form1702RTBean.setNOLCOAppliedPreviousYear2(dblToString(ol.getNolcoAppliedPreviousYear()));
					form1702RTBean.setNOLCOExpired2(dblToString(ol.getNolcoExpired()));
					form1702RTBean.setNOLCOAppliedCurrentYear2(dblToString(ol.getNolcoAppliedCurrentYear()));
					form1702RTBean.setNetOperatingLossUnapplied2(dblToString(ol.getNetOperatiingLoss()));
				}
				else if (index == 3) {
					form1702RTBean.setNetOperatingLossYearIncurred3(ol.getYearIncurred());
					form1702RTBean.setNetOperatingLossAmount3(dblToString(ol.getOperatingLossAmount()));
					form1702RTBean.setNOLCOAppliedPreviousYear3(dblToString(ol.getNolcoAppliedPreviousYear()));
					form1702RTBean.setNOLCOExpired3(dblToString(ol.getNolcoExpired()));
					form1702RTBean.setNOLCOAppliedCurrentYear3(dblToString(ol.getNolcoAppliedCurrentYear()));
					form1702RTBean.setNetOperatingLossUnapplied3(dblToString(ol.getNetOperatiingLoss()));
				}
				else if (transferObject.getSched6A1702RTList().size() == 4) {
					form1702RTBean.setNetOperatingLossYearIncurred4(ol.getYearIncurred());
					form1702RTBean.setNetOperatingLossAmount4(dblToString(ol.getOperatingLossAmount()));
					form1702RTBean.setNOLCOAppliedPreviousYear4(dblToString(ol.getNolcoAppliedPreviousYear()));
					form1702RTBean.setNOLCOExpired4(dblToString(ol.getNolcoExpired()));
					form1702RTBean.setNOLCOAppliedCurrentYear4(dblToString(ol.getNolcoAppliedCurrentYear()));
					form1702RTBean.setNetOperatingLossUnapplied4(dblToString(ol.getNetOperatiingLoss()));
				}
				else {
					tSched6 = new OperatingLoss();
					tSched6.setSequenceNumber("7." + String.valueOf(collapsableSeq++));
					tSched6.setYear(intValueOf(ol.getYearIncurred()));
					tSched6.setAmount((long)ol.getOperatingLossAmount());
					tSched6.setNolcoAppliedPreviousYear((long)ol.getNolcoAppliedPreviousYear());
					tSched6.setNolcoExpired((long)ol.getNolcoExpired());
					tSched6.setNolcoAppliedCurrentYear((long)ol.getNolcoAppliedCurrentYear());
					tSched6.setNetOperatingLossUnapplied((long)ol.getNetOperatiingLoss());
					tList6.add(tSched6);
				}
				index++;
			}
		}

		if(transferObject.getSched71702RT() != null){
			//ReturnSchedule_7_1702_RT
			form1702RTBean.setPriorYearsExcessCreditsOtherThanMCIT(
					dblToString(transferObject.getSched71702RT().getPriorYearExcessCredit()));
			form1702RTBean.setIncomeTaxPaymentUnderMCIT(
					dblToString(transferObject.getSched71702RT().getIncomeTaxPaymentUnderMCIT()));
			form1702RTBean.setIncomeTaxPaymentUnderRegularRate(
					dblToString(transferObject.getSched71702RT().getIncomeTaxPaymentUnderRegular()));
			form1702RTBean.setExcessMCIT(
					dblToString(transferObject.getSched71702RT().getExcessMCITAppliedCurrentTaxableYear()));
			form1702RTBean.setCreditableTaxWithheldFromPrevQuarters(
					dblToString(transferObject.getSched71702RT().getCreditableTaxPreviousQuarter()));
			form1702RTBean.setCreditableTaxWithheldFromTheFourthQuarter(
					dblToString(transferObject.getSched71702RT().getCreditableTaxFromBIR2307()));
			form1702RTBean.setForeignTaxCredits(
					dblToString(transferObject.getSched71702RT().getForiegnTax()));
			form1702RTBean.setTaxPaidInReturn(
					dblToString(transferObject.getSched71702RT().getTaxPaidInReturnPreviouslyFiled()));
			form1702RTBean.setSched7SpecialTaxCredits(
					dblToString(transferObject.getSched71702RT().getSpecialTaxCredits()));
		}
		
		if(transferObject.getSched7A1702RTList() != null && transferObject.getSched7A1702RTList().size() > 0){
			//ReturnSchedule_7A_1702_RT
			List<OtherExpandable> tList7 = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched7AdditionalAttachments(tList7);

			OtherExpandable tSched7;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_7A_1702_RT aa : transferObject.getSched7A1702RTList()) {
				if (index == 1) {
					form1702RTBean.setOtherCreditsPaymentsDescription1(aa.getTaxCreditName());
					form1702RTBean.setOtherCreditsPaymentsAmount1(dblToString(aa.getTaxCreditAmount()));
				}
				else if (transferObject.getSched7A1702RTList().size() == 2) {
					form1702RTBean.setOtherCreditsPaymentsDescription2(aa.getTaxCreditName());
					form1702RTBean.setOtherCreditsPaymentsAmount2(dblToString(aa.getTaxCreditAmount()));
				}
				else {
					form1702RTBean.setOtherCreditsPaymentsDescription2("OTHERS");
					tSched7 = new OtherExpandable();
					tSched7.setSequenceNumber("11." + String.valueOf(collapsableSeq++));
					tSched7.setDescription(aa.getTaxCreditName());
					tSched7.setValue(dblToString(aa.getTaxCreditAmount()));
					tList7.add(tSched7);
				}
				index++;
			}
		}

		if(transferObject.getSched81702RTList() != null && transferObject.getSched81702RTList().size() > 0){
			//ReturnSchedule_8_1702_RT
			index = 1;
			for (ReturnSchedule_8_1702_RT mc : transferObject.getSched81702RTList()) {
				if (index == 1) {
					form1702RTBean.setMcitYear1(mc.getMcitYear());
					form1702RTBean.setNormalIncomeTax1(dblToString(mc.getNormalIncomeTax()));
					form1702RTBean.setMcit1(dblToString(mc.getMcit()));
					form1702RTBean.setExcessMCITOverNormalTax1(dblToString(mc.getExcessMCITOverNormalTax()));
					form1702RTBean.setExcessMCITAppliedPreviously1(dblToString(mc.getExcessMCITAppliedPreviously()));
					form1702RTBean.setExpiredPortionOfExcessMCIT1(dblToString(mc.getExpiredPortionOfExcessMCIT()));
					form1702RTBean.setExcessMCITAppliedCurrently1(dblToString(mc.getExcessMCITAppliedCurrently()));
					form1702RTBean.setBalanceOfExcessMCIT1(dblToString(mc.getBalanceOfExcessMCIT()));
				}
				else if (index == 2) {
					form1702RTBean.setMcitYear2(mc.getMcitYear());
					form1702RTBean.setNormalIncomeTax2(dblToString(mc.getNormalIncomeTax()));
					form1702RTBean.setMcit2(dblToString(mc.getMcit()));
					form1702RTBean.setExcessMCITOverNormalTax2(dblToString(mc.getExcessMCITOverNormalTax()));
					form1702RTBean.setExcessMCITAppliedPreviously2(dblToString(mc.getExcessMCITAppliedPreviously()));
					form1702RTBean.setExpiredPortionOfExcessMCIT2(dblToString(mc.getExpiredPortionOfExcessMCIT()));
					form1702RTBean.setExcessMCITAppliedCurrently2(dblToString(mc.getExcessMCITAppliedCurrently()));
					form1702RTBean.setBalanceOfExcessMCIT2(dblToString(mc.getBalanceOfExcessMCIT()));
				}
				else {
					form1702RTBean.setMcitYear3(mc.getMcitYear());
					form1702RTBean.setNormalIncomeTax3(dblToString(mc.getNormalIncomeTax()));
					form1702RTBean.setMcit3(dblToString(mc.getMcit()));
					form1702RTBean.setExcessMCITOverNormalTax3(dblToString(mc.getExcessMCITOverNormalTax()));
					form1702RTBean.setExcessMCITAppliedPreviously3(dblToString(mc.getExcessMCITAppliedPreviously()));
					form1702RTBean.setExpiredPortionOfExcessMCIT3(dblToString(mc.getExpiredPortionOfExcessMCIT()));
					form1702RTBean.setExcessMCITAppliedCurrently3(dblToString(mc.getExcessMCITAppliedCurrently()));
					form1702RTBean.setBalanceOfExcessMCIT3(dblToString(mc.getBalanceOfExcessMCIT()));
				}
				index++;
			}
		}
		
		if(transferObject.getSched91702RT() != null){
			//ReturnSchedule_9_1702_RT
			form1702RTBean.setNetIncomeLossPerBooks(
					dblToString(transferObject.getSched91702RT().getNetIncomeOrLossPerBooks()));
			form1702RTBean.setTotalNonDeductibleExpenses(
					dblToString(transferObject.getSched91702RT().getNonDeductibleExpensesTotal()));
			form1702RTBean.setTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions(
					dblToString(transferObject.getSched91702RT().getNonTaxableIncSpecialDedTotal()));
			form1702RTBean.setSched9NetTaxableIncome(
					dblToString(transferObject.getSched91702RT().getNetTaxableIncomeOrLoss()));
		}
		
		if(transferObject.getSched9_ND1702RTList() != null && transferObject.getSched9_ND1702RTList().size() > 0){
			//ReturnSchedule_9_ND_1702_RT
			List<OtherExpandable> tList9a = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched9AdditionalAttachments1(tList9a);

			OtherExpandable tSched9a;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_9_ND_1702_RT aa : transferObject.getSched9_ND1702RTList()) {
				if (index == 1) {
					form1702RTBean.setNonDeductibleExpenses(aa.getNonDeductibleExpenses());
					form1702RTBean.setNonDeductibleExpensesAmount(dblToString(aa.getNonDeductibleExpensesAmt()));
				}
				else if (transferObject.getSched9_ND1702RTList().size() == 2) {
					form1702RTBean.setNonDeductibleExpenses2(aa.getNonDeductibleExpenses());
					form1702RTBean.setNonDeductibleExpensesAmount2(dblToString(aa.getNonDeductibleExpensesAmt()));
				}
				else {
					form1702RTBean.setNonDeductibleExpenses2("OTHERS");
					tSched9a = new OtherExpandable();
					tSched9a.setSequenceNumber("3." + String.valueOf(collapsableSeq++));
					tSched9a.setDescription(aa.getNonDeductibleExpenses());
					tSched9a.setValue(dblToString(aa.getNonDeductibleExpensesAmt()));
					tList9a.add(tSched9a);
				}
				index++;
			}
		}

		if(transferObject.getSched9_NT1702RTList() != null && transferObject.getSched9_NT1702RTList().size() > 0){
			//ReturnSchedule_9_NT_1702_RT
			List<OtherExpandable> tList9b = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched9AdditionalAttachments2(tList9b);

			OtherExpandable tSched9b;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_9_NT_1702_RT aa : transferObject.getSched9_NT1702RTList()) {
				if (index == 1) {
					form1702RTBean.setNonTaxable(aa.getNonTaxableIncome());
					form1702RTBean.setNonTaxableAmount(dblToString(aa.getNonTaxableIncomeAmt()));
				}
				else if (transferObject.getSched9_NT1702RTList().size() == 2) {
					form1702RTBean.setNonTaxable2(aa.getNonTaxableIncome());
					form1702RTBean.setNonTaxableAmount2(dblToString(aa.getNonTaxableIncomeAmt()));
				}
				else {
					form1702RTBean.setNonTaxable2("OTHERS");
					tSched9b = new OtherExpandable();
					tSched9b.setSequenceNumber("6." + String.valueOf(collapsableSeq++));
					tSched9b.setDescription(aa.getNonTaxableIncome());
					tSched9b.setValue(dblToString(aa.getNonTaxableIncomeAmt()));
					tList9b.add(tSched9b);
				}
				index++;
			}

			
		}
		
		if( transferObject.getSched9_SD1702RTList() != null &&  transferObject.getSched9_SD1702RTList().size() > 0){
			//ReturnSchedule_9_SD_1702_RT
			List<OtherExpandable> tList9c = new ArrayList<OtherExpandable>();
			form1702RTBean.setSched9AdditionalAttachments3(tList9c);
			
			OtherExpandable tSched9c;
			index = 1;
			collapsableSeq = 1;
			for (ReturnSchedule_9_SD_1702_RT aa : transferObject.getSched9_SD1702RTList()) {
				if (index == 1) {
					form1702RTBean.setSpecialDeductions(aa.getSpecialDeductions());
					form1702RTBean.setSpecialDeductionsAmount(dblToString(aa.getSpecialDeductionsAmt()));
				}
				else if (transferObject.getSched9_SD1702RTList().size() == 2) {
					form1702RTBean.setSpecialDeductions2(aa.getSpecialDeductions());
					form1702RTBean.setSpecialDeductionsAmount2(dblToString(aa.getSpecialDeductionsAmt()));
				}
				else {
					collapsableSeq += 0.1;
					form1702RTBean.setSpecialDeductions2("OTHERS");
					tSched9c = new OtherExpandable();
					tSched9c.setSequenceNumber("8." + String.valueOf(collapsableSeq++));
					tSched9c.setDescription(aa.getSpecialDeductions());
					tSched9c.setValue(dblToString(aa.getSpecialDeductionsAmt()));
					tList9c.add(tSched9c);
				}
				index++;
			}
		}
		
		if(transferObject.getSched101702RT() != null){
			//ReturnSchedule_10_1702_RT
			form1702RTBean.setCurrentAssets(
					dblToString(transferObject.getSched101702RT().getCurrentAsset()));
			form1702RTBean.setLongTermInvestment(
					dblToString(transferObject.getSched101702RT().getLongTermInvestment()));
			form1702RTBean.setNetPropertyPlantAndEquipment(
					dblToString(transferObject.getSched101702RT().getProperty()));
			form1702RTBean.setLongTermReceivables(
					dblToString(transferObject.getSched101702RT().getLongTermReceivables()));
			form1702RTBean.setIntangibleAssets(
					dblToString(transferObject.getSched101702RT().getIntangibleAsset()));
			form1702RTBean.setOtherAssets(
					dblToString(transferObject.getSched101702RT().getOtherAsset()));
			form1702RTBean.setTotalAssets(
					dblToString(transferObject.getSched101702RT().getTotalAsset()));
			form1702RTBean.setCurrentLiabilities(
					dblToString(transferObject.getSched101702RT().getCurrentLiablity()));
			form1702RTBean.setLongTermLiabilities(
					dblToString(transferObject.getSched101702RT().getLongTermLiability()));
			form1702RTBean.setDeferredCredits(
					dblToString(transferObject.getSched101702RT().getDeferredCredit()));
			form1702RTBean.setOtherLiabilities(
					dblToString(transferObject.getSched101702RT().getOtherLiability()));
			form1702RTBean.setTotalLiabilities(
					dblToString(transferObject.getSched101702RT().getTotalLiablity()));
			form1702RTBean.setCapitalStock(
					dblToString(transferObject.getSched101702RT().getCapitalStock()));
			form1702RTBean.setAdditionalPaidInCapital(
					dblToString(transferObject.getSched101702RT().getAdditionalPaidinCapital()));
			form1702RTBean.setRetainedEarnings(
					dblToString(transferObject.getSched101702RT().getRetainedEarning()));
			form1702RTBean.setTotalEquity(
					dblToString(transferObject.getSched101702RT().getTotalEquity()));
			form1702RTBean.setTotalLiabilitiesAndEquity(
					dblToString(transferObject.getSched101702RT().getTotalLiabilityAndEquity()));
		}
		
		if(transferObject.getSched111702RTContributorType() != null){
			form1702RTBean.setCapitalContributorType(transferObject.getSched111702RTContributorType().getContributorType());
			if(form1702RTBean.getCapitalContributorType() != null){
				if(form1702RTBean.getCapitalContributorType().equalsIgnoreCase("P")){
					form1702RTBean.getCapitalContributorTypeList().add("P");
				}
				else if(form1702RTBean.getCapitalContributorType().equalsIgnoreCase("SM")){
					form1702RTBean.getCapitalContributorTypeList().add("S");
					form1702RTBean.getCapitalContributorTypeList().add("M");
				}
				else if(form1702RTBean.getCapitalContributorType().equalsIgnoreCase("S")){
					form1702RTBean.getCapitalContributorTypeList().add("S");
				} 
				else if(form1702RTBean.getCapitalContributorType().equalsIgnoreCase("M")){
					form1702RTBean.getCapitalContributorTypeList().add("M");
				}
			}
		}
				
		if(transferObject.getSched111702RTList() != null && transferObject.getSched111702RTList().size() > 0){
			//ReturnSchedule_11_1702_RT
			List<StockholdersPartners> tList11 = new ArrayList<StockholdersPartners>();
			form1702RTBean.setSched11AdditionalAttachments(tList11);

			StockholdersPartners tSched11;
			
			for (ReturnContributors_1702 mi : transferObject.getSched111702RTList()) {
				tSched11 = new StockholdersPartners();
			
				tSched11.setRegisteredName(mi.getRegisteredName());
				if(mi.getTin() != null){
					tSched11.setTin1(mi.getTin().substring(0, 3));
					tSched11.setTin2(mi.getTin().substring(3, 6));
					tSched11.setTin3(mi.getTin().substring(6, 9));
					tSched11.setBranchCode(mi.getBranchCode());
				}
				tSched11.setCapitalContribution(dblToString(mi.getCapitalContribution()));
				tSched11.setPercentToTotal(new DecimalFormat("#.##").format(mi.getTotalPercentage()).toString());
				tList11.add(tSched11);
			}
			
			//fill up missing space with minimum of 5 rows
			if(tList11.size() < 20){
				int fillSizeSpace = 20 - tList11.size();
				
				for(int i =0; i < fillSizeSpace;i++){
					tList11.add(new StockholdersPartners());
				}
			}
		}

		//ReturnSchedule_12I_1702_RT
		if (transferObject.getSched12I1702RTList() != null &&
				!transferObject.getSched12I1702RTList().isEmpty()) {
			List<GrossIncomeFinalWithholding> tList12I = new ArrayList<GrossIncomeFinalWithholding>();
			form1702RTBean.setListOfGrossIncomeFinalWithholding(tList12I);
			
			GrossIncomeFinalWithholding tSched12I;
			index = 0;
			collapsableSeq = 1;
			for (ReturnSchedule_12I_1702_RT aa : transferObject.getSched12I1702RTList()) {
				if (aa.getType().equals("Interests") ) {
					form1702RTBean.setExemptInterest(dblToString(aa.getExempt()));
					form1702RTBean.setFairMarketValueInterest(dblToString(aa.getActualAmount()));
					form1702RTBean.setFinalTaxWthldInterest(dblToString(aa.getFinalTaxWitheld()));
				}
				else if (aa.getType().equals("Royalties")) {
					form1702RTBean.setExemptRoyalties(dblToString(aa.getExempt()));
					form1702RTBean.setFairMarketValueRoyalties(dblToString(aa.getActualAmount()));
					form1702RTBean.setFinalTaxWthldRoyalties(dblToString(aa.getFinalTaxWitheld()));
				}
				else if (aa.getType().equals("Dividends")) {
					form1702RTBean.setExemptDividends(dblToString(aa.getExempt()));
					form1702RTBean.setFairMarketValueDividends(dblToString(aa.getActualAmount()));
					form1702RTBean.setFinalTaxWthldDividends(dblToString(aa.getFinalTaxWitheld()));
				}
				else if (aa.getType().equals("Prizes and Winnings")) {
					form1702RTBean.setExemptPrizesWinnings(dblToString(aa.getExempt()));
					form1702RTBean.setFairMarketValuePrizesWinnings(dblToString(aa.getActualAmount()));
					form1702RTBean.setFinalTaxWthldPrizesWinnings(dblToString(aa.getFinalTaxWitheld()));
				}
				else {
					collapsableSeq += 0.1;
					tSched12I = new GrossIncomeFinalWithholding();
					tSched12I.setSequenceNumber("4." + String.valueOf(collapsableSeq++));
					tSched12I.setDescription(aa.getType());
					tSched12I.setExempt(dblToString(aa.getExempt()));
					tSched12I.setActualAmount(dblToString(aa.getActualAmount()));
					tSched12I.setFinalTaxWithheld(dblToString(aa.getFinalTaxWitheld()));
					tList12I.add(tSched12I);
				}
				index++;
			}
		}

		//ReturnSchedule_12II_1702_RT
		if (transferObject.getSched12II1702RTList() != null &&
				!transferObject.getSched12II1702RTList().isEmpty()) {
			List<RealPropertiesSalesExchange> tList12II = new ArrayList<RealPropertiesSalesExchange>();
			form1702RTBean.setListOfRealPropertiesSalesExchange(tList12II);
			
			int numeral = 0;
			RealPropertiesSalesExchange tSched12II;
			for (ReturnSchedule_12II_1702_RT aa : transferObject.getSched12II1702RTList()) {
				tSched12II = new RealPropertiesSalesExchange();
				tSched12II.setNumeral(numeral++);
				tSched12II.setDescription(aa.getPropertyDesc());
				tSched12II.setTaxDeclaration(aa.getTaxDeclarationNo());
				tSched12II.setAuthorizingRegistration(aa.getCarNo());
				tSched12II.setActualAmount(dblToString(aa.getActualAmount()));
				tSched12II.setFinalTaxWithheld(dblToString(aa.getFinalTaxWitheld()));
				tList12II.add(tSched12II);
			}
			while (tList12II.size() < 2) {
				tSched12II = new RealPropertiesSalesExchange();
				tSched12II.setNumeral(numeral++);
				tList12II.add(tSched12II);
			}
		}

		//ReturnSchedule_12III_1702_RT
		if (transferObject.getSched12III1702RTList() != null &&
				!transferObject.getSched12III1702RTList().isEmpty()) {
			List<SharesOfStockSalesExchange> tList12III = new ArrayList<SharesOfStockSalesExchange>();
			form1702RTBean.setListOfSharesOfStockSalesExchange(tList12III);
			
			SharesOfStockSalesExchange tSched12III;
			int numeral = 0;
			for (ReturnSchedule_12III_1702_RT aa : transferObject.getSched12III1702RTList()) {
				tSched12III = new SharesOfStockSalesExchange();
				tSched12III.setNumeral(numeral++);
				tSched12III.setKind(aa.getStockKind());
				tSched12III.setStockCertificate(aa.getStockSeriesNo());
				tSched12III.setAuthorizingRegistration(aa.getCarNo());
				tSched12III.setNumberOfShares(dblToString(aa.getNumberOfSharee()));
				tSched12III.setDateOfIssue(aa.getIssuedDate());
				tSched12III.setActualAmount(dblToString(aa.getActualAmount()));
				tSched12III.setFinalTaxWithheld(dblToString(aa.getFinalTaxWitheld()));
				tList12III.add(tSched12III);
			}
			while (tList12III.size() < 2) {
				tSched12III = new SharesOfStockSalesExchange();
				tSched12III.setNumeral(numeral++);
				tList12III.add(tSched12III);
			}
		}

		//ReturnSchedule_12IV_1702_RT
		if (transferObject.getSched12IV1702RTList() != null &&
				!transferObject.getSched12IV1702RTList().isEmpty()) {
			List<OtherIncome> tList12IV = new ArrayList<OtherIncome>();
			form1702RTBean.setListOfOtherIncome(tList12IV);
			
			OtherIncome tSched12IV;
			int numeral = 0;
			for (ReturnSchedule_12IV_1702_RT aa : transferObject.getSched12IV1702RTList()) {
				tSched12IV = new SharesOfStockSalesExchange();
				tSched12IV.setNumeral(numeral++);
				tSched12IV.setDescription(aa.getOtherIncome());
				tSched12IV.setActualAmount(dblToString(aa.getActualAmount()));
				tSched12IV.setFinalTaxWithheld(dblToString(aa.getFinalTaxWitheld()));
				tList12IV.add(tSched12IV);
			}
			while (tList12IV.size() < 2) {
				tSched12IV = new SharesOfStockSalesExchange();
				tSched12IV.setNumeral(numeral++);
				tList12IV.add(tSched12IV);
			}
		}
		
		//ReturnSchedule_13_1702_RT
		if(transferObject.getSched131702RT() != null){
			//ReturnSchedule_2B_1702_RT
			form1702RTBean.setReturnOfPremium(
					dblToString(transferObject.getSched131702RT().getReturnPremium()));
		}
		
		//ReturnSchedule_13I_1702_RT
		if (transferObject.getSched13I1702RTList() != null &&
				!transferObject.getSched13I1702RTList().isEmpty()) {
			List<PersonalRealPropertiesReceived> tList13I = new ArrayList<PersonalRealPropertiesReceived>();
			form1702RTBean.setListOfPersonalRealPropertiesReceived(tList13I);
			
			PersonalRealPropertiesReceived tSched13I;
			int numeral = 0;
			for (ReturnSchedule_13I_1702_RT aa : transferObject.getSched13I1702RTList()) {
				tSched13I = new PersonalRealPropertiesReceived();
				tSched13I.setNumeral(numeral++);
				tSched13I.setDescription(aa.getPropertyDesc());
				tSched13I.setModeOfTransfer(aa.getTransferMode());
				tSched13I.setAuthorizingRegistration(aa.getCarNo());
				tSched13I.setValue(dblToString(aa.getActualAmount()));
				tList13I.add(tSched13I);
			}
			while (tList13I.size() < 2) {
				tSched13I = new PersonalRealPropertiesReceived();
				tSched13I.setNumeral(numeral++);
				tList13I.add(tSched13I);
			}
		}

		//ReturnSchedule_13II_1702_RT
		if (transferObject.getSched13II1702RTList() != null &&
				!transferObject.getSched13II1702RTList().isEmpty()) {
			List<OtherIncome> tList13II = new ArrayList<OtherIncome>();
			form1702RTBean.setListOfOtherExemptIncome(tList13II);
			
			OtherIncome tSched13II;
			int numeral = 0;
			for (ReturnSchedule_13II_1702_RT aa : transferObject.getSched13II1702RTList()) {
				tSched13II = new OtherIncome();
				tSched13II.setNumeral(numeral++);
				tSched13II.setDescription(aa.getOtherExemptIncome());
				tSched13II.setActualAmount(dblToString(aa.getActualAmount()));
				tList13II.add(tSched13II);
			}
			while (tList13II.size() < 2) {
				tSched13II = new OtherIncome();
				tSched13II.setNumeral(numeral++);
				tList13II.add(tSched13II);
			}
		}
	}

//	public static void moveBeanToTransferObject(Form1702RTBean form1702RTBean, Form1702RTTO transferObject, RegisteredTaxPayerBean registeredTaxPayer, EfpsEnrolledTaxPayerBean enrolledTaxPayer, Date returnPeriod) {
//		//ReturnTransaction_1702_RT
//		Long referenceNo = null;
//		
//		ReturnTransaction_1702_RT transaction = null;
//		
//		if(transferObject.getTrans1702RT() != null){
//			transaction = transferObject.getTrans1702RT();
//			referenceNo = transaction.getReferenceNo();
//		}else{
//			transaction = new ReturnTransaction_1702_RT();
//		}
//		
//		//call extra method to sync bean
//		synchBeanProperties(form1702RTBean);
//		
//		moveBeanToTransaction(transaction, form1702RTBean);
//		transferObject.setTrans1702RT(transaction);
//		
//		ReturnTaxAgent_1702_RT taxAgent;
//		if(transferObject.getTaxagent1702RT() != null){
//			taxAgent = transferObject.getTaxagent1702RT();
//		}
//		else{
//			taxAgent = new ReturnTaxAgent_1702_RT();
//		}
//		
//		transferObject.setTaxagent1702RT(taxAgent);
//		taxAgent.setExternalAuditor(form1702RTBean.getNameExternalAuditorAccreditedTaxAgent());
//		
//		if(!isEmpty(form1702RTBean.getTin1ExternalAuditorAccreditedTaxAgent())
//				&& !isEmpty(form1702RTBean.getTin2ExternalAuditorAccreditedTaxAgent())
//				&& !isEmpty(form1702RTBean.getTin3ExternalAuditorAccreditedTaxAgent())
//				&& !isEmpty(form1702RTBean.getTinBranchExternalAuditorAccreditedTaxAgent())){
//		taxAgent.setAuditorTin(form1702RTBean.getTin1ExternalAuditorAccreditedTaxAgent()
//				+ form1702RTBean.getTin2ExternalAuditorAccreditedTaxAgent()
//				+ form1702RTBean.getTin3ExternalAuditorAccreditedTaxAgent()
//				+ form1702RTBean.getTinBranchExternalAuditorAccreditedTaxAgent());
//		}else{
//			taxAgent.setAuditorTin(null);
//		}
//		
//		taxAgent.setPartnerName(form1702RTBean.getNameSigningPartner());
//		
//		if(!isEmpty(form1702RTBean.getTin1SigningPartner())
//				&& !isEmpty(form1702RTBean.getTin2SigningPartner())
//				&& !isEmpty(form1702RTBean.getTin3SigningPartner())
//				&& !isEmpty(form1702RTBean.getTinBranchSigningPartner())){
//		taxAgent.setPartnerTin(form1702RTBean.getTin1SigningPartner()
//				+ form1702RTBean.getTin2SigningPartner()
//				+ form1702RTBean.getTin3SigningPartner()
//				+ form1702RTBean.getTinBranchSigningPartner());
//		}else{
//			taxAgent.setPartnerTin(null);
//		}
//		
//		if(!isEmpty(form1702RTBean.getBirAccreditationNo1())
//				&& !isEmpty(form1702RTBean.getBirAccreditationNo2())
//				&& !isEmpty(form1702RTBean.getBirAccreditationNo3())
//				&& !isEmpty(form1702RTBean.getBirAccreditationNo4())){
//			taxAgent.setAccreditationNo(form1702RTBean.getBirAccreditationNo()); //item 59
//		}else{
//			taxAgent.setAccreditationNo(null);
//
//		}
//		taxAgent.setIssuedDate(form1702RTBean.getBirAccreditationIssueDate());
//		taxAgent.setExpiryDate(form1702RTBean.getBirAccreditationExpiryDate());
//		
//		//ReturnHistory_1702_RT
//		ReturnHistory_1702_RT history = null;
//		if(transferObject.getHistory1702RT() != null){
//			history = transferObject.getHistory1702RT();
//		}else{
//			history = new ReturnHistory_1702_RT();
//		}
//		
//		transferObject.setHistory1702RT(history);
//		moveBeanToHistory(history, form1702RTBean);
//
//		//ReturnTaxpayer_1702_RT
//		ReturnTaxpayer_1702_RT taxpayer = new ReturnTaxpayer_1702_RT();
//		if(transferObject.getTaxpayer1702RT() != null){
//			taxpayer = transferObject.getTaxpayer1702RT();
//		}
//		else{
//			taxpayer = new ReturnTaxpayer_1702_RT();
//		}
//		
//		transferObject.setTaxpayer1702RT(taxpayer);
//		taxpayer.setReferenceNo(referenceNo);
//		taxpayer.setNetSales(
//				dblValueOf(form1702RTBean.getNetSalesRevenuesReceiptsFees()));
//		taxpayer.setCostOfSale(
//				dblValueOf(form1702RTBean.getCostSalesServices()));
//		taxpayer.setGrossIncomeFromOperation(
//				dblValueOf(form1702RTBean.getGrossIncomeFromOperation()));
//		taxpayer.setOtherTaxableIncome(
//				dblValueOf(form1702RTBean.getOtherTaxableIncomeNotSubjectedToFinalTax()));
//		taxpayer.setTotalGrossIncome(
//				dblValueOf(form1702RTBean.getTotalGrossIncome()));
//		taxpayer.setOrdinaryAllowableItemizedDeduction(
//				dblValueOf(form1702RTBean.getOrdinaryAllowableItemizedDeductions()));
//		taxpayer.setSpecialAllowableItemizedDeduction(
//				dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductions36()));
//		taxpayer.setNolco(
//				dblValueOf(form1702RTBean.getNolco()));
//		taxpayer.setTotalDeduction(
//				dblValueOf(form1702RTBean.getTotalItemizedDeductions()));
//		taxpayer.setOptionalDeduction(
//				dblValueOf(form1702RTBean.getOptionalStandardDeductions()));
//		taxpayer.setNetTaxableIncome(
//				dblValueOf(form1702RTBean.getNetTaxableIncome()));
//		taxpayer.setIncomeTaxRate(
//				dblValueOf(form1702RTBean.getIncomeTaxRate()));
//		taxpayer.setIncomeTaxDue(
//				dblValueOf(form1702RTBean.getIncomeTaxDueOtherThanMCIT()));
//		taxpayer.setMinimumCorporateIncomeTax(
//				dblValueOf(form1702RTBean.getMinimumCorporateIncomeTax()));
//		taxpayer.setTotalIncomeTaxDue(
//				dblValueOf(form1702RTBean.getTotalIncomeTaxDue44()));
//		taxpayer.setTotalTaxPayment(
//				dblValueOf(form1702RTBean.getTotalTaxCreditsPayments45()));
//		taxpayer.setNetTaxPayable(
//				dblValueOf(form1702RTBean.getNetTaxPayable46()));
//		taxpayer.setSurcharge(
//				dblValueOf(form1702RTBean.getSurcharge()));
//		taxpayer.setInterest(
//				dblValueOf(form1702RTBean.getInterest()));
//		taxpayer.setCompromise(
//				dblValueOf(form1702RTBean.getCompromise()));
//		taxpayer.setTotalPenalties(
//				dblValueOf(form1702RTBean.getTotalPenalties50()));
//		taxpayer.setTotalAmountPayable(form1702RTBean.getTotalAmountPayable());
//		taxpayer.setReliefItemizedDeduction(
//				dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductions52()));
//		taxpayer.setSpecialTaxCredit(
//				dblValueOf(form1702RTBean.getSpecialTaxCredits()));
//		taxpayer.setTotalTaxReliefAvailment(
//				dblValueOf(form1702RTBean.getTotalTaxReliefAvailment()));
//
//		//taxpayer.setTotalNonOperationIncome(
//		//		dblValueOf(form1702RTBean.get));
//		taxpayer.setTotalOrdinaryDeduction(
//				dblValueOf(form1702RTBean.getTotalOrdinaryAllowableItemizedDeductions()));
//		taxpayer.setTotalSpecialDeduction(
//				dblValueOf(form1702RTBean.getTotalSpecialAllowableItemizedDeductions()));
//		taxpayer.setGrossIncome(
//				dblValueOf(form1702RTBean.getGrossIncome()));
//		taxpayer.setTotalDeductableExlNolco(
//				dblValueOf(form1702RTBean.getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw()));
//		taxpayer.setNetOperationLoss(
//				dblValueOf(form1702RTBean.getNetOperatingLoss()));
//		taxpayer.setTotalNolco(
//				dblValueOf(form1702RTBean.getTotalNOLCO()));
//		taxpayer.setTotalTaxCredits(
//				dblValueOf(form1702RTBean.getTotalTaxCredits()));
//		taxpayer.setTotalExcessMCIT(
//				dblValueOf(form1702RTBean.getTotalExcessCreditsMCIT()));
//		taxpayer.setTotalSumReconNetIncome(
//				dblValueOf(form1702RTBean.getTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions()));
//		taxpayer.setTotalDIfReconNetIncome(
//				dblValueOf(form1702RTBean.getSched9NetTaxableIncome()));
//		taxpayer.setTotalFinalTaxWitheld(
//				dblValueOf(form1702RTBean.getTotalFinalTaxWithheldPaid()));
//		taxpayer.setTotalIncomeExempt(
//				dblValueOf(form1702RTBean.getTotalIncomeExemptFromTax()));
//
//		//iterating table map
//		transferObject.setIteratingTableMap(form1702RTBean.getIteratingTableMap());
//		
//		//ReturnSchedule_1_1702_RT
//		ReturnSchedule_1_1702_RT tSched1 = null;
//		
//		if(transferObject.getSched011702RT() != null){
//			tSched1 = transferObject.getSched011702RT();
//		}
//		else{
//			tSched1 = new ReturnSchedule_1_1702_RT();
//		}
//		
//		transferObject.setSched011702RT(tSched1);
//		tSched1.setReferenceNo(referenceNo);
//		tSched1.setSaleOfGoods(
//				dblValueOf(form1702RTBean.getSaleOfGoodsProperties()));
//		tSched1.setSaleOfServices(
//				dblValueOf(form1702RTBean.getSaleOfServices()));
//		tSched1.setLeaseOfProperties(
//				dblValueOf(form1702RTBean.getLeaseOfProperties()));
//		tSched1.setTotalSales(
//				dblValueOf(form1702RTBean.getTotal()));
//		tSched1.setSalesDiscount(
//				dblValueOf(form1702RTBean.getLessSalesReturnDiscounts()));
//		tSched1.setNetSales(
//				dblValueOf(form1702RTBean.getNetSalesRevenuesReceiptsFeesSchedule1()));
//
//		//ReturnSchedule_2A_1702_RT
//		ReturnSchedule_2A_1702_RT tSched2a = null;
//		if(transferObject.getSched2A1702RT() != null){
//			tSched2a = transferObject.getSched2A1702RT();
//		}
//		else{	
//			tSched2a = new ReturnSchedule_2A_1702_RT();
//		}
//		
//		transferObject.setSched2A1702RT(tSched2a);
//		tSched2a.setReferenceNo(referenceNo);
//		tSched2a.setMerchadiseInventory(
//				dblValueOf(form1702RTBean.getMerchandiseInventoryBeginning()));
//		tSched2a.setPurchaseOfMerchadise(
//				dblValueOf(form1702RTBean.getAddPurchaseOfMerchandise()));
//		tSched2a.setTotalGoodAvailableForSale(
//				dblValueOf(form1702RTBean.getTotalGoodsAvailableForSale()));
//		tSched2a.setDeductibleMerchandiseInventory(
//				dblValueOf(form1702RTBean.getLessMerchandiseInventoryEnding()));
//		tSched2a.setCostOfSale(
//				dblValueOf(form1702RTBean.getCostOfSales()));
//
//		//ReturnSchedule_2B_1702_RT
//		ReturnSchedule_2B_1702_RT tSched2b = null;
//		
//		if(transferObject.getSched2B1702RT() != null){
//			tSched2b = transferObject.getSched2B1702RT();
//		}
//		else{
//			tSched2b = new ReturnSchedule_2B_1702_RT();
//		}
//		
//		transferObject.setSched2B1702RT(tSched2b);
//		tSched2b.setReferenceNo(referenceNo);
//		tSched2b.setDirectMaterials(
//				dblValueOf(form1702RTBean.getDirectMaterialsBeginning()));
//		tSched2b.setPurchaseOfDirectMaterials(
//				dblValueOf(form1702RTBean.getAddPurchasesOfDirectMaterials()));
//		tSched2b.setMaterialsAvailableForUse(
//				dblValueOf(form1702RTBean.getMaterialsAvalableForUse()));
//		tSched2b.setLessDirectMaterial(
//				dblValueOf(form1702RTBean.getLessDirectMaterialsEnding()));
//		tSched2b.setRawMaterialUsed(
//				dblValueOf(form1702RTBean.getRawMaterialsUsed()));
//		tSched2b.setDirectLabor(
//				dblValueOf(form1702RTBean.getDirectLabor()));
//		tSched2b.setManufacturingOverhead(
//				dblValueOf(form1702RTBean.getManufacturingOverhead()));
//		tSched2b.setTotalManufacturingCost(
//				dblValueOf(form1702RTBean.getTotalManufacturingCost()));
//		tSched2b.setWorkProcessBegin(
//				dblValueOf(form1702RTBean.getAddWorkInProcessBeginning()));
//		tSched2b.setLessWorkProcessEnd(
//				dblValueOf(form1702RTBean.getLessWorkInProcessEnding()));
//		tSched2b.setCostOfGoodManufactured(
//				dblValueOf(form1702RTBean.getCostOfGoodsManufactured()));
//		tSched2b.setFinishedGoodBegin(
//				dblValueOf(form1702RTBean.getFinishedGoodsBeginning()));
//		tSched2b.setLessFinishedGood(
//				dblValueOf(form1702RTBean.getLessFinishedGoodsEnding()));
//		tSched2b.setGoodManufacturedAndSold(
//				dblValueOf(form1702RTBean.getCostOfGoodsManufacturedAndSold()));
//
//		//ReturnSchedule_2C_1702_RT
//		ReturnSchedule_2C_1702_RT tSched2c = null;
//		
//		if(transferObject.getSched2C1702RT() != null){
//			tSched2c = transferObject.getSched2C1702RT();
//		}
//		else{
//			tSched2c = new ReturnSchedule_2C_1702_RT();
//		}
//		
//		transferObject.setSched2C1702RT(tSched2c);
//		tSched2c.setReferenceNo(referenceNo);
//		transferObject.getSched2C1702RT().setSalaries(
//				dblValueOf(form1702RTBean.getDirectChargesSalariesWagesAndBenefits()));
//		transferObject.getSched2C1702RT().setMaterials(
//				dblValueOf(form1702RTBean.getDirectChargesMaterialsSuppliesAndFacilities()));
//		transferObject.getSched2C1702RT().setDepreciation(
//				dblValueOf(form1702RTBean.getDirectChargesDepreciation()));
//		transferObject.getSched2C1702RT().setRental(
//				dblValueOf(form1702RTBean.getDirectChargesRental()));
//		transferObject.getSched2C1702RT().setOutsideServices(
//				dblValueOf(form1702RTBean.getDirectChargesOutsideServices()));
//		transferObject.getSched2C1702RT().setOthers(
//				dblValueOf(form1702RTBean.getDirectChargesOthers()));
//		transferObject.getSched2C1702RT().setTotalCostOfServices(
//				dblValueOf(form1702RTBean.getTotalCostOfSalesServices()));
//
//		//ReturnSchedule_3_1702_RT
//		List<ReturnSchedule_3_1702_RT> tList3 = new ArrayList<ReturnSchedule_3_1702_RT>();		
//		transferObject.setSched31702RTList(tList3);
//		int seq = 0;
//		ReturnSchedule_3_1702_RT tSched3;
//		//if amount1 has value add to TransferObject list
//		if (StringUtils.isNotBlank(form1702RTBean.getOtherTaxIncomeDescription1()) &&
//				form1702RTBean.getOtherTaxIncomeAmount1() != null) {
//			tSched3 = new ReturnSchedule_3_1702_RT(referenceNo, Long.valueOf(seq++),
//					1d, form1702RTBean.getOtherTaxIncomeDescription1(), Long.valueOf(1),
//					dblValueOf(form1702RTBean.getOtherTaxIncomeAmount1()));
//			tList3.add(tSched3);
//		}
//		//if amount2 has value add to TransferObject list
//		if (StringUtils.isNotBlank(form1702RTBean.getOtherTaxIncomeDescription2()) &&
//				form1702RTBean.getOtherTaxIncomeAmount2() != null) {
//			tSched3 = new ReturnSchedule_3_1702_RT(referenceNo, Long.valueOf(seq++),
//					2d, form1702RTBean.getOtherTaxIncomeDescription2(), Long.valueOf(2),
//					dblValueOf(form1702RTBean.getOtherTaxIncomeAmount2()));
//			tList3.add(tSched3);
//		}
//		//if amount3 has value and list is empty add to TransferObject list
//		if (StringUtils.isNotBlank(form1702RTBean.getOtherTaxIncomeDescription3()) &&
//				form1702RTBean.getOtherTaxIncomeAmount3() != null &&
//				form1702RTBean.getSched3AdditionalAttachments().isEmpty()) {
//			tSched3 = new ReturnSchedule_3_1702_RT(referenceNo, Long.valueOf(seq++),
//					3d, form1702RTBean.getOtherTaxIncomeDescription3(), Long.valueOf(3),
//					dblValueOf(form1702RTBean.getOtherTaxIncomeAmount3()));
//			tList3.add(tSched3);
//		}
//		//else copy bean list to transferObject list 
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched3AdditionalAttachments()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty() 
//				   && null != aa.getValue()){
//					tSched3 = new ReturnSchedule_3_1702_RT(referenceNo, Long.valueOf(seq++),
//							dblValueOf(aa.getSequenceNumber()), aa.getDescription(), Long.valueOf(3),
//							dblValueOf(aa.getValue()));
//					tList3.add(tSched3);
//				}
//			}
//		}
//
//		seq = 0;
//		//ReturnSchedule_4A_1702_RT
//		List<ReturnSchedule_4A_1702_RT> tList4a = new ArrayList<ReturnSchedule_4A_1702_RT>();
//		
//		transferObject.setSched4A1702RTList(tList4a);
//
//		ReturnSchedule_4A_1702_RT tSched4a;
//		if (StringUtils.isNotBlank(form1702RTBean.getAmortizationsDescription1()) &&
//				form1702RTBean.getAmortizationsAmount1() != null) {
//			tSched4a = new ReturnSchedule_4A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getAmortizationsDescription1(), dblValueOf(form1702RTBean.getAmortizationsAmount1()));
//			tList4a.add(tSched4a);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getAmortizationsDescription2()) &&
//				form1702RTBean.getAmortizationsAmount2() != null) {
//			tSched4a = new ReturnSchedule_4A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getAmortizationsDescription2(),dblValueOf(form1702RTBean.getAmortizationsAmount2()));
//			tList4a.add(tSched4a);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getAmortizationsDescription3()) &&
//				form1702RTBean.getAmortizationsAmount3() != null &&
//				form1702RTBean.getSched4AdditionalAttachments1().isEmpty()) {
//			tSched4a = new ReturnSchedule_4A_1702_RT(referenceNo, Long.valueOf(seq++),
//					   form1702RTBean.getAmortizationsDescription3(),dblValueOf(form1702RTBean.getAmortizationsAmount3()));
//			tList4a.add(tSched4a);
//		}
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched4AdditionalAttachments1()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty() 
//						   && null != aa.getValue()){
//					tSched4a = new ReturnSchedule_4A_1702_RT(referenceNo, Long.valueOf(seq++),
//							aa.getDescription(),dblValueOf(aa.getValue()));
//					tList4a.add(tSched4a);
//				}
//			}
//		}
//
//		//ReturnSchedule_4B_1702_RT
//		ReturnSchedule_4B_1702_RT tSched4b = null;
//		
//		if(transferObject.getSched4B1702RT() != null){
//			tSched4b = transferObject.getSched4B1702RT();
//		}
//		else{
//			tSched4b = new ReturnSchedule_4B_1702_RT();
//		}
//		
//		transferObject.setSched4B1702RT(tSched4b);
//		tSched4b.setReferenceNo(referenceNo);
//		tSched4b.setAdvertisingAndPromotion(
//				dblValueOf(form1702RTBean.getAdvertisingAndPromotions()));
//		tSched4b.setBadDebts(
//				dblValueOf(form1702RTBean.getBadDebts()));
//		tSched4b.setCharitableContribution(
//				dblValueOf(form1702RTBean.getCharitableContributions()));
//		tSched4b.setCommissions(
//				dblValueOf(form1702RTBean.getCommissions()));
//		tSched4b.setCommunicationLigthWater(
//				dblValueOf(form1702RTBean.getCommunicationLightAndWater()));
//		tSched4b.setDepletion(
//				dblValueOf(form1702RTBean.getDepletion()));
//		tSched4b.setDepreciation(
//				dblValueOf(form1702RTBean.getDepreciation()));
//		tSched4b.setDirectorFee(
//				dblValueOf(form1702RTBean.getDirectorsFees()));
//		tSched4b.setFringeBenefit(
//				dblValueOf(form1702RTBean.getFringeBenefits()));
//		tSched4b.setFuelAndOil(
//				dblValueOf(form1702RTBean.getFuelAndOil()));
//		tSched4b.setInsurance(
//				dblValueOf(form1702RTBean.getInsurance()));
//		tSched4b.setInterest(
//				dblValueOf(form1702RTBean.getInterestSchedule4()));
//		tSched4b.setJanitorialServices(
//				dblValueOf(form1702RTBean.getJanitorialAndMessengerialServices()));
//		tSched4b.setLosses(
//				dblValueOf(form1702RTBean.getLosses()));
//		tSched4b.setManagementAndConsultanyFee(
//				dblValueOf(form1702RTBean.getManagementAndConsultancyFee()));
//		tSched4b.setMiscellaneous(
//				dblValueOf(form1702RTBean.getMiscellaneous()));
//		tSched4b.setOfficeSupplies(
//				dblValueOf(form1702RTBean.getOfficeSupplies()));
//		tSched4b.setOtherServices(
//				dblValueOf(form1702RTBean.getOtherServices()));
//		tSched4b.setProfessionalFees(
//				dblValueOf(form1702RTBean.getProfessionalFees()));
//		tSched4b.setRental(
//				dblValueOf(form1702RTBean.getRental()));
//		tSched4b.setMaintenanceLabor(
//				dblValueOf(form1702RTBean.getRepairsAndMaintenanceLaborOrLaborAndMaterials()));
//		tSched4b.setMaintenanceMaterial(
//				dblValueOf(form1702RTBean.getRepairsAndMaintenanceMaterialSupplies()));
//		tSched4b.setRepresentationAndEntertainment(
//				dblValueOf(form1702RTBean.getRepresentationAndEntertainment()));
//		tSched4b.setResearchAndDevelopment(
//				dblValueOf(form1702RTBean.getResearchAndDevelopment()));
//		tSched4b.setRoyalties(
//				dblValueOf(form1702RTBean.getRoyalties()));
//		tSched4b.setSalariesAndAllowance(
//				dblValueOf(form1702RTBean.getSalariesAndAllowances()));
//		tSched4b.setSecurityServices(
//				dblValueOf(form1702RTBean.getSecurityServices()));
//		tSched4b.setOtherContribution(
//				dblValueOf(form1702RTBean.getSSSGSISPhilhealthHDMFAndOtherContributions()));
//		tSched4b.setTaxesAndLicense(
//				dblValueOf(form1702RTBean.getTaxesAndLicenses()));
//		tSched4b.setTollingFee(
//				dblValueOf(form1702RTBean.getTollingFees()));
//		tSched4b.setTrainingAndSeminar(
//				dblValueOf(form1702RTBean.getTrainingAndSeminars()));
//		tSched4b.setTransportaionAndTravel(
//				dblValueOf(form1702RTBean.getTranspotationAndTravel()));
//		
//		seq = 0;
//		//ReturnSchedule_4C_1702_RT
//		List<ReturnSchedule_4C_1702_RT> tList4c = new ArrayList<ReturnSchedule_4C_1702_RT>();
//		
//		transferObject.setSched4C1702RTList(tList4c);
//		
//		ReturnSchedule_4C_1702_RT tSched4c;
//		if (StringUtils.isNotBlank(form1702RTBean.getOthersDescription1()) &&
//				form1702RTBean.getOthersAmount1() != null) {
//			tSched4c = new ReturnSchedule_4C_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOthersDescription1(), dblValueOf(form1702RTBean.getOthersAmount1()));
//			tList4c.add(tSched4c);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getOthersDescription2()) &&
//				form1702RTBean.getOthersAmount2() != null) {
//			tSched4c = new ReturnSchedule_4C_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOthersDescription2(), dblValueOf(form1702RTBean.getOthersAmount2()));
//			tList4c.add(tSched4c);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getOthersDescription3()) &&
//				form1702RTBean.getOthersAmount3() != null) {
//			tSched4c = new ReturnSchedule_4C_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOthersDescription3(), dblValueOf(form1702RTBean.getOthersAmount3()));
//			tList4c.add(tSched4c);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getOthersDescription4()) &&
//				form1702RTBean.getOthersAmount4() != null &&
//				form1702RTBean.getSched4AdditionalAttachments2().isEmpty()) {
//			tSched4c = new ReturnSchedule_4C_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOthersDescription4(), dblValueOf(form1702RTBean.getOthersAmount4()));
//			tList4c.add(tSched4c);
//		}
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched4AdditionalAttachments2()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty() 
//						&& null != aa.getValue()){
//					tSched4c = new ReturnSchedule_4C_1702_RT(referenceNo, Long.valueOf(seq++),
//							aa.getDescription(),dblValueOf(aa.getValue()));
//					tList4c.add(tSched4c);
//				}
//			}
//		}
//		
//		seq = 0;
//		//ReturnSchedule_5_1702_RT
//		List<ReturnSchedule_5_1702_RT> tList5 = new ArrayList<ReturnSchedule_5_1702_RT>();
//		transferObject.setSched51702RTList(tList5);
//		ReturnSchedule_5_1702_RT tSched5;
//		
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsDescription1()) && 
//				StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis1()) &&
//				form1702RTBean.getSpecialAllowableItemizedDeductionsAmount1() != null) {
//			tSched5 = new ReturnSchedule_5_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getSpecialAllowableItemizedDeductionsDescription1(), form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis1(), dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductionsAmount1()),
//					1d, Long.valueOf(1));
//			tList5.add(tSched5);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsDescription2()) &&
//				StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis2()) &&
//				form1702RTBean.getSpecialAllowableItemizedDeductionsAmount2() != null) {
//			tSched5 = new ReturnSchedule_5_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getSpecialAllowableItemizedDeductionsDescription2(), form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis2(), dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductionsAmount2()),
//					2d, Long.valueOf(2));
//			tList5.add(tSched5);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsDescription3()) &&
//				StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis3()) &&
//				form1702RTBean.getSpecialAllowableItemizedDeductionsAmount3() != null) {
//			tSched5 = new ReturnSchedule_5_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getSpecialAllowableItemizedDeductionsDescription3(), form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis3(), dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductionsAmount3()),
//					3d, Long.valueOf(3));
//			tList5.add(tSched5);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsDescription4()) &&
//				StringUtils.isNotBlank(form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis4()) &&
//				form1702RTBean.getSpecialAllowableItemizedDeductionsAmount4() != null &&
//				form1702RTBean.getSched5AdditionalAttachments().isEmpty()) {
//			tSched5 = new ReturnSchedule_5_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getSpecialAllowableItemizedDeductionsDescription4(), form1702RTBean.getSpecialAllowableItemizedDeductionsLegalBasis4(), dblValueOf(form1702RTBean.getSpecialAllowableItemizedDeductionsAmount4()),
//					4d, Long.valueOf(4));
//			tList5.add(tSched5);
//		}
//		else {
//			for (SpecialAllowableItemizedDeductions aa : form1702RTBean.getSched5AdditionalAttachments()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty() 
//					&& null != aa.getLegalBasis() && !aa.getLegalBasis().trim().isEmpty()
//					&& null != aa.getValue()){
//					tSched5 =  new ReturnSchedule_5_1702_RT(referenceNo, Long.valueOf(seq++),
//							aa.getDescription(), aa.getLegalBasis(), dblValueOf(aa.getValue()),
//							dblValueOf(aa.getSequenceNumber()), Long.valueOf(4));
//					tList5.add(tSched5);
//				}
//			}
//		}
//		
//		//ReturnSchedule_6_1702_RT
//		ReturnSchedule_6_1702_RT tSched6 = null;
//		
//		if(transferObject.getSched61702RT() != null){
//			tSched6 = transferObject.getSched61702RT();
//		}
//		else{
//			tSched6 = new ReturnSchedule_6_1702_RT();
//		}
//		
//		transferObject.setSched61702RT(tSched6);
//		tSched6.setReferenceNo(referenceNo);
//		tSched6.setGrssIncome(
//				dblValueOf(form1702RTBean.getGrossIncome()));
//		tSched6.setTotalDeductionExclusiveOfNolco(
//				dblValueOf(form1702RTBean.getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw()));
//		tSched6.setNetOperatingLoss(
//				dblValueOf(form1702RTBean.getNetOperatingLoss()));
//		
//		seq = 0;
//		//ReturnSchedule_6A_1702_RT
//		List<ReturnSchedule_6A_1702_RT> tList6a = new ArrayList<ReturnSchedule_6A_1702_RT>();
//		
//		transferObject.setSched6A1702RTList(tList6a);
//		ReturnSchedule_6A_1702_RT tSched6a;
//		if (dblValueOf(form1702RTBean.getNetOperatingLossYearIncurred1()) > 0) {
//			tSched6a = new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getNetOperatingLossYearIncurred1(), dblValueOf(form1702RTBean.getNetOperatingLossAmount1()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedPreviousYear1()), dblValueOf(form1702RTBean.getNOLCOExpired1()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedCurrentYear1()),dblValueOf(form1702RTBean.getNetOperatingLossUnapplied1()));
//			tList6a.add(tSched6a);
//		}
//		else {
//			tSched6a = new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//					"", 0, 0, 0, 0, 0);
//			tList6a.add(tSched6a);
//		}
//		if (dblValueOf(form1702RTBean.getNetOperatingLossYearIncurred2()) > 0) {
//			tSched6a = new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getNetOperatingLossYearIncurred2(), dblValueOf(form1702RTBean.getNetOperatingLossAmount2()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedPreviousYear2()), dblValueOf(form1702RTBean.getNOLCOExpired2()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedCurrentYear2()),dblValueOf(form1702RTBean.getNetOperatingLossUnapplied2()));
//			tList6a.add(tSched6a);
//		}
//		if (dblValueOf(form1702RTBean.getNetOperatingLossYearIncurred3()) > 0) {
//			tSched6a = new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getNetOperatingLossYearIncurred3(), dblValueOf(form1702RTBean.getNetOperatingLossAmount3()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedPreviousYear3()), dblValueOf(form1702RTBean.getNOLCOExpired3()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedCurrentYear3()),dblValueOf(form1702RTBean.getNetOperatingLossUnapplied3()));
//			tList6a.add(tSched6a);
//		}
//		if (dblValueOf(form1702RTBean.getNetOperatingLossYearIncurred4()) > 0 &&
//				(form1702RTBean.getSched6OperatingLoss().isEmpty())) {
//			tSched6a = new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getNetOperatingLossYearIncurred4(), dblValueOf(form1702RTBean.getNetOperatingLossAmount4()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedPreviousYear4()), dblValueOf(form1702RTBean.getNOLCOExpired4()),
//					dblValueOf(form1702RTBean.getNOLCOAppliedCurrentYear4()),dblValueOf(form1702RTBean.getNetOperatingLossUnapplied4()));
//			tList6a.add(tSched6a);
//		}
//		else {
//			for (OperatingLoss ol : form1702RTBean.getSched6OperatingLoss()) {
//				if(ol.getYear() > 0){
//					tSched6a =  new ReturnSchedule_6A_1702_RT(referenceNo, Long.valueOf(seq++),
//						Integer.toString(ol.getYear()), ol.getAmount(),
//							ol.getNolcoAppliedPreviousYear(), ol.getNolcoExpired(),
//							ol.getNolcoAppliedCurrentYear(),ol.getNetOperatingLossUnapplied());
//					tList6a.add(tSched6a);
//				}
//			}
//		}
//		
//		//ReturnSchedule_7_1702_RT
//		ReturnSchedule_7_1702_RT tSched7 = new ReturnSchedule_7_1702_RT();
//		
//		if(transferObject.getSched71702RT() != null){
//			tSched7 = transferObject.getSched71702RT();
//		}
//		else{
//			tSched7 = new ReturnSchedule_7_1702_RT();
//		}
//		
//		transferObject.setSched71702RT(tSched7);
//		tSched7.setReferenceNo(referenceNo);
//		tSched7.setPriorYearExcessCredit(
//				dblValueOf(form1702RTBean.getPriorYearsExcessCreditsOtherThanMCIT()));
//		tSched7.setIncomeTaxPaymentUnderMCIT(
//				dblValueOf(form1702RTBean.getIncomeTaxPaymentUnderMCIT()));
//		tSched7.setIncomeTaxPaymentUnderRegular(
//				dblValueOf(form1702RTBean.getIncomeTaxPaymentUnderRegularRate()));
//		tSched7.setExcessMCITAppliedCurrentTaxableYear(
//				dblValueOf(form1702RTBean.getExcessMCIT()));
//		tSched7.setCreditableTaxPreviousQuarter(
//				dblValueOf(form1702RTBean.getCreditableTaxWithheldFromPrevQuarters()));
//		tSched7.setCreditableTaxFromBIR2307(
//				dblValueOf(form1702RTBean.getCreditableTaxWithheldFromTheFourthQuarter()));
//		tSched7.setForiegnTax(
//				dblValueOf(form1702RTBean.getForeignTaxCredits()));
//		tSched7.setTaxPaidInReturnPreviouslyFiled(
//				dblValueOf(form1702RTBean.getTaxPaidInReturn()));
//		tSched7.setSpecialTaxCredits(
//				dblValueOf(form1702RTBean.getSched7SpecialTaxCredits()));
//		
//		seq=0;
//		//ReturnSchedule_7A_1702_RT
//		List<ReturnSchedule_7A_1702_RT> tList7a = new ArrayList<ReturnSchedule_7A_1702_RT>();
//		
//		transferObject.setSched7A1702RTList(tList7a);
//
//		ReturnSchedule_7A_1702_RT tSched7a;
//		
//		if (StringUtils.isNotBlank(form1702RTBean.getOtherCreditsPaymentsDescription1()) &&
//				form1702RTBean.getOtherCreditsPaymentsAmount1() != null) {
//			tSched7a = new ReturnSchedule_7A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOtherCreditsPaymentsDescription1(), dblValueOf(form1702RTBean.getOtherCreditsPaymentsAmount1()));
//			tList7a.add(tSched7a);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getOtherCreditsPaymentsDescription2()) &&
//				form1702RTBean.getOtherCreditsPaymentsAmount2() != null &&
//				form1702RTBean.getSched7AdditionalAttachments().isEmpty()) {
//			tSched7a = new ReturnSchedule_7A_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getOtherCreditsPaymentsDescription2(), dblValueOf(form1702RTBean.getOtherCreditsPaymentsAmount2()));
//			tList7a.add(tSched7a);
//		}
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched7AdditionalAttachments()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//				&& null != aa.getValue()){
//					tSched7a = new ReturnSchedule_7A_1702_RT(referenceNo, Long.valueOf(seq++),
//							aa.getDescription(), dblValueOf(aa.getValue()));
//					tList7a.add(tSched7a);
//				}
//			}
//		}
//		
//		seq = 0;
//		//ReturnSchedule_8_1702_RT
//		List<ReturnSchedule_8_1702_RT> tList8 = new ArrayList<ReturnSchedule_8_1702_RT>();
//		
//		transferObject.setSched81702RTList(tList8);
//
//		ReturnSchedule_8_1702_RT tSched8;
//		if (dblValueOf(form1702RTBean.getMcitYear1()) > 0) {
//			tSched8 = new ReturnSchedule_8_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getMcitYear1(), dblValueOf(form1702RTBean.getNormalIncomeTax1()), dblValueOf(form1702RTBean.getMcit1()),
//					dblValueOf(form1702RTBean.getExcessMCITOverNormalTax1()), dblValueOf(form1702RTBean.getExcessMCITAppliedPreviously1()),
//					dblValueOf(form1702RTBean.getExpiredPortionOfExcessMCIT1()),
//					dblValueOf(form1702RTBean.getExcessMCITAppliedCurrently1()), dblValueOf(form1702RTBean.getBalanceOfExcessMCIT1()));
//			tList8.add(tSched8);
//		}
//		if (dblValueOf(form1702RTBean.getMcitYear2()) > 0) {
//			tSched8 = new ReturnSchedule_8_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getMcitYear2(), dblValueOf(form1702RTBean.getNormalIncomeTax2()), dblValueOf(form1702RTBean.getMcit2()),
//					dblValueOf(form1702RTBean.getExcessMCITOverNormalTax2()), dblValueOf(form1702RTBean.getExcessMCITAppliedPreviously2()),
//					dblValueOf(form1702RTBean.getExpiredPortionOfExcessMCIT2()),
//					dblValueOf(form1702RTBean.getExcessMCITAppliedCurrently2()), dblValueOf(form1702RTBean.getBalanceOfExcessMCIT2()));
//			tList8.add(tSched8);
//		}
//		if (dblValueOf(form1702RTBean.getMcitYear3()) > 0) {
//			tSched8 =  new ReturnSchedule_8_1702_RT(referenceNo, Long.valueOf(seq++),
//					form1702RTBean.getMcitYear3(), dblValueOf(form1702RTBean.getNormalIncomeTax3()), dblValueOf(form1702RTBean.getMcit3()),
//					dblValueOf(form1702RTBean.getExcessMCITOverNormalTax3()), dblValueOf(form1702RTBean.getExcessMCITAppliedPreviously3()),
//					dblValueOf(form1702RTBean.getExpiredPortionOfExcessMCIT3()),
//					dblValueOf(form1702RTBean.getExcessMCITAppliedCurrently3()), dblValueOf(form1702RTBean.getBalanceOfExcessMCIT3()));
//			tList8.add(tSched8);
//		}
//
//		//ReturnSchedule_9_1702_RT
//		ReturnSchedule_9_1702_RT tSched9 = null;
//		
//		if(transferObject.getSched91702RT() != null){
//			tSched9 = transferObject.getSched91702RT();
//		}
//		else{
//			tSched9 = new ReturnSchedule_9_1702_RT();
//		}
//		
//		transferObject.setSched91702RT(tSched9);
//		tSched9.setReferenceNo(referenceNo);
//		tSched9.setNetIncomeOrLossPerBooks(
//				dblValueOf(form1702RTBean.getNetIncomeLossPerBooks()));
//		tSched9.setNonDeductibleExpensesTotal(
//				dblValueOf(form1702RTBean.getTotalNonDeductibleExpenses()));
//		tSched9.setNonTaxableIncSpecialDedTotal(
//				dblValueOf(form1702RTBean.getTotalNonTaxableAndFinalTaxIncomeWithSpecialDeductions()));
//		tSched9.setNetTaxableIncomeOrLoss(
//				dblValueOf(form1702RTBean.getSched9NetTaxableIncome()));
//		
//		seq = 0;
//		//ReturnSchedule_9_ND_1702_RT
//		List<ReturnSchedule_9_ND_1702_RT> tList9a = new ArrayList<ReturnSchedule_9_ND_1702_RT>();
//		
//		transferObject.setSched9_ND1702RTList(tList9a);
//
//		ReturnSchedule_9_ND_1702_RT tSched9a;
//		
//		if (StringUtils.isNotBlank(form1702RTBean.getNonDeductibleExpenses()) &&
//				form1702RTBean.getNonDeductibleExpensesAmount() != null) {
//			tSched9a = new ReturnSchedule_9_ND_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getNonDeductibleExpenses(), dblValueOf(form1702RTBean.getNonDeductibleExpensesAmount()),
//					2d, Long.valueOf(2));
//			tList9a.add(tSched9a);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getNonDeductibleExpenses2()) &&
//				form1702RTBean.getNonDeductibleExpensesAmount2() != null &&
//				form1702RTBean.getSched9AdditionalAttachments1().isEmpty()) {
//			tSched9a = new ReturnSchedule_9_ND_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getNonDeductibleExpenses2(), dblValueOf(form1702RTBean.getNonDeductibleExpensesAmount2()),
//					3d, Long.valueOf(3));
//			tList9a.add(tSched9a);
//		}
//		else  {
//			for (OtherExpandable aa : form1702RTBean.getSched9AdditionalAttachments1()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//						&& null != aa.getValue()){
//					tSched9a = new ReturnSchedule_9_ND_1702_RT(
//							referenceNo, Long.valueOf(seq++), 
//							aa.getDescription(), dblValueOf(aa.getValue()),
//							dblValueOf(aa.getSequenceNumber()), Long.valueOf(3));
//					tList9a.add(tSched9a);
//				}
//			}
//		}
//		
//		seq = 0;
//		//ReturnSchedule_9_NT_1702_RT
//		List<ReturnSchedule_9_NT_1702_RT> tList9b = new ArrayList<ReturnSchedule_9_NT_1702_RT>();
//		
//		transferObject.setSched9_NT1702RTList(tList9b);
//		
//		ReturnSchedule_9_NT_1702_RT tSched9b;
//		if (StringUtils.isNotBlank(form1702RTBean.getNonTaxable()) &&
//				form1702RTBean.getNonTaxableAmount() != null) {
//			tSched9b =  new ReturnSchedule_9_NT_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getNonTaxable(), dblValueOf(form1702RTBean.getNonTaxableAmount()),
//					5d, Long.valueOf(5));
//			tList9b.add(tSched9b);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getNonTaxable2()) &&
//				form1702RTBean.getNonTaxableAmount2() != null &&
//				form1702RTBean.getSched9AdditionalAttachments2().isEmpty()) {
//			tSched9b = new ReturnSchedule_9_NT_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getNonTaxable2(), dblValueOf(form1702RTBean.getNonTaxableAmount2()),
//					6d, Long.valueOf(6));
//			tList9b.add(tSched9b);
//		}
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched9AdditionalAttachments2()) {
//				if( null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//					&& null != aa.getValue()){
//				tSched9b = new ReturnSchedule_9_NT_1702_RT(
//						referenceNo, Long.valueOf(seq++), 
//						aa.getDescription(), dblValueOf(aa.getValue()),
//						dblValueOf(aa.getSequenceNumber()), Long.valueOf(6));
//				tList9b.add(tSched9b);
//				}
//			}
//		}
//		
//		seq = 0;
//		//ReturnSchedule_9_SD_1702_RT
//		List<ReturnSchedule_9_SD_1702_RT> tList9c = new ArrayList<ReturnSchedule_9_SD_1702_RT>();
//		
//		transferObject.setSched9_SD1702RTList(tList9c);
//		
//		ReturnSchedule_9_SD_1702_RT tSched9c;;
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialDeductions()) &&
//				form1702RTBean.getSpecialDeductionsAmount() != null) {
//			tSched9c = new ReturnSchedule_9_SD_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getSpecialDeductions(), dblValueOf(form1702RTBean.getSpecialDeductionsAmount()),
//					7d, Long.valueOf(7));
//			tList9c.add(tSched9c);
//		}
//		if (StringUtils.isNotBlank(form1702RTBean.getSpecialDeductions2()) &&
//				form1702RTBean.getSpecialDeductionsAmount2() != null &&
//				form1702RTBean.getSched9AdditionalAttachments3().isEmpty()) {
//			tSched9c =  new ReturnSchedule_9_SD_1702_RT(
//					referenceNo, Long.valueOf(seq++), 
//					form1702RTBean.getSpecialDeductions2(), dblValueOf(form1702RTBean.getSpecialDeductionsAmount2()),
//					8d, Long.valueOf(8));
//			tList9c.add(tSched9c);
//		}
//		else {
//			for (OtherExpandable aa : form1702RTBean.getSched9AdditionalAttachments3()) {
//				if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty() 
//					&& null != aa.getValue()){
//					tSched9c = new ReturnSchedule_9_SD_1702_RT(
//							referenceNo, Long.valueOf(seq++), 
//							aa.getDescription(), dblValueOf(aa.getValue()),
//							dblValueOf(aa.getSequenceNumber()), Long.valueOf(8));
//					tList9c.add(tSched9c);
//				}
//			}
//		}
//
//		//ReturnSchedule_10_1702_RT
//		ReturnSchedule_10_1702_RT tSched10 = null;
//		
//		if( transferObject.getSched101702RT() != null){
//			tSched10 = transferObject.getSched101702RT();
//		}
//		else{
//			tSched10 = new ReturnSchedule_10_1702_RT();
//		}
//		
//		transferObject.setSched101702RT(tSched10);
//		tSched10.setReferenceNo(referenceNo);
//		tSched10.setCurrentAsset(
//				dblValueOf(form1702RTBean.getCurrentAssets()));
//		tSched10.setLongTermInvestment(
//				dblValueOf(form1702RTBean.getLongTermInvestment()));
//		tSched10.setProperty(
//				dblValueOf(form1702RTBean.getNetPropertyPlantAndEquipment()));
//		tSched10.setLongTermReceivables(
//				dblValueOf(form1702RTBean.getLongTermReceivables()));
//		tSched10.setIntangibleAsset(
//				dblValueOf(form1702RTBean.getIntangibleAssets()));
//		tSched10.setOtherAsset(
//				dblValueOf(form1702RTBean.getOtherAssets()));
//		tSched10.setTotalAsset(
//				dblValueOf(form1702RTBean.getTotalAssets()));
//		tSched10.setCurrentLiablity(
//				dblValueOf(form1702RTBean.getCurrentLiabilities()));
//		tSched10.setLongTermLiability(
//				dblValueOf(form1702RTBean.getLongTermLiabilities()));
//		tSched10.setDeferredCredit(
//				dblValueOf(form1702RTBean.getDeferredCredits()));
//		tSched10.setOtherLiability(
//				dblValueOf(form1702RTBean.getOtherLiabilities()));
//		tSched10.setTotalLiablity(
//				dblValueOf(form1702RTBean.getTotalLiabilities()));
//		tSched10.setCapitalStock(
//				dblValueOf(form1702RTBean.getCapitalStock()));
//		tSched10.setAdditionalPaidinCapital(
//				dblValueOf(form1702RTBean.getAdditionalPaidInCapital()));
//		tSched10.setRetainedEarning(
//				dblValueOf(form1702RTBean.getRetainedEarnings()));
//		tSched10.setTotalEquity(
//				dblValueOf(form1702RTBean.getTotalEquity()));
//		tSched10.setTotalLiabilityAndEquity(
//				dblValueOf(form1702RTBean.getTotalLiabilitiesAndEquity()));
//		
//		if(form1702RTBean.getCapitalContributorTypeList() != null){
//			ReturnContributorType_1702 contriType = new ReturnContributorType_1702();
//			contriType.setReferenceNo(referenceNo);
//
//			if(form1702RTBean.getCapitalContributorTypeList().contains("P")){
//				contriType.setContributorType("P");
//			}
//			else if(form1702RTBean.getCapitalContributorTypeList().contains("S") && form1702RTBean.getCapitalContributorTypeList().contains("M")){
//				contriType.setContributorType("SM");
//			}
//			else if(form1702RTBean.getCapitalContributorTypeList().contains("S") && !form1702RTBean.getCapitalContributorTypeList().contains("M")){
//				contriType.setContributorType("S");
//			} 
//			else if(!form1702RTBean.getCapitalContributorTypeList().contains("S") && form1702RTBean.getCapitalContributorTypeList().contains("M")){
//				contriType.setContributorType("M");
//			}
//			
//			transferObject.setSched111702RTContributorType(contriType);
//			
//			//sched 11 list
//			seq = 0;
//			//ReturnSchedule_11_1702_RT
//			List<ReturnContributors_1702> tList11 = new ArrayList<ReturnContributors_1702>();
//			
//			transferObject.setSched111702RTList(tList11);	
//			ReturnContributors_1702 tSched11;
//			for (StockholdersPartners mi : form1702RTBean.getSched11AdditionalAttachments()) {
//				
//				if(mi.getTin1() != null 
//					&& mi.getTin2() != null 
//					&& mi.getTin3() != null
//					&& mi.getBranchCode() != null
//					&& mi.getCapitalContribution() != null
//					&& mi.getPercentToTotal() != null
//					&& !mi.getTin1().equals("null") 
//					&& !mi.getTin2().equals("null") 
//					&& !mi.getTin3().equals("null")
//					&& !mi.getTin1().trim().isEmpty()
//					&& !mi.getTin2().trim().isEmpty()
//					&& !mi.getTin3().trim().isEmpty()
//					&& !mi.getBranchCode().equals("null")
//					&& !mi.getBranchCode().trim().isEmpty()){
//			
//					tSched11 = new ReturnContributors_1702(referenceNo, Long.valueOf(seq++),
//							 mi.getRegisteredName(), mi.getTin1() + mi.getTin2() + mi.getTin3(), mi.getBranchCode(),
//							dblValueOf(mi.getCapitalContribution()), safeParseFloat(mi.getPercentToTotal()));
//					tList11.add(tSched11);
//				}
//			}
//		}
//		
//		//Dont forget uncomment, please fix weird issue with multiple inserts on these schedules
//		
//		//ReturnSchedule_12I_1702_RT
//		List<ReturnSchedule_12I_1702_RT> tList12I = new ArrayList<ReturnSchedule_12I_1702_RT>();
//		transferObject.setSched12I1702RTList(tList12I);
//		seq = 0;
//		ReturnSchedule_12I_1702_RT tSched12I;
//		if (dblValueOf(form1702RTBean.getExemptInterest()) != 0 || 
//				dblValueOf(form1702RTBean.getFairMarketValueInterest()) != 0 || 
//				dblValueOf(form1702RTBean.getFinalTaxWthldInterest()) != 0) {
//			
//			tSched12I = new ReturnSchedule_12I_1702_RT(referenceNo, Long.valueOf(seq++),
//					"Interests", dblValueOf(form1702RTBean.getExemptInterest()), dblValueOf(form1702RTBean.getFairMarketValueInterest()),
//					dblValueOf(form1702RTBean.getFinalTaxWthldInterest()));
//			tList12I.add(tSched12I);
//		}
//
//		if (dblValueOf(form1702RTBean.getExemptRoyalties()) != 0 || 
//				dblValueOf(form1702RTBean.getFairMarketValueRoyalties()) != 0 || 
//				dblValueOf(form1702RTBean.getFinalTaxWthldRoyalties()) != 0) {
//			tSched12I = new ReturnSchedule_12I_1702_RT(referenceNo, Long.valueOf(seq++),
//					"Royalties", dblValueOf(form1702RTBean.getExemptRoyalties()), dblValueOf(form1702RTBean.getFairMarketValueRoyalties()),
//					dblValueOf(form1702RTBean.getFinalTaxWthldRoyalties()));
//			tList12I.add(tSched12I);
//		}
//		
//		if (dblValueOf(form1702RTBean.getExemptDividends()) != 0 || 
//				dblValueOf(form1702RTBean.getFairMarketValueDividends()) != 0 || 
//				dblValueOf(form1702RTBean.getFinalTaxWthldDividends()) != 0) {
//			tSched12I = new ReturnSchedule_12I_1702_RT(referenceNo, Long.valueOf(seq++),
//					"Dividends", dblValueOf(form1702RTBean.getExemptDividends()), dblValueOf(form1702RTBean.getFairMarketValueDividends()),
//					dblValueOf(form1702RTBean.getFinalTaxWthldDividends()));
//			tList12I.add(tSched12I);
//		}
//		
//		if ((dblValueOf(form1702RTBean.getExemptPrizesWinnings()) != 0 || 
//				dblValueOf(form1702RTBean.getFairMarketValuePrizesWinnings()) != 0 || 
//				dblValueOf(form1702RTBean.getFinalTaxWthldPrizesWinnings()) != 0)) {
////				&& form1702RTBean.getListOfGrossIncomeFinalWithholding().isEmpty()) {
//			tSched12I = new ReturnSchedule_12I_1702_RT(referenceNo, Long.valueOf(seq++),
//					"Prizes and Winnings", dblValueOf(form1702RTBean.getExemptPrizesWinnings()), dblValueOf(form1702RTBean.getFairMarketValuePrizesWinnings()),
//					dblValueOf(form1702RTBean.getFinalTaxWthldPrizesWinnings()));
//			tList12I.add(tSched12I);
//		}
////		else {
//		if (!form1702RTBean.getListOfGrossIncomeFinalWithholding().isEmpty()) {
//			for (GrossIncomeFinalWithholding aa : form1702RTBean.getListOfGrossIncomeFinalWithholding()) {
//				if(StringUtils.isNotBlank(aa.getDescription())
//					&& (dblValueOf(aa.getExempt()) > 0 || dblValueOf(aa.getActualAmount()) > 0 || dblValueOf(aa.getFinalTaxWithheld()) > 0 )){
//					tSched12I = new ReturnSchedule_12I_1702_RT(referenceNo, Long.valueOf(seq++),
//							aa.getDescription(), dblValueOf(aa.getExempt()), dblValueOf(aa.getActualAmount()),
//							dblValueOf(aa.getFinalTaxWithheld())) ;
//					tList12I.add(tSched12I);
//				}
//			}
//		}
//
//		// ReturnSchedule_12II_1702_RT
//		List<ReturnSchedule_12II_1702_RT> tList12II = new ArrayList<ReturnSchedule_12II_1702_RT>();
//		transferObject.setSched12II1702RTList(tList12II);
//		
//		seq = 0;
//		ReturnSchedule_12II_1702_RT tSched12II;
//		for (RealPropertiesSalesExchange aa : form1702RTBean.getListOfRealPropertiesSalesExchange()) {
//			if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//					&& null != aa.getTaxDeclaration() &&  !aa.getTaxDeclaration().trim().isEmpty()
//					&& null != aa.getAuthorizingRegistration() && !aa.getAuthorizingRegistration().trim().isEmpty()
//					&& null != aa.getActualAmount()
//					&& null != aa.getFinalTaxWithheld()){
//				tSched12II = new ReturnSchedule_12II_1702_RT(referenceNo, Long.valueOf(seq++),
//						aa.getDescription(), aa.getTaxDeclaration(), aa.getAuthorizingRegistration(),
//						dblValueOf(aa.getActualAmount()), dblValueOf(aa.getFinalTaxWithheld()));
//				tList12II.add(tSched12II);
//			}
//		}
//
//		// ReturnSchedule_12III_1702_RT
//		List<ReturnSchedule_12III_1702_RT> tList12III = new ArrayList<ReturnSchedule_12III_1702_RT>();
//		transferObject.setSched12III1702RTList(tList12III);
//		
//		seq = 0;
//		ReturnSchedule_12III_1702_RT tSched12III;
//		for (SharesOfStockSalesExchange aa : form1702RTBean.getListOfSharesOfStockSalesExchange()) {
//			if(null != aa.getKind()
//					&& null != aa.getStockCertificate() && !aa.getStockCertificate().trim().isEmpty()
//					&& null != aa.getAuthorizingRegistration() && !aa.getAuthorizingRegistration().trim().isEmpty()
//					&& null != aa.getNumberOfShares()
//					&& null != aa.getDateOfIssue()
//					&& null != aa.getActualAmount()
//					&& null != aa.getFinalTaxWithheld()){
//			tSched12III = new ReturnSchedule_12III_1702_RT(referenceNo, Long.valueOf(seq++),
//						aa.getKind(), aa.getStockCertificate(), aa.getAuthorizingRegistration(),
//						dblValueOf(aa.getNumberOfShares()), aa.getDateOfIssue(), dblValueOf(aa.getActualAmount()),
//						dblValueOf(aa.getFinalTaxWithheld()));
//			tList12III.add(tSched12III);
//			}
//		}
//
//		// ReturnSchedule_12IV_1702_RT
//		List<ReturnSchedule_12IV_1702_RT> tList12IV = new ArrayList<ReturnSchedule_12IV_1702_RT>();
//		transferObject.setSched12IV1702RTList(tList12IV);
//		
//		seq = 0;
//		ReturnSchedule_12IV_1702_RT tSched12IV;
//		for (OtherIncome aa : form1702RTBean.getListOfOtherIncome()) {
//			if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//				&& null != aa.getActualAmount()
//				&& null != aa.getFinalTaxWithheld()){
//				tSched12IV = new  ReturnSchedule_12IV_1702_RT(referenceNo, Long.valueOf(seq++),
//						aa.getDescription(), dblValueOf(aa.getActualAmount()), dblValueOf(aa.getFinalTaxWithheld()));
//				tList12IV.add(tSched12IV);
//			}
//		}
//		
//
//		
//		//ReturnSchedule_1_1702_RT
//		ReturnSchedule_13_1702_RT tSched13 = null;
//		
//		if(transferObject.getSched131702RT() != null){
//			tSched13 = transferObject.getSched131702RT();
//		}
//		else{
//			tSched13 = new ReturnSchedule_13_1702_RT();
//		}
//		
//		transferObject.setSched131702RT(tSched13);
//		tSched13.setReferenceNo(referenceNo);
//		tSched13.setReturnPremium(dblValueOf(form1702RTBean.getReturnOfPremium()));
//		
//		// ReturnSchedule_13I_1702_RT
//		List<ReturnSchedule_13I_1702_RT> tList13I = new ArrayList<ReturnSchedule_13I_1702_RT>();
//		transferObject.setSched13I1702RTList(tList13I);
//		
//		seq = 0;
//		ReturnSchedule_13I_1702_RT tSched13I;
//		for (PersonalRealPropertiesReceived aa : form1702RTBean.getListOfPersonalRealPropertiesReceived()) {
//			if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//					&& null != aa.getModeOfTransfer() && !aa.getModeOfTransfer().trim().isEmpty()
//					&& null != aa.getAuthorizingRegistration() && !aa.getAuthorizingRegistration().trim().isEmpty()
//					&& null != aa.getValue()){
//			tSched13I = new ReturnSchedule_13I_1702_RT(referenceNo, Long.valueOf(seq++),
//					aa.getDescription(), aa.getModeOfTransfer(), aa.getAuthorizingRegistration(),
//					dblValueOf(aa.getValue()));
//			tList13I.add(tSched13I);
//			}
//		}
//
//		// ReturnSchedule_13II_1702_RT
//		List<ReturnSchedule_13II_1702_RT> tList13II = new ArrayList<ReturnSchedule_13II_1702_RT>();
//		transferObject.setSched13II1702RTList(tList13II);
//		
//		seq = 0;
//		ReturnSchedule_13II_1702_RT tSched13II;
//		for (OtherIncome aa : form1702RTBean.getListOfOtherExemptIncome()) {
//			if(null != aa.getDescription() && !aa.getDescription().trim().isEmpty()
//					&& null != aa.getActualAmount()){
//				tSched13II = new ReturnSchedule_13II_1702_RT(referenceNo, Long.valueOf(seq++),
//						aa.getDescription(), dblValueOf(aa.getActualAmount()));
//				tList13II.add(tSched13II);
//			}
//		}
//	}

//	public static void initializeFormBean(Form1702RTBean form1702RTBean, RegisteredTaxPayerBean registeredTaxPayer, EfpsEnrolledTaxPayerBean enrolledTaxPayer){		
//		SimpleDateFormat mmddyyyy = new SimpleDateFormat("MM/dd/yyyy");
//		
//		form1702RTBean.setTinA(registeredTaxPayer.getTinPart1());
//		form1702RTBean.setTinB(registeredTaxPayer.getTinPart2());
//		form1702RTBean.setTinC(registeredTaxPayer.getTinPart3());
//		form1702RTBean.setBranchCode(registeredTaxPayer.getRegistrationPK().getBranchCode());
//		form1702RTBean.setRdoCode(registeredTaxPayer.getRdoCode().getRdoCode());
//		form1702RTBean.setDateIncorporation(registeredTaxPayer.getIncorporationDate());
//		form1702RTBean.setLastName(registeredTaxPayer.getLastName());
//		form1702RTBean.setFirstName(registeredTaxPayer.getFirstName());
//		form1702RTBean.setRegisteredName(registeredTaxPayer.getRegisteredName());
//		form1702RTBean.setRegisteredAddress(registeredTaxPayer.getRegisteredAddress());
//		form1702RTBean.setSubStreet(registeredTaxPayer.getSubStreet());
//		form1702RTBean.setStreetAddress(registeredTaxPayer.getStreetAddress());
//		form1702RTBean.setBarangayAddress(registeredTaxPayer.getBarangayAddress());
//		form1702RTBean.setCityAddress(registeredTaxPayer.getCityAddress());
//		form1702RTBean.setZipCode(registeredTaxPayer.getZipCode());
//		form1702RTBean.setContactNumber(registeredTaxPayer.getTelephoneNumber());
//		form1702RTBean.setEmailAddress(enrolledTaxPayer.getEmailAddress());
//		form1702RTBean.setMainLineBusiness(registeredTaxPayer.getDescription());
//		form1702RTBean.setCalendarFiscal(registeredTaxPayer.getSubCode());
//	}	
//	
	public static double dblValueOf(String s) {
		try {
			return FIX_NEGATIVE.parse(s).doubleValue();
		}
		catch (ParseException e) {return 0;}
		catch (NullPointerException e) {return 0;}
                /* PCX */ //HD2016-1333195 - java.lang.numberformatexception.forinputstring
                catch (NumberFormatException e) {return 0;}
	}

	public static String dblToString(double d) {
		return FIX_NEGATIVE.format(Math.round(d)).toString();
	}

	public static int intValueOf(String s) {
		try {
			return Integer.valueOf(s);
		}
		catch (NumberFormatException e) {return 0;}
	}
//	
//	public static Date strToDate(String val) {		
//		if(val != null && !val.isEmpty()) {
//			SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//			try{
//				return df.parse(val);
//			}catch (Exception e) {
//				return null;
//			}
//		}
//		
//		return null;
//	}
//	
//	public static String dateToStr(Date val) {
//		if(val != null) {
//			SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//			try{
//				return df.format(val);
//			}catch (Exception e) {
//				return null;
//			}
//			
//		}
//		return null;
//	}
//	
	public static void moveTransactionToBean(ReturnTransaction_1702_RT trans, Form1702RTBean bean) {
		if(trans != null) {
			
			//from offline filing
//			bean.setFromOffline(trans.getFromOffline());
			
			bean.setReferenceNo(trans.getReferenceNo());  //transaction identifier
			bean.setTin(trans.getTin()); 	//item 6a,b,c
                        bean.setTinA(trans.getTin().substring(0,3));
                        bean.setTinB(trans.getTin().substring(3,6));
                        bean.setTinC(trans.getTin().substring(6,9));
			bean.setBranchCode(trans.getBranchCode());  //item 6d
			bean.setDateFiled(trans.getDateFiled()); //default to current date
			//bean.setDueDate(trans.getDueDate()); //taken from table RCS_RETURN_DUE_DATES
			bean.setBatchNo(trans.getBatchNo()); //this is a system generated field  Default is 0
			bean.setYearType(trans.getYearType()); //Item 1 (F/C)
			bean.setReturnPeriod(trans.getReturnPeriod()); //taken from RCS_RETURN_DUE_DATES table
			bean.setYearEnded(YEAR_FORMAT.format(trans.getReturnPeriod()));
			bean.setYearEndedMonth(MONTH_FORMAT.format(trans.getReturnPeriod()));
			bean.setAmmended(trans.getAmmended()); //item 3 (Y/N)
			bean.setAmendedReturn(trans.getAmmended());
			bean.setNumSheet(trans.getNumSheet());  //number of forms filed default is 0
			bean.setNumberOfPagesFiled(String.valueOf(trans.getNumSheet()));  //number of forms filed default is 0
			bean.setAtcCode(trans.getAtcCode()); //selected ATC code
			bean.setSpecialRateYN(trans.getSpecialRateYN()); //default N
			bean.setInternationalTreaty(trans.getInternationalTreaty()); //default N
			bean.setExemptSale(trans.getExemptSale()); //defualt 0
			bean.setExemptCost(trans.getExemptCost()); //default 0
			bean.setExemptGrossIncome(trans.getExemptGrossIncome()); 
			bean.setSpecialGrossIncome(trans.getSpecialGrossIncome()); 
			bean.setRegularGrossIncome(trans.getRegularGrossIncome()); 
			bean.setExemptOtherIncome(trans.getExemptOtherIncome()); 
			bean.setSpecialOtherIncome(trans.getSpecialOtherIncome()); 
			bean.setRegularOtherIncome(trans.getRegularOtherIncome()); 
			bean.setSpecialCreditOtherIncome(trans.getSpecialCreditOtherIncome()); 
			bean.setRegularCreditOtherIncome(trans.getRegularCreditOtherIncome()); 
			bean.setExemptTotalGrossIncome(trans.getExemptTotalGrossIncome()); 
			bean.setSpecialTotalGrossIncome(trans.getSpecialTotalGrossIncome()); 
			bean.setRegularTotalGrossIncome(trans.getRegularTotalGrossIncome()); 
			bean.setExemptDeductions(trans.getExemptDeductions()); 
			bean.setSpecialAllowableDeductions(trans.getSpecialDeductions()); 
			bean.setRegularDeductions(trans.getRegularDeductions()); 
			bean.setSpecialTaxableIncome(trans.getSpecialTaxableIncome()); 
			bean.setRegularTaxableIncome(trans.getRegularTaxableIncome());
			bean.setSpecialRate(trans.getSpecialRate()); 
			bean.setRegularRate(trans.getRegularRate()); 
			bean.setSpecialIncomeTax(trans.getSpecialIncomeTax()); 
			bean.setRegularIncomeTax(trans.getRegularIncomeTax()); 
			bean.setRegularTax(trans.getRegularTax()); 
			bean.setExcessPriorMCIT(trans.getExcessPriorMCIT()); 
			bean.setBalance(trans.getBalance()); 
			bean.setSpecialTax(trans.getSpecialTax()); 
			bean.setAggregateTaxDue(trans.getAggregateTaxDue()); 
			bean.setExecssCredit(trans.getExecssCredit()); 
			bean.setQuarterTaxPayment(trans.getQuarterTaxPayment()); 
			bean.setQuarterTaxWitheld(trans.getQuarterTaxWitheld());
			bean.setQuarterTaxWitheld2307(trans.getQuarterTaxWitheld2307()); 
			bean.setForeignTaxPaid(trans.getForeignTaxPaid());
			bean.setPreviousTaxPaid(trans.getPreviousTaxPaid()); 
			bean.setTotalTaxCredit(trans.getTotalTaxCredit()); 
			bean.setTaxPayable(trans.getTaxPayable());
			bean.setTotals(trans.getTotal());
			bean.setSurcharges(trans.getSurcharge());
			bean.setInterests(trans.getInterest()); 
			bean.setCompromises(trans.getCompromise());
			bean.setPenalties(trans.getPenalties());
			bean.setTotalAmountPayable(trans.getTotalAmountPayable()); 
			bean.setRefundType(trans.getRefundType());
			
			//refactor this
			bean.setCommunityTaxCert(trans.getCommunityTaxCert());
			bean.setCommunityTaxCertificateNumber(trans.getCommunityTaxCert());
			bean.setPlaceIssue(trans.getPlaceIssue()); 
			bean.setCtcPlaceIssue(trans.getPlaceIssue());
			bean.setDateIssued(trans.getDateIssued());
			bean.setCtcDateIssue(trans.getDateIssued());
			bean.setCtcAmount(trans.getCtcAmount());
			
			bean.setShareAgency(trans.getShareAgency());
			bean.setFormVersion(1);
			bean.setTaxAgentTin(trans.getTaxAgentTin()); 
			bean.setTaxAgentAcctNo(trans.getTaxAgentAcctNo());
			bean.setShortPeriodReturn((trans.getShortPeriod()));
			
			bean.setMethodDeduction(trans.getMethodDeduction());
			bean.setMethodDeductions((trans.getMethodDeduction()));// delete the other method of deductions
			
			bean.setOtherPaymentMade(trans.getOtherPaymentMade());
			bean.setExemptTaxableIncome(trans.getExemptTaxableIncome());
			bean.setExemptRate(trans.getExemptRate()); 
			bean.setExemptIncomeMCIT(trans.getExemptIncomeMCIT());
			bean.setSpecialIncomeMCIT(trans.getSpecialIncomeMCIT()); 
			bean.setRegularIncomeMCIT(trans.getRegularIncomeMCIT());
			bean.setSpecialIncomeNatlGov(trans.getSpecialIncomeNatlGov());
			bean.setExemptMCIT(trans.getExemptMCIT()); 
			bean.setRegularMCIT(trans.getRegularMCIT());
			bean.setMcitPreviousQuarter(trans.getMcitPreviousQuarter());
			bean.setExcessMCITCurrent(trans.getExcessMCITCurrent());
			bean.setSpecialRatePreviousQtr(trans.getSpecialRatePreviousQtr());
			bean.setSpecialTaxCredit(trans.getSpecialTaxCredit()); 
			bean.setSpecialTotalTaxCredit(trans.getSpecialTotalTaxCredit());
			bean.setSpecialTaxPayable(trans.getSpecialTaxPayable());
			bean.setInternaltionalTreatyType(trans.getInternaltionalTreatyType());
			bean.setEntryType(trans.getEntryType());
			bean.setNumActivity(trans.getNumActivity());
			bean.setDefualtATC(trans.getDefualtATC());
			bean.setNonDefaultATC(trans.getNonDefaultATC());
			bean.setSpecialPreviousTaxPaid(trans.getSpecialPreviousTaxPaid());
			bean.setQuarterTaxPaymentMCIT(trans.getQuarterTaxPaymentMCIT());
			bean.setSpecialQuarterTaxWitheld(trans.getSpecialQuarterTaxWitheld());
			bean.setSpecialQuarterTaxWitheld2307(trans.getSpecialQuarterTaxWitheld2307());
			bean.setSpecialForeignTaxCredit(trans.getSpecialForeignTaxCredit());
			bean.setQuarterTaxPaymentSpecialRate(trans.getQuarterTaxPaymentSpecialRate());
			bean.setTotalAllowanceNOLCO(trans.getTotalAllowanceNOLCO());
			bean.setFormCode(trans.getFormCode());
			bean.setFomrType(trans.getFomrType());	
			bean.setCtcRegType(trans.getCtcSecType());
		}
	}
//	
//	public static void moveBeanToTransaction(ReturnTransaction_1702_RT trans, Form1702RTBean bean) {
//		if(bean != null) {
//			try {
//				
//				//from offline filing
//				trans.setFromOffline(bean.getFromOffline());
//				
//				trans.setReferenceNo(bean.getReferenceNo());
//				trans.setNumSheet(bean.getNumSheet());
//				trans.setNumSheet(Integer.valueOf(bean.getNumberOfPagesFiled()));
//				trans.setTin(bean.getTin());
//				trans.setBranchCode(bean.getBranchCode());
//				trans.setDateFiled(bean.getDateFiled());
//				trans.setDueDate(bean.getDueDate());
//				trans.setBatchNo(bean.getBatchNo());
//				trans.setYearType(bean.getYearType());
//				//build return period from month and year
//				buildReturnPeriodDate(bean);
//				trans.setReturnPeriod(bean.getReturnPeriod());
//				trans.setAmmended(bean.getAmmended());
//				trans.setSpecialRateYN(bean.getSpecialRateYN());
//				trans.setInternationalTreaty(bean.getInternationalTreaty());
//				trans.setExemptSale(bean.getExemptSale());
//				trans.setExemptCost(bean.getExemptCost());
//				trans.setExemptGrossIncome(bean.getExemptGrossIncome());
//				trans.setSpecialGrossIncome(bean.getSpecialGrossIncome());
//				trans.setRegularGrossIncome(bean.getRegularGrossIncome());
//				trans.setExemptOtherIncome(bean.getExemptOtherIncome());
//				trans.setSpecialOtherIncome(bean.getSpecialOtherIncome());
//				trans.setRegularOtherIncome(bean.getRegularOtherIncome());
//				trans.setSpecialCreditOtherIncome(bean.getSpecialCreditOtherIncome());
//				trans.setRegularCreditOtherIncome(bean.getRegularCreditOtherIncome());
//				trans.setExemptTotalGrossIncome(bean.getExemptTotalGrossIncome());
//				trans.setSpecialTotalGrossIncome(bean.getSpecialTotalGrossIncome());
//				trans.setRegularTotalGrossIncome(bean.getRegularTotalGrossIncome());
//				trans.setExemptDeductions(bean.getExemptDeductions());
//				trans.setSpecialDeductions(dblValueOf(bean.getSpecialDeductions()));
//				trans.setRegularDeductions(bean.getRegularDeductions());
//				trans.setSpecialTaxableIncome(bean.getSpecialTaxableIncome());
//				trans.setRegularTaxableIncome(bean.getRegularTaxableIncome());
//				trans.setSpecialRate(bean.getSpecialRate());
//				trans.setRegularRate(bean.getRegularRate());
//				trans.setSpecialIncomeTax(bean.getSpecialIncomeTax());
//				trans.setRegularIncomeTax(bean.getRegularIncomeTax());
//				trans.setRegularTax(bean.getRegularTax());
//				trans.setExcessPriorMCIT(bean.getExcessPriorMCIT());
//				trans.setBalance(bean.getBalance());
//				trans.setSpecialTax(bean.getSpecialTax());
//				trans.setAggregateTaxDue(bean.getAggregateTaxDue());
//				trans.setExecssCredit(bean.getExecssCredit());
//				trans.setQuarterTaxPayment(bean.getQuarterTaxPayment());
//				trans.setQuarterTaxWitheld(bean.getQuarterTaxWitheld());
//				trans.setQuarterTaxWitheld2307(bean.getQuarterTaxWitheld2307());
//				trans.setForeignTaxPaid(bean.getForeignTaxPaid());
//				trans.setPreviousTaxPaid(bean.getPreviousTaxPaid());
//				trans.setTotalTaxCredit(bean.getTotalTaxCredit());
//				trans.setTaxPayable(bean.getTaxPayable());
//				trans.setTotal(dblValueOf(bean.getTotal()));
//				trans.setSurcharge(dblValueOf(bean.getSurcharge()));
//				trans.setInterest(dblValueOf(bean.getInterest()));
//				trans.setCompromise(dblValueOf(bean.getCompromise()));
//				trans.setPenalties(bean.getPenalties());
//				trans.setTotalAmountPayable(bean.getTotalAmountPayable());
//				trans.setRefundType(bean.getRefundType());
//				trans.setCommunityTaxCert(bean.getCommunityTaxCert());
//				trans.setPlaceIssue(bean.getPlaceIssue());
//				trans.setDateIssued(bean.getDateIssued());
//				trans.setCtcAmount(bean.getCtcAmount());
//				trans.setShareAgency(bean.getShareAgency());
//				trans.setFormVersion(1);
//				trans.setTaxAgentTin(bean.getTaxAgentTin());
//				trans.setTaxAgentAcctNo(bean.getTaxAgentAcctNo());
//				trans.setShortPeriod(bean.getShortPeriodReturn());// delete the other shortPeriod
//				trans.setMethodDeduction(bean.getMethodDeductions());
//				trans.setOtherPaymentMade(bean.getOtherPaymentMade());
//				trans.setExemptTaxableIncome(bean.getExemptTaxableIncome());
//				trans.setExemptRate(bean.getExemptRate());
//				trans.setExemptIncomeMCIT(bean.getExemptIncomeMCIT());
//				trans.setSpecialIncomeMCIT(bean.getSpecialIncomeMCIT());
//				trans.setRegularIncomeMCIT(bean.getRegularIncomeMCIT());
//				trans.setSpecialIncomeNatlGov(bean.getSpecialIncomeNatlGov());
//				trans.setExemptMCIT(bean.getExemptMCIT());
//				trans.setRegularMCIT(bean.getRegularMCIT());
//				trans.setMcitPreviousQuarter(bean.getMcitPreviousQuarter());
//				trans.setExcessMCITCurrent(bean.getExcessMCITCurrent());
//				trans.setSpecialRatePreviousQtr(bean.getSpecialRatePreviousQtr());
//				trans.setSpecialTaxCredit(bean.getSpecialTaxCredit());
//				trans.setSpecialTotalTaxCredit(bean.getSpecialTotalTaxCredit());
//				trans.setSpecialTaxPayable(bean.getSpecialTaxPayable());
//				trans.setInternaltionalTreatyType(bean.getInternaltionalTreatyType());
//				trans.setEntryType(bean.getEntryType());
//				trans.setNumActivity(bean.getNumActivity());
//				trans.setSpecialPreviousTaxPaid(bean.getSpecialPreviousTaxPaid());
//				trans.setQuarterTaxPaymentMCIT(bean.getQuarterTaxPaymentMCIT());
//				trans.setSpecialQuarterTaxWitheld(bean.getSpecialQuarterTaxWitheld());
//				trans.setSpecialQuarterTaxWitheld2307(bean.getSpecialQuarterTaxWitheld2307());
//				trans.setSpecialForeignTaxCredit(bean.getSpecialForeignTaxCredit());
//				trans.setQuarterTaxPaymentSpecialRate(bean.getQuarterTaxPaymentSpecialRate());
//				trans.setTotalAllowanceNOLCO(bean.getTotalAllowanceNOLCO());
//				trans.setFormCode(bean.getFormCode());
//				trans.setFomrType(bean.getFomrType());
//				trans.setAtcCode(bean.getAtcCode());
//				trans.setDefualtATC(bean.getDefualtATC());
//				trans.setNonDefaultATC(bean.getNonDefaultATC());
//				trans.setCtcSecType(bean.getCtcRegType());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
	public static void moveHistoryToBean(ReturnHistory_1702_RT history, Form1702RTBean bean) {
		if(history != null) {
			bean.setCreatedBy(history.getCreatedBy());
			bean.setModifiedBy(history.getModifiedBy());
			bean.setDateModified(history.getDateModified());
			bean.setDateCreated(history.getDateCreated());
			bean.setAuditYN(history.getAuditYN());
			bean.setAuditedBy(history.getAuditedBy());
			bean.setDateAudited(history.getDateAudited());
			bean.setRegisteredName(history.getRegisteredName());
			bean.setMiddleName(history.getMiddleName());
			bean.setStreet(history.getStreet());
			bean.setBarangay(history.getBarangay());
			bean.setDistrict(history.getDistrict()); 
			bean.setCity(history.getCity()); 
			bean.setNum(history.getNum());
			bean.setContactNumber(history.getNum());
			bean.setCode(history.getCode());
			bean.setRdoCode(history.getRdoCode());
			bean.setCalendarFiscal(history.getCode());
			bean.setStartMonth(history.getStartMonth());
			bean.sethKeepTag(history.gethKeepTag());	
			bean.setPartitionId(history.getPartitionId());
			bean.setCorporationDate(history.getCorporationDate());
			bean.setDateIncorporation(history.getCorporationDate());
			bean.setLineOfBusiness(history.getLineOfBusiness());
			bean.setMainLineBusiness(history.getLineOfBusiness());
			bean.setEmailAddress(history.getEmail());
			bean.setEmail(history.getEmail());
		}
	}
//	
//	public static void moveBeanToHistory(ReturnHistory_1702_RT history, Form1702RTBean bean) {
//		if(bean != null) {
//			history.setReferenceNo(bean.getReferenceNo());
//			history.setTin(bean.getTin());
//			history.setBranchCode(bean.getBranchCode()); 
//			history.setReturnPeriod(bean.getReturnPeriod());
//			history.setDateFiled(bean.getDateFiled());
//			history.setCreatedBy(bean.getCreatedBy()); 
//			history.setModifiedBy(bean.getModifiedBy()); 
//			history.setDateModified(bean.getDateModified());
//			history.setDateCreated(bean.getDateCreated());
//			history.setAuditYN(bean.getAuditYN());
//			history.setAuditedBy(bean.getAuditedBy()); 
//			history.setDateAudited(bean.getDateAudited());
//			history.setCode(bean.getCalendarFiscal());
//			history.setRdoCode(bean.getRdoCode());
//			history.setRegisteredName(bean.getRegisteredName());
//			history.setLastName(bean.getLastName());
//			history.setFirstName(bean.getFirstName());
//			history.setMiddleName(bean.getMiddleName());
//			history.setSubStreet(bean.getSubStreet());
//			history.setStreet(bean.getStreet());
//			history.setBarangay(bean.getBarangay());
//			history.setDistrict(bean.getDistrict());
//			history.setCity(bean.getCity());
//			history.setNum(bean.getContactNumber()); 
//			history.setZipCode(bean.getZipCode());
//			history.setCode(bean.getCalendarFiscal()); 
//			history.setStartMonth(bean.getStartMonth()); 
//			history.sethKeepTag(bean.gethKeepTag());
//			history.setPartitionId(bean.getPartitionId());
//			history.setCorporationDate(bean.getDateIncorporation());
//			history.setLineOfBusiness(bean.getMainLineBusiness());
//			history.setEmail(bean.getEmailAddress());
//		}
//	}
//	
//	/**
//	 * Method to sync the form bean to itself due to introduced properties
//	 * @param bean
//	 */
//	public static void synchBeanProperties(Form1702RTBean bean) {
//		if(bean != null) {
//			if(bean.getDateFiled() == null) {
//				bean.setDateFiled(new Date());
//			}
//			
//			bean.setBatchNo(0L);
//			bean.setYearType(bean.getCalendarFiscal());
//			
//			bean.setAmmended(bean.getAmendedReturn());
//			
//			if(bean.getDefualtATC().equalsIgnoreCase("Y")){
//				bean.setAtcCode(bean.getAlphanumericTaxCode1()); 
//			}
//		
//			if(bean.getNonDefaultATC().equalsIgnoreCase("Y")){
//				bean.setAtcCode(bean.getAlphanumericTaxCode2());
//			}
//		
//			bean.setSpecialRateYN("N");
//			bean.setInternationalTreaty("N");
//			bean.setExemptSale(0);
//			bean.setExemptCost(0);
//			bean.setExemptGrossIncome(0);
//			bean.setSpecialGrossIncome(0);
//			bean.setRegularGrossIncome(dblValueOf(bean.getGrossIncomeFromOperation())); //Item 32 grossIncomeFromOperation
//			bean.setExemptOtherIncome(0);  //default 0
//			bean.setSpecialOtherIncome(0); //default 0
//			bean.setRegularOtherIncome(dblValueOf(bean.getOtherTaxableIncomeNotSubjectedToFinalTax())); //Item 33 other taxable income otherTaxableIncomeNotSubjectedToFinalTax
//			bean.setSpecialCreditOtherIncome(0); //default 0
//			bean.setRegularCreditOtherIncome(dblValueOf(bean.getTotalTaxCreditsPayments45())); //Item 45 totalTaxCreditsPayments45
//			bean.setExemptTotalGrossIncome(0); //default 0
//			bean.setSpecialTotalGrossIncome(0); //default 0
//			bean.setRegularTotalGrossIncome(dblValueOf(bean.getTotalGrossIncome())); //Item 34 totalGrossIncome
//			bean.setExemptDeductions(0); //default 0
//			bean.setSpecialAllowableDeductions(dblValueOf(bean.getSpecialAllowableItemizedDeductions36())); //Item 35 
//			bean.setRegularDeductions(dblValueOf(bean.getOrdinaryAllowableItemizedDeductions())); //Item 35
//			bean.setSpecialTaxableIncome(0); //Deafault 0
//			bean.setRegularTaxableIncome(dblValueOf(bean.getNetTaxableIncome())); //Item Item 40
//			bean.setSpecialRate(0); //default 0
//			bean.setRegularRate(dblValueOf(bean.getIncomeTaxRate())); //ATC selected rate Item 41
//			bean.setSpecialIncomeTax(0); //default 0
//			bean.setRegularIncomeTax(dblValueOf(bean.getIncomeTaxDueOtherThanMCIT())); //Item 42
//			bean.setRegularTax(dblValueOf(bean.getTotalIncomeTaxDue44())); // Item 44
//			bean.setExcessPriorMCIT(dblValueOf(bean.getMinimumCorporateIncomeTax())); //Item 43
//			bean.setBalance(0); //Unpaid from previous return period default 0
//			bean.setSpecialTax(0); //default 0
//			bean.setAggregateTaxDue(dblValueOf(bean.getNetTaxPayable46()));
//			bean.setTaxPayable(0);
//			bean.setExecssCredit(0); //default 0
//			bean.setQuarterTaxPayment(0); //default 0
//			bean.setQuarterTaxWitheld(0); //default 0
//			bean.setQuarterTaxWitheld2307(0); //default 0
//			bean.setForeignTaxPaid(0); //default 0
//			bean.setPreviousTaxPaid(dblValueOf(bean.getTotalIncomeTaxDue16())); //Item 16
//			bean.setTotalTaxCredit(dblValueOf(bean.getTotalTaxCreditsPayments17())); //Item 17
//			bean.setTaxPayable(dblValueOf(bean.getNetTaxPayable18())); //item 18
//			bean.setTotals(dblValueOf(bean.getTotal())); //Item 4 Sched 1
//			bean.setSurcharges(dblValueOf(bean.getSurcharge())); //item 47
//			bean.setInterests(dblValueOf(bean.getInterest())); //item 48
//			bean.setCompromises(dblValueOf(bean.getCompromise())); //item 49
//			bean.setPenalties(dblValueOf(bean.getTotalPenalties50())); //Item 50
//			bean.setTotalAmountPayable(bean.getTotalAmountPayable()); //Item 51 or item 20
//			bean.setRefundType(bean.getRefundType()); //Item 21
//			bean.setCommunityTaxCert(bean.getCommunityTaxCertificateNumber()); //Item 22
//			bean.setPlaceIssue(bean.getCtcPlaceIssue()); //item 24
//			bean.setDateIssued(bean.getCtcDateIssue()); //item 23
//			bean.setCtcAmount(bean.getCtcAmount()); //Item 25
//			bean.setShareAgency(0); //default 0
//			bean.setTaxAgentTin(bean.getTin1ExternalAuditorAccreditedTaxAgent() != null ? bean.getTinExternalAuditorAccreditedTaxAgent() : bean.getTinSigningPartner()); //item 56 or item 58
//			if(!isEmpty(bean.getBirAccreditationNo1())
//				&& !isEmpty(bean.getBirAccreditationNo2())
//				&& !isEmpty(bean.getBirAccreditationNo3())
//				&& !isEmpty(bean.getBirAccreditationNo4())){
//				bean.setTaxAgentAcctNo(bean.getBirAccreditationNo()); //item 59
//			}else{
//				bean.setTaxAgentAcctNo(null);
//			}
//			bean.setShortPeriod(bean.getShortPeriodReturn()); //item 4 can be null
//			bean.setMethodDeduction(bean.getMethodDeductions()); //item 15 can be null
//			bean.setOtherPaymentMade(0); //default 0
//			bean.setExemptTaxableIncome(0); //default 0
//			bean.setExemptRate(0); //default 0
//			bean.setExemptIncomeMCIT(0); //default 0
//			bean.setSpecialIncomeMCIT(0); //default 0
//			bean.setRegularIncomeMCIT(0); //default 0
//			bean.setSpecialIncomeNatlGov(0); //default 0
//			bean.setExemptMCIT(0); //default 0
//			bean.setRegularMCIT(0); //default 0
//			bean.setMcitPreviousQuarter(0); //default 0
//			bean.setExcessMCITCurrent(dblValueOf(bean.getTotalExcessCreditsMCIT())); //item 4 sched 8
//			bean.setSpecialRatePreviousQtr(0); //default 0
//			bean.setSpecialTaxCredit(0); //default 0
//			bean.setSpecialTotalTaxCredit(0); //default 0
//			bean.setSpecialTaxPayable(0); //default 0
//			bean.setInternaltionalTreatyType(null); //defaul null
//			bean.setEntryType(null); //default null
//			bean.setNumActivity(0); //default 0
////			bean.setDefualtATC(Constants.YES); //deault IC 055
////			bean.setNonDefaultATC(Constants.YES); //default Y
//			bean.setSpecialPreviousTaxPaid(0); //default 0
//			bean.setQuarterTaxPaymentMCIT(0); //default 0
//			bean.setSpecialQuarterTaxWitheld(0); //default 0
//			bean.setSpecialQuarterTaxWitheld2307(0); //default 0
//			bean.setSpecialForeignTaxCredit(0); //default 0
//			bean.setQuarterTaxPaymentSpecialRate(0); //default 0
//			bean.setTotalAllowanceNOLCO(0); //item 3 Sched 6
//			bean.setFormCode("1702RT"); //default 1702-RT
//			bean.setFomrType(TaxAgentFacade.F1702); //default 12	
//		}
//		
//	}
//	
//	/**
//	 * Sync taxpayer with history
//	 * @param bean
//	 * @param registeredTaxPayer
//	 */
//	public static void syncTaxpayerToHistory(Form1702RTBean bean, RegisteredTaxPayerBean registeredTaxPayer, EfpsEnrolledTaxPayerBean enrolledTaxPayer) {
//		if(bean != null) {
//			bean.setCreatedBy(registeredTaxPayer.getFirstName()); //current system user
//			bean.setModifiedBy(registeredTaxPayer.getFirstName()); //default null
//			bean.setDateModified(null);  //current system date
//			bean.setDateCreated(new Date()); //current system date
//			bean.setAuditYN(Constants.NO); //default N
//			bean.setAuditedBy(null); //default null
//			bean.setDateAudited(null); //default null	
//			bean.setMiddleName(registeredTaxPayer.getMiddleName());  //from taxpayer 
//			bean.setStreet(registeredTaxPayer.getStreetAddress());  //from taxpayer 
//			bean.setBarangay(registeredTaxPayer.getBarangayAddress());  //from taxpayer 
//			bean.setDistrict(registeredTaxPayer.getDistrictAddress());  //from taxpayer 
//			bean.setCity(registeredTaxPayer.getCityAddress());  //from taxpayer 
//			bean.setNum(registeredTaxPayer.getTelephoneNumber()); //contact number from taxpayer
//			bean.setCode(registeredTaxPayer.getCTypeCode()); //same as year type
//			bean.setStartMonth(registeredTaxPayer.getStartMonth()); // from RCS_RETURN_DUE_DATES filling period
//			bean.sethKeepTag(null); //default null	
//			bean.setPartitionId(0); //default null	
//			bean.setCorporationDate(registeredTaxPayer.getIncorporationDate());  //date of incorporation from taxpayer
//			bean.setLineOfBusiness(registeredTaxPayer.getDescription()); //line of business from taxpayer
//			bean.setEmail(enrolledTaxPayer.getEmailAddress()); 
//		}
//	}
//	
	public static void initializeSchedulePersistedLength(Form1702RTBean form1702RTBean, Form1702RTTO transferObject){
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_3_1702_RT", transferObject.getSched31702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_4A_1702_RT", transferObject.getSched4A1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_4C_1702_RT", transferObject.getSched4C1702RTList().size());		
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_5_1702_RT", transferObject.getSched51702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_6A_1702_RT", transferObject.getSched6A1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_7A_1702_RT", transferObject.getSched7A1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_8_1702_RT", transferObject.getSched81702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_ND_1702_RT", transferObject.getSched9_ND1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_NT_1702_RT", transferObject.getSched9_NT1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_SD_1702_RT", transferObject.getSched9_SD1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_11_1702_RT", transferObject.getSched111702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12I_1702_RT", transferObject.getSched12I1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12II_1702_RT", transferObject.getSched12II1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12III_1702_RT", transferObject.getSched12III1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12IV_1702_RT", transferObject.getSched12IV1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_13I_1702_RT", transferObject.getSched13I1702RTList().size());
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_13II_1702_RT", transferObject.getSched13II1702RTList().size());
	}
	
	public static void initializeSchedulePersistedLength(Form1702RTBean form1702RTBean){
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_3_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_4A_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_4C_1702_RT",0);		
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_5_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_6A_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_7A_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_8_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_ND_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_NT_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_9_SD_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_11_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12I_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12II_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12III_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_12IV_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_13I_1702_RT",0);
		form1702RTBean.getIteratingTableMap().put("ReturnSchedule_13II_1702_RT",0);
	}
//	
//	public static void syncTaxPayerToBean(Form1702RTBean bean, RegisteredTaxPayerBean registeredTaxPayer, EfpsEnrolledTaxPayerBean enrolledTaxPayer) {
//		if(bean != null) {		
//			SimpleDateFormat mmddyyyy = new SimpleDateFormat("MM/dd/yyyy");
//			
//			bean.setTinA(registeredTaxPayer.getTinPart1());								//6
//			bean.setTinB(registeredTaxPayer.getTinPart2());								//6
//			bean.setTinC(registeredTaxPayer.getTinPart3());								//6
//			
//			StringBuilder sb = new StringBuilder();
//			sb.append(registeredTaxPayer.getTinPart1());
//			sb.append(registeredTaxPayer.getTinPart2());
//			sb.append(registeredTaxPayer.getTinPart3());
//			
//			bean.setTin(sb.toString());
//			bean.setBranchCode(registeredTaxPayer.getRegistrationPK().getBranchCode());
//			bean.setRdoCode(registeredTaxPayer.getRdoCode().getRdoCode());
//			bean.setDateIncorporation(registeredTaxPayer.getIncorporationDate());
//			bean.setLastName(registeredTaxPayer.getLastName());
//			bean.setFirstName(registeredTaxPayer.getFirstName());
//			bean.setRegisteredName(registeredTaxPayer.getRegisteredName());
//			bean.setRegisteredAddress(registeredTaxPayer.getRegisteredAddress());
//			bean.setSubStreet(registeredTaxPayer.getSubStreet());
//			bean.setStreetAddress(registeredTaxPayer.getStreetAddress());
//			bean.setBarangayAddress(registeredTaxPayer.getBarangayAddress());
//			bean.setCorporateFlag(registeredTaxPayer.getCorporateFlag());
//			bean.setCityAddress(registeredTaxPayer.getCityAddress());
//			bean.setZipCode(registeredTaxPayer.getZipCode());
//			bean.setContactNumber(registeredTaxPayer.getTelephoneNumber());
//			bean.setEmailAddress(enrolledTaxPayer.getEmailAddress());
//			bean.setMainLineBusiness(registeredTaxPayer.getDescription());
//			bean.setPsicCode(registeredTaxPayer.getIndustryTypeMitCode() + registeredTaxPayer.getIndustryTypeCode());
//			bean.setRegisteredDate(registeredTaxPayer.getDateRegistered());
//		}
//	}
//	
//	/**
//	 * Method used to add schedule 3 other expanded fields
//	 * @param bean
//	 * @param attachmentRecords
//	 */
//	public static void addSchedule3Content(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched3AdditionalAttachments();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getOtherTaxIncomeDescription3()) && !isEmpty(bean.getOtherTaxIncomeAmount3())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "3.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getOtherTaxIncomeDescription3().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getOtherTaxIncomeAmount3())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setOtherTaxIncomeDescription3("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched3AdditionalAttachments(expandables);
//	}
//	
//	/**
//	 * Method used to add schedule 4 Amortizations other expanded fields
//	 * @param bean
//	 * @param attachmentRecords
//	 */
//	public static void addSchedule4AmortizationsContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched4AdditionalAttachments1();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getAmortizationsDescription3()) && !isEmpty(bean.getAmortizationsAmount3())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "4.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getAmortizationsDescription3().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getAmortizationsAmount3())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setAmortizationsDescription3("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched4AdditionalAttachments1(expandables);
//	}
//	
//	/**
//	 * Method used to add schedule 4 Others other expanded fields
//	 * @param bean
//	 * @param attachmentRecords
//	 */
//	public static void addSchedule4OthersContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched4AdditionalAttachments2();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getOthersDescription3()) && !isEmpty(bean.getOthersAmount3())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "39.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getOthersDescription4().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getOthersAmount4())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setOthersDescription4("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		
//		}
//		bean.setSched4AdditionalAttachments2(expandables);
//	}
//	
//	/**
//	 * Method used to add schedule 5 other expanded fields
//	 * @param bean
//	 * @param attachmentRecords
//	 */
//	
//	public static void addSchedule5Content(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<SpecialAllowableItemizedDeductions> expandables = bean.getSched5AdditionalAttachments();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getSpecialAllowableItemizedDeductionsDescription4()) 
//					&& !isEmpty(bean.getSpecialAllowableItemizedDeductionsLegalBasis4())
//					&& !isEmpty(bean.getSpecialAllowableItemizedDeductionsAmount4())){
//				SpecialAllowableItemizedDeductions expandable = new SpecialAllowableItemizedDeductions();
//				int indexNumber = 1;
//				String sequenceNumber = "4.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getSpecialAllowableItemizedDeductionsDescription4().toUpperCase());
//				expandable.setLegalBasis(bean.getSpecialAllowableItemizedDeductionsLegalBasis4().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getSpecialAllowableItemizedDeductionsAmount4())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new SpecialAllowableItemizedDeductions();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&	!isEmpty(field.getColumn2())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						expandable.setLegalBasis(field.getColumn2().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn3()) ? 
//								field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setSpecialAllowableItemizedDeductionsDescription4("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				SpecialAllowableItemizedDeductions expandable = new SpecialAllowableItemizedDeductions();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&	!isEmpty(field.getColumn2())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					expandable.setLegalBasis(field.getColumn2().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn3()) ? 
//							field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//			
//		}
//		bean.setSched5AdditionalAttachments(expandables);
//	}
//	
//	
//	/*
//	public static void addSchedule6AContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OperatingLoss> expandables = bean.getSched6OperatingLoss();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if( //!isEmpty(bean.getNetOperatingLossYearIncurred4()) && 
//						!isEmpty(bean.getNetOperatingLossAmount4()) && 
//						!isEmpty(bean.getNOLCOAppliedPreviousYear4()) && 
//						!isEmpty(bean.getNOLCOExpired4()) && 
//						!isEmpty(bean.getNOLCOAppliedCurrentYear4()) && 
//						!isEmpty(bean.getNetOperatingLossUnapplied4())){
//				OperatingLoss expandable = new OperatingLoss();
//				int indexNumber = 1;
//				String sequenceNumber = "7.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setYear((int)Math.round(dblValueOf(bean.getNetOperatingLossYearIncurred4())));
//				expandable.setAmount(dblValueOf(bean.getNetOperatingLossAmount4()));
//				expandable.setNolcoAppliedPreviousYear(dblValueOf(bean.getNOLCOAppliedPreviousYear4()));
//				expandable.setNolcoExpired(dblValueOf((bean.getNOLCOExpired4())));
//				expandable.setNolcoAppliedCurrentYear(dblValueOf(bean.getNOLCOAppliedCurrentYear4()));
//				expandable.setNetOperatingLossUnapplied(dblValueOf(bean.getNetOperatingLossUnapplied4()));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OperatingLoss();
//					
//					if(!isEmpty(field.getColumn1())){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setYear((int)Math.round(dblValueOf(field.getColumn1())));
//						if(!isEmpty(field.getColumn2())){
//							expandable.setAmount(dblValueOf(field.getColumn2()));
//						}else{
//							expandable.setAmount(0);
//						}
//						if(!isEmpty(field.getColumn3())){
//							expandable.setNolcoAppliedPreviousYear(dblValueOf(field.getColumn3()));
//						}else{
//							expandable.setNolcoAppliedPreviousYear(0);
//						}
//						if(!isEmpty(field.getColumn4())){
//							expandable.setNolcoExpired(dblValueOf(field.getColumn4()));
//						}else{
//							expandable.setNolcoExpired(0);
//						}
//						if(!isEmpty(field.getColumn5())){
//							expandable.setNolcoAppliedCurrentYear(dblValueOf(field.getColumn5()));
//						}else{
//							expandable.setNolcoAppliedCurrentYear(0);
//						}
//						if(!isEmpty(field.getColumn6())){
//							expandable.setNetOperatingLossUnapplied(dblValueOf(field.getColumn6()));
//						}else{
//							expandable.setNetOperatingLossUnapplied(0);
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//			}
//		}else{
//			OperatingLoss exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			// do the format	
//			for(GenericField field : attachmentRecords) {
//				OperatingLoss expandable = new OperatingLoss();
//				
//				if(!isEmpty(field.getColumn1())){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setYear((int)Math.round(dblValueOf(field.getColumn1())));
//					if(!isEmpty(field.getColumn2())){
//						expandable.setAmount(dblValueOf(field.getColumn2()));
//					}else{
//						expandable.setAmount(0);
//					}
//					if(!isEmpty(field.getColumn3())){
//						expandable.setNolcoAppliedPreviousYear(dblValueOf(field.getColumn3()));
//					}else{
//						expandable.setNolcoAppliedPreviousYear(0);
//					}
//					if(!isEmpty(field.getColumn4())){
//						expandable.setNolcoExpired(dblValueOf(field.getColumn4()));
//					}else{
//						expandable.setNolcoExpired(0);
//					}
//					if(!isEmpty(field.getColumn5())){
//						expandable.setNolcoAppliedCurrentYear(dblValueOf(field.getColumn5()));
//					}else{
//						expandable.setNolcoAppliedCurrentYear(0);
//					}
//					if(!isEmpty(field.getColumn6())){
//						expandable.setNetOperatingLossUnapplied(dblValueOf(field.getColumn6()));
//					}else{
//						expandable.setNetOperatingLossUnapplied(0);
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched6OperatingLoss(expandables);
//	}
//	*/
//	
//	
//	public static void addSchedule7Content(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched7AdditionalAttachments();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getOtherCreditsPaymentsDescription2()) 
//					&& !isEmpty(bean.getOtherCreditsPaymentsAmount2())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "11.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getOtherCreditsPaymentsDescription2().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getOtherCreditsPaymentsAmount2())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setOtherCreditsPaymentsDescription2("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched7AdditionalAttachments(expandables);
//	}
//	
//	public static void addSchedule9NDContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the two fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched9AdditionalAttachments1();
//		
//		//if expandables is 0 then it is expected that item 11 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 11 is not empty
//			if(!isEmpty(bean.getNonDeductibleExpenses2()) 
//					&& !isEmpty(bean.getNonDeductibleExpensesAmount2())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "11.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getNonDeductibleExpenses2().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getNonDeductibleExpensesAmount2())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setNonDeductibleExpenses2("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched9AdditionalAttachments1(expandables);
//	}
//	
//	public static void addSchedule9NTContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched9AdditionalAttachments2();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getNonTaxable2()) 
//					&& !isEmpty(bean.getNonTaxableAmount2())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "6.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getNonTaxable2().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getNonTaxableAmount2())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setNonDeductibleExpenses2("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched9AdditionalAttachments2(expandables);
//	}
//	
//	public static void addSchedule9SDContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherExpandable> expandables = bean.getSched9AdditionalAttachments3();
//		
//		//if expandables is 0 then it is expected that item 3 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 3 is not empty
//			if(!isEmpty(bean.getSpecialDeductions2()) 
//					&& !isEmpty(bean.getSpecialDeductionsAmount2())){
//				OtherExpandable expandable = new OtherExpandable();
//				int indexNumber = 1;
//				String sequenceNumber = "8.";
//				expandable.setSequenceNumber(sequenceNumber + indexNumber);
//				expandable.setDescription(bean.getSpecialDeductions2().toUpperCase());
//				expandable.setValue(dblToString(dblValueOf(bean.getSpecialDeductionsAmount2())));
//				expandables.add(expandable);
//				indexNumber++;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherExpandable();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(testVal.isEmpty()){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setNonDeductibleExpenses2("OTHERS");
//			}
//		}else{
//			OtherExpandable exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherExpandable expandable = new OtherExpandable();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(testVal.isEmpty()){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setSched9AdditionalAttachments3(expandables);
//	}
//	
//	
//	public static void addSchedule11Content(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<StockholdersPartners> expandables = bean.getSched11AdditionalAttachments();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			if(!isEmpty(bean.getRegisteredName())){
//				StockholdersPartners expandable = new StockholdersPartners();
//				int indexNumber = 1;
//
//				for(GenericField field : attachmentRecords) {
//						
//						expandable = new StockholdersPartners();
//						
//						String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//						if(!isEmpty(field.getColumn1()) 
//								&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex) && field.getColumn2().length() == 12)
//								&& !isEmpty(field.getColumn3()) && !isEmpty(field.getColumn4())
//								&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//							
//							
//								expandable.setRegisteredName(field.getColumn1().toUpperCase());
//								expandable.setSeqNumber(String.valueOf(indexNumber));
//								expandable.setTin1(field.getColumn2().substring(0, 3));
//								expandable.setTin2(field.getColumn2().substring(3, 6));
//								expandable.setTin3(field.getColumn2().substring(6, 9));
//								expandable.setBranchCode(field.getColumn2().substring(9, 12));
//
//								String testVal1 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//								field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//								String testVal2 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//										field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//										if(isEmpty(testVal1)){
//											expandable.setCapitalContribution("0");
//										}else{
//											expandable.setCapitalContribution(dblToString(dblValueOf(testVal1)));	
//										}
//										if(isEmpty(testVal2)){
//											expandable.setPercentToTotal("0");
//										}else{
//											
//											expandable.setPercentToTotal(testVal2);	
//											
//										}
//										if (indexNumber < 19){
//											expandables.add(expandable);
//										}
//										indexNumber++;
//							
//							
//						}
//				}
//				
//				
//			}
//		}else{
//			StockholdersPartners exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			//String seqNo = exp.getSeqNumber();
//					
//			int index = expandables.size() - 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				StockholdersPartners expandable = new StockholdersPartners();
//					
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1()) 
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex) && field.getColumn2().length() == 12)
//						&& !isEmpty(field.getColumn3()) && !isEmpty(field.getColumn4())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//					
//					
//						expandable.setRegisteredName(field.getColumn1().toUpperCase());
//						expandable.setSeqNumber(String.valueOf(index));
//						expandable.setTin1(field.getColumn2().substring(0, 3));
//						expandable.setTin2(field.getColumn2().substring(3, 6));
//						expandable.setTin3(field.getColumn2().substring(6, 9));
//						expandable.setBranchCode(field.getColumn2().substring(9, 12));
//
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//						field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//						String testVal2 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//								field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//								if(isEmpty(testVal1)){
//									expandable.setCapitalContribution("0");
//								}else{
//									expandable.setCapitalContribution(dblToString(dblValueOf(testVal1)));	
//								}
//								if(isEmpty(testVal2)){
//									expandable.setPercentToTotal("0");
//								}else{
//									expandable.setPercentToTotal(testVal2);	
//								}
//
//								if (index < 19){
//									expandables.add(expandable);
//								}
//								index++;
//					
//					
//				}
//			}
//		}
//		bean.setSched11AdditionalAttachments(expandables);
//	}
//	
//	
//	
//	public static void addSchedule12IContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<GrossIncomeFinalWithholding> expandables = bean.getListOfGrossIncomeFinalWithholding();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			if(!isEmpty(bean.getExemptPrizesWinnings()) 
//					&& !isEmpty(bean.getFairMarketValuePrizesWinnings())
//					&& !isEmpty(bean.getFinalTaxWthldPrizesWinnings())){
//				GrossIncomeFinalWithholding expandable = new GrossIncomeFinalWithholding();
//				int indexNumber = 1;
//				String sequenceNumber = "4.";
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new GrossIncomeFinalWithholding();
//					
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))){
//						expandable.setSequenceNumber(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//								field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal2 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//								field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal3 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//								field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						if(isEmpty(testVal1)){
//							expandable.setExempt("0");
//						}else{
//							expandable.setExempt(dblToString(dblValueOf(testVal1)));	
//						}
//						if(isEmpty(testVal2)){
//							expandable.setActualAmount("0");
//						}else{
//							expandable.setActualAmount(dblToString(dblValueOf(testVal2)));	
//						}
//						if(isEmpty(testVal3)){
//							expandable.setFinalTaxWithheld("0");
//						}else{
//							expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal3)));	
//						}
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				bean.setNonDeductibleExpenses2("OTHERS");
//			}
//		}else{
//			GrossIncomeFinalWithholding exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			String seqNo = exp.getSequenceNumber();
//			
//			String[] strArr = seqNo.split("\\.");
//			String startSeq = strArr[0] + ".";
//			int index = Integer.valueOf(strArr[1]) + 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				GrossIncomeFinalWithholding expandable = new GrossIncomeFinalWithholding();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))){
//					expandable.setSequenceNumber(startSeq + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					String testVal2 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//							field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					String testVal3 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//							field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					if(isEmpty(testVal1)){
//						expandable.setExempt("0");
//					}else{
//						expandable.setExempt(dblToString(dblValueOf(testVal1)));	
//					}
//					if(isEmpty(testVal2)){
//						expandable.setActualAmount("0");
//					}else{
//						expandable.setActualAmount(dblToString(dblValueOf(testVal2)));	
//					}
//					if(isEmpty(testVal3)){
//						expandable.setFinalTaxWithheld("0");
//					}else{
//						expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal3)));	
//					}
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfGrossIncomeFinalWithholding(expandables);
//	}
//	
//	
//	public static void addSchedule12IIContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<RealPropertiesSalesExchange> expandables = bean.getListOfRealPropertiesSalesExchange();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			
//				RealPropertiesSalesExchange expandable = new RealPropertiesSalesExchange();
//				int sequenceNumber = Integer.parseInt(expandable.getSequenceNumber());
//				
//				int indexNumber = 1;
//			
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new RealPropertiesSalesExchange();
//
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1()) && !isEmpty(field.getColumn2()) && !isEmpty(field.getColumn3())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn5()).matches(rex))){
//						
//						expandable.setSequenceNumber(String.valueOf(sequenceNumber + indexNumber));
//						expandable.setNumeral(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//
//						expandable.setTaxDeclaration(field.getColumn2().toUpperCase());
//						expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//						field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal2 = StringUtils.isNotEmpty(field.getColumn5()) ? 
//						field.getColumn5().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//						if(isEmpty(testVal1)){
//							expandable.setActualAmount("0");
//						}else{
//							expandable.setActualAmount(dblToString(dblValueOf(testVal1)));	
//						}
//						if(isEmpty(testVal2)){
//							expandable.setFinalTaxWithheld("0");
//						}else{
//							expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal2)));	
//						}
//
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				
//			
//		}else{
//			RealPropertiesSalesExchange exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			int index = expandables.size() - 1;
//			
//			int panelSize = 1;
//			
//			
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				RealPropertiesSalesExchange expandable = new RealPropertiesSalesExchange();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1()) && !isEmpty(field.getColumn2()) && !isEmpty(field.getColumn3())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn5()).matches(rex))){
//					expandable.setSequenceNumber(String.valueOf(panelSize + index));
//					expandable.setNumeral(panelSize + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//
//					expandable.setTaxDeclaration(field.getColumn2().toUpperCase());
//					expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//					field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					String testVal2 = StringUtils.isNotEmpty(field.getColumn5()) ? 
//					field.getColumn5().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//					if(isEmpty(testVal1)){
//						expandable.setActualAmount("0");
//					}else{
//						expandable.setActualAmount(dblToString(dblValueOf(testVal1)));	
//					}
//					if(isEmpty(testVal2)){
//						expandable.setFinalTaxWithheld("0");
//					}else{
//						expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal2)));	
//					}
//
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfRealPropertiesSalesExchange(expandables);
//	}
//	
//	public static void addSchedule12IIIContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		
//		
//		//we expect that the three fields are already populated		
//		List<SharesOfStockSalesExchange> expandables = bean.getListOfSharesOfStockSalesExchange();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			
//			SharesOfStockSalesExchange expandable = new SharesOfStockSalesExchange();
//				int sequenceNumber = Integer.parseInt(expandable.getSequenceNumber());
//				
//				int indexNumber = 1;
//			
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new SharesOfStockSalesExchange();
//
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					String testDate = "^(0[1-9]|1[0-2])[/](0[1-9]|1[0-9]|2[0-9]|3[0-1])[/](19|20)[0-9]{2}$";
//					if(!isEmpty(field.getColumn1()) 
//							&& ((field.getColumn1().equalsIgnoreCase("CS")) || (field.getColumn1().equalsIgnoreCase("PS")))
//							&& !isEmpty(field.getColumn2())		
//							&& !isEmpty(field.getColumn3()) 
//							&& !isEmpty(field.getColumn5()) && (field.getColumn5().length() == 10)
//							&& 	(Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn6()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn7()).matches(rex))){
//						
//						expandable.setNumeral(sequenceNumber + indexNumber);
//						
//						expandable.setKind(field.getColumn1().toUpperCase());
//						expandable.setStockCertificate(field.getColumn2().toUpperCase());
//						expandable.setSequenceNumber(String.valueOf(expandable.getKind().toUpperCase()));
//						expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//						
//						if(field.getColumn5().matches(testDate)){
//							try {
//								expandable.setDateOfIssue(STD_DATE_FORMAT.parse(field.getColumn5()));
//							} catch (ParseException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//						
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//						field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal2 = StringUtils.isNotEmpty(field.getColumn6()) ? 
//						field.getColumn6().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal3 = StringUtils.isNotEmpty(field.getColumn7()) ? 
//						field.getColumn7().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//						
//						if(isEmpty(testVal1)){
//							expandable.setNumberOfShares("0");
//						}else{
//							expandable.setNumberOfShares(dblToString(dblValueOf(testVal1)));	
//						}
//						if(isEmpty(testVal2)){
//							expandable.setActualAmount("0");
//						}else{
//							expandable.setActualAmount(dblToString(dblValueOf(testVal2)));	
//						}
//						if(isEmpty(testVal3)){
//							expandable.setFinalTaxWithheld("0");
//						}else{
//							expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal3)));	
//						}
//
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				
//			
//		}else{
//			SharesOfStockSalesExchange exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			int index = expandables.size() - 1;
//			
//			int panelSize = 1;
//			
//			
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				SharesOfStockSalesExchange expandable = new SharesOfStockSalesExchange();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				String testDate = "^(0[1-9]|1[0-2])[/](0[1-9]|1[0-9]|2[0-9]|3[0-1])[/](19|20)[0-9]{2}$";
//				if(!isEmpty(field.getColumn1()) 
//						&& ((field.getColumn1().equalsIgnoreCase("CS")) || (field.getColumn1().equalsIgnoreCase("PS")))
//						&& !isEmpty(field.getColumn2())		
//						&& !isEmpty(field.getColumn3()) 
//						&& !isEmpty(field.getColumn5()) && (field.getColumn5().length() == 10)
//						&& 	(Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn6()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn7()).matches(rex))){
//					
//					expandable.setNumeral(panelSize + index);
//					
//					expandable.setKind(field.getColumn1().toUpperCase());
//					expandable.setStockCertificate(field.getColumn2().toUpperCase());
//					expandable.setSequenceNumber(String.valueOf(expandable.getKind().toUpperCase()));
//					expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//					
//					if(field.getColumn5().matches(testDate)){
//						try {
//							expandable.setDateOfIssue(STD_DATE_FORMAT.parse(field.getColumn5()));
//						} catch (ParseException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//					
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//					field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					String testVal2 = StringUtils.isNotEmpty(field.getColumn6()) ? 
//					field.getColumn6().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					String testVal3 = StringUtils.isNotEmpty(field.getColumn7()) ? 
//					field.getColumn7().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//					
//					if(isEmpty(testVal1)){
//						expandable.setNumberOfShares("0");
//					}else{
//						expandable.setNumberOfShares(dblToString(dblValueOf(testVal1)));	
//					}
//					if(isEmpty(testVal2)){
//						expandable.setActualAmount("0");
//					}else{
//						expandable.setActualAmount(dblToString(dblValueOf(testVal2)));	
//					}
//					if(isEmpty(testVal3)){
//						expandable.setFinalTaxWithheld("0");
//					}else{
//						expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal3)));	
//					}
//
//					
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfSharesOfStockSalesExchange(expandables);
//		
//		
//	}
//	
//	public static void addSchedule12IVContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherIncome> expandables = bean.getListOfOtherIncome();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			
//			OtherIncome expandable = new OtherIncome();
//				int sequenceNumber = Integer.parseInt(expandable.getSequenceNumber());
//				
//				int indexNumber = 1;
//			
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherIncome();
//
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1()) 
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//						
//						expandable.setSequenceNumber(String.valueOf(sequenceNumber + indexNumber));
//						expandable.setDescription(field.getColumn1().toUpperCase());
//
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//						field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						String testVal2 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//						field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//						if(isEmpty(testVal1)){
//							expandable.setActualAmount("0");
//						}else{
//							expandable.setActualAmount(dblToString(dblValueOf(testVal1)));	
//						}
//						if(isEmpty(testVal2)){
//							expandable.setFinalTaxWithheld("0");
//						}else{
//							expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal2)));	
//						}
//
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				
//			
//		}else{
//			OtherIncome exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			int index = expandables.size() - 1;
//			
//			int panelSize = 1;
//			
//			
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherIncome expandable = new OtherIncome();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1()) 
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn3()).matches(rex))){
//					
//					expandable.setSequenceNumber(String.valueOf(panelSize + index));
//					expandable.setNumeral(panelSize + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//							field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//							String testVal2 = StringUtils.isNotEmpty(field.getColumn3()) ? 
//							field.getColumn3().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//					if(isEmpty(testVal1)){
//						expandable.setActualAmount("0");
//					}else{
//						expandable.setActualAmount(dblToString(dblValueOf(testVal1)));	
//					}
//					if(isEmpty(testVal2)){
//						expandable.setFinalTaxWithheld("0");
//					}else{
//						expandable.setFinalTaxWithheld(dblToString(dblValueOf(testVal2)));	
//					}
//
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfOtherIncome(expandables);
//	}
//	
//	
//	public static void addSchedule13IContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<PersonalRealPropertiesReceived> expandables = bean.getListOfPersonalRealPropertiesReceived();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			
//			PersonalRealPropertiesReceived expandable = new PersonalRealPropertiesReceived();
//				int sequenceNumber = Integer.parseInt(expandable.getSequenceNumber());
//				
//				int indexNumber = 1;
//			
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new PersonalRealPropertiesReceived();
//
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1()) && !isEmpty(field.getColumn2()) && !isEmpty(field.getColumn3())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))){
//						expandable.setSequenceNumber(String.valueOf(sequenceNumber + indexNumber));
//						
//						expandable.setDescription(field.getColumn1().toUpperCase());
//
//						expandable.setModeOfTransfer(field.getColumn2().toUpperCase());
//						expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//						field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//						if(isEmpty(testVal1)){
//							expandable.setValue("0");
//						}else{
//							expandable.setValue(dblToString(dblValueOf(testVal1)));	
//						}
//
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				
//			
//		}else{
//			PersonalRealPropertiesReceived exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			int index = expandables.size() - 1;
//			
//			int panelSize = 1;
//			
//			
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				PersonalRealPropertiesReceived expandable = new PersonalRealPropertiesReceived();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1()) && !isEmpty(field.getColumn2()) && !isEmpty(field.getColumn3())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn4()).matches(rex))){
//					expandable.setSequenceNumber(String.valueOf(panelSize + index));
//					expandable.setNumeral(panelSize + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//
//					expandable.setModeOfTransfer(field.getColumn2().toUpperCase());
//					expandable.setAuthorizingRegistration(field.getColumn3().toUpperCase());
//
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn4()) ? 
//					field.getColumn4().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//
//					if(isEmpty(testVal1)){
//						expandable.setValue("0");
//					}else{
//						expandable.setValue(dblToString(dblValueOf(testVal1)));	
//					}
//
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfPersonalRealPropertiesReceived(expandables);
//	}
//	
//	
//	public static void addSchedule13IIContent(Form1702RTBean bean, List<GenericField> attachmentRecords) {
//		//we expect that the three fields are already populated		
//		List<OtherIncome> expandables = bean.getListOfOtherExemptIncome();
//		
//		//if expandables is 0 then it is expected that item 4 is populated but add button is not clicked
//		if(expandables == null || expandables.isEmpty()) {
//			//check that item 4 is not empty
//			
//			OtherIncome expandable = new OtherIncome();
//				
//			int sequenceNumber = Integer.parseInt(expandable.getSequenceNumber()) - 1;
//			
//			int indexNumber =  expandables.size() - 1;
//				
//				for(GenericField field : attachmentRecords) {
//					expandable = new OtherIncome();
//
//					String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//					if(!isEmpty(field.getColumn1())
//							&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//						
//						expandable.setSequenceNumber(String.valueOf(sequenceNumber + indexNumber));
//						expandable.setNumeral(sequenceNumber + indexNumber);
//						expandable.setDescription(field.getColumn1().toUpperCase());
//
//						String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//						field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//						
//						if(isEmpty(testVal1)){
//							expandable.setActualAmount("0");
//						}else{
//							expandable.setActualAmount(dblToString(dblValueOf(testVal1)));
//						}
//						
//						expandables.add(expandable);
//						indexNumber++;
//					}
//				}
//				
//				
//			
//		}else{
//			//OtherIncome exp = expandables.get(expandables.size() - 1);
//			//it is expected here that the seq number is something like 3.1, 3.2 etc
//			
//			
//			int index = expandables.size() - 1;
//			
//			int panelSize = 1;
//			
//			// do the format			
//			for(GenericField field : attachmentRecords) {
//				OtherIncome expandable = new OtherIncome();
//				
//				String rex = "^([0-9]{1,12})|(([0-9]{1,12})[.]([0-9]+)$)";
//				if(!isEmpty(field.getColumn1())
//						&&  (Form1702RTBeanBuilder.parseString(field.getColumn2()).matches(rex))){
//					
//
//					expandable.setSequenceNumber(String.valueOf(panelSize + index));
//					expandable.setNumeral(panelSize + index);
//					expandable.setDescription(field.getColumn1().toUpperCase());
//					
//
//					String testVal1 = StringUtils.isNotEmpty(field.getColumn2()) ? 
//					field.getColumn2().split("\\.")[0].replaceAll("[^0-9]", "") : "0";
//					
//					if(isEmpty(testVal1)){
//						expandable.setActualAmount("0");
//					}else{
//						
//						expandable.setActualAmount(dblToString(dblValueOf(testVal1)));
//						
//					}
//					
//					expandables.add(expandable);
//					index++;
//				}
//			}
//		}
//		bean.setListOfOtherExemptIncome(expandables);
//	}
	
	
	
	
	
	
	public static Boolean isEmpty(String str) {
		return str != null && str.length() > 0 ? false : true;
	}
	
	public static void appendName(StringBuilder builder, RegisteredTaxPayerBean rtx) {
		builder.append(rtx.getLastName()).append(", ")
		.append(rtx.getFirstName()).append(" ")
		.append(rtx.getMiddleName());
	}
	
	public static Date safeParseDate(String date) {
		Date rDate = null;

		try{
			if(!isEmpty(date)) {
				rDate = STD_DATE_FORMAT.parse(date);
			}else {
				rDate = new Date();
			}
		}catch (Exception e) {
			e.printStackTrace();
			rDate = new Date();
		}

		return rDate;
	}
	
	public static int safeParseInt(String num) {
		int tempNum = 0;

		try{
			if(!isEmpty(num)) {
				tempNum = Integer.parseInt(num);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return tempNum;
	}
	
	public static void buildReturnPeriodDate(Form1702RTBean form1702RTBean)
    {
        Date returnPeriodDate = null;

        int returnPeriodMonth = safeParseInt(form1702RTBean.getYearEndedMonth());
        int returnPeriodYear = safeParseInt(form1702RTBean.getYearEnded());
        int returnPeriodDay = 0;

        if (form1702RTBean.getCalendarFiscal() != null && form1702RTBean.getCalendarFiscal().equalsIgnoreCase("F"))
        {
            if ((returnPeriodMonth == 1) || (returnPeriodMonth == 3) || (returnPeriodMonth == 5) ||
                    (returnPeriodMonth == 7) || (returnPeriodMonth == 8) || (returnPeriodMonth == 10) ||
                    (returnPeriodMonth == 12))
            {
                returnPeriodDay = 31;
            }
            else if ((returnPeriodMonth == 4) || (returnPeriodMonth == 6) ||
                    (returnPeriodMonth == 9) || (returnPeriodMonth == 11))
            {
                returnPeriodDay = 30;
            }
            else if (returnPeriodMonth == 2)
            {
                if ((returnPeriodYear % 4 == 0) && ((!(returnPeriodYear % 100 == 0)) || (returnPeriodYear % 400 == 0)))
                {
                    returnPeriodDay = 29;
                }
                else
                {
                    returnPeriodDay = 28;
                }
            }
        }
        else if (form1702RTBean.getCalendarFiscal() != null && form1702RTBean.getCalendarFiscal().equalsIgnoreCase("C"))
        {           
        	if ((returnPeriodMonth == 1) || (returnPeriodMonth == 3) || (returnPeriodMonth == 5) ||
        			(returnPeriodMonth == 7) || (returnPeriodMonth == 8) || (returnPeriodMonth == 10) ||
        			(returnPeriodMonth == 12))
        	{
        		returnPeriodDay = 31;
        	}
        	else if ((returnPeriodMonth == 4) || (returnPeriodMonth == 6) ||
        			(returnPeriodMonth == 9) || (returnPeriodMonth == 11))
        	{
        		returnPeriodDay = 30;
        	}
        	else if (returnPeriodMonth == 2)
        	{
        		if ((returnPeriodYear % 4 == 0) && ((!(returnPeriodYear % 100 == 0)) || (returnPeriodYear % 400 == 0)))
        		{
        			returnPeriodDay = 29;
        		}
        		else
        		{
        			returnPeriodDay = 28;
        		}
        	}
        }

        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            returnPeriodDate = sdf.parse(returnPeriodMonth + "/" + returnPeriodDay + "/" + returnPeriodYear);
            form1702RTBean.setReturnPeriod(returnPeriodDate);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
	
	public static boolean isOtherExpandableFilled(List<OtherExpandable> otherExpandable) {
		for (OtherExpandable oe : otherExpandable) {
			if (StringUtils.isBlank(oe.getDescription()) || dblValueOf(oe.getValue()) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSpecialAllowableItemizedDeductionsFilled(List<SpecialAllowableItemizedDeductions> specialAllowableItemizedDeductions) {
		for (SpecialAllowableItemizedDeductions said : specialAllowableItemizedDeductions) {
			if (StringUtils.isBlank(said.getDescription()) || dblValueOf(said.getValue()) == 0 || StringUtils.isBlank(said.getLegalBasis())) {
				return false;
			}
		}
		return true;
	}

	public static boolean isStockholdersPartnersFilled(List<StockholdersPartners> stockholdersPartners) {
		for (StockholdersPartners sp : stockholdersPartners) {
			if (StringUtils.isBlank(sp.getTin1()) || StringUtils.isBlank(sp.getTin2()) || StringUtils.isBlank(sp.getTin3()) || StringUtils.isBlank(sp.getBranchCode())
					 || StringUtils.isBlank(sp.getRegisteredName()) || dblValueOf(sp.getCapitalContribution()) == 0 || dblValueOf(sp.getPercentToTotal()) == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isRealPropertiesSalesExchangeFilled(List<RealPropertiesSalesExchange> realPropertiesSalesExchange) {
		for (RealPropertiesSalesExchange rpse : realPropertiesSalesExchange) {
			if (StringUtils.isBlank(rpse.getDescription()) || dblValueOf(rpse.getActualAmount()) == 0 || dblValueOf(rpse.getFinalTaxWithheld()) == 0 ||
					StringUtils.isBlank(rpse.getTaxDeclaration()) || StringUtils.isBlank(rpse.getAuthorizingRegistration())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSharesOfStockSalesExchangeFilled(List<SharesOfStockSalesExchange> sharesOfStockSalesExchange) {
		for (SharesOfStockSalesExchange sosse : sharesOfStockSalesExchange) {
			if (dblValueOf(sosse.getActualAmount()) == 0 || dblValueOf(sosse.getFinalTaxWithheld()) == 0 ||
					StringUtils.isBlank(sosse.getStockCertificate()) || dblValueOf(sosse.getNumberOfShares()) == 0 || StringUtils.isBlank(sosse.getAuthorizingRegistration()) ||
					sosse.getDateOfIssue() == null) {
				return false;
			}
		}
		return true;
	}

	public static boolean isOtherIncomeFilled(List<OtherIncome> otherIncome) {
		for (OtherIncome oi : otherIncome) {
			if (StringUtils.isBlank(oi.getDescription()) || dblValueOf(oi.getActualAmount()) == 0 || dblValueOf(oi.getFinalTaxWithheld()) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPersonalRealPropertiesReceived(List<PersonalRealPropertiesReceived> personalRealPropertiesReceived) {
		for (PersonalRealPropertiesReceived prpr : personalRealPropertiesReceived) {
			if (StringUtils.isBlank(prpr.getDescription()) || dblValueOf(prpr.getValue()) == 0 ||
					StringUtils.isBlank(prpr.getModeOfTransfer()) || StringUtils.isBlank(prpr.getAuthorizingRegistration())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOtherExemptIncomeFilled(List<OtherIncome> otherIncome) {
		for (OtherIncome oi : otherIncome) {
			if (StringUtils.isBlank(oi.getDescription()) || dblValueOf(oi.getActualAmount()) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isGrossIncomeFinalWithholdingFilled(List<GrossIncomeFinalWithholding> grossIncomeFinalWithholding) {
		for (GrossIncomeFinalWithholding gifw : grossIncomeFinalWithholding) {
			if (StringUtils.isBlank(gifw.getDescription()) ||
					(dblValueOf(gifw.getExempt()) == 0 && dblValueOf(gifw.getActualAmount()) == 0 && dblValueOf(gifw.getFinalTaxWithheld()) == 0)) {
				return false;
			}
		}
		return true;
	}
	
	public static Integer safeParseInteger(String str) {
		return str != null && str.length() > 0 ? Integer.valueOf(str) : 0;
	}
	
	public static Float safeParseFloat(String str){
		return str != null && str.length() > 0 ? Float.valueOf(str) : 0;
	}
	
	public static String parseString(Object obj) {
		String retVal;
		try {
			if (obj instanceof Double || obj instanceof Float){
				retVal = FIX_NEGATIVE.format(obj);
			}
			else
				retVal = String.valueOf(obj);
		} catch (Exception x) {
			retVal = "";
		}
		if(retVal.equalsIgnoreCase("NULL")) return "";
		return retVal;
	}
	
	public static double valueOf(String val) {
		try{
		return Double.valueOf(val != null || !"".equals(val)  ? val : "0");
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static String toUpper(String s) {
		s = parseString(s);
		
		String ret = "";
		if(s != null && !"".equals(s))
		for(int i=0; i<s.length();i++){
			try{
				ret+=s.substring(i, i+1).toUpperCase();
			} catch(Exception x){
				ret+=s;
			}
		}
		return ret;
	}
	
	public static int compareDates(Date dateA, Date dateB) {
		Calendar calA = Calendar.getInstance();
		Calendar calB = Calendar.getInstance();
		
		if (dateA != null){
			calA.setTime(dateA);
		}
		if (dateB != null){
			calB.setTime(dateB);
		}
		
		return compareDates(calA, calB);
	}
	
    public static int compareDates(Calendar calendarA, Calendar calendarB) {
       int day1 = calendarA.get(Calendar.DATE);
       int month1 = calendarA.get(Calendar.MONTH);
       int year1 = calendarA.get(Calendar.YEAR);

       int day2 = calendarB.get(Calendar.DATE);
       int month2 = calendarB.get(Calendar.MONTH);
       int year2 = calendarB.get(Calendar.YEAR);

       if (day1 == day2 && month1 == month2 && year1 == year2) {
           return 0;
       } else if (year1 < year2) {
           return -1;
       } else if (year1 > year2) {
           return 1;
       } else if (month1 < month2) {
           return -1;
       } else if (month1 > month2) {
           return 1;
       } else if (day1 < day2) {
           return -1;
       } else if (day1 > day2) {
           return 1;
       }
       return 1;
   }
}
