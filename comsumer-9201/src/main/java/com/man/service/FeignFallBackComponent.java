package com.man.service;

import feign.hystrix.FallbackFactory;

// 服务降级
public class FeignFallBackComponent implements FallbackFactory {
    public FeignService create(Throwable throwable) {
        return new FeignService() {

            public String hello(String param) {
                return "this is hello fall back factory";
            }
        };
    }
}
