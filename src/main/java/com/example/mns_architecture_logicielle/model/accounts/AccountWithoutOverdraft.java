package com.example.mns_architecture_logicielle.model.accounts;


public class AccountWithoutOverdraft extends Account {

    public AccountWithoutOverdraft(double solde) {
        super(solde);
    }

    @Override
    public boolean withdrawal(double amount) {
        if (solde - amount >= 0) {
            solde = solde - amount;
            return true;
        }
        return false;
    }

}