/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: PaymentGatewayException.java
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
public class PaymentGatewayException extends RuntimeException{
    
    public PaymentGatewayException() {
    }

    public PaymentGatewayException(String message) {
        super(message);
    }

    public PaymentGatewayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentGatewayException(Throwable cause) {
        super(cause);
    }

    public PaymentGatewayException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
