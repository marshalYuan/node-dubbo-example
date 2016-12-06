package com.codedocker.nodeDubboExample.demoConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by marshal on 16/12/6.
 */

@SpringBootApplication
public class DemoConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoConsumerApplication.class, args);
        DubboService bean = run.getBean(DubboService.class);
        System.out.println(bean.userService.findByName("hello").getAge());
    }
}