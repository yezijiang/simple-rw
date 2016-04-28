package com.yaoyaohao.study.rw.dao;

import com.yaoyaohao.study.rw.entity.Staff;

public interface StaffDao {
	Staff selectByPrimaryKey(String staffId);
	
	int insertSelective(Staff staff);
	
	int updateByPrimaryKeySelective(Staff staff);
	
	int deleteByPrimaryKey(String staffId);
}
