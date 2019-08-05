package com.mypack;

public class Triangle extends Shape2D {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public void draw() {
		System.out.println("Drawing the tri ........");

	}

	@Override
	public void area() {
		System.out.println("Area is........"+(dim1*dim2*0.5));

	}

}
