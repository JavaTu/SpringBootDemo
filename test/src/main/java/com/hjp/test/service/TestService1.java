package com.hjp.test.service;

import com.hjp.test.dao.TestMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class TestService1 {

    @Resource
    private TestMapper testMapper;

    @Resource
    private TestService2 testService2;

    public void methodA () {
        // 当前没有事务，新建一个事务
        testService2.methodB();

        throw new RuntimeException("test");
    }

    public void methodA1 () {
        // 当前没有事务，新建一个事务
        Long id = testMapper.queryId();
        System.err.println("id：" + id);

        // 删除一条记录
        testMapper.del(id);

        // 查询删除的记录
        int count = testMapper.count(id);
        System.err.println(count);

        testService2.methodB1();
    }
}
