/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import com.ccci.ebirforms.paymentgateway.core.util.FormWsUtil;
import java.io.Serializable;

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
public class EmployerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String employer;
	private String employerTin1;
	private String employerTin2;
	private String employerTin3;
	private String employerBranchCode;
	private String taxFilerOrSps;
	private long compensationIcome;
	private long employerTaxWithheld;
	
	public String getTin() {
		StringBuilder sb = new StringBuilder();
		sb.append(FormWsUtil.isNotEmptyOrNull(this.employerTin1) ? this.employerTin1
				: "");
		sb.append(FormWsUtil.isNotEmptyOrNull(this.employerTin2) ? this.employerTin2
				: "");
		sb.append(FormWsUtil.isNotEmptyOrNull(this.employerTin3) ? this.employerTin3
				: "");
		sb.append(FormWsUtil.isNotEmptyOrNull(this.employerBranchCode) ? this.employerBranchCode
				: "");

		return sb.toString();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	/**
	 * @return the employerTin1
	 */
	public String getEmployerTin1() {
		return employerTin1;
	}

	/**
	 * @param employerTin1 the employerTin1 to set
	 */
	public void setEmployerTin1(String employerTin1) {
		this.employerTin1 = employerTin1;
	}

	/**
	 * @return the employerTin2
	 */
	public String getEmployerTin2() {
		return employerTin2;
	}

	/**
	 * @param employerTin2 the employerTin2 to set
	 */
	public void setEmployerTin2(String employerTin2) {
		this.employerTin2 = employerTin2;
	}

	/**
	 * @return the employerTin3
	 */
	public String getEmployerTin3() {
		return employerTin3;
	}

	/**
	 * @param employerTin3 the employerTin3 to set
	 */
	public void setEmployerTin3(String employerTin3) {
		this.employerTin3 = employerTin3;
	}

	/**
	 * @return the compensationIcome
	 */
	public long getCompensationIcome() {
		return compensationIcome;
	}

	/**
	 * @param compensationIcome the compensationIcome to set
	 */
	public void setCompensationIcome(long compensationIcome) {
		this.compensationIcome = compensationIcome;
	}

	/**
	 * @return the employerTaxWithheld
	 */
	public long getEmployerTaxWithheld() {
		return employerTaxWithheld;
	}

	/**
	 * @param employerTaxWithheld the employerTaxWithheld to set
	 */
	public void setEmployerTaxWithheld(long employerTaxWithheld) {
		this.employerTaxWithheld = employerTaxWithheld;
	}

	public String getEmployerBranchCode() {
		return employerBranchCode;
	}

	public void setEmployerBranchCode(String employerBranchCode) {
		this.employerBranchCode = employerBranchCode;
	}

	/**
	 * @return the taxFilerOrSps
	 */
	public String getTaxFilerOrSps() {
		return taxFilerOrSps;
	}

	/**
	 * @param taxFilerOrSps the taxFilerOrSps to set
	 */
	public void setTaxFilerOrSps(String taxFilerOrSps) {
		this.taxFilerOrSps = taxFilerOrSps;
	}

	
	
	
}
