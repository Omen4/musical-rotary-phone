package com.example.mns_architecture_logicielle.database;

import com.example.mns_architecture_logicielle.model.Client;

public class MaDbFake {

    public Client createFakeTitulaire(){
        return new Client("JOYEUX");
    }
}
