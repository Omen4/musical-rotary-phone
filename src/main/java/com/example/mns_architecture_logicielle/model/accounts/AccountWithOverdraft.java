package com.example.mns_architecture_logicielle.model.accounts;

public class AccountWithOverdraft extends Account {

    private Double overdraftAllowed;

    public Double getOverdraftAllowed() {
        return overdraftAllowed;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }

    public AccountWithOverdraft(double solde) {
        super(solde);

    }

    @Override
    public boolean withdrawal(double amount) {
        if (solde + overdraftAllowed >= amount) {
            solde = solde - amount;
            return true;
        }
        return false;
    }

}
