package com.example.springhomework.controller.utils;

import com.example.springhomework.entity.Account;
import com.example.springhomework.entity.Bill;
import com.example.springhomework.exceptions.NotDefaultBillException;

public class AccountUtils {

    public static Bill findDefaultBill(Account account) {
        return account.getBills().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill from account with id: "
                        + account.getAccountId()));
    }
}
