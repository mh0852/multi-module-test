package com.mh.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String request() {
        return "hello";
    }

    @GetMapping("/login")
    public String request1() {
        return "login hh";
    }

}