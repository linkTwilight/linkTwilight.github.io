package com.linstudy.ttsx.mapper;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.linstudy.ttsx.Mapper.GoodsinfoMapper;


@SpringBootTest
class GoodsinfoMapperTest {

    @Autowired
    private GoodsinfoMapper mapper;
    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }

}