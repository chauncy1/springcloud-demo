package com.man.controller;

import com.man.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/feign/hello/{param}")
    public String hello(@PathVariable("param") String param){
        return feignService.hello(param);
    }

    @GetMapping("/hello/world")
    String helloworld() {
        return feignService.helloworld();
    }
}

