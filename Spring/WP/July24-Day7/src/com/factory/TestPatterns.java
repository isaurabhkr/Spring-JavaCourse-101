package com.factory;

import com.utils.CarType;

public class TestPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SMALL));

	}

}
