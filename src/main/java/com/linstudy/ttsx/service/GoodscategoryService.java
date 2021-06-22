package com.linstudy.ttsx.service;

import com.linstudy.ttsx.entity.Goodscategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.linstudy.ttsx.vo.GoodscategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
public interface GoodscategoryService extends IService<Goodscategory> {
    public List<GoodscategoryVO> getAllGoodscategoryVO();
}
