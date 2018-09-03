package com.jin.dubbo.demo.consumer;

import com.jin.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu.jinqing
 * @date 2018年08月30日
 */
public class MyTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("zookeeper-consumer.xml");
        context.start();

        DemoService demoService = context.getBean(DemoService.class);

        String r = demoService.sayHello("world");

        System.out.println(r);
    }
}
