package com.example.mns_architecture_logicielle.model;

import com.example.mns_architecture_logicielle.model.accounts.Account;
import com.example.mns_architecture_logicielle.model.accounts.AccountWithoutOverdraft;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    // Lien 1 to many :
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private List<Client> clients;

    public boolean withdraw(String numCompte, String numClient, double amount) {
        Account account = getAccount(numCompte);
        if (account != null) {
            return (account.withdrawal(amount));
        }
        return false;
    }

    public Account getAccount(String numCompte) {
        for (Account account : accounts) {
            if (account.getNum().equals(numCompte)) {
                return account;
            }
        }
        return null;
    }

}