package Com.Xworkz.Program.App;

public class Godavari extends Rivers {
	int capacity;

	public Godavari() {
		System.out.println("invoking no argument parameterized cons of Godavari");
	}

	public Godavari(String name, int length, int capacity) {
		super(name, length);
		this.capacity = capacity;
		System.out.println("invoking String,int,int parameterized cons of Godavari");
	}

	public void display() {
		System.out.println("display Godavari");
		super.display();
		System.out.println("capacity:" + this.capacity);
	}
}
