package com.yaoyaohao.study.rw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yaoyaohao.study.rw.dao.StaffDao;
import com.yaoyaohao.study.rw.entity.Staff;
import com.yaoyaohao.study.rw.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffDao staffDao;

	@Override
	public Staff selectByStaffId(String staffId) {
		return staffDao.selectByPrimaryKey(staffId);
	}

	@Override
	public int save(Staff staff) {
		return staffDao.insertSelective(staff);
	}

	@Override
	public int update(Staff staff) {
		return staffDao.updateByPrimaryKeySelective(staff);
	}

	@Override
	public int deleteByStaffId(String staffId) {
		return staffDao.deleteByPrimaryKey(staffId);
	}

}
