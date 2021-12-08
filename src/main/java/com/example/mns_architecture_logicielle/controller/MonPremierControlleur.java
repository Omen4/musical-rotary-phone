package com.example.mns_architecture_logicielle.controller;

import com.example.mns_architecture_logicielle.service.AccountService;
import com.example.mns_architecture_logicielle.vue.MaVue;

public class MonPremierControlleur {

    // Pattern MVC
    private MaVue vue;
    // End Point ...
    private AccountService service;

    public MaVue getVue() {
        return vue;
    }

    public void setVue(MaVue vue) {
        this.vue = vue;
    }

    public void actionDisplayTitulaire() {
        System.out.println("Action click");
        vue.display(service.getTitulaire());
    }
}
