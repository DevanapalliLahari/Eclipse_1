package com.Xworkz.inheritence;

public class IceCreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Food food1 =new IceCream("staberry",50,"cone");
        Food food2 =new IceCream();
        food1.display();
        Food food3=new Food();
        food1.display();
}
}