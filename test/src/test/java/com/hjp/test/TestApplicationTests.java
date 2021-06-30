package com.hjp.test;

import com.hjp.test.service.TestService1;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
class TestApplicationTests {

    @Resource
    private TestService1 testService;

    @Test
    void contextLoads() {

    }

    /**
     * 常用于新开事务记录订单流水日志等
     * REQUIRES_NEW: 如果当前存在事务，则把当前事务挂起，新建一个事务，处理完成后直接提交。
     * NESTED: 如果当前存在事务，则新建一个事务，运行在当前事务里，和外部事务一起提交。
     * 以上两种新建事务的前提都是要在不同的service中，两种的区别是，REQUIRES_NEW外部事务不会影响内部事务，NESTED外部事务会影响内部事务
     */
    @Test
    void testRequiresNew() {
        //testService.methodA();
        testService.methodA1();
    }
}
