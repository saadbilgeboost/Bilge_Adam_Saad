package com.bilgeadam_26thJuly2022.Example1;

public class NegativeIntegerException extends RuntimeException {

	String msg;

	public NegativeIntegerException() {
		super();
	}

	public NegativeIntegerException(String msg) {
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
