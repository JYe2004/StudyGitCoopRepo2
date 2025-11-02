package com.zhou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String test1(){
        return "ok";
    }
}
