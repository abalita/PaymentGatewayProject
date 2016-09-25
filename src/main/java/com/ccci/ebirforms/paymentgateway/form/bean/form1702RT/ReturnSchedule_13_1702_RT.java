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
 * Purpose: This object is used to retrieved form 1702-RT schedule 13 data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_RT_2013_SCHED_13")
@NamedQueries({
	@NamedQuery(name="ReturnSchedule_13_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnSchedule_13_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnSchedule_13_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="RETURN_PREMIUM")
	private double returnPremium;

	public ReturnSchedule_13_1702_RT() {
	}

	/**
	 * @param referenceNo
	 * @param returnPremium
	 */
	public ReturnSchedule_13_1702_RT(Long referenceNo, double returnPremium) {
		this.referenceNo = referenceNo;
		this.returnPremium = returnPremium;
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
	 * @return the returnPremium
	 */
	public double getReturnPremium() {
		return returnPremium;
	}

	/**
	 * @param returnPremium the returnPremium to set
	 */
	public void setReturnPremium(double returnPremium) {
		this.returnPremium = returnPremium;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
