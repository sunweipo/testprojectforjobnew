package com.sun.testprojectforjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ais")
public class AisController {
    @RequestMapping("/login")
    public String login(){
        return "ais_login";
    }
}
