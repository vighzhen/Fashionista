package com.vighzhen.fashionista.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Favorites {
    private Integer id;
    private Integer userId;
    private Integer commodityId;
    private String createTime;
    private String updateTime;

}
