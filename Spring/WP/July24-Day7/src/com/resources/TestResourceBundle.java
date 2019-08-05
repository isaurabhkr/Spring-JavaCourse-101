package com.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("resources",Locale.US);
		System.out.println("message in "+Locale.US+" : "+bundle.getString("msg"));
	
		Locale local = new Locale("hi","IN");
		bundle = ResourceBundle.getBundle("resources",local);
		System.out.println("message in "+local+" : "+bundle.getString("msg"));
	}

}
