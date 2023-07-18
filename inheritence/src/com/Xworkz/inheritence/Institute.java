package com.Xworkz.inheritence;

public class Institute {
String name;
String location;
int cost;

Institute()
{
	System.out.println("invoking no argument cons in institute");
}
Institute(String name,String location,int cost)
{
	System.out.println("invokinng String,String,int cons in institute");
	this.name=name;
	this.location=location;
	this.cost=cost;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.location);
	System.out.println(this.cost);
}
}
