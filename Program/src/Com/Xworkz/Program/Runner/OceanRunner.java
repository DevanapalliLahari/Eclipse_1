package Com.Xworkz.Program.Runner;

import Com.Xworkz.Program.App.River;

public class OceanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		River river = new River("Indian", 24534, "coromandal beach", "goa");
		{
			river.display();
		}
	}

}
