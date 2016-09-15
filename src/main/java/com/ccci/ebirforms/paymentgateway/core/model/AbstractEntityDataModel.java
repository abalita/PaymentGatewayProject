/*
 * **********************************************************
 * 
 *  Copyright (c) 2015
 * 
 *  Project Name: BIR eDST - electronic Document Stamp System 
 *  Developed by: Ariel A. Balita
 *  Date: Oct 22, 2015
 *  File: AbstractEntityDataModel.java
 *  Package: ph.gov.bir.edst.core.model
 *  Version: 1.0
 * 
 *  REVISION HISTORY
 *  DATE         MODIFIED BY       REMARKS     VERSION
 * 
 * ************************************************************
 */
package com.ccci.ebirforms.paymentgateway.core.model;

import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author arielbalita
 */
public class AbstractEntityDataModel <M extends AbstractEntityModel> 
                extends ListDataModel<M> 
                implements SelectableDataModel<M> {
    
    public AbstractEntityDataModel() {
        
    }
    
    public AbstractEntityDataModel(final List<M> data) {
        super(data);
    }

    @Override
    public M getRowData(final String rowKey) {
        final List<M> entityModels = (List<M>) getWrappedData();
        
        for (final M entityModel : entityModels) {
            if (String.valueOf(entityModel.getId()).equals(rowKey)) {
                return entityModel;
            }
        }
        
        return null;
    }

    @Override
    public Object getRowKey(final M entityModel) {
        return entityModel.getId();
    }
    
}
