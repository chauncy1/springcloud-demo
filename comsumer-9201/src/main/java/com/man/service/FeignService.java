package com.man.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.ServiceMode;

@FeignClient(value = "provider-9001", fallbackFactory = FeignFallBackComponent.class)
@Component
public interface FeignService {

    @GetMapping("/hello/{param}")
    String hello(@PathVariable("param") String param);
}
