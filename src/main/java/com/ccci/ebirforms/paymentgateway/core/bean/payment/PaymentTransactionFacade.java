/*
 * **********************************************************
 * 
 *  Copyright (c) 2016
 * 
 *  Project Name: Tax Return Payment Gateway 
 *  Developed by: Ariel A. Balita
 *  Date: Sep 15, 2016
 *  File: PaymentTransactionFacade.java
 *  Package: com.ccci.ebirforms.paymentgateway.core.bean.payment
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.bean.payment;

import com.ccci.ebirforms.paymentgateway.dao.PaymentTransaction;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ariel.balita <ariel.a.balita@gmail.com>
 */
@Stateless
public class PaymentTransactionFacade extends AbstractFacade<PaymentTransaction> {

    @PersistenceContext(unitName = "com.ccci.ebirforms_eBIRFormPaymentGateway_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaymentTransactionFacade() {
        super(PaymentTransaction.class);
    }
    
}
