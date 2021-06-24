package com.hjp.provider.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

    @Resource
    private RedisTemplate redisTemplate;

    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        // 为啥我Redis配置文件都没改，却还是能收到？
        System.err.println("过期value：" + redisTemplate.opsForValue().get(message.toString()));
        System.err.println("过期key：" + message.toString());
    }
}
