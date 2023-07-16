package Com.Xworkz.Association;

public class Director {
String name;
String filmDirected;
int noOfFilmsDirected;
int awards;

Director()
{
	System.out.println("no argument parameterised constructor");
}
Director(String name,String filmDirected,int noOfFilmsDirected,int awards)
{
	System.out.println("String,String,int,int parameterized constuctor");
	this.name=name;
	this.filmDirected=filmDirected;
	this.noOfFilmsDirected=noOfFilmsDirected;
	this.awards=awards;
}
void printInfo()
{
	System.out.println("name:"+name);
	System.out.println("filmDirected:"+filmDirected);
	System.out.println("noOfFilmsDirected:"+noOfFilmsDirected);
	System.out.println("awards:"+awards);
}
}
