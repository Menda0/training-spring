package com.training.spring.session1.helloworld;

public class HelloWorld {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void printMessage() {
		System.out.println(this.message);
	}
}
