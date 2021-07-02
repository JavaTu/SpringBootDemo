package com.hjp.test.service;

import com.hjp.test.dao.TestMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class TestService2 {

    @Resource
    private TestMapper testMapper;

    public void methodB () {
        // 当前已有事务，把事务A挂起，开启事务B
        Long id = testMapper.queryId();
        System.err.println("id：" + id);

        // 删除一条记录
        testMapper.del(id);

        // 查询删除的记录
        int count = testMapper.count(id);
        System.err.println(count);
    }

    public void methodB1 () {
        // 当前已有事务，把事务A挂起，开启事务B
        throw new RuntimeException("test");
    }
}
