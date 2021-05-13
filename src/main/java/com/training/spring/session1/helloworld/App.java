package com.training.spring.session1.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("session1/helloworld_beans.xml");
        HelloWorld helloworld = (HelloWorld) context.getBean("helloworld");
        HelloWorld helloPedro = (HelloWorld) context.getBean("helloPedro");
        HelloWorld helloworld2 = (HelloWorld) context.getBean("helloworld");
        
        // Use spring to do this
        // helloworld.setMessage("Ola marco");
        helloworld.printMessage();
        helloPedro.printMessage();
    }
}
