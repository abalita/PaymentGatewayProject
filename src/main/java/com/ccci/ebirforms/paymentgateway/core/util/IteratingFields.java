package com.ccci.ebirforms.paymentgateway.core.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author balderr (CAI-STA Phils, Inc.)
 *
 */
public class IteratingFields {
	private int staticRowCount;
	private int max;
	private int offset;

	private List<IteratedRow> staticRows;

	private IteratedRow totalRow;

	private List<IteratedRow> dynamicRows;

	private boolean useTotalRow;
	private boolean usingAlpha;
	private Boolean updatedLastRowName = null;
	private RowPersistenceChecker persistenceChecker = null;

	private String name = null;
	private String expanderName = null;
	
	public static abstract class RowPersistenceChecker {
		public abstract boolean isRowCanPersist(IteratedRow row);
		public abstract boolean isRowNotEmpty(IteratedRow row);
	}

	public static final RowPersistenceChecker DEFAULT_PERSIST_CHECKER = new RowPersistenceChecker() {
		public boolean isRowCanPersist(IteratedRow row) {
			return row.anyExists();
		}

		public boolean isRowNotEmpty(IteratedRow row) {
			return row.anyExists();
		}
	};

	public IteratingFields() {
		this(1,0);
	}

	public IteratingFields(int staticRowCount, int offset) {
		this.offset = offset;
		this.staticRowCount = staticRowCount;
		this.staticRows = new ArrayList<IteratedRow>();
		this.dynamicRows = new ArrayList<IteratedRow>();
		for (int i = 0; i < staticRowCount; i++) {
			IteratedRow row = new IteratedRow();
			row.setRowName((offset+i+1)+"");
			row.setNumeral(i);
			this.staticRows.add(row);
		}
		this.totalRow = new IteratedRow();
		totalRow.setStaticFlag(true);
		totalRow.setDescription("OTHERS");
		totalRow.setRowName(offset+staticRowCount+"");
		totalRow.setNumeral(-1);
		useTotalRow = true;
		persistenceChecker = DEFAULT_PERSIST_CHECKER;
	}

	public IteratingFields(int staticRowCount) {
		this(staticRowCount, 0);
	}
	
	public IteratedRow getTotalRow() {
		return totalRow;
	}

	public boolean isUseTotalRow() {
		return useTotalRow;
	}

	public void setUseTotalRow(boolean useTotalRow) {
		this.useTotalRow = useTotalRow;
	}

	public int getStaticRowCount() {
		return staticRowCount;
	}

	public void setStaticRowCount(int staticRowCount) {
		this.staticRowCount = staticRowCount;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpanderName() {
		return expanderName;
	}

	public void setExpanderName(String expanderName) {
		this.expanderName = expanderName;
	}

	public boolean isRowCanPersist(IteratedRow row) {
		return getPersistenceChecker().isRowCanPersist(row);
	}

	public boolean isRowNotEmpty(IteratedRow row) {
		return getPersistenceChecker().isRowNotEmpty(row);
	}

	public boolean isUsingAlpha() {
		return usingAlpha;
	}

	public void setUsingAlpha(boolean usingAlpha) {
		this.usingAlpha = usingAlpha;
	}

	public List<IteratedRow> getRows() {
		List<IteratedRow> rows = new ArrayList<IteratedRow>();
		rows.addAll(staticRows);
		rows.addAll(dynamicRows);
		return rows;
	}

	public List<IteratedRow> getStaticDisplayRows() {
		List<IteratedRow> rows = new ArrayList<IteratedRow>();
		rows.addAll(staticRows);
		if (useTotalRow) {
			if (dynamicRows.size() > 0) {
				IteratedRow lastRow = rows.remove(rows.size()-1);
				if (!BooleanUtils.isFalse(updatedLastRowName)) {
					lastRow.setRowName(totalRow.getRowName() + ".1");
					updatedLastRowName = false;
				}
				rows.add(totalRow);
			} else if (!BooleanUtils.isTrue(updatedLastRowName)) {
				IteratedRow lastRow = staticRows.get(staticRows.size() - 1);
				lastRow.setRowName(totalRow.getRowName());
				updatedLastRowName = true;
			}
		}
		return rows;
	}

	public List<IteratedRow> getDynamicDisplayRows() {
		List<IteratedRow> rows = new ArrayList<IteratedRow>();
		if (useTotalRow && dynamicRows.size() > 0) {
			rows.add(staticRows.get(staticRows.size()-1));
		}
		rows.addAll(dynamicRows);

		return rows;
	}

	public List<IteratedRow> getStaticRows() {
		return staticRows;
	}

	public List<IteratedRow> getDynamicRows() {
		return dynamicRows;
	}

	public IteratedRow get(int i) {
		if (i < staticRowCount) {
			return staticRows.get(i);
		}
		return dynamicRows.get(i - staticRowCount);
	}

	public int getSize() {
		return staticRows.size() + dynamicRows.size();
	}

	public RowPersistenceChecker getPersistenceChecker() {
		return persistenceChecker;
	}

	public void setPersistenceChecker(RowPersistenceChecker persistenceChecker) {
		this.persistenceChecker = persistenceChecker;
	}

	public IteratedRow add() {
		IteratedRow row = new IteratedRow();
		int extraOffset = useTotalRow ? dynamicRows.size()+2 : dynamicRows.size()+1;
		row.setRowName(staticRowCount == 0 ? (offset+dynamicRows.size()+1)+"" : 
			(offset+staticRowCount) + "." + extraOffset);
		row.setNumeral(staticRowCount + dynamicRows.size());
		dynamicRows.add(row);
		return row;
	}

	public IteratedRow forEdit(int i) {
		if (i < staticRowCount) {
			return get(i);
		}
		int index = i - staticRowCount;
		if (index < dynamicRows.size()) {
			return dynamicRows.get(index);
		}
		return add();
	}

	public void add(IteratedRow row) {
		dynamicRows.add(row);
	}

	public List<IteratedRow> getPagedRows(int perPage, int page) {
		List<IteratedRow> rows = new ArrayList<IteratedRow>();
		int size = getSize();
		for (int i=0; i<perPage;i++) {
			int realIndex = (page*perPage) + i;
			if (realIndex < size) {
				rows.add(get(realIndex));
			} else {
				IteratedRow row = new IteratedRow();
				row.setNumeral(realIndex);
				rows.add(row);
			}
		}
		return rows;
	}
	
	public void clearSpouse(){
		for (IteratedRow row: getRows()) {
			row.setSpouse(null);
			if(StringUtils.isBlank(row.getTaxpayer())){
				row.setDescription(null);
				row.setItem1(null);
			}
		}
	}

	public void clearTaxPayer(){
		for (IteratedRow row: getRows()) {
			row.setTaxpayer(null);
			if(StringUtils.isBlank(row.getSpouse())){
				row.setDescription(null);
				row.setItem1(null);
			}
		}
	}
	
	public void clear(){
		dynamicRows.clear();
		for (IteratedRow row: staticRows) {
			row.setAmount(null);
			row.setDescription(null);
			row.setFirstName(null);
			row.setLastName(null);
			row.setMiddleInitial(null);
			row.setItem1(null);
			row.setItem2(null);
			row.setItem3(null);
			row.setItem4(null);
			row.setItem5(null);
			row.setItem6(null);
			row.setSpouse(null);
			row.setTaxpayer(null);
			row.setTin(null);
			row.setDate(null);
			row.setBool(null);
		}
	}
	
	public void sched1TaxPayerClear(){
		for (IteratedRow row: staticRows) {
			if(StringUtils.equals(row.getItem1(), "TaxPayer")){
				row.setAmount(null);
				row.setDescription(null);
				row.setItem1(null);
				row.setItem2(null);
				row.setItem3(null);
				row.setItem4(null);
				row.setItem5(null);
				row.setItem6(null);
				row.setSpouse(null);
				row.setTaxpayer(null);
				row.setTin(null);
				row.setDate(null);
			}
		}
		
		for (IteratedRow row: dynamicRows) {
			if(StringUtils.equals(row.getItem1(), "TaxPayer")){
				row.setAmount(null);
				row.setDescription(null);
				row.setItem1(null);
				row.setItem2(null);
				row.setItem3(null);
				row.setItem4(null);
				row.setItem5(null);
				row.setItem6(null);
				row.setSpouse(null);
				row.setTaxpayer(null);
				row.setTin(null);
				row.setDate(null);
			}
		}
	}
	
	public void sched1SpouseClear(){
		for (IteratedRow row: staticRows) {
			if(StringUtils.equals(row.getItem1(), "Spouse")){
				row.setAmount(null);
				row.setDescription(null);
				row.setItem1(null);
				row.setItem2(null);
				row.setItem3(null);
				row.setItem4(null);
				row.setItem5(null);
				row.setItem6(null);
				row.setSpouse(null);
				row.setTaxpayer(null);
				row.setTin(null);
				row.setDate(null);
			}
		}
		for (IteratedRow row: dynamicRows) {
			if(StringUtils.equals(row.getItem1(), "Spouse")){
				row.setAmount(null);
				row.setDescription(null);
				row.setItem1(null);
				row.setItem2(null);
				row.setItem3(null);
				row.setItem4(null);
				row.setItem5(null);
				row.setItem6(null);
				row.setSpouse(null);
				row.setTaxpayer(null);
				row.setTin(null);
				row.setDate(null);
		
			}
		}
	}
}
