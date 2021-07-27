package com.example.demo.error;

public class PaymentNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaymentNotFoundException(String s) {
		super(s);
	}

}
