package Com.Xworkz.Association;

public class Movie {
String name;
String hero="Varun tej";
String heroine;
int budget;

Director director=new Director("Rajamouli","RRR",15,10);

Movie(String name)
{
	System.out.println("The movie is running ");
	this.name=name;
	
}
void setBudget(int budget)
{
	this.budget=budget;
	
}
void printInfo()
{
	System.out.println("print information");
	System.out.println("name:"+name);
	System.out.println("hero:"+hero);
	System.out.println("heroine:"+heroine);
	System.out.println("budget:"+budget);
	this.director.printInfo();
	
}
}
