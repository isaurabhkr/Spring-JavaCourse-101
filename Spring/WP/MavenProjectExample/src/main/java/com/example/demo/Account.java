package com.example.demo;

public class Account {
	private int accno;
	private String fname;
	private String lname;
	private int balance;
	private Address address;
	public Account() {
		super();
	}
	public Account(String fname, String lname, int balance, Address address,int accno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
		this.address = address;
		this.accno =accno;
	}
	public String getFname() {
		return fname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
