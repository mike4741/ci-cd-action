package com.integration.githubcicdaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/welcome")
    public  String Welcome(){
        return  "welcome msg";
    }
}
