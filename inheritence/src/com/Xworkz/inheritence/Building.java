package com.Xworkz.inheritence;

public class Building {
	String name;
	double height;
	String location;
	
	Building()
	{
		System.out.println("invoking no argument const  in building");
	}

 Building(String name,double height,String location)
	{
		System.out.println("invoking the String,double,String const in building");
		this.name=name;
		this.height=height;
		this.location=location;
	}
 void display()
 {
		 System.out.println(this.name);
		 System.out.println(this.height);
		 System.out.println(this.location);
 }
	}


