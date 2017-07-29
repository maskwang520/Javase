package com.activemq.tipic;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by maskwang on 2017/7/24 0024.
 */
public class AppConsumer {
    private static final String url="tcp://192.168.31.10:61616";
    private static final String topicName="topic-test";

    public static void main(String[] args) throws JMSException {
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
        Connection connection=connectionFactory.createConnection();
        connection.start();
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //主题只需要更改这里
        Destination destination=session.createTopic(topicName);
        MessageConsumer messageConsumer=session.createConsumer(destination);
        //创建监听器
        messageConsumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                TextMessage textMessage=(TextMessage) message;
                try {
                    System.out.println("receive:"+textMessage.getText());
                }catch (JMSException e){
                    System.out.println(e);
                }

            }
        });
       // connection.close();   //这里是异步接收
    }
}
