package com.Xworkz.inheritence;

public class Home extends Building{
	Home()
{
	System.out.println("invoking no args const in home");
}
Home(String name,double height,String location)
{
	super(name,height,location);
	System.out.println("invoking String,double,String const in home");
	this.name=name;
	this.height=height;
	this.location=location;
}
}
