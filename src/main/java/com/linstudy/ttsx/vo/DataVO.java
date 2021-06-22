package com.linstudy.ttsx.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO<T> {
    // json
    private Integer code;
    private String msg;
//    private Integer count;
    private long count;
    private List<T> data;
}
