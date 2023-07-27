package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("running main");
     Helmet helmet = new Helmet();
     helmet.getName();
     helmet.getColor();
     helmet.getType();
     helmet.getPrice();
     helmet.getShape();
		System.out.println(helmet.toString());
		Helmet helmet1 = new Helmet();
		helmet1.setName ("studds");
		helmet1.setColor ("black");
		helmet1.setType ("sports");
		helmet1.setPrice (500);
		helmet1.setShape ("round oval");
		
		
		System.out.println(helmet1.toString());

	}

}
