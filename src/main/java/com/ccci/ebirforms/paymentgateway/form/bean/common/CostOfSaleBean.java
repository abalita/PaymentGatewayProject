package com.ccci.ebirforms.paymentgateway.form.bean.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CostOfSaleBean implements Serializable {

    private static final long serialVersionUID = 1L;
    // Trading
    private long goodsInvBeg;
    private long purGoods;
    private long goodsAvail;
    private long goodsInvEnd;
    private long costSales;

    // Manufacturing
    private long directMatsBeg;
    private long purDirectMats;
    private long matsAvail;
    private long directMatsEnd;
    private long rawMats;
    private long directLabor;
    private long manufacturingOverhead;
    private long totalManufacturingCost;
    private long workInProgressBeg;
    private long winProgressEnd;
    private long costGoodsManufactured;
    private long finishedGoodsBeg;
    private long finishedGoodsEnd;
    private long totalCostGoodsManufacturedAndSold;

    // Services
    private long salaries;
    private long materials;
    private long sched2CDepreciation;
    private long sched2CRental;
    private long outsideServ;
    private long others;
    private long costService;

    // Total
    private long totalCostSalesAndServices;

    public CostOfSaleBean() {
    }

    public CostOfSaleBean(
            long goodsInvBeg,
            long purGoods,
            long goodsAvail,
            long goodsInvEnd,
            long costSales,
            long directMatsBeg,
            long purDirectMats,
            long matsAvail,
            long directMatsEnd,
            long rawMats,
            long directLabor,
            long manufacturingOverhead,
            long totalManufacturingCost,
            long workInProgressBeg,
            long winProgressEnd,
            long costGoodsManufactured,
            long finishedGoodsBeg,
            long finishedGoodsEnd,
            long totalCostGoodsManufacturedAndSold,
            long salaries,
            long materials,
            long sched2CDepreciation,
            long sched2CRental,
            long outsideServ,
            long others,
            long costService,
            long totalCostSalesAndServices
    ) {
        this.goodsInvBeg = goodsInvBeg;
        this.purGoods = purGoods;
        this.goodsAvail = goodsAvail;
        this.goodsInvEnd = goodsInvEnd;
        this.costSales = costSales;
        this.directMatsBeg = directMatsBeg;
        this.purDirectMats = purDirectMats;
        this.matsAvail = matsAvail;
        this.directMatsEnd = directMatsEnd;
        this.rawMats = rawMats;
        this.directLabor = directLabor;
        this.manufacturingOverhead = manufacturingOverhead;
        this.totalManufacturingCost = totalManufacturingCost;
        this.workInProgressBeg = workInProgressBeg;
        this.winProgressEnd = winProgressEnd;
        this.costGoodsManufactured = costGoodsManufactured;
        this.finishedGoodsBeg = finishedGoodsBeg;
        this.finishedGoodsEnd = finishedGoodsEnd;
        this.totalCostGoodsManufacturedAndSold = totalCostGoodsManufacturedAndSold;
        this.salaries = salaries;
        this.materials = materials;
        this.sched2CDepreciation = sched2CDepreciation;
        this.sched2CRental = sched2CRental;
        this.outsideServ = outsideServ;
        this.others = others;
        this.costService = costService;
        this.totalCostSalesAndServices = totalCostSalesAndServices;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getGoodsInvBeg() {
        return goodsInvBeg;
    }

    public void setGoodsInvBeg(long goodsInvBeg) {
        this.goodsInvBeg = goodsInvBeg;
    }

    public long getPurGoods() {
        return purGoods;
    }

    public void setPurGoods(long purGoods) {
        this.purGoods = purGoods;
    }

    public long getGoodsAvail() {
        return goodsAvail;
    }

    public void setGoodsAvail(long goodsAvail) {
        this.goodsAvail = goodsAvail;
    }

    public long getGoodsInvEnd() {
        return goodsInvEnd;
    }

    public void setGoodsInvEnd(long goodsInvEnd) {
        this.goodsInvEnd = goodsInvEnd;
    }

    public long getCostSales() {
        return costSales;
    }

    public void setCostSales(long costSales) {
        this.costSales = costSales;
    }

    public long getDirectMatsBeg() {
        return directMatsBeg;
    }

    public void setDirectMatsBeg(long directMatsBeg) {
        this.directMatsBeg = directMatsBeg;
    }

    public long getPurDirectMats() {
        return purDirectMats;
    }

    public void setPurDirectMats(long purDirectMats) {
        this.purDirectMats = purDirectMats;
    }

    public long getMatsAvail() {
        return matsAvail;
    }

    public void setMatsAvail(long matsAvail) {
        this.matsAvail = matsAvail;
    }

    public long getDirectMatsEnd() {
        return directMatsEnd;
    }

    public void setDirectMatsEnd(long directMatsEnd) {
        this.directMatsEnd = directMatsEnd;
    }

    public long getRawMats() {
        return rawMats;
    }

    public void setRawMats(long rawMats) {
        this.rawMats = rawMats;
    }

    public long getDirectLabor() {
        return directLabor;
    }

    public void setDirectLabor(long directLabor) {
        this.directLabor = directLabor;
    }

    public long getManufacturingOverhead() {
        return manufacturingOverhead;
    }

    public void setManufacturingOverhead(long manufacturingOverhead) {
        this.manufacturingOverhead = manufacturingOverhead;
    }

    public long getTotalManufacturingCost() {
        return totalManufacturingCost;
    }

    public void setTotalManufacturingCost(long totalManufacturingCost) {
        this.totalManufacturingCost = totalManufacturingCost;
    }

    public long getWorkInProgressBeg() {
        return workInProgressBeg;
    }

    public void setWorkInProgressBeg(long workInProgressBeg) {
        this.workInProgressBeg = workInProgressBeg;
    }

    public long getWinProgressEnd() {
        return winProgressEnd;
    }

    public void setWinProgressEnd(long winProgressEnd) {
        this.winProgressEnd = winProgressEnd;
    }

    public long getCostGoodsManufactured() {
        return costGoodsManufactured;
    }

    public void setCostGoodsManufactured(long costGoodsManufactured) {
        this.costGoodsManufactured = costGoodsManufactured;
    }

    public long getFinishedGoodsBeg() {
        return finishedGoodsBeg;
    }

    public void setFinishedGoodsBeg(long finishedGoodsBeg) {
        this.finishedGoodsBeg = finishedGoodsBeg;
    }

    public long getFinishedGoodsEnd() {
        return finishedGoodsEnd;
    }

    public void setFinishedGoodsEnd(long finishedGoodsEnd) {
        this.finishedGoodsEnd = finishedGoodsEnd;
    }

    public long getTotalCostGoodsManufacturedAndSold() {
        return totalCostGoodsManufacturedAndSold;
    }

    public void setTotalCostGoodsManufacturedAndSold(
            long totalCostGoodsManufacturedAndSold) {
        this.totalCostGoodsManufacturedAndSold = totalCostGoodsManufacturedAndSold;
    }

    public long getSalaries() {
        return salaries;
    }

    public void setSalaries(long salaries) {
        this.salaries = salaries;
    }

    public long getMaterials() {
        return materials;
    }

    public void setMaterials(long materials) {
        this.materials = materials;
    }

    public long getSched2CDepreciation() {
        return sched2CDepreciation;
    }

    public void setSched2CDepreciation(long sched2cDepreciation) {
        sched2CDepreciation = sched2cDepreciation;
    }

    public long getSched2CRental() {
        return sched2CRental;
    }

    public void setSched2CRental(long sched2cRental) {
        sched2CRental = sched2cRental;
    }

    public long getOutsideServ() {
        return outsideServ;
    }

    public void setOutsideServ(long outsideServ) {
        this.outsideServ = outsideServ;
    }

    public long getOthers() {
        return others;
    }

    public void setOthers(long others) {
        this.others = others;
    }

    public long getCostService() {
        return costService;
    }

    public void setCostService(long costService) {
        this.costService = costService;
    }

    public long getTotalCostSalesAndServices() {
        return totalCostSalesAndServices;
    }

    public void setTotalCostSalesAndServices(long totalCostSalesAndServices) {
        this.totalCostSalesAndServices = totalCostSalesAndServices;
    }

}
