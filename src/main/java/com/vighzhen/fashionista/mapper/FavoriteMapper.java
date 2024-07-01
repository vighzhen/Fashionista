package com.vighzhen.fashionista.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vighzhen.fashionista.models.Favorite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteMapper extends BaseMapper<Favorite> {
}
