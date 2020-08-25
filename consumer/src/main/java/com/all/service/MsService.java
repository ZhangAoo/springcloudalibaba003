package com.all.service;

import com.all.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j
//@RocketMQMessageListener(consumerGroup = "myConsumer",topic = "myTopic")
public class MsService implements RocketMQListener<Order> {
    @Override
    public void onMessage(Order order) {
//        log.info("有了一个新订单{}，调用短信服务", order);
    }
}
