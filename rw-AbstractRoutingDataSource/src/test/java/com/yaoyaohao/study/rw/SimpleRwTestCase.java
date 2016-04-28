package com.yaoyaohao.study.rw;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yaoyaohao.study.rw.dao.StaffDao;
import com.yaoyaohao.study.rw.entity.Staff;

public class SimpleRwTestCase extends BaseTest {
	
	@Autowired
	StaffDao staffDao;
	
	@Test
	public void testRw(){
		Staff staff = staffDao.selectByPrimaryKey("1");
		System.out.println(staff);
	}
}
