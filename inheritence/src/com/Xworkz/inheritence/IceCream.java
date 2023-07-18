package com.Xworkz.inheritence;

public class IceCream extends Food {
	
	IceCream()
	{
	System.out.println("invoking no arguments const..");
}
public IceCream(String name,int cost,String type)
{
	super(name,cost,type);
	System.out.println("invoking String,int,String const...");
	this.name=name;
	this.cost=cost;
	this.type=type;
	
	
}

}
