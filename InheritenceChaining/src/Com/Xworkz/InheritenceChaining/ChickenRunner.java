package Com.Xworkz.InheritenceChaining;

public class ChickenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("running main");
     Chicken chicken=new Chicken(250,"street1");
     chicken.printInfo();
     FarmChicken farm=new FarmChicken(150,false,250,"main road");
     farm.printInfo();
     BoilerChicken boiler=new BoilerChicken(true,2,280,"BTM");
     boiler.printInfo();
	}

}
