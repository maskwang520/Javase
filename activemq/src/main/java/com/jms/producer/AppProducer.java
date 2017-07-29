package com.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maskwang on 2017/7/24 0024.
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService prodeceService = applicationContext.getBean(ProducerService.class); //返回bean
        for (int i = 0; i < 100; i++) {
            prodeceService.sendMessage("test" + i);
            applicationContext.close();        }

    }
}
