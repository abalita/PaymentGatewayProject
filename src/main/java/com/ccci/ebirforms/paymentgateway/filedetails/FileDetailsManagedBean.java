/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 25, 2016
 *  File: FileDetailsManagedBean.java
 *  Package: com.ccci.ebirforms.paymentgateway.filedetails
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.filedetails;

import com.ccci.ebirforms.paymentgateway.core.bean.AbstractBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
@Named(value = "fileDetails")
@SessionScoped
public class FileDetailsManagedBean extends AbstractBean{

    private String filename;
    /**
     * Creates a new instance of FileDetailsManagedBean
     */
    public FileDetailsManagedBean() {
    }
    
    @PostConstruct
    public void init(){
        filename = (String)getSessionAttribute("filename");
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
}
