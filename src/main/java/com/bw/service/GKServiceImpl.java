package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.GoodsKind;
import com.bw.mapper.GoodsKindMapper;

@Service
public class GKServiceImpl implements GKService {
	@Resource
	private GoodsKindMapper gkmapper;

	@Override
	public int deleteByPrimaryKey(Integer gkId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(GoodsKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(GoodsKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GoodsKind selectByPrimaryKey(Integer gkId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(GoodsKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List getGKList() {
		// TODO Auto-generated method stub
		return gkmapper.getGKList();
	}
}
