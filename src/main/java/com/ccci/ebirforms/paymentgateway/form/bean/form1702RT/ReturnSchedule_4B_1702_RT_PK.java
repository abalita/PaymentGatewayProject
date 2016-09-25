/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *@author CAI-STA Phils., Inc.
 *
 */

@Embeddable
public class ReturnSchedule_4B_1702_RT_PK {

	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
	
	@Column(name = "SEQ_NO", nullable = false)
	private Long seqNo;	
	
	public ReturnSchedule_4B_1702_RT_PK() {}

	public ReturnSchedule_4B_1702_RT_PK(Long referenceNo, Long seqNo) {
		this.referenceNo = referenceNo;
		this.seqNo = seqNo;
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
	 * @return the seqNo
	 */
	public Long getSeqNo() {
		return seqNo;
	}

	/**
	 * @param seqNo the seqNo to set
	 */
	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
}
