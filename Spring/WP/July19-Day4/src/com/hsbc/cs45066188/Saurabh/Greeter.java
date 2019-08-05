package com.hsbc.cs45066188.Saurabh;

public class Greeter {
	private String name;

	public Greeter(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello  "+this.name+" ");
	}
	
	public void sayBye() {
		System.out.println("Bye "+this.name+" ");
	}
}
