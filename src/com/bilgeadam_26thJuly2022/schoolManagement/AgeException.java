package com.bilgeadam_26thJuly2022.schoolManagement;

public class AgeException extends RuntimeException {
	String msg;

	public AgeException() {
		super();
	}

	public AgeException(String msg) {
		super();
		this.msg = msg;
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
