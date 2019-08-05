package com.hsbc.shape;

public class Square extends PolyClass {
	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public double calcArea() {
		area = this.side*this.side;
		return area;
	}

	@Override
	public double calcPeri() {
		perimeter = 4*this.side;
		return perimeter;
	}

	@Override
	public void display() {
		System.out.println("Area: "+area);
		System.out.println("Perimeter "+perimeter);
	}
	
	
}
