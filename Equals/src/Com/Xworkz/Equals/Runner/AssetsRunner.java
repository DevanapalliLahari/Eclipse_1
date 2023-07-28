package Com.Xworkz.Equals.Runner;

import Com.Xworkz.Equals.App.Assets;

public class AssetsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		Assets assets = new Assets("ram", "house", 58725);
		System.out.println(assets);
		Assets assets1 = new Assets("ram", "house", 58725);
		System.out.println(assets1);
		boolean same = assets.equals(assets1);
		System.out.println("both are same:" + same);
	}

}
