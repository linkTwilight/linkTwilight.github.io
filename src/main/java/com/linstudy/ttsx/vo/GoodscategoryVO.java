package com.linstudy.ttsx.vo;

import com.linstudy.ttsx.entity.Goodscategory;
import lombok.Data;

import java.util.List;

@Data
public class GoodscategoryVO {
    private Integer id;
    private String cagName;
    private List<GoodscategoryVO> children;
    private String cagCss;
    private String cagImg;

    public GoodscategoryVO(Integer id, String cagName) {
        this.id = id;
        this.cagName = cagName;
    }
}
