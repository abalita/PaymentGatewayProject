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
 * Purpose: This object is used to retrieved form 1702-RT schedule 2C data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_2C")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_2C_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_2C_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_2C_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
		
	@Column(name="DC_SLRY_WG_BNFTS")
	private double salaries;
	
	@Column(name="DC_MTRLS_SPPLS_FCLTS")
	private double materials;
	
	@Column(name="DC_DEPRECIATION")
	private double  depreciation;
	
	@Column(name="DC_RENTAL")
	private double  rental;
	
	@Column(name="DC_OUTSIDE_SERVICES")
	private double outsideServices;
	
	@Column(name="DC_OTHERS")
	private double others;
	
	@Column(name="TOTAL_COST_OF_SERVICES")
	private double totalCostOfServices;

	public ReturnSchedule_2C_1702_RT() {
	}

	/**
	 * @param pk
	 * @param salaries
	 * @param materials
	 * @param depreciation
	 * @param rental
	 * @param outsideServices
	 * @param others
	 * @param totalCostOfServices
	 */
	public ReturnSchedule_2C_1702_RT(Long referenceNo,
			double salaries, double materials, double depreciation,
			double rental, double outsideServices, double others,
			double totalCostOfServices) {
		this.referenceNo = referenceNo;
		this.salaries = salaries;
		this.materials = materials;
		this.depreciation = depreciation;
		this.rental = rental;
		this.outsideServices = outsideServices;
		this.others = others;
		this.totalCostOfServices = totalCostOfServices;
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
	 * @return the salaries
	 */
	public double getSalaries() {
		return salaries;
	}

	/**
	 * @param salaries the salaries to set
	 */
	public void setSalaries(double salaries) {
		this.salaries = salaries;
	}

	/**
	 * @return the materials
	 */
	public double getMaterials() {
		return materials;
	}

	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(double materials) {
		this.materials = materials;
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
	 * @return the outsideServices
	 */
	public double getOutsideServices() {
		return outsideServices;
	}

	/**
	 * @param outsideServices the outsideServices to set
	 */
	public void setOutsideServices(double outsideServices) {
		this.outsideServices = outsideServices;
	}

	/**
	 * @return the others
	 */
	public double getOthers() {
		return others;
	}

	/**
	 * @param others the others to set
	 */
	public void setOthers(double others) {
		this.others = others;
	}

	/**
	 * @return the totalCostOfServices
	 */
	public double getTotalCostOfServices() {
		return totalCostOfServices;
	}

	/**
	 * @param totalCostOfServices the totalCostOfServices to set
	 */
	public void setTotalCostOfServices(double totalCostOfServices) {
		this.totalCostOfServices = totalCostOfServices;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
