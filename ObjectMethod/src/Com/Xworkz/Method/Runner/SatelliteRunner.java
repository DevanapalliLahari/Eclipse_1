package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("running main");
     Satellite satellite=new Satellite();
     satellite.getType();
     satellite.getName();
     satellite.getLocation();
     satellite.getUses();
     satellite.getWeight();
     System.out.println(satellite.toString());
 		Satellite satellite1 = new Satellite();
 		satellite1.setType("navigation");
 		satellite1.setName("chandrayana");
 		satellite1.setLocation("Srihari Kota");
 		satellite1.setUses("whether detection");
 		satellite1.setWeight(15000);
 		System.out.println(satellite1.toString());

	}

}
