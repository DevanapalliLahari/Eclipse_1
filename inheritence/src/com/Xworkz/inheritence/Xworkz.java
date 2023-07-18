package com.Xworkz.inheritence;

public class Xworkz extends Institute {
	
	Xworkz()
	{
		System.out.println("invoking  no argument const in Xworkz");
	}
	Xworkz(String name,String location,int cost)
	{
		super(name,location,cost);
		System.out.println("invoking String,String,int cons in Xworkz");
		this.name=name;
		this.location=location;
		this.cost=cost;
	}
}
