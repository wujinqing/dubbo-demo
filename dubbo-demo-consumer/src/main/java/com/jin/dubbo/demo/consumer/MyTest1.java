package com.jin.dubbo.demo.consumer;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.utils.Assert;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.jin.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 回声测试
 *
 * @author wu.jinqing
 * @date 2018年08月28日
 */
public class MyTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        EchoService echoService = (EchoService)context.getBean("demoService");

        String res = (String) echoService.$echo("OK");


        System.out.println(res);
    }
}
