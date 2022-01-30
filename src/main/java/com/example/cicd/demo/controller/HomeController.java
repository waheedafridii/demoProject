package com.example.cicd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("hello")
    public String hello(){
        return "hello World ";
    }

    @GetMapping("testing")
    public String testing(){
        return "   testing ";
    }
}
