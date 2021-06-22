package com.linstudy.ttsx.service;

import com.linstudy.ttsx.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GoodsinfoServiceTest {

    @Autowired
    private GoodsinfoService service;

    @Test
    void findData() {
//        DataVO dataVO = service.findData();
        int i = 2;

        // 测试完成 开放 controller接口   用debug测试
    }
}