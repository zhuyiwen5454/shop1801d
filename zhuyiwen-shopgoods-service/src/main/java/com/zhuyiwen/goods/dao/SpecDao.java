package com.zhuyiwen.goods.dao;

import java.util.List;

import com.zhuyiwen.goods.pojo.Spec;
import com.zhuyiwen.goods.pojo.SpecOption;

public interface SpecDao {

	int addSpec(Spec spec);

	int delOptions(int ...ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	int addOption(SpecOption specOption);

	List<Spec> list(Spec spec);

	Spec findById(int id);

	List<Spec> listAll();

}
