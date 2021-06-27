package com.example.springhomework.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    private String name;

    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Bill> bills;

    public Account(String name, String email, List<Bill> bills) {
        this.name = name;
        this.email = email;
        this.bills = bills;
    }

    public Account() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bills=" + bills +
                '}';
    }
}
