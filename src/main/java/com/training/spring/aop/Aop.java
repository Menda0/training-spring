package com.training.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.racecar.RaceCar;

public class Aop {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop_beans.xml");
		
		RaceCar teslax = (RaceCar) context.getBean("teslax");
		teslax.initCar();
	}
}
