package com.example.apiHitCount.Service;

import com.example.apiHitCount.Model.Api_model;

import java.util.HashMap;

public class Api_Service {
    static HashMap<String, Api_model> User = new HashMap<>();
    static{
//        User.put("Rushikesh",new Api_model("Rushikesh",1));
//        User.put("Tupkar",new Api_model("Tupkar",1));

    }
    public HashMap<String,Api_model> addUser(String name){
       if(User.containsKey(name)){
            Api_model api = User.get(name);
            int c = api.getHitCount();
            api.setHitCount(c+1);
        }
        else{
            User.put(name,new Api_model(name,1));
        }
        return User;
    }

    public HashMap<String,Api_model> fetchUser(String name){
        HashMap<String, Api_model> specificUser = new HashMap<>();
        if(User.containsKey(name)){
            Api_model api = User.get(name);
            specificUser.put(api.getUserName(),api);
        }
        else{
            specificUser.put("No user found try again",new Api_model("Error",0) );
        }

        return specificUser;
    }

}
