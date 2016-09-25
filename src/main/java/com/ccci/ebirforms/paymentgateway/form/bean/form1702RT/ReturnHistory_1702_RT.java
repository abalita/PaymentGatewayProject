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
 * Purpose: This object is used to retrieved form 1702-MX history data.
 * Date Created: 01-29-2014
 * Date Modified:
 * Modification Reason:
 * 
 * @author CAI-STA Phils., Inc.
 */

@Entity
@Table(name="FILE_1702_HIST")
@NamedQueries({
	@NamedQuery(name="ReturnHistory_1702_RT.findByReferenceNo", query="SELECT r FROM ReturnHistory_1702_RT r WHERE r.referenceNo =:referenceNo")
})
public class ReturnHistory_1702_RT implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NO")
	private Long referenceNo;
	
	@Column(name="TIN")
	private String tin;
	
	@Column(name="BRANCH_CODE")
	private String branchCode;
	
	@Column(name="RETRN_PERIOD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date returnPeriod;
	
	@Column(name="DATE_FILED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFiled;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="DATE_MODIFIED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModified;
	
	@Column(name="DATE_CREATED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@Column(name="AUDIT_YN")
	private String auditYN;
	
	@Column(name="AUDITED_BY")
	private String auditedBy;
	
	@Column(name="DATE_AUDITED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAudited;
	
	@Column(name="RDO_CODE")
	private String rdoCode;
	
	@Column(name="REGISTERED_NAME")
	private String registeredName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MID_NAME")
	private String middleName;
	
	@Column(name="SUBSTREET")
	private String subStreet;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="BARANGAY")
	private String barangay;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="NUM")
	private String num;
	
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="START_MONTH")
	private int startMonth;
	
	@Column(name="HKEEP_TAG")
	private String hKeepTag;
	
	@Column(name="PARTITION_ID")
	private long partitionId;
	
	@Column(name="CORPORATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date corporationDate;
	
	@Column(name="LINE_OF_BUSINESS")
	private String lineOfBusiness;
	
	@Column(name="EMAIL")
	private String email;
	
	public ReturnHistory_1702_RT() {
	}

	public ReturnHistory_1702_RT(Long referenceNo, String tin,
			String branchCode, Date returnPeriod, Date dateFiled,
			String createdBy, String modifiedBy, Date dateModified,
			Date dateCreated, String auditYN, String auditedBy,
			Date dateAudited, String rdoCode, String registeredName,
			String lastName, String firstName, String middleName,
			String subStreet, String street, String barangay, String district,
			String city, String num, String zipCode, String code,
			int startMonth, String hKeepTag, long partitionId,
			Date corporationDate, String lineOfBusiness, String email) {
		this.referenceNo = referenceNo;
		this.tin = tin;
		this.branchCode = branchCode;
		this.returnPeriod = returnPeriod;
		this.dateFiled = dateFiled;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.dateModified = dateModified;
		this.dateCreated = dateCreated;
		this.auditYN = auditYN;
		this.auditedBy = auditedBy;
		this.dateAudited = dateAudited;
		this.rdoCode = rdoCode;
		this.registeredName = registeredName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.subStreet = subStreet;
		this.street = street;
		this.barangay = barangay;
		this.district = district;
		this.city = city;
		this.num = num;
		this.zipCode = zipCode;
		this.code = code;
		this.startMonth = startMonth;
		this.hKeepTag = hKeepTag;
		this.partitionId = partitionId;
		this.corporationDate = corporationDate;
		this.lineOfBusiness = lineOfBusiness;
		this.email = email;
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
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @return the returnPeriod
	 */
	public Date getReturnPeriod() {
		return returnPeriod;
	}

	/**
	 * @param returnPeriod the returnPeriod to set
	 */
	public void setReturnPeriod(Date returnPeriod) {
		this.returnPeriod = returnPeriod;
	}

	/**
	 * @return the dateFiled
	 */
	public Date getDateFiled() {
		return dateFiled;
	}

	/**
	 * @param dateFiled the dateFiled to set
	 */
	public void setDateFiled(Date dateFiled) {
		this.dateFiled = dateFiled;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the dateModified
	 */
	public Date getDateModified() {
		return dateModified;
	}

	/**
	 * @param dateModified the dateModified to set
	 */
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the auditYN
	 */
	public String getAuditYN() {
		return auditYN;
	}

	/**
	 * @param auditYN the auditYN to set
	 */
	public void setAuditYN(String auditYN) {
		this.auditYN = auditYN;
	}

	/**
	 * @return the auditedBy
	 */
	public String getAuditedBy() {
		return auditedBy;
	}

	/**
	 * @param auditedBy the auditedBy to set
	 */
	public void setAuditedBy(String auditedBy) {
		this.auditedBy = auditedBy;
	}

	/**
	 * @return the dateAudited
	 */
	public Date getDateAudited() {
		return dateAudited;
	}

	/**
	 * @param dateAudited the dateAudited to set
	 */
	public void setDateAudited(Date dateAudited) {
		this.dateAudited = dateAudited;
	}

	/**
	 * @return the rdoCode
	 */
	public String getRdoCode() {
		return rdoCode;
	}

	/**
	 * @param rdoCode the rdoCode to set
	 */
	public void setRdoCode(String rdoCode) {
		this.rdoCode = rdoCode;
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the subStreet
	 */
	public String getSubStreet() {
		return subStreet;
	}

	/**
	 * @param subStreet the subStreet to set
	 */
	public void setSubStreet(String subStreet) {
		this.subStreet = subStreet;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the barangay
	 */
	public String getBarangay() {
		return barangay;
	}

	/**
	 * @param barangay the barangay to set
	 */
	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the startMonth
	 */
	public int getStartMonth() {
		return startMonth;
	}

	/**
	 * @param startMonth the startMonth to set
	 */
	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}

	/**
	 * @return the hKeepTag
	 */
	public String gethKeepTag() {
		return hKeepTag;
	}

	/**
	 * @param hKeepTag the hKeepTag to set
	 */
	public void sethKeepTag(String hKeepTag) {
		this.hKeepTag = hKeepTag;
	}

	/**
	 * @return the partitionId
	 */
	public long getPartitionId() {
		return partitionId;
	}

	/**
	 * @param partitionId the partitionId to set
	 */
	public void setPartitionId(long partitionId) {
		this.partitionId = partitionId;
	}

	/**
	 * @return the corporationDate
	 */
	public Date getCorporationDate() {
		return corporationDate;
	}

	/**
	 * @param corporationDate the corporationDate to set
	 */
	public void setCorporationDate(Date corporationDate) {
		this.corporationDate = corporationDate;
	}

	/**
	 * @return the lineOfBusiness
	 */
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	/**
	 * @param lineOfBusiness the lineOfBusiness to set
	 */
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
