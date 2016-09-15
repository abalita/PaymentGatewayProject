/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: eDSTException.java
 *  Package: ph.gov.bir.edst.exception
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.exception;

/**
 *
 * @author arielbalita
 */
public class eDSTException extends RuntimeException{
    
    public eDSTException() {
    }

    public eDSTException(String message) {
        super(message);
    }

    public eDSTException(String message, Throwable cause) {
        super(message, cause);
    }

    public eDSTException(Throwable cause) {
        super(cause);
    }

    public eDSTException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
