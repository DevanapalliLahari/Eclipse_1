package Com.Xworkz.Program.App;

public class Plastic extends Material {
	String type;

	public Plastic(String name, int price, String type) {
		super(name, price);
		this.type = type;
		System.out.println("invoking String,int,String parameterizd cons of plastic");
	}

	@Override
	public void display() {
		System.out.println("display plastic");
		super.display();
		System.out.println("type:" + this.type);
	}
}
