package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("running main");
			Gold gold = new Gold("lalitha jewlary", "hyderabad", 24, 264524);
			System.out.println(gold);
			Gold gold1 = new Gold("lalitha jewlary", "hyderabad",24,264524);
			System.out.println(gold1);
			boolean same = gold.equals(gold1);
			System.out.println("both are same:" + same);
	}

}
