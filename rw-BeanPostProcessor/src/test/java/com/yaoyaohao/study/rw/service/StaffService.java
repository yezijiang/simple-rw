package com.yaoyaohao.study.rw.service;

import com.yaoyaohao.study.rw.entity.Staff;

public interface StaffService {
	Staff selectByStaffId(String staffId);

	int save(Staff staff);

	int update(Staff staff);

	int deleteByStaffId(String staffId);
}
