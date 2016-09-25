/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ccci.ebirforms.paymentgateway.form.bean.common;

import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTWSBean;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author abalita <ariel.a.balita@gmail.com>
 */
@XmlRootElement(name="formWrapper")
@XmlAccessorType(XmlAccessType.FIELD)
public class FormWSBeanWrapper implements Serializable{

    private String formCode;
    private String isOffline;

    private Form1702RTWSBean form1702RTWSBean;

    /**
     * @return the formCode
     */
    public String getFormCode() {
        return formCode;
    }

    /**
     * @param formCode the formCode to set
     */
    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    /**
     * @return the isOffline
     */
    public String getIsOffline() {
        return isOffline;
    }

    /**
     * @param isOffline the isOffline to set
     */
    public void setIsOffline(String isOffline) {
        this.isOffline = isOffline;
    }

    /**
     * @return the form1702RTWSBean
     */
    public Form1702RTWSBean getForm1702RTWSBean() {
        return form1702RTWSBean;
    }

    /**
     * @param form1702RTWSBean the form1702RTWSBean to set
     */
    public void setForm1702RTWSBean(Form1702RTWSBean form1702RTWSBean) {
        this.form1702RTWSBean = form1702RTWSBean;
    }

}
