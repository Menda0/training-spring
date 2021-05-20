package com.training.spring.session1.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.training.spring.racecar.RaceCar;

public class BeanInheritance {
	
	// Exercise
	// Using inheritance create a ford gt with tyres pirelli rain and engine v12 diesel
	// Using inheritance create a dodge Viper with tyres pirelli rain and engine v12 diesel
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("session1/beaninheritance_beans.xml");
		
		RaceCar teslax = (RaceCar) context.getBean("teslax");
		RaceCar teslay = (RaceCar) context.getBean("teslay");
		
		RaceCar fordgt = (RaceCar) context.getBean("fordgt");
		RaceCar dodgeViper = (RaceCar) context.getBean("dodgeViper");
		
		RaceCar teslaFormula1 = (RaceCar) context.getBean("teslaFormula1");
		
		System.out.println(teslax);
		System.out.println(teslay);
		System.out.println(fordgt);
		System.out.println(dodgeViper);
		System.out.println(teslaFormula1);
	}
}
