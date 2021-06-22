package com.linstudy.ttsx.vo;

import java.util.List;

public class DataVO<T> {
    // json
    private Integer code;
    private String msg;
    private Long count;
    private List<T> data;
}
