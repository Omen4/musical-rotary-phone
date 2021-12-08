package com.example.mns_architecture_logicielle.dao;

import com.example.mns_architecture_logicielle.database.MaDbFake;
import com.example.mns_architecture_logicielle.model.Client;

public class DaoFactory {

    private MaDbFake db;

    public DaoFactory() {
        // en principe la db est injectée dans le constructeur ..
        // ici on simule la connection vers une DB Fake ..
        System.out.println("Injection de la DB ...");
        db = new MaDbFake();
    }

    public Client getDaoTitulaire() {
        return db.createFakeTitulaire();
    }
}
