package com.Xworkz.inheritence;

public class PlantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LivingThing thing=new LivingThing("neem",100,"medicine");
   thing.display();
   
   LivingThing thing1=new Plant("tulasi",150,"medicine");
   LivingThing thing2=new Plant();
   thing1.display();
	}

}
