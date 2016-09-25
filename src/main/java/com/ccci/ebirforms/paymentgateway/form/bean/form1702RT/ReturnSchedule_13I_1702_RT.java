/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Purpose: This object is used to retrieved form 1702-RT schedule 13 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_13I")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_13I_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_13I_1702_RT r WHERE r.pk.referenceNo =:referenceNo ORDER BY r.pk.seqNo ASC"),
	@NamedQuery(name="ReturnSchedule_13I_1702_RT.findByReferenceNoSeqNo", query="SELECT Object(r) FROM ReturnSchedule_13I_1702_RT r WHERE r.pk.referenceNo = :referenceNo AND r.pk.seqNo =:seqNo")
})
public class ReturnSchedule_13I_1702_RT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ReturnSchedule_13I_1702_RT_PK pk;
	
	@Column(name="PROPERTY_DEC")
	private String propertyDesc;
	
	@Column(name="TRANSFER_MODE")
	private String transferMode;
	
	@Column(name="CAR_NO")
	private String carNo;
	
	@Column(name="ACTUAL_AMOUNT")
	private double actualAmount;

	public ReturnSchedule_13I_1702_RT() {
	}

	/**
	 * @param pk
	 * @param propertyDesc
	 * @param transferMode
	 * @param carNo
	 * @param actualAmount
	 */
	public ReturnSchedule_13I_1702_RT(Long referenceNo, Long seqNo,
			String propertyDesc, String transferMode, String carNo,
			double actualAmount) {
		this.pk = new ReturnSchedule_13I_1702_RT_PK(referenceNo, seqNo);
		this.propertyDesc = propertyDesc;
		this.transferMode = transferMode;
		this.carNo = carNo;
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the pk
	 */
	public ReturnSchedule_13I_1702_RT_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnSchedule_13I_1702_RT_PK pk) {
		this.pk = pk;
	}

	/**
	 * @return the propertyDesc
	 */
	public String getPropertyDesc() {
		return propertyDesc;
	}

	/**
	 * @param propertyDesc the propertyDesc to set
	 */
	public void setPropertyDesc(String propertyDesc) {
		this.propertyDesc = propertyDesc;
	}

	/**
	 * @return the transferMode
	 */
	public String getTransferMode() {
		return transferMode;
	}

	/**
	 * @param transferMode the transferMode to set
	 */
	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
