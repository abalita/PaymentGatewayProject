package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import com.ccci.ebirforms.paymentgateway.core.util.FormWsUtil;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ExpandableOther;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherCreditsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherExemptIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherGrossIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.OtherIncomeBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.PersonalPropertyReceivedBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.RealPropertySale;
import com.ccci.ebirforms.paymentgateway.form.bean.common.SpecialAllowableBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.StockShareSale;
import com.ccci.ebirforms.paymentgateway.form.bean.common.StockholdersPartnersBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Form1702RTWsBuilder {

	private static Long referenceNo;

	
	public static void build(Form1702RTTO formTO, Form1702RTWSBean formBean) {
		

		buildReturnTransaction(formTO, formBean);
		buildReturnHistory(formTO, formBean);
		buildReturnTaxpayer(formTO, formBean);
		buildReturnTaxAgent(formTO, formBean);
		buildSched1(formTO, formBean);
		buildSched2A(formTO, formBean);
		buildSched2B(formTO, formBean);
		buildSched2C(formTO, formBean);
//		buildSched3(formTO, formBean);
//		buildSched4A(formTO, formBean);
//		buildSched4B(formTO, formBean);
//		buildSched4C(formTO, formBean);
//		buildSched5(formTO, formBean);
//		buildSched6(formTO, formBean);
//		buildSched6A(formTO, formBean);
//		buildSched7(formTO, formBean);
//		buildSched7A(formTO, formBean);
//		buildSched8(formTO, formBean);
//		buildSched9(formTO, formBean);
//		buildSched9ND(formTO, formBean);
//		buildSched9NT(formTO, formBean);
//		buildSched9SD(formTO, formBean);
//		buildSched10(formTO, formBean);
//		buildSched11(formTO, formBean);
//		buildSched12I(formTO, formBean);
//		buildSched12II(formTO, formBean);
//		buildSched12III(formTO, formBean);
//		buildSched12IV(formTO, formBean);
//		buildSched13(formTO, formBean);
//		buildSched13I(formTO, formBean);
//		buildSched13II(formTO, formBean);
		
		
	}
 
	

	
	private static void buildReturnTransaction(Form1702RTTO formTO, Form1702RTWSBean formBean) {
		
		ReturnTransaction_1702_RT returnTransaction1702RT = new ReturnTransaction_1702_RT(referenceNo, 
				formBean.getTaxpayerBean().getTin(), 
				formBean.getTaxpayerBean().getBranchCode(),
				formBean.getTaxpayerBean().getDateFiled(), 
				formBean.getTaxpayerBean().getDueDate(), 
				formBean.getTaxpayerBean().getBatchNo(), 
				formBean.getTaxpayerBean().getCalendarFiscal(), 
				formBean.getTaxpayerBean().getReturnPeriod(),
				formBean.getTaxpayerBean().getAmmendedYN().toUpperCase(),
				(int)0, 
				formBean.getTaxpayerBean().getAlphaNumericTaxCode().toUpperCase(),
				"N", 
				"N", 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getGrossIncomeFromOperation()), 
				(double) 0, 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOtherTaxableIncomeNotSubjectedToFinalTax()), 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalTaxCreditsPayments45()), 
				(double) 0, 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalGrossIncome()), 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOrdinaryAllowableItemizedDeductions()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOrdinaryAllowableItemizedDeductions()), 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxableIncome()), 
				(double) 0, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxRate()), 
				(double) 0,  
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxDueOtherThanMCIT()), 
				(double) 0,//FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalIncomeTaxDue44()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getMinimumCorporateIncomeTax()),
				(double) 0,//Unpaid from previous return period default 0
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0,  
				(double) 0,//FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalIncomeTaxDue44()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getTotalTaxCreditsPayments()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxPayable46()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getTaxWthldTotal()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getSurcharge()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getInterest()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getCompromise()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getTotalPenalty()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalAmountPayable()), 
				formBean.getTotalTaxpayerBean().getOverPayment().toUpperCase(), 
				formBean.getTotalTaxpayerBean().getCommunityTaxCertificate().toUpperCase(), 
				formBean.getTotalTaxpayerBean().getPlaceOfIssue().toUpperCase(), 
				formBean.getTotalTaxpayerBean().getDateOfIssue(), 
				Double.parseDouble(formBean.getTotalTaxpayerBean().getAmountIfCTC()), 
				(double) 0, 
				(int) 9, 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getExternalAuditorTIN(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getBirAccreditationNumber(),
				formBean.getTaxpayerBean().getShortPeriodReturn().toUpperCase(), 
				formBean.getTaxpayerBean().getMethodOfDeduction().toUpperCase(),
				(double) 0, 
				(double) 0,
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0,
				(double) 0, 
				(double) 0,
				(double) 0,
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getTotalExcessCreditsMCIT()),
				(double) 0, 
				(double) 0,
				(double) 0, 
				(double) 0, 
				"", 
				"", 
				(int) 0,
				null, //formBean.getTaxpayerBean().getAlphanumericTaxCode1().toUpperCase(),  
				null, //formBean.getTaxpayerBean().getAtc2(), 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0, 
				(double) 0,
				(double) 0, 
				"1702RT", 
				(int) 12 , 
				formBean.getTaxpayerBean().getCtcSecType().toUpperCase());
		
				if(formBean.getTaxpayerBean().isAtcIC011()== true) {
					returnTransaction1702RT.setAtcCode(formBean.getTaxpayerBean().getAlphaNumericTaxCode());
					returnTransaction1702RT.setDefualtATC("Y");
					//returnTransaction1702RT.setNonDefaultATC("N");
				} else {
					returnTransaction1702RT.setAtcCode(formBean.getTaxpayerBean().getAlphaNumericTaxCode());
					//returnTransaction1702RT.setNonDefaultATC("Y");
					returnTransaction1702RT.setDefualtATC("N");
				}
				
				if(formBean.getTaxpayerBean().isAtcIC021()== true) {
					returnTransaction1702RT.setAtcCode(formBean.getTaxpayerBean().getAlphaNumericTaxCode());
					returnTransaction1702RT.setNonDefaultATC("Y");
					//returnTransaction1702RT.setDefualtATC("N");
				} else {
					returnTransaction1702RT.setAtcCode(formBean.getTaxpayerBean().getAlphaNumericTaxCode());
					//returnTransaction1702RT.setDefualtATC("Y");
					returnTransaction1702RT.setNonDefaultATC("N");
				}
				
				returnTransaction1702RT.setFromOffline("Y");
		
		formTO.setTrans1702RT(returnTransaction1702RT);
	}
	
	public static void buildReturnHistory(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		Date today = new Date();
		//Date nullDate = null;
		ReturnHistory_1702_RT returnHistory1702RT = new ReturnHistory_1702_RT(referenceNo, 
				formBean.getTaxpayerBean().getTin(), //tin, 
				formBean.getTaxpayerBean().getBranchCode(), //branchCode,
				formBean.getTaxpayerBean().getReturnPeriod(), //returnPeriod,
				formBean.getTaxpayerBean().getDateFiled(), //dateFiled,
				"TRANS",//createdBy, 
				"",//modifiedBy,
				today,//dateModified, 
				today,//dateCreated, 
				"", //auditYN,
				"", //auditedBy,
				today,//dateAudited,
				formBean.getTaxpayerBean().getRdoCode().toUpperCase(),//rdoCode, 
				formBean.getTaxpayerBean().getRegisteredName().toUpperCase(), //registeredName,
				formBean.getTaxpayerBean().getLastName().toUpperCase(), //lastName, 
				formBean.getTaxpayerBean().getFirstName().toUpperCase(), //firstName, 
				formBean.getTaxpayerBean().getMidName().toUpperCase(),//middleName,
				formBean.getTaxpayerBean().getSubStreet().toUpperCase(),//subStreet,
				formBean.getTaxpayerBean().getStreet().toUpperCase(), //street,
				formBean.getTaxpayerBean().getBarangayAddress().toUpperCase(), //barangay,
				formBean.getTaxpayerBean().getDistrictAddress().toUpperCase(), //district,
				formBean.getTaxpayerBean().getCity().toUpperCase(), //city,
				formBean.getTaxpayerBean().getContactNumber(), //num, 
				formBean.getTaxpayerBean().getZipCode(),//zipCode, 
				formBean.getTaxpayerBean().getCalendarFiscal().toUpperCase(), //code, 
				formBean.getTaxpayerBean().getStartMonth(), //startMonth,
				"", //hKeepTag,
				(long)0, //partitionID
				formBean.getTaxpayerBean().getIncorporationDate(),//corporationDate, 
				formBean.getTaxpayerBean().getLineOfBusiness().toUpperCase(),//lineOfBusiness, 
				formBean.getTaxpayerBean().getEmailAddress());//email
		
		formTO.setHistory1702RT(returnHistory1702RT);
	}
	
	private static void buildReturnTaxpayer(Form1702RTTO formTO, Form1702RTWSBean formBean) {
		
		ReturnTaxpayer_1702_RT returnTaxpayer1702RT = new ReturnTaxpayer_1702_RT();
		
		returnTaxpayer1702RT.setReferenceNo(referenceNo);
		returnTaxpayer1702RT.setNetSales(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetSalesRevenuesReceiptsFees()));
		returnTaxpayer1702RT.setCostOfSale(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getCostSalesServices()));
		returnTaxpayer1702RT.setGrossIncomeFromOperation(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getGrossIncomeFromOperation()));
		returnTaxpayer1702RT.setOtherTaxableIncome(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOtherTaxableIncomeNotSubjectedToFinalTax()));
		returnTaxpayer1702RT.setTotalGrossIncome(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalGrossIncome()));
		returnTaxpayer1702RT.setOrdinaryAllowableItemizedDeduction(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOrdinaryAllowableItemizedDeductions()));
		returnTaxpayer1702RT.setSpecialAllowableItemizedDeduction(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getSpecialAllowableItemizedDeductions36()));
		returnTaxpayer1702RT.setNolco(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNolco())); 
		returnTaxpayer1702RT.setTotalDeduction(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalItemizedDeductions())); 
		returnTaxpayer1702RT.setOptionalDeduction(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOptionalStandardDeductions())); 
		returnTaxpayer1702RT.setNetTaxableIncome(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxableIncome()));
		returnTaxpayer1702RT.setIncomeTaxRate(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxRate()));
		returnTaxpayer1702RT.setIncomeTaxDue(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxDueOtherThanMCIT())); 
		returnTaxpayer1702RT.setMinimumCorporateIncomeTax(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getMinimumCorporateIncomeTax())); 
		returnTaxpayer1702RT.setTotalIncomeTaxDue(0D);//FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalIncomeTaxDue44())); 
		returnTaxpayer1702RT.setTotalTaxPayment(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalTaxCreditsPayments45())); 
		returnTaxpayer1702RT.setNetTaxPayable(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxPayable46()));
		returnTaxpayer1702RT.setSurcharge(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getSurcharge()));
		returnTaxpayer1702RT.setInterest(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getInterest())); 
		
		if (FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getCompromise()) > 0.0) {
			returnTaxpayer1702RT.setCompromise(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getCompromise())); 
    	}
		
		returnTaxpayer1702RT.setTotalPenalties(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getTotalPenalty())); 
		returnTaxpayer1702RT.setTotalAmountPayable(FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalAmountPayable())); 
		returnTaxpayer1702RT.setReliefItemizedDeduction(FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getSpecialAllowableItemizedDeduction())); 
		returnTaxpayer1702RT.setSpecialTaxCredit(FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getSpecialTaxCredits())); 
		returnTaxpayer1702RT.setTotalTaxReliefAvailment(FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getTotalTaxReliefAvailment())); 
		returnTaxpayer1702RT.setTotalNonOperationIncome(0D);//Double.parseDouble((formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValue()).toString())); 
		returnTaxpayer1702RT.setTotalOrdinaryDeduction(FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTotalOrdinaryAllowableItemizedDeductions())); 
		returnTaxpayer1702RT.setTotalSpecialDeduction(FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getTotalSpecialAllowableItemizedDeductions())); 
		returnTaxpayer1702RT.setGrossIncome(Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getGrossIncome())); 
		returnTaxpayer1702RT.setTotalDeductableExlNolco(Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw())); 
		returnTaxpayer1702RT.setNetOperationLoss(Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLoss())); 
		returnTaxpayer1702RT.setTotalNolco(0D);//FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getTotalNOLCO())); 
		returnTaxpayer1702RT.setTotalTaxCredits(FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getTotalTaxCreditsPayments())); 
		returnTaxpayer1702RT.setTotalExcessMCIT(FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getTotalExcessCreditsMCIT())); 
		returnTaxpayer1702RT.setTotalSumReconNetIncome(FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonDeductibleExpenses())); 
		returnTaxpayer1702RT.setTotalDIfReconNetIncome(FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonTaxableAndSpDeductions())); 
		returnTaxpayer1702RT.setTotalFinalTaxWitheld(0D);//FormWsUtil.longToDouble(formBean.getTotalTaxpayerBean().getTotalFinalTaxWithheld())); 
		returnTaxpayer1702RT.setTotalIncomeExempt(0D);//FormWsUtil.longToDouble(formBean.getTotalTaxpayerBean().getTotalIncomeReceiptsExemptFromIncomeTax()));
		
		formTO.setTaxpayer1702RT(returnTaxpayer1702RT);
		
		
		/*
		ReturnTaxpayer_1702_RT returnTaxpayer1702RT = new ReturnTaxpayer_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetSalesRevenuesReceiptsFees()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getCostSalesServices()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getGrossIncomeFromOperation()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOtherTaxableIncomeNotSubjectedToFinalTax()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalGrossIncome()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOrdinaryAllowableItemizedDeductions()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getSpecialAllowableItemizedDeductions36()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNolco()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalItemizedDeductions()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getOptionalStandardDeductions()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxableIncome()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxRate()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getIncomeTaxDueOtherThanMCIT()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getMinimumCorporateIncomeTax()), 
				(double) 0,//FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalIncomeTaxDue44()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalTaxCreditsPayments45()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getNetTaxPayable46()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getSurcharge()),
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getInterest()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getCompromise()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getPenaltyBean().getTotalPenalty()), 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalAmountPayable()), 
				FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getSpecialAllowableItemizedDeduction()), 
				FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getSpecialTaxCredits()), 
				FormWsUtil.longToDouble(formBean.getTaxReliefAvailmentBean().getTotalTaxReliefAvailment()), 
				(Double) 0D,//Double.parseDouble((formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValue()).toString()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTotalOrdinaryAllowableItemizedDeductions()), 
				FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getTotalSpecialAllowableItemizedDeductions()), 
				Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getGrossIncome()), 
				Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw()), 
				Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLoss()), 
				(Double) 0D,//FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getTotalNOLCO()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getTotalTaxCreditsPayments()), 
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getTotalExcessCreditsMCIT()), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonDeductibleExpenses()), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonTaxableAndSpDeductions()), 
				(Double) 0D,//FormWsUtil.longToDouble(formBean.getTotalTaxpayerBean().getTotalFinalTaxWithheld()), 
				(Double) 0D//FormWsUtil.longToDouble(formBean.getTotalTaxpayerBean().getTotalIncomeReceiptsExemptFromIncomeTax())
				); 
		formTO.setTaxpayer1702RT(returnTaxpayer1702RT);
		*/		
		
	}
	
	private static void buildReturnTaxAgent(Form1702RTTO formTO, Form1702RTWSBean formBean) {
		ReturnTaxAgent_1702_RT returnTaxAgent1702RT = new ReturnTaxAgent_1702_RT(referenceNo, 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getNameOfExternalAuditor().toUpperCase(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getExternalAuditorTIN(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getNameOfSigningPartner().toUpperCase(),
				formBean.getExternalAuditorAccreditedTaxAgentBean().getSigningPartnerTIN(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getBirAccreditationNumber(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getIsssueDate(), 
				formBean.getExternalAuditorAccreditedTaxAgentBean().getExpiryDate());
		
		formTO.setTaxagent1702RT(returnTaxAgent1702RT);
	}
	

	
	public static void buildSched1(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_1_1702_RT sched1 = new ReturnSchedule_1_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getTaxWthldGoods()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getTaxWthldServices()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getTaxWthldLease()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getTaxWthldTotal()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getSalesReturns()), 
				FormWsUtil.longToDouble(formBean.getSalesRevenueBean().getNetSalesSched1()));
		
		formTO.setSched011702RT(sched1);
	}
	
	public static void buildSched2A(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_2A_1702_RT sched2A = new ReturnSchedule_2A_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getGoodsInvBeg()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getPurGoods()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getGoodsAvail()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getGoodsInvEnd()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getCostSales()));
		
		formTO.setSched2A1702RT(sched2A);
	}
	
	public static void buildSched2B(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_2B_1702_RT sched2B = new ReturnSchedule_2B_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getDirectMatsBeg()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getPurDirectMats()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getMatsAvail()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getDirectMatsEnd()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getRawMats()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getDirectLabor()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getManufacturingOverhead()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getTotalManufacturingCost()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getWorkInProgressBeg()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getWinProgressEnd()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getCostGoodsManufactured()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getFinishedGoodsBeg()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getFinishedGoodsEnd()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getTotalCostGoodsManufacturedAndSold()));
		
		formTO.setSched2B1702RT(sched2B);
	}
	
	public static void buildSched2C(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_2C_1702_RT sched2C = new ReturnSchedule_2C_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getSalaries()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getMaterials()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getSched2CDepreciation()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getSched2CRental()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getOutsideServ()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getOthers()), 
				FormWsUtil.longToDouble(formBean.getCostOfSaleBean().getCostService()));
		
		formTO.setSched2C1702RT(sched2C);
	}
	
	//Other Taxable Income Not Subjected to Final Tax
	private static void buildSched3(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		
		List<ReturnSchedule_3_1702_RT> sched31702RTList = new ArrayList <ReturnSchedule_3_1702_RT> ();
		long seqNo = 0L;
		long itemOrder = 0L;
		long parent = 0L;
		double total = 0D;
		total = total + FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueFirst());
		ReturnSchedule_3_1702_RT sched3 = new ReturnSchedule_3_1702_RT(referenceNo, 
				++seqNo, 
				(long) 1L,
				formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxDescFirst().toUpperCase(), 
				++parent,
				FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueFirst()));
		
		sched31702RTList.add(sched3);
		
		//next item
		total = total + FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueSecond());
		ReturnSchedule_3_1702_RT sched31 = new ReturnSchedule_3_1702_RT(referenceNo, 
				++seqNo,
				(long) 2L,
				formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxDescSecond().toUpperCase(), 
				++parent,
				FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueSecond()));
		sched31702RTList.add(sched31);
		
		//next item
		total = total + FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueThird());
		ReturnSchedule_3_1702_RT sched32 = new ReturnSchedule_3_1702_RT(referenceNo, 
				++seqNo, 
				(long) 3L,
				formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxDescThird().toUpperCase(), 
				++parent,
				FormWsUtil.longToDouble(formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValueThird()));
		sched31702RTList.add(sched32);
		
		for (ExpandableOther other : formBean.getOtherTaxableIncomeNotSubjectedToFinalTaxBean().getOtherTaxableIncomeNotSubjectToFinalTaxValue()){
			if ((!(other.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				total = total + FormWsUtil.longToDouble(other.getOtherExpandableAmount());
				ReturnSchedule_3_1702_RT sched = new ReturnSchedule_3_1702_RT(referenceNo, 
						++seqNo, 
						++itemOrder,
						other.getOtherExpandableDesc().toUpperCase(), 
						++parent,
						FormWsUtil.longToDouble(other.getOtherExpandableAmount()));
				sched31702RTList.add(sched);
			}
			else {
				continue;
			}
		}
		
		formTO.setSched31702RTList(sched31702RTList);
		
		
	}
	
	
	//Other Taxable Income Not Subjected to Final Tax
	private static void buildSched4A(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_4A_1702_RT> sched4A1702RTList = new ArrayList <ReturnSchedule_4A_1702_RT> ();
		long seqNo = 0L;
		
		
		ReturnSchedule_4A_1702_RT amort1 = new ReturnSchedule_4A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosDescSecond().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosValSecond()));
		sched4A1702RTList.add(amort1);
		
		ReturnSchedule_4A_1702_RT amort2 = new ReturnSchedule_4A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosDescThird().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosValThird()));
		sched4A1702RTList.add(amort2);
		
		ReturnSchedule_4A_1702_RT amort3 = new ReturnSchedule_4A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosDescFourth().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getAmortizatiosValFourth()));
		sched4A1702RTList.add(amort3);
		
		for (ExpandableOther other : formBean.getOrdinaryAllowableItemizedDeductionBean().getListAmortizations()){
			if ((!(other.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
			
				ReturnSchedule_4A_1702_RT sched = new ReturnSchedule_4A_1702_RT(referenceNo, 
						++seqNo, 
						other.getOtherExpandableDesc().toUpperCase(), 
						FormWsUtil.longToDouble(other.getOtherExpandableAmount()));
				sched4A1702RTList.add(sched);
			} else {
				continue;
			}
		}
		formTO.setSched4A1702RTList(sched4A1702RTList);
	}
	
	private static void buildSched4B(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		ReturnSchedule_4B_1702_RT sched4 = new ReturnSchedule_4B_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getAdAndPromotionsVal()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getBadDebts()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getCharitableContributions()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getCommissions()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getCommunicationLightWater()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getDepletion()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getDepreciation()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getDirectorFee()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getFringeBenefits()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getFuelAndOil()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getInsurance()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getIterest()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getJanitorialAndMessengerial()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getLosses()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getMgmtAndConsultancyFee()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getMisc()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOfficeSupplies()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherServices()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getProfessionalFees()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getSchedGRental()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getRepairLabor()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getRepairMaterials()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getEntertainment()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getResearchAndDev()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getRoyalties()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getSalariesAndAllownces()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getSecurityServices()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherContributions()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTaxesAndLiscenses()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTollingFees()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTrainingsAndSeminars()), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getTravelTransportaion()));
		
		formTO.setSched4B1702RT(sched4);
	}
	
	private static void buildSched4C(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_4C_1702_RT> sched4C1702RTList = new ArrayList <ReturnSchedule_4C_1702_RT> ();
		long seqNo = 0L;
		double total = 0D;
		total = total + FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherFirstValue());
		
		ReturnSchedule_4C_1702_RT others1 = new ReturnSchedule_4C_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getOthersFirstDescFirst().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherFirstValue()));
		sched4C1702RTList.add(others1);
		
		total = total + FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherSecondValue());
		
		ReturnSchedule_4C_1702_RT others2 = new ReturnSchedule_4C_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getOthersFirstDescSecond().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherSecondValue()));
		sched4C1702RTList.add(others2);
		
		total = total + FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherThirdValue());
		ReturnSchedule_4C_1702_RT others3 = new ReturnSchedule_4C_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getOthersFirstDescThird().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherThirdValue()));
		sched4C1702RTList.add(others3);
		
		total = total + FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherFourthValue());
		ReturnSchedule_4C_1702_RT others4 = new ReturnSchedule_4C_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getOrdinaryAllowableItemizedDeductionBean().getOthersFirstDescfourth().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getOrdinaryAllowableItemizedDeductionBean().getOtherFourthValue()));
		sched4C1702RTList.add(others4);
		
		for (ExpandableOther other : formBean.getOrdinaryAllowableItemizedDeductionBean().getListOtherOrdinaryItemizedDeductions()){
			if ((!(other.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				total = total + FormWsUtil.longToDouble(other.getOtherExpandableAmount());
				ReturnSchedule_4C_1702_RT sched = new ReturnSchedule_4C_1702_RT(referenceNo, 
						++seqNo, 
						other.getOtherExpandableDesc().toUpperCase(), 
						FormWsUtil.longToDouble(other.getOtherExpandableAmount()));
				sched4C1702RTList.add(sched);
			} else {
				continue;
			}
		}
		formTO.setSched4C1702RTList(sched4C1702RTList);
	}
	
	private static void buildSched5(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		List<ReturnSchedule_5_1702_RT> sched51702RTList = new ArrayList <ReturnSchedule_5_1702_RT> ();
		long seqNo = 0L;
		double total = 0D;
		double itemOrder = 0D;
		long parent = 0L;
		total = total + FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount1());
		ReturnSchedule_5_1702_RT sched1 = new ReturnSchedule_5_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsDescription1().toUpperCase(), 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsLegalBasis1().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount1()), 
				++itemOrder, 
				++parent);
		
		sched51702RTList.add(sched1);
		total = total + FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount2());
		ReturnSchedule_5_1702_RT sched2 = new ReturnSchedule_5_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsDescription2().toUpperCase(), 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsLegalBasis2().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount2()), 
				++itemOrder, 
				++parent);
		sched51702RTList.add(sched2);
		total = total + FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount3());
		ReturnSchedule_5_1702_RT sched3 = new ReturnSchedule_5_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsDescription3().toUpperCase(), 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsLegalBasis3().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount3()), 
				++itemOrder, 
				++parent);
		sched51702RTList.add(sched3);
		total = total + FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount4());
		ReturnSchedule_5_1702_RT sched4 = new ReturnSchedule_5_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsDescription4().toUpperCase(), 
				formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsLegalBasis4().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getSpecialAllowableItemizedDeductionBean().getSpecialAllowableItemizedDeductionsAmount4()), 
				++itemOrder, 
				++parent);
		sched51702RTList.add(sched4);
		
		for (SpecialAllowableBean other : formBean.getSpecialAllowableItemizedDeductionBean().getListSched5AdditionalAttachments()){
			if ((!(other.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& (!(other.getLegalBasis().equalsIgnoreCase("undefined")) && !(other.getLegalBasis().equalsIgnoreCase("")))
					&& !(String.valueOf(other.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				total = total + FormWsUtil.longToDouble(other.getOtherExpandableAmount());
				ReturnSchedule_5_1702_RT sched = new ReturnSchedule_5_1702_RT(referenceNo, 
						++seqNo, 
						other.getOtherExpandableDesc().toUpperCase(), 
						other.getLegalBasis().toUpperCase(),
						FormWsUtil.longToDouble(other.getOtherExpandableAmount()), 
						++itemOrder,
						++parent);
				sched51702RTList.add(sched);
			} else {
				continue;
			}
		}	
		
		formTO.setSched51702RTList(sched51702RTList);
		
	}
	
	private static void buildSched6(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_6_1702_RT sched6 = new ReturnSchedule_6_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getComputationOfTaxBean().getTotalGrossIncome()), 
				Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getLessTotalDeductinsExclusiveOfNOLCOAndDeductionsUnderSpecialLaw()), 
				Double.parseDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLoss())
				);
		
		formTO.setSched61702RT(sched6);
	}
	
	public static void buildSched6A(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		

		List<ReturnSchedule_6A_1702_RT> sched6A1702RTList = new ArrayList<ReturnSchedule_6A_1702_RT>();
		long seqNo = 0L;
		//double total6A = 0;
		
		ReturnSchedule_6A_1702_RT sched6A4 = new ReturnSchedule_6A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossYearIncurred1(), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossAmount1()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedPreviousYear1()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOExpired1()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedCurrentYear1()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossUnapplied1())
				);
				
		sched6A1702RTList.add(sched6A4);

		ReturnSchedule_6A_1702_RT sched6A5 = new ReturnSchedule_6A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossYearIncurred2(), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossAmount2()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedPreviousYear2()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOExpired2()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedCurrentYear2()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossUnapplied2())
				);
				
		sched6A1702RTList.add(sched6A5);;

		ReturnSchedule_6A_1702_RT sched6A6 = new ReturnSchedule_6A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossYearIncurred3(), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossAmount3()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedPreviousYear3()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOExpired3()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedCurrentYear3()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossUnapplied3())
				);
				
		sched6A1702RTList.add(sched6A6);

		ReturnSchedule_6A_1702_RT sched6A7 = new ReturnSchedule_6A_1702_RT(referenceNo, 
				++seqNo, 
				formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossYearIncurred4(), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossAmount4()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedPreviousYear4()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOExpired4()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNOLCOAppliedCurrentYear4()), 
				FormWsUtil.longToDouble(formBean.getComputationOfNetOperatingLossCarryOverBean().getNetOperatingLossUnapplied4())
				);
				
		sched6A1702RTList.add(sched6A7);

	
	formTO.setSched6A1702RTList(sched6A1702RTList);

}
	
	private static void buildSched7(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_7_1702_RT sched7 = new ReturnSchedule_7_1702_RT(referenceNo = formBean.getTaxCreditsPaymentsBean().getReferenceId(), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getPriorYearsExcessCreditsOtherThanMCIT()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getIncomeTaxPaymentUnderMCIT()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getIncomeTaxPaymentUnderRegularRate()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getExcessMCIT()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getCreditableTaxWithheldFromPrevQuarters()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getCreditableTaxWithheldFromTheFourthQuarter()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getForeignTaxCredits()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getTaxPaidInReturn()), 
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getSched7SpecialTaxCredits()));
		
		formTO.setSched71702RT(sched7);
	}
	
	public static void buildSched7A(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_7A_1702_RT> sched7A1702RTList = new ArrayList<ReturnSchedule_7A_1702_RT>();
		long seqNo = 0L;
		
		
		ReturnSchedule_7A_1702_RT other1 = new ReturnSchedule_7A_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getTaxCreditsPaymentsBean().getOtherCreditsPaymentsDescription1().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getOtherCreditsPaymentsAmount1()));
		sched7A1702RTList.add(other1);
		
		
		ReturnSchedule_7A_1702_RT other2 = new ReturnSchedule_7A_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getTaxCreditsPaymentsBean().getOtherCreditsPaymentsDescription2().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getTaxCreditsPaymentsBean().getOtherCreditsPaymentsAmount2()));
		sched7A1702RTList.add(other2);
		
		
		for (OtherCreditsBean other : formBean.getTaxCreditsPaymentsBean().getOtherCreditsBean()){
			if ((!(other.getCreditDesc().equalsIgnoreCase("undefined")) && !(other.getCreditDesc().equalsIgnoreCase(""))
						&& !(other.getCreditDesc().equalsIgnoreCase("others")))
						&& !(String.valueOf(other.getCreditExempt()).equalsIgnoreCase("0"))){
				ReturnSchedule_7A_1702_RT sched = new ReturnSchedule_7A_1702_RT(referenceNo,
						++seqNo, 
						other.getCreditDesc().toUpperCase(),
						other.getCreditExempt());
				sched7A1702RTList.add(sched);
			} else {
				continue;
			}
		}

		//sched7A1702RTList.add(1, new ReturnSchedule_7A_1702_RT(referenceNo, ++seqNo, "OTHERS", 0.0));
		

		formTO.setSched7A1702RTList(sched7A1702RTList);


		
	}
	
	public static void buildSched8(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_8_1702_RT> sched81702RTList = new ArrayList<ReturnSchedule_8_1702_RT>();
		long seqNo = 0L;
				
		ReturnSchedule_8_1702_RT other1 = new ReturnSchedule_8_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcitYear1(),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getNormalIncomeTax1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcit1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITOverNormalTax1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedPreviously1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExpiredPortionOfExcessMCIT1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedCurrently1()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getBalanceOfExcessMCIT1()));
		sched81702RTList.add(other1);
		
		ReturnSchedule_8_1702_RT other2 = new ReturnSchedule_8_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcitYear2(),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getNormalIncomeTax2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcit2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITOverNormalTax2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedPreviously2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExpiredPortionOfExcessMCIT2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedCurrently2()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getBalanceOfExcessMCIT2()));
		sched81702RTList.add(other2);
		
		ReturnSchedule_8_1702_RT other3 = new ReturnSchedule_8_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcitYear3(),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getNormalIncomeTax3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getMcit3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITOverNormalTax3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedPreviously3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExpiredPortionOfExcessMCIT3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getExcessMCITAppliedCurrently3()),
				FormWsUtil.longToDouble(formBean.getComputationOfMinimumCorporateIncomeTaxBean().getBalanceOfExcessMCIT3()));
		sched81702RTList.add(other3);
		
		formTO.setSched81702RTList(sched81702RTList);
	

	}
	
	public static void buildSched9(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		
		
		ReturnSchedule_9_1702_RT sched9 = new ReturnSchedule_9_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNetIncomePerBooks()), 
				formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem2Description().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem2Value()), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonDeductibleExpenses()), 
				formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem5Description().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem5Value()), 
				formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem7Description().toUpperCase(), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem7Value()), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getTotalNonTaxableAndSpDeductions()), 
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNetTaxableIncome()));
		formTO.setSched91702RT(sched9);
	}
		
	
	public static void buildSched9ND(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_9_ND_1702_RT> sched9ND1702RTList = new ArrayList <ReturnSchedule_9_ND_1702_RT> ();
		long seqNo = 0L;
		double sortNo = 0D;
		long parent = 0L;
		
		ReturnSchedule_9_ND_1702_RT sched9ND2 = new ReturnSchedule_9_ND_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem2Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem2Value()),
				++sortNo, 
				++parent);
		sched9ND1702RTList.add(sched9ND2);
		
		
		ReturnSchedule_9_ND_1702_RT sched9ND3 = new ReturnSchedule_9_ND_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem3Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonDeductibleExpensesItem3Value()),
				++sortNo, 
				++parent);
		sched9ND1702RTList.add(sched9ND3);
		
		for (ExpandableOther other3 : formBean.getReconciliationOfNetIncomeBean().getListOfNonDeductibleExpensesItem3()){
			if ((!(other3.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other3.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other3.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				ReturnSchedule_9_ND_1702_RT sched9NDI = new ReturnSchedule_9_ND_1702_RT(referenceNo, 
						++seqNo, 
						other3.getOtherExpandableDesc().toUpperCase(), 
						FormWsUtil.longToDouble((other3.getOtherExpandableAmount())), 
						++sortNo, 
						++parent);
				sched9ND1702RTList.add(sched9NDI);
			} else {
				continue;
			}
		}
		formTO.setSched9_ND1702RTList(sched9ND1702RTList);
	}
	
	public static void buildSched9NT(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_9_NT_1702_RT> sched9NT1702RTList = new ArrayList <ReturnSchedule_9_NT_1702_RT> ();
		long seqNo = 0L;
		double sortNo = 0D;
		long parent = 0L;
		
		ReturnSchedule_9_NT_1702_RT sched9NT5 = new ReturnSchedule_9_NT_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem5Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem5Value()),
				++sortNo, 
				++parent);
		sched9NT1702RTList.add(sched9NT5);
		
		
		ReturnSchedule_9_NT_1702_RT sched9NT6 = new ReturnSchedule_9_NT_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem6Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getNonTaxableAndSpDeductionsItem6Value()),
				++sortNo, 
				++parent);
		sched9NT1702RTList.add(sched9NT6);
		
		for (ExpandableOther other6 : formBean.getReconciliationOfNetIncomeBean().getListOfnonTaxableAndSpDeductionsItem6()){
			if ((!(other6.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other6.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other6.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				ReturnSchedule_9_NT_1702_RT sched9NTI = new ReturnSchedule_9_NT_1702_RT(referenceNo,
						++seqNo, 
						other6.getOtherExpandableDesc().toUpperCase(), 
						FormWsUtil.longToDouble(other6.getOtherExpandableAmount()),
						++sortNo, 
						++parent);
				sched9NT1702RTList.add(sched9NTI);
			} else {
				continue;
			}
		}
		formTO.setSched9_NT1702RTList(sched9NT1702RTList);
	}
	
	public static void buildSched9SD(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_9_SD_1702_RT> sched9SD1702RTList = new ArrayList <ReturnSchedule_9_SD_1702_RT> ();
		long seqNo = 0L;
		double sortNo = 0D;
		long parent = 0L;
		
		ReturnSchedule_9_SD_1702_RT sched9SD7 = new ReturnSchedule_9_SD_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem7Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem7Value()),
				++sortNo, 
				++parent);
		sched9SD1702RTList.add(sched9SD7);
		
		
		ReturnSchedule_9_SD_1702_RT sched9SD8 = new ReturnSchedule_9_SD_1702_RT(referenceNo, 	
				++seqNo, 
				formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem8Description().toUpperCase(),
				FormWsUtil.longToDouble(formBean.getReconciliationOfNetIncomeBean().getSpecialDeductionsItem8Value()),
				++sortNo, 
				++parent);
		sched9SD1702RTList.add(sched9SD8);
		
		for (ExpandableOther other8 : formBean.getReconciliationOfNetIncomeBean().getListOfSpecialDeductionsItem8()){
			if ((!(other8.getOtherExpandableDesc().equalsIgnoreCase("undefined")) && !(other8.getOtherExpandableDesc().equalsIgnoreCase("")))
					&& !(String.valueOf(other8.getOtherExpandableAmount()).equalsIgnoreCase("0"))){
				ReturnSchedule_9_SD_1702_RT sched9SDI = new ReturnSchedule_9_SD_1702_RT(referenceNo, 
						++seqNo, 
						other8.getOtherExpandableDesc().toUpperCase(), 
						FormWsUtil.longToDouble(other8.getOtherExpandableAmount()),
						++sortNo, 
						++parent);
				sched9SD1702RTList.add(sched9SDI);
			} else {
				continue;
			}
		}
		formTO.setSched9_SD1702RTList(sched9SD1702RTList);
	}
	
	
	private static void buildSched10(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_10_1702_RT sched10 = new ReturnSchedule_10_1702_RT(referenceNo, 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getCurrentAssests()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getLongTermInvestment()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getPropertyPlantEquipmentNet()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getLongTermReceivables()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getIntangibleAssets()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getOtherAssets()),
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getTotalAssets()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getCurrentLiabilities()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getLongTermLiabilities()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getDeferedCredits()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getOtherLiabilities()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getTotalLiabilities()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getCapitalStock()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getAdditionalPaidInCapital()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getRetainedEarnings()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getTotalEquity()), 
				FormWsUtil.longToDouble(formBean.getBalanceSheetBean().getTotalLiabilitiesEquity()));
		
		formTO.setSched101702RT(sched10);
	}
		
	
	private static void buildSched11(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		
		List<ReturnContributors_1702> sched11 = new ArrayList <ReturnContributors_1702> ();
		long seqNo = 0L;
		
		for (StockholdersPartnersBean other : formBean.getStockholdersPartnersMembersInformationBean().getListSched11AdditionalAttachments()){
			int i = sched11.size();	
			if(i < 20){	
				if ((!(other.getRegisteredName().equalsIgnoreCase("undefined")) && !(other.getRegisteredName().equalsIgnoreCase("")))
						&& (!(other.getTinNumber().equalsIgnoreCase("undefinedundefinedundefined")) && !(other.getTinNumber().equalsIgnoreCase("")))
						&& (!(other.getBranchCode().equalsIgnoreCase("undefined")) && !(other.getBranchCode().equalsIgnoreCase("")))
						&& !(String.valueOf(other.getCapitalContribution()).equalsIgnoreCase("0"))
						&& !(String.valueOf(other.getPercentToTotal()).equalsIgnoreCase("0"))){
					ReturnContributors_1702 sched11i = new ReturnContributors_1702(referenceNo, 
							++seqNo, 
							other.getRegisteredName().toUpperCase(),
							other.getTinNumber(),
							other.getBranchCode(),
							FormWsUtil.longToDouble(other.getCapitalContribution()), 
							other.getPercentToTotal());
					sched11.add(sched11i);
					i++;
				} else {
					continue;
				}
			}
				
		}	
		formTO.setSched111702RTList(sched11);
		
		
		
		ReturnContributorType_1702 contriType = new ReturnContributorType_1702();
		contriType.setReferenceNo(referenceNo);
		contriType.setContributorType(formBean.getStockholdersPartnersMembersInformationBean().getCapitalContributorType().toUpperCase());

/*		for ( int i = sched11.size(); i < 20 ; i++){
			if(i <20){
				ReturnContributors_1702 sched11i = new ReturnContributors_1702 ();
				sched11.add(sched11i);
			}
		}*/
		formTO.setSched111702RTContributorType(contriType);
		
	}
	
	public static void buildSched12I(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_12I_1702_RT> sched12I = new ArrayList <ReturnSchedule_12I_1702_RT> ();
		long seqNo = 0L;
		
		ReturnSchedule_12I_1702_RT sched1 = new ReturnSchedule_12I_1702_RT(referenceNo,
				++seqNo, 
				(String)"Interests", 
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getInterestExempt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getInterestsActualAmt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getInterestsFinalTaxWthldPd()));
		sched12I.add(sched1);
		
		ReturnSchedule_12I_1702_RT sched2 = new ReturnSchedule_12I_1702_RT(referenceNo,
				++seqNo, 
				(String)"Royalties", 
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getRoyaltiesExempt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getRoyaltiesActualAmt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getRoyaltiesFinalTaxWthldPd()));
		sched12I.add(sched2);
		
		ReturnSchedule_12I_1702_RT sched3 = new ReturnSchedule_12I_1702_RT(referenceNo,
				++seqNo, 
				(String)"Dividends", 
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getDividendsExempt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getDividendsActualAmt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getDividendsFinalTaxWthldPd()));
		sched12I.add(sched3);

		ReturnSchedule_12I_1702_RT sched4 = new ReturnSchedule_12I_1702_RT(referenceNo,
				++seqNo, 
				(String)"Prizes and Winnings", 
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getPrizesWinningsExempt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getPrizesWinningsActualAmt()),
				FormWsUtil.longToDouble(formBean.getTaxpayerGrossIncome().getPrizesWinningsFinalTaxWthldPd()));
		sched12I.add(sched4);

		for (OtherGrossIncomeBean other : formBean.getTaxpayerGrossIncome().getOtherGrossIncome()){
			if (!(String.valueOf(other.getOtherGrossIncomeExempt()).equalsIgnoreCase("0"))
					&& !(String.valueOf(other.getOtherGrossIncomeActualAmt()).equalsIgnoreCase("0"))
					&& !(String.valueOf(other.getOtherGrossIncomeFinalTaxWthldPd()).equalsIgnoreCase("0"))
					&& (!(other.getOtherGrossIncomeDesc().equalsIgnoreCase("undefined")) && !(other.getOtherGrossIncomeDesc().equalsIgnoreCase("")))){
				ReturnSchedule_12I_1702_RT sched5 = new ReturnSchedule_12I_1702_RT(referenceNo, 
						++seqNo, 
						other.getOtherGrossIncomeDesc().toUpperCase(), 
						FormWsUtil.longToDouble(other.getOtherGrossIncomeExempt()),
						FormWsUtil.longToDouble(other.getOtherGrossIncomeActualAmt()),
						FormWsUtil.longToDouble(other.getOtherGrossIncomeFinalTaxWthldPd()));
				sched12I.add(sched5);
			} else {
				continue;
			}
		}	
		formTO.setSched12I1702RTList(sched12I);


	}

	public static void buildSched12II(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_12II_1702_RT> sched12II = new ArrayList <ReturnSchedule_12II_1702_RT> ();

		for(RealPropertySale rps : formBean.getTaxpayerRealPropertySales()){
			long seqNo = 0L;
			if ((!(rps.getPropDescription().equalsIgnoreCase("undefined")) && !(rps.getPropDescription().equalsIgnoreCase("")))
					&& (!(rps.getTaxDeclNo().equalsIgnoreCase("undefined")) && !(rps.getTaxDeclNo().equalsIgnoreCase("")))
					&& (!(rps.getCarNo().equalsIgnoreCase("undefined")) && !(rps.getCarNo().equalsIgnoreCase("")))
					&& !(String.valueOf(rps.getActualAmount()).equalsIgnoreCase("0"))
					&& !(String.valueOf(rps.getPropertyTaxWithheld()).equalsIgnoreCase("0"))){
				ReturnSchedule_12II_1702_RT realPropSale = new ReturnSchedule_12II_1702_RT(referenceNo, 
						++seqNo, 
						rps.getPropDescription().toUpperCase(), 
						rps.getTaxDeclNo().toUpperCase(), 
						rps.getCarNo().toUpperCase(), 
						FormWsUtil.longToDouble(rps.getActualAmount()), 
						FormWsUtil.longToDouble(rps.getPropertyTaxWithheld()) 
				);
				sched12II.add(realPropSale);
			} else {
				continue;
			}
		}
		formTO.setSched12II1702RTList(sched12II);
	}

	public static void buildSched12III(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_12III_1702_RT> sched12III = new ArrayList <ReturnSchedule_12III_1702_RT> ();
		long seqNo = 0L;

		for(StockShareSale iter : formBean.getTaxpayerStockShares()){
			if ((!(iter.getStockKind().equalsIgnoreCase("undefined")) && iter.getStockKind().equalsIgnoreCase("PS")|| iter.getStockKind().equalsIgnoreCase("CS"))
					&& (!(iter.getStockSeries().equalsIgnoreCase("undefined")) && !(iter.getStockSeries().equalsIgnoreCase("")))
					&& (!(iter.getStockCARNo().equalsIgnoreCase("undefined") && iter.getStockCARNo().equalsIgnoreCase("")))
					&& !(String.valueOf(iter.getNumShares()).equalsIgnoreCase("0"))
					&& !(String.valueOf(iter.getDateIssued()).equalsIgnoreCase("null"))
					&& !(String.valueOf(iter.getStockActualAmount()).equalsIgnoreCase("0"))
					&& !(String.valueOf(iter.getStockTaxWithheld()).equalsIgnoreCase("0"))){
				ReturnSchedule_12III_1702_RT sched1 = new ReturnSchedule_12III_1702_RT(referenceNo, 
						++seqNo, 
						iter.getStockKind().toUpperCase(), 
						iter.getStockSeries().toUpperCase(), 
						iter.getStockCARNo().toUpperCase(), 
						FormWsUtil.longToDouble(iter.getNumShares()),  
						iter.getDateIssued(), 
						FormWsUtil.longToDouble(iter.getStockActualAmount()),
						FormWsUtil.longToDouble(iter.getStockTaxWithheld()));
	
				sched12III.add(sched1);
			} else {
				continue;
			}
		}
		formTO.setSched12III1702RTList(sched12III);
	
	}

	public static void buildSched12IV(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List <ReturnSchedule_12IV_1702_RT> sched12IV = new ArrayList <ReturnSchedule_12IV_1702_RT>();
		long seqNo = 0L;
		
		for(OtherIncomeBean iter : formBean.getTaxpayerOtherIncome()){
			if ((!(iter.getOtherIncome().equalsIgnoreCase("undefined")) && !(iter.getOtherIncome().equalsIgnoreCase("")))
					&& !(String.valueOf(iter.getActualAmount()).equalsIgnoreCase("0"))
					&& !(String.valueOf(iter.getOtherIncomeTaxWithheld()).equalsIgnoreCase("0"))){
				ReturnSchedule_12IV_1702_RT sched1 = new ReturnSchedule_12IV_1702_RT(referenceNo, 
						++seqNo, 
						iter.getOtherIncome().toUpperCase(),
						FormWsUtil.longToDouble(iter.getActualAmount()),
						FormWsUtil.longToDouble(iter.getOtherIncomeTaxWithheld()));
						
				sched12IV.add(sched1);
			} else {
				continue;
			}
		}
		formTO.setSched12IV1702RTList(sched12IV);
	}
	
	public static void buildSched13(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		ReturnSchedule_13_1702_RT sched13 = new ReturnSchedule_13_1702_RT (referenceNo, 
				formBean.getTaxpayerGrossIncomeExempt().getReturnOfPremium());

		formTO.setSched131702RT(sched13);
		
	}
	
	public static void buildSched13I(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_13I_1702_RT> sched13I = new ArrayList <ReturnSchedule_13I_1702_RT>();
		long seqNo = 0L;

		for(PersonalPropertyReceivedBean iter : formBean.getTaxpayerPersonalPropertyReceived()){
			if ((!(iter.getPersonalPropertyDesc().equalsIgnoreCase("undefined")) && !(iter.getPersonalPropertyDesc().equalsIgnoreCase(""))) 
					&& (!(iter.getPersonalPropertyTransferMode().equalsIgnoreCase("undefined")) && !(iter.getPersonalPropertyTransferMode().equalsIgnoreCase(""))) 
					&& (!(iter.getPersonalPropertyCARNo().equalsIgnoreCase("undefined")) && !(iter.getPersonalPropertyCARNo().equalsIgnoreCase(""))) 
					&& !(String.valueOf(iter.getPersonalPropertyActualAmount()).equalsIgnoreCase("0"))){
				ReturnSchedule_13I_1702_RT sched1 = new ReturnSchedule_13I_1702_RT(referenceNo, 
						++seqNo, 
						iter.getPersonalPropertyDesc().toUpperCase(),
						iter.getPersonalPropertyTransferMode().toUpperCase(),
						iter.getPersonalPropertyCARNo().toUpperCase(),
						iter.getPersonalPropertyActualAmount());
	
				sched13I.add(sched1);
			} else {
				continue;
			}
		}
		formTO.setSched13I1702RTList(sched13I);

	}
	
	public static void buildSched13II(Form1702RTTO formTO,Form1702RTWSBean formBean) {
		List<ReturnSchedule_13II_1702_RT> sched13II = new ArrayList <ReturnSchedule_13II_1702_RT>();
		long seqNo = 0L;
		

		for(OtherExemptIncomeBean iter : formBean.getTaxpayerOtherExemptIncome()){
			if ((!(iter.getOtherIncome().equalsIgnoreCase("undefined")) && !(iter.getOtherIncome().equalsIgnoreCase("")))
					&& !(String.valueOf(iter.getActualAmount()).equalsIgnoreCase("0"))){
				ReturnSchedule_13II_1702_RT sched1 = new ReturnSchedule_13II_1702_RT(referenceNo, 
						++seqNo, 
						iter.getOtherIncome().toUpperCase(),
						iter.getActualAmount());
						
				sched13II.add(sched1);
			} else {
				continue;
			}
		}
		formTO.setSched13II1702RTList(sched13II);

	}
	
	public static void setReferenceNo(Long referenceNo) {
		Form1702RTWsBuilder.referenceNo = referenceNo;
	}
	
	
	
	
}
