package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		DryFruit fruit = new DryFruit("badam", 2000,"Solimo",1,20.4, "brown");
		System.out.println(fruit);
		DryFruit fruit1 = new DryFruit("badam", 2000,"Solimo",1,20.4, "brown");
		System.out.println(fruit1);
		boolean same = fruit.equals(fruit1);
		System.out.println("both are same:" + same);
	}

}
