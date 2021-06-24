package com.hjp.provider;

import com.hjp.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProviderApplicationTests {

    // @Resource
    @Reference(check = false, version = "1.0.0")
    private ProviderService providerService;

    @Test
    void contextLoads() {
        providerService.f();
    }

    @Test
    void testDubbo() {
        providerService.f();
    }
}
