package com.bubletea.store.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Bill_Details")
public class BillDetail{
    @EmbeddedId
    private BillDetailId id;

    @ManyToOne
    @MapsId("billId")
    @JoinColumn(name="bill_id")
    private Bill bill;

    private Integer quantity;
    private BigDecimal unit_price;
    private BigDecimal total;

    public BillDetail(){

    }

    public BillDetail(Bill bill, Integer productId, Integer quantity, BigDecimal unit_price, BigDecimal total){
        this.bill = bill;
        this.id = new BillDetailId(bill.getBillId(), productId);
        this.quantity = quantity;
        this.unit_price = unit_price;
        this.total = total;
    }

    public BillDetailId getId() {
        return id;
    }

    public void setId(BillDetailId id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }   
}