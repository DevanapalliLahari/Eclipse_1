package Com.Xworkz.InheritenceChaining;

public class FarmChicken extends Chicken {
	 int noOfDays;
	 boolean careTaker;
	 FarmChicken(int noOfDays,boolean careTaker,int price,String location)
	 {
        super(price,location);
        System.out.println("invoking int,boolean,int,String cons of farm  chicken");
        this.noOfDays=noOfDays;
        this.careTaker=careTaker;
	 }
	void printInfo()
	{
		System.out.println("printing the info");
		super.printInfo();
		System.out.println(noOfDays);
		System.out.println(careTaker);
	}
       
}
