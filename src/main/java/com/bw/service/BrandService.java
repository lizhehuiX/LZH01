package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;

public interface BrandService {

	int deleteByPrimaryKey(Integer bid);

	int insert(Brand record);

	int insertSelective(Brand record);

	Brand selectByPrimaryKey(Integer bid);

	int updateByPrimaryKeySelective(Brand record);

	int updateByPrimaryKey(Brand record);

	List getBrandList();
}
