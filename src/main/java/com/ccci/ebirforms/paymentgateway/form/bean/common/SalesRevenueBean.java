package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesRevenueBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private long taxWthldGoods;
    private long taxWthldServices;
    private long taxWthldLease;
    private long taxWthldTotal;
    private long salesReturns;
    private long netSalesSched1;

    public SalesRevenueBean() {

    }

    public SalesRevenueBean(long taxWthldGoods,
            long taxWthldServices,
            long taxWthldLease,
            long taxWthldTotal,
            long salesReturns,
            long netSalesSched1) {

        this.taxWthldGoods = taxWthldGoods;
        this.taxWthldServices = taxWthldServices;
        this.taxWthldLease = taxWthldLease;
        this.taxWthldTotal = taxWthldTotal;
        this.salesReturns = salesReturns;
        this.netSalesSched1 = netSalesSched1;

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getTaxWthldGoods() {
        return taxWthldGoods;
    }

    public void setTaxWthldGoods(long taxWthldGoods) {
        this.taxWthldGoods = taxWthldGoods;
    }

    public long getTaxWthldServices() {
        return taxWthldServices;
    }

    public void setTaxWthldServices(long taxWthldServices) {
        this.taxWthldServices = taxWthldServices;
    }

    public long getTaxWthldLease() {
        return taxWthldLease;
    }

    public void setTaxWthldLease(long taxWthldLease) {
        this.taxWthldLease = taxWthldLease;
    }

    public long getTaxWthldTotal() {
        return taxWthldTotal;
    }

    public void setTaxWthldTotal(long taxWthldTotal) {
        this.taxWthldTotal = taxWthldTotal;
    }

    public long getSalesReturns() {
        return salesReturns;
    }

    public void setSalesReturns(long salesReturns) {
        this.salesReturns = salesReturns;
    }

    public long getNetSalesSched1() {
        return netSalesSched1;
    }

    public void setNetSalesSched1(long netSalesSched1) {
        this.netSalesSched1 = netSalesSched1;
    }

}
