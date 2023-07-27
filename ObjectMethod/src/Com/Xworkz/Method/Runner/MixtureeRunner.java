package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Mixture;

public class MixtureeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("running main");
		    Mixture mixture = new Mixture();
		   	System.out.println(mixture.toString());
		    mixture.getName();
		    mixture.getColor();
		    mixture.getManufactureDate();
		    mixture.getPrice();
		    mixture.getWeight();
		    Mixture mixture1 = new Mixture();

			mixture1.setName ("chow chow");
			mixture1.setColor ("orange");
			mixture1.setManufactureDate ("8th july");
			mixture1.setPrice (30);
			mixture1.setWeight (1);
			
			System.out.println(mixture1.toString());
			}

	}


