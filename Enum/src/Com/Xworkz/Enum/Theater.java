package Com.Xworkz.Enum;

public class Theater {
String name;
String ownerName="Krishna";
int capacity;
TheaterType type;


Theater(String name)
{
	System.out.println("The theater name is invoking");
	this.name=name;
	System.out.println(name);
}
void setCapacity(int capacity )
{
	System.out.println("The capacity is invoking");
	this.capacity=capacity;
	System.out.println(capacity);
}
void display()
{
	System.out.println(name);
	System.out.println(capacity);
	System.out.println(type);
	System.out.println(ownerName);
}
}
