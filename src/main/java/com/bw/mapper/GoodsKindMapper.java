package com.bw.mapper;

import java.util.List;

import com.bw.entity.GoodsKind;

public interface GoodsKindMapper {
    int deleteByPrimaryKey(Integer gkId);

    int insert(GoodsKind record);

    int insertSelective(GoodsKind record);

    GoodsKind selectByPrimaryKey(Integer gkId);

    int updateByPrimaryKeySelective(GoodsKind record);

    int updateByPrimaryKey(GoodsKind record);

	List getGKList();
}