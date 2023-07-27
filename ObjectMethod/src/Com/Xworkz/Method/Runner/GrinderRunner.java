package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
	    Grinder grinder = new Grinder();
	    grinder.getName();
	    grinder.getCapacity();
	    grinder.getBrand();
	    grinder.getPrice();
	    grinder.getShape();
		System.out.println(grinder.toString());
	    Grinder grinder1 = new Grinder();

		grinder1.setName ("angle");
		grinder1.setCapacity (1.25);
		grinder1.setBrand ("prestige");
		grinder1.setPrice (2000);
		grinder1.setShape ("round");
		
		
		System.out.println(grinder1.toString());
		}

	}


