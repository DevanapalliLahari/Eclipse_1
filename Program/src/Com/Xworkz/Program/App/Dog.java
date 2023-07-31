package Com.Xworkz.Program.App;

public class Dog extends Animal {
	String breed;

	public Dog(String name, String type, String breed) {
		super(name, type);
		this.breed = breed;
		System.out.println("invoking string,string,string of dog");
	}

	@Override
	public void display() {
		System.out.println("display");
		super.display();
		System.out.println("breed:" + this.breed);
	}
}
