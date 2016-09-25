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
 * Purpose: This object is used to retrieved form 1702-RT schedule 2A data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_2A")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_2A_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_2A_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_2A_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
		
	@Column(name="MERCHANDISE_INV")
	private double merchadiseInventory;
	
	@Column(name="PURCHASES_OF_MERCHANDISE")
	private double purchaseOfMerchadise;
	
	@Column(name="TOTAL_GOODS_AVAIL_FOR_SALE")
	private double totalGoodAvailableForSale;
	
	@Column(name="DEDUCTABLE_MERCHANDISE_INV")
	private double deductibleMerchandiseInventory;
	
	@Column(name="COST_OF_SALES")
	private double costOfSale;

	public ReturnSchedule_2A_1702_RT() {
	}

	/**
	 * @param referenceNo
	 * @param merchadiseInventory
	 * @param purchaseOfMerchadise
	 * @param totalGoodAvailableForSale
	 * @param deductibleMerchandiseInventory
	 * @param costOfSale
	 */
	public ReturnSchedule_2A_1702_RT(Long referenceNo,
			double merchadiseInventory, double purchaseOfMerchadise,
			double totalGoodAvailableForSale,
			double deductibleMerchandiseInventory, double costOfSale) {
		this.referenceNo = referenceNo;
		this.merchadiseInventory = merchadiseInventory;
		this.purchaseOfMerchadise = purchaseOfMerchadise;
		this.totalGoodAvailableForSale = totalGoodAvailableForSale;
		this.deductibleMerchandiseInventory = deductibleMerchandiseInventory;
		this.costOfSale = costOfSale;
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
	 * @return the merchadiseInventory
	 */
	public double getMerchadiseInventory() {
		return merchadiseInventory;
	}

	/**
	 * @param merchadiseInventory the merchadiseInventory to set
	 */
	public void setMerchadiseInventory(double merchadiseInventory) {
		this.merchadiseInventory = merchadiseInventory;
	}

	/**
	 * @return the purchaseOfMerchadise
	 */
	public double getPurchaseOfMerchadise() {
		return purchaseOfMerchadise;
	}

	/**
	 * @param purchaseOfMerchadise the purchaseOfMerchadise to set
	 */
	public void setPurchaseOfMerchadise(double purchaseOfMerchadise) {
		this.purchaseOfMerchadise = purchaseOfMerchadise;
	}

	/**
	 * @return the totalGoodAvailableForSale
	 */
	public double getTotalGoodAvailableForSale() {
		return totalGoodAvailableForSale;
	}

	/**
	 * @param totalGoodAvailableForSale the totalGoodAvailableForSale to set
	 */
	public void setTotalGoodAvailableForSale(double totalGoodAvailableForSale) {
		this.totalGoodAvailableForSale = totalGoodAvailableForSale;
	}

	/**
	 * @return the deductibleMerchandiseInventory
	 */
	public double getDeductibleMerchandiseInventory() {
		return deductibleMerchandiseInventory;
	}

	/**
	 * @param deductibleMerchandiseInventory the deductibleMerchandiseInventory to set
	 */
	public void setDeductibleMerchandiseInventory(
			double deductibleMerchandiseInventory) {
		this.deductibleMerchandiseInventory = deductibleMerchandiseInventory;
	}

	/**
	 * @return the costOfSale
	 */
	public double getCostOfSale() {
		return costOfSale;
	}

	/**
	 * @param costOfSale the costOfSale to set
	 */
	public void setCostOfSale(double costOfSale) {
		this.costOfSale = costOfSale;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
