package com.linstudy.ttsx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author lin.twilight
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Goodscategory implements Serializable {

    //主要需要 name 和 id
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String cagName;

    private String cagCss;

    private String cagImg;


}
