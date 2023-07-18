package com.Xworkz.inheritence;

public class Monkey extends Animal {
Monkey()
{
	System.out.println("invoking no argument const in monkey");
}
Monkey(String name,int noOfAnimals,String type)
{
	super(name,noOfAnimals,type);
	System.out.println("invoking String,int,String cont in monkey");
	this.name=name;
	this.noOfAnimals=noOfAnimals;
	this.type=type;
}
}
