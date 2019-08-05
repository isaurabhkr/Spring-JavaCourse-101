package com.models;

public class Doctor {
	private int id;
	private String name;
	private static Doctor doctor=null;
	
	private Doctor(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public static Doctor getInstance(int id, String name) {
		if(doctor==null)
		{
			doctor=new Doctor(id,name);
		}
		return doctor;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + "]";
	}
}
