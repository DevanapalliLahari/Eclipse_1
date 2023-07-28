package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.Vechicle;

public class VechicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		Vechicle vechicle = new Vechicle("car", "petrol", 2000, 4930244, 5);
		System.out.println(vechicle);
		Vechicle vechicle1 = new Vechicle("car", "petrol", 2000, 4930244, 5);
		System.out.println(vechicle1);
		boolean same = vechicle.equals(vechicle1);
		System.out.println("both are same:" + same);
	}

}
