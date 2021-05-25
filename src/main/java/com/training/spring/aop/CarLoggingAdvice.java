package com.training.spring.aop;

public class CarLoggingAdvice {

	// This is the method with I would like to execute before a selected method execution
	public void beforeAdvice() {
		System.out.println("The Car is going to start");
	}
	
	// This is the method which I would like to execute after a selected method execution
	public void afterAdvice() {
		System.out.println("The Car was been started");
	}
	
	// This is the method which I would like to execute when any method returns
	public void afterReturningAdvice(Object retVal) {
		System.out.print("The car:"+retVal+" has been started");
	}
}
