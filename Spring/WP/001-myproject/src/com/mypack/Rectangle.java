package com.mypack;

public class Rectangle extends Shape2D {

	public Rectangle() {
		super();
	}

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing the rect ........");


	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is........"+(dim1*dim2));


	}

}
