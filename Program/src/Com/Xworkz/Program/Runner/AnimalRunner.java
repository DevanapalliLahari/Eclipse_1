package Com.Xworkz.Program.Runner;

import Com.Xworkz.Program.App.Animal;
import Com.Xworkz.Program.App.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running main");
		Animal animal = new Animal("dog", "domestic");
		animal.display();
		Dog dog = new Dog("dog", "domestic", "bulldog");
		dog.display();

	}

}
