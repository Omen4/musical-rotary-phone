package com.example.mns_architecture_logicielle.model.accounts;

import java.util.Random;

public abstract class Account {

    private String num;

    public void setNum(String num) {
        this.num = num;
    }

    protected Double solde;

    public abstract boolean withdrawal(double amount);

    public Account(double solde) {
        this.solde = solde;
    }

    public String getNum() {
        return num;
    }

    public Double getSolde() {
        return solde;
    }

    public boolean credit(double amount) {
        solde += amount;
        return true;
    }
}
