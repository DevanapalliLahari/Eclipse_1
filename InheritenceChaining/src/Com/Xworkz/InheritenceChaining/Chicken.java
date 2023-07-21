package Com.Xworkz.InheritenceChaining;

public class Chicken {
int price;
String location;
Chicken(int price,String location)
{
	System.out.println("invoking no argument cons of chicken ");
	this.price=price;
	this.location=location;
}

void printInfo()
{
	System.out.println("printing the info");
	System.out.println(price);
	System.out.println(location);
}
}
