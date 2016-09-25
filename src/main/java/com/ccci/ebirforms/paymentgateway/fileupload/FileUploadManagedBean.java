/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 16, 2016
 *  File: FileUploadManagedBean.java
 *  Package: com.ccci.ebirforms.paymentgateway.fileupload
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.fileupload;

import com.ccci.ebirforms.paymentgateway.core.bean.AbstractBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ComputationOfTaxBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.ExternalAuditorAccreditedTaxAgentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.SalesRevenueBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxCreditsPaymentsBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxReliefAvailmentBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TaxpayerBean;
import com.ccci.ebirforms.paymentgateway.form.bean.common.TotalTaxPayableBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTBeanBuilder;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTTO;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTWSBean;
import com.ccci.ebirforms.paymentgateway.form.bean.form1702RT.Form1702RTWsBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
@ManagedBean(name =  "fileUpload")
@SessionScoped
public class FileUploadManagedBean extends AbstractBean{

    private final String destination = "C:\\tmp\\";
    private Form1702RTTO formTO;
    private Form1702RTBean form1702RTBean;

    /**
     * Creates a new instance of FileUpload
     */
    public FileUploadManagedBean() {
    }

    public void handleFileUpload(FileUploadEvent event) throws IOException {
            String file = "";
        try {
            file = copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            HashMap params = FileParserBean.parse(file, "frm1702RT");
            Form1702RTMapperBean mapper = new Form1702RTMapperBean();
            mapper.setParams(params);
            form1702RTBean = (Form1702RTBean)mapper.build();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) { 
            Logger.getLogger(FileUploadManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        

//        setInfoMessage(destination, event.getFile().getFileName() + " is uploaded.");
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        setSessionAttribute("filename", file);
    }

    public String copyFile(String fileName, InputStream in) {
        File file = new File(destination + fileName);
        try {

            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(file);

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return file.getAbsolutePath();
    }        

    /**
     * @return the formTO
     */
    public Form1702RTTO getFormTO() {
        return formTO;
    }

    /**
     * @param formTO the formTO to set
     */
    public void setFormTO(Form1702RTTO formTO) {
        this.formTO = formTO;
    }
    
    public String viewForm(){        
        return "/forms/1702RT/1702RT_print.xhtml?faces-redirect=true";
    }
    
    public String proceed(){        
        return "fileDetails.xhtml?faces-redirect=true";
    }

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
}
