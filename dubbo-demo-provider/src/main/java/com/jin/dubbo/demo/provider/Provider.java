package com.jin.dubbo.demo.provider;

import com.alibaba.dubbo.config.spring.ServiceBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wu.jinqing
 * @date 2018年08月28日
 */
public class Provider {
    static Logger logger = LoggerFactory.getLogger(Provider.class);

    public static void main(String[] args) throws Exception {
        logger.info("start...");

        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();

        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
