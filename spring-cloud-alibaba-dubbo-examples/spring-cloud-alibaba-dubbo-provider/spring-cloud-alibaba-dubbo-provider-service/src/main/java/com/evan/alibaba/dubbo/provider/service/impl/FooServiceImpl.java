package com.evan.alibaba.dubbo.provider.service.impl;

import com.evan.alibaba.dubbo.provider.service.FooService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooServiceImpl implements FooService {
    @Override
    public String foo() {
        return "Foo Spring Cloud Alibaba Dubbo";
    }
}