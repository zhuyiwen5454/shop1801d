package com.zhuyiwen.goods.dao;

import java.util.List;

import com.zhuyiwen.goods.pojo.Spu;
import com.zhuyiwen.goods.pojo.SpuVo;

/**
 * 
 * @author zhuyiwen
 *
 */
public interface SpuDao {

	int add(Spu spu);

	int update(Spu spu);

	int delete(int[] ids);

	List<Spu> list(SpuVo spuvo);

	Spu findById(int id);

}
