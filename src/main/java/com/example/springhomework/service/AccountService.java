package com.example.springhomework.service;

import com.example.springhomework.exceptions.AccountNotFoundException;
import com.example.springhomework.repository.AccountRepository;
import com.example.springhomework.entity.Account;
import com.example.springhomework.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long save(String name, String email, List<Bill> bills) {
        Account account = new Account(name, email, bills);
        return accountRepository.save(account).getAccountId();
    }

    public Account getById(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundException("Unable to find account with id: " + accountId));
    }

    public Account update(Account account) {
        return accountRepository.save(account);
    }
}
