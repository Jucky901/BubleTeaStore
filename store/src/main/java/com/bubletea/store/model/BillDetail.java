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
    
}