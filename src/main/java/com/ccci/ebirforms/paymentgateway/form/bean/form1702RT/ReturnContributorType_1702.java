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

/**
 * Purpose: This object is used to retrieved the Contributor Type in 1702 Forms
 * Date Created: 03-17-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_CONTRIBUTOR_TYPE")
@NamedQueries({
	@NamedQuery(name="ReturnContributorType_1702.findByReferenceNo", query="SELECT r FROM ReturnContributorType_1702 r WHERE r.referenceNo =:referenceNo"),
	@NamedQuery(name="ReturnContributorType_1702.removeByReferenceNo", query="DELETE FROM ReturnContributorType_1702 r WHERE r.referenceNo =:referenceNo")
})
public class ReturnContributorType_1702 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "REFERENCE_NO", nullable = false)
	private Long referenceNo;
	
	@Column(name="CONTRIBUTOR_TYPE")
	private String contributorType;  //could be Stockholder, Partner or Members Information
	
	public ReturnContributorType_1702() {}

	public ReturnContributorType_1702(Long referenceNo, String contributorType) {
		this.referenceNo = referenceNo;
		this.contributorType = contributorType;
		
	}

	/**
	 * @return the contributorType
	 */
	public String getContributorType() {
		return contributorType;
	}

	/**
	 * @param contributorType the contributorType to set
	 */
	public void setContributorType(String contributorType) {
		this.contributorType = contributorType;
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
}
