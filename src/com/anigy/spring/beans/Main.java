package com.anigy.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName2("anigy");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
//		HelloWorld helloWorld = (HelloWorld)ctx.getBean(HelloWorld.class);
		helloWorld.hello();

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
}
