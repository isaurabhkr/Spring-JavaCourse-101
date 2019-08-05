package com.hsbc.shape;

public class Rectangle extends PolyClass {
	protected float length;
	protected float breath;
	
	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	@Override
	public double calcArea() {
		area = this.length*this.breath;
		return area;
	}

	@Override
	public double calcPeri() {
		perimeter = 2*(this.length+this.breath);
		return perimeter;
	}

	@Override
	public void display() {
		System.out.println("Area: "+area);
		System.out.println("Perimeter "+perimeter);

	}

}
