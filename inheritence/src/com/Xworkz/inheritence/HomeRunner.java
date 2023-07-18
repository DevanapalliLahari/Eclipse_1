package com.Xworkz.inheritence;

public class HomeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Building building=new Building("Twin Towers",1000.00, "paris");
   building.display();
    
    
    Building building1=new Home("passonate",100.0,"hyderabad");
    Building building2=new Home();
    building1.display();
	}

}
