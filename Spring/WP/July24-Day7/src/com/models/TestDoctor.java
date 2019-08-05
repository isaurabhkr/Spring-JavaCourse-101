package com.models;
import com.models.*;
public class TestDoctor {

	public static void main(String[] args) {
		Doctor d1 =Doctor.getInstance(100,"Ashif");
		System.out.println(d1);
		
		Doctor d2=Doctor.getInstance(100,"Kashaf");
		System.out.println(d2);

	}

}
