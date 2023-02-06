package com.example.apiHitCount.Controller;

import com.example.apiHitCount.Model.Api_model;
import com.example.apiHitCount.Service.Api_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/api/countByRushi")

public class Api_controller {


    @GetMapping("/userName/{userName}")
    public HashMap<String,Api_model> getCount(@PathVariable String userName){
      Api_Service api_Service = new Api_Service();
        return api_Service.addUser(userName);
    }

    @GetMapping("/find-Count/userName/{userName}")
    public HashMap<String,Api_model> fetchUser(@PathVariable String userName){
        Api_Service api_Service = new Api_Service();
        return api_Service.fetchUser(userName);
    }


}
