package Com.Xworkz.Enum;

public class BatteryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("the main method is running");
    Battery battery=new Battery("duracell");
    battery.materialUsed="lithium";
    battery.durability=BatteryDurability.ONE_YEAR;
    battery.display();
    
    Battery battery1=new Battery("diehard");
    battery1.materialUsed="cobal";
    battery1.durability=BatteryDurability.THREE_YEARS;
    battery1.display();
	}

}
