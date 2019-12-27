package com.man.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/hello/{param}")
    public String hello(@PathVariable("param") String param) {
        return param;
    }

    @GetMapping("/hello/world")
    public String helloworld() {
        return "provider-9002";
    }
}
