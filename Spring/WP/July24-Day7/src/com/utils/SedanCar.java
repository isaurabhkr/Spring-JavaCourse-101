package com.utils;
import com.utils.*;
public class SedanCar extends Car {
	
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Bulding Sedan Cars");
		
	}

}
