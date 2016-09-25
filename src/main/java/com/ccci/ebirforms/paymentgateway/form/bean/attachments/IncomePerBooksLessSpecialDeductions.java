/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class IncomePerBooksLessSpecialDeductions extends IncomePerBooks {

	public IncomePerBooksLessSpecialDeductions() {
		this.setItemAction("LessSpecialDeductions");
	}

	public IncomePerBooksLessSpecialDeductions(int sequenceNumber) {
		this.setItemOrder(sequenceNumber);
		this.setItemAction("LessSpecialDeductions");
	}
}
