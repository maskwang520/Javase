package com.activemq.queue;


import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by maskwang on 2017/7/24 0024.
 */
public class AppProducer {
    private static final String url="tcp://192.168.31.10:61616";
    private static final String queueName="queue-test";

    public static void main(String[] args) throws JMSException {
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
        Connection connection=connectionFactory.createConnection();
        connection.start();
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Destination destination=session.createQueue(queueName);
        MessageProducer messageProducer=session.createProducer(destination);
        for (int i=0;i<100;i++){  //多个线程之间平均消费完
            TextMessage textMessage=session.createTextMessage("test"+i);
            messageProducer.send(textMessage);
            System.out.println(textMessage.getText());
        }
        connection.close();
    }
}
