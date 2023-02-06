package com.example.apiHitCount.Model;


public class Api_model {
    private String userName;
    private  int hitCount;


    public int getHitCount() {
        return this.hitCount;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setHitCount(int hitCount){
        this.hitCount = hitCount;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

     public Api_model(String name,int hitCount){
         this.userName = name;
         this.hitCount = hitCount;

    }


}
