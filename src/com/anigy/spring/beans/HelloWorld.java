package com.anigy.spring.beans;

public class HelloWorld {
	
	private String name;
	
	public void setName2(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello: " + name);
	}
	
	public HelloWorld() {
		System.out.println("HelloWorld's Constructor ...");
	}
}
