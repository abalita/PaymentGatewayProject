/**************************************************
@(#) PROGRAM NAME : ReturnSchedule_9_SD_1702_RT_PK.java
@(#) AUTHOR       : Mark Sy
@(#) VERSION      : 1.0

CREATION DATE : February 3, 2014
DESCRIPTION : Return Schedule Entity Primary Key Class for 1702_RT v.2013

CHANGE HISTORY:

DATE:           CHANGED BY:          CHANGES:

 **************************************************/
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * 
 * @author CAI-STA Phils., Inc.
 */

@Embeddable
public class ReturnSchedule_9_SD_1702_RT_PK implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
	@Column(name = "SEQ_NO", nullable = false)
	private Long seqNo;
	
	public ReturnSchedule_9_SD_1702_RT_PK() {
	}
	
	public ReturnSchedule_9_SD_1702_RT_PK(Long referenceNo, Long seqNo) {
		this.referenceNo = referenceNo;
		this.seqNo = seqNo;
	}

	public Long getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Long getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
	
}
