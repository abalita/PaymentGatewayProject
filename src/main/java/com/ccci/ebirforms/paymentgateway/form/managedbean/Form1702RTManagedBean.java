/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 23, 2016
 *  File: Form1702RTManagedBean.java
 *  Package: com.ccci.ebirforms.paymentgateway.form.managedbean
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.form.managedbean;

import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.TimeZone;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
@Named(value = "form1702RT")
@SessionScoped
public class Form1702RTManagedBean implements Serializable {

    /**
     * Creates a new instance of Form1702RTManagedBean
     */
    public Form1702RTManagedBean() {
    }

    private Form1702RTBean form1702RTBean;

    /**
     * @return the form1702RTBean
     */
    public Form1702RTBean getForm1702RTBean() {
        return form1702RTBean;
    }

    /**
     * @param form1702RTBean the form1702RTBean to set
     */
    public void setForm1702RTBean(Form1702RTBean form1702RTBean) {
        this.form1702RTBean = form1702RTBean;
    }

    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }
}
