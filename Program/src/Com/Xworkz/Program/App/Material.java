package Com.Xworkz.Program.App;

public class Material {
	String name;
	int price;

	public Material(String name, int price) {
		System.out.println("invoking  String,int parameterized cons of material");
		this.name = name;
		this.price = price;
	}

	public void display() {
		System.out.println("display material");
		System.out.println("name:" + this.name);
		System.out.println("price:" + this.price);
	}
}
