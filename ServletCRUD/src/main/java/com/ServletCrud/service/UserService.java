package com.ServletCrud.service;

import com.ServletCrud.Model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<Integer, User> userDB;

    public UserService(){
        userDB = new HashMap<>();
    }

   public User createUser(User userReq){
            userDB.put(userReq.getId(), userReq);
            return userReq;
   }


}
