package com.man.controller;

import com.man.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    FeignService feignService;

    @GetMapping("/hystrix/hello/{param}")
    @HystrixCommand(fallbackMethod = "helloFallbackMethod")
    public String hello(@PathVariable("param") String param) {
        if (param.equals("exception")) {
            throw new RuntimeException();
        }
        return feignService.hello(param);
    }

    public String helloFallbackMethod(@PathVariable("param") String param) {
        return "this is hello fallback method";
    }

}
