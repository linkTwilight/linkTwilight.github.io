package com.linstudy.ttsx.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.linstudy.ttsx.Mapper.GoodscategoryMapper;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GoodscategoryMapperTest {
    @Autowired
    private GoodscategoryMapper mapper;

    @Test
    void test() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id",2);

        System.out.println(mapper.selectOne(wrapper));
        // 根据 entity 类定义的变量 返回 查询结果
    }

}