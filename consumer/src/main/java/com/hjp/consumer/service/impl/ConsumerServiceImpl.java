package com.hjp.consumer.service.impl;

import com.hjp.consumer.service.ConsumerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0")
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void m() {

    }
}
