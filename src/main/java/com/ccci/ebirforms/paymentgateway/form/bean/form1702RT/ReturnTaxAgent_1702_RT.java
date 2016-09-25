/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 *
 */

@Entity
@Table(name="F_1702_RT_ACCREDITED_TAX_AGENT")
@NamedQueries({
	@NamedQuery(name="ReturnTaxAgent_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnTaxAgent_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnTaxAgent_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="EXTERNAL_AUDITOR")
	private String externalAuditor;
	
	@Column(name="AUDITOR_TIN")
	private String auditorTin;
	
	@Column(name="PARTNER_NAME")
	private String partnerName;
	
	@Column(name="PARTNER_TIN")
	private String partnerTin;
	
	@Column(name="ACCREDITATION_NO")
	private String accreditationNo;
	
	@Column(name="ISSUED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date issuedDate;
	
	@Column(name="EXPIRY_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;

	public ReturnTaxAgent_1702_RT() {
	}

	public ReturnTaxAgent_1702_RT(Long referenceNo, String externalAuditor,
			String auditorTin, String partnerName, String partnerTin,
			String accreditationNo, Date issuedDate, Date expiryDate) {
		this.referenceNo = referenceNo;
		this.externalAuditor = externalAuditor;
		this.auditorTin = auditorTin;
		this.partnerName = partnerName;
		this.partnerTin = partnerTin;
		this.accreditationNo = accreditationNo;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
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
	 * @return the externalAuditor
	 */
	public String getExternalAuditor() {
		return externalAuditor;
	}

	/**
	 * @param externalAuditor the externalAuditor to set
	 */
	public void setExternalAuditor(String externalAuditor) {
		this.externalAuditor = externalAuditor;
	}

	/**
	 * @return the auditorTin
	 */
	public String getAuditorTin() {
		return auditorTin;
	}

	/**
	 * @param auditorTin the auditorTin to set
	 */
	public void setAuditorTin(String auditorTin) {
		this.auditorTin = auditorTin;
	}

	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * @param partnerName the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * @return the partnerTin
	 */
	public String getPartnerTin() {
		return partnerTin;
	}

	/**
	 * @param partnerTin the partnerTin to set
	 */
	public void setPartnerTin(String partnerTin) {
		this.partnerTin = partnerTin;
	}

	/**
	 * @return the accreditationNo
	 */
	public String getAccreditationNo() {
		return accreditationNo;
	}

	/**
	 * @param accreditationNo the accreditationNo to set
	 */
	public void setAccreditationNo(String accreditationNo) {
		this.accreditationNo = accreditationNo;
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
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
