package com.jin.dubbo.demo.provider;

import com.jin.dubbo.demo.DemoService;

/**
 * @author wu.jinqing
 * @date 2018年08月28日
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
