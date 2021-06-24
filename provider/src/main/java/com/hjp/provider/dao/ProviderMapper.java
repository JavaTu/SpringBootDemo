package com.hjp.provider.dao;

import com.hjp.provider.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProviderMapper {
    int insert(UserEntity entity);

    UserEntity queryUser(String userName);
}
