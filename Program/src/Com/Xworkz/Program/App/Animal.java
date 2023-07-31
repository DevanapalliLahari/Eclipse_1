package Com.Xworkz.Program.App;

public class Animal {
	String name;
	String type;

	public Animal(String name, String type) {
		System.out.println("invoking string,string, parameterized  cons of animal");
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("invoking the display");
		System.out.println("name:" + this.name);
		System.out.println("type:" + this.type);
	}
}
