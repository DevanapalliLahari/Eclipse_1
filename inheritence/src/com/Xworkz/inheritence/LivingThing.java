package com.Xworkz.inheritence;

public class LivingThing {
String name;
int price;
String type;
LivingThing()
{
	System.out.println("invoking the no argument cons in living thing");
}
LivingThing(String name,int price,String type)
{
	System.out.println("invoking String,int,String cons in living thing");
	this.name=name;
	this.price=price;
	this.type=type;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.type);
}
}
