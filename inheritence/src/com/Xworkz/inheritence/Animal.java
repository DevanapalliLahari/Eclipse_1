package com.Xworkz.inheritence;

public class Animal {
String name;
int noOfAnimals;
String type;
Animal()
{
	System.out.println("invoking the no argument const in animal");
}
Animal(String name,int noOfAnimals,String type)
{
	System.out.println("invoking String,int,String const in animal");
	this.name=name;
	this.noOfAnimals=noOfAnimals;
	this.type=type;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.noOfAnimals);
	System.out.println(this.type);
}
}
