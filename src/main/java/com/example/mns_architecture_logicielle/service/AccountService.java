package com.example.mns_architecture_logicielle.service;

import com.example.mns_architecture_logicielle.dao.DaoFactory;
import com.example.mns_architecture_logicielle.model.Client;

public class AccountService {
    // Accès à la db..
    private DaoFactory factory = new DaoFactory();

    private Client titulaire;

    public Client getTitulaire() {
        return factory.getDaoTitulaire();
    }

}
