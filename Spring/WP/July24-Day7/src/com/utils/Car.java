package com.utils;

public abstract class Car {
	private CarType model;
	public Car() {}
	public Car(CarType model) {
		this.model=model;
		assembleParts();
	}
	
	private void assembleParts()  {
		System.out.println("Assembled Parts for :: "+this.model);
	}
	protected abstract void construct();
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	
}
