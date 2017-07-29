package com.activemq.queue;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by maskwang on 2017/7/24 0024.
 */
public class AppConsumer {
    private static final String url="tcp://192.168.31.10:61616";
    private static final String queueName="queue-test";

    public static void main(String[] args) throws JMSException {
        //获取连接工厂
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
        //获取连接
        Connection connection=connectionFactory.createConnection();
        //启动连接
        connection.start();
        //获取绘画，每个connection可有多个session
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //定义目的地，主题模式就是这里不同
        Destination destination=session.createQueue(queueName);

        MessageConsumer messageConsumer=session.createConsumer(destination);
        //创建监听器
        messageConsumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) { //重写该方法
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
