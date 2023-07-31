package Com.Xworkz.Program.App;

public class Tributary extends Godavari {
	String tittle;

	public Tributary() {
		System.out.println("invoking no argument parameterized const of tributary");
	}

	public Tributary(String name, int length, int capacity, String tittle) {
		super(name, length, capacity);
		this.tittle = tittle;
	}

	public void display() {
		System.out.println("display Tributary");
		super.display();
		System.out.println("tittle:" + this.tittle);
	}
}
