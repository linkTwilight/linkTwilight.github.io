package com.linstudy.ttsx.vo;

import lombok.Data;

@Data
public class GoodsinfoVO {
    // vo 是为了和前端页面对接
    private Integer id;

    private String goodsName;

    private String goodsUnit;

    private Integer goodsPrice;

    private String goodsDesc;

    private String goodsImg;

    //得到名字 而 不是 数字
    private String goodsCag;
}
