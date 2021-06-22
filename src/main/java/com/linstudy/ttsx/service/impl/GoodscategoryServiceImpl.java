package com.linstudy.ttsx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linstudy.ttsx.entity.Goodscategory;
import com.linstudy.ttsx.Mapper.GoodscategoryMapper;
import com.linstudy.ttsx.Mapper.GoodsinfoMapper;
import com.linstudy.ttsx.service.GoodscategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linstudy.ttsx.vo.GoodscategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
@Service
public class GoodscategoryServiceImpl extends ServiceImpl<GoodscategoryMapper, Goodscategory> implements GoodscategoryService {

    @Autowired
    private GoodscategoryMapper goodscategoryMapper;

    @Autowired
    private GoodsinfoMapper goodsinfoMapper;

    @Override
    public List<GoodscategoryVO> getAllGoodscategoryVO() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("type",1);

//        List
        return null;
    }
}
