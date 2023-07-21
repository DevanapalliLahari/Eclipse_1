package Com.Xworkz.InheritenceChaining;

public class BoilerChicken extends Chicken {
	boolean alive;
	int weight;
	
	BoilerChicken(boolean alive,int weight,int price,String location)
	{
		super(price,location);
		this.alive=alive;
		this.weight=weight;
		System.out.println("invoking boolean,int,int,String cons of boiler chicken");
	}
   void printInfo()
   {
	   System.out.println("printing the info");
	   super.printInfo();
	   System.out.println(alive);
	   System.out.println(weight);
   }
}
