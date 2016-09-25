/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;

/**
 * @author guillek
 *
 */
public class IncomePerBooksAdd extends IncomePerBooks {

	public IncomePerBooksAdd() {
		this.setItemAction("Add");
	}

	public IncomePerBooksAdd(int sequenceNumber) {
		this.setItemOrder(sequenceNumber);
		this.setItemAction("Add");
	}
}
