/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.attachments;


/**
 * Item Model for Reconciliation of Net Income per Books Against Taxable Income.
 *
 * @author guillek
 *
 */
public class IncomePerBooks {

	private String description;

	private double netIncomeTotalExempt;
	
	private double netIncomeTotalSpecial;
	
	private double netIncomeTotalRegular;
	
	private double netIncomeTotal;
	
	private String itemAction; //can be add or less
	
	private Long parent;
	
	private int itemOrder;


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the netIncomeTotalExempt
	 */
	public double getNetIncomeTotalExempt() {
		return netIncomeTotalExempt;
	}

	/**
	 * @param netIncomeTotalExempt the netIncomeTotalExempt to set
	 */
	public void setNetIncomeTotalExempt(double netIncomeTotalExempt) {
		this.netIncomeTotalExempt = netIncomeTotalExempt;
	}

	/**
	 * @return the netIncomeTotalSpecial
	 */
	public double getNetIncomeTotalSpecial() {
		return netIncomeTotalSpecial;
	}

	/**
	 * @param netIncomeTotalSpecial the netIncomeTotalSpecial to set
	 */
	public void setNetIncomeTotalSpecial(double netIncomeTotalSpecial) {
		this.netIncomeTotalSpecial = netIncomeTotalSpecial;
	}

	/**
	 * @return the netIncomeTotalRegular
	 */
	public double getNetIncomeTotalRegular() {
		return netIncomeTotalRegular;
	}

	/**
	 * @param netIncomeTotalRegular the netIncomeTotalRegular to set
	 */
	public void setNetIncomeTotalRegular(double netIncomeTotalRegular) {
		this.netIncomeTotalRegular = netIncomeTotalRegular;
	}

	/**
	 * @return the netIncomeTotal
	 */
	public double getNetIncomeTotal() {
		return netIncomeTotal;
	}

	/**
	 * @param netIncomeTotal the netIncomeTotal to set
	 */
	public void setNetIncomeTotal(double netIncomeTotal) {
		this.netIncomeTotal = netIncomeTotal;
	}

	/**
	 * @return the itemAction
	 */
	public String getItemAction() {
		return itemAction;
	}

	/**
	 * @param itemAction the itemAction to set
	 */
	public void setItemAction(String itemAction) {
		this.itemAction = itemAction;
	}

	/**
	 * @return the parent
	 */
	public Long getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Long parent) {
		this.parent = parent;
	}

	/**
	 * @return the itemOrder
	 */
	public int getItemOrder() {
		return itemOrder;
	}

	/**
	 * @param itemOrder the itemOrder to set
	 */
	public void setItemOrder(int itemOrder) {
		this.itemOrder = itemOrder;
	}

}
