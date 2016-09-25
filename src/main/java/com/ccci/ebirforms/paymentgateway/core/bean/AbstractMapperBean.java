/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 24, 2016
 *  File: AbstractMapperBean.java
 *  Package: com.ccci.ebirforms.paymentgateway.core.bean
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
public class AbstractMapperBean implements Serializable {

    private HashMap<String, String> params;

    public String getValue(String key) {

        return (String) getParams().get(key);
    }
    
    
    public Date getDate(String key) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        try {
            date = format.parse(getValue(key));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
    
    public boolean getBoolean(String key){        
        return Boolean.parseBoolean(getValue(key));
    }
    
    public long getLong(String key){       
        return Long.parseLong(getValue(key));
    }
    
     public int getInteger(String key){       
        return Integer.parseInt(getValue(key));
    }
    
    public String getTin(String tin1, String tin2, String tin3){
               
        return appendParams(tin1, tin2, tin3);
    }
    
    public String appendParams (String ... keys){
        StringBuilder outString = new StringBuilder();
        for(String key: keys){
            outString.append(getValue(key));
        }
        return outString.toString();
    }
    
    public Date getReturnPeriod(String mm, String yy){
        
        int month = Integer.parseInt(getValue(mm));
        String year = "20" + getValue(yy);
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
        Date returnPeriod = cal.getTime();
        
        return returnPeriod;

        
    }

    /**
     * @return the params
     */
    public HashMap<String, String> getParams() {
        return params;
    }

    /**
     * @param params the params to set
     */
    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

}
