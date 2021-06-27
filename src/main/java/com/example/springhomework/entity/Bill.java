package com.example.springhomework.entity;

import com.example.springhomework.controller.dto.BillRequestDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public Bill(BigDecimal amount, Boolean isDefault) {
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Bill(BillRequestDTO billRequestDTO) {
        amount = billRequestDTO.getAmount();
        isDefault = billRequestDTO.getDefault();
    }

    public Bill() {
    }

    public Long getBillId() {
        return billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
