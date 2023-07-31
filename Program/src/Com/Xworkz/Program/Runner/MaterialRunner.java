package Com.Xworkz.Program.Runner;

import Com.Xworkz.Program.App.Iron;
import Com.Xworkz.Program.App.Plastic;

public class MaterialRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plastic plastic = new Plastic("Plastic", 40, "Nylon");
		plastic.display();
		Iron iron = new Iron("Iron", 100, 2);
		iron.display();
	}

}
