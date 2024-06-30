package com.vighzhen.fashionista.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Commodity {
    private Integer id;
    private String name;
    /**
     * 判断是否是管理员商品 默认0 不是
     */
    private Integer quantity;
    /**
     * 价格
     */
    private Integer price;
    private String createTime;
    private String updateTime;
}
