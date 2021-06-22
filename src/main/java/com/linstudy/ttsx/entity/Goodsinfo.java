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
    public class Goodsinfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String goodsName;

    private String goodsUnit;

    private Integer goodsPrice;

    private String goodsDesc;

    private String goodsImg;

    private Integer goodsCagId;


}
