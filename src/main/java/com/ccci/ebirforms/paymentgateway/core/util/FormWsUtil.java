/**
 * 
 */
package com.ccci.ebirforms.paymentgateway.core.util;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

/**
 * @author sardenj
 *
 */
public class FormWsUtil {

	public static boolean isNotEmptyOrNull(String val) {
		if(val != null && StringUtils.isNotEmpty(val)) {
			return true;
		}
		return false;
	}
	
	public static double longToDouble(long val) {
		return (double) val;
	}
	
	public static float longToFloat(long val) {
		return (float) val;
	}
	
	
	public static double intToDouble(int val) {
		return (double) val;
	}
	
	public static double floatToDouble(float val){
		return (double) val;
	}
	
	public static Date xmlDate(XMLGregorianCalendar calendar) {
		if(calendar == null) {
			return null;
		}
		
		return calendar.toGregorianCalendar().getTime();
	}
}
