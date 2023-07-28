package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("running main");
		Grocery grocery = new Grocery("Flour", 5);
		System.out.println(grocery);
		Grocery grocery1 = new Grocery("Flour", 5);
		System.out.println(grocery1);
		boolean same = grocery.equals(grocery1);
		System.out.println("both are same:" + same);
	}

}
