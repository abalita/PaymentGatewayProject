package com.ccci.ebirforms.paymentgateway.core.bean.payment;

import com.ccci.ebirforms.paymentgateway.dao.PaymentTransaction;
import com.ccci.ebirforms.paymentgateway.core.bean.payment.util.JsfUtil;
import com.ccci.ebirforms.paymentgateway.core.bean.payment.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("paymentTransactionController")
@SessionScoped
public class PaymentTransactionController implements Serializable {

    @EJB
    private com.ccci.ebirforms.paymentgateway.core.bean.payment.PaymentTransactionFacade ejbFacade;
    private List<PaymentTransaction> items = null;
    private PaymentTransaction selected;

    public PaymentTransactionController() {
    }

    public PaymentTransaction getSelected() {
        return selected;
    }

    public void setSelected(PaymentTransaction selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private PaymentTransactionFacade getFacade() {
        return ejbFacade;
    }

    public PaymentTransaction prepareCreate() {
        selected = new PaymentTransaction();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("PaymentTransactionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("PaymentTransactionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("PaymentTransactionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<PaymentTransaction> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public PaymentTransaction getPaymentTransaction(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<PaymentTransaction> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<PaymentTransaction> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = PaymentTransaction.class)
    public static class PaymentTransactionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PaymentTransactionController controller = (PaymentTransactionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "paymentTransactionController");
            return controller.getPaymentTransaction(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof PaymentTransaction) {
                PaymentTransaction o = (PaymentTransaction) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), PaymentTransaction.class.getName()});
                return null;
            }
        }

    }

}
