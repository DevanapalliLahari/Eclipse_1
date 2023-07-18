package com.Xworkz.inheritence;

public class Architect {
String name;
String gender;
int height;

Architect()
{
	System.out.println("invoking no  arguments cons in Architect");
}
Architect(String name,String gender,int height)
{
	
	System.out.println("invoking String,String,int cons in architect");
		this.name=name;
		this.gender=gender;
		this.height=height;
	
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.gender);
	System.out.println(this.height);
}
}