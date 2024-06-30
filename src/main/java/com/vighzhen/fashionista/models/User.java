package com.vighzhen.fashionista.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Setter
@Getter
public class User {
    private Integer id;
    private String username;
    private String password;
    /**
     * 判断是否是管理员
     */
    private Integer isMember;
    private String createTime;
    private String updateTime;
}
