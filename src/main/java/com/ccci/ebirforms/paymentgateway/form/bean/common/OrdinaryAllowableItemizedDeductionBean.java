package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdinaryAllowableItemizedDeductionBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long adAndPromotionsVal;
	
	private String amortizatiosDescSecond;
	private String amortizatiosDescThird;
	private String amortizatiosDescFourth;
	
	private long amortizatiosValSecond;
	private long amortizatiosValThird;
	private long amortizatiosValFourth;
	private List<ExpandableOther> listAmortizations;
	private long badDebts;
	private long charitableContributions;
	private long commissions;
	private long communicationLightWater;
	private long utilities;
	private long depletion;
	private long depreciation;
	private long directorFee;
	private long fringeBenefits;
	private long fuelAndOil;
	private long insurance;
	private long iterest;
	private long janitorialAndMessengerial;
	private long losses;
	private long mgmtAndConsultancyFee;
	private long misc;
	private long officeSupplies;
	private long otherServices;
	private long professionalFees;
	private long schedGRental;
	private long repairLabor;
	private long repairMaterials;
	private long entertainment;
	private long researchAndDev;
	private long royalties;
	private long salariesAndAllownces;
	private long securityServices;
	private long otherContributions;
	private long taxesAndLiscenses;
	private long tollingFees;
	private long trainingsAndSeminars;
	private long travelTransportaion;
	private String othersFirstDescFirst;
	private String othersFirstDescSecond;
	private String othersFirstDescThird;
	private String othersFirstDescfourth;
	private long otherFirstValue;
	private long otherSecondValue;
	private long otherThirdValue;
	private long otherFourthValue;
	
	private List<ExpandableOther> listOtherOrdinaryItemizedDeductions;
	
	private long totalOrdinaryAllowableItemizedDeductions;
	
	public String toString() {
	    return ToStringBuilder.reflectionToString(this);
	}
	
	public String getOthersFirstDescFirst() {
		return othersFirstDescFirst;
	}


	public void setOthersFirstDescFirst(String othersFirstDescFirst) {
		this.othersFirstDescFirst = othersFirstDescFirst;
	}


	public String getOthersFirstDescSecond() {
		return othersFirstDescSecond;
	}


	public void setOthersFirstDescSecond(String othersFirstDescSecond) {
		this.othersFirstDescSecond = othersFirstDescSecond;
	}


	public String getOthersFirstDescThird() {
		return othersFirstDescThird;
	}


	public void setOthersFirstDescThird(String othersFirstDescThird) {
		this.othersFirstDescThird = othersFirstDescThird;
	}


	public String getOthersFirstDescfourth() {
		return othersFirstDescfourth;
	}


	public void setOthersFirstDescfourth(String othersFirstDescfourth) {
		this.othersFirstDescfourth = othersFirstDescfourth;
	}
	
	public long getAdAndPromotionsVal() {
		return adAndPromotionsVal;
	}

	public void setAdAndPromotionsVal(long adAndPromotionsVal) {
		this.adAndPromotionsVal = adAndPromotionsVal;
	}

	public String getAmortizatiosDescSecond() {
		return amortizatiosDescSecond;
	}

	public void setAmortizatiosDescSecond(String amortizatiosDescSecond) {
		this.amortizatiosDescSecond = amortizatiosDescSecond;
	}

	public String getAmortizatiosDescThird() {
		return amortizatiosDescThird;
	}

	public void setAmortizatiosDescThird(String amortizatiosDescThird) {
		this.amortizatiosDescThird = amortizatiosDescThird;
	}

	public String getAmortizatiosDescFourth() {
		return amortizatiosDescFourth;
	}

	public void setAmortizatiosDescFourth(String amortizatiosDescFourth) {
		this.amortizatiosDescFourth = amortizatiosDescFourth;
	}

	public long getAmortizatiosValSecond() {
		return amortizatiosValSecond;
	}

	public void setAmortizatiosValSecond(long amortizatiosValSecond) {
		this.amortizatiosValSecond = amortizatiosValSecond;
	}

	public long getAmortizatiosValThird() {
		return amortizatiosValThird;
	}

	public void setAmortizatiosValThird(long amortizatiosValThird) {
		this.amortizatiosValThird = amortizatiosValThird;
	}

	public long getAmortizatiosValFourth() {
		return amortizatiosValFourth;
	}

	public void setAmortizatiosValFourth(long amortizatiosValFourth) {
		this.amortizatiosValFourth = amortizatiosValFourth;
	}

	public long getBadDebts() {
		return badDebts;
	}

	public void setBadDebts(long badDebts) {
		this.badDebts = badDebts;
	}

	public long getCharitableContributions() {
		return charitableContributions;
	}

	public void setCharitableContributions(long charitableContributions) {
		this.charitableContributions = charitableContributions;
	}

	public long getCommissions() {
		return commissions;
	}

	public void setCommissions(long commissions) {
		this.commissions = commissions;
	}

	public long getCommunicationLightWater() {
		return communicationLightWater;
	}

	public void setCommunicationLightWater(long communicationLightWater) {
		this.communicationLightWater = communicationLightWater;
	}

	public long getUtilities() {
		return utilities;
	}

	public void setUtilities(long utilities) {
		this.utilities = utilities;
	}

	public long getDepletion() {
		return depletion;
	}

	public void setDepletion(long depletion) {
		this.depletion = depletion;
	}

	public long getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(long depreciation) {
		this.depreciation = depreciation;
	}

	public long getDirectorFee() {
		return directorFee;
	}

	public void setDirectorFee(long directorFee) {
		this.directorFee = directorFee;
	}

	public long getFringeBenefits() {
		return fringeBenefits;
	}

	public void setFringeBenefits(long fringeBenefits) {
		this.fringeBenefits = fringeBenefits;
	}

	public long getFuelAndOil() {
		return fuelAndOil;
	}

	public void setFuelAndOil(long fuelAndOil) {
		this.fuelAndOil = fuelAndOil;
	}

	public long getInsurance() {
		return insurance;
	}

	public void setInsurance(long insurance) {
		this.insurance = insurance;
	}

	public long getIterest() {
		return iterest;
	}

	public void setIterest(long iterest) {
		this.iterest = iterest;
	}

	public long getJanitorialAndMessengerial() {
		return janitorialAndMessengerial;
	}

	public void setJanitorialAndMessengerial(long janitorialAndMessengerial) {
		this.janitorialAndMessengerial = janitorialAndMessengerial;
	}

	public long getLosses() {
		return losses;
	}

	public void setLosses(long losses) {
		this.losses = losses;
	}

	public long getMgmtAndConsultancyFee() {
		return mgmtAndConsultancyFee;
	}

	public void setMgmtAndConsultancyFee(long mgmtAndConsultancyFee) {
		this.mgmtAndConsultancyFee = mgmtAndConsultancyFee;
	}

	public long getMisc() {
		return misc;
	}

	public void setMisc(long misc) {
		this.misc = misc;
	}

	public long getOfficeSupplies() {
		return officeSupplies;
	}

	public void setOfficeSupplies(long officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	public long getOtherServices() {
		return otherServices;
	}

	public void setOtherServices(long otherServices) {
		this.otherServices = otherServices;
	}

	public long getProfessionalFees() {
		return professionalFees;
	}

	public void setProfessionalFees(long professionalFees) {
		this.professionalFees = professionalFees;
	}

	public long getSchedGRental() {
		return schedGRental;
	}

	public void setSchedGRental(long schedGRental) {
		this.schedGRental = schedGRental;
	}

	public long getRepairLabor() {
		return repairLabor;
	}

	public void setRepairLabor(long repairLabor) {
		this.repairLabor = repairLabor;
	}

	public long getRepairMaterials() {
		return repairMaterials;
	}

	public void setRepairMaterials(long repairMaterials) {
		this.repairMaterials = repairMaterials;
	}

	public long getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(long entertainment) {
		this.entertainment = entertainment;
	}

	public long getResearchAndDev() {
		return researchAndDev;
	}

	public void setResearchAndDev(long researchAndDev) {
		this.researchAndDev = researchAndDev;
	}

	public long getRoyalties() {
		return royalties;
	}

	public void setRoyalties(long royalties) {
		this.royalties = royalties;
	}

	public long getSalariesAndAllownces() {
		return salariesAndAllownces;
	}

	public void setSalariesAndAllownces(long salariesAndAllownces) {
		this.salariesAndAllownces = salariesAndAllownces;
	}

	public long getSecurityServices() {
		return securityServices;
	}

	public void setSecurityServices(long securityServices) {
		this.securityServices = securityServices;
	}

	public long getOtherContributions() {
		return otherContributions;
	}

	public void setOtherContributions(long otherContributions) {
		this.otherContributions = otherContributions;
	}

	public long getTaxesAndLiscenses() {
		return taxesAndLiscenses;
	}

	public void setTaxesAndLiscenses(long taxesAndLiscenses) {
		this.taxesAndLiscenses = taxesAndLiscenses;
	}

	public long getTollingFees() {
		return tollingFees;
	}

	public void setTollingFees(long tollingFees) {
		this.tollingFees = tollingFees;
	}

	public long getTrainingsAndSeminars() {
		return trainingsAndSeminars;
	}

	public void setTrainingsAndSeminars(long trainingsAndSeminars) {
		this.trainingsAndSeminars = trainingsAndSeminars;
	}

	public long getTravelTransportaion() {
		return travelTransportaion;
	}

	public void setTravelTransportaion(long travelTransportaion) {
		this.travelTransportaion = travelTransportaion;
	}


	/**
	 * @return the amortizations
	 */
	


	/**
	 * @return the listAmortizations
	 */
	public List<ExpandableOther> getListAmortizations() {
		return listAmortizations;
	}


	/**
	 * @param listAmortizations the listAmortizations to set
	 */
	public void setListAmortizations(List<ExpandableOther> listAmortizations) {
		this.listAmortizations = listAmortizations;
	}


	/**
	 * @return the listOtherOrdinaryItemizedDeductions
	 */
	public List<ExpandableOther> getListOtherOrdinaryItemizedDeductions() {
		return listOtherOrdinaryItemizedDeductions;
	}


	/**
	 * @param listOtherOrdinaryItemizedDeductions the listOtherOrdinaryItemizedDeductions to set
	 */
	public void setListOtherOrdinaryItemizedDeductions(
			List<ExpandableOther> listOtherOrdinaryItemizedDeductions) {
		this.listOtherOrdinaryItemizedDeductions = listOtherOrdinaryItemizedDeductions;
	}


	/**
	 * @return the listOtherOrdinaryItemizedDeductions
	 */
	
	
	public long getTotalOrdinaryAllowableItemizedDeductions() {
		return totalOrdinaryAllowableItemizedDeductions;
	}

	public void setTotalOrdinaryAllowableItemizedDeductions(
			long totalOrdinaryAllowableItemizedDeductions) {
		this.totalOrdinaryAllowableItemizedDeductions = totalOrdinaryAllowableItemizedDeductions;
	}

	public long getOtherFirstValue() {
		return otherFirstValue;
	}

	public void setOtherFirstValue(long otherFirstValue) {
		this.otherFirstValue = otherFirstValue;
	}

	public long getOtherSecondValue() {
		return otherSecondValue;
	}

	public void setOtherSecondValue(long otherSecondValue) {
		this.otherSecondValue = otherSecondValue;
	}

	public long getOtherThirdValue() {
		return otherThirdValue;
	}

	public void setOtherThirdValue(long otherThirdValue) {
		this.otherThirdValue = otherThirdValue;
	}

	public long getOtherFourthValue() {
		return otherFourthValue;
	}

	public void setOtherFourthValue(long otherFourthValue) {
		this.otherFourthValue = otherFourthValue;
	}

}
