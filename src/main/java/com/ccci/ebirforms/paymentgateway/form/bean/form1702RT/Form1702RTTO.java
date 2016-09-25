/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.form.bean.form1702RT;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sardenj
 *
 */
public class Form1702RTTO implements Serializable {
	
	private static final long serialVersionUID = 101L;
	
	private Map<String, Integer> iteratingTableMap = new HashMap<String, Integer>();
	private String username;
	
	private RegisteredTaxPayerBean registeredTaxpayer;
	private ReturnTransaction_1702_RT trans1702RT;
	private ReturnHistory_1702_RT history1702RT;
	private ReturnTaxpayer_1702_RT taxpayer1702RT;
	private ReturnTaxAgent_1702_RT taxagent1702RT;
	
	private ReturnSchedule_1_1702_RT sched011702RT;
	
	private ReturnSchedule_2A_1702_RT sched2A1702RT;
	private ReturnSchedule_2B_1702_RT sched2B1702RT;
	private ReturnSchedule_2C_1702_RT sched2C1702RT;
	
	private List<ReturnSchedule_3_1702_RT> sched31702RTList;
	
	private List<ReturnSchedule_4A_1702_RT> sched4A1702RTList;
	private ReturnSchedule_4B_1702_RT sched4B1702RT;
	private List<ReturnSchedule_4C_1702_RT> sched4C1702RTList;
	
	private List<ReturnSchedule_5_1702_RT> sched51702RTList;
	
	private ReturnSchedule_6_1702_RT sched61702RT;
	private List<ReturnSchedule_6A_1702_RT> sched6A1702RTList;
	
	private ReturnSchedule_7_1702_RT sched71702RT;
	private List<ReturnSchedule_7A_1702_RT> sched7A1702RTList;
	
	private List<ReturnSchedule_8_1702_RT> sched81702RTList;
	
	private ReturnSchedule_9_1702_RT sched91702RT;
	private List<ReturnSchedule_9_ND_1702_RT> sched9_ND1702RTList;
	private List<ReturnSchedule_9_NT_1702_RT> sched9_NT1702RTList;
	private List<ReturnSchedule_9_SD_1702_RT> sched9_SD1702RTList;
	
	private ReturnSchedule_10_1702_RT sched101702RT;
	
	private ReturnContributorType_1702 sched111702RTContributorType;
	private List<ReturnContributors_1702> sched111702RTList;
	
	private List<ReturnSchedule_12I_1702_RT> sched12I1702RTList;
	private List<ReturnSchedule_12II_1702_RT> sched12II1702RTList;
	private List<ReturnSchedule_12III_1702_RT> sched12III1702RTList;
	private List<ReturnSchedule_12IV_1702_RT> sched12IV1702RTList;
	
	private ReturnSchedule_13_1702_RT sched131702RT;
	private List<ReturnSchedule_13I_1702_RT> sched13I1702RTList;
	private List<ReturnSchedule_13II_1702_RT> sched13II1702RTList;
	
	public Form1702RTTO() {
		trans1702RT = new ReturnTransaction_1702_RT();
		history1702RT = new ReturnHistory_1702_RT();
		taxpayer1702RT = new ReturnTaxpayer_1702_RT();
		taxagent1702RT = new ReturnTaxAgent_1702_RT();
		sched011702RT = new ReturnSchedule_1_1702_RT();
		sched2A1702RT = new ReturnSchedule_2A_1702_RT();
		sched2B1702RT = new ReturnSchedule_2B_1702_RT();
		sched2C1702RT = new ReturnSchedule_2C_1702_RT();
		sched31702RTList = new ArrayList<ReturnSchedule_3_1702_RT>();
		sched4A1702RTList = new ArrayList<ReturnSchedule_4A_1702_RT>();
		sched4B1702RT = new ReturnSchedule_4B_1702_RT();
		sched4C1702RTList = new ArrayList<ReturnSchedule_4C_1702_RT>();
		sched51702RTList = new ArrayList<ReturnSchedule_5_1702_RT>();
		sched61702RT = new ReturnSchedule_6_1702_RT();
		sched6A1702RTList = new ArrayList<ReturnSchedule_6A_1702_RT>();
		sched71702RT = new ReturnSchedule_7_1702_RT();
		sched7A1702RTList = new ArrayList<ReturnSchedule_7A_1702_RT>();
		sched81702RTList = new ArrayList<ReturnSchedule_8_1702_RT>();
		sched91702RT = new ReturnSchedule_9_1702_RT();
		this.sched9_ND1702RTList = new ArrayList<ReturnSchedule_9_ND_1702_RT>();
		this.sched9_NT1702RTList = new ArrayList<ReturnSchedule_9_NT_1702_RT>();
		this.sched9_SD1702RTList = new ArrayList<ReturnSchedule_9_SD_1702_RT>();
		sched101702RT = new ReturnSchedule_10_1702_RT();
		sched111702RTContributorType = new ReturnContributorType_1702();
		sched111702RTList = new ArrayList<ReturnContributors_1702>();
		sched12I1702RTList = new ArrayList<ReturnSchedule_12I_1702_RT>();
		sched12II1702RTList = new ArrayList<ReturnSchedule_12II_1702_RT>();
		sched12III1702RTList = new ArrayList<ReturnSchedule_12III_1702_RT>();
		sched12IV1702RTList = new ArrayList<ReturnSchedule_12IV_1702_RT>();
		sched131702RT = new ReturnSchedule_13_1702_RT();
		sched13I1702RTList = new ArrayList<ReturnSchedule_13I_1702_RT>();
		sched13II1702RTList = new ArrayList<ReturnSchedule_13II_1702_RT>();		
	}
	
	
	
	public Form1702RTTO(String username,
			RegisteredTaxPayerBean registeredTaxpayer,
			ReturnTransaction_1702_RT trans1702rt,
			ReturnHistory_1702_RT history1702rt,
			ReturnTaxpayer_1702_RT taxpayer1702rt,
			ReturnSchedule_1_1702_RT sched011702rt,
			ReturnSchedule_2A_1702_RT sched2a1702rt,
			ReturnSchedule_2B_1702_RT sched2b1702rt,
			ReturnSchedule_2C_1702_RT sched2c1702rt,
			List<ReturnSchedule_3_1702_RT> sched31702rtList,
			List<ReturnSchedule_4A_1702_RT> sched4a1702rtList,
			ReturnSchedule_4B_1702_RT sched4b1702rt,
			List<ReturnSchedule_4C_1702_RT> sched4c1702rtList,
			List<ReturnSchedule_5_1702_RT> sched51702rtList,
			ReturnSchedule_6_1702_RT sched61702rt,
			List<ReturnSchedule_6A_1702_RT> sched6a1702rtList,
			ReturnSchedule_7_1702_RT sched71702rt,
			List<ReturnSchedule_7A_1702_RT> sched7a1702rtList,
			List<ReturnSchedule_8_1702_RT> sched81702rtList,
			ReturnSchedule_9_1702_RT sched91702rt,
			List<ReturnSchedule_9_ND_1702_RT> sched9_ND1702RTList,
			List<ReturnSchedule_9_NT_1702_RT> sched9_NT1702RTList,
			List<ReturnSchedule_9_SD_1702_RT> sched9_SD1702RTList,
			ReturnSchedule_10_1702_RT sched101702rt,
			ReturnContributorType_1702 sched111702RTContributorType,
			List<ReturnContributors_1702> sched111702rtList,
			List<ReturnSchedule_12I_1702_RT> sched12i1702rtList,
			List<ReturnSchedule_12II_1702_RT> sched12ii1702rtList,
			List<ReturnSchedule_12III_1702_RT> sched12iii1702rtList,
			List<ReturnSchedule_12IV_1702_RT> sched12iv1702rtList,
			ReturnSchedule_13_1702_RT sched131702RT,
			List<ReturnSchedule_13I_1702_RT> sched13i1702rtList,
			List<ReturnSchedule_13II_1702_RT> sched13ii1702rtList) {
		this.username = username;
		this.registeredTaxpayer = registeredTaxpayer;
		this.trans1702RT = trans1702rt;
		this.history1702RT = history1702rt;
		this.taxpayer1702RT = taxpayer1702rt;
		this.sched011702RT = sched011702rt;
		this.sched2A1702RT = sched2a1702rt;
		this.sched2B1702RT = sched2b1702rt;
		this.sched2C1702RT = sched2c1702rt;
		this.sched31702RTList = sched31702rtList;
		this.sched4A1702RTList = sched4a1702rtList;
		this.sched4B1702RT = sched4b1702rt;
		this.sched4C1702RTList = sched4c1702rtList;
		this.sched51702RTList = sched51702rtList;
		this.sched61702RT = sched61702rt;
		this.sched6A1702RTList = sched6a1702rtList;
		this.sched71702RT = sched71702rt;
		this.sched7A1702RTList = sched7a1702rtList;
		this.sched81702RTList = sched81702rtList;
		this.sched91702RT = sched91702rt;
		this.sched9_ND1702RTList = sched9_ND1702RTList;
		this.sched9_NT1702RTList = sched9_NT1702RTList;
		this.sched9_SD1702RTList = sched9_SD1702RTList;
		this.sched101702RT = sched101702rt;
		this.sched111702RTContributorType = sched111702RTContributorType;
		this.sched111702RTList = sched111702rtList;
		this.sched12I1702RTList = sched12i1702rtList;
		this.sched12II1702RTList = sched12ii1702rtList;
		this.sched12III1702RTList = sched12iii1702rtList;
		this.sched12IV1702RTList = sched12iv1702rtList;
		this.sched131702RT = sched131702RT;
		this.sched13I1702RTList = sched13i1702rtList;
		this.sched13II1702RTList = sched13ii1702rtList;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public RegisteredTaxPayerBean getRegisteredTaxpayer() {
		return registeredTaxpayer;
	}
	public void setRegisteredTaxpayer(RegisteredTaxPayerBean registeredTaxpayer) {
		this.registeredTaxpayer = registeredTaxpayer;
	}
	public ReturnTransaction_1702_RT getTrans1702RT() {
		return trans1702RT;
	}
	public void setTrans1702RT(ReturnTransaction_1702_RT trans1702rt) {
		trans1702RT = trans1702rt;
	}
	public ReturnHistory_1702_RT getHistory1702RT() {
		return history1702RT;
	}
	public void setHistory1702RT(ReturnHistory_1702_RT history1702rt) {
		history1702RT = history1702rt;
	}
	public ReturnTaxpayer_1702_RT getTaxpayer1702RT() {
		return taxpayer1702RT;
	}
	public void setTaxpayer1702RT(ReturnTaxpayer_1702_RT taxpayer1702rt) {
		taxpayer1702RT = taxpayer1702rt;
	}
	public ReturnSchedule_1_1702_RT getSched011702RT() {
		return sched011702RT;
	}
	public void setSched011702RT(ReturnSchedule_1_1702_RT sched011702rt) {
		sched011702RT = sched011702rt;
	}
	public ReturnSchedule_2A_1702_RT getSched2A1702RT() {
		return sched2A1702RT;
	}
	public void setSched2A1702RT(ReturnSchedule_2A_1702_RT sched2a1702rt) {
		sched2A1702RT = sched2a1702rt;
	}
	public ReturnSchedule_2B_1702_RT getSched2B1702RT() {
		return sched2B1702RT;
	}
	public void setSched2B1702RT(ReturnSchedule_2B_1702_RT sched2b1702rt) {
		sched2B1702RT = sched2b1702rt;
	}
	public ReturnSchedule_2C_1702_RT getSched2C1702RT() {
		return sched2C1702RT;
	}
	public void setSched2C1702RT(ReturnSchedule_2C_1702_RT sched2c1702rt) {
		sched2C1702RT = sched2c1702rt;
	}
	public List<ReturnSchedule_3_1702_RT> getSched31702RTList() {
		return sched31702RTList;
	}
	public void setSched31702RTList(List<ReturnSchedule_3_1702_RT> sched31702rtList) {
		sched31702RTList = sched31702rtList;
	}
	public List<ReturnSchedule_4A_1702_RT> getSched4A1702RTList() {
		return sched4A1702RTList;
	}
	public void setSched4A1702RTList(
			List<ReturnSchedule_4A_1702_RT> sched4a1702rtList) {
		sched4A1702RTList = sched4a1702rtList;
	}
	public ReturnSchedule_4B_1702_RT getSched4B1702RT() {
		return sched4B1702RT;
	}
	public void setSched4B1702RT(ReturnSchedule_4B_1702_RT sched4b1702rt) {
		sched4B1702RT = sched4b1702rt;
	}
	public List<ReturnSchedule_4C_1702_RT> getSched4C1702RTList() {
		return sched4C1702RTList;
	}
	public void setSched4C1702RTList(
			List<ReturnSchedule_4C_1702_RT> sched4c1702rtList) {
		sched4C1702RTList = sched4c1702rtList;
	}
	public List<ReturnSchedule_5_1702_RT> getSched51702RTList() {
		return sched51702RTList;
	}
	public void setSched51702RTList(List<ReturnSchedule_5_1702_RT> sched51702rtList) {
		sched51702RTList = sched51702rtList;
	}
	public ReturnSchedule_6_1702_RT getSched61702RT() {
		return sched61702RT;
	}
	public void setSched61702RT(ReturnSchedule_6_1702_RT sched61702rt) {
		sched61702RT = sched61702rt;
	}
	public List<ReturnSchedule_6A_1702_RT> getSched6A1702RTList() {
		return sched6A1702RTList;
	}
	public void setSched6A1702RTList(
			List<ReturnSchedule_6A_1702_RT> sched6a1702rtList) {
		sched6A1702RTList = sched6a1702rtList;
	}
	public ReturnSchedule_7_1702_RT getSched71702RT() {
		return sched71702RT;
	}
	public void setSched71702RT(ReturnSchedule_7_1702_RT sched71702rt) {
		sched71702RT = sched71702rt;
	}
	public List<ReturnSchedule_7A_1702_RT> getSched7A1702RTList() {
		return sched7A1702RTList;
	}
	public void setSched7A1702RTList(
			List<ReturnSchedule_7A_1702_RT> sched7a1702rtList) {
		sched7A1702RTList = sched7a1702rtList;
	}
	public List<ReturnSchedule_8_1702_RT> getSched81702RTList() {
		return sched81702RTList;
	}
	public void setSched81702RTList(
			List<ReturnSchedule_8_1702_RT> sched81702RTList) {
		this.sched81702RTList = sched81702RTList;
	}
	public ReturnSchedule_9_1702_RT getSched91702RT() {
		return sched91702RT;
	}
	public void setSched91702RT(ReturnSchedule_9_1702_RT sched91702rt) {
		sched91702RT = sched91702rt;
	}
	public List<ReturnSchedule_9_ND_1702_RT> getSched9_ND1702RTList() {
		return sched9_ND1702RTList;
	}
	public void setSched9_ND1702RTList(
			List<ReturnSchedule_9_ND_1702_RT> sched9_ND1702RTList) {
		this.sched9_ND1702RTList = sched9_ND1702RTList;
	}
	public List<ReturnSchedule_9_NT_1702_RT> getSched9_NT1702RTList() {
		return sched9_NT1702RTList;
	}
	public void setSched9_NT1702RTList(
			List<ReturnSchedule_9_NT_1702_RT> sched9_NT1702RTList) {
		this.sched9_NT1702RTList = sched9_NT1702RTList;
	}
	public List<ReturnSchedule_9_SD_1702_RT> getSched9_SD1702RTList() {
		return sched9_SD1702RTList;
	}
	public void setSched9_SD1702RTList(
			List<ReturnSchedule_9_SD_1702_RT> sched9_SD1702RTList) {
		this.sched9_SD1702RTList = sched9_SD1702RTList;
	}
	public ReturnSchedule_10_1702_RT getSched101702RT() {
		return sched101702RT;
	}
	public void setSched101702RT(ReturnSchedule_10_1702_RT sched101702rt) {
		sched101702RT = sched101702rt;
	}
	public List<ReturnContributors_1702> getSched111702RTList() {
		return sched111702RTList;
	}
	public void setSched111702RTList(
			List<ReturnContributors_1702> sched111702rtList) {
		sched111702RTList = sched111702rtList;
	}
	public List<ReturnSchedule_12I_1702_RT> getSched12I1702RTList() {
		return sched12I1702RTList;
	}
	public void setSched12I1702RTList(
			List<ReturnSchedule_12I_1702_RT> sched12I1702rtList) {
		sched12I1702RTList = sched12I1702rtList;
	}
	public List<ReturnSchedule_12II_1702_RT> getSched12II1702RTList() {
		return sched12II1702RTList;
	}
	public void setSched12II1702RTList(
			List<ReturnSchedule_12II_1702_RT> sched12ii1702rtList) {
		sched12II1702RTList = sched12ii1702rtList;
	}
	public List<ReturnSchedule_12III_1702_RT> getSched12III1702RTList() {
		return sched12III1702RTList;
	}
	public void setSched12III1702RTList(
			List<ReturnSchedule_12III_1702_RT> sched12iii1702rtList) {
		sched12III1702RTList = sched12iii1702rtList;
	}
	public List<ReturnSchedule_12IV_1702_RT> getSched12IV1702RTList() {
		return sched12IV1702RTList;
	}
	public void setSched12IV1702RTList(
			List<ReturnSchedule_12IV_1702_RT> sched12iv1702rtList) {
		sched12IV1702RTList = sched12iv1702rtList;
	}
	public List<ReturnSchedule_13I_1702_RT> getSched13I1702RTList() {
		return sched13I1702RTList;
	}
	public void setSched13I1702RTList(
			List<ReturnSchedule_13I_1702_RT> sched13i1702rtList) {
		sched13I1702RTList = sched13i1702rtList;
	}
	public List<ReturnSchedule_13II_1702_RT> getSched13II1702RTList() {
		return sched13II1702RTList;
	}
	public void setSched13II1702RTList(
			List<ReturnSchedule_13II_1702_RT> sched13ii1702rtList) {
		sched13II1702RTList = sched13ii1702rtList;
	}

	public ReturnSchedule_13_1702_RT getSched131702RT() {
		return sched131702RT;
	}

	public void setSched131702RT(ReturnSchedule_13_1702_RT sched131702rt) {
		sched131702RT = sched131702rt;
	}



	public Map<String, Integer> getIteratingTableMap() {
		return iteratingTableMap;
	}



	public void setIteratingTableMap(Map<String, Integer> iteratingTableMap) {
		this.iteratingTableMap = iteratingTableMap;
	}



	public ReturnTaxAgent_1702_RT getTaxagent1702RT() {
		return taxagent1702RT;
	}



	public void setTaxagent1702RT(ReturnTaxAgent_1702_RT taxagent1702rt) {
		taxagent1702RT = taxagent1702rt;
	}



	public ReturnContributorType_1702 getSched111702RTContributorType() {
		return sched111702RTContributorType;
	}



	public void setSched111702RTContributorType(
			ReturnContributorType_1702 sched111702rtContributorType) {
		sched111702RTContributorType = sched111702rtContributorType;
	}
}
