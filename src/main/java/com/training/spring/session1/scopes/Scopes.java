package com.training.spring.session1.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.racecar.RaceCar;

public class Scopes {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("session1/scopes_beans.xml");
		
		RaceCar raceCar1 = (RaceCar) context.getBean("teslax");
		RaceCar raceCar2 = (RaceCar) context.getBean("teslax");
		
		System.out.println("Is raceCar1==raceCar2:"+(raceCar1==raceCar2));
	} 
}
