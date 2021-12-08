package com.example.mns_architecture_logicielle.vue;

import com.example.mns_architecture_logicielle.controller.MonPremierControlleur;
import com.example.mns_architecture_logicielle.model.Client;
import lombok.Getter;
import lombok.Setter;

public class MaVue {

    @Getter
    @Setter
    private MonPremierControlleur controller;

    public void actionVue() {
        controller.actionDisplayTitulaire();
    }

    public void display(Client titulaire) {
        System.out.println(titulaire.toString());
    }

}
