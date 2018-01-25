package com.jhones.cursomc.services.execption;

public class ObjectNotFoundExecption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundExecption(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundExecption(String msg, Throwable cause) {
		super(msg, cause);
	}
}
