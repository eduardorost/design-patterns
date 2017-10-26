package com.patterns.patterns.adapter.models;

public class Transfer {

    private double value;
    private String branch;
    private String account;

    public Transfer(double value, String branch, String account) {
        this.value = value;
        this.branch = branch;
        this.account = account;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "value=" + value +
                ", branch='" + branch + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
