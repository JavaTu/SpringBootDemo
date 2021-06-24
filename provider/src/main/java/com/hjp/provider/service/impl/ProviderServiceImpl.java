package com.hjp.provider.service.impl;

import com.hjp.provider.dao.ProviderMapper;
import com.hjp.provider.entity.UserEntity;
import com.hjp.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {

    @Resource
    private ProviderMapper providerMapper;

    @Override
    public void f() {
        UserEntity user = providerMapper.queryUser("Alice");
        System.err.println(user.getCreateTime());
    }
}
