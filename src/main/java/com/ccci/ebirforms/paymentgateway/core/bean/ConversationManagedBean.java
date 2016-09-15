/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: ConversationManagedBean.java
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
import javax.enterprise.context.Conversation;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import com.ccci.ebirforms.paymentgateway.core.model.AbstractModel;

/**
 *
 * @author arielbalita
 */
public class ConversationManagedBean<M extends AbstractModel> extends ManagedBean<M>  {
    
    private static final Logger LOGGER = Logger.getLogger(ConversationManagedBean.class.getName());
    
       @Inject
    private Conversation conversation;
    
    public void beginConversation() {
        if (!FacesContext.getCurrentInstance().isPostback() && conversation.isTransient()) {
            conversation.begin();
        }
    }

    public void endConversation() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
    }
    
    public Conversation getConversation() {
        return conversation;
    }
}
