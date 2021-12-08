package com.example.mns_mockito.db;

import com.example.mns_mockito.user.User;

public class Database {

    //simulation accès db.
    public User getUser(String loginId, String pwd){
        return new User("Stéphane", "JOYEUX");
    }
}
