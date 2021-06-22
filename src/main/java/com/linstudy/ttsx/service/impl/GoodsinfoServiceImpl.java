package com.linstudy.ttsx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linstudy.ttsx.entity.Goodscategory;
import com.linstudy.ttsx.entity.Goodsinfo;
import com.linstudy.ttsx.Mapper.GoodsinfoMapper;
import com.linstudy.ttsx.Mapper.GoodscategoryMapper;
import com.linstudy.ttsx.service.GoodsinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linstudy.ttsx.vo.DataVO;
import com.linstudy.ttsx.vo.GoodsinfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class GoodsinfoServiceImpl extends ServiceImpl<GoodsinfoMapper, Goodsinfo> implements GoodsinfoService {

    @Autowired
    private GoodscategoryMapper goodscategoryMapper;

    @Autowired
    private GoodsinfoMapper goodsinfoMapper;

//    @Override
//    public List<GoodsinfoVO> findByGoodsCagId(String type, Integer goodsCagId) {
//        return null;
//    }

    //后台

    @Override
    public DataVO<Goodsinfo> findData() {
        DataVO dataVO = new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(goodsinfoMapper.selectCount(null));

        List<Goodsinfo> goodsinfosList = goodsinfoMapper.selectList(null);
        List<GoodsinfoVO> goodsinfoVOList = new ArrayList<>();
        for (Goodsinfo goodsinfo : goodsinfosList) {
            // 遍历列
            //替换数据
            GoodsinfoVO goodsinfoVO = new GoodsinfoVO();
            BeanUtils.copyProperties(goodsinfo,goodsinfoVO);
                //得到 id
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("id",goodsinfo.getGoodsCagId());
                //替换
//            goodsinfoVO.setGoodsCag(goodscategoryMapper.selectOne(wrapper).getCagName());
            //排除空值
            Goodscategory goodscategory = goodscategoryMapper.selectOne(wrapper);
            if (goodscategory != null) {

                goodsinfoVO.setGoodsCag(goodscategory.getCagName());
            }

            goodsinfoVOList.add(goodsinfoVO);
        }

        dataVO.setData(goodsinfoVOList);
        return dataVO;
    }
}
