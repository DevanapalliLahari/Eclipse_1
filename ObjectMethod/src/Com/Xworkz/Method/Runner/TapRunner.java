package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Tap;

public class TapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("running main");
    Tap tap = new Tap();
    tap.getName();
    tap.getColor();
    tap.getUse();
    tap.getPrice();
    tap.getType();
	System.out.println(tap.toString());
	Tap tap1 = new Tap();
	tap1.setName ("bib cock");
	tap1.setColor ("silver");
	tap1.setUse ("water");
	tap1.setPrice (30);
	tap1.setType ("metal");
	
	System.out.println(tap1.toString());
	}

}
