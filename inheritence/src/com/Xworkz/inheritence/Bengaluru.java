package com.Xworkz.inheritence;

public class Bengaluru extends City {
Bengaluru()
{
	System.out.println("invoking no  arguments cons in bengaluru");
	}
	Bengaluru(String name,int capacity,int noOfAreas)
	{
		super(name,capacity,noOfAreas);
		System.out.println("invokking String,int,int cons in city");
		this.name=name;
		this.capacity=capacity;
		this.noOfAreas=noOfAreas;
}
}
