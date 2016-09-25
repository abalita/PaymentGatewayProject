/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StockShareSale implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String stockKind;
	private String stockSeries;
	private String stockCARNo;
	private long numShares;
	private Date dateIssued;
	private long stockActualAmount;
	private long stockTaxWithheld;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
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
	 * @return the stockSeries
	 */
	public String getStockSeries() {
		return stockSeries;
	}

	/**
	 * @param stockSeries the stockSeries to set
	 */
	public void setStockSeries(String stockSeries) {
		this.stockSeries = stockSeries;
	}

	/**
	 * @return the stockCARNo
	 */
	public String getStockCARNo() {
		return stockCARNo;
	}

	/**
	 * @param stockCARNo the stockCARNo to set
	 */
	public void setStockCARNo(String stockCARNo) {
		this.stockCARNo = stockCARNo;
	}

	/**
	 * @return the numShares
	 */
	public long getNumShares() {
		return numShares;
	}

	/**
	 * @param numShares the numShares to set
	 */
	public void setNumShares(long numShares) {
		this.numShares = numShares;
	}

	/**
	 * @return the dateIssued
	 */
	public Date getDateIssued() {
		return dateIssued;
	}

	/**
	 * @param dateIssued the dateIssued to set
	 */
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	/**
	 * @return the stockActualAmount
	 */
	public long getStockActualAmount() {
		return stockActualAmount;
	}

	/**
	 * @param stockActualAmount the stockActualAmount to set
	 */
	public void setStockActualAmount(long stockActualAmount) {
		this.stockActualAmount = stockActualAmount;
	}

	/**
	 * @return the stockTaxWithheld
	 */
	public long getStockTaxWithheld() {
		return stockTaxWithheld;
	}

	/**
	 * @param stockTaxWithheld the stockTaxWithheld to set
	 */
	public void setStockTaxWithheld(long stockTaxWithheld) {
		this.stockTaxWithheld = stockTaxWithheld;
	}
	
}
