package com.example.mns_architecture_logicielle;

import com.example.mns_architecture_logicielle.controller.MonPremierControlleur;
import com.example.mns_architecture_logicielle.vue.MaVue;

public class Main {

    public static void main(String[] args) {

        //Application Modele MVC
        MaVue vue = new MaVue(); //Création de la vue.
        MonPremierControlleur controller = new MonPremierControlleur();
        vue.setController(controller);
        controller.setVue(vue); // Injection de la vue.
        vue.actionVue();
    }
}
