package com.example.mns_architecture_logicielle.model;

import com.example.mns_architecture_logicielle.model.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Client {

    // Attributs ..
    private String numero;
    private String nom;
    private String adresse;

    private List<Account> accounts;

    public Client(String nom) {
        super();
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Titulaire : " + nom;
    }

}
