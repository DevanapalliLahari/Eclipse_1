package Com.Xworkz.Program.App;

public class Ganga extends Rivers {
	String location;

	public Ganga() {
		System.out.println("invoking no argument parameterised cons of ganga ");
	}

	public Ganga(String name, int length, String location) {
		super(name, length);
		this.location = location;
		System.out.println("invoking String,int,String parameterized cons of ganga");
	}

	public void display() {
		System.out.println("display Ganga");
		super.display();
		System.out.println("location:" + this.location);
	}
}
