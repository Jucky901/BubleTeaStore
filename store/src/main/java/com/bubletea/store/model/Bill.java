package com.bubletea.store.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Bills")
public class Bill {

    @Id
    @Column(name = "bill_id")
    private Integer billId;
    
    @Column(name = "type_of_bill")
    private String type_of_bill;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name="isPaid")
    private boolean isPaid;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getType_of_bill() {
        return type_of_bill;
    }

    public void setType_of_bill(String type_of_bill) {
        this.type_of_bill = type_of_bill;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}