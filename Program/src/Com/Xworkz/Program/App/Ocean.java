package Com.Xworkz.Program.App;

public class Ocean {
	String name;
	int area;

	public Ocean(String name, int area) {
		System.out.println("invoking string,string parameterized cons of ocean");
		this.name = name;
		this.area = area;
	}

	public void display() {
		System.out.println("display");
		System.out.println("name:" + this.name);
		System.out.println("area:" + area);
	}
}
