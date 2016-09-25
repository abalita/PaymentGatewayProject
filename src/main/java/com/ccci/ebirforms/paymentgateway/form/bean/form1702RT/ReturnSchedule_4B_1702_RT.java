/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT schedule 4B data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_4B")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_4B_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_4B_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_4B_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO", nullable=false)
	private Long referenceNo;
	
	@Column(name="ADVERT_PROMOTION")
	private double advertisingAndPromotion;
	
	@Column(name="BAD_DEBTS")
	private double badDebts;
	
	@Column(name="CHARITABLE_CONTRIB")
	private double charitableContribution;
	
	@Column(name="COMMISSIONS")
	private double commissions;
	
	@Column(name="COMMUNICATION")
	private double communicationLigthWater;
	
	@Column(name="DEPLETION")
	private double depletion;
	
	@Column(name="DEPRECIATION")
	private double depreciation;
	
	@Column(name="DIRECTOR_FEE")
	private double directorFee;
	
	@Column(name="FRINGE_BENEFIT")
	private double fringeBenefit;
	
	@Column(name="FUEL_AND_OIL")
	private double fuelAndOil;
	
	@Column(name="INSURANCE")
	private double insurance;
	
	@Column(name="INTEREST")
	private double interest;
	
	@Column(name="JANITORIAL_SVS")
	private double janitorialServices;
	
	@Column(name="LOSSES")
	private double losses;
	
	@Column(name="MGMT_CONSULTANCY")
	private double managementAndConsultanyFee;
	
	@Column(name="MISCELLANEOUS")
	private double miscellaneous;
	
	@Column(name="OFFICE_SUPPLY")
	private double officeSupplies;
	
	@Column(name="OTHER_SVS")
	private double otherServices;
	
	@Column(name="PROF_FEES")
	private double professionalFees;
	
	@Column(name="RENTAL")
	private double rental;
	
	@Column(name="LABOR_AND_MAT")
	private double maintenanceLabor;
	
	@Column(name="MAT_SUPPLIES")
	private double maintenanceMaterial;
	
	@Column(name="REPRESENTATION")
	private double representationAndEntertainment;
	
	@Column(name="R_N_D")
	private double researchAndDevelopment;
	
	@Column(name="ROYALTIES")
	private double royalties;
	
	@Column(name="SALARIES")
	private double salariesAndAllowance;
	
	@Column(name="SEC_SVS")
	private double securityServices;
	
	@Column(name="OTHER_CONTRIB")
	private double otherContribution;
	
	@Column(name="TAXES_LIC")
	private double taxesAndLicense;
	
	@Column(name="TOLLING_FEES")
	private double tollingFee;
	
	@Column(name="TRAIN_SEM")
	private double trainingAndSeminar;
	
	@Column(name="TRANSPO_TRAV")
	private double transportaionAndTravel;

	public ReturnSchedule_4B_1702_RT() {
	}

	/**
	 * @param referenceNo
	 * @param advertisingAndPromotion
	 * @param badDebts
	 * @param charitableContribution
	 * @param commissions
	 * @param communicationLigthWater
	 * @param depletion
	 * @param depreciation
	 * @param directorFee
	 * @param fringeBenefit
	 * @param fuelAndOil
	 * @param insurance
	 * @param interest
	 * @param janitorialServices
	 * @param losses
	 * @param managementAndConsultanyFee
	 * @param miscellaneous
	 * @param officeSupplies
	 * @param otherServices
	 * @param professionalFees
	 * @param rental
	 * @param maintenanceLabor
	 * @param maintenanceMaterial
	 * @param representationAndEntertainment
	 * @param researchAndDevelopment
	 * @param royalties
	 * @param salariesAndAllowance
	 * @param securityServices
	 * @param otherContribution
	 * @param taxesAndLicense
	 * @param tollingFee
	 * @param trainingAndSeminar
	 * @param transportaionAndTravel
	 */
	public ReturnSchedule_4B_1702_RT(Long referenceNo,
			double advertisingAndPromotion, double badDebts,
			double charitableContribution, double commissions,
			double communicationLigthWater, double depletion,
			double depreciation, double directorFee, double fringeBenefit,
			double fuelAndOil, double insurance, double interest,
			double janitorialServices, double losses,
			double managementAndConsultanyFee, double miscellaneous,
			double officeSupplies, double otherServices,
			double professionalFees, double rental, double maintenanceLabor,
			double maintenanceMaterial, double representationAndEntertainment,
			double researchAndDevelopment, double royalties,
			double salariesAndAllowance, double securityServices,
			double otherContribution, double taxesAndLicense,
			double tollingFee, double trainingAndSeminar,
			double transportaionAndTravel) {
		this.referenceNo = referenceNo;
		this.advertisingAndPromotion = advertisingAndPromotion;
		this.badDebts = badDebts;
		this.charitableContribution = charitableContribution;
		this.commissions = commissions;
		this.communicationLigthWater = communicationLigthWater;
		this.depletion = depletion;
		this.depreciation = depreciation;
		this.directorFee = directorFee;
		this.fringeBenefit = fringeBenefit;
		this.fuelAndOil = fuelAndOil;
		this.insurance = insurance;
		this.interest = interest;
		this.janitorialServices = janitorialServices;
		this.losses = losses;
		this.managementAndConsultanyFee = managementAndConsultanyFee;
		this.miscellaneous = miscellaneous;
		this.officeSupplies = officeSupplies;
		this.otherServices = otherServices;
		this.professionalFees = professionalFees;
		this.rental = rental;
		this.maintenanceLabor = maintenanceLabor;
		this.maintenanceMaterial = maintenanceMaterial;
		this.representationAndEntertainment = representationAndEntertainment;
		this.researchAndDevelopment = researchAndDevelopment;
		this.royalties = royalties;
		this.salariesAndAllowance = salariesAndAllowance;
		this.securityServices = securityServices;
		this.otherContribution = otherContribution;
		this.taxesAndLicense = taxesAndLicense;
		this.tollingFee = tollingFee;
		this.trainingAndSeminar = trainingAndSeminar;
		this.transportaionAndTravel = transportaionAndTravel;
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
	 * @return the advertisingAndPromotion
	 */
	public double getAdvertisingAndPromotion() {
		return advertisingAndPromotion;
	}

	/**
	 * @param advertisingAndPromotion the advertisingAndPromotion to set
	 */
	public void setAdvertisingAndPromotion(double advertisingAndPromotion) {
		this.advertisingAndPromotion = advertisingAndPromotion;
	}

	/**
	 * @return the badDebts
	 */
	public double getBadDebts() {
		return badDebts;
	}

	/**
	 * @param badDebts the badDebts to set
	 */
	public void setBadDebts(double badDebts) {
		this.badDebts = badDebts;
	}

	/**
	 * @return the charitableContribution
	 */
	public double getCharitableContribution() {
		return charitableContribution;
	}

	/**
	 * @param charitableContribution the charitableContribution to set
	 */
	public void setCharitableContribution(double charitableContribution) {
		this.charitableContribution = charitableContribution;
	}

	/**
	 * @return the commissions
	 */
	public double getCommissions() {
		return commissions;
	}

	/**
	 * @param commissions the commissions to set
	 */
	public void setCommissions(double commissions) {
		this.commissions = commissions;
	}

	/**
	 * @return the communicationLigthWater
	 */
	public double getCommunicationLigthWater() {
		return communicationLigthWater;
	}

	/**
	 * @param communicationLigthWater the communicationLigthWater to set
	 */
	public void setCommunicationLigthWater(double communicationLigthWater) {
		this.communicationLigthWater = communicationLigthWater;
	}

	/**
	 * @return the depletion
	 */
	public double getDepletion() {
		return depletion;
	}

	/**
	 * @param depletion the depletion to set
	 */
	public void setDepletion(double depletion) {
		this.depletion = depletion;
	}

	/**
	 * @return the depreciation
	 */
	public double getDepreciation() {
		return depreciation;
	}

	/**
	 * @param depreciation the depreciation to set
	 */
	public void setDepreciation(double depreciation) {
		this.depreciation = depreciation;
	}

	/**
	 * @return the directorFee
	 */
	public double getDirectorFee() {
		return directorFee;
	}

	/**
	 * @param directorFee the directorFee to set
	 */
	public void setDirectorFee(double directorFee) {
		this.directorFee = directorFee;
	}

	/**
	 * @return the fringeBenefit
	 */
	public double getFringeBenefit() {
		return fringeBenefit;
	}

	/**
	 * @param fringeBenefit the fringeBenefit to set
	 */
	public void setFringeBenefit(double fringeBenefit) {
		this.fringeBenefit = fringeBenefit;
	}

	/**
	 * @return the fuelAndOil
	 */
	public double getFuelAndOil() {
		return fuelAndOil;
	}

	/**
	 * @param fuelAndOil the fuelAndOil to set
	 */
	public void setFuelAndOil(double fuelAndOil) {
		this.fuelAndOil = fuelAndOil;
	}

	/**
	 * @return the insurance
	 */
	public double getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(double insurance) {
		this.insurance = insurance;
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
	 * @return the janitorialServices
	 */
	public double getJanitorialServices() {
		return janitorialServices;
	}

	/**
	 * @param janitorialServices the janitorialServices to set
	 */
	public void setJanitorialServices(double janitorialServices) {
		this.janitorialServices = janitorialServices;
	}

	/**
	 * @return the losses
	 */
	public double getLosses() {
		return losses;
	}

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(double losses) {
		this.losses = losses;
	}

	/**
	 * @return the managementAndConsultanyFee
	 */
	public double getManagementAndConsultanyFee() {
		return managementAndConsultanyFee;
	}

	/**
	 * @param managementAndConsultanyFee the managementAndConsultanyFee to set
	 */
	public void setManagementAndConsultanyFee(double managementAndConsultanyFee) {
		this.managementAndConsultanyFee = managementAndConsultanyFee;
	}

	/**
	 * @return the miscellaneous
	 */
	public double getMiscellaneous() {
		return miscellaneous;
	}

	/**
	 * @param miscellaneous the miscellaneous to set
	 */
	public void setMiscellaneous(double miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	/**
	 * @return the officeSupplies
	 */
	public double getOfficeSupplies() {
		return officeSupplies;
	}

	/**
	 * @param officeSupplies the officeSupplies to set
	 */
	public void setOfficeSupplies(double officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	/**
	 * @return the otherServices
	 */
	public double getOtherServices() {
		return otherServices;
	}

	/**
	 * @param otherServices the otherServices to set
	 */
	public void setOtherServices(double otherServices) {
		this.otherServices = otherServices;
	}

	/**
	 * @return the professionalFees
	 */
	public double getProfessionalFees() {
		return professionalFees;
	}

	/**
	 * @param professionalFees the professionalFees to set
	 */
	public void setProfessionalFees(double professionalFees) {
		this.professionalFees = professionalFees;
	}

	/**
	 * @return the rental
	 */
	public double getRental() {
		return rental;
	}

	/**
	 * @param rental the rental to set
	 */
	public void setRental(double rental) {
		this.rental = rental;
	}

	/**
	 * @return the maintenanceLabor
	 */
	public double getMaintenanceLabor() {
		return maintenanceLabor;
	}

	/**
	 * @param maintenanceLabor the maintenanceLabor to set
	 */
	public void setMaintenanceLabor(double maintenanceLabor) {
		this.maintenanceLabor = maintenanceLabor;
	}

	/**
	 * @return the maintenanceMaterial
	 */
	public double getMaintenanceMaterial() {
		return maintenanceMaterial;
	}

	/**
	 * @param maintenanceMaterial the maintenanceMaterial to set
	 */
	public void setMaintenanceMaterial(double maintenanceMaterial) {
		this.maintenanceMaterial = maintenanceMaterial;
	}

	/**
	 * @return the representationAndEntertainment
	 */
	public double getRepresentationAndEntertainment() {
		return representationAndEntertainment;
	}

	/**
	 * @param representationAndEntertainment the representationAndEntertainment to set
	 */
	public void setRepresentationAndEntertainment(
			double representationAndEntertainment) {
		this.representationAndEntertainment = representationAndEntertainment;
	}

	/**
	 * @return the researchAndDevelopment
	 */
	public double getResearchAndDevelopment() {
		return researchAndDevelopment;
	}

	/**
	 * @param researchAndDevelopment the researchAndDevelopment to set
	 */
	public void setResearchAndDevelopment(double researchAndDevelopment) {
		this.researchAndDevelopment = researchAndDevelopment;
	}

	/**
	 * @return the royalties
	 */
	public double getRoyalties() {
		return royalties;
	}

	/**
	 * @param royalties the royalties to set
	 */
	public void setRoyalties(double royalties) {
		this.royalties = royalties;
	}

	/**
	 * @return the salariesAndAllowance
	 */
	public double getSalariesAndAllowance() {
		return salariesAndAllowance;
	}

	/**
	 * @param salariesAndAllowance the salariesAndAllowance to set
	 */
	public void setSalariesAndAllowance(double salariesAndAllowance) {
		this.salariesAndAllowance = salariesAndAllowance;
	}

	/**
	 * @return the securityServices
	 */
	public double getSecurityServices() {
		return securityServices;
	}

	/**
	 * @param securityServices the securityServices to set
	 */
	public void setSecurityServices(double securityServices) {
		this.securityServices = securityServices;
	}

	/**
	 * @return the otherContribution
	 */
	public double getOtherContribution() {
		return otherContribution;
	}

	/**
	 * @param otherContribution the otherContribution to set
	 */
	public void setOtherContribution(double otherContribution) {
		this.otherContribution = otherContribution;
	}

	/**
	 * @return the taxesAndLicense
	 */
	public double getTaxesAndLicense() {
		return taxesAndLicense;
	}

	/**
	 * @param taxesAndLicense the taxesAndLicense to set
	 */
	public void setTaxesAndLicense(double taxesAndLicense) {
		this.taxesAndLicense = taxesAndLicense;
	}

	/**
	 * @return the tollingFee
	 */
	public double getTollingFee() {
		return tollingFee;
	}

	/**
	 * @param tollingFee the tollingFee to set
	 */
	public void setTollingFee(double tollingFee) {
		this.tollingFee = tollingFee;
	}

	/**
	 * @return the trainingAndSeminar
	 */
	public double getTrainingAndSeminar() {
		return trainingAndSeminar;
	}

	/**
	 * @param trainingAndSeminar the trainingAndSeminar to set
	 */
	public void setTrainingAndSeminar(double trainingAndSeminar) {
		this.trainingAndSeminar = trainingAndSeminar;
	}

	/**
	 * @return the transportaionAndTravel
	 */
	public double getTransportaionAndTravel() {
		return transportaionAndTravel;
	}

	/**
	 * @param transportaionAndTravel the transportaionAndTravel to set
	 */
	public void setTransportaionAndTravel(double transportaionAndTravel) {
		this.transportaionAndTravel = transportaionAndTravel;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
