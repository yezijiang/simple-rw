package com.yaoyaohao.study.rw.entity;

import java.io.Serializable;

public class Staff implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3032998784101663530L;
	private String staffId;
	private String loginAccount;
	private String staffName;

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", loginAccount=" + loginAccount + ", staffName=" + staffName + "]";
	}
}
