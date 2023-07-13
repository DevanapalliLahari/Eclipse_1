package Com.Xworkz.Enum;

public class Battery {
String brand;
BatteryDurability durability;
String materialUsed;
int voltage=40;

Battery(String brand)
{
	System.out.println("The battery is running");
	this.brand=brand;
	System.out.println(brand);
}
void setMaterialUsed(String materialUsed)
{
	this.materialUsed=materialUsed;
	System.out.println(materialUsed);
}
void display()
{
	System.out.println(brand);
	System.out.println(durability);
	System.out.println(materialUsed);
	System.out.println(voltage);
}
}
