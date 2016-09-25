/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 24, 2016
 *  File: FileParserBean.java
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
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
public class FileParserBean extends AbstractBean{
    
    public static HashMap parse(String file, String formType ){
        
        HashMap params = new HashMap();
        try {
            String theString2 = IOUtils.toString(new FileInputStream(file), "UTF-8");
            String newString = theString2.replace("<?xml version='1.0'?>", "")
                    .replace("<div>", "")
                    .replace(formType + ":", "")
                    .replace("All Rights Reserved BIR 2014.", "")
                    .replace(" ", "");
            String[] elements = newString.split("</div>");

            for (String e : elements) {
                String[] parameters = e.split("=");
                String key = parameters[0].trim();
                try {
                    params.put(key, parameters[1].replace(key, ""));
                    System.out.println("<input id='" + key + "' value='" +  parameters[1].replace(key, "") + "' />" );
                } catch (ArrayIndexOutOfBoundsException ea) {
                    params.put(parameters[0], "");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return params;
    }
    
}
