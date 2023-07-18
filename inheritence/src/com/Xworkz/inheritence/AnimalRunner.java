package com.Xworkz.inheritence;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Animal animal=new Animal("dog",15,"domestic");
     animal.display();
     
     Animal animal1=new Monkey("cat",20,"domestic");
     Animal animal2=new Monkey();
     animal1.display();
     
	}

}
