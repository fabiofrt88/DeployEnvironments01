package com.example.Deploy_Environments.Variables01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevController {

    @Autowired
    private Environment environment;


    @GetMapping("/getproperty")
    public String getProperty(){
        String var1 = environment.getProperty("myDevName.devName");
        String var2 = environment.getProperty("myAuthCode.authCode");
        return "Welcome " + var1 + " " + var2;
    }
}