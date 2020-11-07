package com.designpattern.adapter.v2;

public class InvalidSocketExeption extends RuntimeException {

	private static final long serialVersionUID = -401630073610727585L;

	public InvalidSocketExeption(String message) {
		super(message);
	}

}
