package com.yaoyaohao.study.rw;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yaoyaohao.study.rw.entity.Staff;
import com.yaoyaohao.study.rw.service.StaffService;

public class SimpleRwTestCase extends BaseTest {
	
	@Autowired
	StaffService staffService;
	
	@Test
	public void testRw(){
		Staff staff = staffService.selectByStaffId("1");
		System.out.println(staff);
		//
		staff.setStaffId("1");
		staff.setStaffName("系统管理员");
		System.out.println(staffService.update(staff));
	}
}
