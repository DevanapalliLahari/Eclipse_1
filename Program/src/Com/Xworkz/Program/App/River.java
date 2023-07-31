package Com.Xworkz.Program.App;

public class River extends Indian {
	String location;

	public River(String name, int area, String beaches, String location) {
		super(name, area, beaches);
		this.location = location;
		System.out.println("invoking string,int,string,string of river");
	}

	@Override
	public void display() {
		System.out.println("display");
		super.display();
		System.out.println("location" + this.location);
	}
}
