package com.bilgeadam_26thJuly2022.schoolManagement;

public class StudentException extends RuntimeException {
	String msg;

	public StudentException(String msg) {
		super();
		this.msg = msg;
	}

	public StudentException() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsg();
	}

}
