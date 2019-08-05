package com.hsbc.shape;

public abstract class PolyClass implements Polygon {
	protected float area;
	protected float perimeter;
	
	public PolyClass() {
		this.area = 0;
		this.perimeter = 0;
	}
	public PolyClass(float area, float perimeter) {
		this.area = area;
		this.perimeter = perimeter;
	}
	public abstract double calcArea();
	public abstract double calcPeri();
	public abstract void display();
	
	
}
