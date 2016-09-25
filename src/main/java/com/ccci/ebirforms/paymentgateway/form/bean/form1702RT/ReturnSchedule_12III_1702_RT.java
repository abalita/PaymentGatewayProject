/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT schedule 12I data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_12III")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_12III_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_12III_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_12III_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_12III_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_12III_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_12III_1702_RT_PK pk;
	
	@Column(name="STOCK_KIND")
	private String stockKind;
	
	@Column(name="STOCK_SERIES_NO")
	private String stockSeriesNo;
	
	@Column(name="CAR_NO")
	private String carNo;
	
	@Column(name="NUMBER_SHARE")
	private double numberOfSharee;
	
	@Column(name="ISSUED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date issuedDate;
	
	@Column(name="ACTUAL_AMOUNT")
	private double actualAmount;
	
	@Column(name="FINAL_TAX_WITHELD")
	private double finalTaxWitheld;

	public ReturnSchedule_12III_1702_RT() {
	}

	/**
	 * @param pk
	 * @param stockKind
	 * @param stockSeriesNo
	 * @param carNo
	 * @param numberOfSharee
	 * @param issuedDate
	 * @param actualAmount
	 * @param finalTaxWitheld
	 */
	public ReturnSchedule_12III_1702_RT(Long referenceNo, Long seqNo,
			String stockKind, String stockSeriesNo, String carNo,
			double numberOfSharee, Date issuedDate, double actualAmount,
			double finalTaxWitheld) {
		this.pk = new ReturnSchedule_12III_1702_RT_PK(referenceNo, seqNo);
		this.stockKind = stockKind;
		this.stockSeriesNo = stockSeriesNo;
		this.carNo = carNo;
		this.numberOfSharee = numberOfSharee;
		this.issuedDate = issuedDate;
		this.actualAmount = actualAmount;
		this.finalTaxWitheld = finalTaxWitheld;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_12III_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_12III_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the stockKind
	 */
	public String getStockKind() {
		return stockKind;
	}

	/**
	 * @param stockKind the stockKind to set
	 */
	public void setStockKind(String stockKind) {
		this.stockKind = stockKind;
	}

	/**
	 * @return the stockSeriesNo
	 */
	public String getStockSeriesNo() {
		return stockSeriesNo;
	}

	/**
	 * @param stockSeriesNo the stockSeriesNo to set
	 */
	public void setStockSeriesNo(String stockSeriesNo) {
		this.stockSeriesNo = stockSeriesNo;
	}

	/**
	 * @return the carNo
	 */
	public String getCarNo() {
		return carNo;
	}

	/**
	 * @param carNo the carNo to set
	 */
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	/**
	 * @return the numberOfSharee
	 */
	public double getNumberOfSharee() {
		return numberOfSharee;
	}

	/**
	 * @param numberOfSharee the numberOfSharee to set
	 */
	public void setNumberOfSharee(double numberOfSharee) {
		this.numberOfSharee = numberOfSharee;
	}

	/**
	 * @return the issuedDate
	 */
	public Date getIssuedDate() {
		return issuedDate;
	}

	/**
	 * @param issuedDate the issuedDate to set
	 */
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	/**
	 * @return the actualAmount
	 */
	public double getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(double actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the finalTaxWitheld
	 */
	public double getFinalTaxWitheld() {
		return finalTaxWitheld;
	}

	/**
	 * @param finalTaxWitheld the finalTaxWitheld to set
	 */
	public void setFinalTaxWitheld(double finalTaxWitheld) {
		this.finalTaxWitheld = finalTaxWitheld;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
