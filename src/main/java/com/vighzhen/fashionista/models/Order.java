package com.vighzhen.fashionista.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Order {
    private Integer id;
    private Integer userId;
    private Integer commodityId;
    /**
     * 状态 0完成 1进行中 3取消
     */
    private Integer state;
    /**
     *  数量
      */
    private Integer quantity;
    private String createTime;
    private String updateTime;
}
