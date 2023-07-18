package com.Xworkz.inheritence;
	public class Food {
	String name;
	int cost;
	String type;
	Food()
	{
		System.out.println("invoking no argument cons in food");
	}
	
Food(String name,int cost,String type)
{
	System.out.println("Invoking String,int,String conts...");
     this.name=name;
     this.cost=cost;
     this.type=type;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.cost);
	System.out.println(this.type);
}
}