/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 26, 2015
 *  File: ResourceManager.java
 *  Package: ph.gov.bir.edst.core.resources
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.resources;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author arielbalita
 */
@Named("resourceManager")
@Stateless
public class ResourceManager {
    public String getMessage(final Enum value) {        
        return (value == null) ? "" : getResourceBundle(FacesContext.getCurrentInstance()).getString(value.name());
    }
    
    public String getMessage(final String messageKey) {
        if (messageKey == null) {
            return "";
        }
        
        final ResourceBundle resourceBundle = getResourceBundle(FacesContext.getCurrentInstance());
        
        if (resourceBundle == null) {
            return "";
        }
        
        try {
            return resourceBundle.getString(messageKey);
            
        } catch (MissingResourceException e) {
            return messageKey;
        }
    }
    
    private ResourceBundle getResourceBundle(final FacesContext facesContext) {
        return facesContext.getApplication().getResourceBundle(facesContext, "messages");
    }
}
