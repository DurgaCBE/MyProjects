package com.google.bank.jd;

public class Account
{
	private String name;
	private long accno;
	private double balance;
	public Account(String name,long accno,double balance) {
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
