package com.linstudy.ttsx.service;

import com.linstudy.ttsx.entity.Goodsinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.linstudy.ttsx.vo.DataVO;
import com.linstudy.ttsx.vo.GoodscategoryVO;
import com.linstudy.ttsx.vo.GoodsinfoVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
public interface GoodsinfoService extends IService<Goodsinfo> {
//    public List<GoodsinfoVO> findByGoodsCagId(String type, Integer goodsCagId);
    public DataVO<Goodsinfo> findData();
    //测试接口
}
