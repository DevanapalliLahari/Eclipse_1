package com.Xworkz.inheritence;

public class Omkar extends Architect {
Omkar()
{
	System.out.println("invoking no  arguments cons in Architect");
	}
	Omkar(String name,String gender,int height)
	{
		super(name,gender,height);
		System.out.println("invoking String,String,int cons in architect");
			this.name=name;
			this.gender=gender;
			this.height=height;
}
}
