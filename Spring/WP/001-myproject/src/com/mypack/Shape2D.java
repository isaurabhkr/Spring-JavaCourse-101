package com.mypack;

public abstract class Shape2D {
	int dim1,dim2;
	public Shape2D()
	{
		
	}
	public Shape2D(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public void setColor(String color) {
		System.out.println("Shape has color: "+ color);
	
	}
	
	
	abstract public void draw();
	abstract public void area();
	
}

