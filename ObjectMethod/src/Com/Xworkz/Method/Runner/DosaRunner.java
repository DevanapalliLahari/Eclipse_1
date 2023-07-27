package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("running main");
       Dosa dosa = new Dosa();
      
		dosa.getName();
		dosa.getMaterial();
		dosa.getType();
		dosa.getPrice();
		dosa.getShape();
		System.out.println(dosa.toString());
		 Dosa dosa1=new Dosa();
		dosa1.setName ("masala dosa");
		dosa1.setMaterial ("Dosa pattern");
		dosa1.setType ("plain");
		dosa1.setPrice (30);
		dosa1.setShape ("round");
		System.out.println(dosa1.toString());
		
	}

}
