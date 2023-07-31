package Com.Xworkz.Program.App;

public class Rivers {
	String name;
	int length;

	public Rivers() {
		System.out.println("invoking no argument cons of rivers");
	}

	public Rivers(String name, int length) {
		this.name = name;
		this.length = length;
		System.out.println("invoking String,length parameterized cons of rivers");
	}

	public void display() {
		System.out.println("display rivers");
		System.out.println("name:" + this.name);
		System.out.println("length:" + this.length);
	}
}
