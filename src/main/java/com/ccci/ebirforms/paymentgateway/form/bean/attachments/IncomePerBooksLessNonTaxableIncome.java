/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class IncomePerBooksLessNonTaxableIncome extends IncomePerBooks {

	public IncomePerBooksLessNonTaxableIncome() {
		this.setItemAction("Add");
	}

	public IncomePerBooksLessNonTaxableIncome(int sequenceNumber) {
		this.setItemOrder(sequenceNumber);
		this.setItemAction("Add");
	}
}
