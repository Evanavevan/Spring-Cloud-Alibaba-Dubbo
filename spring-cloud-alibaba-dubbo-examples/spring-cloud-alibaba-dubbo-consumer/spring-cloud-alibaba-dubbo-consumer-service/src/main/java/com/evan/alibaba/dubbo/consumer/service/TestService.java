package com.evan.alibaba.dubbo.consumer.service;

import com.evan.alibaba.dubbo.provider.service.FooService;
import com.evan.alibaba.dubbo.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestService {
    @Autowired
    private ProviderService providerService;

    @Autowired
    private FooService fooService;

    @GetMapping("/test")
    public String test() {
        return providerService.hi();
    }

    @GetMapping("/test/foo")
    public String testFoo() {
        return fooService.foo();
    }
}
