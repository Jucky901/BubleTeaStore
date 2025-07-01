package com.bubletea.store.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BillDetailId implements Serializable{
    private Integer billId;
    private Integer productId;

    public Integer getBillId() {
        return billId;
    }
    public void setBillId(Integer billId) {
        this.billId = billId;
    }
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public BillDetailId(){}
    public BillDetailId(Integer billId, Integer productId){
        this.billId = billId;
        this.productId = productId;
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof BillDetailId)) 
            return false;
        BillDetailId that = (BillDetailId) o;
        return Objects.equals(billId, that.billId) &&
                Objects.equals(productId, that.productId);

    }
    
    @Override
    public int hashCode(){
        return Objects.hash(billId, productId);
    }
}