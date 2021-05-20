package com.training.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.racecar.GarageList;
import com.training.spring.racecar.GarageSet;
import com.training.spring.racecar.RaceCar;

public class Collections {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections_beans.xml");
		GarageList myGarage = (GarageList) context.getBean("myGarage");
		GarageSet myGarageSet = (GarageSet) context.getBean("myGarageSet");
		RaceCar teslax = (RaceCar) context.getBean("teslax");
		
		System.out.println("Showing my garage");
		for(RaceCar car: myGarage.getVehicles()) {
			System.out.println(car);
		}
		
		myGarageSet.getVehicles().add(teslax);
		myGarageSet.getVehicles().add(teslax);
		
		System.out.println("Showing my garage set");
		for(RaceCar car: myGarageSet.getVehicles()) {
			System.out.println(car);
		}
		
		RaceCar tesla1 = myGarage.getVehicles().get(0);
		RaceCar tesla2 = myGarage.getVehicles().get(1);
		
		System.out.println("Is tesla1==tesla2:"+(tesla1 == tesla2));
	}
}
