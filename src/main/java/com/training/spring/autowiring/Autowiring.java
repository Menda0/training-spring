package com.training.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.racecar.RaceCar;

public class Autowiring {

	// Exercise
	// Create an Alarm that can be added to the RaceCar
	// Alarm was method that ringsAlarm
	// Use autowiring to inject the dependency on the RaceCar
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring_beans.xml");
		
		RaceCar teslax = (RaceCar) context.getBean("teslax");
		RaceCar teslay = (RaceCar) context.getBean("teslay");
		RaceCar teslas = (RaceCar) context.getBean("teslas");
		
		System.out.println(teslax);
		System.out.println("Start playing "+teslax.getRadio().playSong(0));
		System.out.println(teslay);
		System.out.println("Start playing "+teslay.getRadio().playSong(1));
		System.out.println(teslas);
		System.out.println("Start playing "+teslas.getRadio().playSong(2));
		
	}
}
