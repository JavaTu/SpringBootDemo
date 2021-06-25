package com.hjp.provider;

import com.hjp.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProviderApplicationTests {

    // @Resource
    @Reference(check = false, version = "1.0.0")
    private ProviderService providerService;

    @Resource
    private RocketMQTemplate template;

    @Test
    void contextLoads() {
        providerService.f();
    }

    @Test
    void testDubbo() {
        providerService.f();
    }

    @Test
    void mq() {
        template.convertAndSend("HJP_TOPIC", "HJP");
    }
}
