package com.Xworkz.inheritence;

public class Plant extends LivingThing {
Plant()
{
	System.out.println("invoking no  argument cons in plant");
}
Plant(String name,int price,String type)
{
	super(name,price,type);
	this.name=name;
	this.price=price;
	this.type=type;
}
}
