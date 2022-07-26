package com.bilgeadam_26thJuly2022.schoolManagement;

public class GradeException extends RuntimeException {
	String msg;

	public GradeException(String msg) {
		super();
		this.msg = msg;
	}

	public GradeException() {
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
