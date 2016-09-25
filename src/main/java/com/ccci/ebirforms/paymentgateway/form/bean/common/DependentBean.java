/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author sardenj
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstName",
    "lastName",
    "middleInitial",
    "birthDate",
    "taxpayerRelation",
    "incapacitatedYn"
})
@XmlRootElement(name = "dependent")
public class DependentBean {	
	
	@XmlElement(required = true)
	protected String firstName;
	@XmlElement(required = true)
	protected String lastName;
	@XmlElement(required = true)
	protected String middleInitial;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar birthDate;
	@XmlElement(required = true)
	protected String taxpayerRelation;
	@XmlElement(required = true)
	protected String incapacitatedYn;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * Gets the value of the fisrtName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the fisrtName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the middleInitial property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddleInitial() {
		return middleInitial;
	}

	/**
	 * Sets the value of the middleInitial property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddleInitial(String value) {
		this.middleInitial = value;
	}

	/**
	 * Gets the value of the birthDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the value of the birthDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setBirthDate(XMLGregorianCalendar value) {
		this.birthDate = value;
	}

	/**
	 * Gets the value of the taxpayerRelation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxpayerRelation() {
		return taxpayerRelation;
	}

	/**
	 * Sets the value of the taxpayerRelation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxpayerRelation(String value) {
		this.taxpayerRelation = value;
	}

	/**
	 * Gets the value of the incapacitatedYn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncapacitatedYn() {
		return incapacitatedYn;
	}

	/**
	 * Sets the value of the incapacitatedYn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIncapacitatedYn(String value) {
		this.incapacitatedYn = value;
	}
}
