package Com.Xworkz.Program.Runner;

import Com.Xworkz.Program.App.Ganga;
import Com.Xworkz.Program.App.Godavari;
import Com.Xworkz.Program.App.Tributary;

public class RiversRunner {

	public static void main(String[] args) {
		System.out.println("running mmain");
		Ganga ganga = new Ganga();
		ganga.display();
		Ganga ganga1 = new Ganga("Ganga", 2546, "Hymalaya");
		ganga1.display();
		Godavari godavari = new Godavari("Godavari", 3245, 1297);
		godavari.display();
		Tributary tributary = new Tributary("Krishna", 103, 100, "Thungabhadra");
		tributary.display();
	}

}
