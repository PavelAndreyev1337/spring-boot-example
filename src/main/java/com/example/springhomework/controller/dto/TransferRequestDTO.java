package com.example.springhomework.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TransferRequestDTO {

    @JsonProperty("account_id_from")
    public Long accountIdFrom;

    @JsonProperty("account_id_to")
    private Long accountIdTo;

    @JsonProperty("amount")
    private BigDecimal amount;

    public Long getAccountIdFrom() {
        return accountIdFrom;
    }

    public void setAccountIdFrom(Long accountIdFrom) {
        this.accountIdFrom = accountIdFrom;
    }

    public Long getAccountIdTo() {
        return accountIdTo;
    }

    public void setAccountIdTo(Long accountIdTo) {
        this.accountIdTo = accountIdTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
