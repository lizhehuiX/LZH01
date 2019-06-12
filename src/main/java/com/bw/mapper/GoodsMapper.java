package com.bw.mapper;

import java.util.List;

import com.bw.entity.Goods;

public interface GoodsMapper {

	List getGoodsList();

    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}