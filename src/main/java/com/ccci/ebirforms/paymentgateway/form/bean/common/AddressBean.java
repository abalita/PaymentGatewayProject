/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

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
public class AddressBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String unitNo;
	private String bldgName;
	private String lotNo;
	private String blockNo;
	private String phaseNo;
	private String houseNo;
	private String streetName;
	private String subdOrVill;
	private String barangay;
	private String municipality;
	private String province;
	private String zipCode;
	private String isCurrent;
	
	@Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

	/**
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}

	/**
	 * @param unitNo the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	/**
	 * @return the bldgName
	 */
	public String getBldgName() {
		return bldgName;
	}

	/**
	 * @param bldgName the bldgName to set
	 */
	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}

	/**
	 * @return the blockNo
	 */
	public String getBlockNo() {
		return blockNo;
	}

	/**
	 * @param blockNo the blockNo to set
	 */
	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}

	/**
	 * @return the phaseNo
	 */
	public String getPhaseNo() {
		return phaseNo;
	}

	/**
	 * @param phaseNo the phaseNo to set
	 */
	public void setPhaseNo(String phaseNo) {
		this.phaseNo = phaseNo;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the subdOrVill
	 */
	public String getSubdOrVill() {
		return subdOrVill;
	}

	/**
	 * @param subdOrVill the subdOrVill to set
	 */
	public void setSubdOrVill(String subdOrVill) {
		this.subdOrVill = subdOrVill;
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
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
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
	 * @return the isCurrent
	 */
	public String getIsCurrent() {
		return isCurrent;
	}

	/**
	 * @param isCurrent the isCurrent to set
	 */
	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}

	/**
	 * @return the lotNo
	 */
	public String getLotNo() {
		return lotNo;
	}

	/**
	 * @param lotNo the lotNo to set
	 */
	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}
	
	
}
