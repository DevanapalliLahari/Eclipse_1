package com.Xworkz.inheritence;

public class City {
String name;
int capacity;
int noOfAreas;
City()
{
	System.out.println("invoking no  arguments cons in city");
}
City(String name,int capacity,int noOfAreas)
{
	System.out.println("invokking String,int,int cons in city");
	this.name=name;
	this.capacity=capacity;
	this.noOfAreas=noOfAreas;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.capacity);
	System.out.println(this.noOfAreas);
}
}
