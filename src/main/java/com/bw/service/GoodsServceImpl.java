package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Goods;
import com.bw.mapper.GoodsMapper;

@Service
public class GoodsServceImpl implements GoodsService {

	@Resource
	private GoodsMapper gmapper;



	@Override
	public List getGoodsList() {
		// TODO Auto-generated method stub
		return gmapper.getGoodsList();
	}

	@Override
	public int deleteByPrimaryKey(Integer gid) {
		// TODO Auto-generated method stub
		return gmapper.deleteByPrimaryKey(gid);
	}

	@Override
	public int insert(Goods record) {
		// TODO Auto-generated method stub
		return gmapper.insert(record);
	}

	@Override
	public int insertSelective(Goods record) {
		// TODO Auto-generated method stub
		return gmapper.insertSelective(record);
	}

	@Override
	public Goods selectByPrimaryKey(Integer gid) {
		// TODO Auto-generated method stub
		return gmapper.selectByPrimaryKey(gid);
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		// TODO Auto-generated method stub
		return updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Goods record) {
		// TODO Auto-generated method stub
		return updateByPrimaryKey(record);
	}
}
