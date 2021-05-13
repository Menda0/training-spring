package com.training.spring.session1.beandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.racecar.RaceCar;

public class BeanDefinition {
	
	// Exercise
	// Create a v12 diesel engine
	// Make ford gt with a v12 diesel engine
	
	// Create a pojo called tyres
	// Tyres has the following properties: brand, type
	// Type - Slicks, Rain
	// Brand - Continental, Michelin, Pirelli
	// Create a slick tyre of brand Continental
	// Create a Rain tyre of brand Michelin
	// Equip rain tyre on Tesla
	// Equip slick tyre on FordGt
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("session1/beandefinition_beans.xml");
		RaceCar raceCar1 = (RaceCar) context.getBean("teslax");
		RaceCar raceCar2 = (RaceCar) context.getBean("fordGt");
		
		// RaceCar raceCar2 = context.getBean(RaceCar.class);
		// System.out.println(raceCar2);
		// System.out.print("Is raceCar1==raceCar:"+(raceCar1 == raceCar2));
		
		System.out.println(raceCar1);
		System.out.println(raceCar2);
	}
}
