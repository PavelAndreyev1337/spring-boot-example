package com.example.springhomework.controller.dto;

import com.example.springhomework.entity.Bill;

import java.math.BigDecimal;

public class BillResponseDTO {

    private  Long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public BillResponseDTO(Bill bill) {
        billId = bill.getBillId();
        amount = bill.getAmount();
        isDefault = bill.getDefault();
    }

    public BillResponseDTO(Long billId, BigDecimal amount, Boolean isDefault) {
        this.billId = billId;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
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
