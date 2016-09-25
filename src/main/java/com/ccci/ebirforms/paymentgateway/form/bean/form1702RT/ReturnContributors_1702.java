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
 * Purpose: This object is used to retrieved the Contributors in 1702 Forms
 * Date Created: 03-17-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_CONTRIBUTORS")
@NamedQueries({
	@NamedQuery(name="ReturnContributors_1702.findByReferenceNo", query="SELECT r FROM ReturnContributors_1702 r WHERE r.pk.referenceNo =:referenceNo"),
	@NamedQuery(name="ReturnContributors_1702.removeByReferenceNo", query="DELETE FROM ReturnContributors_1702 r WHERE r.pk.referenceNo =:referenceNo")
})
public class ReturnContributors_1702 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected ReturnScheduleContributors_1702_PK pk;
	
	@Column(name="REG_NAME")
	private String registeredName;
	
	@Column(name="TIN")
	private String tin;
	
	@Column(name="BRANCH_CODE")
	private String branchCode;
	
	@Column(name="CAP_CONTRIB")
	private double capitalContribution;
	
	@Column(name="PRCNT_TO_TTL")
	private float totalPercentage;

	public ReturnContributors_1702() {
		this.pk = new ReturnScheduleContributors_1702_PK();
	}

	public ReturnContributors_1702(Long referenceNo, Long seqNo,
			String registeredName, String tin, String branchCode,
			double capitalContribution, float totalPercentage) {
		this.pk = new ReturnScheduleContributors_1702_PK(referenceNo, seqNo);
		this.registeredName = registeredName;
		this.tin = tin;
		this.branchCode = branchCode;
		this.capitalContribution = capitalContribution;
		this.totalPercentage = totalPercentage;
	}
	
	/**
	 * @return the pk
	 */
	public ReturnScheduleContributors_1702_PK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(ReturnScheduleContributors_1702_PK pk) {
		this.pk = pk;
	}
	
	/**
	 * @return the registeredName
	 */
	public String getRegisteredName() {
		return registeredName;
	}

	/**
	 * @param registeredName the registeredName to set
	 */
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}

	/**
	 * @return the tin
	 */
	public String getTin() {
		return tin;
	}

	/**
	 * @param tin the tin to set
	 */
	public void setTin(String tin) {
		this.tin = tin;
	}

	/**
	 * @return the capitalContribution
	 */
	public double getCapitalContribution() {
		return capitalContribution;
	}

	/**
	 * @param capitalContribution the capitalContribution to set
	 */
	public void setCapitalContribution(double capitalContribution) {
		this.capitalContribution = capitalContribution;
	}

	/**
	 * @return the totalPercentage
	 */
	public float getTotalPercentage() {
		return totalPercentage;
	}

	/**
	 * @param totalPercentage the totalPercentage to set
	 */
	public void setTotalPercentage(float totalPercentage) {
		this.totalPercentage = totalPercentage;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
}
