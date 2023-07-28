package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.Slippers;

public class SlipperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		Slippers slipper = new Slippers("nike", "casual",300.0,20,9, true, "metro factory");
		System.out.println(slipper);
		Slippers slipper1 = new Slippers("nike", "casual",300.0,20,9,true, "metro factory");
		System.out.println(slipper1);
		boolean same = slipper.equals(slipper1);
		System.out.println("both are same:" + same);
	}

}
