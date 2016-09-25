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
 * Purpose: This object is used to retrieved form 1702-RT schedule 1 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_01")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_1_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_1_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_1_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
	
	@Column(name="SALE_OF_GOODS")
	private double saleOfGoods;
	
	@Column(name="SALE_OF_SERVICES")
	private double saleOfServices;
	
	@Column(name="LEASE_OF_PROPERTIES")
	private double leaseOfProperties;
	
	@Column(name="TOTAL_SALES")
	private double totalSales;
	
	@Column(name="DEDUCTABLE_SALES_RETURN")
	private double salesDiscount;
	
	@Column(name="NET_SALES")
	private double netSales;

	public ReturnSchedule_1_1702_RT() {
	}

	/**
	 * @param pk
	 * @param saleOfGoods
	 * @param saleOfServices
	 * @param leaseOfProperties
	 * @param totalSales
	 * @param salesDiscount
	 * @param netSales
	 */
	public ReturnSchedule_1_1702_RT(Long referenceNo, 
			double saleOfGoods, double saleOfServices,
			double leaseOfProperties, double totalSales, double salesDiscount,
			double netSales) {
		this.referenceNo = referenceNo;
		this.saleOfGoods = saleOfGoods;
		this.saleOfServices = saleOfServices;
		this.leaseOfProperties = leaseOfProperties;
		this.totalSales = totalSales;
		this.salesDiscount = salesDiscount;
		this.netSales = netSales;
	}

	public Long getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	/**
	 * @return the saleOfGoods
	 */
	public double getSaleOfGoods() {
		return saleOfGoods;
	}

	/**
	 * @param saleOfGoods the saleOfGoods to set
	 */
	public void setSaleOfGoods(double saleOfGoods) {
		this.saleOfGoods = saleOfGoods;
	}

	/**
	 * @return the saleOfServices
	 */
	public double getSaleOfServices() {
		return saleOfServices;
	}

	/**
	 * @param saleOfServices the saleOfServices to set
	 */
	public void setSaleOfServices(double saleOfServices) {
		this.saleOfServices = saleOfServices;
	}

	/**
	 * @return the leaseOfProperties
	 */
	public double getLeaseOfProperties() {
		return leaseOfProperties;
	}

	/**
	 * @param leaseOfProperties the leaseOfProperties to set
	 */
	public void setLeaseOfProperties(double leaseOfProperties) {
		this.leaseOfProperties = leaseOfProperties;
	}

	/**
	 * @return the totalSales
	 */
	public double getTotalSales() {
		return totalSales;
	}

	/**
	 * @param totalSales the totalSales to set
	 */
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	/**
	 * @return the salesDiscount
	 */
	public double getSalesDiscount() {
		return salesDiscount;
	}

	/**
	 * @param salesDiscount the salesDiscount to set
	 */
	public void setSalesDiscount(double salesDiscount) {
		this.salesDiscount = salesDiscount;
	}

	/**
	 * @return the netSales
	 */
	public double getNetSales() {
		return netSales;
	}

	/**
	 * @param netSales the netSales to set
	 */
	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
