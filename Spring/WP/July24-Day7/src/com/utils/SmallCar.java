package com.utils;
import com.utils.*;
public class SmallCar extends Car {
	
	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Bulding Small Cars");
		
	}

}
