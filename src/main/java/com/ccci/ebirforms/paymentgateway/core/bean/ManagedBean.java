/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: ManagedBean.java
 *  Package: ph.gov.bir.edst.core.bean
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.bean;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import com.ccci.ebirforms.paymentgateway.core.model.AbstractModel;

/**
 *
 * @author arielbalita
 * @param <M>
 */
public class ManagedBean<M extends AbstractModel> extends AbstractBean{
    
    private static final Logger LOGGER = Logger.getLogger(ManagedBean.class.getName());
    private M model; 
    
    
    @PostConstruct
    public void init() {
        reset();
    }
    
    public void reset() {
        //
        // to be overriden
        //        
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
    
}
