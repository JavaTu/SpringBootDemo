package com.hjp.test.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    Long queryId ();

    int del (Long id);

    int count (Long id);
}
