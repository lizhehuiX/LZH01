package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Brand;
import com.bw.mapper.BrandMapper;

@Service
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandMapper bmapper;
	@Override
	public List getBrandList() {
		// TODO Auto-generated method stub
		return bmapper.getBrandList();
	}

	@Override
	public int deleteByPrimaryKey(Integer bid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Brand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Brand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Brand selectByPrimaryKey(Integer bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Brand record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Brand record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
