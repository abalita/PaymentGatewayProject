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
 * Purpose: This object is used to retrieved form 1702-RT schedule 2B data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_2B")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_2B_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_2B_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_2B_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
		
	@Column(name="DIRECT_MATERIALS")
	private double directMaterials;
	
	@Column(name="PURCHASES_OF_DRCT_MTRLS")
	private double purchaseOfDirectMaterials;
	
	@Column(name="MATERIALS_AVAIL_FOR_USE")
	private double materialsAvailableForUse;
	
	@Column(name="DEDUCTABLE_DIRECT_MATERIALS")
	private double lessDirectMaterial;
	
	@Column(name="RAW_MATERIAL_USED")
	private double rawMaterialUsed;
	
	@Column(name="DIRECT_LABOR")
	private double directLabor;
	
	@Column(name="MANUFACTURING_OVERHEAD")
	private double manufacturingOverhead;
	
	@Column(name="TOTAL_MANUFACTURING_COST")
	private double totalManufacturingCost;
	
	@Column(name="WORK_PROCESS_BEGIN")
	private double workProcessBegin;
	
	@Column(name="DEDUCTABLE_WORK_PROCESS_END")
	private double lessWorkProcessEnd;
	
	@Column(name="COST_OF_GOODS_MANUFACTURED")
	private double costOfGoodManufactured;
	
	@Column(name="FINISHED_GOODS_BEGIN")
	private double finishedGoodBegin;
	
	@Column(name="DEDUCTABLE_FINISHED_GOODS")
	private double lessFinishedGood;
	
	@Column(name="GOODS_MANUFACTURED_AND_SOLD")
	private double goodManufacturedAndSold;

	public ReturnSchedule_2B_1702_RT() {
	}

	/**
	 * @param pk
	 * @param directMaterials
	 * @param purchaseOfDirectMaterials
	 * @param materialsAvailableForUse
	 * @param lessDirectMaterial
	 * @param rawMaterialUsed
	 * @param directLabor
	 * @param manufacturingOverhead
	 * @param totalManufacturingCost
	 * @param workProcessBegin
	 * @param lessWorkProcessEnd
	 * @param costOfGoodManufactured
	 * @param finishedGoodBegin
	 * @param lessFinishedGood
	 * @param goodManufacturedAndSold
	 */
	public ReturnSchedule_2B_1702_RT(Long referenceNo,
			double directMaterials, double purchaseOfDirectMaterials,
			double materialsAvailableForUse, double lessDirectMaterial,
			double rawMaterialUsed, double directLabor,
			double manufacturingOverhead, double totalManufacturingCost,
			double workProcessBegin, double lessWorkProcessEnd,
			double costOfGoodManufactured, double finishedGoodBegin,
			double lessFinishedGood, double goodManufacturedAndSold) {
		this.referenceNo = referenceNo;
		this.directMaterials = directMaterials;
		this.purchaseOfDirectMaterials = purchaseOfDirectMaterials;
		this.materialsAvailableForUse = materialsAvailableForUse;
		this.lessDirectMaterial = lessDirectMaterial;
		this.rawMaterialUsed = rawMaterialUsed;
		this.directLabor = directLabor;
		this.manufacturingOverhead = manufacturingOverhead;
		this.totalManufacturingCost = totalManufacturingCost;
		this.workProcessBegin = workProcessBegin;
		this.lessWorkProcessEnd = lessWorkProcessEnd;
		this.costOfGoodManufactured = costOfGoodManufactured;
		this.finishedGoodBegin = finishedGoodBegin;
		this.lessFinishedGood = lessFinishedGood;
		this.goodManufacturedAndSold = goodManufacturedAndSold;
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
	 * @return the directMaterials
	 */
	public double getDirectMaterials() {
		return directMaterials;
	}

	/**
	 * @param directMaterials the directMaterials to set
	 */
	public void setDirectMaterials(double directMaterials) {
		this.directMaterials = directMaterials;
	}

	/**
	 * @return the purchaseOfDirectMaterials
	 */
	public double getPurchaseOfDirectMaterials() {
		return purchaseOfDirectMaterials;
	}

	/**
	 * @param purchaseOfDirectMaterials the purchaseOfDirectMaterials to set
	 */
	public void setPurchaseOfDirectMaterials(double purchaseOfDirectMaterials) {
		this.purchaseOfDirectMaterials = purchaseOfDirectMaterials;
	}

	/**
	 * @return the materialsAvailableForUse
	 */
	public double getMaterialsAvailableForUse() {
		return materialsAvailableForUse;
	}

	/**
	 * @param materialsAvailableForUse the materialsAvailableForUse to set
	 */
	public void setMaterialsAvailableForUse(double materialsAvailableForUse) {
		this.materialsAvailableForUse = materialsAvailableForUse;
	}

	/**
	 * @return the lessDirectMaterial
	 */
	public double getLessDirectMaterial() {
		return lessDirectMaterial;
	}

	/**
	 * @param lessDirectMaterial the lessDirectMaterial to set
	 */
	public void setLessDirectMaterial(double lessDirectMaterial) {
		this.lessDirectMaterial = lessDirectMaterial;
	}

	/**
	 * @return the rawMaterialUsed
	 */
	public double getRawMaterialUsed() {
		return rawMaterialUsed;
	}

	/**
	 * @param rawMaterialUsed the rawMaterialUsed to set
	 */
	public void setRawMaterialUsed(double rawMaterialUsed) {
		this.rawMaterialUsed = rawMaterialUsed;
	}

	/**
	 * @return the directLabor
	 */
	public double getDirectLabor() {
		return directLabor;
	}

	/**
	 * @param directLabor the directLabor to set
	 */
	public void setDirectLabor(double directLabor) {
		this.directLabor = directLabor;
	}

	/**
	 * @return the manufacturingOverhead
	 */
	public double getManufacturingOverhead() {
		return manufacturingOverhead;
	}

	/**
	 * @param manufacturingOverhead the manufacturingOverhead to set
	 */
	public void setManufacturingOverhead(double manufacturingOverhead) {
		this.manufacturingOverhead = manufacturingOverhead;
	}

	/**
	 * @return the totalManufacturingCost
	 */
	public double getTotalManufacturingCost() {
		return totalManufacturingCost;
	}

	/**
	 * @param totalManufacturingCost the totalManufacturingCost to set
	 */
	public void setTotalManufacturingCost(double totalManufacturingCost) {
		this.totalManufacturingCost = totalManufacturingCost;
	}

	/**
	 * @return the workProcessBegin
	 */
	public double getWorkProcessBegin() {
		return workProcessBegin;
	}

	/**
	 * @param workProcessBegin the workProcessBegin to set
	 */
	public void setWorkProcessBegin(double workProcessBegin) {
		this.workProcessBegin = workProcessBegin;
	}

	/**
	 * @return the lessWorkProcessEnd
	 */
	public double getLessWorkProcessEnd() {
		return lessWorkProcessEnd;
	}

	/**
	 * @param lessWorkProcessEnd the lessWorkProcessEnd to set
	 */
	public void setLessWorkProcessEnd(double lessWorkProcessEnd) {
		this.lessWorkProcessEnd = lessWorkProcessEnd;
	}

	/**
	 * @return the costOfGoodManufactured
	 */
	public double getCostOfGoodManufactured() {
		return costOfGoodManufactured;
	}

	/**
	 * @param costOfGoodManufactured the costOfGoodManufactured to set
	 */
	public void setCostOfGoodManufactured(double costOfGoodManufactured) {
		this.costOfGoodManufactured = costOfGoodManufactured;
	}

	/**
	 * @return the finishedGoodBegin
	 */
	public double getFinishedGoodBegin() {
		return finishedGoodBegin;
	}

	/**
	 * @param finishedGoodBegin the finishedGoodBegin to set
	 */
	public void setFinishedGoodBegin(double finishedGoodBegin) {
		this.finishedGoodBegin = finishedGoodBegin;
	}

	/**
	 * @return the lessFinishedGood
	 */
	public double getLessFinishedGood() {
		return lessFinishedGood;
	}

	/**
	 * @param lessFinishedGood the lessFinishedGood to set
	 */
	public void setLessFinishedGood(double lessFinishedGood) {
		this.lessFinishedGood = lessFinishedGood;
	}

	/**
	 * @return the goodManufacturedAndSold
	 */
	public double getGoodManufacturedAndSold() {
		return goodManufacturedAndSold;
	}

	/**
	 * @param goodManufacturedAndSold the goodManufacturedAndSold to set
	 */
	public void setGoodManufacturedAndSold(double goodManufacturedAndSold) {
		this.goodManufacturedAndSold = goodManufacturedAndSold;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
