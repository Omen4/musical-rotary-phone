package com.example.mns_mockito.login;

import com.example.mns_mockito.db.Database;
import com.example.mns_mockito.user.User;

public class Login {

    private Database db;

    //injection de la db
    public Login(Database db){
        this.db = db;
    }

    public User getLogin(String userId, String pwd){
        //appel db
        //pour l'exercice (omission du DAO)
        return db.getUser(userId, pwd);
    }
}
