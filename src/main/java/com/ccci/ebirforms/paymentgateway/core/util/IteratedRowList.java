package com.ccci.ebirforms.paymentgateway.core.util;

import java.util.List;

public class IteratedRowList {

	List<IteratedRow> rows;

	public IteratedRowList(List<IteratedRow> rows) {
		this.rows = rows;
	}
	public List<IteratedRow> getRows() {
		return rows;
	}
	public int getSize() {
		return rows.size();
	}
}