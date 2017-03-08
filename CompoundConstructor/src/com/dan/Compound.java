package com.dan;

public class Compound {

	private int principal;
	private int time;
	private int rate;
	public Compound()
	{
		System.out.println("Constructor defined");
	}
	public Compound(int principal,int time,int rate)
	{
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}
	void Display()
	{
		System.out.println("principal " +principal);
		System.out.println("time " +time);
		System.out.println("rate " +rate);
		int comp=(int) (principal*Math.pow((1+rate/100),time));
		System.out.println("Compound Interest = " +comp);
	}
}
