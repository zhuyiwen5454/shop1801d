package com.zhuyiwen.goods.service;

import com.zhuyiwen.goods.pojo.Spu;
import com.zhuyiwen.goods.pojo.SpuVo;
import com.github.pagehelper.PageInfo;

/**
 * spu的管理
 * @author zhuyiwen
 *
 */
public interface SpuService {
	
	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	
	PageInfo<Spu> list(SpuVo spuvo);
	
	Spu getById(int id);
	

}
