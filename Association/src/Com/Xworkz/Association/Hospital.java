package Com.Xworkz.Association;

public class Hospital {
String name;
String location;
int capacity;
String owner;

Owner owner1=new Owner("chitra","female",4523483972L,55);
Hospital()
{
	System.out.println("Hospital is running");
}
Hospital(String name,String location,int capacity,String owner)
{
	System.out.println("String,String,int,String parameterised constructer");
	this.name=name;
	this.location=location;
	this.capacity=capacity;
	this.owner=owner;
}
void printInfo()
{
	System.out.println("print info");
	System.out.println("name:"+name);
	System.out.println("location:"+location);
	System.out.println("capacity:"+capacity);
	System.out.println("owner:"+owner);
	this.owner1.printInfo();
}
}
