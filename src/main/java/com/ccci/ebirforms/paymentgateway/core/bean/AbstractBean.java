/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: AbstractBean.java
 *  Package: ph.gov.bir.edst.core
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.bean;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.management.MBeanException;
import com.ccci.ebirforms.paymentgateway.core.exception.eDSTException;

/**
 *
 * @author arielbalita
 */
public class AbstractBean implements Serializable{
    
    private static final Logger LOGGER = Logger.getLogger(AbstractBean.class.getName());
    
     protected String getErrorCode(Throwable throwable) {
        LOGGER.log(Level.FINE, getStackTrace(throwable));

        String errorDetail = null;
        String errorCode = null;
        
        if (throwable instanceof MBeanException) {
            LOGGER.log(Level.FINE, "MBeanException Exception: {0}", throwable.getClass().getName());
            
            throwable = ((MBeanException) throwable).getTargetException();
            
        } else {
            LOGGER.log(Level.FINE, "Generic Exception: {0}", throwable.getClass().getName());
            
            for ( ; throwable.getCause() != null; throwable = throwable.getCause()) {                
                if (throwable instanceof SQLException) {
                    LOGGER.log(Level.FINE, "Database Exception: {0}", throwable.getClass().getName());
                    
                    errorDetail = throwable.getMessage();
                    
                    if (errorDetail != null) {
                        if (errorDetail.contains("duplicate key value")) {
                            errorCode = "nonUniqueRecordError";
                            
                        } else if (errorDetail.startsWith("DELETE")) {
                            errorCode = "recordInUseError";
                        }
                    }
                    
                    break;
                }
            }
        }
        
        if (throwable instanceof eDSTException) {
            errorCode = throwable.getMessage();
        }
        
        errorCode = (errorCode == null) ? throwable.getClass().getSimpleName() : errorCode;              
        LOGGER.log(Level.FINE, "errorCode: {0}, errorDetail: {1}", new Object[] {errorCode, errorDetail});                
        
        return errorCode;
    } 
    
    protected void setErrorMessage(final Throwable throwable) {
        setErrorMessage(getErrorCode(throwable));
    }
    
    protected void setErrorMessage(final String errorCode) {
        setErrorMessage(errorCode, null);
    }

    public String getResourceBundleMessage(final Enum messageEnum) {
        return getResourceBundle(FacesContext.getCurrentInstance()).getString(messageEnum.name());
    }
    
    public String getResourceBundleMessage(final String messageKey) {
        return getResourceBundle(FacesContext.getCurrentInstance()).getString(messageKey);
    }
    
    private ResourceBundle getResourceBundle(final FacesContext facesContext) {
        return facesContext.getApplication().getResourceBundle(facesContext, "messages");
    }
    
    protected void setErrorMessage(final String errorCode, final String errorDetails) {
        if (errorCode != null) {
            final FacesContext facesContext = FacesContext.getCurrentInstance();
            final ResourceBundle messages = getResourceBundle(facesContext);

            try {
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, messages.getString(errorCode), errorDetails));

            } catch (MissingResourceException e) {
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, errorCode, errorDetails));
            }                    
        }
    }       
    
    protected void setInfoMessage(final String infoCode, final String infoDetails) {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        final ResourceBundle messages = getResourceBundle(facesContext);

        try {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, messages.getString(infoCode), infoDetails));
            
        } catch (MissingResourceException e) {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, infoCode, infoDetails));            
        }                
    }
    
    protected String getStackTrace(final Throwable throwable) {
        final StringWriter writer = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(writer);

        throwable.printStackTrace(printWriter);

        return writer.toString();
    }
    
    protected String getRequestParameter(final String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
    }
    
    protected Object getSessionAttribute(final String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
    }
    
    protected void setSessionAttribute(final String key, final Object value) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
    }
    
}
