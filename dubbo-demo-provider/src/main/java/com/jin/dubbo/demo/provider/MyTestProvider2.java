package com.jin.dubbo.demo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wu.jinqing
 * @date 2018年08月30日
 */
public class MyTestProvider2 {
    static Logger logger = LoggerFactory.getLogger(MyTestProvider2.class);

    public static void main(String[] args) throws IOException {
        logger.info("start...");
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("zookeeper-provider.xml");

        context.start();

        System.out.println("Zookeeper Provider start");

        System.in.read();
    }
}
